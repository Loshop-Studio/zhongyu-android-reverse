package coil3;

import android.content.Context;
import androidx.camera.view.AbstractC0908q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: coil3.l */
/* loaded from: classes3.dex */
public final class C5338l {

    /* renamed from: a */
    public static final C5338l f3026a = new C5338l();

    /* renamed from: b */
    public static final /* synthetic */ AtomicReference f3027b = new AtomicReference(null);

    /* renamed from: coil3.l$a */
    public interface a {
        /* renamed from: a */
        InterfaceC5328e mo2826a(Context context);
    }

    /* renamed from: a */
    public static final InterfaceC5328e m2823a(Context context) {
        C5338l c5338l = f3026a;
        Object obj = c5338l.m2824b().get();
        InterfaceC5328e interfaceC5328e = obj instanceof InterfaceC5328e ? (InterfaceC5328e) obj : null;
        return interfaceC5328e == null ? c5338l.m2825c(context) : interfaceC5328e;
    }

    /* renamed from: b */
    public final /* synthetic */ AtomicReference m2824b() {
        return f3027b;
    }

    /* renamed from: c */
    public final InterfaceC5328e m2825c(Context context) {
        InterfaceC5328e interfaceC5328e;
        AtomicReference atomicReferenceM2824b = m2824b();
        InterfaceC5328e interfaceC5328eMo2826a = null;
        while (true) {
            Object obj = atomicReferenceM2824b.get();
            if (obj instanceof InterfaceC5328e) {
                interfaceC5328e = interfaceC5328eMo2826a;
                interfaceC5328eMo2826a = (InterfaceC5328e) obj;
            } else {
                if (interfaceC5328eMo2826a == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (interfaceC5328eMo2826a = aVar.mo2826a(context)) == null) {
                        a aVarM2830a = AbstractC5340n.m2830a(context);
                        interfaceC5328eMo2826a = aVarM2830a != null ? aVarM2830a.mo2826a(context) : AbstractC5339m.f3028a.mo2826a(context);
                    }
                }
                interfaceC5328e = interfaceC5328eMo2826a;
            }
            if (AbstractC0908q.m812a(atomicReferenceM2824b, obj, interfaceC5328eMo2826a)) {
                Intrinsics.checkNotNull(interfaceC5328eMo2826a, "null cannot be cast to non-null type coil3.ImageLoader");
                return interfaceC5328eMo2826a;
            }
            interfaceC5328eMo2826a = interfaceC5328e;
        }
    }
}
