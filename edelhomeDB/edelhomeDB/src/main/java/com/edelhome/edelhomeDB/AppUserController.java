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

    @GetMapping("/userid/{userid}")
    public AppUser getAppUserById(@PathVariable ("userid") Long userid) {
        return appuserService.getAppUserByUserid(userid);
    }

    @GetMapping("/{login}")
    public AppUser getAppUserByLogin(@PathVariable String login)
    {
        return appuserService.getAppUserByLogin(login);
    }

    @GetMapping
    public List<AppUser> getAllAppUsers(@RequestParam(required = false) Boolean isadmin) {
        if (isadmin != null)
            return appuserService.findAllByIsadmin(isadmin);

        return appuserService.getAllAppUsers();
    }

    @PostMapping 
    public void addAppUser(@RequestBody AppUserRequest request) {
        appuserService.addAppUser(mapper.AddAppUserRequestToAppUser(request));
    }

    @PutMapping("/{userid}")
    public void editAppUser(@PathVariable Long userid, @RequestBody AppUserRequest request) {
        appuserService.editAppUser(mapper.EditAppUserRequestToAppUser(userid, request));
    }
}
