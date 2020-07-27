package com.macro.mall.portal.domain;

import com.macro.mall.model.PmsProductCategory;



import java.util.List;

/**
 * 商品分类，包含子分类
 * Created by macro on 2020/4/6.
 */
public class PmsProductCategoryNode extends PmsProductCategory {
    private List<PmsProductCategoryNode> children;

    public List<PmsProductCategoryNode> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategoryNode> children) {
        this.children = children;
    }
}
