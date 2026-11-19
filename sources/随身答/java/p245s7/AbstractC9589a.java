package p245s7;

import android.content.Context;
import java.util.Set;
import p225q7.C9376b;
import p305y7.AbstractC9967c;

/* renamed from: s7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9589a {

    /* renamed from: s7.a$a */
    public interface a {
        /* renamed from: a */
        Set mo12850a();
    }

    /* renamed from: a */
    public static boolean m15761a(Context context) {
        Set setMo12850a = ((a) C9376b.m15358a(context, a.class)).mo12850a();
        AbstractC9967c.m17239c(setMo12850a.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo12850a.isEmpty()) {
            return true;
        }
        return ((Boolean) setMo12850a.iterator().next()).booleanValue();
    }
}
