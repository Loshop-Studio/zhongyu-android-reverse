package p372v4;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p212k.AbstractC9764r;

/* renamed from: v4.c */
/* loaded from: classes5.dex */
public final class C11543c {

    /* renamed from: c */
    public static Map f27414c = new HashMap();

    /* renamed from: d */
    public static Map f27415d = new HashMap();

    /* renamed from: a */
    public Map f27416a = new HashMap();

    /* renamed from: b */
    public Map f27417b = new HashMap();

    public C11543c(List list, Context context) {
        m25401a(list, context);
    }

    /* renamed from: a */
    public void m25401a(List list, Context context) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }
}
