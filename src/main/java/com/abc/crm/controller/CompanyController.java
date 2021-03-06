package com.abc.crm.controller;

import com.abc.crm.controller.dto.req.CompanyReqDto;
import com.abc.crm.controller.dto.res.ResOneDto;
import com.abc.crm.service.CompanyService;
import com.abc.crm.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {

    private final UserService userService;
    private final CompanyService companyService;

    @GetMapping("/view/{id}")
    public ResOneDto getOne(@PathVariable Long id) {
        return companyService.getOne(id)
                .map(ResOneDto::success)
                .orElse(ResOneDto.fail());
    }

    @PostMapping("/add")
    public ResOneDto addOne(@RequestBody CompanyReqDto companyReqDto) {
        var username = userService.getCurrentUsername();
        return companyService.addOne(companyReqDto, username)
                .map(ResOneDto::success)
                .orElse(ResOneDto.fail());
    }

    @PatchMapping("/update")
    public ResOneDto updateOne(@RequestBody CompanyReqDto companyReqDto) {
        var username = userService.getCurrentUsername();
        return companyService.updateOne(companyReqDto, username)
                .map(ResOneDto::success)
                .orElse(ResOneDto.fail());
    }

    @DeleteMapping("/delete/{id}")
    public ResOneDto deleteOne(@PathVariable Long id) {
        var success = companyService.deleteOne(id);
        if (success) {
            return ResOneDto.success();
        } else {
            return ResOneDto.fail();
        }
    }
}
