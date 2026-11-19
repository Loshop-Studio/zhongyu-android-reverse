package com.friday.document.viewmodel;

import com.friday.common.entity.PdfEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.PdfViewerViewModel$dispatch$1", m26211f = "PdfViewerViewModel.kt", m26212l = {24, 25, 28}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PdfViewerViewModel$dispatch$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8108c;

    /* renamed from: d */
    public int f8109d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6133a f8110e;

    /* renamed from: f */
    public final /* synthetic */ PdfViewerViewModel f8111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfViewerViewModel$dispatch$1(AbstractC6133a abstractC6133a, PdfViewerViewModel pdfViewerViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8110e = abstractC6133a;
        this.f8111f = pdfViewerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new PdfViewerViewModel$dispatch$1(this.f8110e, this.f8111f, interfaceC11588c);
    }

    // Recovered from the packaged invokeSuspend DEX. Labels 1, 2 and 3 resume
    // the PDF lookup, view-state emission and reading-position write, respectively.
    @Override
    public final Object invokeSuspend(Object result) throws Throwable {
        Object suspended = p393wc.AbstractC11725a.m25952f();
        switch (this.f8109d) {
            case 0:
                kotlin.AbstractC9924b.m20071b(result);
                if (this.f8110e instanceof AbstractC6133a.b) {
                    PdfEntity page = ((AbstractC6133a.b) this.f8110e).m6491a();
                    this.f8109d = 3;
                    return this.f8111f.f8105a.mo2803a(page, this) == suspended
                            ? suspended : C10786q.f26013a;
                }
                if (!(this.f8110e instanceof AbstractC6133a.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                String path = ((AbstractC6133a.a) this.f8110e).m6490a();
                this.f8109d = 1;
                result = this.f8111f.f8105a.mo2804b(path, this);
                if (result == suspended) return suspended;
                break;
            case 1:
                kotlin.AbstractC9924b.m20071b(result);
                break;
            case 2:
                PdfEntity.class.cast(this.f8108c);
                kotlin.AbstractC9924b.m20071b(result);
                return C10786q.f26013a;
            case 3:
                kotlin.AbstractC9924b.m20071b(result);
                return C10786q.f26013a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PdfEntity page = (PdfEntity) result;
        p430z2.C11991m viewState = new p430z2.C11991m(page);
        this.f8108c = p409xc.AbstractC11833h.m26224a(page);
        this.f8109d = 2;
        return this.f8111f.f8106b.emit(viewState, this) == suspended
                ? suspended : C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((PdfViewerViewModel$dispatch$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
