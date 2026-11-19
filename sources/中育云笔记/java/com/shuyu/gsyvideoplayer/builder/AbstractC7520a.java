package com.shuyu.gsyvideoplayer.builder;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.io.File;
import java.util.Map;
import p236l7.InterfaceC10152b;
import p236l7.InterfaceC10154d;
import p236l7.InterfaceC10157g;
import p236l7.InterfaceC10158h;
import p291p7.C10635a;

/* renamed from: com.shuyu.gsyvideoplayer.builder.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7520a {
    protected Drawable mBottomProgressDrawable;
    protected Drawable mBottomShowProgressDrawable;
    protected Drawable mBottomShowProgressThumbDrawable;
    protected File mCachePath;
    protected boolean mCacheWithPlay;
    protected Drawable mDialogProgressBarDrawable;
    protected InterfaceC10152b mGSYStateUiListener;
    protected InterfaceC10154d mGSYVideoProgressListener;
    protected InterfaceC10157g mLockClickListener;
    protected Map<String, String> mMapHeadData;
    protected boolean mNeedLockFull;
    protected String mOverrideExtension;
    protected boolean mSounchTouch;
    protected View mThumbImageView;
    protected boolean mThumbPlay;
    protected String mUrl;
    protected InterfaceC10158h mVideoAllCallBack;
    protected Drawable mVolumeProgressDrawable;
    protected int mShrinkImageRes = -1;
    protected int mEnlargeImageRes = -1;
    protected int mPlayPosition = -22;
    protected int mDialogProgressHighLightColor = -11;
    protected int mDialogProgressNormalColor = -11;
    protected int mDismissControlTime = 2500;
    protected long mSeekOnStart = -1;
    protected float mSeekRatio = 1.0f;
    protected float mSpeed = 1.0f;
    protected boolean mHideKey = true;
    protected boolean mShowFullAnimation = true;
    protected boolean mAutoFullWithSize = false;
    protected boolean mNeedShowWifiTip = true;
    protected boolean mRotateViewAuto = true;
    protected boolean mLockLand = false;
    protected boolean mLooping = false;
    protected boolean mIsTouchWiget = true;
    protected boolean mIsTouchWigetFull = true;
    protected boolean mShowPauseCover = true;
    protected boolean mRotateWithSystem = true;
    protected boolean mSurfaceErrorPlay = true;
    protected boolean mSetUpLazy = false;
    protected boolean mStartAfterPrepared = true;
    protected boolean mReleaseWhenLossAudio = true;
    protected boolean mActionBar = false;
    protected boolean mStatusBar = false;
    protected boolean isShowDragProgressTextOnSeekBar = false;
    protected String mPlayTag = "";
    protected String mVideoTitle = null;
    private boolean mIsOnlyRotateLand = false;
    protected GSYVideoGLView.InterfaceC7528c mEffectFilter = new C10635a();
    protected boolean mNeedOrientationUtils = true;

    public void build(StandardGSYVideoPlayer standardGSYVideoPlayer) {
        int i10;
        Drawable drawable;
        Drawable drawable2 = this.mBottomShowProgressDrawable;
        if (drawable2 != null && (drawable = this.mBottomShowProgressThumbDrawable) != null) {
            standardGSYVideoPlayer.setBottomShowProgressBarDrawable(drawable2, drawable);
        }
        Drawable drawable3 = this.mBottomProgressDrawable;
        if (drawable3 != null) {
            standardGSYVideoPlayer.setBottomProgressBarDrawable(drawable3);
        }
        Drawable drawable4 = this.mVolumeProgressDrawable;
        if (drawable4 != null) {
            standardGSYVideoPlayer.setDialogVolumeProgressBar(drawable4);
        }
        Drawable drawable5 = this.mDialogProgressBarDrawable;
        if (drawable5 != null) {
            standardGSYVideoPlayer.setDialogProgressBar(drawable5);
        }
        int i11 = this.mDialogProgressHighLightColor;
        if (i11 > 0 && (i10 = this.mDialogProgressNormalColor) > 0) {
            standardGSYVideoPlayer.setDialogProgressColor(i11, i10);
        }
        build((GSYBaseVideoPlayer) standardGSYVideoPlayer);
    }

    public AbstractC7520a setAutoFullWithSize(boolean z10) {
        this.mAutoFullWithSize = z10;
        return this;
    }

    public AbstractC7520a setBottomProgressBarDrawable(Drawable drawable) {
        this.mBottomProgressDrawable = drawable;
        return this;
    }

    public AbstractC7520a setBottomShowProgressBarDrawable(Drawable drawable, Drawable drawable2) {
        this.mBottomShowProgressDrawable = drawable;
        this.mBottomShowProgressThumbDrawable = drawable2;
        return this;
    }

    public AbstractC7520a setCachePath(File file) {
        this.mCachePath = file;
        return this;
    }

    public AbstractC7520a setCacheWithPlay(boolean z10) {
        this.mCacheWithPlay = z10;
        return this;
    }

    public AbstractC7520a setDialogProgressBar(Drawable drawable) {
        this.mDialogProgressBarDrawable = drawable;
        return this;
    }

    public AbstractC7520a setDialogProgressColor(int i10, int i11) {
        this.mDialogProgressHighLightColor = i10;
        this.mDialogProgressNormalColor = i11;
        return this;
    }

    public AbstractC7520a setDialogVolumeProgressBar(Drawable drawable) {
        this.mVolumeProgressDrawable = drawable;
        return this;
    }

    public AbstractC7520a setDismissControlTime(int i10) {
        this.mDismissControlTime = i10;
        return this;
    }

    public AbstractC7520a setEffectFilter(GSYVideoGLView.InterfaceC7528c interfaceC7528c) {
        this.mEffectFilter = interfaceC7528c;
        return this;
    }

    public AbstractC7520a setEnlargeImageRes(int i10) {
        this.mEnlargeImageRes = i10;
        return this;
    }

    public AbstractC7520a setFullHideActionBar(boolean z10) {
        this.mActionBar = z10;
        return this;
    }

    public AbstractC7520a setFullHideStatusBar(boolean z10) {
        this.mStatusBar = z10;
        return this;
    }

    public AbstractC7520a setHideKey(boolean z10) {
        this.mHideKey = z10;
        return this;
    }

    public AbstractC7520a setIsTouchWiget(boolean z10) {
        this.mIsTouchWiget = z10;
        return this;
    }

    public AbstractC7520a setIsTouchWigetFull(boolean z10) {
        this.mIsTouchWigetFull = z10;
        return this;
    }

    public AbstractC7520a setLockLand(boolean z10) {
        this.mLockLand = z10;
        return this;
    }

    public AbstractC7520a setLooping(boolean z10) {
        this.mLooping = z10;
        return this;
    }

    public AbstractC7520a setMapHeadData(Map<String, String> map) {
        this.mMapHeadData = map;
        return this;
    }

    public AbstractC7520a setNeedLockFull(boolean z10) {
        this.mNeedLockFull = z10;
        return this;
    }

    public AbstractC7520a setNeedOrientationUtils(boolean z10) {
        this.mNeedOrientationUtils = z10;
        return this;
    }

    public AbstractC7520a setNeedShowWifiTip(boolean z10) {
        this.mNeedShowWifiTip = z10;
        return this;
    }

    public AbstractC7520a setOnlyRotateLand(boolean z10) {
        this.mIsOnlyRotateLand = z10;
        return this;
    }

    public AbstractC7520a setOverrideExtension(String str) {
        this.mOverrideExtension = str;
        return this;
    }

    public AbstractC7520a setPlayPosition(int i10) {
        this.mPlayPosition = i10;
        return this;
    }

    public AbstractC7520a setPlayTag(String str) {
        this.mPlayTag = str;
        return this;
    }

    public AbstractC7520a setReleaseWhenLossAudio(boolean z10) {
        this.mReleaseWhenLossAudio = z10;
        return this;
    }

    public AbstractC7520a setRotateViewAuto(boolean z10) {
        this.mRotateViewAuto = z10;
        return this;
    }

    public AbstractC7520a setRotateWithSystem(boolean z10) {
        this.mRotateWithSystem = z10;
        return this;
    }

    public AbstractC7520a setSeekOnStart(long j10) {
        this.mSeekOnStart = j10;
        return this;
    }

    public AbstractC7520a setSeekRatio(float f10) {
        if (f10 < 0.0f) {
            return this;
        }
        this.mSeekRatio = f10;
        return this;
    }

    @Deprecated
    public AbstractC7520a setSetUpLazy(boolean z10) {
        this.mSetUpLazy = z10;
        return this;
    }

    public AbstractC7520a setShowDragProgressTextOnSeekBar(boolean z10) {
        this.isShowDragProgressTextOnSeekBar = z10;
        return this;
    }

    public AbstractC7520a setShowFullAnimation(boolean z10) {
        this.mShowFullAnimation = z10;
        return this;
    }

    public AbstractC7520a setShowPauseCover(boolean z10) {
        this.mShowPauseCover = z10;
        return this;
    }

    public AbstractC7520a setShrinkImageRes(int i10) {
        this.mShrinkImageRes = i10;
        return this;
    }

    public AbstractC7520a setSoundTouch(boolean z10) {
        this.mSounchTouch = z10;
        return this;
    }

    public AbstractC7520a setSpeed(float f10) {
        this.mSpeed = f10;
        return this;
    }

    public AbstractC7520a setStartAfterPrepared(boolean z10) {
        this.mStartAfterPrepared = z10;
        return this;
    }

    public AbstractC7520a setSurfaceErrorPlay(boolean z10) {
        this.mSurfaceErrorPlay = z10;
        return this;
    }

    public AbstractC7520a setThumbImageView(View view) {
        this.mThumbImageView = view;
        return this;
    }

    public AbstractC7520a setThumbPlay(boolean z10) {
        this.mThumbPlay = z10;
        return this;
    }

    public AbstractC7520a setUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public AbstractC7520a setVideoAllCallBack(InterfaceC10158h interfaceC10158h) {
        this.mVideoAllCallBack = interfaceC10158h;
        return this;
    }

    public AbstractC7520a setVideoTitle(String str) {
        this.mVideoTitle = str;
        return this;
    }

    public void build(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        gSYBaseVideoPlayer.setPlayTag(this.mPlayTag);
        gSYBaseVideoPlayer.setPlayPosition(this.mPlayPosition);
        gSYBaseVideoPlayer.setThumbPlay(this.mThumbPlay);
        View view = this.mThumbImageView;
        if (view != null) {
            gSYBaseVideoPlayer.setThumbImageView(view);
        }
        gSYBaseVideoPlayer.setNeedLockFull(this.mNeedLockFull);
        gSYBaseVideoPlayer.setDismissControlTime(this.mDismissControlTime);
        long j10 = this.mSeekOnStart;
        if (j10 > 0) {
            gSYBaseVideoPlayer.setSeekOnStart(j10);
        }
        gSYBaseVideoPlayer.setShowFullAnimation(this.mShowFullAnimation);
        gSYBaseVideoPlayer.setNeedOrientationUtils(this.mNeedOrientationUtils);
        gSYBaseVideoPlayer.setLooping(this.mLooping);
        gSYBaseVideoPlayer.setSurfaceErrorPlay(this.mSurfaceErrorPlay);
        InterfaceC10158h interfaceC10158h = this.mVideoAllCallBack;
        if (interfaceC10158h != null) {
            gSYBaseVideoPlayer.setVideoAllCallBack(interfaceC10158h);
        }
        gSYBaseVideoPlayer.setOverrideExtension(this.mOverrideExtension);
        gSYBaseVideoPlayer.setAutoFullWithSize(this.mAutoFullWithSize);
        gSYBaseVideoPlayer.setRotateViewAuto(this.mRotateViewAuto);
        gSYBaseVideoPlayer.setOnlyRotateLand(this.mIsOnlyRotateLand);
        gSYBaseVideoPlayer.setLockLand(this.mLockLand);
        gSYBaseVideoPlayer.setSpeed(this.mSpeed, this.mSounchTouch);
        gSYBaseVideoPlayer.setHideKey(this.mHideKey);
        gSYBaseVideoPlayer.setIsTouchWiget(this.mIsTouchWiget);
        gSYBaseVideoPlayer.setIsTouchWigetFull(this.mIsTouchWigetFull);
        gSYBaseVideoPlayer.setNeedShowWifiTip(this.mNeedShowWifiTip);
        gSYBaseVideoPlayer.setEffectFilter(this.mEffectFilter);
        gSYBaseVideoPlayer.setStartAfterPrepared(this.mStartAfterPrepared);
        gSYBaseVideoPlayer.setReleaseWhenLossAudio(this.mReleaseWhenLossAudio);
        gSYBaseVideoPlayer.setFullHideActionBar(this.mActionBar);
        gSYBaseVideoPlayer.setShowDragProgressTextOnSeekBar(this.isShowDragProgressTextOnSeekBar);
        gSYBaseVideoPlayer.setFullHideStatusBar(this.mStatusBar);
        int i10 = this.mEnlargeImageRes;
        if (i10 > 0) {
            gSYBaseVideoPlayer.setEnlargeImageRes(i10);
        }
        int i11 = this.mShrinkImageRes;
        if (i11 > 0) {
            gSYBaseVideoPlayer.setShrinkImageRes(i11);
        }
        gSYBaseVideoPlayer.setShowPauseCover(this.mShowPauseCover);
        gSYBaseVideoPlayer.setSeekRatio(this.mSeekRatio);
        gSYBaseVideoPlayer.setRotateWithSystem(this.mRotateWithSystem);
        if (this.mSetUpLazy) {
            gSYBaseVideoPlayer.setUpLazy(this.mUrl, this.mCacheWithPlay, this.mCachePath, this.mMapHeadData, this.mVideoTitle);
        } else {
            gSYBaseVideoPlayer.setUp(this.mUrl, this.mCacheWithPlay, this.mCachePath, this.mMapHeadData, this.mVideoTitle);
        }
    }

    public AbstractC7520a setGSYStateUiListener(InterfaceC10152b interfaceC10152b) {
        return this;
    }

    public AbstractC7520a setGSYVideoProgressListener(InterfaceC10154d interfaceC10154d) {
        return this;
    }

    public AbstractC7520a setLockClickListener(InterfaceC10157g interfaceC10157g) {
        return this;
    }
}
