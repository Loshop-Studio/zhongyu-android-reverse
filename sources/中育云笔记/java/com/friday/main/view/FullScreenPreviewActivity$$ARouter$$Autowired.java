package com.friday.main.view;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes4.dex */
public class FullScreenPreviewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        FullScreenPreviewActivity fullScreenPreviewActivity = (FullScreenPreviewActivity) obj;
        fullScreenPreviewActivity.f9309j = fullScreenPreviewActivity.getIntent().getExtras() == null ? fullScreenPreviewActivity.f9309j : fullScreenPreviewActivity.getIntent().getExtras().getString("fileId", fullScreenPreviewActivity.f9309j);
        fullScreenPreviewActivity.f9310k = fullScreenPreviewActivity.getIntent().getBooleanExtra("isSearchPage", fullScreenPreviewActivity.f9310k);
        fullScreenPreviewActivity.f9311l = fullScreenPreviewActivity.getIntent().getBooleanExtra("canEdit", fullScreenPreviewActivity.f9311l);
        fullScreenPreviewActivity.f9312m = fullScreenPreviewActivity.getIntent().getBooleanExtra("isVersion6", fullScreenPreviewActivity.f9312m);
        fullScreenPreviewActivity.f9313n = fullScreenPreviewActivity.getIntent().getExtras() == null ? fullScreenPreviewActivity.f9313n : fullScreenPreviewActivity.getIntent().getExtras().getString("shareTime", fullScreenPreviewActivity.f9313n);
    }
}
