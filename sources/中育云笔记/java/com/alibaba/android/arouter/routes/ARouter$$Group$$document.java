package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.friday.document.view.TeacherOnlyActivity;
import com.friday.document.view.share.ShareSearchActivity;
import com.friday.document.view.viewer.ImagePreviewActivity;
import com.friday.document.view.viewer.MicroClassPlayActivity;
import com.friday.document.view.viewer.PdfViewerActivity;
import com.friday.document.view.viewer.TxtEditActivity;
import com.friday.document.view.viewer.VideoPlayerActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ARouter$$Group$$document implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/document/IMAGE_PREVIEW_ACTIVITY", RouteMeta.build(routeType, ImagePreviewActivity.class, "/document/image_preview_activity", "document", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$document.1
            {
                put("imageUrl", 8);
                put("isStudentShare", 0);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/document/MICRO_CLASS_ACTIVITY", RouteMeta.build(routeType, MicroClassPlayActivity.class, "/document/micro_class_activity", "document", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$document.2
            {
                put("localUrl", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/document/PdfViewerActivity", RouteMeta.build(routeType, PdfViewerActivity.class, "/document/pdfvieweractivity", "document", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$document.3
            {
                put("filePath", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/document/ShareSearchActivity", RouteMeta.build(routeType, ShareSearchActivity.class, "/document/sharesearchactivity", "document", null, -1, Integer.MIN_VALUE));
        map.put("/document/TeacherOnlyActivity", RouteMeta.build(routeType, TeacherOnlyActivity.class, "/document/teacheronlyactivity", "document", null, -1, Integer.MIN_VALUE));
        map.put("/document/TxtEditActivity", RouteMeta.build(routeType, TxtEditActivity.class, "/document/txteditactivity", "document", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$document.4
            {
                put("txtFilePath", 8);
                put("fileName", 8);
                put("fromPage", 8);
                put("canEdit", 0);
                put("shareTime", 8);
                put("noteId", 8);
                put("parentId", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/document/VideoPlayerActivity", RouteMeta.build(routeType, VideoPlayerActivity.class, "/document/videoplayeractivity", "document", new HashMap<String, Integer>() { // from class: com.alibaba.android.arouter.routes.ARouter$$Group$$document.5
            {
                put("seekOnStart", 4);
                put("title", 8);
                put("url", 8);
                put("fileId", 8);
                put("isStudentShare", 0);
            }
        }, -1, Integer.MIN_VALUE));
    }
}
