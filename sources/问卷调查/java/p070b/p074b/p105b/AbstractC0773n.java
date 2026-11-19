package p070b.p074b.p105b;

import java.io.IOException;
import java.io.StringWriter;
import p070b.p074b.p105b.p106a0.p108z.C0750o;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.n */
/* loaded from: classes.dex */
public abstract class AbstractC0773n {
    /* renamed from: a */
    public C0778s m2455a() {
        if (this instanceof C0778s) {
            return (C0778s) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0761c c0761c = new C0761c(stringWriter);
            c0761c.f4429f = true;
            C0750o.f4341X.mo2371b(c0761c, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
