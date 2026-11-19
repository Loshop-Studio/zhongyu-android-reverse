package p191n8;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: n8.l */
/* loaded from: classes5.dex */
public abstract class AbstractC9457l {
    /* renamed from: b */
    public static /* synthetic */ Object m17371b(Object obj, int i10, AbstractC9126n abstractC9126n) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m17370a(obj);
    }

    /* renamed from: c */
    public static final Object m17372c(Object obj, Object obj2) {
        if (obj == null) {
            return m17370a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m17370a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m17370a(arrayList);
    }

    /* renamed from: a */
    public static Object m17370a(Object obj) {
        return obj;
    }
}
