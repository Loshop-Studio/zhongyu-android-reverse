package androidx.savedstate.serialization;

import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p246s8.InterfaceC10051a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(SavedStateDecoder savedStateDecoder, InterfaceC10051a strategy) {
        AbstractC9133u.m16133g(savedStateDecoder, "<this>");
        AbstractC9133u.m16133g(strategy, "strategy");
        InterfaceC10210f descriptor = strategy.getDescriptor();
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, AbstractC10360a.m19298a(getArrayKClass(strategy)));
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((InterfaceC10256e) savedStateDecoder);
        }
        return null;
    }

    private static final InterfaceC8375c getArrayKClass(InterfaceC10051a interfaceC10051a) {
        Object objDeserialize = interfaceC10051a.deserialize(EmptyArrayDecoder.INSTANCE);
        AbstractC9133u.m16130d(objDeserialize);
        return AbstractC9137y.m16154b(objDeserialize.getClass());
    }
}
