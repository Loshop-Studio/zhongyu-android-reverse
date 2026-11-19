package com.xuexiang.xui.widget.imageview.preview.p072ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C0358u;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher;
import com.xuexiang.xui.widget.imageview.preview.MediaLoader;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.loader.ISimpleTarget;
import com.xuexiang.xui.widget.imageview.preview.loader.OnVideoClickListener;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;

/* loaded from: classes.dex */
public class BasePhotoFragment extends Fragment {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String GIF = ".gif";
    public static final String KEY_DRAG = "com.xuexiang.xui.widget.preview.KEY_DRAG";
    public static final String KEY_PREVIEW_ITEM = "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM";
    public static final String KEY_PROGRESS_COLOR = "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR";
    public static final String KEY_SENSITIVITY = "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY";
    public static final String KEY_SING_FILING = "com.xuexiang.xui.widget.preview.KEY_SING_FILING";
    public static final String KEY_TRANS_PHOTO = "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO";
    public static OnVideoClickListener listener;
    private boolean isTransPhoto = false;
    protected ImageView mBtnVideo;
    protected ISimpleTarget mISimpleTarget;
    protected SmoothImageView mImageView;
    protected MaterialProgressBar mLoadingView;
    private IPreviewInfo mPreviewInfo;
    protected View mRootView;

    public static int getColorWithAlpha(float f4, int i4) {
        return (Math.min(255, Math.max(0, (int) (f4 * 255.0f))) << 24) + (i4 & 16777215);
    }

