package coil3.network;

import android.content.Context;
import android.support.v4.media.C0039h;
import android.view.C2766k;
import androidx.navigation.C2827b;
import coil3.C3333r;
import coil3.C3351x;
import coil3.network.internal.C3319b;
import com.zykj.view.board.play.C5353b;
import kotlin.AbstractC5773a;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5429e;
import p119n.InterfaceC6201f;
import p119n.InterfaceC6202g;
import p152r6.InterfaceC6471c;
import p154s.C6538l;

/* renamed from: coil3.network.i */
/* loaded from: classes2.dex */
public final class C3317i implements InterfaceC6201f {

    /* renamed from: a */
    public final InterfaceC5429e f2008a;

    /* renamed from: b */
    public final InterfaceC5429e f2009b;

    /* renamed from: c */
    public final C0039h f2010c;

    public C3317i(C5353b c5353b) {
        C2766k c2766k = new C2766k(9);
        NetworkFetcher$Factory$2 networkFetcher$Factory$2 = NetworkFetcher$Factory$2.INSTANCE;
        this.f2008a = AbstractC5773a.m5117b(c5353b);
        this.f2009b = AbstractC5773a.m5117b(c2766k);
        C0039h c0039h = new C0039h(5, false);
        c0039h.f96b = networkFetcher$Factory$2;
        c0039h.f97c = C3319b.f2011a;
        this.f2010c = c0039h;
    }

    @Override // p119n.InterfaceC6201f
    /* renamed from: a */
    public final InterfaceC6202g mo2248a(Object obj, C6538l c6538l, C3333r c3333r) {
        C3351x c3351x = (C3351x) obj;
        if (!AbstractC5830k.m5325b(c3351x.f2088c, "http") && !AbstractC5830k.m5325b(c3351x.f2088c, "https")) {
            return null;
        }
        String str = c3351x.f2086a;
        InterfaceC5429e interfaceC5429e = this.f2008a;
        InterfaceC5429e interfaceC5429eM5117b = AbstractC5773a.m5117b(new C2827b(c3333r, 6));
        InterfaceC5429e interfaceC5429e2 = this.f2009b;
        C0039h c0039h = this.f2010c;
        Context context = c6538l.f10894a;
        Object obj2 = c0039h.f97c;
        C3319b c3319b = C3319b.f2011a;
        if (obj2 == c3319b) {
            synchronized (c0039h) {
                obj2 = c0039h.f97c;
                if (obj2 == c3319b) {
                    InterfaceC6471c interfaceC6471c = (InterfaceC6471c) c0039h.f96b;
                    AbstractC5830k.m5327d(interfaceC6471c);
                    Object objInvoke = interfaceC6471c.invoke(context);
                    c0039h.f97c = objInvoke;
                    c0039h.f96b = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new C3321j(str, c6538l, interfaceC5429e, interfaceC5429eM5117b, interfaceC5429e2, (InterfaceC3313e) obj2);
    }
}
