package p259u;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;
import p281w.C10269k;

/* renamed from: u.a0 */
/* loaded from: classes3.dex */
public class C10133a0 implements InterfaceC9231e {

    /* renamed from: a */
    public final C10269k f20248a;

    /* renamed from: b */
    public final InterfaceC9500d f20249b;

    public C10133a0(C10269k c10269k, InterfaceC9500d interfaceC9500d) {
        this.f20248a = c10269k;
        this.f20249b = interfaceC9500d;
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(Uri uri, int i10, int i11, C9230d c9230d) {
        InterfaceC9357j interfaceC9357jMo3061a = this.f20248a.mo3061a(uri, i10, i11, c9230d);
        if (interfaceC9357jMo3061a == null) {
            return null;
        }
        return AbstractC10155s.m19009a(this.f20249b, (Drawable) interfaceC9357jMo3061a.get(), i10, i11);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(Uri uri, C9230d c9230d) {
        return "android.resource".equals(uri.getScheme());
    }
}
