package p372v4;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p212k.AbstractC9764r;
import p317r4.AbstractC10838a;

/* renamed from: v4.a */
/* loaded from: classes5.dex */
public class C11541a extends AbstractC10838a {

    /* renamed from: b */
    public static final List f27407b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static void m25393a() {
        Iterator it = f27407b.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }
}
