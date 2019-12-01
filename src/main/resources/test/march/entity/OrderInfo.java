/* https://github.com/orange1438 */
package march.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author orange1438
 * date:2019/12/01 21:23
 */
public class OrderInfo implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -2269840762699889010L;

    /** 
     * 订单ID
     */ 
    private Integer orderId;

    /** 
     * 用户ID
     */ 
    private Integer uid;

    /** 
     * 商品数量
     */ 
    private Integer nums;

    /** 
     * 订单状态
     */ 
    private Integer state;

    /** 
     * 创建时间
     */ 
    private Date createTime;

    /** 
     * 更新时间
     */ 
    private Date updateTime;

    /** 
     * 获取 订单ID order_info.order_id
     * @return 订单ID
     */
    public final Integer getOrderId() {
        return orderId;
    }

    /** 
     * 设置 订单ID order_info.order_id
     * @param orderId 订单ID
     */
    public final void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /** 
     * 获取 用户ID order_info.uid
     * @return 用户ID
     */
    public final Integer getUid() {
        return uid;
    }

    /** 
     * 设置 用户ID order_info.uid
     * @param uid 用户ID
     */
    public final void setUid(Integer uid) {
        this.uid = uid;
    }

    /** 
     * 获取 商品数量 order_info.nums
     * @return 商品数量
     */
    public final Integer getNums() {
        return nums;
    }

    /** 
     * 设置 商品数量 order_info.nums
     * @param nums 商品数量
     */
    public final void setNums(Integer nums) {
        this.nums = nums;
    }

    /** 
     * 获取 订单状态 order_info.state
     * @return 订单状态
     */
    public final Integer getState() {
        return state;
    }

    /** 
     * 设置 订单状态 order_info.state
     * @param state 订单状态
     */
    public final void setState(Integer state) {
        this.state = state;
    }

    /** 
     * 获取 创建时间 order_info.create_time
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 order_info.create_time
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 更新时间 order_info.update_time
     * @return 更新时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 更新时间 order_info.update_time
     * @param updateTime 更新时间
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", orderId=").append(orderId);
        sb.append(", uid=").append(uid);
        sb.append(", nums=").append(nums);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}