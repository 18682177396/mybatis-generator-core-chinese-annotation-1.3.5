package march.service.impl;

import java.util.List;
import march.entity.Criteria;
import march.entity.OrderInfo;
import march.mappers.OrderInfoDAO;
import march.service.OrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoDAO orderInfoDAO;

    private static final Logger logger = LoggerFactory.getLogger(OrderInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.orderInfoDAO.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OrderInfo selectByPrimaryKey(Integer orderId) {
        return this.orderInfoDAO.selectByPrimaryKey(orderId);
    }

    public List<OrderInfo> selectByExample(Criteria example) {
        return this.orderInfoDAO.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer orderId) {
        return this.orderInfoDAO.deleteByPrimaryKey(orderId);
    }

    public int updateByPrimaryKeySelective(OrderInfo record) {
        return this.orderInfoDAO.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderInfo record) {
        return this.orderInfoDAO.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.orderInfoDAO.deleteByExample(example);
    }

    public int updateByExampleSelective(OrderInfo record, Criteria example) {
        return this.orderInfoDAO.updateByExampleSelective(record, example);
    }

    public int updateByExample(OrderInfo record, Criteria example) {
        return this.orderInfoDAO.updateByExample(record, example);
    }

    public int insert(OrderInfo record) {
        return this.orderInfoDAO.insert(record);
    }

    public int insertSelective(OrderInfo record) {
        return this.orderInfoDAO.insertSelective(record);
    }
}