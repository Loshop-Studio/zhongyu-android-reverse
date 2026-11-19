package p215k2;

import android.content.Context;
import android.widget.ImageView;
import com.alibaba.fastjson.asm.Opcodes;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.friday.common.R$drawable;
import p008a7.AbstractC0068a;
import p260n6.InterfaceC10322a;
import p298q0.C10701j;
import p298q0.C10715x;

/* renamed from: k2.r */
/* loaded from: classes3.dex */
public class C9800r implements InterfaceC10322a {

    /* renamed from: k2.r$a */
    public static final class a {

        /* renamed from: a */
        public static final C9800r f22997a = new C9800r();
    }

    /* renamed from: g */
    public static C9800r m19802g() {
        return a.f22997a;
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: a */
    public void mo19803a(Context context) {
        ComponentCallbacks2C5810b.m3946t(context).m4019w();
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: b */
    public void mo19804b(Context context, String str, ImageView imageView) {
        if (AbstractC0068a.m140a(context)) {
            ComponentCallbacks2C5810b.m3946t(context).m4016t(str).m3981A0(imageView);
        }
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: c */
    public void mo19805c(Context context) {
        ComponentCallbacks2C5810b.m3946t(context).m4020x();
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: d */
    public void mo19806d(Context context, String str, ImageView imageView) {
        if (AbstractC0068a.m140a(context)) {
            ((C5815g) ((C5815g) ((C5815g) ((C5815g) ComponentCallbacks2C5810b.m3946t(context).m4006j().m3986F0(str).m26534V(Opcodes.GETFIELD, Opcodes.GETFIELD)).m26546f0(0.5f)).m26560m0(new C10701j(), new C10715x(8))).m26535W(R$drawable.ps_image_placeholder)).m3981A0(imageView);
        }
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: e */
    public void mo19807e(Context context, String str, ImageView imageView) {
        if (AbstractC0068a.m140a(context)) {
            ((C5815g) ((C5815g) ((C5815g) ComponentCallbacks2C5810b.m3946t(context).m4016t(str).m26534V(200, 200)).m26544e()).m26535W(R$drawable.ps_image_placeholder)).m3981A0(imageView);
        }
    }

    @Override // p260n6.InterfaceC10322a
    /* renamed from: f */
    public void mo19808f(Context context, ImageView imageView, String str, int i10, int i11) {
        if (AbstractC0068a.m140a(context)) {
            ((C5815g) ComponentCallbacks2C5810b.m3946t(context).m4016t(str).m26534V(i10, i11)).m3981A0(imageView);
        }
    }

    public C9800r() {
    }
}
