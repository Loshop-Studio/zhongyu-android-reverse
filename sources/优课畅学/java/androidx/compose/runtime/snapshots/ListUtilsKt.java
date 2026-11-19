package androidx.compose.runtime.snapshots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, InterfaceC10574p interfaceC10574p) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) interfaceC10574p.invoke(Integer.valueOf(i10), t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
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

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            Object objInvoke = interfaceC10570l.invoke(t10);
            Object arrayList = map.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(objInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t10);
        }
        return map;
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

    public static final <T, R> List<R> fastMap(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(interfaceC10570l.invoke(list.get(i10)));
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

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
