package com.friday.document.view.viewer;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.databinding.ActivityOfficeWebBinding;
import com.friday.document.view.preview.PdfPreviewFragment;
import com.friday.document.view.viewer.PdfViewerActivity;

@StabilityInferred(parameters = 0)
@Route(path = "/document/PdfViewerActivity")
/* loaded from: classes3.dex */
public final class PdfViewerActivity extends Hilt_PdfViewerActivity<ActivityOfficeWebBinding> {

    /* renamed from: g */
    public String f7754g = "";

    /* renamed from: O */
    public static final void m6175O(PdfViewerActivity pdfViewerActivity, View view) {
        pdfViewerActivity.finish();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_office_web;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        ((ActivityOfficeWebBinding) getMBinding()).f6299e.setOnClickListener(new View.OnClickListener() { // from class: y2.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfViewerActivity.m6175O(this.f28213c, view);
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R$id.fragment_container, PdfPreviewFragment.f7466j.m5962a(this.f7754g)).commit();
    }
}
