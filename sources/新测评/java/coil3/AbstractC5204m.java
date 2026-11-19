package coil3;

import android.content.Context;
import coil3.AbstractC5204m;
import coil3.C5169c;
import coil3.C5203l;
import coil3.InterfaceC5193e;
import kotlin.Unit;

/* renamed from: coil3.m */
/* loaded from: classes3.dex */
public abstract class AbstractC5204m {

    /* renamed from: a */
    public static final C5203l.a f3125a = new C5203l.a() { // from class: k.s
        @Override // coil3.C5203l.a
        public final InterfaceC5193e newImageLoader(Context context) {
            return AbstractC5204m.m3108b(context);
        }
    };

    /* renamed from: b */
    public static final C5169c.c f3126b = new C5169c.c(Unit.INSTANCE);

    /* renamed from: b */
    public static final InterfaceC5193e m3108b(Context context) {
        InterfaceC5193e.a aVar = new InterfaceC5193e.a(context);
        aVar.m3059i().m2892b(f3126b, Unit.INSTANCE);
        return aVar.m3057d();
    }
}
