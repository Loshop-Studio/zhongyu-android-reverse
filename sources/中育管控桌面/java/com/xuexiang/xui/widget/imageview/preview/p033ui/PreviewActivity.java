package com.xuexiang.xui.widget.imageview.preview.p033ui;

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
import com.xuexiang.xui.utils.AbstractC5853a;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;
import p083j2.C6584a;

/* loaded from: classes3.dex */
public class PreviewActivity extends AppCompatActivity {

    /* renamed from: b */
    public List f5129b;

    /* renamed from: c */
    public int f5130c;

    /* renamed from: e */
    public PhotoViewPager f5132e;

    /* renamed from: f */
    public TextView f5133f;

    /* renamed from: g */
    public BezierBannerView f5134g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f5135h;

    /* renamed from: a */
    public boolean f5128a = false;

    /* renamed from: d */
    public List f5131d = new ArrayList();

    /* renamed from: i */
    public boolean f5136i = true;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$a */
    public class C5916a implements ViewPager.OnPageChangeListener {
        public C5916a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i6, float f6, int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i6) throws Resources.NotFoundException {
            if (PreviewActivity.this.f5133f != null) {
                PreviewActivity.this.f5133f.setText(PreviewActivity.this.getString(R$string.xui_preview_count_string, Integer.valueOf(i6 + 1), Integer.valueOf(PreviewActivity.this.m4807t())));
            }
            PreviewActivity.this.f5130c = i6;
            PreviewActivity.this.f5132e.setCurrentItem(PreviewActivity.this.f5130c, true);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC5917b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC5917b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PreviewActivity.this.f5132e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BasePhotoFragment basePhotoFragment = (BasePhotoFragment) AbstractC5853a.m4343a(PreviewActivity.this.f5131d, PreviewActivity.this.f5130c);
            if (basePhotoFragment != null) {
                basePhotoFragment.m4791n();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$c */
    public class C5918c implements SmoothImageView.InterfaceC5931j {
        public C5918c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC5931j
        /* renamed from: a */
        public void mo4797a(SmoothImageView.Status status) {
            PreviewActivity.this.m4806s();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity$d */
    public class C5919d extends FragmentPagerAdapter {
        public C5919d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i6, Object obj) {
            super.destroyItem(viewGroup, i6, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (PreviewActivity.this.f5131d == null) {
                return 0;
            }
            return PreviewActivity.this.f5131d.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i6) {
            return (Fragment) PreviewActivity.this.f5131d.get(i6);
        }
    }

    /* renamed from: x */
    private void m4805x() throws Resources.NotFoundException {
        this.f5132e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f5132e.setAdapter(new C5919d(getSupportFragmentManager()));
        this.f5132e.setCurrentItem(this.f5130c);
        this.f5132e.setOffscreenPageLimit(3);
        this.f5134g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f5133f = textView;
        if (this.f5135h == PreviewBuilder$IndicatorType.Dot) {
            this.f5134g.setVisibility(0);
            this.f5134g.m4815a(this.f5132e);
        } else {
            textView.setVisibility(0);
            this.f5133f.setText(getString(R$string.xui_preview_count_string, Integer.valueOf(this.f5130c + 1), Integer.valueOf(m4807t())));
            this.f5132e.addOnPageChangeListener(new C5916a());
        }
        if (this.f5131d.size() == 1 && !this.f5136i) {
            this.f5134g.setVisibility(8);
            this.f5133f.setVisibility(8);
        }
        this.f5132e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5917b());
    }

    @Override // android.app.Activity
    public void finish() {
        int i6 = BasePhotoFragment.f5113h;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m4811y();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        m4809v();
        if (m4808u() == 0) {
            setContentView(R$layout.preview_activity_image_photo);
        } else {
            setContentView(m4808u());
        }
        m4805x();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Resources.NotFoundException {
        C6584a.m7476e().mo7477a(this);
        PhotoViewPager photoViewPager = this.f5132e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f5132e.clearOnPageChangeListeners();
            this.f5132e.removeAllViews();
            this.f5132e = null;
        }
        List list = this.f5131d;
        if (list != null) {
            list.clear();
            this.f5131d = null;
        }
        List list2 = this.f5129b;
        if (list2 != null) {
            list2.clear();
            this.f5129b = null;
        }
        super.onDestroy();
    }

    /* renamed from: s */
    public final void m4806s() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: t */
    public final int m4807t() {
        return AbstractC5853a.m4344b(this.f5129b);
    }

    /* renamed from: u */
    public int m4808u() {
        return 0;
    }

    /* renamed from: v */
    public final void m4809v() {
        this.f5129b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f5130c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f5135h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f5136i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m4810w(this.f5129b, this.f5130c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m4810w(this.f5129b, this.f5130c, BasePhotoFragment.class);
        }
    }

    /* renamed from: w */
    public void m4810w(List list, int i6, Class cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            Class cls2 = cls;
            this.f5131d.add(BasePhotoFragment.m4786l(cls2, (IPreviewInfo) list.get(i7), i6 == i7, getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", false), getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", false), getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f), getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            i7++;
            cls = cls2;
        }
    }

    /* renamed from: y */
    public void m4811y() {
        if (this.f5128a) {
            return;
        }
        this.f5128a = true;
        int currentItem = this.f5132e.getCurrentItem();
        if (currentItem >= m4807t()) {
            m4806s();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f5131d.get(currentItem);
        TextView textView = this.f5133f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f5134g.setVisibility(8);
        }
        basePhotoFragment.m4788h(0);
        basePhotoFragment.m4792p(new C5918c());
    }
}
