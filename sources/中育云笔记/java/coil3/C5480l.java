package coil3;

import android.content.Context;
import androidx.camera.view.AbstractC0979q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: coil3.l */
/* loaded from: classes3.dex */
public final class C5480l {

    /* renamed from: a */
    public static final C5480l f3798a = new C5480l();

    /* renamed from: b */
    public static final /* synthetic */ AtomicReference f3799b = new AtomicReference(null);

    /* renamed from: coil3.l$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5470e mo3197a(Context context);
    }

    /* renamed from: a */
    public static final InterfaceC5470e m3194a(Context context) {
        C5480l c5480l = f3798a;
        Object obj = c5480l.m3195b().get();
        InterfaceC5470e interfaceC5470e = obj instanceof InterfaceC5470e ? (InterfaceC5470e) obj : null;
        return interfaceC5470e == null ? c5480l.m3196c(context) : interfaceC5470e;
    }

    /* renamed from: b */
    public final /* synthetic */ AtomicReference m3195b() {
        return f3799b;
    }

    /* renamed from: c */
    public final InterfaceC5470e m3196c(Context context) {
        InterfaceC5470e interfaceC5470e;
        AtomicReference atomicReferenceM3195b = m3195b();
        InterfaceC5470e interfaceC5470eMo3197a = null;
        while (true) {
            Object obj = atomicReferenceM3195b.get();
            if (obj instanceof InterfaceC5470e) {
                interfaceC5470e = interfaceC5470eMo3197a;
                interfaceC5470eMo3197a = (InterfaceC5470e) obj;
            } else {
                if (interfaceC5470eMo3197a == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (interfaceC5470eMo3197a = aVar.mo3197a(context)) == null) {
                        a aVarM3201a = AbstractC5482n.m3201a(context);
                        interfaceC5470eMo3197a = aVarM3201a != null ? aVarM3201a.mo3197a(context) : AbstractC5481m.f3800a.mo3197a(context);
                    }
                }
                interfaceC5470e = interfaceC5470eMo3197a;
            }
            if (AbstractC0979q.m884a(atomicReferenceM3195b, obj, interfaceC5470eMo3197a)) {
                AbstractC9979u.m20292e(interfaceC5470eMo3197a, "null cannot be cast to non-null type coil3.ImageLoader");
                return interfaceC5470eMo3197a;
            }
            interfaceC5470eMo3197a = interfaceC5470e;
        }
    }
}
