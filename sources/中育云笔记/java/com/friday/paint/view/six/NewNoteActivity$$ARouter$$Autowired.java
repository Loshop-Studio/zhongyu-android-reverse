package com.friday.paint.view.six;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes4.dex */
public class NewNoteActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        NewNoteActivity newNoteActivity = (NewNoteActivity) obj;
        newNoteActivity.parentId = newNoteActivity.getIntent().getExtras() == null ? newNoteActivity.parentId : newNoteActivity.getIntent().getExtras().getString("parentId", newNoteActivity.parentId);
        newNoteActivity.fileName = newNoteActivity.getIntent().getExtras() == null ? newNoteActivity.fileName : newNoteActivity.getIntent().getExtras().getString("fileName", newNoteActivity.fileName);
        newNoteActivity.fileId = newNoteActivity.getIntent().getExtras() == null ? newNoteActivity.fileId : newNoteActivity.getIntent().getExtras().getString("fileId", newNoteActivity.fileId);
        newNoteActivity.fromPage = newNoteActivity.getIntent().getExtras() == null ? newNoteActivity.fromPage : newNoteActivity.getIntent().getExtras().getString("fromPage", newNoteActivity.fromPage);
    }
}
