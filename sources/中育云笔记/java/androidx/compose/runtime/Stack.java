package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class Stack<T> {
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m30287boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m30288clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m30289constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m30290constructorimpl$default(ArrayList arrayList, int i10, AbstractC9972n abstractC9972n) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m30289constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30291equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && AbstractC9979u.m20289b(arrayList, ((Stack) obj).m30303unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30292equalsimpl0(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return AbstractC9979u.m20289b(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m30293getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30294hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m30295isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m30296isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m30295isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m30297peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m30293getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m30299popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m30293getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m30300pushimpl(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m30301toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = arrayList.get(i10);
        }
        return tArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30302toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m30291equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m30294hashCodeimpl(this.backing);
    }

    public String toString() {
        return m30302toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m30303unboximpl() {
        return this.backing;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m30298peekimpl(ArrayList<T> arrayList, int i10) {
        return arrayList.get(i10);
    }
}
