package com.friday.paint.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes4.dex */
public class NoteActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        NoteActivity noteActivity = (NoteActivity) obj;
        noteActivity.f9906i = noteActivity.getIntent().getExtras() == null ? noteActivity.f9906i : noteActivity.getIntent().getExtras().getString("parentId", noteActivity.f9906i);
        noteActivity.f9907j = noteActivity.getIntent().getExtras() == null ? noteActivity.f9907j : noteActivity.getIntent().getExtras().getString("fileName", noteActivity.f9907j);
        noteActivity.f9908k = noteActivity.getIntent().getExtras() == null ? noteActivity.f9908k : noteActivity.getIntent().getExtras().getString("fileId", noteActivity.f9908k);
        noteActivity.f9909l = noteActivity.getIntent().getExtras() == null ? noteActivity.f9909l : noteActivity.getIntent().getExtras().getString("fromPage", noteActivity.f9909l);
    }
}