    private void initArgs() {
        boolean z3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mLoadingView.setSupportIndeterminateTintList(ResUtils.getColors(arguments.getInt(KEY_PROGRESS_COLOR, C2042R.color.xui_config_color_main_theme)));
            z3 = arguments.getBoolean(KEY_SING_FILING);
            this.mPreviewInfo = (IPreviewInfo) arguments.getParcelable(KEY_PREVIEW_ITEM);
            this.mImageView.setDrag(arguments.getBoolean(KEY_DRAG), arguments.getFloat(KEY_SENSITIVITY));
            this.mImageView.setThumbRect(this.mPreviewInfo.getBounds());
            this.mRootView.setTag(this.mPreviewInfo.getUrl());
            this.isTransPhoto = arguments.getBoolean(KEY_TRANS_PHOTO, false);
            if (this.mPreviewInfo.getUrl().toLowerCase().contains(GIF)) {
                this.mImageView.setZoomable(false);
                MediaLoader.get().displayGifImage(this, this.mPreviewInfo.getUrl(), this.mImageView, this.mISimpleTarget);
            } else {
                MediaLoader.get().displayImage(this, this.mPreviewInfo.getUrl(), this.mImageView, this.mISimpleTarget);
            }
        } else {
            z3 = true;
        }
        if (this.isTransPhoto) {
            this.mImageView.setMinimumScale(0.7f);
        } else {
            this.mRootView.setBackgroundColor(IGoodView.DEFAULT_TEXT_COLOR);
        }
        if (z3) {
            this.mImageView.setOnViewTapListener(new PhotoViewAttacher.OnViewTapListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.3
                @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.OnViewTapListener
                public void onViewTap(View view, float f4, float f5) {
                    if (BasePhotoFragment.this.mImageView.checkMinScale()) {
                        BasePhotoFragment.this.transformOut();
                    }
                }
            });
        } else {
            this.mImageView.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.4
                @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.OnPhotoTapListener
                public void onOutsidePhotoTap() {
                }

                @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.OnPhotoTapListener
                public void onPhotoTap(View view, float f4, float f5) {
                    if (BasePhotoFragment.this.mImageView.checkMinScale()) {
                        BasePhotoFragment.this.transformOut();
                    }
                }
            });
        }
        this.mImageView.setAlphaChangeListener(new SmoothImageView.OnAlphaChangeListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.5
            @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.OnAlphaChangeListener
            public void onAlphaChange(int i4) {
                String videoUrl;
                if (i4 != 255 || (videoUrl = BasePhotoFragment.this.mPreviewInfo.getVideoUrl()) == null || videoUrl.isEmpty()) {
                    BasePhotoFragment.this.mBtnVideo.setVisibility(8);
                } else {
                    BasePhotoFragment.this.mBtnVideo.setVisibility(0);
                }
                BasePhotoFragment.this.mRootView.setBackgroundColor(BasePhotoFragment.getColorWithAlpha(i4 / 255.0f, IGoodView.DEFAULT_TEXT_COLOR));
            }
        });
        this.mImageView.setTransformOutListener(new SmoothImageView.OnTransformOutListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.6
            @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.OnTransformOutListener
            public void onTransformOut() {
                BasePhotoFragment.this.transformOut();
            }
        });
    }

    private void initView(View view) {
        this.mLoadingView = (MaterialProgressBar) view.findViewById(C2042R.id.loading);
        this.mImageView = (SmoothImageView) view.findViewById(C2042R.id.photoView);
        this.mBtnVideo = (ImageView) view.findViewById(C2042R.id.btnVideo);
        View viewFindViewById = view.findViewById(C2042R.id.rootView);
        this.mRootView = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.mImageView.setDrawingCacheEnabled(false);
        this.mBtnVideo.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String videoUrl = BasePhotoFragment.this.mPreviewInfo.getVideoUrl();
                if (videoUrl == null || videoUrl.isEmpty()) {
                    return;
                }
                OnVideoClickListener onVideoClickListener = BasePhotoFragment.listener;
                if (onVideoClickListener != null) {
                    onVideoClickListener.onPlayerVideo(videoUrl);
                } else {
                    VideoPlayerActivity.start(BasePhotoFragment.this, videoUrl);
                }
            }
        });
        this.mISimpleTarget = new ISimpleTarget() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.2
            @Override // com.xuexiang.xui.widget.imageview.preview.loader.ISimpleTarget
            public void onLoadFailed(Drawable drawable) {
                BasePhotoFragment.this.mLoadingView.setVisibility(8);
                BasePhotoFragment.this.mBtnVideo.setVisibility(8);
                if (drawable != null) {
                    BasePhotoFragment.this.mImageView.setImageDrawable(drawable);
                }
            }

            @Override // com.xuexiang.xui.widget.imageview.preview.loader.ISimpleTarget
            public void onResourceReady() {
                BasePhotoFragment.this.mLoadingView.setVisibility(8);
                String videoUrl = BasePhotoFragment.this.mPreviewInfo.getVideoUrl();
                if (videoUrl == null || videoUrl.isEmpty()) {
                    BasePhotoFragment.this.mBtnVideo.setVisibility(8);
                } else {
                    BasePhotoFragment.this.mBtnVideo.setVisibility(0);
                    C0358u.m2022c(BasePhotoFragment.this.mBtnVideo).m2121a(1.0f).m2124d(1000L).m2129j();
                }
            }
        };
    }

    public static BasePhotoFragment newInstance(Class<? extends BasePhotoFragment> cls, IPreviewInfo iPreviewInfo, boolean z3, boolean z4, boolean z5, float f4, int i4) throws IllegalAccessException, InstantiationException {
        BasePhotoFragment basePhotoFragment;
        try {
            basePhotoFragment = cls.newInstance();
        } catch (Exception unused) {
            basePhotoFragment = new BasePhotoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_PREVIEW_ITEM, iPreviewInfo);
        bundle.putBoolean(KEY_TRANS_PHOTO, z3);
        bundle.putBoolean(KEY_SING_FILING, z4);
        bundle.putBoolean(KEY_DRAG, z5);
        bundle.putFloat(KEY_SENSITIVITY, f4);
        bundle.putInt(KEY_PROGRESS_COLOR, i4);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transformOut() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.transformOut();
        }
    }

    public void changeBg(int i4) {
        C0358u.m2022c(this.mBtnVideo).m2121a(IGoodView.DEFAULT_TO_ALPHA).m2124d(500L).m2129j();
        this.mRootView.setBackgroundColor(i4);
    }

    public IPreviewInfo getPreviewInfo() {
        return this.mPreviewInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2042R.layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaLoader.get().clearMemory(getActivity());
        if (getActivity() == null || !getActivity().isFinishing()) {
            return;
        }
        listener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        release();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        MediaLoader.get().onStop(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
        initArgs();
    }

    public void release() {
        this.mISimpleTarget = null;
        SmoothImageView smoothImageView = this.mImageView;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.mImageView.setOnViewTapListener(null);
            this.mImageView.setOnPhotoTapListener(null);
            this.mImageView.setAlphaChangeListener(null);
            this.mImageView.setTransformOutListener(null);
            this.mImageView.transformIn(null);
            this.mImageView.transformOut(null);
            this.mImageView.setOnLongClickListener(null);
            this.mBtnVideo.setOnClickListener(null);
            this.mImageView = null;
            this.mRootView = null;
            this.isTransPhoto = false;
        }
    }

    public void resetMatrix() {
        SmoothImageView smoothImageView = this.mImageView;
        if (smoothImageView != null) {
            smoothImageView.resetMatrix();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
    }

    public void transformIn() {
        this.mImageView.transformIn(new SmoothImageView.onTransformListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment.7
            @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.onTransformListener
            public void onTransformCompleted(SmoothImageView.Status status) {
                BasePhotoFragment.this.mRootView.setBackgroundColor(IGoodView.DEFAULT_TEXT_COLOR);
            }
        });
    }

    public void transformOut(SmoothImageView.onTransformListener ontransformlistener) {
        this.mImageView.transformOut(ontransformlistener);
    }
}
