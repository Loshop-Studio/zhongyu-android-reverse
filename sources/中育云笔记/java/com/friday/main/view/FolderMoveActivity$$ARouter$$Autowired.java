package com.friday.main.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class FolderMoveActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        FolderMoveActivity folderMoveActivity = (FolderMoveActivity) obj;
        folderMoveActivity.f9267g = folderMoveActivity.getIntent().getExtras() == null ? folderMoveActivity.f9267g : folderMoveActivity.getIntent().getExtras().getString("fileId", folderMoveActivity.f9267g);
        folderMoveActivity.f9268h = (ArrayList) folderMoveActivity.getIntent().getSerializableExtra("fileIdList");
        folderMoveActivity.f9269i = folderMoveActivity.getIntent().getExtras() == null ? folderMoveActivity.f9269i : folderMoveActivity.getIntent().getExtras().getString("parentId", folderMoveActivity.f9269i);
        folderMoveActivity.f9270j = folderMoveActivity.getIntent().getBooleanExtra("isNoteCopy", folderMoveActivity.f9270j);
        folderMoveActivity.f9271k = folderMoveActivity.getIntent().getBooleanExtra("isNewNote", folderMoveActivity.f9271k);
        folderMoveActivity.f9272l = folderMoveActivity.getIntent().getBooleanExtra("restoreFile", folderMoveActivity.f9272l);
        folderMoveActivity.f9273m = (ArrayList) folderMoveActivity.getIntent().getSerializableExtra("resourceList");
    }
}
