package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053e6.C5458b;
import p053e6.C5459c;
import p053e6.C5462f;
import p053e6.C5463g;
import p053e6.C5464h;
import p053e6.C5465i;
import p053e6.C5466j;
import p160s6.InterfaceC6564e;
import p185v7.AbstractC6675d;

@Metadata(m5109d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\t\b\u0000\u0018\u0000 x*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006yz>BF{B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u001b2\u0014\u0010\u001a\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u001bH\u0000¢\u0006\u0004\b(\u0010\u0007J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010\u0013J#\u00103\u001a\u00020\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0000¢\u0006\u0004\b1\u00102J\u001b\u00108\u001a\u00020\u000e2\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0000¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0000¢\u0006\u0004\b9\u00102J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010;\u001a\u00028\u0001H\u0000¢\u0006\u0004\b<\u0010\u0013J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>H\u0000¢\u0006\u0004\b?\u0010@J\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010BH\u0000¢\u0006\u0004\bC\u0010DJ\u001b\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010X\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR$\u0010]\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010$R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010h\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010\u0010R\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00010o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR&\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010s0k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010mR\u0014\u0010w\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010$¨\u0006|"}, m5110d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Map;", "", "isEmpty", "()Z", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "Ld6/s;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "addKey", "removeKey$kotlin_stdlib", "removeKey", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "m", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Le6/f;", "keysIterator$kotlin_stdlib", "()Le6/f;", "keysIterator", "Le6/g;", "valuesIterator$kotlin_stdlib", "()Le6/g;", "valuesIterator", "Le6/c;", "entriesIterator$kotlin_stdlib", "()Le6/c;", "entriesIterator", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "keysArray", "[Ljava/lang/Object;", "valuesArray", "", "presenceArray", "[I", "hashArray", "maxProbeDistance", "I", "length", "hashShift", "modCount", "size", "getSize", "Le6/i;", "keysView", "Le6/i;", "Le6/j;", "valuesView", "Le6/j;", "Le6/h;", "entriesView", "Le6/h;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "Companion", "e6/b", "e6/e", "e6/d", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
/* loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC6564e {

    @NotNull
    public static final C5458b Companion = new C5458b();

    /* renamed from: a */
    public static final MapBuilder f9171a;

    @Nullable
    private C5464h entriesView;

    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @NotNull
    private K[] keysArray;

    @Nullable
    private C5465i keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @NotNull
    private int[] presenceArray;
    private int size;

    @Nullable
    private V[] valuesArray;

    @Nullable
    private C5466j valuesView;

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f9171a = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    public static final Object[] access$allocateValuesArray(MapBuilder mapBuilder) {
        V[] vArr = mapBuilder.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int capacity$kotlin_stdlib = mapBuilder.getCapacity$kotlin_stdlib();
        if (capacity$kotlin_stdlib < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        V[] vArr2 = (V[]) new Object[capacity$kotlin_stdlib];
        mapBuilder.valuesArray = vArr2;
        return vArr2;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final void m5134a(boolean z8) {
        int i;
        V[] vArr = this.valuesArray;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.length;
            if (i8 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i9] = kArr[i8];
                if (vArr != null) {
                    vArr[i9] = vArr[i8];
                }
                if (z8) {
                    iArr[i9] = i10;
                    this.hashArray[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        AbstractC6675d.m6353s(i9, i, this.keysArray);
        if (vArr != null) {
            AbstractC6675d.m6353s(i9, this.length, vArr);
        }
        this.length = i9;
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iM5138e = m5138e(key);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i8 = 0;
            while (true) {
                int i9 = this.hashArray[iM5138e];
                if (i9 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i10 = this.length;
                        int i11 = i10 + 1;
                        this.length = i11;
                        this.keysArray[i10] = key;
                        this.presenceArray[i10] = iM5138e;
                        this.hashArray[iM5138e] = i11;
                        this.size = size() + 1;
                        this.modCount++;
                        if (i8 > this.maxProbeDistance) {
                            this.maxProbeDistance = i8;
                        }
                        return i10;
                    }
                    m5135b(1);
                } else {
                    if (AbstractC5830k.m5325b(this.keysArray[i9 - 1], key)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i) {
                        m5139f(this.hashArray.length * 2);
                        break;
                    }
                    iM5138e = iM5138e == 0 ? this.hashArray.length - 1 : iM5138e - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m5135b(int i) {
        V[] vArr;
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i8 = this.length;
        int i9 = capacity$kotlin_stdlib - i8;
        int size = i8 - size();
        if (i9 < i && i9 + size >= i && size >= getCapacity$kotlin_stdlib() / 4) {
            m5134a(true);
            return;
        }
        int i10 = this.length + i;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > getCapacity$kotlin_stdlib()) {
            C5780c c5780c = AbstractC5786f.Companion;
            int capacity$kotlin_stdlib2 = getCapacity$kotlin_stdlib();
            c5780c.getClass();
            int iM5146e = C5780c.m5146e(capacity$kotlin_stdlib2, i10);
            K[] kArr = this.keysArray;
            AbstractC5830k.m5330g(kArr, "<this>");
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, iM5146e);
            AbstractC5830k.m5329f(kArr2, "copyOf(...)");
            this.keysArray = kArr2;
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, iM5146e);
                AbstractC5830k.m5329f(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iM5146e);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            Companion.getClass();
            int iHighestOneBit = Integer.highestOneBit((iM5146e >= 1 ? iM5146e : 1) * 3);
            if (iHighestOneBit > this.hashArray.length) {
                m5139f(iHighestOneBit);
            }
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f9171a;
        AbstractC5830k.m5328e(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    /* renamed from: c */
    public final int m5136c(Object obj) {
        int iM5138e = m5138e(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i8 = this.hashArray[iM5138e];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (AbstractC5830k.m5325b(this.keysArray[i9], obj)) {
                    return i9;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM5138e = iM5138e == 0 ? this.hashArray.length - 1 : iM5138e - 1;
        }
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.hashArray[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        AbstractC6675d.m6353s(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            AbstractC6675d.m6353s(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> m8) {
        AbstractC5830k.m5330g(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        AbstractC5830k.m5330g(entry, "entry");
        int iM5136c = m5136c(entry.getKey());
        if (iM5136c < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        AbstractC5830k.m5327d(vArr);
        return AbstractC5830k.m5325b(vArr[iM5136c], entry.getValue());
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return m5136c(key) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return m5137d(value) >= 0;
    }

    /* renamed from: d */
    public final int m5137d(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                AbstractC5830k.m5327d(vArr);
                if (AbstractC5830k.m5325b(vArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: e */
    public final int m5138e(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @NotNull
    public final C5459c entriesIterator$kotlin_stdlib() {
        return new C5459c(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r3[r0] = r6;
        r5.presenceArray[r2] = r0;
        r2 = r6;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5139f(int r6) {
        /*
            r5 = this;
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            int r0 = r5.length
            int r1 = r5.size()
            r2 = 0
            if (r0 <= r1) goto L12
            r5.m5134a(r2)
        L12:
            int[] r0 = new int[r6]
            r5.hashArray = r0
            e6.b r0 = kotlin.collections.builders.MapBuilder.Companion
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.hashShift = r6
        L23:
            int r6 = r5.length
            if (r2 >= r6) goto L57
            int r6 = r2 + 1
            K[] r0 = r5.keysArray
            r0 = r0[r2]
            int r0 = r5.m5138e(r0)
            int r1 = r5.maxProbeDistance
        L33:
            int[] r3 = r5.hashArray
            r4 = r3[r0]
            if (r4 != 0) goto L41
            r3[r0] = r6
            int[] r1 = r5.presenceArray
            r1[r2] = r0
            r2 = r6
            goto L23
        L41:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4f
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4d
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L33
        L4d:
            r0 = r4
            goto L33
        L4f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.m5139f(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5140g(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.keysArray
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r0, r1)
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.valuesArray
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.presenceArray
            r0 = r0[r12]
            int r1 = r11.maxProbeDistance
            int r1 = r1 * 2
            int[] r2 = r11.hashArray
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.hashArray
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.maxProbeDistance
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.hashArray
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.hashArray
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            K[] r5 = r11.keysArray
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m5138e(r5)
            int r5 = r5 - r0
            int[] r9 = r11.hashArray
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.presenceArray
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.hashArray
            r0[r1] = r6
        L6c:
            int[] r0 = r11.presenceArray
            r0[r12] = r6
            int r12 = r11.size()
            int r12 = r12 + r6
            r11.size = r12
            int r12 = r11.modCount
            int r12 = r12 + 1
            r11.modCount = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.m5140g(int):void");
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        int iM5136c = m5136c(key);
        if (iM5136c < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        AbstractC5830k.m5327d(vArr);
        return vArr[iM5136c];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        C5464h c5464h = this.entriesView;
        if (c5464h != null) {
            return c5464h;
        }
        C5464h c5464h2 = new C5464h(this);
        this.entriesView = c5464h2;
        return c5464h2;
    }

    @NotNull
    public Set<K> getKeys() {
        C5465i c5465i = this.keysView;
        if (c5465i != null) {
            return c5465i;
        }
        C5465i c5465i2 = new C5465i(this);
        this.keysView = c5465i2;
        return c5465i2;
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> getValues() {
        C5466j c5466j = this.valuesView;
        if (c5466j != null) {
            return c5466j;
        }
        C5466j c5466j2 = new C5466j(this);
        this.valuesView = c5466j2;
        return c5466j2;
    }

    @Override // java.util.Map
    public int hashCode() {
        C5459c c5459cEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c5459cEntriesIterator$kotlin_stdlib.hasNext()) {
            int i8 = c5459cEntriesIterator$kotlin_stdlib.f8432b;
            MapBuilder mapBuilder = c5459cEntriesIterator$kotlin_stdlib.f8431a;
            if (i8 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i9 = c5459cEntriesIterator$kotlin_stdlib.f8432b;
            c5459cEntriesIterator$kotlin_stdlib.f8432b = i9 + 1;
            c5459cEntriesIterator$kotlin_stdlib.f8433c = i9;
            Object obj = mapBuilder.keysArray[c5459cEntriesIterator$kotlin_stdlib.f8433c];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.valuesArray;
            AbstractC5830k.m5327d(objArr);
            Object obj2 = objArr[c5459cEntriesIterator$kotlin_stdlib.f8433c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c5459cEntriesIterator$kotlin_stdlib.m4824b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final C5462f keysIterator$kotlin_stdlib() {
        return new C5462f(this);
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] vArr = this.valuesArray;
        if (vArr == null) {
            int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
            if (capacity$kotlin_stdlib < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[capacity$kotlin_stdlib];
            this.valuesArray = vArr;
        }
        if (iAddKey$kotlin_stdlib >= 0) {
            vArr[iAddKey$kotlin_stdlib] = value;
            return null;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        V v2 = vArr[i];
        vArr[i] = value;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        AbstractC5830k.m5330g(from, "from");
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m5135b(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            V[] vArr = this.valuesArray;
            if (vArr == null) {
                int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
                if (capacity$kotlin_stdlib < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[capacity$kotlin_stdlib];
                this.valuesArray = vArr;
            }
            if (iAddKey$kotlin_stdlib >= 0) {
                vArr[iAddKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i = (-iAddKey$kotlin_stdlib) - 1;
                if (!AbstractC5830k.m5325b(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        checkIsMutable$kotlin_stdlib();
        int iM5136c = m5136c(key);
        if (iM5136c < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        AbstractC5830k.m5327d(vArr);
        V v2 = vArr[iM5136c];
        m5140g(iM5136c);
        return v2;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        AbstractC5830k.m5330g(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iM5136c = m5136c(entry.getKey());
        if (iM5136c < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        AbstractC5830k.m5327d(vArr);
        if (!AbstractC5830k.m5325b(vArr[iM5136c], entry.getValue())) {
            return false;
        }
        m5140g(iM5136c);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int iM5136c = m5136c(key);
        if (iM5136c < 0) {
            return false;
        }
        m5140g(iM5136c);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int iM5137d = m5137d(element);
        if (iM5137d < 0) {
            return false;
        }
        m5140g(iM5137d);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C5459c c5459cEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c5459cEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i8 = c5459cEntriesIterator$kotlin_stdlib.f8432b;
            MapBuilder mapBuilder = c5459cEntriesIterator$kotlin_stdlib.f8431a;
            if (i8 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i9 = c5459cEntriesIterator$kotlin_stdlib.f8432b;
            c5459cEntriesIterator$kotlin_stdlib.f8432b = i9 + 1;
            c5459cEntriesIterator$kotlin_stdlib.f8433c = i9;
            Object obj = mapBuilder.keysArray[c5459cEntriesIterator$kotlin_stdlib.f8433c];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.valuesArray;
            AbstractC5830k.m5327d(objArr);
            Object obj2 = objArr[c5459cEntriesIterator$kotlin_stdlib.f8433c];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c5459cEntriesIterator$kotlin_stdlib.m4824b();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final C5463g valuesIterator$kotlin_stdlib() {
        return new C5463g(this);
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        Companion.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[iHighestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
