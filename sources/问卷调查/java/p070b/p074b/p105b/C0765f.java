package p070b.p074b.p105b;

import java.io.IOException;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.f */
/* loaded from: classes.dex */
public class C0765f extends AbstractC0783x<Number> {
    public C0765f(C0768i c0768i) {
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public Number mo2370a(C0759a c0759a) {
        if (c0759a.mo2403v() != EnumC0760b.NULL) {
            return Float.valueOf((float) c0759a.mo2397m());
        }
        c0759a.mo2401r();
        return null;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            c0761c.mo2409h();
        } else {
            C0768i.m2449a(number2.floatValue());
            c0761c.mo2412o(number2);
        }
    }
}
