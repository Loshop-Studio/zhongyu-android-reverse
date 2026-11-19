package p168e.p169q.p171d;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.d.b */
/* loaded from: classes.dex */
public final class C1048b {

    /* renamed from: a */
    public AbstractC1047a f5584a;

    /* renamed from: b */
    public final List<AbstractC1047a> f5585b;

    /* renamed from: c */
    public boolean f5586c;

    /* renamed from: d */
    public final C1049c f5587d;

    /* renamed from: e */
    public final String f5588e;

    public C1048b(C1049c c1049c, String str) {
        C1011d.m2809e(c1049c, "taskRunner");
        C1011d.m2809e(str, "name");
        this.f5587d = c1049c;
        this.f5588e = str;
        this.f5585b = new ArrayList();
    }

    /* renamed from: a */
    public final boolean m2841a() {
        AbstractC1047a abstractC1047a = this.f5584a;
        if (abstractC1047a != null) {
            C1011d.m2807c(abstractC1047a);
            if (abstractC1047a.f5583d) {
                this.f5586c = true;
            }
        }
        boolean z = false;
        for (int size = this.f5585b.size() - 1; size >= 0; size--) {
            if (this.f5585b.get(size).f5583d) {
                AbstractC1047a abstractC1047a2 = this.f5585b.get(size);
                C1049c c1049c = C1049c.f5591j;
                if (C1049c.f5590i.isLoggable(Level.FINE)) {
                    C0787a.m2467a(abstractC1047a2, this, "canceled");
                }
                this.f5585b.remove(size);
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        return this.f5588e;
    }
}
