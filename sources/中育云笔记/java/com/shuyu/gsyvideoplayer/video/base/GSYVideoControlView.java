package com.shuyu.gsyvideoplayer.video.base;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.shuyu.gsyvideoplayer.R$drawable;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.R$string;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import java.io.File;
import java.util.Map;
import p236l7.InterfaceC10152b;
import p236l7.InterfaceC10154d;
import p236l7.InterfaceC10157g;

/* loaded from: classes5.dex */
public abstract class GSYVideoControlView extends GSYVideoView implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    Runnable dismissControlTask;
    protected GestureDetector gestureDetector;
    protected boolean isShowDragProgressTextOnSeekBar;
    protected ImageView mBackButton;
    protected ViewGroup mBottomContainer;
    protected ProgressBar mBottomProgressBar;
    protected boolean mBrightness;
    protected float mBrightnessData;
    protected boolean mChangePosition;
    protected boolean mChangeVolume;
    protected TextView mCurrentTimeTextView;
    protected int mDismissControlTime;
    protected long mDownPosition;
    protected float mDownX;
    protected float mDownY;
    protected int mEnlargeImageRes;
    protected boolean mFirstTouch;
    protected ImageView mFullscreenButton;
    protected InterfaceC10154d mGSYVideoProgressListener;
    protected int mGestureDownVolume;
    protected InterfaceC10152b mGsyStateUiListener;
    protected boolean mHadSeekTouch;
    protected boolean mHideKey;
    protected boolean mIsTouchWiget;
    protected boolean mIsTouchWigetFull;
    protected View mLoadingProgressBar;
    protected InterfaceC10157g mLockClickListener;
    protected boolean mLockCurScreen;
    protected ImageView mLockScreen;
    protected float mMoveY;
    protected boolean mNeedLockFull;
    protected boolean mNeedShowWifiTip;
    protected boolean mPostDismiss;
    protected boolean mPostProgress;
    protected SeekBar mProgressBar;
    protected int mSeekEndOffset;
    protected float mSeekRatio;
    protected long mSeekTimePosition;
    protected boolean mSetUpLazy;
    protected boolean mShowVKey;
    protected int mShrinkImageRes;
    protected View mStartButton;
    protected boolean mSurfaceErrorPlay;
    protected int mThreshold;
    protected View mThumbImageView;
    protected RelativeLayout mThumbImageViewLayout;
    protected boolean mThumbPlay;
    protected TextView mTitleTextView;
    protected ViewGroup mTopContainer;
    protected TextView mTotalTimeTextView;
    protected boolean mTouchingProgressBar;
    Runnable progressTask;

    public GSYVideoControlView(@NonNull Context context) {
        super(context);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSurfaceErrorPlay = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                GSYVideoControlView.this.touchDoubleUp(motionEvent);
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                GSYVideoControlView.this.touchLongPress(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                if (!gSYVideoControlView.mChangePosition && !gSYVideoControlView.mChangeVolume && !gSYVideoControlView.mBrightness) {
                    gSYVideoControlView.onClickUiToggle(motionEvent);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        this.progressTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.4
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i10 = gSYVideoControlView.mCurrentState;
                if (i10 == 2 || i10 == 5) {
                    gSYVideoControlView.setTextAndProgress(0);
                }
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                if (gSYVideoControlView2.mPostProgress) {
                    gSYVideoControlView2.postDelayed(this, 1000L);
                }
            }
        };
        this.dismissControlTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.5
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i10 = gSYVideoControlView.mCurrentState;
                if (i10 == 0 || i10 == 7 || i10 == 6) {
                    return;
                }
                gSYVideoControlView.hideAllWidget();
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                gSYVideoControlView2.setViewShowState(gSYVideoControlView2.mLockScreen, 8);
                GSYVideoControlView gSYVideoControlView3 = GSYVideoControlView.this;
                if (gSYVideoControlView3.mHideKey && gSYVideoControlView3.mIfCurrentIsFullscreen && gSYVideoControlView3.mShowVKey) {
                    CommonUtil.hideNavKey(gSYVideoControlView3.mContext);
                }
                GSYVideoControlView gSYVideoControlView4 = GSYVideoControlView.this;
                if (gSYVideoControlView4.mPostDismiss) {
                    gSYVideoControlView4.postDelayed(this, gSYVideoControlView4.mDismissControlTime);
                }
            }
        };
    }

    public void cancelDismissControlViewTimer() {
        this.mPostDismiss = false;
        removeCallbacks(this.dismissControlTask);
    }

    public void cancelProgressTimer() {
        this.mPostProgress = false;
        removeCallbacks(this.progressTask);
    }

    public abstract void changeUiToCompleteShow();

    public abstract void changeUiToError();

    public abstract void changeUiToNormal();

    public abstract void changeUiToPauseShow();

    public abstract void changeUiToPlayingBufferingShow();

    public abstract void changeUiToPlayingShow();

    public abstract void changeUiToPreparingShow();

    public void clearThumbImageView() {
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    public void clickStartIcon() {
        if (TextUtils.isEmpty(this.mUrl)) {
            Debuger.printfError("********" + getResources().getString(R$string.no_url));
            return;
        }
        int i10 = this.mCurrentState;
        if (i10 == 0 || i10 == 7) {
            if (isShowNetConfirm()) {
                showWifiDialog();
                return;
            } else {
                startButtonLogic();
                return;
            }
        }
        if (i10 == 2) {
            try {
                onVideoPause();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            setStateAndUi(5);
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            if (this.mIfCurrentIsFullscreen) {
                Debuger.printfLog("onClickStopFullscreen");
                this.mVideoAllCallBack.mo5988j(this.mOriginUrl, this.mTitle, this);
                return;
            } else {
                Debuger.printfLog("onClickStop");
                this.mVideoAllCallBack.mo6001y(this.mOriginUrl, this.mTitle, this);
                return;
            }
        }
        if (i10 != 5) {
            if (i10 == 6) {
                startButtonLogic();
                return;
            }
            return;
        }
        if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            if (this.mIfCurrentIsFullscreen) {
                Debuger.printfLog("onClickResumeFullscreen");
                this.mVideoAllCallBack.mo5993o(this.mOriginUrl, this.mTitle, this);
            } else {
                Debuger.printfLog("onClickResume");
                this.mVideoAllCallBack.mo6000x(this.mOriginUrl, this.mTitle, this);
            }
        }
        if (!this.mHadPlay && !this.mStartAfterPrepared) {
            startAfterPrepared();
        }
        try {
            getGSYVideoManager().start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        setStateAndUi(2);
    }

    public abstract void dismissBrightnessDialog();

    public abstract void dismissProgressDialog();

    public abstract void dismissVolumeDialog();

    public ImageView getBackButton() {
        return this.mBackButton;
    }

    public int getDismissControlTime() {
        return this.mDismissControlTime;
    }

    public int getEnlargeImageRes() {
        int i10 = this.mEnlargeImageRes;
        return i10 == -1 ? R$drawable.video_enlarge : i10;
    }

    public ImageView getFullscreenButton() {
        return this.mFullscreenButton;
    }

    public InterfaceC10152b getGSYStateUiListener() {
        return null;
    }

    public float getSeekRatio() {
        return this.mSeekRatio;
    }

    public int getShrinkImageRes() {
        int i10 = this.mShrinkImageRes;
        return i10 == -1 ? R$drawable.video_shrink : i10;
    }

    public View getStartButton() {
        return this.mStartButton;
    }

    public View getThumbImageView() {
        return this.mThumbImageView;
    }

    public RelativeLayout getThumbImageViewLayout() {
        return this.mThumbImageViewLayout;
    }

    public TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public abstract void hideAllWidget();

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        RelativeLayout relativeLayout;
        super.init(context);
        this.mStartButton = findViewById(R$id.start);
        this.mTitleTextView = (TextView) findViewById(R$id.title);
        this.mBackButton = (ImageView) findViewById(R$id.back);
        this.mFullscreenButton = (ImageView) findViewById(R$id.fullscreen);
        this.mProgressBar = (SeekBar) findViewById(R$id.progress);
        this.mCurrentTimeTextView = (TextView) findViewById(R$id.current);
        this.mTotalTimeTextView = (TextView) findViewById(R$id.total);
        this.mBottomContainer = (ViewGroup) findViewById(R$id.layout_bottom);
        this.mTopContainer = (ViewGroup) findViewById(R$id.layout_top);
        this.mBottomProgressBar = (ProgressBar) findViewById(R$id.bottom_progressbar);
        this.mThumbImageViewLayout = (RelativeLayout) findViewById(R$id.thumb);
        this.mLockScreen = (ImageView) findViewById(R$id.lock_screen);
        this.mLoadingProgressBar = findViewById(R$id.loading);
        if (isInEditMode()) {
            return;
        }
        View view = this.mStartButton;
        if (view != null) {
            view.setOnClickListener(this);
        }
        ImageView imageView = this.mFullscreenButton;
        if (imageView != null) {
            imageView.setOnClickListener(this);
            this.mFullscreenButton.setOnTouchListener(this);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
        }
        ViewGroup viewGroup = this.mBottomContainer;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
        }
        ViewGroup viewGroup2 = this.mTextureViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(this);
            this.mTextureViewContainer.setOnTouchListener(this);
        }
        SeekBar seekBar2 = this.mProgressBar;
        if (seekBar2 != null) {
            seekBar2.setOnTouchListener(this);
        }
        RelativeLayout relativeLayout2 = this.mThumbImageViewLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
            this.mThumbImageViewLayout.setOnClickListener(this);
        }
        if (this.mThumbImageView != null && !this.mIfCurrentIsFullscreen && (relativeLayout = this.mThumbImageViewLayout) != null) {
            relativeLayout.removeAllViews();
            resolveThumbImage(this.mThumbImageView);
        }
        ImageView imageView2 = this.mBackButton;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.mLockScreen;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            this.mLockScreen.setOnClickListener(new View.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                    int i10 = gSYVideoControlView.mCurrentState;
                    if (i10 == 6 || i10 == 7) {
                        return;
                    }
                    gSYVideoControlView.lockTouchLogic();
                    GSYVideoControlView.this.getClass();
                }
            });
        }
        if (getActivityContext() != null) {
            this.mSeekEndOffset = CommonUtil.dip2px(getActivityContext(), 50.0f);
        }
    }

    public void initUIState() {
        setStateAndUi(0);
    }

    public boolean isHideKey() {
        return this.mHideKey;
    }

    public boolean isNeedLockFull() {
        return this.mNeedLockFull;
    }

    public boolean isNeedShowWifiTip() {
        return this.mNeedShowWifiTip;
    }

    public boolean isShowDragProgressTextOnSeekBar() {
        return this.isShowDragProgressTextOnSeekBar;
    }

    public boolean isShowNetConfirm() {
        return (this.mOriginUrl.startsWith("file") || this.mOriginUrl.startsWith("android.resource") || CommonUtil.isWifiConnected(getContext()) || !this.mNeedShowWifiTip || getGSYVideoManager().cachePreview(this.mContext.getApplicationContext(), this.mCachePath, this.mOriginUrl)) ? false : true;
    }

    public boolean isSurfaceErrorPlay() {
        return this.mSurfaceErrorPlay;
    }

    public boolean isTouchWiget() {
        return this.mIsTouchWiget;
    }

    public boolean isTouchWigetFull() {
        return this.mIsTouchWigetFull;
    }

    public void lockTouchLogic() {
        if (this.mLockCurScreen) {
            this.mLockScreen.setImageResource(R$drawable.unlock);
            this.mLockCurScreen = false;
        } else {
            this.mLockScreen.setImageResource(R$drawable.lock);
            this.mLockCurScreen = true;
            hideAllWidget();
        }
    }

    public void loopSetProgressAndTime() {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null) {
            return;
        }
        seekBar.setProgress(0);
        this.mProgressBar.setSecondaryProgress(0);
        this.mCurrentTimeTextView.setText(CommonUtil.stringForTime(0L));
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onAutoCompletion() {
        super.onAutoCompletion();
        if (this.mLockCurScreen) {
            lockTouchLogic();
            this.mLockScreen.setVisibility(8);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public abstract /* synthetic */ void onBackFullscreen();

    public void onBrightnessSlide(float f10) {
        float f11 = ((Activity) this.mContext).getWindow().getAttributes().screenBrightness;
        this.mBrightnessData = f11;
        if (f11 <= 0.0f) {
            this.mBrightnessData = 0.5f;
        } else if (f11 < 0.01f) {
            this.mBrightnessData = 0.01f;
        }
        WindowManager.LayoutParams attributes = ((Activity) this.mContext).getWindow().getAttributes();
        float f12 = this.mBrightnessData + f10;
        attributes.screenBrightness = f12;
        if (f12 > 1.0f) {
            attributes.screenBrightness = 1.0f;
        } else if (f12 < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        showBrightnessDialog(attributes.screenBrightness);
        ((Activity) this.mContext).getWindow().setAttributes(attributes);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onBufferingUpdate(final int i10) {
        post(new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.3
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i11 = gSYVideoControlView.mCurrentState;
                if (i11 == 0 || i11 == 1) {
                    return;
                }
                int i12 = i10;
                if (i12 != 0) {
                    gSYVideoControlView.setTextAndProgress(i12);
                    GSYVideoControlView.this.mBufferPoint = i10;
                    Debuger.printfLog("Net speed: " + GSYVideoControlView.this.getNetSpeedText() + " percent " + i10);
                }
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                SeekBar seekBar = gSYVideoControlView2.mProgressBar;
                if (seekBar != null && gSYVideoControlView2.mLooping && gSYVideoControlView2.mHadPlay && i10 == 0 && seekBar.getProgress() >= GSYVideoControlView.this.mProgressBar.getMax() - 1) {
                    GSYVideoControlView.this.loopSetProgressAndTime();
                }
            }
        });
    }

    public void onClick(View view) {
        int id2 = view.getId();
        if (this.mHideKey && this.mIfCurrentIsFullscreen) {
            CommonUtil.hideNavKey(this.mContext);
        }
        if (id2 == R$id.start) {
            clickStartIcon();
            return;
        }
        int i10 = R$id.surface_container;
        if (id2 == i10 && this.mCurrentState == 7) {
            if (!this.mSurfaceErrorPlay) {
                onClickUiToggle(null);
                return;
            }
            if (this.mVideoAllCallBack != null) {
                Debuger.printfLog("onClickStartError");
                this.mVideoAllCallBack.mo5983e(this.mOriginUrl, this.mTitle, this);
            }
            prepareVideo();
            return;
        }
        if (id2 != R$id.thumb) {
            if (id2 == i10) {
                if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
                    if (this.mIfCurrentIsFullscreen) {
                        Debuger.printfLog("onClickBlankFullscreen");
                        this.mVideoAllCallBack.mo5980b(this.mOriginUrl, this.mTitle, this);
                    } else {
                        Debuger.printfLog("onClickBlank");
                        this.mVideoAllCallBack.mo5995r(this.mOriginUrl, this.mTitle, this);
                    }
                }
                startDismissControlViewTimer();
                return;
            }
            return;
        }
        if (this.mThumbPlay) {
            if (TextUtils.isEmpty(this.mUrl)) {
                Debuger.printfError("********" + getResources().getString(R$string.no_url));
                return;
            }
            int i11 = this.mCurrentState;
            if (i11 != 0) {
                if (i11 == 6) {
                    onClickUiToggle(null);
                }
            } else if (isShowNetConfirm()) {
                showWifiDialog();
            } else {
                startPlayLogic();
            }
        }
    }

    public abstract void onClickUiToggle(MotionEvent motionEvent);

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Debuger.printfLog(hashCode() + "------------------------------ dismiss onDetachedFromWindow");
        cancelProgressTimer();
        cancelDismissControlViewTimer();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onError(int i10, int i11) {
        super.onError(i10, i11);
        if (this.mLockCurScreen) {
            lockTouchLogic();
            this.mLockScreen.setVisibility(8);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onPrepared() {
        setTextAndProgress(0, true);
        super.onPrepared();
        if (this.mCurrentState != 1) {
            return;
        }
        startProgressTimer();
        Debuger.printfLog(hashCode() + "------------------------------ surface_container onPrepared");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        showDragProgressTextOnSeekBar(z10, i10);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.mHadSeekTouch = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            if (isIfCurrentIsFullscreen()) {
                Debuger.printfLog("onClickSeekbarFullscreen");
                this.mVideoAllCallBack.mo5989k(this.mOriginUrl, this.mTitle, this);
            } else {
                Debuger.printfLog("onClickSeekbar");
                this.mVideoAllCallBack.mo5996s(this.mOriginUrl, this.mTitle, this);
            }
        }
        if (getGSYVideoManager() != null && this.mHadPlay) {
            try {
                getGSYVideoManager().seekTo((seekBar.getProgress() * getDuration()) / 100);
            } catch (Exception e10) {
                Debuger.printfWarning(e10.toString());
            }
        }
        this.mHadSeekTouch = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id2 = view.getId();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.mIfCurrentIsFullscreen && this.mLockCurScreen && this.mNeedLockFull) {
            onClickUiToggle(motionEvent);
            startDismissControlViewTimer();
            return true;
        }
        if (id2 == R$id.fullscreen) {
            return false;
        }
        if (id2 == R$id.surface_container) {
            int action = motionEvent.getAction();
            if (action == 0) {
                touchSurfaceDown(x10, y10);
            } else if (action == 1) {
                startDismissControlViewTimer();
                touchSurfaceUp();
                Debuger.printfLog(hashCode() + "------------------------------ surface_container ACTION_UP");
                startProgressTimer();
                if (this.mHideKey && this.mShowVKey) {
                    return true;
                }
            } else if (action == 2) {
                float f10 = x10 - this.mDownX;
                float f11 = y10 - this.mDownY;
                float fAbs = Math.abs(f10);
                float fAbs2 = Math.abs(f11);
                boolean z10 = this.mIfCurrentIsFullscreen;
                if (((z10 && this.mIsTouchWigetFull) || (this.mIsTouchWiget && !z10)) && !this.mChangePosition && !this.mChangeVolume && !this.mBrightness) {
                    touchSurfaceMoveFullLogic(fAbs, fAbs2);
                }
                touchSurfaceMove(f10, f11, y10);
            }
            this.gestureDetector.onTouchEvent(motionEvent);
        } else if (id2 == R$id.progress) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                cancelDismissControlViewTimer();
            } else if (action2 == 1) {
                startDismissControlViewTimer();
                Debuger.printfLog(hashCode() + "------------------------------ progress ACTION_UP");
                startProgressTimer();
                for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.mBrightnessData = -1.0f;
            } else if (action2 == 2) {
            }
            cancelProgressTimer();
            for (ViewParent parent2 = getParent(); parent2 != null; parent2 = parent2.getParent()) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void prepareVideo() {
        if (this.mSetUpLazy) {
            super.setUp(this.mOriginUrl, this.mCache, this.mCachePath, this.mMapHeadData, this.mTitle);
        }
        super.prepareVideo();
    }

    public void resetProgressAndTime() {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null) {
            return;
        }
        seekBar.setProgress(0);
        this.mProgressBar.setSecondaryProgress(0);
        this.mCurrentTimeTextView.setText(CommonUtil.stringForTime(0L));
        this.mTotalTimeTextView.setText(CommonUtil.stringForTime(0L));
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
            this.mBottomProgressBar.setSecondaryProgress(0);
        }
    }

    public void resolveThumbImage(View view) {
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.mThumbImageViewLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    public void resolveUIState(int i10) {
        if (i10 == 0) {
            changeUiToNormal();
            cancelDismissControlViewTimer();
            return;
        }
        if (i10 == 1) {
            changeUiToPreparingShow();
            startDismissControlViewTimer();
            return;
        }
        if (i10 == 2) {
            changeUiToPlayingShow();
            startDismissControlViewTimer();
            return;
        }
        if (i10 == 3) {
            changeUiToPlayingBufferingShow();
            return;
        }
        if (i10 == 5) {
            changeUiToPauseShow();
            cancelDismissControlViewTimer();
        } else if (i10 == 6) {
            changeUiToCompleteShow();
            cancelDismissControlViewTimer();
        } else {
            if (i10 != 7) {
                return;
            }
            changeUiToError();
        }
    }

    public void setDismissControlTime(int i10) {
        this.mDismissControlTime = i10;
    }

    public void setEnlargeImageRes(int i10) {
        this.mEnlargeImageRes = i10;
    }

    public void setHideKey(boolean z10) {
        this.mHideKey = z10;
    }

    public void setIsTouchWiget(boolean z10) {
        this.mIsTouchWiget = z10;
    }

    public void setIsTouchWigetFull(boolean z10) {
        this.mIsTouchWigetFull = z10;
    }

    public void setNeedLockFull(boolean z10) {
        this.mNeedLockFull = z10;
    }

    public void setNeedShowWifiTip(boolean z10) {
        this.mNeedShowWifiTip = z10;
    }

    public void setProgressAndTime(long j10, long j11, long j12, long j13, boolean z10) {
        SeekBar seekBar = this.mProgressBar;
        if (seekBar == null || this.mTotalTimeTextView == null || this.mCurrentTimeTextView == null || this.mHadSeekTouch) {
            return;
        }
        if (!this.mTouchingProgressBar && (j10 != 0 || z10)) {
            seekBar.setProgress((int) j10);
        }
        if (getGSYVideoManager().getBufferedPercentage() > 0) {
            j11 = getGSYVideoManager().getBufferedPercentage();
        }
        if (j11 > 94) {
            j11 = 100;
        }
        setSecondaryProgress(j11);
        this.mTotalTimeTextView.setText(CommonUtil.stringForTime(j13));
        if (j12 > 0) {
            this.mCurrentTimeTextView.setText(CommonUtil.stringForTime(j12));
        }
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            if (j10 != 0 || z10) {
                progressBar.setProgress((int) j10);
            }
            setSecondaryProgress(j11);
        }
    }

    public void setSecondaryProgress(long j10) {
        if (this.mProgressBar != null && j10 != 0 && !getGSYVideoManager().isCacheFile()) {
            this.mProgressBar.setSecondaryProgress((int) j10);
        }
        if (this.mBottomProgressBar == null || j10 == 0 || getGSYVideoManager().isCacheFile()) {
            return;
        }
        this.mBottomProgressBar.setSecondaryProgress((int) j10);
    }

    public void setSeekRatio(float f10) {
        if (f10 < 0.0f) {
            return;
        }
        this.mSeekRatio = f10;
    }

    public void setShowDragProgressTextOnSeekBar(boolean z10) {
        this.isShowDragProgressTextOnSeekBar = z10;
    }

    public void setShrinkImageRes(int i10) {
        this.mShrinkImageRes = i10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    public void setSmallVideoTextureView(View.OnTouchListener onTouchListener) {
        super.setSmallVideoTextureView(onTouchListener);
        RelativeLayout relativeLayout = this.mThumbImageViewLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void setStateAndUi(int i10) {
        TextView textView;
        this.mCurrentState = i10;
        if ((i10 == 0 && isCurrentMediaListener()) || i10 == 6 || i10 == 7) {
            this.mHadPrepared = false;
        }
        int i11 = this.mCurrentState;
        if (i11 == 0) {
            if (isCurrentMediaListener()) {
                Debuger.printfLog(hashCode() + "------------------------------ dismiss CURRENT_STATE_NORMAL");
                cancelProgressTimer();
                getGSYVideoManager().releaseMediaPlayer();
                releasePauseCover();
                this.mBufferPoint = 0;
                this.mSaveChangeViewTIme = 0L;
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
                }
            }
            releaseNetWorkState();
        } else if (i11 == 1) {
            resetProgressAndTime();
        } else if (i11 != 2) {
            if (i11 == 5) {
                Debuger.printfLog(hashCode() + "------------------------------ CURRENT_STATE_PAUSE");
                startProgressTimer();
            } else if (i11 == 6) {
                Debuger.printfLog(hashCode() + "------------------------------ dismiss CURRENT_STATE_AUTO_COMPLETE");
                cancelProgressTimer();
                SeekBar seekBar = this.mProgressBar;
                if (seekBar != null) {
                    seekBar.setProgress(100);
                }
                TextView textView2 = this.mCurrentTimeTextView;
                if (textView2 != null && (textView = this.mTotalTimeTextView) != null) {
                    textView2.setText(textView.getText());
                }
                ProgressBar progressBar = this.mBottomProgressBar;
                if (progressBar != null) {
                    progressBar.setProgress(100);
                }
            } else if (i11 == 7 && isCurrentMediaListener()) {
                getGSYVideoManager().releaseMediaPlayer();
            }
        } else if (isCurrentMediaListener()) {
            Debuger.printfLog(hashCode() + "------------------------------ CURRENT_STATE_PLAYING");
            startProgressTimer();
        }
        resolveUIState(i10);
    }

    public void setSurfaceErrorPlay(boolean z10) {
        this.mSurfaceErrorPlay = z10;
    }

    public void setTextAndProgress(int i10) {
        setTextAndProgress(i10, false);
    }

    public void setThumbImageView(View view) {
        if (this.mThumbImageViewLayout != null) {
            this.mThumbImageView = view;
            resolveThumbImage(view);
        }
    }

    public void setThumbPlay(boolean z10) {
        this.mThumbPlay = z10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z10, String str2) {
        return setUp(str, z10, null, str2);
    }

    public boolean setUpLazy(String str, boolean z10, File file, Map<String, String> map, String str2) {
        this.mOriginUrl = str;
        this.mCache = z10;
        this.mCachePath = file;
        this.mSetUpLazy = true;
        this.mTitle = str2;
        this.mMapHeadData = map;
        if (isCurrentMediaListener() && System.currentTimeMillis() - this.mSaveChangeViewTIme < 2000) {
            return false;
        }
        this.mUrl = "waiting";
        this.mCurrentState = 0;
        return true;
    }

    public void setViewShowState(View view, int i10) {
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public abstract void showBrightnessDialog(float f10);

    public void showDragProgressTextOnSeekBar(boolean z10, int i10) {
        if (z10 && this.isShowDragProgressTextOnSeekBar) {
            long duration = getDuration();
            TextView textView = this.mCurrentTimeTextView;
            if (textView != null) {
                textView.setText(CommonUtil.stringForTime((i10 * duration) / 100));
            }
        }
    }

    public abstract void showProgressDialog(float f10, String str, long j10, String str2, long j11);

    public abstract void showVolumeDialog(float f10, int i10);

    public abstract void showWifiDialog();

    public void startDismissControlViewTimer() {
        cancelDismissControlViewTimer();
        this.mPostDismiss = true;
        postDelayed(this.dismissControlTask, this.mDismissControlTime);
    }

    public void startProgressTimer() {
        cancelProgressTimer();
        this.mPostProgress = true;
        postDelayed(this.progressTask, 300L);
    }

    public void touchDoubleUp(MotionEvent motionEvent) {
        if (this.mHadPlay) {
            clickStartIcon();
        }
    }

    public void touchLongPress(MotionEvent motionEvent) {
    }

    public void touchSurfaceDown(float f10, float f11) {
        this.mTouchingProgressBar = true;
        this.mDownX = f10;
        this.mDownY = f11;
        this.mMoveY = 0.0f;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = true;
    }

    public void touchSurfaceMove(float f10, float f11, float f12) {
        int i10;
        int i11;
        if (getActivityContext() != null) {
            i10 = CommonUtil.getCurrentScreenLand((Activity) getActivityContext()) ? this.mScreenHeight : this.mScreenWidth;
            i11 = CommonUtil.getCurrentScreenLand((Activity) getActivityContext()) ? this.mScreenWidth : this.mScreenHeight;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (this.mChangePosition) {
            long duration = getDuration();
            long j10 = (int) (this.mDownPosition + (((duration * f10) / i10) / this.mSeekRatio));
            this.mSeekTimePosition = j10;
            if (j10 < 0) {
                this.mSeekTimePosition = 0L;
            }
            if (this.mSeekTimePosition > duration) {
                this.mSeekTimePosition = duration;
            }
            showProgressDialog(f10, CommonUtil.stringForTime(this.mSeekTimePosition), this.mSeekTimePosition, CommonUtil.stringForTime(duration), duration);
            return;
        }
        if (this.mChangeVolume) {
            float f13 = -f11;
            float f14 = i11;
            this.mAudioManager.setStreamVolume(3, this.mGestureDownVolume + ((int) (((this.mAudioManager.getStreamMaxVolume(3) * f13) * 3.0f) / f14)), 0);
            showVolumeDialog(-f13, (int) (((this.mGestureDownVolume * 100) / r14) + (((3.0f * f13) * 100.0f) / f14)));
            return;
        }
        if (!this.mBrightness || Math.abs(f11) <= this.mThreshold) {
            return;
        }
        onBrightnessSlide((-f11) / i11);
        this.mDownY = f12;
    }

    public void touchSurfaceMoveFullLogic(float f10, float f11) {
        int i10 = getActivityContext() != null ? CommonUtil.getCurrentScreenLand((Activity) getActivityContext()) ? this.mScreenHeight : this.mScreenWidth : 0;
        int i11 = this.mThreshold;
        if (f10 > i11 || f11 > i11) {
            cancelProgressTimer();
            if (f10 >= this.mThreshold) {
                if (Math.abs(CommonUtil.getScreenWidth(getContext()) - this.mDownX) <= this.mSeekEndOffset) {
                    this.mShowVKey = true;
                    return;
                } else {
                    this.mChangePosition = true;
                    this.mDownPosition = getCurrentPositionWhenPlaying();
                    return;
                }
            }
            boolean z10 = Math.abs(((float) CommonUtil.getScreenHeight(getContext())) - this.mDownY) > ((float) this.mSeekEndOffset);
            if (this.mFirstTouch) {
                this.mBrightness = this.mDownX < ((float) i10) * 0.5f && z10;
                this.mFirstTouch = false;
            }
            if (!this.mBrightness) {
                this.mChangeVolume = z10;
                this.mGestureDownVolume = this.mAudioManager.getStreamVolume(3);
            }
            this.mShowVKey = !z10;
        }
    }

    public void touchSurfaceUp() {
        int i10;
        if (this.mChangePosition) {
            long duration = getDuration();
            long j10 = this.mSeekTimePosition * 100;
            if (duration == 0) {
                duration = 1;
            }
            long j11 = j10 / duration;
            ProgressBar progressBar = this.mBottomProgressBar;
            if (progressBar != null) {
                progressBar.setProgress((int) j11);
            }
        }
        this.mTouchingProgressBar = false;
        dismissProgressDialog();
        dismissVolumeDialog();
        dismissBrightnessDialog();
        if (this.mChangePosition && getGSYVideoManager() != null && ((i10 = this.mCurrentState) == 2 || i10 == 5)) {
            try {
                getGSYVideoManager().seekTo(this.mSeekTimePosition);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            long duration2 = getDuration();
            long j12 = (this.mSeekTimePosition * 100) / (duration2 != 0 ? duration2 : 1L);
            SeekBar seekBar = this.mProgressBar;
            if (seekBar != null) {
                seekBar.setProgress((int) j12);
            }
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            Debuger.printfLog("onTouchScreenSeekPosition");
            this.mVideoAllCallBack.mo5986h(this.mOriginUrl, this.mTitle, this);
            return;
        }
        if (this.mBrightness) {
            if (this.mVideoAllCallBack == null || !isCurrentMediaListener()) {
                return;
            }
            Debuger.printfLog("onTouchScreenSeekLight");
            this.mVideoAllCallBack.mo5985g(this.mOriginUrl, this.mTitle, this);
            return;
        }
        if (this.mChangeVolume && this.mVideoAllCallBack != null && isCurrentMediaListener()) {
            Debuger.printfLog("onTouchScreenSeekVolume");
            this.mVideoAllCallBack.mo5994p(this.mOriginUrl, this.mTitle, this);
        }
    }

    public void setTextAndProgress(int i10, boolean z10) {
        long currentPositionWhenPlaying = getCurrentPositionWhenPlaying();
        long duration = getDuration();
        setProgressAndTime((100 * currentPositionWhenPlaying) / (duration == 0 ? 1L : duration), i10, currentPositionWhenPlaying, duration, z10);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z10, File file, String str2) {
        TextView textView;
        if (!super.setUp(str, z10, file, str2)) {
            return false;
        }
        if (str2 != null && (textView = this.mTitleTextView) != null) {
            textView.setText(str2);
        }
        if (this.mIfCurrentIsFullscreen) {
            ImageView imageView = this.mFullscreenButton;
            if (imageView == null) {
                return true;
            }
            imageView.setImageResource(getShrinkImageRes());
            return true;
        }
        ImageView imageView2 = this.mFullscreenButton;
        if (imageView2 == null) {
            return true;
        }
        imageView2.setImageResource(getEnlargeImageRes());
        return true;
    }

    public void setGSYStateUiListener(InterfaceC10152b interfaceC10152b) {
    }

    public void setGSYVideoProgressListener(InterfaceC10154d interfaceC10154d) {
    }

    public void setLockClickListener(InterfaceC10157g interfaceC10157g) {
    }

    public GSYVideoControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSurfaceErrorPlay = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                GSYVideoControlView.this.touchDoubleUp(motionEvent);
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                GSYVideoControlView.this.touchLongPress(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                if (!gSYVideoControlView.mChangePosition && !gSYVideoControlView.mChangeVolume && !gSYVideoControlView.mBrightness) {
                    gSYVideoControlView.onClickUiToggle(motionEvent);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        this.progressTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.4
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i10 = gSYVideoControlView.mCurrentState;
                if (i10 == 2 || i10 == 5) {
                    gSYVideoControlView.setTextAndProgress(0);
                }
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                if (gSYVideoControlView2.mPostProgress) {
                    gSYVideoControlView2.postDelayed(this, 1000L);
                }
            }
        };
        this.dismissControlTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.5
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i10 = gSYVideoControlView.mCurrentState;
                if (i10 == 0 || i10 == 7 || i10 == 6) {
                    return;
                }
                gSYVideoControlView.hideAllWidget();
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                gSYVideoControlView2.setViewShowState(gSYVideoControlView2.mLockScreen, 8);
                GSYVideoControlView gSYVideoControlView3 = GSYVideoControlView.this;
                if (gSYVideoControlView3.mHideKey && gSYVideoControlView3.mIfCurrentIsFullscreen && gSYVideoControlView3.mShowVKey) {
                    CommonUtil.hideNavKey(gSYVideoControlView3.mContext);
                }
                GSYVideoControlView gSYVideoControlView4 = GSYVideoControlView.this;
                if (gSYVideoControlView4.mPostDismiss) {
                    gSYVideoControlView4.postDelayed(this, gSYVideoControlView4.mDismissControlTime);
                }
            }
        };
    }

    public GSYVideoControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSurfaceErrorPlay = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                GSYVideoControlView.this.touchDoubleUp(motionEvent);
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                GSYVideoControlView.this.touchLongPress(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                if (!gSYVideoControlView.mChangePosition && !gSYVideoControlView.mChangeVolume && !gSYVideoControlView.mBrightness) {
                    gSYVideoControlView.onClickUiToggle(motionEvent);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        this.progressTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.4
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i102 = gSYVideoControlView.mCurrentState;
                if (i102 == 2 || i102 == 5) {
                    gSYVideoControlView.setTextAndProgress(0);
                }
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                if (gSYVideoControlView2.mPostProgress) {
                    gSYVideoControlView2.postDelayed(this, 1000L);
                }
            }
        };
        this.dismissControlTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.5
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i102 = gSYVideoControlView.mCurrentState;
                if (i102 == 0 || i102 == 7 || i102 == 6) {
                    return;
                }
                gSYVideoControlView.hideAllWidget();
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                gSYVideoControlView2.setViewShowState(gSYVideoControlView2.mLockScreen, 8);
                GSYVideoControlView gSYVideoControlView3 = GSYVideoControlView.this;
                if (gSYVideoControlView3.mHideKey && gSYVideoControlView3.mIfCurrentIsFullscreen && gSYVideoControlView3.mShowVKey) {
                    CommonUtil.hideNavKey(gSYVideoControlView3.mContext);
                }
                GSYVideoControlView gSYVideoControlView4 = GSYVideoControlView.this;
                if (gSYVideoControlView4.mPostDismiss) {
                    gSYVideoControlView4.postDelayed(this, gSYVideoControlView4.mDismissControlTime);
                }
            }
        };
    }

    public GSYVideoControlView(Context context, Boolean bool) {
        super(context, bool);
        this.mThreshold = 80;
        this.mShrinkImageRes = -1;
        this.mEnlargeImageRes = -1;
        this.mDismissControlTime = 2500;
        this.mBrightnessData = -1.0f;
        this.mSeekRatio = 1.0f;
        this.mTouchingProgressBar = false;
        this.mChangeVolume = false;
        this.mChangePosition = false;
        this.mShowVKey = false;
        this.mBrightness = false;
        this.mFirstTouch = false;
        this.mHideKey = true;
        this.mNeedShowWifiTip = true;
        this.mIsTouchWiget = true;
        this.mIsTouchWigetFull = true;
        this.mSurfaceErrorPlay = true;
        this.mSetUpLazy = false;
        this.mHadSeekTouch = false;
        this.mPostProgress = false;
        this.mPostDismiss = false;
        this.isShowDragProgressTextOnSeekBar = false;
        this.gestureDetector = new GestureDetector(getContext().getApplicationContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                GSYVideoControlView.this.touchDoubleUp(motionEvent);
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                GSYVideoControlView.this.touchLongPress(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                if (!gSYVideoControlView.mChangePosition && !gSYVideoControlView.mChangeVolume && !gSYVideoControlView.mBrightness) {
                    gSYVideoControlView.onClickUiToggle(motionEvent);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        this.progressTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.4
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i102 = gSYVideoControlView.mCurrentState;
                if (i102 == 2 || i102 == 5) {
                    gSYVideoControlView.setTextAndProgress(0);
                }
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                if (gSYVideoControlView2.mPostProgress) {
                    gSYVideoControlView2.postDelayed(this, 1000L);
                }
            }
        };
        this.dismissControlTask = new Runnable() { // from class: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView.5
            @Override // java.lang.Runnable
            public void run() {
                GSYVideoControlView gSYVideoControlView = GSYVideoControlView.this;
                int i102 = gSYVideoControlView.mCurrentState;
                if (i102 == 0 || i102 == 7 || i102 == 6) {
                    return;
                }
                gSYVideoControlView.hideAllWidget();
                GSYVideoControlView gSYVideoControlView2 = GSYVideoControlView.this;
                gSYVideoControlView2.setViewShowState(gSYVideoControlView2.mLockScreen, 8);
                GSYVideoControlView gSYVideoControlView3 = GSYVideoControlView.this;
                if (gSYVideoControlView3.mHideKey && gSYVideoControlView3.mIfCurrentIsFullscreen && gSYVideoControlView3.mShowVKey) {
                    CommonUtil.hideNavKey(gSYVideoControlView3.mContext);
                }
                GSYVideoControlView gSYVideoControlView4 = GSYVideoControlView.this;
                if (gSYVideoControlView4.mPostDismiss) {
                    gSYVideoControlView4.postDelayed(this, gSYVideoControlView4.mDismissControlTime);
                }
            }
        };
    }
}
