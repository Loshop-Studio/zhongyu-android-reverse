package p191n8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9437b extends AbstractC9470w {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18642a = AtomicReferenceFieldUpdater.newUpdater(AbstractC9437b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC9435a.f18639a;

    @Override // p191n8.AbstractC9470w
    /* renamed from: a */
    public final Object mo17298a(Object obj) {
        Object objM17299c = f18642a.get(this);
        if (objM17299c == AbstractC9435a.f18639a) {
            objM17299c = m17299c(mo16322e(obj));
        }
        mo16741b(obj, objM17299c);
        return objM17299c;
    }

    /* renamed from: b */
    public abstract void mo16741b(Object obj, Object obj2);

    /* renamed from: c */
    public final Object m17299c(Object obj) {
        Object obj2 = f18642a.get(this);
        Object obj3 = AbstractC9435a.f18639a;
        return obj2 != obj3 ? obj2 : AbstractC3193a.m1318a(f18642a, this, obj3, obj) ? obj : f18642a.get(this);
    }

    /* renamed from: e */
    public abstract Object mo16322e(Object obj);
}
