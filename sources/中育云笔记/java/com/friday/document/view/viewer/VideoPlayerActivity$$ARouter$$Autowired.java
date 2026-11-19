package com.friday.document.view.viewer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes3.dex */
public class VideoPlayerActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        VideoPlayerActivity videoPlayerActivity = (VideoPlayerActivity) obj;
        videoPlayerActivity.f7790h = videoPlayerActivity.getIntent().getExtras() == null ? videoPlayerActivity.f7790h : videoPlayerActivity.getIntent().getExtras().getString("url", videoPlayerActivity.f7790h);
        videoPlayerActivity.f7791i = videoPlayerActivity.getIntent().getExtras() == null ? videoPlayerActivity.f7791i : videoPlayerActivity.getIntent().getExtras().getString("title", videoPlayerActivity.f7791i);
        videoPlayerActivity.f7792j = videoPlayerActivity.getIntent().getExtras() == null ? videoPlayerActivity.f7792j : videoPlayerActivity.getIntent().getExtras().getString("fileId", videoPlayerActivity.f7792j);
        videoPlayerActivity.f7793k = videoPlayerActivity.getIntent().getLongExtra("seekOnStart", videoPlayerActivity.f7793k);
        videoPlayerActivity.f7794l = videoPlayerActivity.getIntent().getBooleanExtra("isStudentShare", videoPlayerActivity.f7794l);
    }
}
