package p129i2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.R$drawable;
import p069d0.C8272d;
import p069d0.InterfaceC8271c;
import p081e0.InterfaceC8344i;
import p182n.AbstractC9350c;

/* renamed from: i2.a */
/* loaded from: classes4.dex */
public class C8753a implements InterfaceC8754b {

    /* renamed from: a */
    public C8272d f16410a;

    /* renamed from: i2.a$a */
    public class a implements InterfaceC8271c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8755c f16411a;

        public a(InterfaceC8755c interfaceC8755c) {
            this.f16411a = interfaceC8755c;
        }

        @Override // p069d0.InterfaceC8271c
        /* renamed from: b */
        public boolean mo13413b(GlideException glideException, Object obj, InterfaceC8344i interfaceC8344i, boolean z10) {
            this.f16411a.mo6968a(null);
            return false;
        }

        @Override // p069d0.InterfaceC8271c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo13412a(Bitmap bitmap, Object obj, InterfaceC8344i interfaceC8344i, DataSource dataSource, boolean z10) {
            this.f16411a.mo6969b();
            return false;
        }
    }

    /* renamed from: i2.a$b */
    public class b implements InterfaceC8271c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8755c f16413a;

        public b(InterfaceC8755c interfaceC8755c) {
            this.f16413a = interfaceC8755c;
        }

        @Override // p069d0.InterfaceC8271c
        /* renamed from: b */
        public boolean mo13413b(GlideException glideException, Object obj, InterfaceC8344i interfaceC8344i, boolean z10) {
            this.f16413a.mo6968a(null);
            return false;
        }

        @Override // p069d0.InterfaceC8271c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo13412a(GifDrawable gifDrawable, Object obj, InterfaceC8344i interfaceC8344i, DataSource dataSource, boolean z10) {
            this.f16413a.mo6969b();
            return false;
        }
    }

    public C8753a() {
        this((C8272d) ((C8272d) new C8272d().m13397l(R$drawable.xui_ic_no_img)).m13393j(AbstractC9350c.f18464a));
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: a */
    public void mo14210a(Context context) {
        ComponentCallbacks2C5391b.m2732c(context).m2741b();
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: b */
    public void mo14211b(Fragment fragment) {
        ComponentCallbacks2C5391b.m2740v(fragment).onStop();
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: c */
    public void mo14212c(Fragment fragment, String str, ImageView imageView, InterfaceC8755c interfaceC8755c) {
        ComponentCallbacks2C5391b.m2740v(fragment).m2800l().mo2777c(this.f16410a).m2773B0(str).m2792y0(new b(interfaceC8755c)).m2790w0(imageView);
    }

    @Override // p129i2.InterfaceC8754b
    /* renamed from: d */
    public void mo14213d(Fragment fragment, String str, ImageView imageView, InterfaceC8755c interfaceC8755c) {
        ComponentCallbacks2C5391b.m2740v(fragment).m2798j().mo2777c(this.f16410a).m2773B0(str).m2792y0(new a(interfaceC8755c)).m2790w0(imageView);
    }

    public C8753a(C8272d c8272d) {
        this.f16410a = c8272d;
    }
}
