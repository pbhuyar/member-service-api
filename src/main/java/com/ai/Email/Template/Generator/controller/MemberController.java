package com.ai.Email.Template.Generator.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.ai.Email.Template.Generator.model.MemberRequest;
import com.ai.Email.Template.Generator.model.MemberResponse;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    private static final Map<String, MemberResponse> members = new HashMap<>();

    static {

        MemberResponse m1 = new MemberResponse();
        m1.setAB_User_Id("AB1001");
        m1.setFirstName("Pratik");
        m1.setLastName("Bhuyar");
        m1.setEmail("pratik.bhuyar@yanitsolutions.com");
        m1.setAge(25);
        members.put("AB1001", m1);

        MemberResponse m2 = new MemberResponse();
        m2.setAB_User_Id("AB1002");
        m2.setFirstName("Rahul");
        m2.setLastName("Sharma");
        m2.setEmail("pratik.bhuyar@yanitsolutions.com");
        m2.setAge(30);
        members.put("AB1002", m2);

        MemberResponse m3 = new MemberResponse();
        m3.setAB_User_Id("AB1003");
        m3.setFirstName("Sneha");
        m3.setLastName("Patil");
        m3.setEmail("pratik.bhuyar@yanitsolutions.com");
        m3.setAge(27);
        members.put("AB1003", m3);

        MemberResponse m4 = new MemberResponse();
        m4.setAB_User_Id("AB1004");
        m4.setFirstName("Amit");
        m4.setLastName("Verma");
        m4.setEmail("pratik.bhuyar@yanitsolutions.com");
        m4.setAge(32);
        members.put("AB1004", m4);

        MemberResponse m5 = new MemberResponse();
        m5.setAB_User_Id("AB1005");
        m5.setFirstName("Neha");
        m5.setLastName("Joshi");
        m5.setEmail("pratik.bhuyar@yanitsolutions.com");
        m5.setAge(24);
        members.put("AB1005", m5);

        MemberResponse m6 = new MemberResponse();
        m6.setAB_User_Id("AB1006");
        m6.setFirstName("Rohit");
        m6.setLastName("Kulkarni");
        m6.setEmail("pratik.bhuyar@yanitsolutions.com");
        m6.setAge(29);
        members.put("AB1006", m6);

        MemberResponse m7 = new MemberResponse();
        m7.setAB_User_Id("AB1007");
        m7.setFirstName("Priya");
        m7.setLastName("Deshmukh");
        m7.setEmail("pratik.bhuyar@yanitsolutions.com");
        m7.setAge(31);
        members.put("AB1007", m7);

        MemberResponse m8 = new MemberResponse();
        m8.setAB_User_Id("AB1008");
        m8.setFirstName("Vikas");
        m8.setLastName("Gupta");
        m8.setEmail("pratik.bhuyar@yanitsolutions.com");
        m8.setAge(28);
        members.put("AB1008", m8);

        MemberResponse m9 = new MemberResponse();
        m9.setAB_User_Id("AB1009");
        m9.setFirstName("Pooja");
        m9.setLastName("Mehta");
        m9.setEmail("pratik.bhuyar@yanitsolutions.com");
        m9.setAge(26);
        members.put("AB1009", m9);

        MemberResponse m10 = new MemberResponse();
        m10.setAB_User_Id("AB1010");
        m10.setFirstName("Arjun");
        m10.setLastName("Singh");
        m10.setEmail("pratik.bhuyar@yanitsolutions.com");
        m10.setAge(35);
        members.put("AB1010", m10);
    }
    
    @PostMapping("/details")
    public MemberResponse getMemberDetails(@RequestBody MemberRequest request) {

        System.out.println("====================================");
        System.out.println("API HIT");
        System.out.println("Received Member ID : " + request.getAB_User_Id());
        System.out.println("====================================");

        MemberResponse response = members.get(request.getAB_User_Id());

        if (response == null) {

            System.out.println("Member NOT FOUND");

            MemberResponse notFound = new MemberResponse();
            notFound.setAB_User_Id(request.getAB_User_Id());
            notFound.setFirstName("Unknown");
            notFound.setLastName("Member");
            notFound.setEmail("pratik.bhuyar@yanitsolutions.com");
            notFound.setAge(0);

            return notFound;
        }

        System.out.println("Member FOUND");
        System.out.println("First Name : " + response.getFirstName());
        System.out.println("Last Name  : " + response.getLastName());
        System.out.println("Email      : " + response.getEmail());
        System.out.println("Age        : " + response.getAge());
        System.out.println("====================================");

        return response;
    }