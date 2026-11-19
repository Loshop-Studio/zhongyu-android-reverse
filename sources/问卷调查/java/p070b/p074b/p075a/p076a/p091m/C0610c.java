package p070b.p074b.p075a.p076a.p091m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.m.c */
/* loaded from: classes.dex */
public final class C0610c {

    /* renamed from: a */
    public final C0608b f3723a;

    /* renamed from: b */
    public final C0608b f3724b;

    /* renamed from: c */
    public final C0608b f3725c;

    /* renamed from: d */
    public final C0608b f3726d;

    /* renamed from: e */
    public final C0608b f3727e;

    /* renamed from: f */
    public final C0608b f3728f;

    /* renamed from: g */
    public final C0608b f3729g;

    /* renamed from: h */
    public final Paint f3730h;

    public C0610c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0562a.m2096q(context, C1088R.attr.materialCalendarStyle, C0615g.class.getCanonicalName()), C0564b.f3516k);
        this.f3723a = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f3729g = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.f3724b = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f3725c = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListM2086g = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 5);
        this.f3726d = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f3727e = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(6, 0));
        this.f3728f = C0608b.m2183a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.f3730h = paint;
        paint.setColor(colorStateListM2086g.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
