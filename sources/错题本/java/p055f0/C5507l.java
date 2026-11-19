package p055f0;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import p000a.AbstractC0000a;
import p001a0.C0001a;
import p001a0.C0002b;
import p001a0.C0004d;
import p077i0.C5670z;
import p172u0.C6610b;
import p202y.C6763f;

/* renamed from: f0.l */
/* loaded from: classes2.dex */
public final class C5507l implements InterfaceC5511p {

    /* renamed from: a */
    public final /* synthetic */ int f8525a;

    /* renamed from: b */
    public final Context f8526b;

    public C5507l(Context context, int i) {
        this.f8525a = i;
        switch (i) {
            case 1:
                this.f8526b = context.getApplicationContext();
                break;
            case 2:
                this.f8526b = context.getApplicationContext();
                break;
            default:
                this.f8526b = context;
                break;
        }
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        switch (this.f8525a) {
            case 0:
                return AbstractC0000a.m11l((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0000a.m11l(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0000a.m11l(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        Long l;
        switch (this.f8525a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C5510o(new C6610b(uri), new C5506k(0, this.f8526b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || i > 512 || i8 > 384) {
                    return null;
                }
                C6610b c6610b = new C6610b(uri2);
                Context context = this.f8526b;
                return new C5510o(c6610b, new C0002b(0, uri2, new C0004d(ComponentCallbacks2C3408b.m2360c(context).f2202e.m2369e(), new C0001a(context.getContentResolver(), 0), ComponentCallbacks2C3408b.m2360c(context).f2203f, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || i > 512 || i8 > 384 || (l = (Long) c6763f.m6436c(C5670z.f8832d)) == null || l.longValue() != -1) {
                    return null;
                }
                C6610b c6610b2 = new C6610b(uri3);
                Context context2 = this.f8526b;
                return new C5510o(c6610b2, new C0002b(0, uri3, new C0004d(ComponentCallbacks2C3408b.m2360c(context2).f2202e.m2369e(), new C0001a(context2.getContentResolver(), 1), ComponentCallbacks2C3408b.m2360c(context2).f2203f, context2.getContentResolver())));
        }
    }
}
