package com.qtu404.neptune.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qtu404.neptune.api.facade.ShopFacade;
import com.qtu404.neptune.api.request.shop.ShopDetailRequest;
import com.qtu404.neptune.api.response.shop.ShopDetailResponse;
import com.qtu404.neptune.util.model.Response;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DingXing wb-dx470808@alibaba-inc.com
 * @date 2019/3/1 下午1:26
 */
@Api(value = "店铺web接口", tags = "店铺web接口")
@RestController
@RequestMapping("api/web/shop/")
public class ShopWebController {
    @Reference
    private ShopFacade shopFacade;

    @GetMapping("get/detail")
    public Response<ShopDetailResponse> getDetail(ShopDetailRequest request) {
        return this.shopFacade.getShopDetail(request);
    }
}
