package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a<\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a2\u0010\u000b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\b\u000b\u0010\u0010\u001a(\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0012\u0010\f\u001a0\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0007\u001a8\u0010\u0016\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a0\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a0\u0010\u001f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a2\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0007\u001a \u0010\"\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a \u0010$\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b$\u0010%\u001a(\u0010&\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b&\u0010'\u001a(\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010\t\u001a0\u0010)\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u001d\u001a(\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b*\u0010'\u001a(\u0010+\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b+\u0010,\u001a(\u0010-\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010.\u001a(\u0010/\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b/\u00100\u001a \u00101\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u001a0\u00102\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b2\u0010\u001d\u001a \u00104\u001a\u000203\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m5110d2 = {ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/SparseArrayCompat;", "", "key", "defaultValue", "internalGet", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "Ld6/s;", "commonRemove", "(Landroidx/collection/SparseArrayCompat;I)V", "", "value", "", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "index", "commonRemoveAt", "size", "commonRemoveAtRange", "(Landroidx/collection/SparseArrayCompat;II)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "gc", "(Landroidx/collection/SparseArrayCompat;)V", "commonPut", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/SparseArrayCompat;Landroidx/collection/SparseArrayCompat;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/SparseArrayCompat;)I", "commonIsEmpty", "(Landroidx/collection/SparseArrayCompat;)Z", "commonKeyAt", "(Landroidx/collection/SparseArrayCompat;I)I", "commonValueAt", "commonSetValueAt", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/SparseArrayCompat;I)Z", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "(Landroidx/collection/SparseArrayCompat;)Ljava/lang/String;", "DELETED", "Ljava/lang/Object;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 2 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,498:1\n217#1,6:499\n217#1,6:505\n327#1,30:511\n327#1,30:541\n422#1,9:572\n24#2:571\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n229#1:499,6\n235#1:505,6\n361#1:511,30\n369#1:541,30\n440#1:572,9\n399#1:571\n*E\n"})
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {

    @NotNull
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int i8 = sparseArrayCompat.size;
        if (i8 != 0 && i <= sparseArrayCompat.keys[i8 - 1]) {
            sparseArrayCompat.put(i, e);
            return;
        }
        if (sparseArrayCompat.garbage && i8 >= sparseArrayCompat.keys.length) {
            m895gc(sparseArrayCompat);
        }
        int i9 = sparseArrayCompat.size;
        if (i9 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i9 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i9] = i;
        sparseArrayCompat.values[i9] = e;
        sparseArrayCompat.size = i9 + 1;
    }

    public static final <E> void commonClear(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int i = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i) >= 0;
    }

    public static final <E> boolean commonContainsValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        int i8 = 0;
        while (true) {
            if (i8 >= i) {
                i8 = -1;
                break;
            }
            if (sparseArrayCompat.values[i8] == e) {
                break;
            }
            i8++;
        }
        return i8 >= 0;
    }

    @Nullable
    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        E e;
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch < 0 || (e = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e;
    }

    public static final <E> int commonIndexOfKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
    }

    public static final <E> int commonIndexOfValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (sparseArrayCompat.values[i8] == e) {
                return i8;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i];
    }

    public static final <E> void commonPut(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e;
            return;
        }
        int i8 = ~iBinarySearch;
        if (i8 < sparseArrayCompat.size && sparseArrayCompat.values[i8] == DELETED) {
            sparseArrayCompat.keys[i8] = i;
            sparseArrayCompat.values[i8] = e;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            m895gc(sparseArrayCompat);
            i8 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        }
        int i9 = sparseArrayCompat.size;
        if (i9 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i9 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i10 = sparseArrayCompat.size;
        if (i10 - i8 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i11 = i8 + 1;
            AbstractC5802q.m5212y(i11, i8, iArr, iArr, i10);
            Object[] objArr = sparseArrayCompat.values;
            AbstractC5802q.m5178E(objArr, objArr, i11, i8, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i8] = i;
        sparseArrayCompat.values[i8] = e;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(@NotNull SparseArrayCompat<E> sparseArrayCompat, @NotNull SparseArrayCompat<? extends E> other) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        AbstractC5830k.m5330g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = other.keyAt(i);
            E eValueAt = other.valueAt(i);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i8 = ~iBinarySearch;
                if (i8 >= sparseArrayCompat.size || sparseArrayCompat.values[i8] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        m895gc(sparseArrayCompat);
                        i8 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i9 = sparseArrayCompat.size;
                    if (i9 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i9 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i10 = sparseArrayCompat.size;
                    if (i10 - i8 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i11 = i8 + 1;
                        AbstractC5802q.m5212y(i11, i8, iArr, iArr, i10);
                        Object[] objArr = sparseArrayCompat.values;
                        AbstractC5802q.m5178E(objArr, objArr, i11, i8, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i8] = iKeyAt;
                    sparseArrayCompat.values[i8] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i8] = iKeyAt;
                    sparseArrayCompat.values[i8] = eValueAt;
                }
            }
        }
    }

    @Nullable
    public static final <E> E commonPutIfAbsent(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        E e4 = (E) commonGet(sparseArrayCompat, i);
        if (e4 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e;
                return e4;
            }
            int i8 = ~iBinarySearch;
            if (i8 < sparseArrayCompat.size && sparseArrayCompat.values[i8] == DELETED) {
                sparseArrayCompat.keys[i8] = i;
                sparseArrayCompat.values[i8] = e;
                return e4;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                m895gc(sparseArrayCompat);
                i8 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            }
            int i9 = sparseArrayCompat.size;
            if (i9 >= sparseArrayCompat.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i9 + 1);
                int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i10 = sparseArrayCompat.size;
            if (i10 - i8 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i11 = i8 + 1;
                AbstractC5802q.m5212y(i11, i8, iArr, iArr, i10);
                Object[] objArr = sparseArrayCompat.values;
                AbstractC5802q.m5178E(objArr, objArr, i11, i8, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i8] = i;
            sparseArrayCompat.values[i8] = e;
            sparseArrayCompat.size++;
        }
        return e4;
    }

    public static final <E> void commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i] != DELETED) {
            sparseArrayCompat.values[i] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, int i8) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iMin = Math.min(i8, i + i8);
        while (i < iMin) {
            sparseArrayCompat.removeAt(i);
            i++;
        }
    }

    @Nullable
    public static final <E> E commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e4 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e4;
    }

    public static final <E> void commonSetValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i] = e;
    }

    public static final <E> int commonSize(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    @NotNull
    public static final <E> String commonToString(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i = sparseArrayCompat.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i8));
            sb.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i8);
            if (eValueAt != sparseArrayCompat) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return AbstractC0037f.m80e('}', "toString(...)", sb);
    }

    public static final <E> E commonValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m895gc(sparseArrayCompat);
        }
        Object[] objArr = sparseArrayCompat.values;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gc */
    public static final <E> void m895gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (obj != DELETED) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i8;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i, T t8) {
        T t9;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (iBinarySearch < 0 || (t9 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t8 : t9;
    }

    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        E e4;
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (iBinarySearch < 0 || (e4 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e : e4;
    }

    public static final <E> boolean commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, E e, E e4) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(sparseArrayCompat.values[iIndexOfKey], e)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e4;
        return true;
    }

    public static final <E> boolean commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i, @Nullable Object obj) {
        AbstractC5830k.m5330g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
