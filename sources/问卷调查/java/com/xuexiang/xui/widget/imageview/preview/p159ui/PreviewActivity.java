package com.xuexiang.xui.widget.imageview.preview.p159ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000a.p005b.p006c.ActivityC0021g;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.AbstractC0311h0;
import p000a.p052k.p053b.AbstractC0319l0;
import p000a.p052k.p053b.C0294a;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p068t.p069a.C0446b;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.p116e.p128f.p133c.C0829a;
import p070b.p113c.p114a.p116e.p128f.p133c.EnumC0830b;
import p070b.p113c.p114a.p116e.p128f.p133c.p134c.InterfaceC0831a;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0842h;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0843i;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.ViewTreeObserverOnGlobalLayoutListenerC0844j;

/* loaded from: classes.dex */
public class PreviewActivity extends ActivityC0021g {

    /* renamed from: x */
    public static final /* synthetic */ int f5220x = 0;

    /* renamed from: p */
    public List<InterfaceC0831a> f5222p;

    /* renamed from: q */
    public int f5223q;

    /* renamed from: s */
    public PhotoViewPager f5225s;

    /* renamed from: t */
    public TextView f5226t;

    /* renamed from: u */
    public BezierBannerView f5227u;

    /* renamed from: v */
    public EnumC0830b f5228v;

    /* renamed from: o */
    public boolean f5221o = false;

    /* renamed from: r */
    public List<C0842h> f5224r = new ArrayList();

