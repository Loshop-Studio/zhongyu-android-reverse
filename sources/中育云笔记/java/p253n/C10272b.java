package p253n;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import p212k.AbstractC9761o;
import p253n.InterfaceC10281k;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.b */
/* loaded from: classes3.dex */
public final class C10272b implements InterfaceC10281k {

    /* renamed from: a */
    public final Bitmap f24455a;

    /* renamed from: b */
    public final C11634n f24456b;

    /* renamed from: n.b$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(Bitmap bitmap, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            return new C10272b(bitmap, c11634n);
        }
    }

    public C10272b(Bitmap bitmap, C11634n c11634n) {
        this.f24455a = bitmap;
        this.f24456b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        return new C10283m(AbstractC9761o.m19680c(new BitmapDrawable(this.f24456b.m25743c().getResources(), this.f24455a)), false, DataSource.f3611d);
    }
}
