package p002a1;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p016c0.C2753d;
import p016c0.InterfaceC2752c;
import p047d0.InterfaceC3698h;
import p093m.AbstractC4354c;

/* renamed from: a1.a */
/* loaded from: classes2.dex */
public class C0006a implements InterfaceC0007b {

    /* renamed from: a */
    public C2753d f1a;

    /* renamed from: a1.a$a */
    public class a implements InterfaceC2752c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0008c f2a;

        public a(InterfaceC0008c interfaceC0008c) {
            this.f2a = interfaceC0008c;
        }

        @Override // p016c0.InterfaceC2752c
        /* renamed from: b */
        public boolean mo13b(GlideException glideException, Object obj, InterfaceC3698h interfaceC3698h, boolean z3) {
            this.f2a.mo16a(null);
            return false;
        }

        @Override // p016c0.InterfaceC2752c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo12a(Bitmap bitmap, Object obj, InterfaceC3698h interfaceC3698h, DataSource dataSource, boolean z3) {
            this.f2a.mo17b();
            return false;
        }
    }

    /* renamed from: a1.a$b */
    public class b implements InterfaceC2752c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0008c f4a;

        public b(InterfaceC0008c interfaceC0008c) {
            this.f4a = interfaceC0008c;
        }

        @Override // p016c0.InterfaceC2752c
        /* renamed from: b */
        public boolean mo13b(GlideException glideException, Object obj, InterfaceC3698h interfaceC3698h, boolean z3) {
            this.f4a.mo16a(null);
            return false;
        }

        @Override // p016c0.InterfaceC2752c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo12a(GifDrawable gifDrawable, Object obj, InterfaceC3698h interfaceC3698h, DataSource dataSource, boolean z3) {
            this.f4a.mo17b();
            return false;
        }
    }

    public C0006a() {
        this((C2753d) ((C2753d) new C2753d().m1596j(R$drawable.xui_ic_no_img)).m1592h(AbstractC4354c.f4865a));
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: a */
    public void mo8a(Fragment fragment, String str, ImageView imageView, InterfaceC0008c interfaceC0008c) {
        ComponentCallbacks2C2858c.m1688v(fragment).m1734k().mo1579a(this.f1a).m1730z0(str).m1728x0(new a(interfaceC0008c)).m1726v0(imageView);
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: b */
    public void mo9b(Context context) {
        ComponentCallbacks2C2858c.m1680c(context).m1689b();
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: c */
    public void mo10c(Fragment fragment) {
        ComponentCallbacks2C2858c.m1688v(fragment).onStop();
    }

    @Override // p002a1.InterfaceC0007b
    /* renamed from: d */
    public void mo11d(Fragment fragment, String str, ImageView imageView, InterfaceC0008c interfaceC0008c) {
        ComponentCallbacks2C2858c.m1688v(fragment).m1736m().mo1579a(this.f1a).m1730z0(str).m1728x0(new b(interfaceC0008c)).m1726v0(imageView);
    }

    public C0006a(C2753d c2753d) {
        this.f1a = c2753d;
    }
}
