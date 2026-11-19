package com.friday.document.view.viewer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes3.dex */
public class ImagePreviewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ImagePreviewActivity imagePreviewActivity = (ImagePreviewActivity) obj;
        imagePreviewActivity.f7739g = imagePreviewActivity.getIntent().getExtras() == null ? imagePreviewActivity.f7739g : imagePreviewActivity.getIntent().getExtras().getString("imageUrl", imagePreviewActivity.f7739g);
        imagePreviewActivity.f7740h = imagePreviewActivity.getIntent().getBooleanExtra("isStudentShare", imagePreviewActivity.f7740h);
    }
}
