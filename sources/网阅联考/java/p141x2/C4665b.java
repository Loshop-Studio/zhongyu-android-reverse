package p141x2;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.BufferedSink;
import okio.Okio;
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4523z;
import p117r2.C4496a0;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;
import p121s2.AbstractC4550b;
import p137w2.C4643c;

/* renamed from: x2.b */
/* loaded from: classes2.dex */
public final class C4665b implements InterfaceC4518u {

    /* renamed from: a */
    public final boolean f5962a;

    public C4665b(boolean z3) {
        this.f5962a = z3;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws IOException {
        boolean z3;
        C4496a0.a aVarM6488p;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4670g c4670g = (C4670g) chain;
        C4643c c4643cM6590f = c4670g.m6590f();
        Intrinsics.checkNotNull(c4643cM6590f);
        C4522y c4522yM6592h = c4670g.m6592h();
        AbstractC4523z abstractC4523zM6132a = c4522yM6592h.m6132a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c4643cM6590f.m6492t(c4522yM6592h);
        if (!C4669f.m6582a(c4522yM6592h.m6138g()) || abstractC4523zM6132a == null) {
            c4643cM6590f.m6486n();
            z3 = true;
            aVarM6488p = null;
        } else {
            if (StringsKt__StringsJVMKt.equals("100-continue", c4522yM6592h.m6135d("Expect"), true)) {
                c4643cM6590f.m6478f();
                aVarM6488p = c4643cM6590f.m6488p(true);
                c4643cM6590f.m6490r();
                z3 = false;
            } else {
                z3 = true;
                aVarM6488p = null;
            }
            if (aVarM6488p != null) {
                c4643cM6590f.m6486n();
                if (!c4643cM6590f.m6480h().m5613v()) {
                    c4643cM6590f.m6485m();
                }
            } else if (abstractC4523zM6132a.isDuplex()) {
                c4643cM6590f.m6478f();
                abstractC4523zM6132a.writeTo(Okio.buffer(c4643cM6590f.m6475c(c4522yM6592h, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(c4643cM6590f.m6475c(c4522yM6592h, false));
                abstractC4523zM6132a.writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (abstractC4523zM6132a == null || !abstractC4523zM6132a.isDuplex()) {
            c4643cM6590f.m6477e();
        }
        if (aVarM6488p == null) {
            aVarM6488p = c4643cM6590f.m6488p(false);
            Intrinsics.checkNotNull(aVarM6488p);
            if (z3) {
                c4643cM6590f.m6490r();
                z3 = false;
            }
        }
        C4496a0 c4496a0M5820c = aVarM6488p.m5835r(c4522yM6592h).m5826i(c4643cM6590f.m6480h().m5609r()).m5836s(jCurrentTimeMillis).m5834q(System.currentTimeMillis()).m5820c();
        int iM5804e = c4496a0M5820c.m5804e();
        if (iM5804e == 100) {
            C4496a0.a aVarM6488p2 = c4643cM6590f.m6488p(false);
            Intrinsics.checkNotNull(aVarM6488p2);
            if (z3) {
                c4643cM6590f.m6490r();
            }
            c4496a0M5820c = aVarM6488p2.m5835r(c4522yM6592h).m5826i(c4643cM6590f.m6480h().m5609r()).m5836s(jCurrentTimeMillis).m5834q(System.currentTimeMillis()).m5820c();
            iM5804e = c4496a0M5820c.m5804e();
        }
        c4643cM6590f.m6489q(c4496a0M5820c);
        C4496a0 c4496a0M5820c2 = (this.f5962a && iM5804e == 101) ? c4496a0M5820c.m5812n().m5819b(AbstractC4550b.f5703c).m5820c() : c4496a0M5820c.m5812n().m5819b(c4643cM6590f.m6487o(c4496a0M5820c)).m5820c();
        if (StringsKt__StringsJVMKt.equals("close", c4496a0M5820c2.m5816r().m6135d("Connection"), true) || StringsKt__StringsJVMKt.equals("close", C4496a0.m5799i(c4496a0M5820c2, "Connection", null, 2, null), true)) {
            c4643cM6590f.m6485m();
        }
        if (iM5804e == 204 || iM5804e == 205) {
            AbstractC4498b0 abstractC4498b0M5800a = c4496a0M5820c2.m5800a();
            if ((abstractC4498b0M5800a != null ? abstractC4498b0M5800a.mo5090c() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iM5804e);
                sb.append(" had non-zero Content-Length: ");
                AbstractC4498b0 abstractC4498b0M5800a2 = c4496a0M5820c2.m5800a();
                sb.append(abstractC4498b0M5800a2 != null ? Long.valueOf(abstractC4498b0M5800a2.mo5090c()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return c4496a0M5820c2;
    }
}
