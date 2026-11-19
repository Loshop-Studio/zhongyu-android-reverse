package p208p0;

import android.content.Context;
import android.net.Uri;
import p080d1.C7737b;
import p122h0.C8084d;
import p142j0.AbstractC8200b;
import p142j0.C8201c;
import p194o0.C9150q;
import p194o0.InterfaceC9146m;
import p194o0.InterfaceC9147n;

/* renamed from: p0.c */
/* loaded from: classes3.dex */
public class C9306c implements InterfaceC9146m {

    /* renamed from: a */
    public final Context f16116a;

    /* renamed from: p0.c$a */
    public static class a implements InterfaceC9147n {

        /* renamed from: a */
        public final Context f16117a;

        public a(Context context) {
            this.f16117a = context;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9306c(this.f16117a);
        }
    }

    public C9306c(Context context) {
        this.f16116a = context.getApplicationContext();
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        if (AbstractC8200b.m13210d(i9, i10)) {
            return new InterfaceC9146m.a(new C7737b(uri), C8201c.m13213f(this.f16116a, uri));
        }
        return null;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return AbstractC8200b.m13207a(uri);
    }
}
