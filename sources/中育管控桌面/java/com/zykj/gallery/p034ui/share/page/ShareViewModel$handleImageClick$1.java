package com.zykj.gallery.p034ui.share.page;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.ui.share.page.ShareViewModel$handleImageClick$1", m7918f = "ShareViewModel.kt", m7919i = {1, 1}, m7920l = {57, 64}, m7921m = "invokeSuspend", m7922n = {"file", "fileUri"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class ShareViewModel$handleImageClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f5930a;

    /* renamed from: b */
    public Object f5931b;

    /* renamed from: c */
    public int f5932c;

    /* renamed from: d */
    public final /* synthetic */ Context f5933d;

    /* renamed from: e */
    public final /* synthetic */ String f5934e;

    /* renamed from: f */
    public final /* synthetic */ ShareViewModel f5935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareViewModel$handleImageClick$1(Context context, String str, ShareViewModel shareViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5933d = context;
        this.f5934e = str;
        this.f5935f = shareViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShareViewModel$handleImageClick$1(this.f5933d, this.f5934e, this.f5935f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r3.send(r4, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f5932c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r5.f5931b
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r5.f5930a
            java.io.File r0 = (java.io.File) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L7a
        L1a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L38
        L26:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.gallery.utils.Coil3ImageCacheUtil r6 = com.zykj.gallery.utils.Coil3ImageCacheUtil.f5942a
            android.content.Context r1 = r5.f5933d
            java.lang.String r4 = r5.f5934e
            r5.f5932c = r3
            java.lang.Object r6 = r6.m5203b(r1, r4, r5)
            if (r6 != r0) goto L38
            goto L79
        L38:
            java.io.File r6 = (java.io.File) r6
            if (r6 == 0) goto L7a
            android.content.Context r1 = r5.f5933d
            java.lang.String r3 = r1.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".fileprovider"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r1, r3, r6)
            com.zykj.gallery.ui.share.page.ShareViewModel r3 = r5.f5935f
            kotlinx.coroutines.channels.Channel r3 = com.zykj.gallery.p034ui.share.page.ShareViewModel.m5145b(r3)
            com.zykj.gallery.ui.share.page.b$b r4 = new com.zykj.gallery.ui.share.page.b$b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r4.<init>(r1)
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.f5930a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r5.f5931b = r6
            r5.f5932c = r2
            java.lang.Object r6 = r3.send(r4, r5)
            if (r6 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.p034ui.share.page.ShareViewModel$handleImageClick$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1.smali:157
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ShareViewModel$handleImageClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
