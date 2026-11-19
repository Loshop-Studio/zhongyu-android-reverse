package p104m0;

import android.content.Context;
import android.net.Uri;
import p002a1.C0007b;
import p053f0.C6285d;
import p060g0.AbstractC6390b;
import p060g0.C6391c;
import p097l0.C7284r;
import p097l0.InterfaceC7280n;
import p097l0.InterfaceC7281o;

/* renamed from: m0.b */
/* loaded from: classes3.dex */
public class C7368b implements InterfaceC7280n {

    /* renamed from: a */
    public final Context f9364a;

    /* renamed from: m0.b$a */
    public static class a implements InterfaceC7281o {

        /* renamed from: a */
        public final Context f9365a;

        public a(Context context) {
            this.f9365a = context;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7368b(this.f9365a);
        }
    }

    public C7368b(Context context) {
        this.f9364a = context.getApplicationContext();
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        if (AbstractC6390b.m6902e(i6, i7)) {
            return new InterfaceC7280n.a(new C0007b(uri), C6391c.m6905f(this.f9364a, uri));
        }
        return null;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return AbstractC6390b.m6899b(uri);
    }
}
