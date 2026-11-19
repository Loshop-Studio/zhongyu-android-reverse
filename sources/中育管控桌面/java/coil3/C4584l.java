package coil3;

import android.content.Context;
import androidx.compose.animation.core.AbstractC0433h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: coil3.l */
/* loaded from: classes3.dex */
public final class C4584l {

    /* renamed from: a */
    public static final C4584l f1807a = new C4584l();

    /* renamed from: b */
    public static final /* synthetic */ AtomicReference f1808b = new AtomicReference(null);

    /* renamed from: coil3.l$a */
    public interface a {
        /* renamed from: a */
        InterfaceC4574e mo1932a(Context context);
    }

    /* renamed from: a */
    public static final InterfaceC4574e m1929a(Context context) {
        C4584l c4584l = f1807a;
        Object obj = c4584l.m1930b().get();
        InterfaceC4574e interfaceC4574e = obj instanceof InterfaceC4574e ? (InterfaceC4574e) obj : null;
        return interfaceC4574e == null ? c4584l.m1931c(context) : interfaceC4574e;
    }

    /* renamed from: b */
    public final /* synthetic */ AtomicReference m1930b() {
        return f1808b;
    }

    /* renamed from: c */
    public final InterfaceC4574e m1931c(Context context) {
        InterfaceC4574e interfaceC4574e;
        AtomicReference atomicReferenceM1930b = m1930b();
        InterfaceC4574e interfaceC4574eMo1932a = null;
        while (true) {
            Object obj = atomicReferenceM1930b.get();
            if (obj instanceof InterfaceC4574e) {
                interfaceC4574e = interfaceC4574eMo1932a;
                interfaceC4574eMo1932a = (InterfaceC4574e) obj;
            } else {
                if (interfaceC4574eMo1932a == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (interfaceC4574eMo1932a = aVar.mo1932a(context)) == null) {
                        a aVarM1936a = AbstractC4586n.m1936a(context);
                        interfaceC4574eMo1932a = aVarM1936a != null ? aVarM1936a.mo1932a(context) : AbstractC4585m.f1809a.mo1932a(context);
                    }
                }
                interfaceC4574e = interfaceC4574eMo1932a;
            }
            if (AbstractC0433h.m112a(atomicReferenceM1930b, obj, interfaceC4574eMo1932a)) {
                Intrinsics.checkNotNull(interfaceC4574eMo1932a, "null cannot be cast to non-null type coil3.ImageLoader");
                return interfaceC4574eMo1932a;
            }
            interfaceC4574eMo1932a = interfaceC4574e;
        }
    }
}
