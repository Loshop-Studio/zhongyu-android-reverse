package p267o0;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import p039c1.C5222d;
import p168h0.C9438e;
import p184i0.AbstractC9558b;
import p184i0.C9559c;
import p254n0.C10304r;
import p254n0.InterfaceC10300n;
import p254n0.InterfaceC10301o;

/* renamed from: o0.c */
/* loaded from: classes3.dex */
public class C10419c implements InterfaceC10300n {

    /* renamed from: a */
    public final Context f24800a;

    /* renamed from: o0.c$a */
    public static class a implements InterfaceC10301o {

        /* renamed from: a */
        public final Context f24801a;

        public a(Context context) {
            this.f24801a = context;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10419c(this.f24801a);
        }
    }

    public C10419c(Context context) {
        this.f24800a = context.getApplicationContext();
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        if (AbstractC9558b.m18795e(i10, i11) && m21813e(c9438e)) {
            return new InterfaceC10300n.a(new C5222d(uri), C9559c.m18799e(this.f24800a, uri));
        }
        return null;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return AbstractC9558b.m18794d(uri);
    }

    /* renamed from: e */
    public final boolean m21813e(C9438e c9438e) {
        Long l10 = (Long) c9438e.m18626c(VideoDecoder.f4945d);
        return l10 != null && l10.longValue() == -1;
    }
}
