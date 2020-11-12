package com.wdf.witness.service.impl;

import com.wdf.witness.dao.ContentsDao;
import com.wdf.witness.entity.Contents;
import com.wdf.witness.entity.req.SelectContentsReqDto;
import com.wdf.witness.entity.req.UpdateContentsReqDto;
import com.wdf.witness.service.ContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:57
 */

@Service
public class ContentsServiceImpl implements ContentsService {

    @Autowired
    private ContentsDao contentsDao;

    @Override
    public List<Contents> findOne(SelectContentsReqDto selectContentsReqDto){
        return contentsDao.findOne(selectContentsReqDto);
    }

    @Override
    public List<Contents> findAllTitle(){
        return contentsDao.findAllTitle();
    }
    @Override
    public void updateContent(UpdateContentsReqDto updateContentsReqDto){
        contentsDao.updateContent(updateContentsReqDto);
    }

    @Override
    public void addContent(Contents contents){
        contentsDao.addContent(contents);
    }

    @Override
    public void removeContent(Integer id){
        contentsDao.removeContent(id);
    }
}
