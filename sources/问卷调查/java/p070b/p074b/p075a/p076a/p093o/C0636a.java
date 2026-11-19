package p070b.p074b.p075a.p076a.p093o;

import android.content.Context;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p074b.p075a.p076a.C0562a;

/* renamed from: b.b.a.a.o.a */
/* loaded from: classes.dex */
public class C0636a {

    /* renamed from: a */
    public final boolean f3822a;

    /* renamed from: b */
    public final int f3823b;

    /* renamed from: c */
    public final int f3824c;

    /* renamed from: d */
    public final float f3825d;

    public C0636a(Context context) {
        this.f3822a = C0562a.m2095p(context, C1088R.attr.elevationOverlayEnabled, false);
        this.f3823b = C0562a.m2084e(context, C1088R.attr.elevationOverlayColor, 0);
        this.f3824c = C0562a.m2084e(context, C1088R.attr.colorSurface, 0);
        this.f3825d = context.getResources().getDisplayMetrics().density;
    }
}
