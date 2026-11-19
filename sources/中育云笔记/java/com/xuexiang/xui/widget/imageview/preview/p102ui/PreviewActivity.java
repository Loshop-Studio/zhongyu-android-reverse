package com.xuexiang.xui.widget.imageview.preview.p102ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC8035a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p336s8.C11079a;

/* loaded from: classes5.dex */
public class PreviewActivity extends FragmentActivity {

    /* renamed from: d */
    public List f16268d;

    /* renamed from: e */
    public int f16269e;

    /* renamed from: g */
    public PhotoViewPager f16271g;

    /* renamed from: h */
    public TextView f16272h;

    /* renamed from: i */
    public BezierBannerView f16273i;

    /* renamed from: j */
    public PreviewBuilder$IndicatorType f16274j;

    /* renamed from: c */
    public boolean f16267c = false;

    /* renamed from: f */
    public List f16270f = new ArrayList();

    /* renamed from: k */
    public boolean f16275k = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C8149a implements ViewPager.OnPageChangeListener {
        public C8149a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) throws Resources.NotFoundException {
            if (PreviewActivity.this.f16272h != null) {
                PreviewActivity.this.f16272h.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i10 + 1), Integer.valueOf(PreviewActivity.this.m12874R())));
            }
            PreviewActivity.this.f16269e = i10;
            PreviewActivity.this.f16271g.setCurrentItem(PreviewActivity.this.f16269e, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC8150b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8150b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f16271g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC8035a.m12183a(PreviewActivity.this.f16270f, PreviewActivity.this.f16269e);
            if (basePhotoFragment != null) {
                basePhotoFragment.m12859w();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C8151c implements SmoothImageView.InterfaceC8164j {
        public C8151c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC8164j
        /* renamed from: a */
        public void mo12865a(SmoothImageView.Status status) {
            PreviewActivity.this.m12873Q();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C8152d extends FragmentPagerAdapter {
        public C8152d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            super.destroyItem(viewGroup, i10, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f16270f == null) {
                return 0;
            }
            return PreviewActivity.this.f16270f.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i10) {
            return (Fragment) PreviewActivity.this.f16270f.get(i10);
        }
    }

    private void initView() {
        this.f16271g = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f16271g.setAdapter(new C8152d(getSupportFragmentManager()));
        this.f16271g.setCurrentItem(this.f16269e);
        this.f16271g.setOffscreenPageLimit(3);
        this.f16273i = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f16272h = textView;
        if (this.f16274j == PreviewBuilder$IndicatorType.Dot) {
            this.f16273i.setVisibility(0);
            this.f16273i.m12882a(this.f16271g);
        } else {
            textView.setVisibility(0);
            this.f16272h.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f16269e + 1), Integer.valueOf(m12874R())));
            this.f16271g.addOnPageChangeListener(new C8149a());
        }
        if (this.f16270f.size() == 1 && !this.f16275k) {
            this.f16273i.setVisibility(8);
            this.f16272h.setVisibility(8);
        }
        this.f16271g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8150b());
    }

    /* renamed from: Q */
    public final void m12873Q() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: R */
    public final int m12874R() {
        return AbstractC8035a.m12184b(this.f16268d);
    }

    /* renamed from: S */
    public final void m12875S() {
        this.f16268d = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f16269e = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f16274j = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f16275k = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m12876T(this.f16268d, this.f16269e, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m12876T(this.f16268d, this.f16269e, BasePhotoFragment.class);
        }
    }

    /* renamed from: T */
    public void m12876T(List list, int i10, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            Class cls2 = cls;
            this.f16270f.add(BasePhotoFragment.m12854u(cls2, (IPreviewInfo) list.get(i11), i10 == i11, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i11++;
            cls = cls2;
        }
    }

    /* renamed from: U */
    public void m12877U() {
        if (this.f16267c) {
            return;
        }
        this.f16267c = true;
        int currentItem = this.f16271g.getCurrentItem();
        if (currentItem >= m12874R()) {
            m12873Q();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f16270f.get(currentItem);
        TextView textView = this.f16272h;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f16273i.setVisibility(8);
        }
        basePhotoFragment.m12856q(0);
        basePhotoFragment.m12860y(new C8151c());
    }

    @Override // android.app.Activity
    public void finish() {
        int i10 = BasePhotoFragment.f16252k;
        super.finish();
    }

    public int getLayoutId() {
        return 0;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m12877U();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12875S();
        if (getLayoutId() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(getLayoutId());
        }
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C11079a.m24625e().mo24626a(this);
        PhotoViewPager photoViewPager = this.f16271g;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f16271g.clearOnPageChangeListeners();
            this.f16271g.removeAllViews();
            this.f16271g = null;
        }
        List list = this.f16270f;
        if (list != null) {
            list.clear();
            this.f16270f = null;
        }
        List list2 = this.f16268d;
        if (list2 != null) {
            list2.clear();
            this.f16268d = null;
        }
        super.onDestroy();
    }
}
