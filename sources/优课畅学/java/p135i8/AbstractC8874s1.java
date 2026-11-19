package p135i8;

import kotlinx.coroutines.InterfaceC9212n;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p202o8.AbstractC9545b;
import p300x7.InterfaceC10574p;

/* renamed from: i8.s1 */
/* loaded from: classes5.dex */
public abstract class AbstractC8874s1 {
    /* renamed from: a */
    public static final InterfaceC8878u m14909a(InterfaceC9212n interfaceC9212n) {
        return new C8871r1(interfaceC9212n);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8878u m14910b(InterfaceC9212n interfaceC9212n, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9212n = null;
        }
        return m14909a(interfaceC9212n);
    }

    /* renamed from: c */
    public static final Object m14911c(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        C8868q1 c8868q1 = new C8868q1(interfaceC9324c.getContext(), interfaceC9324c);
        Object objM17820b = AbstractC9545b.m17820b(c8868q1, c8868q1, interfaceC10574p);
        if (objM17820b == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17820b;
    }
}
