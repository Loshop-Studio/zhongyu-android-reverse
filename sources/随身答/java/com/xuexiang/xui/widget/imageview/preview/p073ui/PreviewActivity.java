package com.xuexiang.xui.widget.imageview.preview.p073ui;

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
import com.xuexiang.xui.utils.AbstractC6795a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p301y3.C9947a;

/* loaded from: classes4.dex */
public class PreviewActivity extends AppCompatActivity {

    /* renamed from: b */
    public List f7662b;

    /* renamed from: c */
    public int f7663c;

    /* renamed from: e */
    public PhotoViewPager f7665e;

    /* renamed from: f */
    public TextView f7666f;

    /* renamed from: g */
    public BezierBannerView f7667g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f7668h;

    /* renamed from: a */
    public boolean f7661a = false;

    /* renamed from: d */
    public List f7664d = new ArrayList();

    /* renamed from: i */
    public boolean f7669i = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C6857a implements ViewPager.OnPageChangeListener {
        public C6857a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i9, float f10, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i9) throws Resources.NotFoundException {
            if (PreviewActivity.this.f7666f != null) {
                PreviewActivity.this.f7666f.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i9 + 1), Integer.valueOf(PreviewActivity.this.m6894u())));
            }
            PreviewActivity.this.f7663c = i9;
            PreviewActivity.this.f7665e.setCurrentItem(PreviewActivity.this.f7663c, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC6858b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC6858b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f7665e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC6795a.m6438a(PreviewActivity.this.f7664d, PreviewActivity.this.f7663c);
            if (basePhotoFragment != null) {
                basePhotoFragment.m6878k();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C6859c implements SmoothImageView.InterfaceC6872j {
        public C6859c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6872j
        /* renamed from: a */
        public void mo6884a(SmoothImageView.Status status) {
            PreviewActivity.this.m6893t();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C6860d extends FragmentPagerAdapter {
        public C6860d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
            super.destroyItem(viewGroup, i9, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f7664d == null) {
                return 0;
            }
            return PreviewActivity.this.f7664d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i9) {
            return (Fragment) PreviewActivity.this.f7664d.get(i9);
        }
    }

    /* renamed from: y */
    private void m6892y() throws Resources.NotFoundException {
        this.f7665e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f7665e.setAdapter(new C6860d(getSupportFragmentManager()));
        this.f7665e.setCurrentItem(this.f7663c);
        this.f7665e.setOffscreenPageLimit(3);
        this.f7667g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f7666f = textView;
        if (this.f7668h == PreviewBuilder$IndicatorType.Dot) {
            this.f7667g.setVisibility(0);
            this.f7667g.m6902a(this.f7665e);
        } else {
            textView.setVisibility(0);
            this.f7666f.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f7663c + 1), Integer.valueOf(m6894u())));
            this.f7665e.addOnPageChangeListener(new C6857a());
        }
        if (this.f7664d.size() == 1 && !this.f7669i) {
            this.f7667g.setVisibility(8);
            this.f7666f.setVisibility(8);
        }
        this.f7665e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6858b());
    }

    @Override // android.app.Activity
    public void finish() {
        int i9 = BasePhotoFragment.f7646h;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m6898z();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        m6896w();
        if (m6895v() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(m6895v());
        }
        m6892y();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C9947a.m17150e().mo17151a(this);
        PhotoViewPager photoViewPager = this.f7665e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f7665e.clearOnPageChangeListeners();
            this.f7665e.removeAllViews();
            this.f7665e = null;
        }
        List list = this.f7664d;
        if (list != null) {
            list.clear();
            this.f7664d = null;
        }
        List list2 = this.f7662b;
        if (list2 != null) {
            list2.clear();
            this.f7662b = null;
        }
        super.onDestroy();
    }

    /* renamed from: t */
    public final void m6893t() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: u */
    public final int m6894u() {
        return AbstractC6795a.m6439b(this.f7662b);
    }

    /* renamed from: v */
    public int m6895v() {
        return 0;
    }

    /* renamed from: w */
    public final void m6896w() {
        this.f7662b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f7663c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f7668h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f7669i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m6897x(this.f7662b, this.f7663c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m6897x(this.f7662b, this.f7663c, BasePhotoFragment.class);
        }
    }

    /* renamed from: x */
    public void m6897x(List list, int i9, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Class cls2 = cls;
            this.f7664d.add(BasePhotoFragment.m6873i(cls2, (IPreviewInfo) list.get(i10), i9 == i10, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i10++;
            cls = cls2;
        }
    }

    /* renamed from: z */
    public void m6898z() {
        if (this.f7661a) {
            return;
        }
        this.f7661a = true;
        int currentItem = this.f7665e.getCurrentItem();
        if (currentItem >= m6894u()) {
            m6893t();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f7664d.get(currentItem);
        TextView textView = this.f7666f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f7667g.setVisibility(8);
        }
        basePhotoFragment.m6875e(0);
        basePhotoFragment.m6879m(new C6859c());
    }
}
