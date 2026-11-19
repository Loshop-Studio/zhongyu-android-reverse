package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.AbstractC5783d0;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;

@Metadata(m5109d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\u001a*\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0007\u001a,\u0010\t\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\t\u0010\u0007\u001a(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u000b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u000f\u001a(\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0007\u001a8\u0010\u0014\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0017\u001a \u0010\u0018\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a0\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0007\u001a \u0010 \u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b \u0010!\u001a \u0010\"\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a(\u0010$\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b$\u0010%\u001a(\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b¢\u0006\u0004\b&\u0010'\u001a0\u0010(\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a(\u0010*\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b*\u0010+\u001a(\u0010,\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b,\u0010-\u001a(\u0010.\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b.\u0010/\u001a(\u00100\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b0\u00101\u001a \u00102\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b2\u0010\u0019\u001a0\u00103\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b3\u0010\u001b\u001a \u00105\u001a\u000204\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b5\u00106\u001a(\u00108\u001a\u00020\u000e\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b8\u0010/\u001a0\u00109\u001a\u00020\n\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b9\u0010\u001b\u001a4\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b:\u0010;\u001a0\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b<\u0010\u0007\u001a9\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a \u0010@\u001a\u00020\u000e\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b@\u0010#\u001a/\u0010A\u001a\u00020\u000e\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\bA\u0010\u000f\u001a[\u0010F\u001a\u00020\n\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010E\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0BH\u0086\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a\u001d\u0010I\u001a\u00020H\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bI\u0010J\u001a#\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000K\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"(\u0010R\u001a\u00020\u0010\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\f\u0012\u0004\bQ\u0010\u0019\u001a\u0004\bP\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, m5110d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/LongSparseArray;", "", "key", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "", "commonGetInternal", "Ld6/s;", "commonRemove", "(Landroidx/collection/LongSparseArray;J)V", "value", "", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "", "index", "commonRemoveAt", "(Landroidx/collection/LongSparseArray;I)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonGc", "(Landroidx/collection/LongSparseArray;)V", "commonPut", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/LongSparseArray;)I", "commonIsEmpty", "(Landroidx/collection/LongSparseArray;)Z", "commonKeyAt", "(Landroidx/collection/LongSparseArray;I)J", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonIndexOfKey", "(Landroidx/collection/LongSparseArray;J)I", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/LongSparseArray;J)Z", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "(Landroidx/collection/LongSparseArray;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "contains", "set", "plus", "(Landroidx/collection/LongSparseArray;Landroidx/collection/LongSparseArray;)Landroidx/collection/LongSparseArray;", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/LongSparseArray;JLr6/a;)Ljava/lang/Object;", "isNotEmpty", "remove", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "action", "forEach", "(Landroidx/collection/LongSparseArray;Lr6/e;)V", "Lkotlin/collections/d0;", "keyIterator", "(Landroidx/collection/LongSparseArray;)Lkotlin/collections/d0;", "", "valueIterator", "(Landroidx/collection/LongSparseArray;)Ljava/util/Iterator;", "DELETED", "Ljava/lang/Object;", "getSize", "getSize$annotations", "size", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,573:1\n229#1,5:574\n229#1,5:579\n299#1,18:584\n299#1,18:603\n299#1,18:626\n299#1,18:649\n299#1,18:672\n299#1,18:690\n299#1,18:708\n299#1,18:726\n1#2:602\n59#3,5:621\n59#3,5:644\n59#3,5:667\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n218#1:574,5\n223#1:579,5\n331#1:584,18\n374#1:603,18\n389#1:626,18\n401#1:649,18\n414#1:672,18\n422#1:690,18\n430#1:708,18\n468#1:726,18\n384#1:621,5\n396#1:644,5\n409#1:667,5\n*E\n"})
/* loaded from: classes.dex */
public final class LongSparseArrayKt {

    @NotNull
    private static final Object DELETED = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m5109d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m5110d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1 */
    public static final class C05631<T> implements Iterator<T>, InterfaceC6560a {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C05631(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }
    }

    public static final <E> void commonAppend(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        if (i != 0 && j7 <= longSparseArray.keys[i - 1]) {
            longSparseArray.put(j7, e);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i8 = 0;
                for (int i9 = 0; i9 < i; i9++) {
                    Object obj = objArr[i9];
                    if (obj != DELETED) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i8;
            }
        }
        int i10 = longSparseArray.size;
        if (i10 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i10 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i10] = j7;
        longSparseArray.values[i10] = e;
        longSparseArray.size = i10 + 1;
    }

    public static final <E> void commonClear(@NotNull LongSparseArray<E> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@NotNull LongSparseArray<E> longSparseArray, long j7) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j7) >= 0;
    }

    public static final <E> boolean commonContainsValue(@NotNull LongSparseArray<E> longSparseArray, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e) >= 0;
    }

    public static final <E> void commonGc(@NotNull LongSparseArray<E> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int i = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (obj != DELETED) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i8;
    }

    @Nullable
    public static final <E> E commonGet(@NotNull LongSparseArray<E> longSparseArray, long j7) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[iBinarySearch];
    }

    @Nullable
    public static final Object commonGetInternal(@NotNull LongSparseArray<?> longSparseArray, long j7, @Nullable Object obj) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? obj : longSparseArray.values[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(@NotNull LongSparseArray<E> longSparseArray, long j7) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != DELETED) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i8;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
    }

    public static final <E> int commonIndexOfValue(@NotNull LongSparseArray<E> longSparseArray, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != DELETED) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i8;
        }
        int i10 = longSparseArray.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (longSparseArray.values[i11] == e) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@NotNull LongSparseArray<E> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(@NotNull LongSparseArray<E> longSparseArray, int i) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (!(i >= 0 && i < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        return longSparseArray.keys[i];
    }

    public static final <E> void commonPut(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        if (i < longSparseArray.size && longSparseArray.values[i] == DELETED) {
            longSparseArray.keys[i] = j7;
            longSparseArray.values[i] = e;
            return;
        }
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i8 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != DELETED) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i9;
                i = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i9, j7);
            }
        }
        int i11 = longSparseArray.size;
        if (i11 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        int i12 = longSparseArray.size;
        if (i12 - i != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i13 = i + 1;
            AbstractC5802q.m5177D(jArr2, jArr2, i13, i, i12);
            Object[] objArr2 = longSparseArray.values;
            AbstractC5802q.m5178E(objArr2, objArr2, i13, i, longSparseArray.size);
        }
        longSparseArray.keys[i] = j7;
        longSparseArray.values[i] = e;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(@NotNull LongSparseArray<E> longSparseArray, @NotNull LongSparseArray<? extends E> other) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        AbstractC5830k.m5330g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(other.keyAt(i), other.valueAt(i));
        }
    }

    @Nullable
    public static final <E> E commonPutIfAbsent(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        E e4 = longSparseArray.get(j7);
        if (e4 == null) {
            longSparseArray.put(j7, e);
        }
        return e4;
    }

    public static final <E> void commonRemove(@NotNull LongSparseArray<E> longSparseArray, long j7) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[iBinarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(@NotNull LongSparseArray<E> longSparseArray, int i) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (longSparseArray.values[i] != DELETED) {
            longSparseArray.values[i] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    @Nullable
    public static final <E> E commonReplace(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j7);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e4 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e4;
    }

    public static final <E> void commonSetValueAt(@NotNull LongSparseArray<E> longSparseArray, int i, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (!(i >= 0 && i < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        longSparseArray.values[i] = e;
    }

    public static final <E> int commonSize(@NotNull LongSparseArray<E> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != DELETED) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i8;
        }
        return longSparseArray.size;
    }

    @NotNull
    public static final <E> String commonToString(@NotNull LongSparseArray<E> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append('{');
        int i = longSparseArray.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i8));
            sb.append('=');
            E eValueAt = longSparseArray.valueAt(i8);
            if (eValueAt != sb) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return AbstractC0037f.m80e('}', "toString(...)", sb);
    }

    public static final <E> E commonValueAt(@NotNull LongSparseArray<E> longSparseArray, int i) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        if (!(i >= 0 && i < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        return (E) longSparseArray.values[i];
    }

    public static final <T> boolean contains(@NotNull LongSparseArray<T> longSparseArray, long j7) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.containsKey(j7);
    }

    public static final <T> void forEach(@NotNull LongSparseArray<T> longSparseArray, @NotNull InterfaceC6473e action) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        AbstractC5830k.m5330g(action, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@NotNull LongSparseArray<T> longSparseArray, long j7, T t8) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.get(j7, t8);
    }

    public static final <T> T getOrElse(@NotNull LongSparseArray<T> longSparseArray, long j7, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        T t8 = longSparseArray.get(j7);
        return t8 == null ? (T) defaultValue.invoke() : t8;
    }

    public static final <T> int getSize(@NotNull LongSparseArray<T> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T> boolean isNotEmpty(@NotNull LongSparseArray<T> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    @NotNull
    public static final <T> AbstractC5783d0 keyIterator(@NotNull final LongSparseArray<T> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return new AbstractC5783d0() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.AbstractC5783d0
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @NotNull
    public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> other) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        AbstractC5830k.m5330g(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(other.size() + longSparseArray.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j7, Object obj) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return longSparseArray.remove(j7, obj);
    }

    public static final <T> void set(@NotNull LongSparseArray<T> longSparseArray, long j7, T t8) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        longSparseArray.put(j7, t8);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> longSparseArray) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        return new C05631(longSparseArray);
    }

    public static final <E> E commonGet(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j7);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? e : (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> boolean commonReplace(@NotNull LongSparseArray<E> longSparseArray, long j7, E e, E e4) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j7);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(longSparseArray.values[iIndexOfKey], e)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e4;
        return true;
    }

    public static final <E> boolean commonRemove(@NotNull LongSparseArray<E> longSparseArray, long j7, E e) {
        AbstractC5830k.m5330g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j7);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(e, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }
}
