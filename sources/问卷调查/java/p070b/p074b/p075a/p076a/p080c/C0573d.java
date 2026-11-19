package p070b.p074b.p075a.p076a.p080c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: b.b.a.a.c.d */
/* loaded from: classes.dex */
public class C0573d extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f3541b = new C0573d();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f3542a;

    public C0573d() {
        super(Integer.class, "drawableAlphaCompat");
        this.f3542a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
