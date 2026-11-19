package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9073i;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16521a(p157k8.InterfaceC9071g r4, p300x7.InterfaceC10559a r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.f17668d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17668d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17667c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17668d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f17666b
            r5 = r4
            x7.a r5 = (p300x7.InterfaceC10559a) r5
            java.lang.Object r4 = r0.f17665a
            k8.g r4 = (p157k8.InterfaceC9071g) r4
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L32
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
            kotlin.AbstractC9079b.m15926b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.n$b r2 = kotlinx.coroutines.InterfaceC9212n.f18095c0
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f17665a = r4     // Catch: java.lang.Throwable -> L32
            r0.f17666b = r5     // Catch: java.lang.Throwable -> L32
            r0.f17668d = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L32
            m7.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.m16343D()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m16372x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = p190n7.AbstractC9434a.m17291f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            p201o7.AbstractC9541f.m17811c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            h7.p r4 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.m16521a(k8.g, x7.a, m7.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final InterfaceC9073i m16522b(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        C9162e c9162e = new C9162e(CoroutineContextKt.m16215d(interfaceC8822b0, interfaceC9100d), AbstractC9159b.m16529b(i10, bufferOverflow, null, 4, null));
        if (interfaceC10570l != null) {
            c9162e.mo16287k(interfaceC10570l);
        }
        c9162e.m16331J0(coroutineStart, c9162e, interfaceC10574p);
        return c9162e;
    }

    /* renamed from: c */
    public static final InterfaceC9073i m16523c(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, int i10, InterfaceC10574p interfaceC10574p) {
        return m16522b(interfaceC8822b0, interfaceC9100d, i10, BufferOverflow.f17603a, CoroutineStart.f17552a, null, interfaceC10574p);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9073i m16524d(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.f17603a;
        }
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.f17552a;
        }
        if ((i11 & 16) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return m16522b(interfaceC8822b0, interfaceC9100d, i10, bufferOverflow, coroutineStart, interfaceC10570l2, interfaceC10574p);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC9073i m16525e(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, int i10, InterfaceC10574p interfaceC10574p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m16523c(interfaceC8822b0, interfaceC9100d, i10, interfaceC10574p);
    }
}
