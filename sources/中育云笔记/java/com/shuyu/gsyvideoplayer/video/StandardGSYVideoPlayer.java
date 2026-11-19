package com.shuyu.gsyvideoplayer.video;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.R$drawable;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.R$layout;
import com.shuyu.gsyvideoplayer.R$string;
import com.shuyu.gsyvideoplayer.R$style;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.NetworkUtils;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import moe.codeest.enviews.ENDownloadView;
import moe.codeest.enviews.ENPlayView;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;

/* loaded from: classes5.dex */
public class StandardGSYVideoPlayer extends GSYVideoPlayer {
    protected Drawable mBottomProgressDrawable;
    protected Drawable mBottomShowProgressDrawable;
    protected Drawable mBottomShowProgressThumbDrawable;
    protected Dialog mBrightnessDialog;
    protected TextView mBrightnessDialogTv;
    protected ImageView mDialogIcon;
    protected ProgressBar mDialogProgressBar;
    protected Drawable mDialogProgressBarDrawable;
    protected int mDialogProgressHighLightColor;
    protected int mDialogProgressNormalColor;
    protected TextView mDialogSeekTime;
    protected TextView mDialogTotalTime;
    protected ProgressBar mDialogVolumeProgressBar;
    protected Dialog mProgressDialog;
    protected Dialog mVolumeDialog;
    protected Drawable mVolumeProgressDrawable;

