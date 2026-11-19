package p097l0;

import com.bumptech.glide.load.data.InterfaceC4692d;
import java.util.Collections;
import java.util.List;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;

/* renamed from: l0.n */
/* loaded from: classes3.dex */
public interface InterfaceC7280n {

    /* renamed from: l0.n$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC6283b f9230a;

        /* renamed from: b */
        public final List f9231b;

        /* renamed from: c */
        public final InterfaceC4692d f9232c;

        public a(InterfaceC6283b interfaceC6283b, InterfaceC4692d interfaceC4692d) {
            this(interfaceC6283b, Collections.EMPTY_LIST, interfaceC4692d);
        }

        public a(InterfaceC6283b interfaceC6283b, List list, InterfaceC4692d interfaceC4692d) {
            this.f9230a = (InterfaceC6283b) AbstractC4408j.m1438d(interfaceC6283b);
            this.f9231b = (List) AbstractC4408j.m1438d(list);
            this.f9232c = (InterfaceC4692d) AbstractC4408j.m1438d(interfaceC4692d);
        }
    }

    /* renamed from: a */
    boolean mo8190a(Object obj);

    /* renamed from: b */
    a mo8191b(Object obj, int i6, int i7, C6285d c6285d);
}
