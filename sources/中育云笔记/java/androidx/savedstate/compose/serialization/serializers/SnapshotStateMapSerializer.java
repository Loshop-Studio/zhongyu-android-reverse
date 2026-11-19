package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import de.AbstractC9025a;
import ee.AbstractC9136m;
import ee.InterfaceC9129f;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* loaded from: classes3.dex */
public final class SnapshotStateMapSerializer<K, V> implements InterfaceC5432b {
    private final InterfaceC5432b base;
    private final InterfaceC9129f descriptor;

    public SnapshotStateMapSerializer(InterfaceC5432b keySerializer, InterfaceC5432b valueSerializer) {
        AbstractC9979u.m20294g(keySerializer, "keySerializer");
        AbstractC9979u.m20294g(valueSerializer, "valueSerializer");
        InterfaceC5432b interfaceC5432bM17653k = AbstractC9025a.m17653k(keySerializer, valueSerializer);
        this.base = interfaceC5432bM17653k;
        this.descriptor = AbstractC9136m.m17978d("androidx.compose.runtime.SnapshotStateMap", interfaceC5432bM17653k.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public SnapshotStateMap<K, V> deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        Map<? extends K, ? extends V> map = (Map) decoder.decodeSerializableValue(this.base);
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, SnapshotStateMap<K, V> value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }
}