    public StandardGSYVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
        this.mDialogProgressHighLightColor = -11;
        this.mDialogProgressNormalColor = -11;
    }

    private void initFullUI(StandardGSYVideoPlayer standardGSYVideoPlayer) {
        int i10;
        Drawable drawable;
        Drawable drawable2 = this.mBottomProgressDrawable;
        if (drawable2 != null) {
            standardGSYVideoPlayer.setBottomProgressBarDrawable(drawable2);
        }
        Drawable drawable3 = this.mBottomShowProgressDrawable;
        if (drawable3 != null && (drawable = this.mBottomShowProgressThumbDrawable) != null) {
            standardGSYVideoPlayer.setBottomShowProgressBarDrawable(drawable3, drawable);
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
        if (i11 == -11 || (i10 = this.mDialogProgressNormalColor) == -11) {
            return;
        }
        standardGSYVideoPlayer.setDialogProgressColor(i11, i10);
    }

    public void changeUiToClear() {
        Debuger.printfLog("changeUiToClear");
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
    }

    public void changeUiToCompleteClear() {
        Debuger.printfLog("changeUiToCompleteClear");
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 0);
        setViewShowState(this.mBottomProgressBar, 0);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
        updateStartImage();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToCompleteShow() {
        Debuger.printfLog("changeUiToCompleteShow");
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 0);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 0);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
        updateStartImage();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToError() {
        Debuger.printfLog("changeUiToError");
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
        updateStartImage();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToNormal() {
        Debuger.printfLog("changeUiToNormal");
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 0);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        updateStartImage();
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
    }

    public void changeUiToPauseClear() {
        Debuger.printfLog("changeUiToPauseClear");
        changeUiToClear();
        setViewShowState(this.mBottomProgressBar, 0);
        updatePauseCover();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPauseShow() {
        Debuger.printfLog("changeUiToPauseShow");
        if (this.mLockCurScreen && this.mNeedLockFull) {
            setViewShowState(this.mLockScreen, 0);
            return;
        }
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 0);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
        updateStartImage();
        updatePauseCover();
    }

    public void changeUiToPlayingBufferingClear() {
        Debuger.printfLog("changeUiToPlayingBufferingClear");
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mLoadingProgressBar, 0);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 0);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if ((view instanceof ENDownloadView) && ((ENDownloadView) view).getCurrentState() == 0) {
            ((ENDownloadView) this.mLoadingProgressBar).m21390k();
        }
        updateStartImage();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPlayingBufferingShow() {
        Debuger.printfLog("changeUiToPlayingBufferingShow");
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 0);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mLoadingProgressBar, 0);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if ((view instanceof ENDownloadView) && ((ENDownloadView) view).getCurrentState() == 0) {
            ((ENDownloadView) this.mLoadingProgressBar).m21390k();
        }
    }

    public void changeUiToPlayingClear() {
        Debuger.printfLog("changeUiToPlayingClear");
        changeUiToClear();
        setViewShowState(this.mBottomProgressBar, 0);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPlayingShow() {
        Debuger.printfLog("changeUiToPlayingShow");
        if (this.mLockCurScreen && this.mNeedLockFull) {
            setViewShowState(this.mLockScreen, 0);
            return;
        }
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 0);
        setViewShowState(this.mStartButton, 0);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, (this.mIfCurrentIsFullscreen && this.mNeedLockFull) ? 0 : 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
        updateStartImage();
    }

    public void changeUiToPrepareingClear() {
        Debuger.printfLog("changeUiToPrepareingClear");
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mLoadingProgressBar, 4);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21389j();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToPreparingShow() {
        Debuger.printfLog("changeUiToPreparingShow");
        setViewShowState(this.mTopContainer, 0);
        setViewShowState(this.mBottomContainer, 0);
        setViewShowState(this.mStartButton, 4);
        setViewShowState(this.mLoadingProgressBar, 0);
        setViewShowState(this.mThumbImageViewLayout, 4);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if ((view instanceof ENDownloadView) && ((ENDownloadView) view).getCurrentState() == 0) {
            ((ENDownloadView) this.mLoadingProgressBar).m21390k();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        TextView textView;
        TextView textView2;
        SeekBar seekBar;
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        StandardGSYVideoPlayer standardGSYVideoPlayer = (StandardGSYVideoPlayer) gSYBaseVideoPlayer;
        StandardGSYVideoPlayer standardGSYVideoPlayer2 = (StandardGSYVideoPlayer) gSYBaseVideoPlayer2;
        SeekBar seekBar2 = standardGSYVideoPlayer2.mProgressBar;
        if (seekBar2 != null && (seekBar = standardGSYVideoPlayer.mProgressBar) != null) {
            seekBar2.setProgress(seekBar.getProgress());
            standardGSYVideoPlayer2.mProgressBar.setSecondaryProgress(standardGSYVideoPlayer.mProgressBar.getSecondaryProgress());
        }
        TextView textView3 = standardGSYVideoPlayer2.mTotalTimeTextView;
        if (textView3 != null && (textView2 = standardGSYVideoPlayer.mTotalTimeTextView) != null) {
            textView3.setText(textView2.getText());
        }
        TextView textView4 = standardGSYVideoPlayer2.mCurrentTimeTextView;
        if (textView4 == null || (textView = standardGSYVideoPlayer.mCurrentTimeTextView) == null) {
            return;
        }
        textView4.setText(textView.getText());
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void dismissBrightnessDialog() {
        Dialog dialog = this.mBrightnessDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mBrightnessDialog = null;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void dismissProgressDialog() {
        Dialog dialog = this.mProgressDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mProgressDialog = null;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void dismissVolumeDialog() {
        Dialog dialog = this.mVolumeDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mVolumeDialog = null;
        }
    }

    public int getBrightnessLayoutId() {
        return R$layout.video_brightness;
    }

    public int getBrightnessTextId() {
        return R$id.app_video_brightness;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
        return R$layout.video_layout_standard;
    }

    public int getProgressDialogAllDurationTextId() {
        return R$id.tv_duration;
    }

    public int getProgressDialogCurrentDurationTextId() {
        return R$id.tv_current;
    }

    public int getProgressDialogImageId() {
        return R$id.duration_image_tip;
    }

    public int getProgressDialogLayoutId() {
        return R$layout.video_progress_dialog;
    }

    public int getProgressDialogProgressId() {
        return R$id.duration_progressbar;
    }

    public int getVolumeLayoutId() {
        return R$layout.video_volume_dialog;
    }

    public int getVolumeProgressId() {
        return R$id.volume_progressbar;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void hideAllWidget() {
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomProgressBar, 0);
        setViewShowState(this.mStartButton, 4);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void init(Context context) {
        super.init(context);
        Drawable drawable = this.mBottomProgressDrawable;
        if (drawable != null) {
            this.mBottomProgressBar.setProgressDrawable(drawable);
        }
        if (this.mBottomShowProgressDrawable != null) {
            this.mProgressBar.setProgressDrawable(this.mBottomProgressDrawable);
        }
        Drawable drawable2 = this.mBottomShowProgressThumbDrawable;
        if (drawable2 != null) {
            this.mProgressBar.setThumb(drawable2);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void onClickUiToggle(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        boolean z10 = this.mIfCurrentIsFullscreen;
        if (z10 && this.mLockCurScreen && this.mNeedLockFull) {
            setViewShowState(this.mLockScreen, 0);
            return;
        }
        if (z10 && !this.mSurfaceErrorPlay && this.mCurrentState == 7) {
            ViewGroup viewGroup2 = this.mBottomContainer;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 0) {
                    changeUiToPlayingClear();
                    return;
                } else {
                    changeUiToPlayingShow();
                    return;
                }
            }
            return;
        }
        int i10 = this.mCurrentState;
        if (i10 == 1) {
            ViewGroup viewGroup3 = this.mBottomContainer;
            if (viewGroup3 != null) {
                if (viewGroup3.getVisibility() == 0) {
                    changeUiToPrepareingClear();
                    return;
                } else {
                    changeUiToPreparingShow();
                    return;
                }
            }
            return;
        }
        if (i10 == 2) {
            ViewGroup viewGroup4 = this.mBottomContainer;
            if (viewGroup4 != null) {
                if (viewGroup4.getVisibility() == 0) {
                    changeUiToPlayingClear();
                    return;
                } else {
                    changeUiToPlayingShow();
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            ViewGroup viewGroup5 = this.mBottomContainer;
            if (viewGroup5 != null) {
                if (viewGroup5.getVisibility() == 0) {
                    changeUiToPauseClear();
                    return;
                } else {
                    changeUiToPauseShow();
                    return;
                }
            }
            return;
        }
        if (i10 == 6) {
            ViewGroup viewGroup6 = this.mBottomContainer;
            if (viewGroup6 != null) {
                if (viewGroup6.getVisibility() == 0) {
                    changeUiToCompleteClear();
                    return;
                } else {
                    changeUiToCompleteShow();
                    return;
                }
            }
            return;
        }
        if (i10 != 3 || (viewGroup = this.mBottomContainer) == null) {
            return;
        }
        if (viewGroup.getVisibility() == 0) {
            changeUiToPlayingBufferingClear();
        } else {
            changeUiToPlayingBufferingShow();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissVolumeDialog();
        dismissBrightnessDialog();
    }

    public void restartTimerTask() {
        startProgressTimer();
        startDismissControlViewTimer();
    }

    public void saveFrame(File file, InterfaceC10156f interfaceC10156f) {
        saveFrame(file, false, interfaceC10156f);
    }

    public void setBottomProgressBarDrawable(Drawable drawable) {
        this.mBottomProgressDrawable = drawable;
        ProgressBar progressBar = this.mBottomProgressBar;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        }
    }

    public void setBottomShowProgressBarDrawable(Drawable drawable, Drawable drawable2) {
        this.mBottomShowProgressDrawable = drawable;
        this.mBottomShowProgressThumbDrawable = drawable2;
        SeekBar seekBar = this.mProgressBar;
        if (seekBar != null) {
            seekBar.setProgressDrawable(drawable);
            this.mProgressBar.setThumb(drawable2);
        }
    }

    public void setDialogProgressBar(Drawable drawable) {
        this.mDialogProgressBarDrawable = drawable;
    }

    public void setDialogProgressColor(int i10, int i11) {
        this.mDialogProgressHighLightColor = i10;
        this.mDialogProgressNormalColor = i11;
    }

    public void setDialogVolumeProgressBar(Drawable drawable) {
        this.mVolumeProgressDrawable = drawable;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void showBrightnessDialog(float f10) {
        if (this.mBrightnessDialog == null) {
            View viewInflate = LayoutInflater.from(getActivityContext()).inflate(getBrightnessLayoutId(), (ViewGroup) null);
            if (viewInflate.findViewById(getBrightnessTextId()) instanceof TextView) {
                this.mBrightnessDialogTv = (TextView) viewInflate.findViewById(getBrightnessTextId());
            }
            Dialog dialog = new Dialog(getActivityContext(), R$style.video_style_dialog_progress);
            this.mBrightnessDialog = dialog;
            dialog.setContentView(viewInflate);
            this.mBrightnessDialog.getWindow().addFlags(8);
            this.mBrightnessDialog.getWindow().addFlags(32);
            this.mBrightnessDialog.getWindow().addFlags(16);
            this.mBrightnessDialog.getWindow().getDecorView().setSystemUiVisibility(2);
            this.mBrightnessDialog.getWindow().setLayout(-2, -2);
            WindowManager.LayoutParams attributes = this.mBrightnessDialog.getWindow().getAttributes();
            attributes.gravity = 8388661;
            attributes.width = getWidth();
            attributes.height = getHeight();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            attributes.x = iArr[0];
            attributes.y = iArr[1];
            this.mBrightnessDialog.getWindow().setAttributes(attributes);
        }
        if (!this.mBrightnessDialog.isShowing()) {
            this.mBrightnessDialog.show();
        }
        TextView textView = this.mBrightnessDialogTv;
        if (textView != null) {
            textView.setText(((int) (f10 * 100.0f)) + "%");
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void showProgressDialog(float f10, String str, long j10, String str2, long j11) {
        ProgressBar progressBar;
        TextView textView;
        TextView textView2;
        if (this.mProgressDialog == null) {
            View viewInflate = LayoutInflater.from(getActivityContext()).inflate(getProgressDialogLayoutId(), (ViewGroup) null);
            if (viewInflate.findViewById(getProgressDialogProgressId()) instanceof ProgressBar) {
                ProgressBar progressBar2 = (ProgressBar) viewInflate.findViewById(getProgressDialogProgressId());
                this.mDialogProgressBar = progressBar2;
                Drawable drawable = this.mDialogProgressBarDrawable;
                if (drawable != null) {
                    progressBar2.setProgressDrawable(drawable);
                }
            }
            if (viewInflate.findViewById(getProgressDialogCurrentDurationTextId()) instanceof TextView) {
                this.mDialogSeekTime = (TextView) viewInflate.findViewById(getProgressDialogCurrentDurationTextId());
            }
            if (viewInflate.findViewById(getProgressDialogAllDurationTextId()) instanceof TextView) {
                this.mDialogTotalTime = (TextView) viewInflate.findViewById(getProgressDialogAllDurationTextId());
            }
            if (viewInflate.findViewById(getProgressDialogImageId()) instanceof ImageView) {
                this.mDialogIcon = (ImageView) viewInflate.findViewById(getProgressDialogImageId());
            }
            Dialog dialog = new Dialog(getActivityContext(), R$style.video_style_dialog_progress);
            this.mProgressDialog = dialog;
            dialog.setContentView(viewInflate);
            this.mProgressDialog.getWindow().addFlags(8);
            this.mProgressDialog.getWindow().addFlags(32);
            this.mProgressDialog.getWindow().addFlags(16);
            this.mProgressDialog.getWindow().setLayout(getWidth(), getHeight());
            int i10 = this.mDialogProgressNormalColor;
            if (i10 != -11 && (textView2 = this.mDialogTotalTime) != null) {
                textView2.setTextColor(i10);
            }
            int i11 = this.mDialogProgressHighLightColor;
            if (i11 != -11 && (textView = this.mDialogSeekTime) != null) {
                textView.setTextColor(i11);
            }
            WindowManager.LayoutParams attributes = this.mProgressDialog.getWindow().getAttributes();
            attributes.gravity = 48;
            attributes.width = getWidth();
            attributes.height = getHeight();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            attributes.x = iArr[0];
            attributes.y = iArr[1];
            this.mProgressDialog.getWindow().setAttributes(attributes);
        }
        if (!this.mProgressDialog.isShowing()) {
            this.mProgressDialog.show();
        }
        TextView textView3 = this.mDialogSeekTime;
        if (textView3 != null) {
            textView3.setText(str);
        }
        TextView textView4 = this.mDialogTotalTime;
        if (textView4 != null) {
            textView4.setText(" / " + str2);
        }
        if (j11 > 0 && (progressBar = this.mDialogProgressBar) != null) {
            progressBar.setProgress((int) ((j10 * 100) / j11));
        }
        if (f10 > 0.0f) {
            ImageView imageView = this.mDialogIcon;
            if (imageView != null) {
                imageView.setBackgroundResource(R$drawable.video_forward_icon);
                return;
            }
            return;
        }
        ImageView imageView2 = this.mDialogIcon;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(R$drawable.video_backward_icon);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void showVolumeDialog(float f10, int i10) {
        if (this.mVolumeDialog == null) {
            View viewInflate = LayoutInflater.from(getActivityContext()).inflate(getVolumeLayoutId(), (ViewGroup) null);
            if (viewInflate.findViewById(getVolumeProgressId()) instanceof ProgressBar) {
                ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(getVolumeProgressId());
                this.mDialogVolumeProgressBar = progressBar;
                Drawable drawable = this.mVolumeProgressDrawable;
                if (drawable != null && progressBar != null) {
                    progressBar.setProgressDrawable(drawable);
                }
            }
            Dialog dialog = new Dialog(getActivityContext(), R$style.video_style_dialog_progress);
            this.mVolumeDialog = dialog;
            dialog.setContentView(viewInflate);
            this.mVolumeDialog.getWindow().addFlags(8);
            this.mVolumeDialog.getWindow().addFlags(32);
            this.mVolumeDialog.getWindow().addFlags(16);
            this.mVolumeDialog.getWindow().setLayout(-2, -2);
            WindowManager.LayoutParams attributes = this.mVolumeDialog.getWindow().getAttributes();
            attributes.gravity = 8388659;
            attributes.width = getWidth();
            attributes.height = getHeight();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            attributes.x = iArr[0];
            attributes.y = iArr[1];
            this.mVolumeDialog.getWindow().setAttributes(attributes);
        }
        if (!this.mVolumeDialog.isShowing()) {
            this.mVolumeDialog.show();
        }
        ProgressBar progressBar2 = this.mDialogVolumeProgressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(i10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void showWifiDialog() {
        if (!NetworkUtils.isAvailable(this.mContext)) {
            startPlayLogic();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivityContext());
        builder.setMessage(getResources().getString(R$string.tips_not_wifi));
        builder.setPositiveButton(getResources().getString(R$string.tips_not_wifi_confirm), new DialogInterface.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                StandardGSYVideoPlayer.this.startPlayLogic();
            }
        });
        builder.setNegativeButton(getResources().getString(R$string.tips_not_wifi_cancel), new DialogInterface.OnClickListener() { // from class: com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void startPlayLogic() {
        if (this.mVideoAllCallBack != null) {
            Debuger.printfLog("onClickStartThumb");
            this.mVideoAllCallBack.mo5997t(this.mOriginUrl, this.mTitle, this);
        }
        prepareVideo();
        startDismissControlViewTimer();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean z10, boolean z11) throws NoSuchMethodException, SecurityException {
        GSYBaseVideoPlayer gSYBaseVideoPlayerStartWindowFullscreen = super.startWindowFullscreen(context, z10, z11);
        if (gSYBaseVideoPlayerStartWindowFullscreen != null) {
            StandardGSYVideoPlayer standardGSYVideoPlayer = (StandardGSYVideoPlayer) gSYBaseVideoPlayerStartWindowFullscreen;
            standardGSYVideoPlayer.setLockClickListener(null);
            standardGSYVideoPlayer.setNeedLockFull(isNeedLockFull());
            initFullUI(standardGSYVideoPlayer);
        }
        return gSYBaseVideoPlayerStartWindowFullscreen;
    }

    public void taskShotPic(InterfaceC10155e interfaceC10155e) {
        taskShotPic(interfaceC10155e, false);
    }

    public void updateStartImage() {
        View view = this.mStartButton;
        if (view instanceof ENPlayView) {
            ENPlayView eNPlayView = (ENPlayView) view;
            eNPlayView.setDuration(500);
            int i10 = this.mCurrentState;
            if (i10 == 2) {
                eNPlayView.m21395d();
                return;
            } else if (i10 == 7) {
                eNPlayView.m21394c();
                return;
            } else {
                eNPlayView.m21394c();
                return;
            }
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            int i11 = this.mCurrentState;
            if (i11 == 2) {
                imageView.setImageResource(R$drawable.video_click_pause_selector);
            } else if (i11 == 7) {
                imageView.setImageResource(R$drawable.video_click_error_selector);
            } else {
                imageView.setImageResource(R$drawable.video_click_play_selector);
            }
        }
    }

    public void saveFrame(File file, boolean z10, InterfaceC10156f interfaceC10156f) {
        if (getCurrentPlayer().getRenderProxy() != null) {
            getCurrentPlayer().getRenderProxy().m21844k(file, z10, interfaceC10156f);
        }
    }

    public void taskShotPic(InterfaceC10155e interfaceC10155e, boolean z10) {
        if (getCurrentPlayer().getRenderProxy() != null) {
            getCurrentPlayer().getRenderProxy().m21851r(interfaceC10155e, z10);
        }
    }

    public StandardGSYVideoPlayer(Context context) {
        super(context);
        this.mDialogProgressHighLightColor = -11;
        this.mDialogProgressNormalColor = -11;
    }

    public StandardGSYVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDialogProgressHighLightColor = -11;
        this.mDialogProgressNormalColor = -11;
    }
}
