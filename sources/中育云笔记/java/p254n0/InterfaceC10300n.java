package p254n0;

import com.bumptech.glide.load.data.InterfaceC5824d;
import java.util.Collections;
import java.util.List;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;

/* renamed from: n0.n */
/* loaded from: classes3.dex */
public interface InterfaceC10300n {

    /* renamed from: n0.n$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC9435b f24542a;

        /* renamed from: b */
        public final List f24543b;

        /* renamed from: c */
        public final InterfaceC5824d f24544c;

        public a(InterfaceC9435b interfaceC9435b, InterfaceC5824d interfaceC5824d) {
            this(interfaceC9435b, Collections.EMPTY_LIST, interfaceC5824d);
        }

        public a(InterfaceC9435b interfaceC9435b, List list, InterfaceC5824d interfaceC5824d) {
            this.f24542a = (InterfaceC9435b) AbstractC8909j.m17468d(interfaceC9435b);
            this.f24543b = (List) AbstractC8909j.m17468d(list);
            this.f24544c = (InterfaceC5824d) AbstractC8909j.m17468d(interfaceC5824d);
        }
    }

    /* renamed from: a */
    boolean mo21420a(Object obj);

    /* renamed from: b */
    a mo21421b(Object obj, int i10, int i11, C9438e c9438e);
}
