package androidx.savedstate.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10058h;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p290w8.AbstractC10426n2;
import p290w8.AbstractC10469y1;
import p290w8.C10379d2;
import p290w8.C10386f;
import p290w8.C10452u0;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class SparseArraySerializer<T> implements InterfaceC10052b {
    private final InterfaceC10210f descriptor;
    private final InterfaceC10052b surrogateSerializer;

    @SuppressLint({"UnsafeOptInUsageError"})
    @InterfaceC10058h
    public static final class SparseArraySurrogate<T> {
        private static final InterfaceC10210f $cachedDescriptor;
        private final List<Integer> keys;
        private final List<T> values;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC8724d[] $childSerializers = {AbstractC9078a.m15923a(LazyThreadSafetyMode.f17344b, new InterfaceC10559a() { // from class: androidx.savedstate.serialization.serializers.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate._childSerializers$_anonymous_();
            }
        }), null};

        public static final class Companion {
            private Companion() {
            }

            public final <T> InterfaceC10052b serializer(InterfaceC10052b typeSerial0) {
                AbstractC9133u.m16133g(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }

            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }
        }

        static {
            C10379d2 c10379d2 = new C10379d2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            c10379d2.m19368m("keys", false);
            c10379d2.m19368m("values", false);
            $cachedDescriptor = c10379d2;
        }

        public /* synthetic */ SparseArraySurrogate(int i10, List list, List list2, AbstractC10426n2 abstractC10426n2) {
            if (3 != (i10 & 3)) {
                AbstractC10469y1.m19583a(i10, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC10052b _childSerializers$_anonymous_() {
            return new C10386f(C10452u0.f20783a);
        }

        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate sparseArraySurrogate, InterfaceC10255d interfaceC10255d, InterfaceC10210f interfaceC10210f, InterfaceC10052b interfaceC10052b) {
            interfaceC10255d.encodeSerializableElement(interfaceC10210f, 0, (InterfaceC10059i) $childSerializers[0].getValue(), sparseArraySurrogate.keys);
            interfaceC10255d.encodeSerializableElement(interfaceC10210f, 1, new C10386f(interfaceC10052b), sparseArraySurrogate.values);
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> keys, List<? extends T> values) {
            AbstractC9133u.m16133g(keys, "keys");
            AbstractC9133u.m16133g(values, "values");
            this.keys = keys;
            this.values = values;
        }
    }

    public SparseArraySerializer(InterfaceC10052b elementSerializer) {
        AbstractC9133u.m16133g(elementSerializer, "elementSerializer");
        InterfaceC10052b interfaceC10052bSerializer = SparseArraySurrogate.Companion.serializer(elementSerializer);
        this.surrogateSerializer = interfaceC10052bSerializer;
        this.descriptor = interfaceC10052bSerializer.getDescriptor();
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.descriptor;
    }

    @Override // p246s8.InterfaceC10051a
    public SparseArray<T> deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
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

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, SparseArray<T> value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
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
