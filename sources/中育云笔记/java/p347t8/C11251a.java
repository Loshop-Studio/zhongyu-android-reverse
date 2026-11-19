package p347t8;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p002a1.InterfaceC0037h;
import p198j0.AbstractC9650c;
import p428z0.C11955d;
import p428z0.InterfaceC11954c;

/* renamed from: t8.a */
/* loaded from: classes5.dex */
public class C11251a implements InterfaceC11252b {

    /* renamed from: a */
    public C11955d f27016a;

    /* renamed from: t8.a$a */
    public class a implements InterfaceC11954c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11253c f27017a;

        public a(InterfaceC11253c interfaceC11253c) {
            this.f27017a = interfaceC11253c;
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: a */
        public boolean mo6152a(GlideException glideException, Object obj, InterfaceC0037h interfaceC0037h, boolean z10) {
            this.f27017a.mo12862b(null);
            return false;
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo6153b(Bitmap bitmap, Object obj, InterfaceC0037h interfaceC0037h, DataSource dataSource, boolean z10) {
            this.f27017a.mo12861a();
            return false;
        }
    }

    /* renamed from: t8.a$b */
    public class b implements InterfaceC11954c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11253c f27019a;

        public b(InterfaceC11253c interfaceC11253c) {
            this.f27019a = interfaceC11253c;
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: a */
        public boolean mo6152a(GlideException glideException, Object obj, InterfaceC0037h interfaceC0037h, boolean z10) {
            this.f27019a.mo12862b(null);
            return false;
        }

        @Override // p428z0.InterfaceC11954c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo6153b(GifDrawable gifDrawable, Object obj, InterfaceC0037h interfaceC0037h, DataSource dataSource, boolean z10) {
            this.f27019a.mo12861a();
            return false;
        }
    }

    public C11251a() {
        this((C11955d) ((C11955d) new C11955d().m26553j(R$drawable.xui_ic_no_img)).m26549h(AbstractC9650c.f22355a));
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: a */
    public void mo24626a(Context context) {
        ComponentCallbacks2C5810b.m3940c(context).m3950b();
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: b */
    public void mo24627b(Fragment fragment) {
        ComponentCallbacks2C5810b.m3948v(fragment).onStop();
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: c */
    public void mo24628c(Fragment fragment, String str, ImageView imageView, InterfaceC11253c interfaceC11253c) {
        ComponentCallbacks2C5810b.m3948v(fragment).m4008l().mo3989b(this.f27016a).m3986F0(str).m3983C0(new b(interfaceC11253c)).m3981A0(imageView);
    }

    @Override // p347t8.InterfaceC11252b
    /* renamed from: d */
    public void mo24629d(Fragment fragment, String str, ImageView imageView, InterfaceC11253c interfaceC11253c) {
        ComponentCallbacks2C5810b.m3948v(fragment).m4006j().mo3989b(this.f27016a).m3986F0(str).m3983C0(new a(interfaceC11253c)).m3981A0(imageView);
    }

    public C11251a(C11955d c11955d) {
        this.f27016a = c11955d;
    }
}
