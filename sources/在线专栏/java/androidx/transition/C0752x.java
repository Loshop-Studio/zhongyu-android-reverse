package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.x */
/* loaded from: classes.dex */
public class C0752x {

    /* renamed from: b */
    public View f4483b;

    /* renamed from: a */
    public final Map<String, Object> f4482a = new HashMap();

    /* renamed from: c */
    final ArrayList<Transition> f4484c = new ArrayList<>();

    @Deprecated
    public C0752x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0752x)) {
            return false;
        }
        C0752x c0752x = (C0752x) obj;
        return this.f4483b == c0752x.f4483b && this.f4482a.equals(c0752x.f4482a);
    }

    public int hashCode() {
        return (this.f4483b.hashCode() * 31) + this.f4482a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4483b + "\n") + "    values:";
        for (String str2 : this.f4482a.keySet()) {
            str = str + "    " + str2 + ": " + this.f4482a.get(str2) + "\n";
        }
        return str;
    }

    public C0752x(View view) {
        this.f4483b = view;
    }
}
