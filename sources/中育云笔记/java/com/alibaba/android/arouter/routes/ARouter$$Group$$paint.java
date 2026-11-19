package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.friday.paint.view.NoteActivity;
import com.friday.paint.view.six.NewNoteActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ARouter$$Group$$paint implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/paint/NewNoteActivity", RouteMeta.build(routeType, NewNoteActivity.class, "/paint/newnoteactivity", "paint", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$paint.1
            {
                put("fileName", 8);
                put("fromPage", 8);
                put("parentId", 8);
                put("fileId", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/paint/NoteActivity", RouteMeta.build(routeType, NoteActivity.class, "/paint/noteactivity", "paint", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$paint.2
            {
                put("fileName", 8);
                put("fromPage", 8);
                put("parentId", 8);
                put("fileId", 8);
            }
        }, -1, Integer.MIN_VALUE));
    }
}
