package com.friday.document.view.viewer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes3.dex */
public class TxtEditActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TxtEditActivity txtEditActivity = (TxtEditActivity) obj;
        txtEditActivity.f7756h = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7756h : txtEditActivity.getIntent().getExtras().getString("noteId", txtEditActivity.f7756h);
        txtEditActivity.f7757i = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7757i : txtEditActivity.getIntent().getExtras().getString("parentId", txtEditActivity.f7757i);
        txtEditActivity.f7758j = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7758j : txtEditActivity.getIntent().getExtras().getString("fileName", txtEditActivity.f7758j);
        txtEditActivity.f7759k = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7759k : txtEditActivity.getIntent().getExtras().getString("fromPage", txtEditActivity.f7759k);
        txtEditActivity.f7760l = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7760l : txtEditActivity.getIntent().getExtras().getString("shareTime", txtEditActivity.f7760l);
        txtEditActivity.f7761m = txtEditActivity.getIntent().getBooleanExtra("canEdit", txtEditActivity.f7761m);
        txtEditActivity.f7762n = txtEditActivity.getIntent().getExtras() == null ? txtEditActivity.f7762n : txtEditActivity.getIntent().getExtras().getString("txtFilePath", txtEditActivity.f7762n);
    }
}
