package p189w2;

import com.xuexiang.xui.widget.imageview.preview.p034ui.BasePhotoFragment;
import p148r2.InterfaceC6456j;
import p197x2.InterfaceC6745c;
import p197x2.InterfaceC6746d;

/* renamed from: w2.a */
/* loaded from: classes3.dex */
public final class C6702a implements InterfaceC6456j, InterfaceC6745c, InterfaceC6746d {

    /* renamed from: a */
    public final /* synthetic */ BasePhotoFragment f11314a;

    /* renamed from: a */
    public void m6404a(int i) {
        if (i == 255) {
            throw null;
        }
        BasePhotoFragment basePhotoFragment = this.f11314a;
        basePhotoFragment.f4443c.setVisibility(8);
        basePhotoFragment.f4442b.setBackgroundColor(Math.min(255, Math.max(0, (int) ((i / 255.0f) * 255.0f))) << 24);
    }
}
