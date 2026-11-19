package p239t0;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import p106h1.C7617b;
import p162m0.C8539d;
import p173n0.AbstractC8613b;
import p173n0.C8614c;
import p228s0.C9116r;
import p228s0.InterfaceC9112n;
import p228s0.InterfaceC9113o;

/* renamed from: t0.c */
/* loaded from: classes3.dex */
public class C9372c implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f16261a;

    /* renamed from: t0.c$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f16262a;

        public a(Context context) {
            this.f16262a = context;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9372c(this.f16262a);
        }
    }

    public C9372c(Context context) {
        this.f16261a = context.getApplicationContext();
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        if (AbstractC8613b.m14180e(i10, i11) && m15660e(c8539d)) {
            return new InterfaceC9112n.a(new C7617b(uri), C8614c.m14184g(this.f16261a, uri));
        }
        return null;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return AbstractC8613b.m14179d(uri);
    }

    /* renamed from: e */
    public final boolean m15660e(C8539d c8539d) {
        Long l10 = (Long) c8539d.m14057c(VideoDecoder.f3742d);
        return l10 != null && l10.longValue() == -1;
    }
}
