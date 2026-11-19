package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.AbstractC10217m;
import p268u8.AbstractC10218n;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* loaded from: classes3.dex */
public final class MutableStateFlowSerializer<T> implements InterfaceC10052b {
    private final InterfaceC10210f descriptor;
    private final InterfaceC10052b valueSerializer;

    public MutableStateFlowSerializer(InterfaceC10052b valueSerializer) {
        AbstractC9133u.m16133g(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        AbstractC10218n kind = valueSerializer.getDescriptor().getKind();
        this.descriptor = kind instanceof AbstractC10209e ? AbstractC10217m.m19105c("kotlinx.coroutines.flow.MutableStateFlow", (AbstractC10209e) kind) : AbstractC10217m.m19106d("kotlinx.coroutines.flow.MutableStateFlow", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.descriptor;
    }

    @Override // p246s8.InterfaceC10051a
    public InterfaceC9271h deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return AbstractC9281r.m17054a(decoder.decodeSerializableValue(this.valueSerializer));
    }

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, InterfaceC9271h value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        encoder.encodeSerializableValue(this.valueSerializer, value.getValue());
    }
}
