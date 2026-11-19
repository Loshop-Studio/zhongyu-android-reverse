package com.xuexiang.xui.widget.imageview.preview.p043ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.core.AnimationConstants;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC3526a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p147z0.C4705a;

/* loaded from: classes2.dex */
public class PreviewActivity extends AppCompatActivity {

    /* renamed from: b */
    public List f3608b;

    /* renamed from: c */
    public int f3609c;

    /* renamed from: e */
    public PhotoViewPager f3611e;

    /* renamed from: f */
    public TextView f3612f;

    /* renamed from: g */
    public BezierBannerView f3613g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f3614h;

    /* renamed from: a */
    public boolean f3607a = false;

    /* renamed from: d */
    public List f3610d = new ArrayList();

    /* renamed from: i */
    public boolean f3615i = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C3577a implements ViewPager.OnPageChangeListener {
        public C3577a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f4, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) throws Resources.NotFoundException {
            if (PreviewActivity.this.f3612f != null) {
                PreviewActivity.this.f3612f.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i4 + 1), Integer.valueOf(PreviewActivity.this.m4428q())));
            }
            PreviewActivity.this.f3609c = i4;
            PreviewActivity.this.f3611e.setCurrentItem(PreviewActivity.this.f3609c, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC3578b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC3578b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f3611e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC3526a.m4044a(PreviewActivity.this.f3610d, PreviewActivity.this.f3609c);
            if (basePhotoFragment != null) {
                basePhotoFragment.m4414i();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C3579c implements SmoothImageView.InterfaceC3592j {
        public C3579c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC3592j
        /* renamed from: a */
        public void mo4419a(SmoothImageView.Status status) {
            PreviewActivity.this.m4427p();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C3580d extends FragmentPagerAdapter {
        public C3580d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            super.destroyItem(viewGroup, i4, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f3610d == null) {
                return 0;
            }
            return PreviewActivity.this.f3610d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return (Fragment) PreviewActivity.this.f3610d.get(i4);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        int i4 = BasePhotoFragment.f3592h;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m4433v();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        m4430s();
        if (m4429r() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(m4429r());
        }
        m4432u();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C4705a.m6708e().mo9b(this);
        PhotoViewPager photoViewPager = this.f3611e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f3611e.clearOnPageChangeListeners();
            this.f3611e.removeAllViews();
            this.f3611e = null;
        }
        List list = this.f3610d;
        if (list != null) {
            list.clear();
            this.f3610d = null;
        }
        List list2 = this.f3608b;
        if (list2 != null) {
            list2.clear();
            this.f3608b = null;
        }
        super.onDestroy();
    }

    /* renamed from: p */
    public final void m4427p() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: q */
    public final int m4428q() {
        return AbstractC3526a.m4045b(this.f3608b);
    }

    /* renamed from: r */
    public int m4429r() {
        return 0;
    }

    /* renamed from: s */
    public final void m4430s() {
        this.f3608b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f3609c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f3614h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f3615i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", AnimationConstants.DefaultDurationMillis);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m4431t(this.f3608b, this.f3609c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m4431t(this.f3608b, this.f3609c, BasePhotoFragment.class);
        }
    }

    /* renamed from: t */
    public void m4431t(List list, int i4, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            this.f3610d.add(BasePhotoFragment.m4409g(cls, (IPreviewInfo) list.get(i5), i4 == i5, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i5++;
        }
    }

    /* renamed from: u */
    public final void m4432u() throws Resources.NotFoundException {
        this.f3611e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f3611e.setAdapter(new C3580d(getSupportFragmentManager()));
        this.f3611e.setCurrentItem(this.f3609c);
        this.f3611e.setOffscreenPageLimit(3);
        this.f3613g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f3612f = textView;
        if (this.f3614h == PreviewBuilder$IndicatorType.Dot) {
            this.f3613g.setVisibility(0);
            this.f3613g.m4437a(this.f3611e);
        } else {
            textView.setVisibility(0);
            this.f3612f.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f3609c + 1), Integer.valueOf(m4428q())));
            this.f3611e.addOnPageChangeListener(new C3577a());
        }
        if (this.f3610d.size() == 1 && !this.f3615i) {
            this.f3613g.setVisibility(8);
            this.f3612f.setVisibility(8);
        }
        this.f3611e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3578b());
    }

    /* renamed from: v */
    public void m4433v() {
        if (this.f3607a) {
            return;
        }
        this.f3607a = true;
        int currentItem = this.f3611e.getCurrentItem();
        if (currentItem >= m4428q()) {
            m4427p();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f3610d.get(currentItem);
        TextView textView = this.f3612f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f3613g.setVisibility(8);
        }
        basePhotoFragment.m4410c(0);
        basePhotoFragment.m4416k(new C3579c());
    }
}