    /* renamed from: w */
    public boolean f5229w = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C0964a implements SmoothImageView.InterfaceC0976i {
        public C0964a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC0976i
        /* renamed from: a */
        public void mo2556a(SmoothImageView.EnumC0974g enumC0974g) {
            PreviewActivity previewActivity = PreviewActivity.this;
            int i = PreviewActivity.f5220x;
            previewActivity.finish();
            previewActivity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class C0965b extends AbstractC0311h0 {
        public C0965b(AbstractC0301c0 abstractC0301c0) {
            super(abstractC0301c0);
        }

        @Override // p000a.p068t.p069a.AbstractC0445a
        /* renamed from: a */
        public void mo1524a(ViewGroup viewGroup, int i, Object obj) {
            ComponentCallbacksC0320m componentCallbacksC0320m = (ComponentCallbacksC0320m) obj;
            if (this.f1882e == null) {
                this.f1882e = new C0294a(this.f1880c);
            }
            C0294a c0294a = (C0294a) this.f1882e;
            Objects.requireNonNull(c0294a);
            AbstractC0301c0 abstractC0301c0 = componentCallbacksC0320m.f1995t;
            if (abstractC0301c0 != null && abstractC0301c0 != c0294a.f1762p) {
                StringBuilder sbM2079g = C0561a.m2079g("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
                sbM2079g.append(componentCallbacksC0320m.toString());
                sbM2079g.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(sbM2079g.toString());
            }
            c0294a.m1129b(new AbstractC0319l0.a(6, componentCallbacksC0320m));
            if (componentCallbacksC0320m.equals(this.f1883f)) {
                this.f1883f = null;
            }
        }

        @Override // p000a.p068t.p069a.AbstractC0445a
        /* renamed from: c */
        public int mo1525c() {
            List<C0842h> list = PreviewActivity.this.f5224r;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        int i = C0842h.f4619c0;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m2761x();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, Resources.NotFoundException, InstantiationException {
        super.onCreate(bundle);
        this.f5222p = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f5223q = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f5228v = (EnumC0830b) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f5229w = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m2760w(this.f5222p, this.f5223q, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m2760w(this.f5222p, this.f5223q, C0842h.class);
        }
        setContentView(C1088R.layout.preview_activity_image_photo);
        this.f5225s = (PhotoViewPager) findViewById(C1088R.id.viewPager);
        this.f5225s.setAdapter(new C0965b(this.f2029i.f2114a.f2124e));
        this.f5225s.setCurrentItem(this.f5223q);
        this.f5225s.setOffscreenPageLimit(3);
        this.f5227u = (BezierBannerView) findViewById(C1088R.id.bezierBannerView);
        TextView textView = (TextView) findViewById(C1088R.id.tv_index);
        this.f5226t = textView;
        if (this.f5228v == EnumC0830b.Dot) {
            this.f5227u.setVisibility(0);
            BezierBannerView bezierBannerView = this.f5227u;
            PhotoViewPager photoViewPager = this.f5225s;
            Objects.requireNonNull(bezierBannerView);
            photoViewPager.mo1527b(bezierBannerView);
            if (photoViewPager.getAdapter() != null) {
                bezierBannerView.f5237A = photoViewPager.getAdapter().mo1525c();
            }
            bezierBannerView.f5272z = photoViewPager.getCurrentItem();
            bezierBannerView.m2766h();
            bezierBannerView.f5246J = 2;
            bezierBannerView.invalidate();
        } else {
            textView.setVisibility(0);
            this.f5226t.setText(getString(C1088R.string.xui_preview_count_string, new Object[]{Integer.valueOf(this.f5223q + 1), Integer.valueOf(m2759v())}));
            this.f5225s.mo1527b(new C0843i(this));
        }
        if (this.f5224r.size() == 1 && !this.f5229w) {
            this.f5227u.setVisibility(8);
            this.f5226t.setVisibility(8);
        }
        this.f5225s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0844j(this));
    }

    @Override // p000a.p005b.p006c.ActivityC0021g, p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C0829a.m2547e().f4608a.mo2549b(this);
        PhotoViewPager photoViewPager = this.f5225s;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            List<C0446b.i> list = this.f5225s.f2606S;
            if (list != null) {
                list.clear();
            }
            this.f5225s.removeAllViews();
            this.f5225s = null;
        }
        List<C0842h> list2 = this.f5224r;
        if (list2 != null) {
            list2.clear();
            this.f5224r = null;
        }
        List<InterfaceC0831a> list3 = this.f5222p;
        if (list3 != null) {
            list3.clear();
            this.f5222p = null;
        }
        super.onDestroy();
    }

    /* renamed from: v */
    public final int m2759v() {
        List<InterfaceC0831a> list = this.f5222p;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: w */
    public void m2760w(List<InterfaceC0831a> list, int i, Class<? extends C0842h> cls) throws IllegalAccessException, InstantiationException {
        C0842h c0842h;
        List<InterfaceC0831a> list2 = list;
        if (list2 == null) {
            finish();
            return;
        }
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (i2 < size) {
            List<C0842h> list3 = this.f5224r;
            InterfaceC0831a interfaceC0831a = list2.get(i2);
            boolean z2 = i == i2 ? true : z;
            boolean booleanExtra = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z);
            boolean booleanExtra2 = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", z);
            float floatExtra = getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f);
            int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", C1088R.color.xui_config_color_main_theme);
            int i3 = C0842h.f4619c0;
            try {
                c0842h = cls.newInstance();
            } catch (Exception unused) {
                c0842h = new C0842h();
            }
            int i4 = size;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", interfaceC0831a);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z2);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", booleanExtra);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", booleanExtra2);
            bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", floatExtra);
            bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", intExtra);
            c0842h.m1175p0(bundle);
            list3.add(c0842h);
            i2++;
            list2 = list;
            size = i4;
            z = false;
        }
    }

    /* renamed from: x */
    public void m2761x() {
        if (this.f5221o) {
            return;
        }
        this.f5221o = true;
        int currentItem = this.f5225s.getCurrentItem();
        if (currentItem >= m2759v()) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        C0842h c0842h = this.f5224r.get(currentItem);
        TextView textView = this.f5226t;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f5227u.setVisibility(8);
        }
        C0273v c0273vM862a = C0266o.m862a(c0842h.f4626b0);
        c0273vM862a.m886a(0.0f);
        c0273vM862a.m888c(500L);
        View view = c0273vM862a.f1632a.get();
        if (view != null) {
            view.animate().start();
        }
        c0842h.f4623Y.setBackgroundColor(0);
        c0842h.f4622X.m2772i(new C0964a());
    }
}
