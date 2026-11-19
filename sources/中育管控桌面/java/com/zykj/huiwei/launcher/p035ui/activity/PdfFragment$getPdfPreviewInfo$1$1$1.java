package com.zykj.huiwei.launcher.p035ui.activity;

import com.zykj.huiwei.launcher.dao.PDFPreviewInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p156t3.InterfaceC7725b;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.activity.PdfFragment$getPdfPreviewInfo$1$1$1", m7918f = "PdfFragment.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class PdfFragment$getPdfPreviewInfo$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PDFPreviewInfo>, Object> {

    /* renamed from: a */
    public int f6391a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7725b f6392b;

    /* renamed from: c */
    public final /* synthetic */ String f6393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfFragment$getPdfPreviewInfo$1$1$1(InterfaceC7725b interfaceC7725b, String str, Continuation continuation) {
        super(2, continuation);
        this.f6392b = interfaceC7725b;
        this.f6393c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PdfFragment$getPdfPreviewInfo$1$1$1(this.f6392b, this.f6393c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PDFPreviewInfo> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6391a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.f6392b.mo5304a(this.f6393c);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PdfFragment$getPdfPreviewInfo$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
