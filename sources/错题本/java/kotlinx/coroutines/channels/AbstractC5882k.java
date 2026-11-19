package kotlinx.coroutines.channels;

/* renamed from: kotlinx.coroutines.channels.k */
/* loaded from: classes4.dex */
public abstract class AbstractC5882k {
    /* renamed from: a */
    public static C5873b m5511a(int i, int i8, BufferOverflow bufferOverflow) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new C5881j(1, bufferOverflow);
            }
            InterfaceC5876e.f9326a0.getClass();
            return new C5873b(C5875d.f9325b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new C5873b(i) : new C5881j(i, bufferOverflow) : new C5873b(Integer.MAX_VALUE) : bufferOverflow == BufferOverflow.SUSPEND ? new C5873b(0) : new C5881j(1, bufferOverflow);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new C5881j(1, BufferOverflow.DROP_OLDEST);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5512b(kotlinx.coroutines.channels.InterfaceC5884m r4, p152r6.InterfaceC6469a r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            r6.a r5 = (p152r6.InterfaceC6469a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.m r4 = (kotlinx.coroutines.channels.InterfaceC5884m) r4
            kotlin.AbstractC5774b.m5119b(r6)     // Catch: java.lang.Throwable -> L30
            goto L6d
        L30:
            r4 = move-exception
            goto L73
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.AbstractC5774b.m5119b(r6)
            h6.h r6 = r0.getContext()
            kotlinx.coroutines.v0 r2 = kotlinx.coroutines.C6010v0.f9513a
            h6.f r6 = r6.get(r2)
            if (r6 != r4) goto L77
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L30
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L30
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.g r6 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> L30
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L30
            r6.m5584u()     // Catch: java.lang.Throwable -> L30
            retrofit2.t r0 = new retrofit2.t     // Catch: java.lang.Throwable -> L30
            r2 = 3
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C5883l) r4     // Catch: java.lang.Throwable -> L30
            r4.m5513c0(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.m5583t()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L6d
            return r1
        L6d:
            r5.invoke()
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        L73:
            r5.invoke()
            throw r4
        L77:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC5882k.m5512b(kotlinx.coroutines.channels.m, r6.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
