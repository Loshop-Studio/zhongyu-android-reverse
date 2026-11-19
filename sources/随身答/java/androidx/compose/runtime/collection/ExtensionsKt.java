package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\b\u001a>\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001a\u001d\u0010\u000e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a>\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001aD\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001a\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¨\u0006\u0015"}, m13413d2 = {"all", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/ObjectList;", "predicate", "Lkotlin/Function1;", "fastFilter", "fastMap", "R", "transform", "isSorted", "K", "", "selector", "removeLast", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "sortBy", "", "sortedBy", "toMutableObjectList", "runtime_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n36#1:80\n37#1:87\n287#2,4:73\n292#2:79\n287#2,6:81\n287#2,4:88\n292#2:94\n287#2,6:95\n287#2,4:101\n292#2:107\n919#3,2:77\n919#3,2:92\n919#3,2:105\n1#4:108\n1002#5,2:109\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n*L\n29#1:80\n29#1:87\n24#1:73,4\n24#1:79\n29#1:81,6\n31#1:88,4\n31#1:94\n36#1:95,6\n42#1:101,4\n42#1:107\n24#1:77,2\n31#1:92,2\n42#1:105,2\n64#1:109,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(ObjectList<T> objectList, Function1<? super T, Boolean> function1) {
        Object[] objArr = objectList.content;
        int i9 = objectList._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (!function1.invoke(objArr[i10]).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> ObjectList<T> fastFilter(ObjectList<T> objectList, Function1<? super T, Boolean> function1) {
        Object[] objArr = objectList.content;
        int i9 = objectList._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (!function1.invoke(objArr[i10]).booleanValue()) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i11 = objectList._size;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object obj = objArr2[i12];
                    if (function1.invoke(obj).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    public static final <T, R> ObjectList<R> fastMap(ObjectList<T> objectList, Function1<? super T, ? extends R> function1) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i9 = objectList._size;
        for (int i10 = 0; i10 < i9; i10++) {
            mutableObjectList.add(function1.invoke(objArr[i10]));
        }
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        K kInvoke = function1.invoke(objectList.get(0));
        if (kInvoke == null) {
            return false;
        }
        int size = objectList.getSize();
        int i9 = 1;
        while (i9 < size) {
            K kInvoke2 = function1.invoke(objectList.get(i9));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i9++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T> T removeLast(MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t9 = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t9;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(MutableObjectList<T> mutableObjectList, final Function1<? super T, ? extends K> function1) {
        List<T> listAsMutableList = mutableObjectList.asMutableList();
        if (listAsMutableList.size() > 1) {
            CollectionsKt.sortWith(listAsMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t9, T t10) {
                    Function1 function12 = function1;
                    return ComparisonsKt.compareValues((Comparable) function12.invoke(t9), (Comparable) function12.invoke(t10));
                }
            });
        }
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (isSorted(objectList, function1)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, function1);
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> MutableObjectList<T> toMutableObjectList(ObjectList<T> objectList) {
        MutableObjectList<T> mutableObjectList = (MutableObjectList<T>) new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i9 = objectList._size;
        for (int i10 = 0; i10 < i9; i10++) {
            mutableObjectList.add(objArr[i10]);
        }
        return mutableObjectList;
    }
}
