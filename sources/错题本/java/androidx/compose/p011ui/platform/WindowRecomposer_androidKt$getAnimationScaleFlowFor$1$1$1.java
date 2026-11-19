package androidx.compose.p011ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5876e;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/flow/g;", "", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/g;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m5303f = "WindowRecomposer.android.kt", m5304i = {0, 1}, m5305l = {114, 121}, m5306m = "invokeSuspend", m5307n = {"$this$flow", "$this$flow"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ InterfaceC5876e $channel;
    final /* synthetic */ C2264x23580bd9 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C2264x23580bd9 c2264x23580bd9, InterfaceC5876e interfaceC5876e, Context context, InterfaceC5631c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = c2264x23580bd9;
        this.$channel = interfaceC5876e;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, interfaceC5631c);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r4.emit(r5, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:18:0x0047, B:22:0x0057, B:24:0x005f, B:14:0x002c, B:17:0x0041), top: B:31:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.a r1 = (kotlinx.coroutines.channels.C5872a) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.InterfaceC5912g) r4
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.lang.Throwable -> L19
        L17:
            r9 = r4
            goto L47
        L19:
            r9 = move-exception
            goto L8c
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.a r1 = (kotlinx.coroutines.channels.C5872a) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.InterfaceC5912g) r4
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.lang.Throwable -> L19
            goto L57
        L30:
            kotlin.AbstractC5774b.m5119b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.g r9 = (kotlinx.coroutines.flow.InterfaceC5912g) r9
            android.content.ContentResolver r1 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r8.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.e r1 = r8.$channel     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.channels.a r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
        L47:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r3     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r1.m5466b(r8)     // Catch: java.lang.Throwable -> L19
            if (r4 != r0) goto L54
            goto L81
        L54:
            r7 = r4
            r4 = r9
            r9 = r7
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L82
            r1.m5467c()     // Catch: java.lang.Throwable -> L19
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L17
        L81:
            return r0
        L82:
            android.content.ContentResolver r9 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r8.$contentObserver
            r9.unregisterContentObserver(r0)
            d6.s r9 = p045d6.C5443s.f8405a
            return r9
        L8c:
            android.content.ContentResolver r0 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r8.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC5912g interfaceC5912g, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(interfaceC5912g, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
