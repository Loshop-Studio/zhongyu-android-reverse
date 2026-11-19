package p030c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: c0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5077b {
    /* renamed from: a */
    public static final Map m2667a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    /* renamed from: b */
    public static /* synthetic */ Map m2668b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return m2667a(i10, f10);
    }

    /* renamed from: c */
    public static final List m2669c(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list)) : CollectionsKt.emptyList();
    }

    /* renamed from: d */
    public static final Map m2670d(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
