package p119n;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.AbstractC3330o;
import coil3.decode.C3264e;
import coil3.decode.C3277r;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC3348l;
import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Okio;
import p075h6.InterfaceC5631c;
import p154s.AbstractC6534h;
import p154s.C6538l;
import p185v7.AbstractC6675d;

/* renamed from: n.c */
/* loaded from: classes2.dex */
public final class C6198c implements InterfaceC6202g {

    /* renamed from: a */
    public final /* synthetic */ int f9910a;

    /* renamed from: b */
    public final C6538l f9911b;

    /* renamed from: c */
    public final Object f9912c;

    public /* synthetic */ C6198c(Object obj, C6538l c6538l, int i) {
        this.f9910a = i;
        this.f9912c = obj;
        this.f9911b = c6538l;
    }

    @Override // p119n.InterfaceC6202g
    /* renamed from: a */
    public final Object mo2253a(InterfaceC5631c interfaceC5631c) {
        int i = this.f9910a;
        Object obj = this.f9912c;
        C6538l c6538l = this.f9911b;
        switch (i) {
            case 0:
                return new C6204i(AbstractC3330o.m2265c(new BitmapDrawable(c6538l.f10894a.getResources(), (Bitmap) obj)), false, DataSource.MEMORY);
            case 1:
                Buffer buffer = new Buffer();
                buffer.write((byte[]) obj);
                return new C6206k(new C3277r(buffer, c6538l.f10899f, null), null, DataSource.MEMORY);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new C6206k(new C3277r(Okio.buffer(new C6199d(byteBuffer)), c6538l.f10899f, new C3264e(byteBuffer)), null, DataSource.MEMORY);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC3348l.f2083a;
                boolean z8 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
                if (z8) {
                    bitmapDrawable = new BitmapDrawable(c6538l.f10894a.getResources(), AbstractC6675d.m6345g(bitmapDrawable, AbstractC6534h.m6186b(c6538l), c6538l.f10895b, c6538l.f10896c, c6538l.f10897d == Precision.INEXACT));
                }
                return new C6204i(AbstractC3330o.m2265c(bitmapDrawable), z8, DataSource.MEMORY);
        }
    }
}
