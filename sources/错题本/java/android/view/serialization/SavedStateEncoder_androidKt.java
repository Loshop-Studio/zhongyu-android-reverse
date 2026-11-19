package android.view.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6072f;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/serialization/SavedStateEncoder;", "Li7/e;", "strategy", "value", "", "encodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateEncoder;Li7/e;Ljava/lang/Object;)Z", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(@NotNull SavedStateEncoder savedStateEncoder, @NotNull InterfaceC5689e strategy, T t8) {
        AbstractC5830k.m5330g(savedStateEncoder, "<this>");
        AbstractC5830k.m5330g(strategy, "strategy");
        InterfaceC5765g descriptor = strategy.getDescriptor();
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.serialize((InterfaceC6072f) savedStateEncoder, (CharSequence) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize((InterfaceC6072f) savedStateEncoder, (SavedStateEncoder) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize((InterfaceC6072f) savedStateEncoder, (SavedStateEncoder) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.serialize((InterfaceC6072f) savedStateEncoder, (IBinder) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.serialize((InterfaceC6072f) savedStateEncoder, (CharSequence[]) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize((InterfaceC6072f) savedStateEncoder, (List<? extends CharSequence>) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.serialize((InterfaceC6072f) savedStateEncoder, (Parcelable[]) t8);
            return true;
        }
        if (AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.INSTANCE;
            AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize((InterfaceC6072f) savedStateEncoder, (List<? extends Parcelable>) t8);
            return true;
        }
        if (!AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !AbstractC5830k.m5325b(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.INSTANCE;
        AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        sparseParcelableArraySerializer.serialize((InterfaceC6072f) savedStateEncoder, (SparseArray<Parcelable>) t8);
        return true;
    }
}
