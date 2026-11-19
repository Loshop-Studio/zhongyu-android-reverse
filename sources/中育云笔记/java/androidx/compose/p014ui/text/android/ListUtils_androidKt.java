package androidx.compose.p014ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, InterfaceC9540l interfaceC9540l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9540l.invoke(list.get(i10));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c10, InterfaceC9540l interfaceC9540l) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(interfaceC9540l.invoke(list.get(i10)));
        }
        return c10;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, InterfaceC9544p interfaceC9544p) {
        if (list.size() <= 1) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        T t10 = list.get(0);
        int iM24138p = AbstractC10978w.m24138p(list);
        while (i10 < iM24138p) {
            i10++;
            T t11 = list.get(i10);
            arrayList.add(interfaceC9544p.invoke(t10, t11));
            t10 = t11;
        }
        return arrayList;
    }
}
