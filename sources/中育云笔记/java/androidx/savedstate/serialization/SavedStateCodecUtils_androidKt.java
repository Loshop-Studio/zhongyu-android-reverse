package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import de.AbstractC9025a;
import ee.InterfaceC9129f;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.C5436f;

/* loaded from: classes3.dex */
public final class SavedStateCodecUtils_androidKt {
    private static final InterfaceC9129f charSequenceArrayDescriptor;
    private static final InterfaceC9129f charSequenceListDescriptor;
    private static final InterfaceC9129f nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final InterfaceC9129f parcelableArrayDescriptor;
    private static final InterfaceC9129f parcelableListDescriptor;
    private static final InterfaceC9129f polymorphicCharSequenceArrayDescriptor;
    private static final InterfaceC9129f polymorphicCharSequenceListDescriptor;
    private static final InterfaceC9129f polymorphicParcelableArrayDescriptor;
    private static final InterfaceC9129f polymorphicParcelableListDescriptor;
    private static final InterfaceC9129f polymorphicSparseParcelableArrayDescriptor;
    private static final InterfaceC9129f sparseParcelableArrayDescriptor;
    private static final InterfaceC9129f polymorphicCharSequenceDescriptor = new C5436f(AbstractC9983y.m20315b(CharSequence.class)).getDescriptor();
    private static final InterfaceC9129f polymorphicParcelableDescriptor = new C5436f(AbstractC9983y.m20315b(Parcelable.class)).getDescriptor();
    private static final InterfaceC9129f polymorphicJavaSerializableDescriptor = new C5436f(AbstractC9983y.m20315b(Serializable.class)).getDescriptor();
    private static final InterfaceC9129f polymorphicIBinderDescriptor = new C5436f(AbstractC9983y.m20315b(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = AbstractC9025a.m17643a(AbstractC9983y.m20315b(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableArrayDescriptor = AbstractC9025a.m17643a(AbstractC9983y.m20315b(Parcelable.class), new C5436f(AbstractC9983y.m20315b(Parcelable.class))).getDescriptor();
        parcelableListDescriptor = AbstractC9025a.m17650h(defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableListDescriptor = AbstractC9025a.m17650h(new C5436f(AbstractC9983y.m20315b(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = AbstractC9025a.m17643a(AbstractC9983y.m20315b(CharSequence.class), charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceArrayDescriptor = AbstractC9025a.m17643a(AbstractC9983y.m20315b(CharSequence.class), new C5436f(AbstractC9983y.m20315b(CharSequence.class))).getDescriptor();
        charSequenceListDescriptor = AbstractC9025a.m17650h(charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceListDescriptor = AbstractC9025a.m17650h(new C5436f(AbstractC9983y.m20315b(CharSequence.class))).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new C5436f(AbstractC9983y.m20315b(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(AbstractC9025a.m17662t(new C5436f(AbstractC9983y.m20315b(Parcelable.class)))).getDescriptor();
    }

    public static final InterfaceC9129f getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static final InterfaceC9129f getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final InterfaceC9129f getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    public static final InterfaceC9129f getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static final InterfaceC9129f getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static final InterfaceC9129f getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    public static final InterfaceC9129f getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final InterfaceC9129f getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final InterfaceC9129f getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }
}
