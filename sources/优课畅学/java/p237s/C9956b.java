package p237s;

import android.content.Context;
import android.net.Uri;
import p105g0.C8514b;
import p160l.C9230d;
import p171m.AbstractC9287b;
import p171m.C9288c;
import p226r.C9892r;
import p226r.InterfaceC9888n;
import p226r.InterfaceC9889o;

/* renamed from: s.b */
/* loaded from: classes3.dex */
public class C9956b implements InterfaceC9888n {

    /* renamed from: a */
    public final Context f19943a;

    /* renamed from: s.b$a */
    public static class a implements InterfaceC9889o {

        /* renamed from: a */
        public final Context f19944a;

        public a(Context context) {
            this.f19944a = context;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9956b(this.f19944a);
        }
    }

    public C9956b(Context context) {
        this.f19943a = context.getApplicationContext();
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        if (AbstractC9287b.m17084e(i10, i11)) {
            return new InterfaceC9888n.a(new C8514b(uri), C9288c.m17087e(this.f19943a, uri));
        }
        return null;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return AbstractC9287b.m17081b(uri);
    }
}
