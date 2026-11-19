package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5809x;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\t\u0010\u0006\u001a4\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001aE\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u000b\u001aE\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Landroidx/collection/ObjectList;", "Lkotlin/Function1;", "transform", "fastMap", "(Landroidx/collection/ObjectList;Lr6/c;)Landroidx/collection/ObjectList;", "", "predicate", "fastFilter", "all", "(Landroidx/collection/ObjectList;Lr6/c;)Z", "Landroidx/collection/MutableObjectList;", "toMutableObjectList", "(Landroidx/collection/ObjectList;)Landroidx/collection/MutableObjectList;", "", "K", "selector", "sortedBy", "isSorted", "Ld6/s;", "sortBy", "(Landroidx/collection/MutableObjectList;Lr6/c;)V", "removeLast", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n36#1:80\n37#1:87\n287#2,4:73\n292#2:79\n287#2,6:81\n287#2,4:88\n292#2:94\n287#2,6:95\n287#2,4:101\n292#2:107\n919#3,2:77\n919#3,2:92\n919#3,2:105\n1#4:108\n1002#5,2:109\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n*L\n29#1:80\n29#1:87\n24#1:73,4\n24#1:79\n29#1:81,6\n31#1:88,4\n31#1:94\n36#1:95,6\n42#1:101,4\n42#1:107\n24#1:77,2\n31#1:92,2\n42#1:105,2\n64#1:109,2\n*E\n"})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(@NotNull ObjectList<T> objectList, @NotNull InterfaceC6471c interfaceC6471c) {
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (!((Boolean) interfaceC6471c.invoke(objArr[i8])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> ObjectList<T> fastFilter(@NotNull ObjectList<T> objectList, @NotNull InterfaceC6471c interfaceC6471c) {
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (!((Boolean) interfaceC6471c.invoke(objArr[i8])).booleanValue()) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i9 = objectList._size;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object obj = objArr2[i10];
                    if (((Boolean) interfaceC6471c.invoke(obj)).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    @NotNull
    public static final <T, R> ObjectList<R> fastMap(@NotNull ObjectList<T> objectList, @NotNull InterfaceC6471c interfaceC6471c) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            mutableObjectList.add(interfaceC6471c.invoke(objArr[i8]));
        }
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(@NotNull ObjectList<T> objectList, @NotNull InterfaceC6471c interfaceC6471c) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) interfaceC6471c.invoke(objectList.get(0));
        if (comparable == null) {
            return false;
        }
        int size = objectList.getSize();
        int i = 1;
        while (i < size) {
            Comparable comparable2 = (Comparable) interfaceC6471c.invoke(objectList.get(i));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i++;
            comparable = comparable2;
        }
        return true;
    }

    public static final <T> T removeLast(@NotNull MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t8 = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t8;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(@NotNull MutableObjectList<T> mutableObjectList, @NotNull final InterfaceC6471c interfaceC6471c) {
        List<T> listAsMutableList = mutableObjectList.asMutableList();
        if (listAsMutableList.size() > 1) {
            AbstractC5809x.m5289Q(listAsMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t8, T t9) {
                    InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                    return AbstractC6768a.m6441f((Comparable) interfaceC6471c2.invoke(t8), (Comparable) interfaceC6471c2.invoke(t9));
                }
            });
        }
    }

    @NotNull
    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(@NotNull ObjectList<T> objectList, @NotNull InterfaceC6471c interfaceC6471c) {
        if (isSorted(objectList, interfaceC6471c)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, interfaceC6471c);
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> MutableObjectList<T> toMutableObjectList(@NotNull ObjectList<T> objectList) {
        MutableObjectList<T> mutableObjectList = (MutableObjectList<T>) new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i8 = 0; i8 < i; i8++) {
            mutableObjectList.add(objArr[i8]);
        }
        return mutableObjectList;
    }
}
