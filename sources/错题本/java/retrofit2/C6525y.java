package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: retrofit2.y */
/* loaded from: classes4.dex */
public final class C6525y extends AbstractC6522v {

    /* renamed from: d */
    public final /* synthetic */ int f10809d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6522v f10810e;

    public /* synthetic */ C6525y(AbstractC6522v abstractC6522v, int i) {
        this.f10809d = i;
        this.f10810e = abstractC6522v;
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        switch (this.f10809d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f10810e.mo6137a(c6503k0, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f10810e.mo6137a(c6503k0, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
