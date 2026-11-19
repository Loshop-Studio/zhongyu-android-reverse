package p325rc;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.p0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10965p0 {
    /* renamed from: a */
    public static final Object m24034a(Map map, Object obj) {
        AbstractC9979u.m20294g(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
