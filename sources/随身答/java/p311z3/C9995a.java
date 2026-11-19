package p311z3;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p002a1.C0012d;
import p002a1.InterfaceC0011c;
import p019b1.InterfaceC5097h;
import p152k0.AbstractC8252c;

/* renamed from: z3.a */
/* loaded from: classes4.dex */
public class C9995a implements InterfaceC9996b {

    /* renamed from: a */
    public C0012d f18004a;

    /* renamed from: z3.a$a */
    public class a implements InterfaceC0011c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9997c f18005a;

        public a(InterfaceC9997c interfaceC9997c) {
            this.f18005a = interfaceC9997c;
        }

        @Override // p002a1.InterfaceC0011c
        /* renamed from: b */
        public boolean mo76b(GlideException glideException, Object obj, InterfaceC5097h interfaceC5097h, boolean z9) {
            this.f18005a.mo6881b(null);
            return false;
        }

        @Override // p002a1.InterfaceC0011c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo75a(Bitmap bitmap, Object obj, InterfaceC5097h interfaceC5097h, DataSource dataSource, boolean z9) {
            this.f18005a.mo6880a();
            return false;
        }
    }

    /* renamed from: z3.a$b */
    public class b implements InterfaceC0011c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9997c f18007a;

        public b(InterfaceC9997c interfaceC9997c) {
            this.f18007a = interfaceC9997c;
        }

        @Override // p002a1.InterfaceC0011c
        /* renamed from: b */
        public boolean mo76b(GlideException glideException, Object obj, InterfaceC5097h interfaceC5097h, boolean z9) {
            this.f18007a.mo6881b(null);
            return false;
        }

        @Override // p002a1.InterfaceC0011c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo75a(GifDrawable gifDrawable, Object obj, InterfaceC5097h interfaceC5097h, DataSource dataSource, boolean z9) {
            this.f18007a.mo6880a();
            return false;
        }
    }

    public C9995a() {
        this((C0012d) ((C0012d) new C0012d().m56l(R$drawable.xui_ic_no_img)).m53i(AbstractC8252c.f14323a));
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: a */
    public void mo17151a(Context context) {
        ComponentCallbacks2C5471b.m3006c(context).m3015b();
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: b */
    public void mo17152b(Fragment fragment) {
        ComponentCallbacks2C5471b.m3014v(fragment).onStop();
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: c */
    public void mo17153c(Fragment fragment, String str, ImageView imageView, InterfaceC9997c interfaceC9997c) {
        ComponentCallbacks2C5471b.m3014v(fragment).m3060l().mo40b(this.f18004a).m3055y0(str).m3053w0(new b(interfaceC9997c)).m3051u0(imageView);
    }

    @Override // p311z3.InterfaceC9996b
    /* renamed from: d */
    public void mo17154d(Fragment fragment, String str, ImageView imageView, InterfaceC9997c interfaceC9997c) {
        ComponentCallbacks2C5471b.m3014v(fragment).m3058j().mo40b(this.f18004a).m3055y0(str).m3053w0(new a(interfaceC9997c)).m3051u0(imageView);
    }

    public C9995a(C0012d c0012d) {
        this.f18004a = c0012d;
    }
}
