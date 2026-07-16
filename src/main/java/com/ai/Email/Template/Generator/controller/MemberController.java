package com.ai.Email.Template.Generator.controller;

import org.springframework.web.bind.annotation.*;

import com.ai.Email.Template.Generator.model.MemberRequest;
import com.ai.Email.Template.Generator.model.MemberResponse;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @PostMapping("/details")
    public MemberResponse getMemberDetails(@RequestBody MemberRequest request) {

        MemberResponse response = new MemberResponse();

        response.setAB_User_Id(request.getAB_User_Id());
        response.setFirstName("Pratik");
        response.setLastName("Bhuyar");
        response.setAge(25);

        return response;
    }
}