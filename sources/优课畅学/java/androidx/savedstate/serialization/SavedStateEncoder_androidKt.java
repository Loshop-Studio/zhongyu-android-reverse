package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10257f;

/* loaded from: classes3.dex */
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(SavedStateEncoder savedStateEncoder, InterfaceC10059i strategy, T t10) {
        AbstractC9133u.m16133g(savedStateEncoder, "<this>");
        AbstractC9133u.m16133g(strategy, "strategy");
        InterfaceC10210f descriptor = strategy.getDescriptor();
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.serialize((InterfaceC10257f) savedStateEncoder, (CharSequence) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize((InterfaceC10257f) savedStateEncoder, (SavedStateEncoder) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize((InterfaceC10257f) savedStateEncoder, (SavedStateEncoder) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.serialize((InterfaceC10257f) savedStateEncoder, (IBinder) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.serialize((InterfaceC10257f) savedStateEncoder, (CharSequence[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize((InterfaceC10257f) savedStateEncoder, (List<? extends CharSequence>) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.serialize((InterfaceC10257f) savedStateEncoder, (Parcelable[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.INSTANCE;
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize((InterfaceC10257f) savedStateEncoder, (List<? extends Parcelable>) t10);
            return true;
        }
        if (!AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !AbstractC9133u.m16128b(descriptor, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.INSTANCE;
        AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        sparseParcelableArraySerializer.serialize((InterfaceC10257f) savedStateEncoder, (SparseArray<Parcelable>) t10);
        return true;
    }
}
