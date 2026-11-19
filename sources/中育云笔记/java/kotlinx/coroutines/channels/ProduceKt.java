package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11397l;
import sd.AbstractC11098c0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;

/* loaded from: classes6.dex */
public abstract class ProduceKt {

    /* renamed from: kotlinx.coroutines.channels.ProduceKt$a */
    public static final class C9999a implements InterfaceC9540l {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11125j f23575c;

        public C9999a(InterfaceC11125j interfaceC11125j) {
            this.f23575c = interfaceC11125j;
        }

        /* renamed from: a */
        public final void m20718a(Throwable th) {
            InterfaceC11125j interfaceC11125j = this.f23575c;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(C10786q.f26013a));
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20718a((Throwable) obj);
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20713a(p365ud.InterfaceC11395j r4, p181hd.InterfaceC9529a r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.f23579f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23579f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23578e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23579f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f23577d
            r5 = r4
            hd.a r5 = (p181hd.InterfaceC9529a) r5
            java.lang.Object r4 = r0.f23576c
            ud.j r4 = (p365ud.InterfaceC11395j) r4
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.AbstractC9924b.m20071b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.g$b r2 = kotlinx.coroutines.InterfaceC10045g.f23976b0
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f23576c = r4     // Catch: java.lang.Throwable -> L32
            r0.f23577d = r5     // Catch: java.lang.Throwable -> L32
            r0.f23579f = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L32
            vc.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.m20503F()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.ProduceKt$a r2 = new kotlinx.coroutines.channels.ProduceKt$a     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m20538x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.m20713a(ud.j, hd.a, vc.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final InterfaceC11397l m20714b(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, int i10, InterfaceC9544p interfaceC9544p) {
        return m20715c(interfaceC11122i0, interfaceC9945d, i10, BufferOverflow.f23519c, CoroutineStart.f23476c, null, interfaceC9544p);
    }

    /* renamed from: c */
    public static final InterfaceC11397l m20715c(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        C10004e c10004e = new C10004e(AbstractC11098c0.m24689k(interfaceC11122i0, interfaceC9945d), AbstractC10001b.m20722b(i10, bufferOverflow, null, 4, null));
        if (interfaceC9540l != null) {
            c10004e.mo20404A(interfaceC9540l);
        }
        c10004e.m20493I0(coroutineStart, c10004e, interfaceC9544p);
        return c10004e;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC11397l m20716d(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, int i10, InterfaceC9544p interfaceC9544p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m20714b(interfaceC11122i0, interfaceC9945d, i10, interfaceC9544p);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC11397l m20717e(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.f23519c;
        }
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.f23476c;
        }
        if ((i11 & 16) != 0) {
            interfaceC9540l = null;
        }
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        return m20715c(interfaceC11122i0, interfaceC9945d, i10, bufferOverflow, coroutineStart, interfaceC9540l2, interfaceC9544p);
    }
}
