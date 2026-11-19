package p239t0;

import android.content.Context;
import android.net.Uri;
import p106h1.C7617b;
import p162m0.C8539d;
import p173n0.AbstractC8613b;
import p173n0.C8614c;
import p228s0.C9116r;
import p228s0.InterfaceC9112n;
import p228s0.InterfaceC9113o;

/* renamed from: t0.b */
/* loaded from: classes3.dex */
public class C9371b implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f16259a;

    /* renamed from: t0.b$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f16260a;

        public a(Context context) {
            this.f16260a = context;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9371b(this.f16260a);
        }
    }

    public C9371b(Context context) {
        this.f16259a = context.getApplicationContext();
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        if (AbstractC8613b.m14180e(i10, i11)) {
            return new InterfaceC9112n.a(new C7617b(uri), C8614c.m14183f(this.f16259a, uri));
        }
        return null;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return AbstractC8613b.m14177b(uri);
    }
}
