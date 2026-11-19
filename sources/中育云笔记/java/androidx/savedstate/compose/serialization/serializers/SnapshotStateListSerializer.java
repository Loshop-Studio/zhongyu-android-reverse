package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import de.AbstractC9025a;
import ee.AbstractC9136m;
import ee.InterfaceC9129f;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class SnapshotStateListSerializer<T> implements InterfaceC5432b {
    private final InterfaceC5432b base;
    private final InterfaceC9129f descriptor;
    private final InterfaceC5432b elementSerializer;

    public SnapshotStateListSerializer(InterfaceC5432b elementSerializer) {
        AbstractC9979u.m20294g(elementSerializer, "elementSerializer");
        this.elementSerializer = elementSerializer;
        InterfaceC5432b interfaceC5432bM17650h = AbstractC9025a.m17650h(elementSerializer);
        this.base = interfaceC5432bM17650h;
        this.descriptor = AbstractC9136m.m17978d("androidx.compose.runtime.SnapshotStateList", interfaceC5432bM17650h.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public SnapshotStateList<T> deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        List list = (List) decoder.decodeSerializableValue(this.base);
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(AbstractC10947g0.m23922X0(list));
        return snapshotStateList;
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, SnapshotStateList<T> value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }
}
