package com.wdf.witness.dao;


import com.wdf.witness.entity.Contents;
import com.wdf.witness.entity.req.SelectContentsReqDto;
import com.wdf.witness.entity.req.UpdateContentsReqDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:29
 */
@Mapper
public interface ContentsDao {



    /**
     * 查询指定文章
     * @param selectContentsReqDto
     * @return
     */
    List<Contents> findOne(SelectContentsReqDto selectContentsReqDto);

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
