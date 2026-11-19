package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5225a1;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p430z2.C11991m;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PdfViewerViewModel extends ViewModel {

    /* renamed from: a */
    public final InterfaceC5225a1 f8105a;

    /* renamed from: b */
    public final InterfaceC11603l f8106b;

    /* renamed from: c */
    public final InterfaceC11612u f8107c;

    public PdfViewerViewModel(InterfaceC5225a1 pdfDao) {
        AbstractC9979u.m20294g(pdfDao, "pdfDao");
        this.f8105a = pdfDao;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new C11991m(null, 1, null));
        this.f8106b = interfaceC11603lM25602a;
        this.f8107c = interfaceC11603lM25602a;
    }

    /* renamed from: c */
    public final void m6326c(AbstractC6133a pdfAction) {
        AbstractC9979u.m20294g(pdfAction, "pdfAction");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new PdfViewerViewModel$dispatch$1(pdfAction, this, null), 3, null);
    }

    /* renamed from: d */
    public final InterfaceC11612u m6327d() {
        return this.f8107c;
    }
}
