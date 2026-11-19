package p212k;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: k.o */
/* loaded from: classes3.dex */
public abstract class AbstractC9761o {
    /* renamed from: a */
    public static final Drawable m19678a(InterfaceC9756j interfaceC9756j, Resources resources) {
        return interfaceC9756j instanceof C9754h ? ((C9754h) interfaceC9756j).m19677b() : interfaceC9756j instanceof C9747a ? new BitmapDrawable(resources, ((C9747a) interfaceC9756j).m19676b()) : new C9757k(interfaceC9756j);
    }

    /* renamed from: b */
    public static final C9747a m19679b(Bitmap bitmap, boolean z10) {
        return new C9747a(bitmap, z10);
    }

    /* renamed from: c */
    public static final InterfaceC9756j m19680c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m19681d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new C9754h(drawable, false);
    }

    /* renamed from: d */
    public static /* synthetic */ C9747a m19681d(Bitmap bitmap, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m19679b(bitmap, z10);
    }
}
