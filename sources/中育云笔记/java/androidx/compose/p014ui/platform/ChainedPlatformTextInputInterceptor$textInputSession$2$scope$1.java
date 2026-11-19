package androidx.compose.p014ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC9945d;

/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {
    private final /* synthetic */ PlatformTextInputSessionScope $$delegate_0;
    final /* synthetic */ AtomicReference $inputMethodMutex;
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.$parentSession = platformTextInputSessionScope;
        this.$inputMethodMutex = atomicReference;
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$$delegate_0 = platformTextInputSessionScope;
    }

    @Override // androidx.compose.p014ui.platform.PlatformTextInputSessionScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.compose.p014ui.platform.PlatformTextInputSession
    public View getView() {
        return this.$$delegate_0.getView();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(androidx.compose.p014ui.platform.PlatformTextInputMethodRequest r9, vc.InterfaceC11588c<?> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.p014ui.platform.C2985x61f42b4d
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.p014ui.platform.C2985x61f42b4d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            kotlin.AbstractC9924b.m20071b(r10)
            goto L4b
        L31:
            kotlin.AbstractC9924b.m20071b(r10)
            java.util.concurrent.atomic.AtomicReference r10 = r8.$inputMethodMutex
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r2 = new p181hd.InterfaceC9540l() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                static {
                    /*
                        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2) androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.INSTANCE androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.C2986x61f42b4e.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.C2986x61f42b4e.<init>():void");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        sd.i0 r1 = (sd.InterfaceC11122i0) r1
                        r0.invoke(r1)
                        qc.q r1 = p309qc.C10786q.f26013a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.C2986x61f42b4e.invoke(java.lang.Object):java.lang.Object");
                }

                public final void invoke(sd.InterfaceC11122i0 r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.C2986x61f42b4e.invoke(sd.i0):void");
                }
            }
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r4 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r8.this$0
            androidx.compose.ui.platform.PlatformTextInputSessionScope r6 = r8.$parentSession
            r7 = 0
            r4.<init>(r5, r9, r6, r7)
            r0.label = r3
            java.lang.Object r9 = androidx.compose.p014ui.SessionMutex.m30456withSessionCancellingPreviousimpl(r10, r2, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, vc.c):java.lang.Object");
    }
}
