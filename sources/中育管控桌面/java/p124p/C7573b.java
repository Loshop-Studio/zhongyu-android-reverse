package p124p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import p087k.AbstractC6616o;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.b */
/* loaded from: classes3.dex */
public final class C7573b implements InterfaceC7582k {

    /* renamed from: a */
    public final Bitmap f10019a;

    /* renamed from: b */
    public final C7880m f10020b;

    /* renamed from: p.b$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(Bitmap bitmap, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            return new C7573b(bitmap, c7880m);
        }
    }

    public C7573b(Bitmap bitmap, C7880m c7880m) {
        this.f10019a = bitmap;
        this.f10020b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        return new C7584m(AbstractC6616o.m7570c(new BitmapDrawable(this.f10020b.m9661c().getResources(), this.f10019a)), false, DataSource.f1620b);
    }
}
