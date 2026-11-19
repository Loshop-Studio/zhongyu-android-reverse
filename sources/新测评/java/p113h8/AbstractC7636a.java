package p113h8;

import android.content.Context;
import java.util.Set;
import p091f8.C7495b;
import p181n8.AbstractC8672c;

/* renamed from: h8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7636a {

    /* renamed from: h8.a$a */
    public interface a {
        /* renamed from: b */
        Set mo12620b();
    }

    /* renamed from: a */
    public static boolean m12619a(Context context) {
        Set setMo12620b = ((a) C7495b.m12126a(context, a.class)).mo12620b();
        AbstractC8672c.m14277c(setMo12620b.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo12620b.isEmpty()) {
            return true;
        }
        return ((Boolean) setMo12620b.iterator().next()).booleanValue();
    }
}
