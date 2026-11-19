package p070b.p074b.p075a.p076a.p091m;

import android.view.View;
import p070b.p074b.p075a.p076a.p091m.C0615g;

/* renamed from: b.b.a.a.m.b0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0609b0 implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f3721b;

    /* renamed from: c */
    public final /* synthetic */ C0611c0 f3722c;

    public ViewOnClickListenerC0609b0(C0611c0 c0611c0, int i) {
        this.f3722c = c0611c0;
        this.f3721b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0627s c0627sM2205n = C0627s.m2205n(this.f3721b, this.f3722c.f3731c.f3742Z.f3796d);
        C0606a c0606a = this.f3722c.f3731c.f3741Y;
        if (c0627sM2205n.compareTo(c0606a.f3702b) < 0) {
            c0627sM2205n = c0606a.f3702b;
        } else if (c0627sM2205n.compareTo(c0606a.f3703c) > 0) {
            c0627sM2205n = c0606a.f3703c;
        }
        this.f3722c.f3731c.m2197z0(c0627sM2205n);
        this.f3722c.f3731c.m2194A0(C0615g.e.DAY);
    }
}
