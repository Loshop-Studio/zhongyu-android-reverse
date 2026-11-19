package p070b.p113c.p114a.p116e.p128f.p133c.p135d;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p052k.p053b.ComponentCallbacksC0320m;

/* renamed from: b.c.a.e.f.c.d.a */
/* loaded from: classes.dex */
public class C0832a implements InterfaceC0833b {

    /* renamed from: a */
    public RequestOptions f4612a = new RequestOptions().error(C1088R.drawable.xui_ic_no_img).diskCacheStrategy(DiskCacheStrategy.ALL);

    /* renamed from: b.c.a.e.f.c.d.a$a */
    public class a implements RequestListener<Bitmap> {
        public a(C0832a c0832a, InterfaceC0834c interfaceC0834c) {
        }
    }

    /* renamed from: b.c.a.e.f.c.d.a$b */
    public class b implements RequestListener<GifDrawable> {
        public b(C0832a c0832a, InterfaceC0834c interfaceC0834c) {
        }
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: a */
    public void mo2548a(ComponentCallbacksC0320m componentCallbacksC0320m) {
        Glide.with(componentCallbacksC0320m).onStop();
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: b */
    public void mo2549b(Context context) {
        Glide.get(context).clearMemory();
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: c */
    public void mo2550c(ComponentCallbacksC0320m componentCallbacksC0320m, String str, ImageView imageView, InterfaceC0834c interfaceC0834c) {
        Glide.with(componentCallbacksC0320m).asBitmap().apply(this.f4612a).load(str).listener(new a(this, interfaceC0834c)).into(imageView);
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0833b
    /* renamed from: d */
    public void mo2551d(ComponentCallbacksC0320m componentCallbacksC0320m, String str, ImageView imageView, InterfaceC0834c interfaceC0834c) {
        Glide.with(componentCallbacksC0320m).asGif().apply(this.f4612a).load(str).listener(new b(this, interfaceC0834c)).into(imageView);
    }
}
