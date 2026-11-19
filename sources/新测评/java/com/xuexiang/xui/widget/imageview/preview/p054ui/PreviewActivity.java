package com.xuexiang.xui.widget.imageview.preview.p054ui;

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
import com.xuexiang.xui.utils.AbstractC6476a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p119i3.C7660a;

/* loaded from: classes4.dex */
public class PreviewActivity extends AppCompatActivity {

    /* renamed from: b */
    public List f6404b;

    /* renamed from: c */
    public int f6405c;

    /* renamed from: e */
    public PhotoViewPager f6407e;

    /* renamed from: f */
    public TextView f6408f;

    /* renamed from: g */
    public BezierBannerView f6409g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f6410h;

    /* renamed from: a */
    public boolean f6403a = false;

    /* renamed from: d */
    public List f6406d = new ArrayList();

    /* renamed from: i */
    public boolean f6411i = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C6537a implements ViewPager.OnPageChangeListener {
        public C6537a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) throws Resources.NotFoundException {
            if (PreviewActivity.this.f6408f != null) {
                PreviewActivity.this.f6408f.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i10 + 1), Integer.valueOf(PreviewActivity.this.m5788u())));
            }
            PreviewActivity.this.f6405c = i10;
            PreviewActivity.this.f6407e.setCurrentItem(PreviewActivity.this.f6405c, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC6538b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC6538b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f6407e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC6476a.m5338a(PreviewActivity.this.f6406d, PreviewActivity.this.f6405c);
            if (basePhotoFragment != null) {
                basePhotoFragment.m5772k();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C6539c implements SmoothImageView.InterfaceC6552j {
        public C6539c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6552j
        /* renamed from: a */
        public void mo5778a(SmoothImageView.Status status) {
            PreviewActivity.this.m5787t();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C6540d extends FragmentPagerAdapter {
        public C6540d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            super.destroyItem(viewGroup, i10, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f6406d == null) {
                return 0;
            }
            return PreviewActivity.this.f6406d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i10) {
            return (Fragment) PreviewActivity.this.f6406d.get(i10);
        }
    }

    /* renamed from: y */
    private void m5786y() throws Resources.NotFoundException {
        this.f6407e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f6407e.setAdapter(new C6540d(getSupportFragmentManager()));
        this.f6407e.setCurrentItem(this.f6405c);
        this.f6407e.setOffscreenPageLimit(3);
        this.f6409g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f6408f = textView;
        if (this.f6410h == PreviewBuilder$IndicatorType.Dot) {
            this.f6409g.setVisibility(0);
            this.f6409g.m5796a(this.f6407e);
        } else {
            textView.setVisibility(0);
            this.f6408f.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f6405c + 1), Integer.valueOf(m5788u())));
            this.f6407e.addOnPageChangeListener(new C6537a());
        }
        if (this.f6406d.size() == 1 && !this.f6411i) {
            this.f6409g.setVisibility(8);
            this.f6408f.setVisibility(8);
        }
        this.f6407e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6538b());
    }

    @Override // android.app.Activity
    public void finish() {
        int i10 = BasePhotoFragment.f6388h;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m5792z();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        m5790w();
        if (m5789v() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(m5789v());
        }
        m5786y();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C7660a.m12728e().mo12729a(this);
        PhotoViewPager photoViewPager = this.f6407e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f6407e.clearOnPageChangeListeners();
            this.f6407e.removeAllViews();
            this.f6407e = null;
        }
        List list = this.f6406d;
        if (list != null) {
            list.clear();
            this.f6406d = null;
        }
        List list2 = this.f6404b;
        if (list2 != null) {
            list2.clear();
            this.f6404b = null;
        }
        super.onDestroy();
    }

    /* renamed from: t */
    public final void m5787t() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: u */
    public final int m5788u() {
        return AbstractC6476a.m5339b(this.f6404b);
    }

    /* renamed from: v */
    public int m5789v() {
        return 0;
    }

    /* renamed from: w */
    public final void m5790w() {
        this.f6404b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f6405c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f6410h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f6411i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m5791x(this.f6404b, this.f6405c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m5791x(this.f6404b, this.f6405c, BasePhotoFragment.class);
        }
    }

    /* renamed from: x */
    public void m5791x(List list, int i10, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            Class cls2 = cls;
            this.f6406d.add(BasePhotoFragment.m5767i(cls2, (IPreviewInfo) list.get(i11), i10 == i11, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i11++;
            cls = cls2;
        }
    }

    /* renamed from: z */
    public void m5792z() {
        if (this.f6403a) {
            return;
        }
        this.f6403a = true;
        int currentItem = this.f6407e.getCurrentItem();
        if (currentItem >= m5788u()) {
            m5787t();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f6406d.get(currentItem);
        TextView textView = this.f6408f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f6409g.setVisibility(8);
        }
        basePhotoFragment.m5769e(0);
        basePhotoFragment.m5773m(new C6539c());
    }
}
