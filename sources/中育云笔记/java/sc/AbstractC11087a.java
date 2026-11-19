package sc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10952j;

/* renamed from: sc.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11087a extends AbstractC10952j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    public abstract /* bridge */ boolean remove(Map.Entry entry);

    public final boolean contains(Map.Entry element) {
        AbstractC9979u.m20294g(element, "element");
        return containsEntry(element);
    }
}
