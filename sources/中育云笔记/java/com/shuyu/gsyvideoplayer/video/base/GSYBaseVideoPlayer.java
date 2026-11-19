package com.shuyu.gsyvideoplayer.video.base;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.transition.TransitionManager;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.OrientationOption;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import p335s7.ViewOnTouchListenerC11078a;

/* loaded from: classes5.dex */
public abstract class GSYBaseVideoPlayer extends GSYVideoControlView {
    protected boolean isNeedAutoAdaptation;
    protected boolean mActionBar;
    protected boolean mAutoFullWithSize;
    protected View.OnClickListener mBackFromFullScreenListener;
    protected Runnable mCheckoutTask;
    protected boolean mFullAnimEnd;
    protected Handler mInnerHandler;
    private boolean mIsOnlyRotateLand;
    protected int[] mListItemRect;
    protected int[] mListItemSize;
    protected boolean mLockLand;
    protected boolean mNeedOrientationUtils;
    protected OrientationUtils mOrientationUtils;
    protected boolean mRotateViewAuto;
    protected boolean mRotateWithSystem;
    protected boolean mShowFullAnimation;
    protected View mSmallClose;
    protected boolean mStatusBar;
    protected int mSystemUiVisibility;

    public GSYBaseVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
        this.mActionBar = false;
        this.mStatusBar = false;
        this.mShowFullAnimation = true;
        this.mRotateViewAuto = true;
        this.mRotateWithSystem = true;
        this.mLockLand = false;
        this.mAutoFullWithSize = false;
        this.mNeedOrientationUtils = true;
        this.isNeedAutoAdaptation = false;
        this.mFullAnimEnd = true;
        this.mIsOnlyRotateLand = false;
        this.mInnerHandler = new Handler();
        this.mCheckoutTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                int i11;
                GSYVideoPlayer fullWindowPlayer = GSYBaseVideoPlayer.this.getFullWindowPlayer();
                if (fullWindowPlayer == null || (i10 = fullWindowPlayer.mCurrentState) == (i11 = GSYBaseVideoPlayer.this.mCurrentState) || i10 != 3 || i11 == 1) {
                    return;
                }
                fullWindowPlayer.setStateAndUi(i11);
            }
        };
    }

    private void adaptToEdgeToEdge() {
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.10
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                view.setPadding(insets.left, insets.f28530top, insets.right, insets.bottom);
                return windowInsetsCompat;
            }
        });
    }

    private void pauseFullBackCoverLogic(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        if (gSYBaseVideoPlayer.mCurrentState == 5 && gSYBaseVideoPlayer.mTextureView != null && this.mShowPauseCover) {
            Bitmap bitmap = gSYBaseVideoPlayer.mFullPauseBitmap;
            if (bitmap != null && !bitmap.isRecycled() && this.mShowPauseCover) {
                this.mFullPauseBitmap = gSYBaseVideoPlayer.mFullPauseBitmap;
                return;
            }
            if (this.mShowPauseCover) {
                try {
                    gSYBaseVideoPlayer.initCover();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.mFullPauseBitmap = null;
                }
            }
        }
    }

    private void pauseFullCoverLogic() {
        if (this.mCurrentState != 5 || this.mTextureView == null) {
            return;
        }
        Bitmap bitmap = this.mFullPauseBitmap;
        if ((bitmap == null || bitmap.isRecycled()) && this.mShowPauseCover) {
            try {
                initCover();
            } catch (Exception e10) {
                e10.printStackTrace();
                this.mFullPauseBitmap = null;
            }
        }
    }

    private void removeVideo(ViewGroup viewGroup, int i10) {
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById == null || viewFindViewById.getParent() == null) {
            return;
        }
        viewGroup.removeView((ViewGroup) viewFindViewById.getParent());
    }

    private void resetPadding() {
        setPadding(0, 0, 0, 0);
    }

    private void saveLocationStatus(Context context, boolean z10, boolean z11) {
        getLocationOnScreen(this.mListItemRect);
        if (context instanceof Activity) {
            int statusBarHeight = CommonUtil.getStatusBarHeight(context);
            int actionBarHeight = CommonUtil.getActionBarHeight(CommonUtil.getActivityNestWrapper(context));
            boolean z12 = (CommonUtil.getActivityNestWrapper(context).getWindow().getAttributes().flags & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 67108864;
            Debuger.printfLog("*************isTranslucent*************** " + z12);
            if (z10 && !z12) {
                int[] iArr = this.mListItemRect;
                iArr[1] = iArr[1] - statusBarHeight;
            }
            if (z11) {
                int[] iArr2 = this.mListItemRect;
                iArr2[1] = iArr2[1] - actionBarHeight;
            }
        }
        this.mListItemSize[0] = getWidth();
        this.mListItemSize[1] = getHeight();
    }

    public void autoAdaptation() {
        Context context = getContext();
        if (isVerticalVideo()) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                setPadding(0, CommonUtil.getStatusBarHeight(context), 0, 0);
                Debuger.printfLog("竖屏，系统未将布局下移");
            } else {
                Debuger.printfLog("竖屏，系统将布局下移；y:" + iArr[1]);
            }
        }
    }

    public void backToNormal() {
        final ViewGroup viewGroup = getViewGroup();
        final View viewFindViewById = viewGroup.findViewById(getFullId());
        if (viewFindViewById == null) {
            resolveNormalVideoShow(null, viewGroup, null);
            return;
        }
        final GSYVideoPlayer gSYVideoPlayer = (GSYVideoPlayer) viewFindViewById;
        pauseFullBackCoverLogic(gSYVideoPlayer);
        if (!this.mShowFullAnimation) {
            resolveNormalVideoShow(viewFindViewById, viewGroup, gSYVideoPlayer);
            return;
        }
        TransitionManager.beginDelayedTransition(viewGroup);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gSYVideoPlayer.getLayoutParams();
        int[] iArr = this.mListItemRect;
        layoutParams.setMargins(iArr[0], iArr[1], 0, 0);
        int[] iArr2 = this.mListItemSize;
        layoutParams.width = iArr2[0];
        layoutParams.height = iArr2[1];
        layoutParams.gravity = 0;
        gSYVideoPlayer.setLayoutParams(layoutParams);
        this.mInnerHandler.postDelayed(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.4
            @Override // java.lang.Runnable
            public void run() {
                GSYBaseVideoPlayer.this.resolveNormalVideoShow(viewFindViewById, viewGroup, gSYVideoPlayer);
            }
        }, 400L);
    }

    public void checkAutoFullSizeWhenFull() {
        OrientationUtils orientationUtils;
        if (this.mIfCurrentIsFullscreen) {
            boolean zIsVerticalFullByVideoSize = isVerticalFullByVideoSize();
            Debuger.printfLog("GSYVideoBase onPrepared isVerticalFullByVideoSize " + zIsVerticalFullByVideoSize);
            if (!zIsVerticalFullByVideoSize || (orientationUtils = this.mOrientationUtils) == null) {
                return;
            }
            orientationUtils.backToProtVideo();
            checkAutoFullWithSizeAndAdaptation(this);
        }
    }

    public void checkAutoFullWithSizeAndAdaptation(final GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        if (gSYBaseVideoPlayer != null && this.isNeedAutoAdaptation && isAutoFullWithSize() && isVerticalVideo() && isFullHideStatusBar()) {
            this.mInnerHandler.postDelayed(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.9
                @Override // java.lang.Runnable
                public void run() {
                    gSYBaseVideoPlayer.getCurrentPlayer().autoAdaptation();
                }
            }, 100L);
        }
    }

    public void checkoutState() {
        removeCallbacks(this.mCheckoutTask);
        this.mInnerHandler.postDelayed(this.mCheckoutTask, 500L);
    }

    public void clearFullscreenLayout() {
        int iBackToProtVideo;
        if (this.mFullAnimEnd) {
            this.mIfCurrentIsFullscreen = false;
            OrientationUtils orientationUtils = this.mOrientationUtils;
            if (orientationUtils != null) {
                iBackToProtVideo = orientationUtils.backToProtVideo();
                this.mOrientationUtils.setEnable(false);
                OrientationUtils orientationUtils2 = this.mOrientationUtils;
                if (orientationUtils2 != null) {
                    orientationUtils2.releaseListener();
                    this.mOrientationUtils = null;
                }
            } else {
                iBackToProtVideo = 0;
            }
            if (!this.mShowFullAnimation) {
                iBackToProtVideo = 0;
            }
            View viewFindViewById = getViewGroup().findViewById(getFullId());
            if (viewFindViewById != null) {
                ((GSYVideoPlayer) viewFindViewById).mIfCurrentIsFullscreen = false;
            }
            this.mInnerHandler.postDelayed(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.3
                @Override // java.lang.Runnable
                public void run() {
                    GSYBaseVideoPlayer.this.backToNormal();
                }
            }, iBackToProtVideo);
        }
    }

    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        GSYBaseVideoPlayer gSYBaseVideoPlayer3;
        gSYBaseVideoPlayer2.mHadPlay = gSYBaseVideoPlayer.mHadPlay;
        gSYBaseVideoPlayer2.mPlayTag = gSYBaseVideoPlayer.mPlayTag;
        gSYBaseVideoPlayer2.mPlayPosition = gSYBaseVideoPlayer.mPlayPosition;
        gSYBaseVideoPlayer2.mEffectFilter = gSYBaseVideoPlayer.mEffectFilter;
        gSYBaseVideoPlayer2.mCurrentPosition = gSYBaseVideoPlayer.mCurrentPosition;
        gSYBaseVideoPlayer2.mFullPauseBitmap = gSYBaseVideoPlayer.mFullPauseBitmap;
        gSYBaseVideoPlayer2.mNeedShowWifiTip = gSYBaseVideoPlayer.mNeedShowWifiTip;
        gSYBaseVideoPlayer2.mShrinkImageRes = gSYBaseVideoPlayer.mShrinkImageRes;
        gSYBaseVideoPlayer2.mEnlargeImageRes = gSYBaseVideoPlayer.mEnlargeImageRes;
        gSYBaseVideoPlayer2.mRotate = gSYBaseVideoPlayer.mRotate;
        gSYBaseVideoPlayer2.mShowPauseCover = gSYBaseVideoPlayer.mShowPauseCover;
        gSYBaseVideoPlayer2.mDismissControlTime = gSYBaseVideoPlayer.mDismissControlTime;
        gSYBaseVideoPlayer2.mSeekRatio = gSYBaseVideoPlayer.mSeekRatio;
        gSYBaseVideoPlayer2.mNetChanged = gSYBaseVideoPlayer.mNetChanged;
        gSYBaseVideoPlayer2.mNetSate = gSYBaseVideoPlayer.mNetSate;
        gSYBaseVideoPlayer2.mRotateViewAuto = gSYBaseVideoPlayer.mRotateViewAuto;
        gSYBaseVideoPlayer2.mRotateWithSystem = gSYBaseVideoPlayer.mRotateWithSystem;
        gSYBaseVideoPlayer2.mBackUpPlayingBufferState = gSYBaseVideoPlayer.mBackUpPlayingBufferState;
        gSYBaseVideoPlayer2.mRenderer = gSYBaseVideoPlayer.mRenderer;
        gSYBaseVideoPlayer2.mMode = gSYBaseVideoPlayer.mMode;
        gSYBaseVideoPlayer2.mBackFromFullScreenListener = gSYBaseVideoPlayer.mBackFromFullScreenListener;
        gSYBaseVideoPlayer2.mHadPrepared = gSYBaseVideoPlayer.mHadPrepared;
        gSYBaseVideoPlayer2.mSurfaceErrorPlay = gSYBaseVideoPlayer.mSurfaceErrorPlay;
        gSYBaseVideoPlayer2.mStartAfterPrepared = gSYBaseVideoPlayer.mStartAfterPrepared;
        gSYBaseVideoPlayer2.mPauseBeforePrepared = gSYBaseVideoPlayer.mPauseBeforePrepared;
        gSYBaseVideoPlayer2.mReleaseWhenLossAudio = gSYBaseVideoPlayer.mReleaseWhenLossAudio;
        gSYBaseVideoPlayer2.mVideoAllCallBack = gSYBaseVideoPlayer.mVideoAllCallBack;
        gSYBaseVideoPlayer2.mRotateViewAuto = gSYBaseVideoPlayer.mRotateViewAuto;
        gSYBaseVideoPlayer2.mActionBar = gSYBaseVideoPlayer.mActionBar;
        gSYBaseVideoPlayer2.mStatusBar = gSYBaseVideoPlayer.mStatusBar;
        gSYBaseVideoPlayer2.mAutoFullWithSize = gSYBaseVideoPlayer.mAutoFullWithSize;
        gSYBaseVideoPlayer2.mOverrideExtension = gSYBaseVideoPlayer.mOverrideExtension;
        gSYBaseVideoPlayer2.mNeedOrientationUtils = gSYBaseVideoPlayer.mNeedOrientationUtils;
        gSYBaseVideoPlayer2.onAudioFocusChangeListener = gSYBaseVideoPlayer.onAudioFocusChangeListener;
        if (gSYBaseVideoPlayer.mSetUpLazy) {
            gSYBaseVideoPlayer3 = gSYBaseVideoPlayer2;
            gSYBaseVideoPlayer3.setUpLazy(gSYBaseVideoPlayer.mOriginUrl, gSYBaseVideoPlayer.mCache, gSYBaseVideoPlayer.mCachePath, gSYBaseVideoPlayer.mMapHeadData, gSYBaseVideoPlayer.mTitle);
            gSYBaseVideoPlayer3.mUrl = gSYBaseVideoPlayer.mUrl;
        } else {
            gSYBaseVideoPlayer3 = gSYBaseVideoPlayer2;
            gSYBaseVideoPlayer3.setUp(gSYBaseVideoPlayer.mOriginUrl, gSYBaseVideoPlayer.mCache, gSYBaseVideoPlayer.mCachePath, gSYBaseVideoPlayer.mMapHeadData, gSYBaseVideoPlayer.mTitle);
        }
        gSYBaseVideoPlayer3.setLooping(gSYBaseVideoPlayer.isLooping());
        gSYBaseVideoPlayer3.setIsTouchWigetFull(gSYBaseVideoPlayer.mIsTouchWigetFull);
        gSYBaseVideoPlayer3.setSpeed(gSYBaseVideoPlayer.getSpeed(), gSYBaseVideoPlayer.mSoundTouch, false);
        gSYBaseVideoPlayer3.setStateAndUi(gSYBaseVideoPlayer.mCurrentState);
    }

    public GSYBaseVideoPlayer getCurrentPlayer() {
        return getFullWindowPlayer() != null ? getFullWindowPlayer() : getSmallWindowPlayer() != null ? getSmallWindowPlayer() : this;
    }

    public abstract int getFullId();

    public GSYVideoPlayer getFullWindowPlayer() {
        View viewFindViewById;
        Activity activityScanForActivity = CommonUtil.scanForActivity(getContext());
        if (activityScanForActivity == null || (viewFindViewById = ((ViewGroup) activityScanForActivity.findViewById(R.id.content)).findViewById(getFullId())) == null) {
            return null;
        }
        return (GSYVideoPlayer) viewFindViewById;
    }

    public OrientationOption getOrientationOption() {
        return null;
    }

    public int getSaveBeforeFullSystemUiVisibility() {
        return this.mSystemUiVisibility;
    }

    public abstract int getSmallId();

    public GSYVideoPlayer getSmallWindowPlayer() {
        View viewFindViewById = ((ViewGroup) CommonUtil.scanForActivity(getContext()).findViewById(R.id.content)).findViewById(getSmallId());
        if (viewFindViewById != null) {
            return (GSYVideoPlayer) viewFindViewById;
        }
        return null;
    }

    public ViewGroup getViewGroup() {
        return (ViewGroup) CommonUtil.scanForActivity(getContext()).findViewById(R.id.content);
    }

    public void hideSmallVideo() {
        ViewGroup viewGroup = getViewGroup();
        GSYVideoPlayer gSYVideoPlayer = (GSYVideoPlayer) viewGroup.findViewById(getSmallId());
        removeVideo(viewGroup, getSmallId());
        this.mCurrentState = getGSYVideoManager().getLastState();
        if (gSYVideoPlayer != null) {
            cloneParams(gSYVideoPlayer, this);
        }
        getGSYVideoManager().setListener(getGSYVideoManager().lastListener());
        getGSYVideoManager().setLastListener(null);
        setStateAndUi(this.mCurrentState);
        addTextureView();
        this.mSaveChangeViewTIme = System.currentTimeMillis();
        if (this.mVideoAllCallBack != null) {
            Debuger.printfLog("onQuitSmallWidget");
            this.mVideoAllCallBack.mo5992n(this.mOriginUrl, this.mTitle, this);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        this.mSmallClose = findViewById(R$id.small_close);
    }

    public boolean isAutoFullWithSize() {
        return this.mAutoFullWithSize;
    }

    public boolean isFullHideActionBar() {
        return this.mActionBar;
    }

    public boolean isFullHideStatusBar() {
        return this.mStatusBar;
    }

    public boolean isLockLand() {
        return this.mLockLand;
    }

    public boolean isLockLandByAutoFullSize() {
        return isAutoFullWithSize() ? isVerticalVideo() : this.mLockLand;
    }

    public boolean isNeedAutoAdaptation() {
        return this.isNeedAutoAdaptation;
    }

    public boolean isNeedOrientationUtils() {
        return this.mNeedOrientationUtils;
    }

    public boolean isOnlyRotateLand() {
        return this.mIsOnlyRotateLand;
    }

    public boolean isRotateViewAuto() {
        if (this.mAutoFullWithSize) {
            return false;
        }
        return this.mRotateViewAuto;
    }

    public boolean isRotateWithSystem() {
        return this.mRotateWithSystem;
    }

    public boolean isShowFullAnimation() {
        return this.mShowFullAnimation;
    }

    public boolean isVerticalFullByVideoSize() {
        return isVerticalVideo() && isAutoFullWithSize();
    }

    public boolean isVerticalVideo() {
        int currentVideoHeight = getCurrentVideoHeight();
        int currentVideoWidth = getCurrentVideoWidth();
        Debuger.printfLog("GSYVideoBase isVerticalVideo  videoHeight " + currentVideoHeight + " videoWidth " + currentVideoWidth);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GSYVideoBase isVerticalVideo  mRotate ");
        sb2.append(this.mRotate);
        Debuger.printfLog(sb2.toString());
        if (currentVideoHeight > 0 && currentVideoWidth > 0) {
            int i10 = this.mRotate;
            if (i10 != 90 && i10 != 270) {
                return currentVideoHeight > currentVideoWidth;
            }
            if (currentVideoWidth > currentVideoHeight) {
                return true;
            }
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void lockTouchLogic() {
        super.lockTouchLogic();
        if (this.mLockCurScreen) {
            OrientationUtils orientationUtils = this.mOrientationUtils;
            if (orientationUtils != null) {
                orientationUtils.setEnable(false);
                return;
            }
            return;
        }
        OrientationUtils orientationUtils2 = this.mOrientationUtils;
        if (orientationUtils2 != null) {
            orientationUtils2.setEnable(isRotateViewAuto());
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onBackFullscreen() {
        clearFullscreenLayout();
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration, OrientationUtils orientationUtils) throws NoSuchMethodException, SecurityException {
        onConfigurationChanged(activity, configuration, orientationUtils, true, true);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onInfo(int i10, int i11) {
        super.onInfo(i10, i11);
        if (i10 == getGSYVideoManager().getRotateInfoFlag()) {
            checkAutoFullSizeWhenFull();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onPrepared() {
        super.onPrepared();
        checkAutoFullSizeWhenFull();
    }

    public void resolveFullVideoShow(Context context, GSYBaseVideoPlayer gSYBaseVideoPlayer, final FrameLayout frameLayout) {
        GSYBaseVideoPlayer gSYBaseVideoPlayer2;
        final GSYBaseVideoPlayer gSYBaseVideoPlayer3;
        OrientationUtils orientationUtils;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gSYBaseVideoPlayer.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.gravity = 17;
        gSYBaseVideoPlayer.setLayoutParams(layoutParams);
        gSYBaseVideoPlayer.setIfCurrentIsFullscreen(true);
        if (this.mNeedOrientationUtils) {
            OrientationUtils orientationUtils2 = new OrientationUtils((Activity) context, gSYBaseVideoPlayer, getOrientationOption());
            this.mOrientationUtils = orientationUtils2;
            orientationUtils2.setEnable(isRotateViewAuto());
            this.mOrientationUtils.setRotateWithSystem(this.mRotateWithSystem);
            this.mOrientationUtils.setOnlyRotateLand(this.mIsOnlyRotateLand);
            gSYBaseVideoPlayer.mOrientationUtils = this.mOrientationUtils;
        }
        final boolean zIsVerticalFullByVideoSize = isVerticalFullByVideoSize();
        final boolean zIsLockLandByAutoFullSize = isLockLandByAutoFullSize();
        if (isShowFullAnimation()) {
            gSYBaseVideoPlayer2 = this;
            gSYBaseVideoPlayer3 = gSYBaseVideoPlayer;
            this.mInnerHandler.postDelayed(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.2
                @Override // java.lang.Runnable
                public void run() {
                    OrientationUtils orientationUtils3;
                    if (!zIsVerticalFullByVideoSize && zIsLockLandByAutoFullSize && (orientationUtils3 = GSYBaseVideoPlayer.this.mOrientationUtils) != null && orientationUtils3.getIsLand() != 1) {
                        GSYBaseVideoPlayer.this.mOrientationUtils.resolveByClick();
                    }
                    gSYBaseVideoPlayer3.setVisibility(0);
                    frameLayout.setVisibility(0);
                }
            }, 300L);
        } else {
            gSYBaseVideoPlayer2 = this;
            gSYBaseVideoPlayer3 = gSYBaseVideoPlayer;
            if (!zIsVerticalFullByVideoSize && zIsLockLandByAutoFullSize && (orientationUtils = gSYBaseVideoPlayer2.mOrientationUtils) != null) {
                orientationUtils.resolveByClick();
            }
            gSYBaseVideoPlayer3.setVisibility(0);
            frameLayout.setVisibility(0);
        }
        if (gSYBaseVideoPlayer2.mVideoAllCallBack != null) {
            Debuger.printfError("onEnterFullscreen");
            gSYBaseVideoPlayer2.mVideoAllCallBack.mo5999w(gSYBaseVideoPlayer2.mOriginUrl, gSYBaseVideoPlayer2.mTitle, gSYBaseVideoPlayer3);
        }
        gSYBaseVideoPlayer2.mIfCurrentIsFullscreen = true;
        checkoutState();
        checkAutoFullWithSizeAndAdaptation(gSYBaseVideoPlayer3);
    }

    public void resolveNormalVideoShow(View view, ViewGroup viewGroup, GSYVideoPlayer gSYVideoPlayer) {
        if (view != null && view.getParent() != null) {
            viewGroup.removeView((ViewGroup) view.getParent());
        }
        this.mCurrentState = getGSYVideoManager().getLastState();
        if (gSYVideoPlayer != null) {
            cloneParams(gSYVideoPlayer, this);
        }
        int i10 = this.mCurrentState;
        if (i10 != 0 || i10 != 6) {
            createNetWorkState();
        }
        getGSYVideoManager().setListener(getGSYVideoManager().lastListener());
        getGSYVideoManager().setLastListener(null);
        setStateAndUi(this.mCurrentState);
        addTextureView();
        this.mSaveChangeViewTIme = System.currentTimeMillis();
        if (this.mVideoAllCallBack != null) {
            Debuger.printfError("onQuitFullscreen");
            this.mVideoAllCallBack.mo5984f(this.mOriginUrl, this.mTitle, this);
        }
        this.mIfCurrentIsFullscreen = false;
        if (this.mHideKey) {
            CommonUtil.showNavKey(this.mContext, this.mSystemUiVisibility);
        }
        CommonUtil.showSupportActionBar(this.mContext, this.mActionBar, this.mStatusBar);
        if (getFullscreenButton() != null) {
            getFullscreenButton().setImageResource(getEnlargeImageRes());
        }
    }

    public void setAdaptToEdgeToEdge(boolean z10) {
        if (z10) {
            adaptToEdgeToEdge();
        } else {
            resetPadding();
        }
    }

    public void setAutoFullWithSize(boolean z10) {
        this.mAutoFullWithSize = z10;
    }

    public void setBackFromFullScreenListener(View.OnClickListener onClickListener) {
        this.mBackFromFullScreenListener = onClickListener;
    }

    public void setFullHideActionBar(boolean z10) {
        this.mActionBar = z10;
    }

    public void setFullHideStatusBar(boolean z10) {
        this.mStatusBar = z10;
    }

    public void setLockLand(boolean z10) {
        this.mLockLand = z10;
    }

    public void setNeedAutoAdaptation(boolean z10) {
        this.isNeedAutoAdaptation = z10;
    }

    public void setNeedOrientationUtils(boolean z10) {
        this.mNeedOrientationUtils = z10;
    }

    public void setOnlyRotateLand(boolean z10) {
        this.mIsOnlyRotateLand = z10;
        OrientationUtils orientationUtils = this.mOrientationUtils;
        if (orientationUtils != null) {
            orientationUtils.setOnlyRotateLand(z10);
        }
    }

    public void setRotateViewAuto(boolean z10) {
        this.mRotateViewAuto = z10;
        OrientationUtils orientationUtils = this.mOrientationUtils;
        if (orientationUtils != null) {
            orientationUtils.setEnable(z10);
        }
    }

    public void setRotateWithSystem(boolean z10) {
        this.mRotateWithSystem = z10;
        OrientationUtils orientationUtils = this.mOrientationUtils;
        if (orientationUtils != null) {
            orientationUtils.setRotateWithSystem(z10);
        }
    }

    public void setSaveBeforeFullSystemUiVisibility(int i10) {
        this.mSystemUiVisibility = i10;
    }

    public void setShowFullAnimation(boolean z10) {
        this.mShowFullAnimation = z10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    public void setSmallVideoTextureView() {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setOnTouchListener(null);
            this.mProgressBar.setVisibility(4);
        }
        ImageView imageView = this.mFullscreenButton;
        if (imageView != null) {
            imageView.setOnTouchListener(null);
            this.mFullscreenButton.setVisibility(4);
        }
        TextView textView = this.mCurrentTimeTextView;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ViewGroup viewGroup = this.mTextureViewContainer;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        View view = this.mSmallClose;
        if (view != null) {
            view.setVisibility(0);
            this.mSmallClose.setOnClickListener(new View.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    GSYBaseVideoPlayer.this.hideSmallVideo();
                    GSYBaseVideoPlayer.this.releaseVideos();
                }
            });
        }
    }

    public GSYBaseVideoPlayer showSmallVideo(Point point, boolean z10, boolean z11) {
        ViewGroup viewGroup = getViewGroup();
        removeVideo(viewGroup, getSmallId());
        if (this.mTextureViewContainer.getChildCount() > 0) {
            this.mTextureViewContainer.removeAllViews();
        }
        try {
            GSYBaseVideoPlayer gSYBaseVideoPlayer = (GSYBaseVideoPlayer) getClass().getConstructor(Context.class).newInstance(getActivityContext());
            gSYBaseVideoPlayer.setId(getSmallId());
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = new FrameLayout(this.mContext);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(point.x, point.y);
            int screenWidth = CommonUtil.getScreenWidth(this.mContext) - point.x;
            int screenHeight = CommonUtil.getScreenHeight(this.mContext) - point.y;
            if (z10) {
                screenHeight -= CommonUtil.getActionBarHeight((Activity) this.mContext);
            }
            if (z11) {
                screenHeight -= CommonUtil.getStatusBarHeight(this.mContext);
            }
            layoutParams2.setMargins(screenWidth, screenHeight, 0, 0);
            frameLayout.addView(gSYBaseVideoPlayer, layoutParams2);
            viewGroup.addView(frameLayout, layoutParams);
            cloneParams(this, gSYBaseVideoPlayer);
            gSYBaseVideoPlayer.setIsTouchWiget(false);
            gSYBaseVideoPlayer.addTextureView();
            gSYBaseVideoPlayer.onClickUiToggle(null);
            gSYBaseVideoPlayer.setVideoAllCallBack(this.mVideoAllCallBack);
            gSYBaseVideoPlayer.setSmallVideoTextureView(new ViewOnTouchListenerC11078a(gSYBaseVideoPlayer, screenWidth, screenHeight));
            getGSYVideoManager().setLastListener(this);
            getGSYVideoManager().setListener(gSYBaseVideoPlayer);
            if (this.mVideoAllCallBack != null) {
                Debuger.printfError("onEnterSmallWidget");
                this.mVideoAllCallBack.mo5979a(this.mOriginUrl, this.mTitle, gSYBaseVideoPlayer);
            }
            return gSYBaseVideoPlayer;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public GSYBaseVideoPlayer startWindowFullscreen(final Context context, boolean z10, boolean z11) throws NoSuchMethodException, SecurityException {
        GSYBaseVideoPlayer gSYBaseVideoPlayer;
        Exception exc;
        this.mSystemUiVisibility = CommonUtil.getActivityNestWrapper(context).getWindow().getDecorView().getSystemUiVisibility();
        CommonUtil.hideSupportActionBar(context, z10, z11);
        if (this.mHideKey) {
            CommonUtil.hideNavKey(context);
        }
        this.mActionBar = z10;
        this.mStatusBar = z11;
        this.mListItemRect = new int[2];
        this.mListItemSize = new int[2];
        final ViewGroup viewGroup = getViewGroup();
        removeVideo(viewGroup, getFullId());
        pauseFullCoverLogic();
        if (this.mTextureViewContainer.getChildCount() > 0) {
            this.mTextureViewContainer.removeAllViews();
        }
        saveLocationStatus(context, z11, z10);
        cancelProgressTimer();
        try {
            try {
                getClass().getConstructor(Context.class, Boolean.class);
            } catch (Exception unused) {
                gSYBaseVideoPlayer = (GSYBaseVideoPlayer) getClass().getConstructor(Context.class).newInstance(this.mContext);
            }
            try {
                gSYBaseVideoPlayer = (GSYBaseVideoPlayer) getClass().getConstructor(Context.class, Boolean.class).newInstance(this.mContext, Boolean.TRUE);
                final GSYBaseVideoPlayer gSYBaseVideoPlayer2 = gSYBaseVideoPlayer;
                gSYBaseVideoPlayer2.setId(getFullId());
                gSYBaseVideoPlayer2.setIfCurrentIsFullscreen(true);
                gSYBaseVideoPlayer2.setVideoAllCallBack(this.mVideoAllCallBack);
                cloneParams(this, gSYBaseVideoPlayer2);
                if (gSYBaseVideoPlayer2.getFullscreenButton() != null) {
                    gSYBaseVideoPlayer2.getFullscreenButton().setImageResource(getShrinkImageRes());
                    gSYBaseVideoPlayer2.getFullscreenButton().setOnClickListener(new View.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.6
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            GSYBaseVideoPlayer gSYBaseVideoPlayer3 = GSYBaseVideoPlayer.this;
                            View.OnClickListener onClickListener = gSYBaseVideoPlayer3.mBackFromFullScreenListener;
                            if (onClickListener == null) {
                                gSYBaseVideoPlayer3.clearFullscreenLayout();
                            } else {
                                onClickListener.onClick(view);
                            }
                        }
                    });
                }
                if (gSYBaseVideoPlayer2.getBackButton() != null) {
                    gSYBaseVideoPlayer2.getBackButton().setVisibility(0);
                    gSYBaseVideoPlayer2.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.7
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            GSYBaseVideoPlayer gSYBaseVideoPlayer3 = GSYBaseVideoPlayer.this;
                            View.OnClickListener onClickListener = gSYBaseVideoPlayer3.mBackFromFullScreenListener;
                            if (onClickListener == null) {
                                gSYBaseVideoPlayer3.clearFullscreenLayout();
                            } else {
                                onClickListener.onClick(view);
                            }
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                final FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                try {
                    if (this.mShowFullAnimation) {
                        this.mFullAnimEnd = false;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(getWidth(), getHeight());
                        int[] iArr = this.mListItemRect;
                        layoutParams2.setMargins(iArr[0], iArr[1], 0, 0);
                        frameLayout.addView(gSYBaseVideoPlayer2, layoutParams2);
                        viewGroup.addView(frameLayout, layoutParams);
                        this.mInnerHandler.postDelayed(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.8
                            @Override // java.lang.Runnable
                            public void run() {
                                TransitionManager.beginDelayedTransition(viewGroup);
                                GSYBaseVideoPlayer.this.resolveFullVideoShow(context, gSYBaseVideoPlayer2, frameLayout);
                                GSYBaseVideoPlayer.this.mFullAnimEnd = true;
                            }
                        }, 300L);
                    } else {
                        frameLayout.addView(gSYBaseVideoPlayer2, new FrameLayout.LayoutParams(getWidth(), getHeight()));
                        viewGroup.addView(frameLayout, layoutParams);
                        gSYBaseVideoPlayer2.setVisibility(4);
                        frameLayout.setVisibility(4);
                        resolveFullVideoShow(context, gSYBaseVideoPlayer2, frameLayout);
                    }
                    gSYBaseVideoPlayer2.addTextureView();
                    gSYBaseVideoPlayer2.startProgressTimer();
                    getGSYVideoManager().setLastListener(this);
                    getGSYVideoManager().setListener(gSYBaseVideoPlayer2);
                    checkoutState();
                    return gSYBaseVideoPlayer2;
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    exc.printStackTrace();
                    return null;
                }
            } catch (Exception e11) {
                exc = e11;
                exc.printStackTrace();
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            exc = e;
            exc.printStackTrace();
            return null;
        }
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration, OrientationUtils orientationUtils, boolean z10, boolean z11) throws NoSuchMethodException, SecurityException {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            if (isIfCurrentIsFullscreen()) {
                return;
            }
            startWindowFullscreen(activity, z10, z11);
        } else {
            if (isIfCurrentIsFullscreen() && !isVerticalFullByVideoSize()) {
                backFromFull(activity);
            }
            if (orientationUtils != null) {
                orientationUtils.setEnable(isRotateWithSystem());
            }
        }
    }

    public GSYBaseVideoPlayer(Context context) {
        super(context);
        this.mActionBar = false;
        this.mStatusBar = false;
        this.mShowFullAnimation = true;
        this.mRotateViewAuto = true;
        this.mRotateWithSystem = true;
        this.mLockLand = false;
        this.mAutoFullWithSize = false;
        this.mNeedOrientationUtils = true;
        this.isNeedAutoAdaptation = false;
        this.mFullAnimEnd = true;
        this.mIsOnlyRotateLand = false;
        this.mInnerHandler = new Handler();
        this.mCheckoutTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                int i11;
                GSYVideoPlayer fullWindowPlayer = GSYBaseVideoPlayer.this.getFullWindowPlayer();
                if (fullWindowPlayer == null || (i10 = fullWindowPlayer.mCurrentState) == (i11 = GSYBaseVideoPlayer.this.mCurrentState) || i10 != 3 || i11 == 1) {
                    return;
                }
                fullWindowPlayer.setStateAndUi(i11);
            }
        };
    }

    public GSYBaseVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mActionBar = false;
        this.mStatusBar = false;
        this.mShowFullAnimation = true;
        this.mRotateViewAuto = true;
        this.mRotateWithSystem = true;
        this.mLockLand = false;
        this.mAutoFullWithSize = false;
        this.mNeedOrientationUtils = true;
        this.isNeedAutoAdaptation = false;
        this.mFullAnimEnd = true;
        this.mIsOnlyRotateLand = false;
        this.mInnerHandler = new Handler();
        this.mCheckoutTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                int i11;
                GSYVideoPlayer fullWindowPlayer = GSYBaseVideoPlayer.this.getFullWindowPlayer();
                if (fullWindowPlayer == null || (i10 = fullWindowPlayer.mCurrentState) == (i11 = GSYBaseVideoPlayer.this.mCurrentState) || i10 != 3 || i11 == 1) {
                    return;
                }
                fullWindowPlayer.setStateAndUi(i11);
            }
        };
    }

    public GSYBaseVideoPlayer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mActionBar = false;
        this.mStatusBar = false;
        this.mShowFullAnimation = true;
        this.mRotateViewAuto = true;
        this.mRotateWithSystem = true;
        this.mLockLand = false;
        this.mAutoFullWithSize = false;
        this.mNeedOrientationUtils = true;
        this.isNeedAutoAdaptation = false;
        this.mFullAnimEnd = true;
        this.mIsOnlyRotateLand = false;
        this.mInnerHandler = new Handler();
        this.mCheckoutTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                int i102;
                int i11;
                GSYVideoPlayer fullWindowPlayer = GSYBaseVideoPlayer.this.getFullWindowPlayer();
                if (fullWindowPlayer == null || (i102 = fullWindowPlayer.mCurrentState) == (i11 = GSYBaseVideoPlayer.this.mCurrentState) || i102 != 3 || i11 == 1) {
                    return;
                }
                fullWindowPlayer.setStateAndUi(i11);
            }
        };
    }
}
