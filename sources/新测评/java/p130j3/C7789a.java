package p130j3;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p073e1.C7327d;
import p073e1.InterfaceC7326c;
import p084f1.InterfaceC7431h;
import p184o0.AbstractC8683c;

/* renamed from: j3.a */
/* loaded from: classes4.dex */
public class C7789a implements InterfaceC7790b {

    /* renamed from: a */
    public C7327d f13434a;

    /* renamed from: j3.a$a */
    public class a implements InterfaceC7326c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7791c f13435a;

        public a(InterfaceC7791c interfaceC7791c) {
            this.f13435a = interfaceC7791c;
        }

        @Override // p073e1.InterfaceC7326c
        /* renamed from: b */
        public boolean mo11704b(GlideException glideException, Object obj, InterfaceC7431h interfaceC7431h, boolean z9) {
            this.f13435a.mo5775b(null);
            return false;
        }

        @Override // p073e1.InterfaceC7326c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo11703a(Bitmap bitmap, Object obj, InterfaceC7431h interfaceC7431h, DataSource dataSource, boolean z9) {
            this.f13435a.mo5774a();
            return false;
        }
    }

    /* renamed from: j3.a$b */
    public class b implements InterfaceC7326c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7791c f13437a;

        public b(InterfaceC7791c interfaceC7791c) {
            this.f13437a = interfaceC7791c;
        }

        @Override // p073e1.InterfaceC7326c
        /* renamed from: b */
        public boolean mo11704b(GlideException glideException, Object obj, InterfaceC7431h interfaceC7431h, boolean z9) {
            this.f13437a.mo5775b(null);
            return false;
        }

        @Override // p073e1.InterfaceC7326c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo11703a(GifDrawable gifDrawable, Object obj, InterfaceC7431h interfaceC7431h, DataSource dataSource, boolean z9) {
            this.f13437a.mo5774a();
            return false;
        }
    }

    public C7789a() {
        this((C7327d) ((C7327d) new C7327d().m11687k(R$drawable.xui_ic_no_img)).m11682h(AbstractC8683c.f14422a));
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: a */
    public void mo12729a(Context context) {
        ComponentCallbacks2C5342b.m3291c(context).m3300b();
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: b */
    public void mo12730b(Fragment fragment) {
        ComponentCallbacks2C5342b.m3299v(fragment).onStop();
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: c */
    public void mo12731c(Fragment fragment, String str, ImageView imageView, InterfaceC7791c interfaceC7791c) {
        ComponentCallbacks2C5342b.m3299v(fragment).m3354j().mo3335b(this.f13434a).m3331A0(str).m3350y0(new a(interfaceC7791c)).m3348w0(imageView);
    }

    @Override // p130j3.InterfaceC7790b
    /* renamed from: d */
    public void mo12732d(Fragment fragment, String str, ImageView imageView, InterfaceC7791c interfaceC7791c) {
        ComponentCallbacks2C5342b.m3299v(fragment).m3356l().mo3335b(this.f13434a).m3331A0(str).m3350y0(new b(interfaceC7791c)).m3348w0(imageView);
    }

    public C7789a(C7327d c7327d) {
        this.f13434a = c7327d;
    }
}
