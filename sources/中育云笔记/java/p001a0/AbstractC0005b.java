package p001a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* renamed from: a0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0005b {
    /* renamed from: a */
    public static final Map m8a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    /* renamed from: b */
    public static /* synthetic */ Map m9b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return m8a(i10, f10);
    }

    /* renamed from: c */
    public static final List m10c(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC10947g0.m23944m0(list)) : AbstractC10978w.m24136n();
    }

    /* renamed from: d */
    public static final Map m11d(Map map) {
        int size = map.size();
        if (size == 0) {
            return AbstractC9925a.m20088h();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC10947g0.m23943l0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
