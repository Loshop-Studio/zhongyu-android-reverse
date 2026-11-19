package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.data.PdfDao;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9275l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class PDFViewModel extends BaseViewModel {

    /* renamed from: a */
    public final PdfDao f14337a;

    /* renamed from: b */
    public final InterfaceC9270g f14338b;

    /* renamed from: c */
    public final InterfaceC9275l f14339c;

    public PDFViewModel(PdfDao pdfDao) {
        AbstractC9133u.m16133g(pdfDao, "pdfDao");
        this.f14337a = pdfDao;
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f14338b = interfaceC9270gM17044b;
        this.f14339c = interfaceC9270gM17044b;
    }

    /* renamed from: c */
    public final void m12241c(AbstractC8153a pdfAction) {
        AbstractC9133u.m16133g(pdfAction, "pdfAction");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new PDFViewModel$dispatch$1(pdfAction, this, null), 3, null);
    }

    /* renamed from: d */
    public final InterfaceC9275l m12242d() {
        return this.f14339c;
    }
}
