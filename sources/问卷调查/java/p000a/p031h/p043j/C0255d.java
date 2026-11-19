package p000a.p031h.p043j;

import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.j.d */
/* loaded from: classes.dex */
public final class C0255d {

    /* renamed from: a */
    public final Object f1601a;

    public C0255d(Object obj) {
        this.f1601a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0255d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1601a, ((C0255d) obj).f1601a);
    }

    public int hashCode() {
        Object obj = this.f1601a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("DisplayCutoutCompat{");
        sbM2079g.append(this.f1601a);
        sbM2079g.append("}");
        return sbM2079g.toString();
    }
}
