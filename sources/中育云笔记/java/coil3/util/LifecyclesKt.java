package coil3.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* loaded from: classes3.dex */
public abstract class LifecyclesKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3289a(androidx.lifecycle.Lifecycle r6, vc.InterfaceC11588c r7) {
        /*
            boolean r0 = r7 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.f3932g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3932g = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3931f
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3932g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f3929d
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f3928c
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8f
        L31:
            r7 = move-exception
            goto L9b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4d
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L4d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f3928c = r6     // Catch: java.lang.Throwable -> L84
            r0.f3929d = r7     // Catch: java.lang.Throwable -> L84
            r2 = 0
            r0.f3930e = r2     // Catch: java.lang.Throwable -> L84
            r0.f3932g = r3     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L84
            vc.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L84
            r2.m20503F()     // Catch: java.lang.Throwable -> L84
            coil3.util.LifecyclesKt$awaitStarted$2$1 r3 = new coil3.util.LifecyclesKt$awaitStarted$2$1     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            r7.f23402c = r3     // Catch: java.lang.Throwable -> L84
            kotlin.jvm.internal.AbstractC9979u.m20291d(r3)     // Catch: java.lang.Throwable -> L84
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3     // Catch: java.lang.Throwable -> L84
            r6.addObserver(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.m20538x()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> L84
            if (r2 != r3) goto L8a
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: java.lang.Throwable -> L84
            goto L8a
        L84:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L9b
        L8a:
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r0 = r6
            r6 = r7
        L8f:
            java.lang.Object r6 = r6.f23402c
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L98
            r0.removeObserver(r6)
        L98:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L9b:
            java.lang.Object r6 = r6.f23402c
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto La4
            r0.removeObserver(r6)
        La4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.LifecyclesKt.m3289a(androidx.lifecycle.Lifecycle, vc.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final void m3290b(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
