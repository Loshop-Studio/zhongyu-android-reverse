package com.zykj.huiwei.launcher.p035ui.activity;

import com.zykj.huiwei.launcher.dao.PDFPreviewInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p156t3.InterfaceC7725b;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.activity.PdfFragment$getPdfPreviewInfo$1", m7918f = "PdfFragment.kt", m7919i = {0, 0}, m7920l = {155}, m7921m = "invokeSuspend", m7922n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-PdfFragment$getPdfPreviewInfo$1$1"}, m7923s = {"L$0", "I$0"})
/* loaded from: classes4.dex */
public final class PdfFragment$getPdfPreviewInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6385a;

    /* renamed from: b */
    public int f6386b;

    /* renamed from: c */
    public int f6387c;

    /* renamed from: d */
    public final /* synthetic */ PdfFragment f6388d;

    /* renamed from: e */
    public final /* synthetic */ String f6389e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f6390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfFragment$getPdfPreviewInfo$1(PdfFragment pdfFragment, String str, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f6388d = pdfFragment;
        this.f6389e = str;
        this.f6390f = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PdfFragment$getPdfPreviewInfo$1(this.f6388d, this.f6389e, this.f6390f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM17183constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6387c;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC7725b interfaceC7725b = this.f6388d.previewDao;
                String str = this.f6389e;
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                PdfFragment$getPdfPreviewInfo$1$1$1 pdfFragment$getPdfPreviewInfo$1$1$1 = new PdfFragment$getPdfPreviewInfo$1$1$1(interfaceC7725b, str, null);
                this.f6385a = SpillingKt.nullOutSpilledVariable(interfaceC7725b);
                this.f6386b = 0;
                this.f6387c = 1;
                obj = BuildersKt.withContext(io2, pdfFragment$getPdfPreviewInfo$1$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM17183constructorimpl = Result.m17183constructorimpl((PDFPreviewInfo) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
        }
        Function2 function2 = this.f6390f;
        if (Result.m17190isSuccessimpl(objM17183constructorimpl)) {
            PDFPreviewInfo pDFPreviewInfo = (PDFPreviewInfo) objM17183constructorimpl;
            function2.invoke(Boxing.boxInt(pDFPreviewInfo != null ? pDFPreviewInfo.getPageIndex() : 0), Boxing.boxFloat(pDFPreviewInfo != null ? pDFPreviewInfo.getPageOffset() : 0.0f));
        }
        Function2 function22 = this.f6390f;
        if (Result.m17186exceptionOrNullimpl(objM17183constructorimpl) != null) {
            function22.invoke(Boxing.boxInt(0), Boxing.boxFloat(0.0f));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PdfFragment$getPdfPreviewInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
