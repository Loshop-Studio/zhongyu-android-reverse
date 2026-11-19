package p325rc;

import id.InterfaceC9628e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: rc.i */
/* loaded from: classes6.dex */
public abstract class AbstractC10950i extends AbstractMap implements Map, InterfaceC9628e {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public abstract /* bridge */ Set getKeys();

    public abstract /* bridge */ int getSize();

    public abstract /* bridge */ Collection getValues();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
