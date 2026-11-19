package androidx.compose.p014ui.window;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", m26211f = "AndroidPopup.android.kt", m26212l = {371}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, InterfaceC11588c<? super AndroidPopup_androidKt$Popup$5$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, interfaceC11588c);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r3.L$0
            sd.i0 r1 = (sd.InterfaceC11122i0) r1
            kotlin.AbstractC9924b.m20071b(r4)
            goto L36
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            kotlin.AbstractC9924b.m20071b(r4)
            java.lang.Object r4 = r3.L$0
            sd.i0 r4 = (sd.InterfaceC11122i0) r4
            r1 = r4
        L23:
            boolean r4 = kotlinx.coroutines.AbstractC10006d.m20749f(r1)
            if (r4 == 0) goto L3c
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r4 = new p181hd.InterfaceC9540l() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1.INSTANCE androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.window.AndroidPopup_androidKt$Popup$5$1.C32081.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.window.AndroidPopup_androidKt$Popup$5$1.C32081.<init>():void");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.window.AndroidPopup_androidKt$Popup$5$1.C32081.invoke(long):void");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        qc.q r3 = p309qc.C10786q.f26013a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.window.AndroidPopup_androidKt$Popup$5$1.C32081.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r3.L$0 = r1
            r3.label = r2
            java.lang.Object r4 = androidx.compose.p014ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r3)
            if (r4 != r0) goto L36
            return r0
        L36:
            androidx.compose.ui.window.PopupLayout r4 = r3.$popupLayout
            r4.pollForLocationOnScreenChange()
            goto L23
        L3c:
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
