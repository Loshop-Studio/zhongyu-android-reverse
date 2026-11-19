package com.shuyu.gsyvideoplayer.video;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.R$color;
import com.shuyu.gsyvideoplayer.R$drawable;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.R$layout;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;
import p220k7.C9825a;

/* loaded from: classes5.dex */
public class GSYADVideoPlayer extends StandardGSYVideoPlayer {
    protected boolean isFirstPrepared;
    protected TextView mADTime;
    protected View mJumpAd;

    public GSYADVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean backFromFull(Context context) {
        return C9825a.m19905p(context);
    }

    public void changeAdUIState() {
        View view = this.mJumpAd;
        if (view != null) {
            view.setVisibility(this.isFirstPrepared ? 0 : 8);
        }
        TextView textView = this.mADTime;
        if (textView != null) {
            textView.setVisibility(this.isFirstPrepared ? 0 : 8);
        }
        if (this.mBottomContainer != null) {
            this.mBottomContainer.setBackgroundColor(this.isFirstPrepared ? 0 : getContext().getResources().getColor(R$color.bottom_container_bg));
        }
        TextView textView2 = this.mCurrentTimeTextView;
        if (textView2 != null) {
            textView2.setVisibility(this.isFirstPrepared ? 4 : 0);
        }
        TextView textView3 = this.mTotalTimeTextView;
        if (textView3 != null) {
            textView3.setVisibility(this.isFirstPrepared ? 4 : 0);
        }
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setVisibility(this.isFirstPrepared ? 4 : 0);
            this.mProgressBar.setEnabled(!this.isFirstPrepared);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        GSYADVideoPlayer gSYADVideoPlayer = (GSYADVideoPlayer) gSYBaseVideoPlayer2;
        gSYADVideoPlayer.isFirstPrepared = ((GSYADVideoPlayer) gSYBaseVideoPlayer).isFirstPrepared;
        gSYADVideoPlayer.changeAdUIState();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public int getFullId() {
        return C9825a.f23070u;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public GSYVideoViewBridge getGSYVideoManager() {
        C9825a.m19906q().m19918i(getContext().getApplicationContext());
        return C9825a.m19906q();
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R$layout.video_layout_ad;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public int getSmallId() {
        return C9825a.f23069t;
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void hideAllWidget() {
        if (this.isFirstPrepared) {
            return;
        }
        super.hideAllWidget();
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        this.mJumpAd = findViewById(R$id.jump_ad);
        this.mADTime = (TextView) findViewById(R$id.ad_time);
        View view = this.mJumpAd;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.GSYADVideoPlayer.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (GSYADVideoPlayer.this.getGSYVideoManager().listener() != null) {
                        GSYADVideoPlayer.this.getGSYVideoManager().listener().onAutoCompletion();
                    }
                }
            });
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R$id.start) {
            super.onClick(view);
        } else if (this.mCurrentState == 7) {
            clickStartIcon();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onPrepared() {
        super.onPrepared();
        this.isFirstPrepared = true;
        changeAdUIState();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void release() {
        super.release();
        TextView textView = this.mADTime;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        C9825a.m19909t();
    }

    public void removeFullWindowViewOnly() {
        ViewGroup viewGroup = (ViewGroup) CommonUtil.scanForActivity(getContext()).findViewById(R.id.content);
        View viewFindViewById = viewGroup.findViewById(getFullId());
        if (viewFindViewById != null && viewFindViewById.getParent() != null) {
            viewGroup.removeView((ViewGroup) viewFindViewById.getParent());
        }
        this.mIfCurrentIsFullscreen = false;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void setProgressAndTime(long j10, long j11, long j12, long j13, boolean z10) {
        super.setProgressAndTime(j10, j11, j12, j13, z10);
        TextView textView = this.mADTime;
        if (textView == null || j12 <= 0) {
            return;
        }
        textView.setText("" + ((j13 / 1000) - (j12 / 1000)));
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchDoubleUp(MotionEvent motionEvent) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMove(float f10, float f11, float f12) {
        if (this.mChangePosition) {
            return;
        }
        super.touchSurfaceMove(f10, f11, f12);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceMoveFullLogic(float f10, float f11) {
        int i10 = this.mThreshold;
        if (f10 > i10 || f11 > i10) {
            int screenWidth = CommonUtil.getScreenWidth(getContext());
            if (f10 < this.mThreshold || Math.abs(screenWidth - this.mDownX) <= this.mSeekEndOffset) {
                super.touchSurfaceMoveFullLogic(f10, f11);
            } else {
                this.mChangePosition = true;
                this.mDownPosition = getCurrentPositionWhenPlaying();
            }
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void touchSurfaceUp() {
        if (this.mChangePosition) {
            return;
        }
        super.touchSurfaceUp();
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    public void updateStartImage() {
        View view = this.mStartButton;
        if (view == null || !(view instanceof ImageView)) {
            return;
        }
        ImageView imageView = (ImageView) view;
        int i10 = this.mCurrentState;
        if (i10 == 2) {
            imageView.setImageResource(R$drawable.empty_drawable);
        } else if (i10 == 7) {
            imageView.setImageResource(R$drawable.video_click_error_selector);
        } else {
            imageView.setImageResource(R$drawable.empty_drawable);
        }
    }

    public GSYADVideoPlayer(Context context) {
        super(context);
    }

    public GSYADVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
