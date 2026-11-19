package androidx.savedstate.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import ee.InterfaceC9129f;
import ge.AbstractC9359n2;
import ge.AbstractC9402y1;
import ge.C9312d2;
import ge.C9319f;
import ge.C9385u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5438h;
import p049ce.InterfaceC5439i;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes3.dex */
public final class SparseArraySerializer<T> implements InterfaceC5432b {
    private final InterfaceC9129f descriptor;
    private final InterfaceC5432b surrogateSerializer;

    @SuppressLint({"UnsafeOptInUsageError"})
    @InterfaceC5438h
    public static final class SparseArraySurrogate<T> {
        private static final InterfaceC9129f $cachedDescriptor;
        private final List<Integer> keys;
        private final List<T> values;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC10773d[] $childSerializers = {AbstractC9923a.m20069b(LazyThreadSafetyMode.f23257d, new InterfaceC9529a() { // from class: androidx.savedstate.serialization.serializers.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate._childSerializers$_anonymous_();
            }
        }), null};

        public static final class Companion {
            private Companion() {
            }

            public final <T> InterfaceC5432b serializer(InterfaceC5432b typeSerial0) {
                AbstractC9979u.m20294g(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }

            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }
        }

        static {
            C9312d2 c9312d2 = new C9312d2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            c9312d2.m18394m("keys", false);
            c9312d2.m18394m("values", false);
            $cachedDescriptor = c9312d2;
        }

        public /* synthetic */ SparseArraySurrogate(int i10, List list, List list2, AbstractC9359n2 abstractC9359n2) {
            if (3 != (i10 & 3)) {
                AbstractC9402y1.m18611a(i10, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC5432b _childSerializers$_anonymous_() {
            return new C9319f(C9385u0.f21810a);
        }

        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate sparseArraySurrogate, InterfaceC9227d interfaceC9227d, InterfaceC9129f interfaceC9129f, InterfaceC5432b interfaceC5432b) {
            interfaceC9227d.encodeSerializableElement(interfaceC9129f, 0, (InterfaceC5439i) $childSerializers[0].getValue(), sparseArraySurrogate.keys);
            interfaceC9227d.encodeSerializableElement(interfaceC9129f, 1, new C9319f(interfaceC5432b), sparseArraySurrogate.values);
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> keys, List<? extends T> values) {
            AbstractC9979u.m20294g(keys, "keys");
            AbstractC9979u.m20294g(values, "values");
            this.keys = keys;
            this.values = values;
        }
    }

    public SparseArraySerializer(InterfaceC5432b elementSerializer) {
        AbstractC9979u.m20294g(elementSerializer, "elementSerializer");
        InterfaceC5432b interfaceC5432bSerializer = SparseArraySurrogate.Companion.serializer(elementSerializer);
        this.surrogateSerializer = interfaceC5432bSerializer;
        this.descriptor = interfaceC5432bSerializer.getDescriptor();
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public SparseArray<T> deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i10).intValue(), sparseArraySurrogate.getValues().get(i10));
        }
        return sparseArray;
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, SparseArray<T> value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(value.keyAt(i10)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(value.valueAt(i11));
        }
        encoder.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
