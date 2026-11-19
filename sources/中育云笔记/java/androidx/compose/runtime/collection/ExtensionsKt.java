package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10935a0;
import p364uc.AbstractC11382b;

/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final <T> boolean all(ObjectList<T> objectList, InterfaceC9540l interfaceC9540l) {
        Object[] objArr = objectList.content;
        int i10 = objectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!((Boolean) interfaceC9540l.invoke(objArr[i11])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> ObjectList<T> fastFilter(ObjectList<T> objectList, InterfaceC9540l interfaceC9540l) {
        Object[] objArr = objectList.content;
        int i10 = objectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!((Boolean) interfaceC9540l.invoke(objArr[i11])).booleanValue()) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i12 = objectList._size;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object obj = objArr2[i13];
                    if (((Boolean) interfaceC9540l.invoke(obj)).booleanValue()) {
                        mutableObjectList.add(obj);
                    }
                }
                return mutableObjectList;
            }
        }
        return objectList;
    }

    public static final <T, R> ObjectList<R> fastMap(ObjectList<T> objectList, InterfaceC9540l interfaceC9540l) {
        MutableObjectList mutableObjectList = new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i10 = objectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            mutableObjectList.add(interfaceC9540l.invoke(objArr[i11]));
        }
        return mutableObjectList;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(ObjectList<T> objectList, InterfaceC9540l interfaceC9540l) {
        if (objectList.getSize() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) interfaceC9540l.invoke(objectList.get(0));
        if (comparable == null) {
            return false;
        }
        int size = objectList.getSize();
        int i10 = 1;
        while (i10 < size) {
            Comparable comparable2 = (Comparable) interfaceC9540l.invoke(objectList.get(i10));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i10++;
            comparable = comparable2;
        }
        return true;
    }

    public static final <T> T removeLast(MutableObjectList<T> mutableObjectList) {
        if (mutableObjectList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = mutableObjectList.getSize() - 1;
        T t10 = mutableObjectList.get(size);
        mutableObjectList.removeAt(size);
        return t10;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(MutableObjectList<T> mutableObjectList, final InterfaceC9540l interfaceC9540l) {
        List<T> listAsMutableList = mutableObjectList.asMutableList();
        if (listAsMutableList.size() > 1) {
            AbstractC10935a0.m23853A(listAsMutableList, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
                    return AbstractC11382b.m25330d((Comparable) interfaceC9540l2.invoke(t10), (Comparable) interfaceC9540l2.invoke(t11));
                }
            });
        }
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(ObjectList<T> objectList, InterfaceC9540l interfaceC9540l) {
        if (isSorted(objectList, interfaceC9540l)) {
            return objectList;
        }
        MutableObjectList mutableObjectList = toMutableObjectList(objectList);
        sortBy(mutableObjectList, interfaceC9540l);
        return mutableObjectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> MutableObjectList<T> toMutableObjectList(ObjectList<T> objectList) {
        MutableObjectList<T> mutableObjectList = (MutableObjectList<T>) new MutableObjectList(objectList.getSize());
        Object[] objArr = objectList.content;
        int i10 = objectList._size;
        for (int i11 = 0; i11 < i10; i11++) {
            mutableObjectList.add(objArr[i11]);
        }
        return mutableObjectList;
    }
}
