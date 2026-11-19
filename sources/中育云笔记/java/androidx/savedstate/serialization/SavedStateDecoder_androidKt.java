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
import ee.InterfaceC9129f;
import gd.AbstractC9293a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.InterfaceC5431a;
import p153fe.InterfaceC9228e;
import p280od.InterfaceC10469c;

/* loaded from: classes3.dex */
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(SavedStateDecoder savedStateDecoder, InterfaceC5431a strategy) {
        AbstractC9979u.m20294g(savedStateDecoder, "<this>");
        AbstractC9979u.m20294g(strategy, "strategy");
        InterfaceC9129f descriptor = strategy.getDescriptor();
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, AbstractC9293a.m18324a(getArrayKClass(strategy)));
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || AbstractC9979u.m20289b(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((InterfaceC9228e) savedStateDecoder);
        }
        return null;
    }

    private static final InterfaceC10469c getArrayKClass(InterfaceC5431a interfaceC5431a) {
        Object objDeserialize = interfaceC5431a.deserialize(EmptyArrayDecoder.INSTANCE);
        AbstractC9979u.m20291d(objDeserialize);
        return AbstractC9983y.m20315b(objDeserialize.getClass());
    }
}
