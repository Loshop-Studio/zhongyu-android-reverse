package androidx.compose.p011ui.window;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", m5303f = "AndroidPopup.android.kt", m5304i = {0}, m5305l = {371}, m5306m = "invokeSuspend", m5307n = {"$this$LaunchedEffect"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, InterfaceC5631c<? super AndroidPopup_androidKt$Popup$5$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, interfaceC5631c);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r3.L$0
            kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
            kotlin.AbstractC5774b.m5119b(r4)
            goto L34
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            kotlin.AbstractC5774b.m5119b(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.v r4 = (kotlinx.coroutines.InterfaceC6009v) r4
            r1 = r4
        L21:
            boolean r4 = kotlinx.coroutines.AbstractC6014x.m5648s(r1)
            if (r4 == 0) goto L3a
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r4 = new p152r6.InterfaceC6471c() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1.INSTANCE androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.window.AndroidPopup_androidKt$Popup$5$1.C23461.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.window.AndroidPopup_androidKt$Popup$5$1.C23461.<init>():void");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.window.AndroidPopup_androidKt$Popup$5$1.C23461.invoke(long):void");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        d6.s r3 = p045d6.C5443s.f8405a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.window.AndroidPopup_androidKt$Popup$5$1.C23461.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r3.L$0 = r1
            r3.label = r2
            java.lang.Object r4 = androidx.compose.p011ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r3)
            if (r4 != r0) goto L34
            return r0
        L34:
            androidx.compose.ui.window.PopupLayout r4 = r3.$popupLayout
            r4.pollForLocationOnScreenChange()
            goto L21
        L3a:
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
