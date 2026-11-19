package p087k;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: k.o */
/* loaded from: classes3.dex */
public abstract class AbstractC6616o {
    /* renamed from: a */
    public static final Drawable m7568a(InterfaceC6611j interfaceC6611j, Resources resources) {
        return interfaceC6611j instanceof C6609h ? ((C6609h) interfaceC6611j).m7567b() : interfaceC6611j instanceof C6602a ? new BitmapDrawable(resources, ((C6602a) interfaceC6611j).m7566b()) : new C6612k(interfaceC6611j);
    }

    /* renamed from: b */
    public static final C6602a m7569b(Bitmap bitmap, boolean z6) {
        return new C6602a(bitmap, z6);
    }

    /* renamed from: c */
    public static final InterfaceC6611j m7570c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m7571d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new C6609h(drawable, false);
    }

    /* renamed from: d */
    public static /* synthetic */ C6602a m7571d(Bitmap bitmap, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return m7569b(bitmap, z6);
    }
}
