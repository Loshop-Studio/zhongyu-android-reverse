package android.view.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.AbstractC6144i1;
import p118m7.AbstractC6191y0;
import p118m7.C6118a1;
import p118m7.C6127d;
import p118m7.C6146j0;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(Li7/b;)V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Landroid/util/SparseArray;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Landroid/util/SparseArray;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "surrogateSerializer", "Li7/b;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "SparseArraySurrogate", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SparseArraySerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseArraySerializer<T> implements InterfaceC5686b {

    @NotNull
    private final InterfaceC5765g descriptor;

    @NotNull
    private final InterfaceC5686b surrogateSerializer;

    @Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u001c*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001d\u001cB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0017\u001a\u00020\u0014\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "keys", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lm7/i1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm7/i1;)V", "self", "Ll7/d;", "output", "Lk7/g;", "serialDesc", "Li7/b;", "typeSerial0", "Ld6/s;", "write$Self$savedstate_release", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Ll7/d;Lk7/g;Li7/b;)V", "write$Self", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getValues", "Companion", "$serializer", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Serializable
    @SuppressLint({"UnsafeOptInUsageError"})
    public static final class SparseArraySurrogate<T> {

        @JvmField
        @NotNull
        private static final InterfaceC5765g $cachedDescriptor;

        @NotNull
        private final List<Integer> keys;

        @NotNull
        private final List<T> values;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        private static final InterfaceC5429e[] $childSerializers = {AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2965a()), null};

        @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Li7/b;)Li7/b;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <T> InterfaceC5686b serializer(@NotNull InterfaceC5686b typeSerial0) {
                AbstractC5830k.m5330g(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }

            public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
                this();
            }
        }

        static {
            C6118a1 c6118a1 = new C6118a1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            c6118a1.m5821j("keys", false);
            c6118a1.m5821j("values", false);
            $cachedDescriptor = c6118a1;
        }

        public /* synthetic */ SparseArraySurrogate(int i, List list, List list2, AbstractC6144i1 abstractC6144i1) {
            if (3 != (i & 3)) {
                AbstractC6191y0.m5841k($cachedDescriptor, i, 3);
                throw null;
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_() {
            return new C6127d(C6146j0.f9816a, 0);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate self, InterfaceC6070d output, InterfaceC5765g serialDesc, InterfaceC5686b typeSerial0) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC5689e) $childSerializers[0].getValue(), self.keys);
            output.encodeSerializableElement(serialDesc, 1, new C6127d(typeSerial0, 0), self.values);
        }

        @NotNull
        public final List<Integer> getKeys() {
            return this.keys;
        }

        @NotNull
        public final List<T> getValues() {
            return this.values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(@NotNull List<Integer> keys, @NotNull List<? extends T> values) {
            AbstractC5830k.m5330g(keys, "keys");
            AbstractC5830k.m5330g(values, "values");
            this.keys = keys;
            this.values = values;
        }
    }

    public SparseArraySerializer(@NotNull InterfaceC5686b elementSerializer) {
        AbstractC5830k.m5330g(elementSerializer, "elementSerializer");
        InterfaceC5686b interfaceC5686bSerializer = SparseArraySurrogate.INSTANCE.serializer(elementSerializer);
        this.surrogateSerializer = interfaceC5686bSerializer;
        this.descriptor = interfaceC5686bSerializer.getDescriptor();
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public InterfaceC5765g getDescriptor() {
        return this.descriptor;
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public SparseArray<T> deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i = 0; i < size; i++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i).intValue(), sparseArraySurrogate.getValues().get(i));
        }
        return sparseArray;
    }

    @Override // p084i7.InterfaceC5689e
    public void serialize(@NotNull InterfaceC6072f encoder, @NotNull SparseArray<T> value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(value.keyAt(i)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i8 = 0; i8 < size2; i8++) {
            arrayList2.add(value.valueAt(i8));
        }
        encoder.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
