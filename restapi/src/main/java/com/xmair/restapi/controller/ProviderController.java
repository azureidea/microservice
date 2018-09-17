package com.xmair.restapi.controller;

import com.xmair.core.entity.framedb.Provider;
import com.xmair.core.exception.ExceptionEnum;
import com.xmair.core.mapper.framedb.ProviderMapper;
import com.xmair.core.util.JsonUtil;
import com.xmair.core.util.ResultBean;
import com.xmair.restapi.apiversion.ApiVersion;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author wuzuquan
 * @date 2018-09-17 15:20:18
 */
@RestController
@RequestMapping(value = "/provider")
@ApiVersion(1)
public class ProviderController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private ProviderMapper mapper;


    @ApiOperation(value = "获取单条记录", notes = "根据url的id来获取详细信息")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResultBean<Provider> get(String id) {
        Provider item = mapper.selectByPrimaryKey(id);
        if (item != null) {
            return new ResultBean<Provider>(item);
        } else {
            return new ResultBean<Provider>(ExceptionEnum.RESOURCE_NOT_FOUND, null, "找不到该记录", null);
        }
    }


    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public ResultBean<List<Provider>> getList() {
        List<Provider> list = mapper.selectAll();
        ResultBean<List<Provider>> resultBean = new ResultBean<List<Provider>>(list);
        return resultBean;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResultBean<String> create(@RequestBody @Validated Provider item) {
        int result = mapper.insertSelective(item);
        logger.info("create Provider success,record,{}" + JsonUtil.bean2Json(item));
        ResultBean<String> resultBean = new ResultBean<String>("");
        return resultBean;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultBean<String> update(@RequestBody @Validated Provider item) {
        int result = mapper.updateByPrimaryKeySelective(item);
        logger.info("update Provider success,record,{}" + JsonUtil.bean2Json(item));
        ResultBean<String> resultBean = new ResultBean<String>("");
        return resultBean;
    }

    @RequestMapping(value = "/deleteByID", method = RequestMethod.POST)
    public ResultBean<Integer> delete(String id) {
        int result = mapper.deleteByPrimaryKey(id);
        logger.info("delete Provider success,record id,{}" + id);
        ResultBean<Integer> resultBean = new ResultBean<Integer>(result);
        return resultBean;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResultBean<Integer> delete(@RequestBody @Validated Provider item) {
        int result = mapper.delete(item);
        ResultBean<Integer> resultBean = new ResultBean<Integer>(result);
        return resultBean;
    }

}

