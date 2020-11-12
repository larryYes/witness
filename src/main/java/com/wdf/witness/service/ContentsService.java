package com.wdf.witness.service;

import com.wdf.witness.entity.Contents;
import com.wdf.witness.entity.req.SelectContentsReqDto;
import com.wdf.witness.entity.req.UpdateContentsReqDto;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:28
 */
public interface ContentsService {



    /**
     * 查询指定文章
     * @param selectContentsReqDto
     * @return
     */
    List<Contents> findOne(SelectContentsReqDto selectContentsReqDto);

    /**
     * 查询所有文章标题
     * @return
     */
    List<Contents> findAllTitle();

    /**
     * 新增文章
     * @param content
     */
    void addContent(Contents content);

    /**
     * 更新文章
     * @param updateContentsReqDto
     */
    void updateContent(UpdateContentsReqDto updateContentsReqDto);

    /**
     * 删除文章
     * @param id
     */
    void removeContent(Integer id);
}
