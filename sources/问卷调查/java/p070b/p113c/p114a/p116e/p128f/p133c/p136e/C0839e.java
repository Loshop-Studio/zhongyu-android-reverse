package p070b.p113c.p114a.p116e.p128f.p133c.p136e;

import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;

/* renamed from: b.c.a.e.f.c.e.e */
/* loaded from: classes.dex */
public class C0839e implements SmoothImageView.InterfaceC0972e {

    /* renamed from: a */
    public final /* synthetic */ C0842h f4616a;

    public C0839e(C0842h c0842h) {
        this.f4616a = c0842h;
    }

    /* renamed from: a */
    public void m2555a(int i) {
        String strM2554l;
        if (i != 255 || (strM2554l = this.f4616a.f4620V.m2554l()) == null || strM2554l.isEmpty()) {
            this.f4616a.f4626b0.setVisibility(8);
        } else {
            this.f4616a.f4626b0.setVisibility(0);
        }
        this.f4616a.f4623Y.setBackgroundColor((Math.min(255, Math.max(0, (int) ((i / 255.0f) * 255.0f))) << 24) + 0);
    }
}
