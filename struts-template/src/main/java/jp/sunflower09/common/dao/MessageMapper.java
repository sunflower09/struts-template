package jp.sunflower09.common.dao;

import jp.sunflower09.common.entity.Message;

public interface MessageMapper {

    Message selectByPrimaryKey(int id);

}
