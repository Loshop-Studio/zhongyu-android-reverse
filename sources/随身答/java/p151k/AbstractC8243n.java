package p151k;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: k.n */
/* loaded from: classes3.dex */
public abstract class AbstractC8243n {
    /* renamed from: a */
    public static final Drawable m13268a(InterfaceC8239j interfaceC8239j, Resources resources) {
        return interfaceC8239j instanceof C8237h ? ((C8237h) interfaceC8239j).m13267b() : interfaceC8239j instanceof C8230a ? new BitmapDrawable(resources, ((C8230a) interfaceC8239j).m13266b()) : new C8240k(interfaceC8239j);
    }

    /* renamed from: b */
    public static final C8230a m13269b(Bitmap bitmap, boolean z9) {
        return new C8230a(bitmap, z9);
    }

    /* renamed from: c */
    public static final InterfaceC8239j m13270c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m13271d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new C8237h(drawable, false);
    }

    /* renamed from: d */
    public static /* synthetic */ C8230a m13271d(Bitmap bitmap, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        return m13269b(bitmap, z9);
    }

    /* renamed from: e */
    public static final Bitmap m13272e(InterfaceC8239j interfaceC8239j, int i9, int i10) {
        Bitmap.Config config = interfaceC8239j instanceof C8230a ? ((C8230a) interfaceC8239j).m13266b().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m13273f(interfaceC8239j, i9, i10, config);
    }

    /* renamed from: f */
    public static final Bitmap m13273f(InterfaceC8239j interfaceC8239j, int i9, int i10, Bitmap.Config config) {
        if (interfaceC8239j instanceof C8230a) {
            C8230a c8230a = (C8230a) interfaceC8239j;
            if (c8230a.m13266b().getWidth() == i9 && c8230a.m13266b().getHeight() == i10 && c8230a.m13266b().getConfig() == config) {
                return c8230a.m13266b();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, config);
        interfaceC8239j.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m13274g(InterfaceC8239j interfaceC8239j, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = interfaceC8239j.getWidth();
        }
        if ((i11 & 2) != 0) {
            i10 = interfaceC8239j.getHeight();
        }
        return m13272e(interfaceC8239j, i9, i10);
    }
}
