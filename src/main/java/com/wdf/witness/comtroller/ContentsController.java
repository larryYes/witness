package com.wdf.witness.comtroller;

import com.wdf.witness.entity.Contents;
import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.SelectContentsReqDto;
import com.wdf.witness.entity.req.SelectUsersReqDto;
import com.wdf.witness.service.ContentsService;
import com.wdf.witness.utils.EmptyUtil;
import com.wdf.witness.utils.Result;
import com.wdf.witness.utils.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 18:11
 */

@Api(tags = "文章接口")
@RestController
@RequestMapping("/Contents")
public class ContentsController {

    @Autowired
    private ContentsService contentsService;

    @ApiOperation(value = "条件查找用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET",response = Result.class)
    @GetMapping("/findContent")
    public Result findOne(@RequestBody SelectContentsReqDto selectContentsReqDto){
        List<Contents> contents = contentsService.findOne(selectContentsReqDto);
        return new Result(true, StatusCode.OK,StatusCode.select,contents);
    }
    @GetMapping("/findAllTitle")
    public Result findAllTitle(){
        List<Contents> contentsTitle = contentsService.findAllTitle();
        return new Result(true,StatusCode.OK,StatusCode.select,contentsTitle);
    }

    @ApiOperation(value = "新增文章", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "POST",response = Result.class)
    @PostMapping("/addContent")
    public Result addContent(@RequestBody Contents contents){

        //判断是否为空

        contentsService.addContent(contents);
        return new Result(true,StatusCode.OK,StatusCode.Add);
    }

}
