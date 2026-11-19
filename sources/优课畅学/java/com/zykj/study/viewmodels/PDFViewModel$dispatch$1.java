package com.zykj.study.viewmodels;

import com.zykj.study.data.PdfEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.PDFViewModel$dispatch$1", m17801f = "PDFViewModel.kt", m17802l = {26, 27, 30}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class PDFViewModel$dispatch$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14340a;

    /* renamed from: b */
    public int f14341b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC8153a f14342c;

    /* renamed from: d */
    public final /* synthetic */ PDFViewModel f14343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFViewModel$dispatch$1(AbstractC8153a abstractC8153a, PDFViewModel pDFViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14342c = abstractC8153a;
        this.f14343d = pDFViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new PDFViewModel$dispatch$1(this.f14342c, this.f14343d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((PDFViewModel$dispatch$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    // Recovered from the packaged invokeSuspend DEX. Labels 1, 2 and 3 resume
    // the PDF lookup, view-state emission and reading-position write, respectively.
    @Override
    public final Object invokeSuspend(Object result) throws Throwable {
        Object suspended = p190n7.AbstractC9434a.m17291f();
        switch (this.f14341b) {
            case 0:
                kotlin.AbstractC9079b.m15926b(result);
                if (this.f14342c instanceof AbstractC8153a.b) {
                    PdfEntity page = ((AbstractC8153a.b) this.f14342c).m12322a();
                    this.f14341b = 3;
                    return this.f14343d.f14337a.insertPdf(page, this) == suspended
                            ? suspended : C8736p.f16368a;
                }
                if (!(this.f14342c instanceof AbstractC8153a.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                String path = ((AbstractC8153a.a) this.f14342c).m12321a();
                this.f14341b = 1;
                result = this.f14343d.f14337a.queryPdf(path, this);
                if (result == suspended) return suspended;
                break;
            case 1:
                kotlin.AbstractC9079b.m15926b(result);
                break;
            case 2:
                PdfEntity.class.cast(this.f14340a);
                kotlin.AbstractC9079b.m15926b(result);
                return C8736p.f16368a;
            case 3:
                kotlin.AbstractC9079b.m15926b(result);
                return C8736p.f16368a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PdfEntity page = (PdfEntity) result;
        p110g5.C8581k2 viewState = new p110g5.C8581k2(page);
        this.f14340a = p201o7.AbstractC9543h.m17814a(page);
        this.f14341b = 2;
        return this.f14343d.f14338b.emit(viewState, this) == suspended
                ? suspended : C8736p.f16368a;
    }
}
