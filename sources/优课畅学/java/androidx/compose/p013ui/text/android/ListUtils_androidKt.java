package androidx.compose.p013ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(list.get(i10));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c10, InterfaceC10570l interfaceC10570l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(interfaceC10570l.invoke(list.get(i10)));
        }
        return c10;
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
}
