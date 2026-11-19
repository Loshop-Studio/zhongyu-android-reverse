package p018b2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import java.util.List;
import p003a2.ViewOnClickListenerC0006a;
import p032c8.C3238c;
import p129o2.C6268a;

/* renamed from: b2.d */
/* loaded from: classes3.dex */
public final class C3104d extends PagerAdapter {

    /* renamed from: a */
    public final /* synthetic */ SimpleGuideBanner f1542a;

    public C3104d(SimpleGuideBanner simpleGuideBanner) {
        this.f1542a = simpleGuideBanner;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List list = this.f1542a.f4030e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        SimpleGuideBanner simpleGuideBanner = this.f1542a;
        View viewInflate = View.inflate(simpleGuideBanner.f4027b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f3920iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = simpleGuideBanner.f4030e.get(i);
        textView.setVisibility(i == 0 ? 0 : 8);
        textView2.setVisibility(i == simpleGuideBanner.f4030e.size() - 1 ? 0 : 8);
        if (C6268a.f10020c == null) {
            synchronized (C6268a.class) {
                try {
                    if (C6268a.f10020c == null) {
                        C6268a c6268a = new C6268a(0, false);
                        c6268a.f10022b = new C3238c();
                        C6268a.f10020c = c6268a;
                    }
                } finally {
                }
            }
        }
        ((C3238c) C6268a.f10020c.f10022b).getClass();
        C3412f c3412fM2383i = ComponentCallbacks2C3408b.m2362e(imageView.getContext()).m2383i(Drawable.class);
        c3412fM2383i.f2234w = obj;
        c3412fM2383i.f2236y = true;
        c3412fM2383i.m2378y(imageView);
        textView.setOnClickListener(new ViewOnClickListenerC0006a(simpleGuideBanner, 0));
        textView2.setOnClickListener(new ViewOnClickListenerC0006a(simpleGuideBanner, 1));
        viewInflate.setOnClickListener(new ViewOnClickListenerC3103c(this, i));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
