package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class Stack<T> {
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m23685boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m23686clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m23687constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m23688constructorimpl$default(ArrayList arrayList, int i10, AbstractC9126n abstractC9126n) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m23687constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23689equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && AbstractC9133u.m16128b(arrayList, ((Stack) obj).m23701unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23690equalsimpl0(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return AbstractC9133u.m16128b(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m23691getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23692hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m23693isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m23694isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m23693isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m23695peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m23691getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m23697popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m23691getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m23698pushimpl(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m23699toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = arrayList.get(i10);
        }
        return tArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23700toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m23689equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m23692hashCodeimpl(this.backing);
    }

    public String toString() {
        return m23700toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m23701unboximpl() {
        return this.backing;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m23696peekimpl(ArrayList<T> arrayList, int i10) {
        return arrayList.get(i10);
    }
}
