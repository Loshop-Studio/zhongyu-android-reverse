package p000a.p063q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.q.p */
/* loaded from: classes.dex */
public class C0425p {

    /* renamed from: b */
    public View f2457b;

    /* renamed from: a */
    public final Map<String, Object> f2456a = new HashMap();

    /* renamed from: c */
    public final ArrayList<AbstractC0417h> f2458c = new ArrayList<>();

    @Deprecated
    public C0425p() {
    }

    public C0425p(View view) {
        this.f2457b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0425p)) {
            return false;
        }
        C0425p c0425p = (C0425p) obj;
        return this.f2457b == c0425p.f2457b && this.f2456a.equals(c0425p.f2456a);
    }

    public int hashCode() {
        return this.f2456a.hashCode() + (this.f2457b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("TransitionValues@");
        sbM2079g.append(Integer.toHexString(hashCode()));
        sbM2079g.append(":\n");
        String strM2076d = C0561a.m2076d(sbM2079g.toString() + "    view = " + this.f2457b + "\n", "    values:");
        for (String str : this.f2456a.keySet()) {
            strM2076d = strM2076d + "    " + str + ": " + this.f2456a.get(str) + "\n";
        }
        return strM2076d;
    }
}
