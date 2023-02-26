package com.edelhome.edelhomeDB;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.edelhome.edelhomeDB.model.AppUserRequest;
import com.edelhome.edelhomeDB.mapper.AppUserToDtoMapper;
import com.edelhome.edelhomeDB.model.AppUser;
import com.edelhome.edelhomeDB.service.AppUserService;

import lombok.RequiredArgsConstructor;

@RestController()
@RequestMapping("/appusers")
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService appuserService;
    private final AppUserToDtoMapper mapper;

    @GetMapping("/id/{id}")
    public AppUser getAppUserById(@PathVariable ("id") Long id) {
        return appuserService.getAppUserById(id);
    }

    @GetMapping("/{login}")
    public AppUser getAppUserByLogin(@PathVariable String login)
    {
        return appuserService.getAppUserByLogin(login);
    }

    @GetMapping
    public List<AppUser> getAllAppUsers(@RequestParam(required = false) Boolean is_admin) {
        if (is_admin != null)
            return appuserService.findAllByIs_admin(is_admin);

        return appuserService.getAllAppUsers();
    }

    @PostMapping
    public void addAppUser(@RequestBody AppUserRequest request) {
        appuserService.addAppUser(mapper.AddAppUserRequestToAppUser(request));
    }

    @PutMapping("/{id}")
    public void editAppUser(@PathVariable Long id, @RequestBody AppUserRequest request) {
        appuserService.editAppUser(mapper.EditAppUserRequestToAppUser(id, request));
    }
}
