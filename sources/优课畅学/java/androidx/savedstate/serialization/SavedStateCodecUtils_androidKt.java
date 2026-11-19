package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9137y;
import p246s8.C10056f;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;

/* loaded from: classes3.dex */
public final class SavedStateCodecUtils_androidKt {
    private static final InterfaceC10210f charSequenceArrayDescriptor;
    private static final InterfaceC10210f charSequenceListDescriptor;
    private static final InterfaceC10210f nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final InterfaceC10210f parcelableArrayDescriptor;
    private static final InterfaceC10210f parcelableListDescriptor;
    private static final InterfaceC10210f polymorphicCharSequenceArrayDescriptor;
    private static final InterfaceC10210f polymorphicCharSequenceListDescriptor;
    private static final InterfaceC10210f polymorphicParcelableArrayDescriptor;
    private static final InterfaceC10210f polymorphicParcelableListDescriptor;
    private static final InterfaceC10210f polymorphicSparseParcelableArrayDescriptor;
    private static final InterfaceC10210f sparseParcelableArrayDescriptor;
    private static final InterfaceC10210f polymorphicCharSequenceDescriptor = new C10056f(AbstractC9137y.m16154b(CharSequence.class)).getDescriptor();
    private static final InterfaceC10210f polymorphicParcelableDescriptor = new C10056f(AbstractC9137y.m16154b(Parcelable.class)).getDescriptor();
    private static final InterfaceC10210f polymorphicJavaSerializableDescriptor = new C10056f(AbstractC9137y.m16154b(Serializable.class)).getDescriptor();
    private static final InterfaceC10210f polymorphicIBinderDescriptor = new C10056f(AbstractC9137y.m16154b(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = AbstractC10124a.m18889a(AbstractC9137y.m16154b(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableArrayDescriptor = AbstractC10124a.m18889a(AbstractC9137y.m16154b(Parcelable.class), new C10056f(AbstractC9137y.m16154b(Parcelable.class))).getDescriptor();
        parcelableListDescriptor = AbstractC10124a.m18896h(defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableListDescriptor = AbstractC10124a.m18896h(new C10056f(AbstractC9137y.m16154b(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = AbstractC10124a.m18889a(AbstractC9137y.m16154b(CharSequence.class), charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceArrayDescriptor = AbstractC10124a.m18889a(AbstractC9137y.m16154b(CharSequence.class), new C10056f(AbstractC9137y.m16154b(CharSequence.class))).getDescriptor();
        charSequenceListDescriptor = AbstractC10124a.m18896h(charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceListDescriptor = AbstractC10124a.m18896h(new C10056f(AbstractC9137y.m16154b(CharSequence.class))).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new C10056f(AbstractC9137y.m16154b(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(AbstractC10124a.m18907s(new C10056f(AbstractC9137y.m16154b(Parcelable.class)))).getDescriptor();
    }

    public static final InterfaceC10210f getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static final InterfaceC10210f getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final InterfaceC10210f getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    public static final InterfaceC10210f getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static final InterfaceC10210f getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static final InterfaceC10210f getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    public static final InterfaceC10210f getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final InterfaceC10210f getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final InterfaceC10210f getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }
}
