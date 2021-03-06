package com.qtu404.neptune.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qtu404.neptune.api.facade.ItemFacade;
import com.qtu404.neptune.api.request.item.ItemAdjustRequest;
import com.qtu404.neptune.api.request.item.ItemUpdateRequest;
import com.qtu404.neptune.api.request.item.ItemCreateRequest;
import com.qtu404.neptune.util.model.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author DingXing wb-dx470808@alibaba-inc.com
 * @date 2019/2/28 下午5:33
 */
@Api(value = "商品管理接口", tags = "商品管理接口")
@RestController
@RequestMapping("api/admin/item/")
public class ItemAdminController {
    @Reference
    private ItemFacade itemFacade;

    @ApiOperation("创建商品")
    @PutMapping("create")
    public Response<Long> createItem(@RequestBody ItemCreateRequest request){
        return this.itemFacade.createItem(request);
    }

    @ApiOperation("商品设置")
    @PostMapping("update")
    public Response<Boolean> update(@RequestBody ItemUpdateRequest request){
        return this.itemFacade.update(request);
    }

    @ApiOperation("库存设置")
    @PostMapping("adjust")
    public Response<Boolean> adjust(@RequestBody ItemAdjustRequest request){
        return this.itemFacade.adjust(request);
    }
}
