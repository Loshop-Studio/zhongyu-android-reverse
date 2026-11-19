package p090k2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p067h0.AbstractC6433c;
import p181x0.C7826d;
import p181x0.InterfaceC7825c;
import p188y0.InterfaceC7894h;

/* renamed from: k2.a */
/* loaded from: classes3.dex */
public class C6627a implements InterfaceC6628b {

    /* renamed from: a */
    public C7826d f8682a;

    /* renamed from: k2.a$a */
    public class a implements InterfaceC7825c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC6629c f8683a;

        public a(InterfaceC6629c interfaceC6629c) {
            this.f8683a = interfaceC6629c;
        }

        @Override // p181x0.InterfaceC7825c
        /* renamed from: a */
        public boolean mo7603a(GlideException glideException, Object obj, InterfaceC7894h interfaceC7894h, boolean z6) {
            this.f8683a.mo4793b(null);
            return false;
        }

        @Override // p181x0.InterfaceC7825c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo7604b(Bitmap bitmap, Object obj, InterfaceC7894h interfaceC7894h, DataSource dataSource, boolean z6) {
            this.f8683a.mo4794c();
            return false;
        }
    }

    /* renamed from: k2.a$b */
    public class b implements InterfaceC7825c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC6629c f8685a;

        public b(InterfaceC6629c interfaceC6629c) {
            this.f8685a = interfaceC6629c;
        }

        @Override // p181x0.InterfaceC7825c
        /* renamed from: a */
        public boolean mo7603a(GlideException glideException, Object obj, InterfaceC7894h interfaceC7894h, boolean z6) {
            this.f8685a.mo4793b(null);
            return false;
        }

        @Override // p181x0.InterfaceC7825c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo7604b(GifDrawable gifDrawable, Object obj, InterfaceC7894h interfaceC7894h, DataSource dataSource, boolean z6) {
            this.f8685a.mo4794c();
            return false;
        }
    }

    public C6627a() {
        this((C7826d) ((C7826d) new C7826d().mo7359l(R$drawable.xui_ic_no_img)).mo7356j(AbstractC6433c.f8112a));
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: a */
    public void mo7477a(Context context) {
        ComponentCallbacks2C4678c.m2470c(context).m2479b();
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: b */
    public void mo7478b(Fragment fragment) {
        ComponentCallbacks2C4678c.m2478v(fragment).onStop();
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: c */
    public void mo7479c(Fragment fragment, String str, ImageView imageView, InterfaceC6629c interfaceC6629c) {
        ComponentCallbacks2C4678c.m2478v(fragment).mo2537m().mo2514b(this.f8682a).mo2510A0(str).mo2529y0(new b(interfaceC6629c)).m2527w0(imageView);
    }

    @Override // p090k2.InterfaceC6628b
    /* renamed from: d */
    public void mo7480d(Fragment fragment, String str, ImageView imageView, InterfaceC6629c interfaceC6629c) {
        ComponentCallbacks2C4678c.m2478v(fragment).mo2535k().mo2514b(this.f8682a).mo2510A0(str).mo2529y0(new a(interfaceC6629c)).m2527w0(imageView);
    }

    public C6627a(C7826d c7826d) {
        this.f8682a = c7826d;
    }
}
