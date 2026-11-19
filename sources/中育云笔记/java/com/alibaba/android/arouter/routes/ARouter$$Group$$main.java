package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.friday.main.view.FolderMoveActivity;
import com.friday.main.view.FullScreenPreviewActivity;
import com.friday.main.view.HomeActivity;
import com.friday.main.view.SearchActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ARouter$$Group$$main implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/main/FolderMoveActivity", RouteMeta.build(routeType, FolderMoveActivity.class, "/main/foldermoveactivity", "main", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$main.1
            {
                put("isNewNote", 0);
                put("fileIdList", 9);
                put("parentId", 8);
                put("restoreFile", 0);
                put("fileId", 8);
                put("isNoteCopy", 0);
                put("resourceList", 9);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/main/HomeActivity", RouteMeta.build(routeType, HomeActivity.class, "/main/homeactivity", "main", null, -1, Integer.MIN_VALUE));
        map.put("/main/NotePreviewActivity", RouteMeta.build(routeType, FullScreenPreviewActivity.class, "/main/notepreviewactivity", "main", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$main.2
            {
                put("isSearchPage", 0);
                put("canEdit", 0);
                put("shareTime", 8);
                put("isVersion6", 0);
                put("fileId", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/main/SearchActivity", RouteMeta.build(routeType, SearchActivity.class, "/main/searchactivity", "main", null, -1, Integer.MIN_VALUE));
    }
}
