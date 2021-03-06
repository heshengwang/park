package com.kfwy.park.bi.analysis.business;

import com.gniuu.framework.common.business.IManager;
import com.kfwy.park.bi.analysis.entity.MaturityEntity;

import java.util.List;
import java.util.Map;

/**
 * @author wangchuang
 * @Description TODO
 * @Date $date$ $time$
 * @Version 1.0
 * @Param $param$
 * @return $return$
 **/
public interface IMaturityManager extends IManager<MaturityEntity> {

    /**
     * @Description 查询某年每个月的合同到期数
     * @author wangchuang
     * @Date 2019/5/21 9:43
     * @Version 1.0
     * @Param [selectYear]
     * @return java.util.List<com.kfwy.park.bi.analysis.entity.MaturityEntity>
     **/
    List<MaturityEntity> selectMaturityInfo(String selectYear);

    /**
     *@author gtaotao
     *@Date 2019-08-01 16:18:11
     *@Description 查询某短时间内,某园区每个月的合同到期数
     *@param
     *@return
     **/
    List<MaturityEntity> selectMaturityContractByTimeAndPark(Map<String, Object> map);
}
