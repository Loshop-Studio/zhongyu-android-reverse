package com.xuexiang.xui.widget.imageview.preview.p034ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder$IndicatorType;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import p173u2.C6611a;
import p189w2.C6704c;
import p189w2.C6706e;
import p189w2.C6707f;
import p189w2.ViewTreeObserverOnGlobalLayoutListenerC6705d;

/* loaded from: classes3.dex */
public class PreviewActivity extends FragmentActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f4444j = 0;

    /* renamed from: b */
    public ArrayList f4446b;

    /* renamed from: c */
    public int f4447c;

    /* renamed from: e */
    public PhotoViewPager f4449e;

    /* renamed from: f */
    public TextView f4450f;

    /* renamed from: g */
    public BezierBannerView f4451g;

    /* renamed from: h */
    public PreviewBuilder$IndicatorType f4452h;

    /* renamed from: a */
    public boolean f4445a = false;

    /* renamed from: d */
    public ArrayList f4448d = new ArrayList();

    /* renamed from: i */
    public boolean f4453i = true;

    /* renamed from: o */
    public final void m3505o() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        m3507q();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        this.f4446b = getIntent().getParcelableArrayListExtra("com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS");
        this.f4447c = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_POSITION", -1);
        this.f4452h = (PreviewBuilder$IndicatorType) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_TYPE");
        this.f4453i = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_SHOW", true);
        int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_DURATION", 300);
        if (getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN", false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            m3506p(this.f4446b, this.f4447c, (Class) getIntent().getSerializableExtra("com.xuexiang.xui.widget.preview.KEY_CLASSNAME"));
        } catch (Exception unused) {
            m3506p(this.f4446b, this.f4447c, BasePhotoFragment.class);
        }
        setContentView(R$layout.preview_activity_image_photo);
        this.f4449e = (PhotoViewPager) findViewById(R$id.viewPager);
        this.f4449e.setAdapter(new C6707f(this, getSupportFragmentManager()));
        this.f4449e.setCurrentItem(this.f4447c);
        this.f4449e.setOffscreenPageLimit(3);
        this.f4451g = (BezierBannerView) findViewById(R$id.bezierBannerView);
        TextView textView = (TextView) findViewById(R$id.tv_index);
        this.f4450f = textView;
        if (this.f4452h == PreviewBuilder$IndicatorType.Dot) {
            this.f4451g.setVisibility(0);
            BezierBannerView bezierBannerView = this.f4451g;
            PhotoViewPager photoViewPager = this.f4449e;
            bezierBannerView.getClass();
            photoViewPager.addOnPageChangeListener(bezierBannerView);
            if (photoViewPager.getAdapter() != null) {
                bezierBannerView.f4491z = photoViewPager.getAdapter().getCount();
            }
            bezierBannerView.f4490y = photoViewPager.getCurrentItem();
            bezierBannerView.m3511d();
            bezierBannerView.f4464I = 2;
            bezierBannerView.invalidate();
        } else {
            textView.setVisibility(0);
            TextView textView2 = this.f4450f;
            int i = R$string.xui_preview_count_string;
            Integer numValueOf = Integer.valueOf(this.f4447c + 1);
            ArrayList arrayList = this.f4446b;
            textView2.setText(getString(i, numValueOf, Integer.valueOf(arrayList != null ? arrayList.size() : 0)));
            this.f4449e.addOnPageChangeListener(new C6704c(this));
        }
        if (this.f4448d.size() == 1 && !this.f4453i) {
            this.f4451g.setVisibility(8);
            this.f4450f.setVisibility(8);
        }
        this.f4449e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6705d(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() throws Resources.NotFoundException {
        C6611a.m6254a().f11042a.getClass();
        ComponentCallbacks2C3408b.m2360c(this).m2364b();
        PhotoViewPager photoViewPager = this.f4449e;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.f4449e.clearOnPageChangeListeners();
            this.f4449e.removeAllViews();
            this.f4449e = null;
        }
        ArrayList arrayList = this.f4448d;
        if (arrayList != null) {
            arrayList.clear();
            this.f4448d = null;
        }
        ArrayList arrayList2 = this.f4446b;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f4446b = null;
        }
        super.onDestroy();
    }

    /* renamed from: p */
    public final void m3506p(ArrayList arrayList, int i, Class cls) {
        BasePhotoFragment basePhotoFragment;
        ArrayList arrayList2 = arrayList;
        if (arrayList2 == null) {
            super.finish();
            return;
        }
        int size = arrayList2.size();
        boolean z8 = false;
        int i8 = 0;
        while (i8 < size) {
            ArrayList arrayList3 = this.f4448d;
            IPreviewInfo iPreviewInfo = (IPreviewInfo) arrayList2.get(i8);
            boolean z9 = i == i8 ? true : z8;
            boolean booleanExtra = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z8);
            boolean booleanExtra2 = getIntent().getBooleanExtra("com.xuexiang.xui.widget.preview.KEY_DRAG", z8);
            float floatExtra = getIntent().getFloatExtra("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", 0.5f);
            int intExtra = getIntent().getIntExtra("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme);
            try {
                basePhotoFragment = (BasePhotoFragment) cls.newInstance();
            } catch (Exception unused) {
                basePhotoFragment = new BasePhotoFragment();
            }
            int i9 = size;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", iPreviewInfo);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z9);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", booleanExtra);
            bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", booleanExtra2);
            bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", floatExtra);
            bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", intExtra);
            basePhotoFragment.setArguments(bundle);
            arrayList3.add(basePhotoFragment);
            i8++;
            arrayList2 = arrayList;
            size = i9;
            z8 = false;
        }
    }

    /* renamed from: q */
    public final void m3507q() {
        if (this.f4445a) {
            return;
        }
        this.f4445a = true;
        int currentItem = this.f4449e.getCurrentItem();
        ArrayList arrayList = this.f4446b;
        if (currentItem >= (arrayList != null ? arrayList.size() : 0)) {
            m3505o();
            return;
        }
        BasePhotoFragment basePhotoFragment = (BasePhotoFragment) this.f4448d.get(currentItem);
        TextView textView = this.f4450f;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.f4451g.setVisibility(8);
        }
        ViewCompat.animate(basePhotoFragment.f4443c).alpha(0.0f).setDuration(500L).start();
        basePhotoFragment.f4442b.setBackgroundColor(0);
        basePhotoFragment.f4441a.m3517f(new C6706e(this));
    }
}
