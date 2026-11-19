package com.friday.document.view.viewer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* loaded from: classes3.dex */
public class PdfViewerActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PdfViewerActivity pdfViewerActivity = (PdfViewerActivity) obj;
        pdfViewerActivity.f7754g = pdfViewerActivity.getIntent().getExtras() == null ? pdfViewerActivity.f7754g : pdfViewerActivity.getIntent().getExtras().getString("filePath", pdfViewerActivity.f7754g);
    }
}
