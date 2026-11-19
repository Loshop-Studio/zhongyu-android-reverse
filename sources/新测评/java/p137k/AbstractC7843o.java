package p137k;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: k.o */
/* loaded from: classes3.dex */
public abstract class AbstractC7843o {
    /* renamed from: a */
    public static final Drawable m13299a(InterfaceC7838j interfaceC7838j, Resources resources) {
        return interfaceC7838j instanceof C7836h ? ((C7836h) interfaceC7838j).m13298b() : interfaceC7838j instanceof C7829a ? new BitmapDrawable(resources, ((C7829a) interfaceC7838j).m13297b()) : new C7839k(interfaceC7838j);
    }

    /* renamed from: b */
    public static final C7829a m13300b(Bitmap bitmap, boolean z9) {
        return new C7829a(bitmap, z9);
    }

    /* renamed from: c */
    public static final InterfaceC7838j m13301c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m13302d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new C7836h(drawable, false);
    }

    /* renamed from: d */
    public static /* synthetic */ C7829a m13302d(Bitmap bitmap, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return m13300b(bitmap, z9);
    }

    /* renamed from: e */
    public static final Bitmap m13303e(InterfaceC7838j interfaceC7838j, int i10, int i11) {
        Bitmap.Config config = interfaceC7838j instanceof C7829a ? ((C7829a) interfaceC7838j).m13297b().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m13304f(interfaceC7838j, i10, i11, config);
    }

    /* renamed from: f */
    public static final Bitmap m13304f(InterfaceC7838j interfaceC7838j, int i10, int i11, Bitmap.Config config) {
        if (interfaceC7838j instanceof C7829a) {
            C7829a c7829a = (C7829a) interfaceC7838j;
            if (c7829a.m13297b().getWidth() == i10 && c7829a.m13297b().getHeight() == i11 && c7829a.m13297b().getConfig() == config) {
                return c7829a.m13297b();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        interfaceC7838j.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m13305g(InterfaceC7838j interfaceC7838j, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = interfaceC7838j.getWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = interfaceC7838j.getHeight();
        }
        return m13303e(interfaceC7838j, i10, i11);
    }
}
