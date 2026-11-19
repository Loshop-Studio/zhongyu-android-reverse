package coil3;

import android.content.Context;
import androidx.camera.view.AbstractC0920q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: coil3.l */
/* loaded from: classes3.dex */
public final class C5203l {

    /* renamed from: a */
    public static final C5203l f3123a = new C5203l();

    /* renamed from: b */
    public static final /* synthetic */ AtomicReference f3124b = new AtomicReference(null);

    /* renamed from: coil3.l$a */
    public interface a {
        InterfaceC5193e newImageLoader(Context context);
    }

    /* renamed from: a */
    public static final InterfaceC5193e m3104a(Context context) {
        C5203l c5203l = f3123a;
        Object obj = c5203l.m3105b().get();
        InterfaceC5193e interfaceC5193e = obj instanceof InterfaceC5193e ? (InterfaceC5193e) obj : null;
        return interfaceC5193e == null ? c5203l.m3106c(context) : interfaceC5193e;
    }

    /* renamed from: b */
    public final /* synthetic */ AtomicReference m3105b() {
        return f3124b;
    }

    /* renamed from: c */
    public final InterfaceC5193e m3106c(Context context) {
        InterfaceC5193e interfaceC5193e;
        AtomicReference atomicReferenceM3105b = m3105b();
        InterfaceC5193e interfaceC5193eNewImageLoader = null;
        while (true) {
            Object obj = atomicReferenceM3105b.get();
            if (obj instanceof InterfaceC5193e) {
                interfaceC5193e = interfaceC5193eNewImageLoader;
                interfaceC5193eNewImageLoader = (InterfaceC5193e) obj;
            } else {
                if (interfaceC5193eNewImageLoader == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (interfaceC5193eNewImageLoader = aVar.newImageLoader(context)) == null) {
                        a aVarM3110a = AbstractC5205n.m3110a(context);
                        interfaceC5193eNewImageLoader = aVarM3110a != null ? aVarM3110a.newImageLoader(context) : AbstractC5204m.f3125a.newImageLoader(context);
                    }
                }
                interfaceC5193e = interfaceC5193eNewImageLoader;
            }
            if (AbstractC0920q.m1034a(atomicReferenceM3105b, obj, interfaceC5193eNewImageLoader)) {
                Intrinsics.checkNotNull(interfaceC5193eNewImageLoader, "null cannot be cast to non-null type coil3.ImageLoader");
                return interfaceC5193eNewImageLoader;
            }
            interfaceC5193eNewImageLoader = interfaceC5193e;
        }
    }
}
