package p226r;

import com.bumptech.glide.load.data.InterfaceC5405d;
import java.util.Collections;
import java.util.List;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p160l.InterfaceC9228b;

/* renamed from: r.n */
/* loaded from: classes3.dex */
public interface InterfaceC9888n {

    /* renamed from: r.n$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC9228b f19819a;

        /* renamed from: b */
        public final List f19820b;

        /* renamed from: c */
        public final InterfaceC5405d f19821c;

        public a(InterfaceC9228b interfaceC9228b, InterfaceC5405d interfaceC5405d) {
            this(interfaceC9228b, Collections.EMPTY_LIST, interfaceC5405d);
        }

        public a(InterfaceC9228b interfaceC9228b, List list, InterfaceC5405d interfaceC5405d) {
            this.f19819a = (InterfaceC9228b) AbstractC8706j.m14181d(interfaceC9228b);
            this.f19820b = (List) AbstractC8706j.m14181d(list);
            this.f19821c = (InterfaceC5405d) AbstractC8706j.m14181d(interfaceC5405d);
        }
    }

    /* renamed from: a */
    boolean mo18445a(Object obj);

    /* renamed from: b */
    a mo18446b(Object obj, int i10, int i11, C9230d c9230d);
}
