package p023c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: c0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4457b {
    /* renamed from: a */
    public static final Map m1524a(int i6, float f6) {
        return new LinkedHashMap(i6, f6, true);
    }

    /* renamed from: b */
    public static /* synthetic */ Map m1525b(int i6, float f6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = 0;
        }
        if ((i7 & 2) != 0) {
            f6 = 0.75f;
        }
        return m1524a(i6, f6);
    }

    /* renamed from: c */
    public static final List m1526c(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list)) : CollectionsKt.emptyList();
    }

    /* renamed from: d */
    public static final Map m1527d(Map map) {
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
