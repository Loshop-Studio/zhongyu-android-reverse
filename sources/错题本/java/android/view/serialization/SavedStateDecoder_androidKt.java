package android.view.serialization;

import android.os.Parcelable;
import android.view.serialization.serializers.CharSequenceArraySerializer;
import android.view.serialization.serializers.CharSequenceListSerializer;
import android.view.serialization.serializers.CharSequenceSerializer;
import android.view.serialization.serializers.DefaultJavaSerializableSerializer;
import android.view.serialization.serializers.DefaultParcelableSerializer;
import android.view.serialization.serializers.IBinderSerializer;
import android.view.serialization.serializers.ParcelableArraySerializer;
import android.view.serialization.serializers.ParcelableListSerializer;
import android.view.serialization.serializers.SparseParcelableArraySerializer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateDecoder;", "Li7/a;", "strategy", "decodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateDecoder;Li7/a;)Ljava/lang/Object;", "referenceArraySerializer", "Ly6/c;", "", "", "getArrayKClass", "(Li7/a;)Ly6/c;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T decodeFormatSpecificTypesOnPlatform(@NotNull SavedStateDecoder savedStateDecoder, @NotNull InterfaceC5685a strategy) {
        AbstractC5830k.m5330g(savedStateDecoder, "<this>");
        AbstractC5830k.m5330g(strategy, "strategy");
        InterfaceC5765g descriptor = strategy.getDescriptor();
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) CharSequenceSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) DefaultParcelableSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) IBinderSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) CharSequenceArraySerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) CharSequenceListSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
            return (T) Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, AbstractC6675d.m6349m(getArrayKClass(strategy)));
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) ParcelableArraySerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) ParcelableListSerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) SparseParcelableArraySerializer.INSTANCE.deserialize((InterfaceC6071e) savedStateDecoder);
        }
        return null;
    }

    private static final InterfaceC6779c getArrayKClass(InterfaceC5685a interfaceC5685a) {
        Object objDeserialize = interfaceC5685a.deserialize(EmptyArrayDecoder.INSTANCE);
        AbstractC5830k.m5327d(objDeserialize);
        return AbstractC5832m.m5340a(objDeserialize.getClass());
    }
}
