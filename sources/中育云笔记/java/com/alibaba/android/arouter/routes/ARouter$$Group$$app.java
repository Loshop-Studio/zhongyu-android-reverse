package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.friday.cloudsnote.view.MainActivity;
import java.util.Map;

/* loaded from: classes3.dex */
public class ARouter$$Group$$app implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/app/MainActivity", RouteMeta.build(RouteType.ACTIVITY, MainActivity.class, "/app/mainactivity", "app", null, -1, Integer.MIN_VALUE));
    }
}
