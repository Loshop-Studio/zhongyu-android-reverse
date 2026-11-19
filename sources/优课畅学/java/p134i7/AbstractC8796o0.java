package p134i7;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.o0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8796o0 {
    /* renamed from: a */
    public static final Object m14610a(Map map, Object obj) {
        AbstractC9133u.m16133g(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
