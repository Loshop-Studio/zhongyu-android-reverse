package p157t4;

import android.content.Context;
import java.util.Set;
import p143r4.C7649b;
import p199z4.AbstractC7950d;

/* renamed from: t4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7728a {

    /* renamed from: t4.a$a */
    public interface a {
        /* renamed from: b */
        Set mo5253b();
    }

    /* renamed from: a */
    public static boolean m9209a(Context context) {
        Set setMo5253b = ((a) C7649b.m9076a(context, a.class)).mo5253b();
        AbstractC7950d.m9748d(setMo5253b.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo5253b.isEmpty()) {
            return true;
        }
        return ((Boolean) setMo5253b.iterator().next()).booleanValue();
    }
}
