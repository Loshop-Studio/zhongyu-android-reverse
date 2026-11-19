package com.xuexiang.xui.widget.imageview.preview.p072ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC0465n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.taobao.accs.ErrorCode;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.CollectionUtils;
import com.xuexiang.xui.widget.imageview.preview.MediaLoader;
import com.xuexiang.xui.widget.imageview.preview.PreviewBuilder;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PreviewActivity extends AppCompatActivity {
    public static final String KEY_CLASSNAME = "com.xuexiang.xui.widget.preview.KEY_CLASSNAME";
    public static final String KEY_DURATION = "com.xuexiang.xui.widget.preview.KEY_DURATION";
    public static final String KEY_IMAGE_PATHS = "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS";
    public static final String KEY_IS_FULLSCREEN = "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN";
    public static final String KEY_IS_SHOW = "com.xuexiang.xui.widget.preview.KEY_IS_SHOW";
    public static final String KEY_POSITION = "com.xuexiang.xui.widget.preview.KEY_POSITION";
    public static final String KEY_TYPE = "com.xuexiang.xui.widget.preview.KEY_TYPE";
    private BezierBannerView mBezierBannerView;
    private int mCurrentIndex;
    private List<IPreviewInfo> mImgUrls;
    private TextView mTvIndex;
    private PreviewBuilder.IndicatorType mType;
    private PhotoViewPager mViewPager;
    private boolean mIsTransformOut = false;
    private List<BasePhotoFragment> fragments = new ArrayList();
    private boolean mIsShow = true;

    private class PhotoPagerAdapter extends AbstractC0465n {
        PhotoPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.AbstractC0465n, androidx.viewpager.widget.AbstractC0783a
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            super.destroyItem(viewGroup, i4, obj);
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public int getCount() {
            if (PreviewActivity.this.fragments == null) {
                return 0;
            }
            return PreviewActivity.this.fragments.size();
        }

        @Override // androidx.fragment.app.AbstractC0465n
        public Fragment getItem(int i4) {
            return (Fragment) PreviewActivity.this.fragments.get(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exit() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImgSize() {
        return CollectionUtils.getSize(this.mImgUrls);
    }

    private void initArgs() {
        this.mImgUrls = getIntent().getParcelableArrayListExtra(KEY_IMAGE_PATHS);
        this.mCurrentIndex = getIntent().getIntExtra(KEY_POSITION, -1);
        this.mType = (PreviewBuilder.IndicatorType) getIntent().getSerializableExtra(KEY_TYPE);
        this.mIsShow = getIntent().getBooleanExtra(KEY_IS_SHOW, true);
        int intExtra = getIntent().getIntExtra(KEY_DURATION, ErrorCode.APP_NOT_BIND);
        if (getIntent().getBooleanExtra(KEY_IS_FULLSCREEN, false)) {
            setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        }
        try {
            SmoothImageView.setDuration(intExtra);
            initFragment(this.mImgUrls, this.mCurrentIndex, (Class) getIntent().getSerializableExtra(KEY_CLASSNAME));
        } catch (Exception unused) {
            initFragment(this.mImgUrls, this.mCurrentIndex, BasePhotoFragment.class);
        }
    }

    private void initView() throws Resources.NotFoundException {
        this.mViewPager = (PhotoViewPager) findViewById(C2042R.id.viewPager);
        this.mViewPager.setAdapter(new PhotoPagerAdapter(getSupportFragmentManager()));
        this.mViewPager.setCurrentItem(this.mCurrentIndex);
        this.mViewPager.setOffscreenPageLimit(3);
        this.mBezierBannerView = (BezierBannerView) findViewById(C2042R.id.bezierBannerView);
        TextView textView = (TextView) findViewById(C2042R.id.tv_index);
        this.mTvIndex = textView;
        if (this.mType == PreviewBuilder.IndicatorType.Dot) {
            this.mBezierBannerView.setVisibility(0);
            this.mBezierBannerView.attachToViewpager(this.mViewPager);
        } else {
            textView.setVisibility(0);
            this.mTvIndex.setText(getString(C2042R.string.xui_preview_count_string, new Object[]{Integer.valueOf(this.mCurrentIndex + 1), Integer.valueOf(getImgSize())}));
            this.mViewPager.addOnPageChangeListener(new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity.1
                @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
                public void onPageScrollStateChanged(int i4) {
                }

                @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
                public void onPageScrolled(int i4, float f4, int i5) {
                }

                @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
                public void onPageSelected(int i4) throws Resources.NotFoundException {
                    if (PreviewActivity.this.mTvIndex != null) {
                        PreviewActivity.this.mTvIndex.setText(PreviewActivity.this.getString(C2042R.string.xui_preview_count_string, new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(PreviewActivity.this.getImgSize())}));
                    }
                    PreviewActivity.this.mCurrentIndex = i4;
                    PreviewActivity.this.mViewPager.setCurrentItem(PreviewActivity.this.mCurrentIndex, true);
                }
            });
        }
        if (this.fragments.size() == 1 && !this.mIsShow) {
            this.mBezierBannerView.setVisibility(8);
            this.mTvIndex.setVisibility(8);
        }
        this.mViewPager.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                PreviewActivity.this.mViewPager.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BasePhotoFragment basePhotoFragment = (BasePhotoFragment) CollectionUtils.getListItem(PreviewActivity.this.fragments, PreviewActivity.this.mCurrentIndex);
                if (basePhotoFragment != null) {
                    basePhotoFragment.transformIn();
                }
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        BasePhotoFragment.listener = null;
        super.finish();
    }

    public List<BasePhotoFragment> getFragments() {
        return this.fragments;
    }

    public int getLayoutId() {
        return 0;
    }

    public PhotoViewPager getViewPager() {
        return this.mViewPager;
    }

    protected void initFragment(List<IPreviewInfo> list, int i4, Class<? extends BasePhotoFragment> cls) {
        if (list == null) {
            finish();
            return;
        }
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            this.fragments.add(BasePhotoFragment.newInstance(cls, list.get(i5), i4 == i5, getIntent().getBooleanExtra(BasePhotoFragment.KEY_SING_FILING, false), getIntent().getBooleanExtra(BasePhotoFragment.KEY_DRAG, false), getIntent().getFloatExtra(BasePhotoFragment.KEY_SENSITIVITY, 0.5f), getIntent().getIntExtra(BasePhotoFragment.KEY_PROGRESS_COLOR, C2042R.color.xui_config_color_main_theme)));
            i5++;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        transformOut();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        initArgs();
        if (getLayoutId() == 0) {
            setContentView(C2042R.layout.preview_activity_image_photo);
        } else {
            setContentView(getLayoutId());
        }
        initView();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() throws Resources.NotFoundException {
        MediaLoader.get().clearMemory(this);
        PhotoViewPager photoViewPager = this.mViewPager;
        if (photoViewPager != null) {
            photoViewPager.setAdapter(null);
            this.mViewPager.clearOnPageChangeListeners();
            this.mViewPager.removeAllViews();
            this.mViewPager = null;
        }
        List<BasePhotoFragment> list = this.fragments;
        if (list != null) {
            list.clear();
            this.fragments = null;
        }
        List<IPreviewInfo> list2 = this.mImgUrls;
        if (list2 != null) {
            list2.clear();
            this.mImgUrls = null;
        }
        super.onDestroy();
    }

    public void transformOut() {
        if (this.mIsTransformOut) {
            return;
        }
        this.mIsTransformOut = true;
        int currentItem = this.mViewPager.getCurrentItem();
        if (currentItem >= getImgSize()) {
            exit();
            return;
        }
        BasePhotoFragment basePhotoFragment = this.fragments.get(currentItem);
        TextView textView = this.mTvIndex;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            this.mBezierBannerView.setVisibility(8);
        }
        basePhotoFragment.changeBg(0);
        basePhotoFragment.transformOut(new SmoothImageView.onTransformListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity.3
            @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.onTransformListener
            public void onTransformCompleted(SmoothImageView.Status status) {
                PreviewActivity.this.exit();
            }
        });
    }
}
