package p087e6;

import android.content.Context;
import java.util.Set;
import p037c6.C5271b;
import p155k6.AbstractC9061c;

/* renamed from: e6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8367a {

    /* renamed from: e6.a$a */
    public interface a {
        /* renamed from: a */
        Set mo9876a();
    }

    /* renamed from: a */
    public static boolean m13653a(Context context) {
        Set setMo9876a = ((a) C5271b.m2181a(context, a.class)).mo9876a();
        AbstractC9061c.m15863c(setMo9876a.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo9876a.isEmpty()) {
            return true;
        }
        return ((Boolean) setMo9876a.iterator().next()).booleanValue();
    }
}
