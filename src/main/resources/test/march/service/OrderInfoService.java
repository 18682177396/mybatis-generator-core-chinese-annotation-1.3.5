package march.service;

import java.util.List;
import march.entity.Criteria;
import march.entity.OrderInfo;

public interface OrderInfoService {
    int countByExample(Criteria example);

    OrderInfo selectByPrimaryKey(Integer orderId);

    List<OrderInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(OrderInfo record, Criteria example);

    int updateByExample(OrderInfo record, Criteria example);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);
}