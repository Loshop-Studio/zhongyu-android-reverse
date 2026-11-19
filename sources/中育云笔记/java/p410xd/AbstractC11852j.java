package p410xd;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xd.j */
/* loaded from: classes6.dex */
public abstract class AbstractC11852j {
    /* renamed from: b */
    public static /* synthetic */ Object m26283b(Object obj, int i10, AbstractC9972n abstractC9972n) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m26282a(obj);
    }

    /* renamed from: c */
    public static final Object m26284c(Object obj, Object obj2) {
        if (obj == null) {
            return m26282a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return m26282a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m26282a(arrayList);
    }

    /* renamed from: a */
    public static Object m26282a(Object obj) {
        return obj;
    }
}
