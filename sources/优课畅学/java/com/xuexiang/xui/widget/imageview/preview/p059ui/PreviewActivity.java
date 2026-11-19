package com.xuexiang.xui.widget.imageview.preview.p059ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC6871a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p118h2.C8709a;

/* loaded from: classes4.dex */
public class PreviewActivity extends AppCompatActivity {

    /* renamed from: b */
    public List f7821b;

    /* renamed from: c */
    public int f7822c;

    /* renamed from: e */
    public PhotoViewPager f7824e;

    /* renamed from: f */
    public TextView f7825f;

    /* renamed from: g */
    public BezierBannerView f7826g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f7827h;

    /* renamed from: a */
    public boolean f7820a = false;

    /* renamed from: d */
    public List f7823d = new ArrayList();

    /* renamed from: i */
    public boolean f7828i = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C6943a implements ViewPager.OnPageChangeListener {
        public C6943a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) throws Resources.NotFoundException {
            if (PreviewActivity.this.f7825f != null) {
                PreviewActivity.this.f7825f.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i10 + 1), Integer.valueOf(PreviewActivity.this.m6982u())));
            }
            PreviewActivity.this.f7822c = i10;
            PreviewActivity.this.f7824e.setCurrentItem(PreviewActivity.this.f7822c, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC6944b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC6944b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f7824e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC6871a.m6422a(PreviewActivity.this.f7823d, PreviewActivity.this.f7822c);
            if (basePhotoFragment != null) {
                basePhotoFragment.m6966n();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C6945c implements SmoothImageView.InterfaceC6958j {
        public C6945c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6958j
        /* renamed from: a */
        public void mo6972a(SmoothImageView.Status status) {
            PreviewActivity.this.m6981t();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C6946d extends FragmentPagerAdapter {
        public C6946d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            super.destroyItem(viewGroup, i10, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f7823d == null) {
                return 0;
            }
            return PreviewActivity.this.f7823d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i10) {
            return (Fragment) PreviewActivity.this.f7823d.get(i10);
        }
    }

    /* renamed from: y */
    private void m6980y() throws Resources.NotFoundException {
        this.f7824e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f7824e.setAdapter(new C6946d(getSupportFragmentManager()));
        this.f7824e.setCurrentItem(this.f7822c);
        this.f7824e.setOffscreenPageLimit(3);
        this.f7826g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f7825f = textView;
        if (this.f7827h == PreviewBuilder$IndicatorType.Dot) {
            this.f7826g.setVisibility(0);
            this.f7826g.m6990a(this.f7824e);
        } else {
            textView.setVisibility(0);
            this.f7825f.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f7822c + 1), Integer.valueOf(m6982u())));
            this.f7824e.addOnPageChangeListener(new C6943a());
        }
        if (this.f7823d.size() == 1 && !this.f7828i) {
            this.f7826g.setVisibility(8);
            this.f7825f.setVisibility(8);
        }
        this.f7824e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6944b());
    }

    @Override // android.app.Activity
    public void finish() {
        int i10 = BasePhotoFragment.f7805h;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m6986z();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        m6984w();
        if (m6983v() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(m6983v());
        }
        m6980y();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C8709a.m14209e().mo14210a(this);
        PhotoViewPager photoViewPager = this.f7824e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f7824e.clearOnPageChangeListeners();
            this.f7824e.removeAllViews();
            this.f7824e = null;
        }
        List list = this.f7823d;
        if (list != null) {
            list.clear();
            this.f7823d = null;
        }
        List list2 = this.f7821b;
        if (list2 != null) {
            list2.clear();
            this.f7821b = null;
        }
        super.onDestroy();
    }

    /* renamed from: t */
    public final void m6981t() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: u */
    public final int m6982u() {
        return AbstractC6871a.m6423b(this.f7821b);
    }

    /* renamed from: v */
    public int m6983v() {
        return 0;
    }

    /* renamed from: w */
    public final void m6984w() {
        this.f7821b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f7822c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f7827h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f7828i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m6985x(this.f7821b, this.f7822c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m6985x(this.f7821b, this.f7822c, BasePhotoFragment.class);
        }
    }

    /* renamed from: x */
    public void m6985x(List list, int i10, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            Class cls2 = cls;
            this.f7823d.add(BasePhotoFragment.m6961l(cls2, (IPreviewInfo) list.get(i11), i10 == i11, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i11++;
            cls = cls2;
        }
    }

    /* renamed from: z */
    public void m6986z() {
        if (this.f7820a) {
            return;
        }
        this.f7820a = true;
        int currentItem = this.f7824e.getCurrentItem();
        if (currentItem >= m6982u()) {
            m6981t();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f7823d.get(currentItem);
        TextView textView = this.f7825f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f7826g.setVisibility(8);
        }
        basePhotoFragment.m6963h(0);
        basePhotoFragment.m6967p(new C6945c());
    }
}
