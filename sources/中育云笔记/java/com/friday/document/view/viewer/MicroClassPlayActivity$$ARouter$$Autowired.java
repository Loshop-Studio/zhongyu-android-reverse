package com.friday.document.view.viewer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes3.dex */
public class MicroClassPlayActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        MicroClassPlayActivity microClassPlayActivity = (MicroClassPlayActivity) obj;
        microClassPlayActivity.f7751g = microClassPlayActivity.getIntent().getExtras() == null ? microClassPlayActivity.f7751g : microClassPlayActivity.getIntent().getExtras().getString("localUrl", microClassPlayActivity.f7751g);
    }
}
