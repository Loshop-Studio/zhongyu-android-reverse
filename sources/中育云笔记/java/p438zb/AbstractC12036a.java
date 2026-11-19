package p438zb;

import android.content.Context;
import java.util.Set;
import p151fc.AbstractC9221d;
import p408xb.C11824b;

/* renamed from: zb.a */
/* loaded from: classes6.dex */
public abstract class AbstractC12036a {

    /* renamed from: zb.a$a */
    public interface a {
        /* renamed from: b */
        Set mo25844b();
    }

    /* renamed from: a */
    public static boolean m26662a(Context context) {
        Set setMo25844b = ((a) C11824b.m26205a(context, a.class)).mo25844b();
        AbstractC9221d.m18140d(setMo25844b.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo25844b.isEmpty()) {
            return true;
        }
        return ((Boolean) setMo25844b.iterator().next()).booleanValue();
    }
}
