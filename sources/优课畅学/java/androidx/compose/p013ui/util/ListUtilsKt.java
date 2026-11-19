package androidx.compose.p013ui.util;

import androidx.collection.MutableScatterSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t10, InterfaceC10570l interfaceC10570l) throws IOException {
        if (interfaceC10570l != null) {
            appendable.append((CharSequence) interfaceC10570l.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((Boolean) interfaceC10570l.invoke(list.get(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) interfaceC10570l.invoke(list.get(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (mutableScatterSet.add(interfaceC10570l.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> list, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                arrayList.add(interfaceC10570l2.invoke(t10));
            }
        }
        return arrayList;
    }

    public static final <T> T fastFirst(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC8768a0.m14481C(arrayList, (Iterable) interfaceC10570l.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r10, InterfaceC10574p interfaceC10574p) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) interfaceC10574p.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> void fastForEach(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(list.get(i10));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10574p.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            interfaceC10570l.invoke(list.get(size));
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            appendElement(a10, t10, interfaceC10570l);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC10570l)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC10570l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }

    public static final <T> T fastLastOrNull(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i10 = size - 1;
            T t10 = list.get(size);
            if (((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            size = i10;
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(interfaceC10570l.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(interfaceC10574p.invoke(Integer.valueOf(i10), list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objInvoke = interfaceC10574p.invoke(Integer.valueOf(i10), list.get(i10));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objInvoke = interfaceC10570l.invoke(list.get(i10));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c10, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(interfaceC10570l.invoke(list.get(i10)));
        }
        return c10;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        Comparable comparable = (Comparable) interfaceC10570l.invoke(t10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i10 = 1;
        if (1 <= iM14773p) {
            while (true) {
                T t11 = list.get(i10);
                Comparable comparable2 = (Comparable) interfaceC10570l.invoke(t11);
                if (comparable.compareTo(comparable2) < 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> list, R r10, InterfaceC10570l interfaceC10570l) {
        if (list.isEmpty()) {
            return r10;
        }
        R r11 = (R) interfaceC10570l.invoke(list.get(0));
        int iM14773p = AbstractC8809v.m14773p(list);
        int i10 = 1;
        if (1 <= iM14773p) {
            while (true) {
                Comparable comparable = (Comparable) interfaceC10570l.invoke(list.get(i10));
                if (comparable.compareTo(r11) > 0) {
                    r11 = comparable;
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        if (list.isEmpty()) {
            return null;
        }
        R r10 = (R) interfaceC10570l.invoke(list.get(0));
        int iM14773p = AbstractC8809v.m14773p(list);
        int i10 = 1;
        if (1 <= iM14773p) {
            while (true) {
                Comparable comparable = (Comparable) interfaceC10570l.invoke(list.get(i10));
                if (comparable.compareTo(r10) > 0) {
                    r10 = comparable;
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        Comparable comparable = (Comparable) interfaceC10570l.invoke(t10);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i10 = 1;
        if (1 <= iM14773p) {
            while (true) {
                T t11 = list.get(i10);
                Comparable comparable2 = (Comparable) interfaceC10570l.invoke(t11);
                if (comparable.compareTo(comparable2) > 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s10 = (S) AbstractC8778f0.m14566l0(list);
        int iM14773p = AbstractC8809v.m14773p(list);
        int i10 = 1;
        if (1 <= iM14773p) {
            while (true) {
                s10 = (S) interfaceC10574p.invoke(s10, list.get(i10));
                if (i10 == iM14773p) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    public static final <T> int fastSumBy(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        int iIntValue = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iIntValue += ((Number) interfaceC10570l.invoke(list.get(i10))).intValue();
        }
        return iIntValue;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, InterfaceC10574p interfaceC10574p) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(interfaceC10574p.invoke(list.get(i10), list2.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        if (list.size() <= 1) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        T t10 = list.get(0);
        int iM14773p = AbstractC8809v.m14773p(list);
        while (i10 < iM14773p) {
            i10++;
            T t11 = list.get(i10);
            arrayList.add(interfaceC10574p.invoke(t10, t11));
            t10 = t11;
        }
        return arrayList;
    }

    public static final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }
}
