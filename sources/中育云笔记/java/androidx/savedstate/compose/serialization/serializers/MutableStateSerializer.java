package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import ee.AbstractC9128e;
import ee.AbstractC9136m;
import ee.AbstractC9137n;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* loaded from: classes3.dex */
public final class MutableStateSerializer<T> implements InterfaceC5432b {
    private final InterfaceC9129f descriptor;
    private final InterfaceC5432b valueSerializer;

    public MutableStateSerializer(InterfaceC5432b valueSerializer) {
        AbstractC9979u.m20294g(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        AbstractC9137n kind = valueSerializer.getDescriptor().getKind();
        this.descriptor = kind instanceof AbstractC9128e ? AbstractC9136m.m17977c("androidx.compose.runtime.MutableState", (AbstractC9128e) kind) : AbstractC9136m.m17978d("androidx.compose.runtime.MutableState", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public MutableState<T> deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(decoder.decodeSerializableValue(this.valueSerializer), null, 2, null);
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, MutableState<T> value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.encodeSerializableValue(this.valueSerializer, value.getValue());
    }
}
