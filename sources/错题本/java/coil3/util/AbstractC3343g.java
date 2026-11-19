package coil3.util;

/* renamed from: coil3.util.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3343g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.lifecycle.LifecycleObserver, coil3.util.LifecyclesKt$awaitStarted$2$1] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2287a(android.view.Lifecycle r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.Lifecycle r0 = (android.view.Lifecycle) r0
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L31
            goto L75
        L31:
            r7 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.AbstractC5774b.m5119b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4b
            goto L7e
        L4b:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7f
            r0.label = r4     // Catch: java.lang.Throwable -> L7f
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> L7f
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7f
            r2.m5584u()     // Catch: java.lang.Throwable -> L7f
            coil3.util.LifecyclesKt$awaitStarted$2$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$2$1     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            r7.element = r0     // Catch: java.lang.Throwable -> L7f
            r6.addObserver(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r2.m5583t()     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r6
            r6 = r7
        L75:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (android.view.LifecycleObserver) r6
            if (r6 == 0) goto L7e
            r0.removeObserver(r6)
        L7e:
            return r3
        L7f:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L84:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (android.view.LifecycleObserver) r6
            if (r6 == 0) goto L8d
            r0.removeObserver(r6)
        L8d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.AbstractC3343g.m2287a(androidx.lifecycle.Lifecycle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
