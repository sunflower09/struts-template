package jp.sunflower09.common.service;

import jp.sunflower09.common.dao.MessageMapper;
import jp.sunflower09.common.entity.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {

    @Autowired
    MessageMapper messageMapper;

    @Override
    public String sayHello() {
        Message message = messageMapper.selectByPrimaryKey(1);
        return message.getMessage();
    }

}
