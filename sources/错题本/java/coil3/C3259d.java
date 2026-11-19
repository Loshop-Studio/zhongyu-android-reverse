package coil3;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

/* renamed from: coil3.d */
/* loaded from: classes2.dex */
public final class C3259d {

    /* renamed from: a */
    public final List f1881a;

    /* renamed from: b */
    public final List f1882b;

    /* renamed from: c */
    public final List f1883c;

    /* renamed from: d */
    public List f1884d;

    /* renamed from: e */
    public List f1885e;

    /* renamed from: f */
    public final InterfaceC5429e f1886f;

    /* renamed from: g */
    public final InterfaceC5429e f1887g;

    public C3259d(List list, List list2, List list3, List list4, List list5) {
        this.f1881a = list;
        this.f1882b = list2;
        this.f1883c = list3;
        this.f1884d = list4;
        this.f1885e = list5;
        final int i = 0;
        this.f1886f = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: coil3.b

            /* renamed from: b */
            public final /* synthetic */ C3259d f1815b;

            {
                this.f1815b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C3259d c3259d = this.f1815b;
                        List list6 = c3259d.f1884d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            AbstractC5810y.m5291S((List) ((InterfaceC6469a) list6.get(i8)).invoke(), arrayList);
                        }
                        c3259d.f1884d = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        C3259d c3259d2 = this.f1815b;
                        List list7 = c3259d2.f1885e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            AbstractC5810y.m5291S((List) ((InterfaceC6469a) list7.get(i9)).invoke(), arrayList2);
                        }
                        c3259d2.f1885e = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
        final int i8 = 1;
        this.f1887g = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: coil3.b

            /* renamed from: b */
            public final /* synthetic */ C3259d f1815b;

            {
                this.f1815b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        C3259d c3259d = this.f1815b;
                        List list6 = c3259d.f1884d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i82 = 0; i82 < size; i82++) {
                            AbstractC5810y.m5291S((List) ((InterfaceC6469a) list6.get(i82)).invoke(), arrayList);
                        }
                        c3259d.f1884d = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        C3259d c3259d2 = this.f1815b;
                        List list7 = c3259d2.f1885e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            AbstractC5810y.m5291S((List) ((InterfaceC6469a) list7.get(i9)).invoke(), arrayList2);
                        }
                        c3259d2.f1885e = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
    }
}
