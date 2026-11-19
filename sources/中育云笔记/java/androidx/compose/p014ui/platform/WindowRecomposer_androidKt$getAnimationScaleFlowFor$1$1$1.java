package androidx.compose.p014ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m26211f = "WindowRecomposer.android.kt", m26212l = {114, PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ InterfaceC10000a $channel;
    final /* synthetic */ C3016x23580bd9 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C3016x23580bd9 c3016x23580bd9, InterfaceC10000a interfaceC10000a, Context context, InterfaceC11588c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = c3016x23580bd9;
        this.$channel = interfaceC10000a;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, interfaceC11588c);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r4.emit(r9, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r8.L$1
            ud.e r1 = (p365ud.InterfaceC11390e) r1
            java.lang.Object r4 = r8.L$0
            vd.d r4 = (p379vd.InterfaceC11595d) r4
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L1b
        L19:
            r9 = r4
            goto L48
        L1b:
            r9 = move-exception
            goto L8c
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            java.lang.Object r1 = r8.L$1
            ud.e r1 = (p365ud.InterfaceC11390e) r1
            java.lang.Object r4 = r8.L$0
            vd.d r4 = (p379vd.InterfaceC11595d) r4
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L1b
            goto L58
        L31:
            kotlin.AbstractC9924b.m20071b(r9)
            java.lang.Object r9 = r8.L$0
            vd.d r9 = (p379vd.InterfaceC11595d) r9
            android.content.ContentResolver r1 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r8.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.a r1 = r8.$channel     // Catch: java.lang.Throwable -> L1b
            ud.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L48:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L1b
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L1b
            r8.label = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r4 = r1.mo20669a(r8)     // Catch: java.lang.Throwable -> L1b
            if (r4 != r0) goto L55
            goto L81
        L55:
            r7 = r4
            r4 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r9 == 0) goto L82
            r1.next()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L1b
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r9 = p409xc.AbstractC11826a.m26207b(r9)     // Catch: java.lang.Throwable -> L1b
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L1b
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L1b
            r8.label = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
            if (r9 != r0) goto L19
        L81:
            return r0
        L82:
            android.content.ContentResolver r9 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r8.$contentObserver
            r9.unregisterContentObserver(r0)
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        L8c:
            android.content.ContentResolver r0 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r8.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
