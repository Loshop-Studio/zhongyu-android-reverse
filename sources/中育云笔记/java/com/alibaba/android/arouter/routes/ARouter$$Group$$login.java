package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.friday.login.view.LoginActivity;
import java.util.Map;

/* loaded from: classes3.dex */
public class ARouter$$Group$$login implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/login/LoginActivity", RouteMeta.build(RouteType.ACTIVITY, LoginActivity.class, "/login/loginactivity", "login", null, -1, Integer.MIN_VALUE));
    }
}
