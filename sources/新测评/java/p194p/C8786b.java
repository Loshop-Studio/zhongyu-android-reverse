package p194p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import p137k.AbstractC7843o;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.b */
/* loaded from: classes3.dex */
public final class C8786b implements InterfaceC8795k {

    /* renamed from: a */
    public final Bitmap f14919a;

    /* renamed from: b */
    public final C9892k f14920b;

    /* renamed from: p.b$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(Bitmap bitmap, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            return new C8786b(bitmap, c9892k);
        }
    }

    public C8786b(Bitmap bitmap, C9892k c9892k) {
        this.f14919a = bitmap;
        this.f14920b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        return new C8797m(AbstractC7843o.m13301c(new BitmapDrawable(this.f14920b.m16700c().getResources(), this.f14919a)), false, DataSource.f2936b);
    }
}
