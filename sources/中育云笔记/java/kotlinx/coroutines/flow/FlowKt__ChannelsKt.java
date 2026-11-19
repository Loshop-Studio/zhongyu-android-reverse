package kotlinx.coroutines.flow;

import p309qc.C10786q;
import p365ud.InterfaceC11397l;
import p379vd.C11592a;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ChannelsKt {
    /* renamed from: b */
    public static final InterfaceC11594c m20765b(InterfaceC11397l interfaceC11397l) {
        return new C11592a(interfaceC11397l, true, null, 0, null, 28, null);
    }

    /* renamed from: c */
    public static final Object m20766c(InterfaceC11595d interfaceC11595d, InterfaceC11397l interfaceC11397l, InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM20767d = m20767d(interfaceC11595d, interfaceC11397l, true, interfaceC11588c);
        return objM20767d == AbstractC11725a.m25952f() ? objM20767d : C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20767d(p379vd.InterfaceC11595d r6, p365ud.InterfaceC11397l r7, boolean r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.f23623h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23623h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23622g
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23623h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f23621f
            java.lang.Object r6 = r0.f23620e
            ud.e r6 = (p365ud.InterfaceC11390e) r6
            java.lang.Object r7 = r0.f23619d
            ud.l r7 = (p365ud.InterfaceC11397l) r7
            java.lang.Object r2 = r0.f23618c
            vd.d r2 = (p379vd.InterfaceC11595d) r2
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f23621f
            java.lang.Object r6 = r0.f23620e
            ud.e r6 = (p365ud.InterfaceC11390e) r6
            java.lang.Object r7 = r0.f23619d
            ud.l r7 = (p365ud.InterfaceC11397l) r7
            java.lang.Object r2 = r0.f23618c
            vd.d r2 = (p379vd.InterfaceC11595d) r2
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.AbstractC9924b.m20071b(r9)
            p379vd.AbstractC11596e.m25571u(r6)
            ud.e r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f23618c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f23619d = r7     // Catch: java.lang.Throwable -> L3c
            r0.f23620e = r9     // Catch: java.lang.Throwable -> L3c
            r0.f23621f = r8     // Catch: java.lang.Throwable -> L3c
            r0.f23623h = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.mo20669a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f23618c = r2     // Catch: java.lang.Throwable -> L3c
            r0.f23619d = r7     // Catch: java.lang.Throwable -> L3c
            r0.f23620e = r6     // Catch: java.lang.Throwable -> L3c
            r0.f23621f = r8     // Catch: java.lang.Throwable -> L3c
            r0.f23623h = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            p365ud.AbstractC11393h.m25355a(r7, r6)
        L9a:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            p365ud.AbstractC11393h.m25355a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m20767d(vd.d, ud.l, boolean, vc.c):java.lang.Object");
    }
}
