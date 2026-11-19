package com.shuyu.gsyvideoplayer.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import moe.codeest.enviews.ENDownloadView;
import p249m7.AbstractC10208b;

/* loaded from: classes5.dex */
public class ListGSYVideoPlayer extends StandardGSYVideoPlayer {
    protected int mPlayPosition;
    protected List<AbstractC10208b> mUriList;

    public ListGSYVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
        this.mUriList = new ArrayList();
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    public void changeUiToNormal() {
        super.changeUiToNormal();
        if (!this.mHadPlay || this.mPlayPosition >= this.mUriList.size()) {
            return;
        }
        setViewShowState(this.mThumbImageViewLayout, 8);
        setViewShowState(this.mTopContainer, 4);
        setViewShowState(this.mBottomContainer, 4);
        setViewShowState(this.mStartButton, 8);
        setViewShowState(this.mLoadingProgressBar, 0);
        setViewShowState(this.mBottomProgressBar, 4);
        setViewShowState(this.mLockScreen, 8);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21390k();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        super.cloneParams(gSYBaseVideoPlayer, gSYBaseVideoPlayer2);
        ListGSYVideoPlayer listGSYVideoPlayer = (ListGSYVideoPlayer) gSYBaseVideoPlayer;
        ListGSYVideoPlayer listGSYVideoPlayer2 = (ListGSYVideoPlayer) gSYBaseVideoPlayer2;
        listGSYVideoPlayer2.mPlayPosition = listGSYVideoPlayer.mPlayPosition;
        listGSYVideoPlayer2.mUriList = listGSYVideoPlayer.mUriList;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onAutoCompletion() {
        if (playNext()) {
            return;
        }
        super.onAutoCompletion();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onCompletion() {
        releaseNetWorkState();
        if (this.mPlayPosition < this.mUriList.size()) {
            this.mAudioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
        } else {
            super.onCompletion();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, p236l7.InterfaceC10151a
    public void onPrepared() {
        super.onPrepared();
    }

    public boolean playNext() {
        TextView textView;
        if (this.mPlayPosition >= this.mUriList.size() - 1) {
            return false;
        }
        int i10 = this.mPlayPosition + 1;
        this.mPlayPosition = i10;
        AbstractC10208b abstractC10208b = this.mUriList.get(i10);
        this.mSaveChangeViewTIme = 0L;
        setUp(this.mUriList, this.mCache, this.mPlayPosition, null, this.mMapHeadData, false);
        if (!TextUtils.isEmpty(abstractC10208b.getTitle()) && (textView = this.mTitleTextView) != null) {
            textView.setText(abstractC10208b.getTitle());
        }
        startPlayLogic();
        return true;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void prepareVideo() {
        super.prepareVideo();
        if (!this.mHadPlay || this.mPlayPosition >= this.mUriList.size()) {
            return;
        }
        setViewShowState(this.mLoadingProgressBar, 0);
        View view = this.mLoadingProgressBar;
        if (view instanceof ENDownloadView) {
            ((ENDownloadView) view).m21390k();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        super.onCompletion();
        super.releaseVideos();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public void resolveNormalVideoShow(View view, ViewGroup viewGroup, GSYVideoPlayer gSYVideoPlayer) {
        TextView textView;
        if (gSYVideoPlayer != null) {
            AbstractC10208b abstractC10208b = this.mUriList.get(this.mPlayPosition);
            if (!TextUtils.isEmpty(abstractC10208b.getTitle()) && (textView = this.mTitleTextView) != null) {
                textView.setText(abstractC10208b.getTitle());
            }
        }
        super.resolveNormalVideoShow(view, viewGroup, gSYVideoPlayer);
    }

    public boolean setUp(List<AbstractC10208b> list, boolean z10, int i10) {
        return setUp(list, z10, i10, (File) null, new HashMap());
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean z10, boolean z11) throws NoSuchMethodException, SecurityException {
        GSYBaseVideoPlayer gSYBaseVideoPlayerStartWindowFullscreen = super.startWindowFullscreen(context, z10, z11);
        if (gSYBaseVideoPlayerStartWindowFullscreen != null) {
            ListGSYVideoPlayer listGSYVideoPlayer = (ListGSYVideoPlayer) gSYBaseVideoPlayerStartWindowFullscreen;
            AbstractC10208b abstractC10208b = this.mUriList.get(this.mPlayPosition);
            if (!TextUtils.isEmpty(abstractC10208b.getTitle()) && this.mTitleTextView != null) {
                listGSYVideoPlayer.mTitleTextView.setText(abstractC10208b.getTitle());
            }
        }
        return gSYBaseVideoPlayerStartWindowFullscreen;
    }

    public boolean setUp(List<AbstractC10208b> list, boolean z10, int i10, File file) {
        return setUp(list, z10, i10, file, new HashMap());
    }

    public ListGSYVideoPlayer(Context context) {
        super(context);
        this.mUriList = new ArrayList();
    }

    public boolean setUp(List<AbstractC10208b> list, boolean z10, int i10, File file, Map<String, String> map) {
        return setUp(list, z10, i10, file, map, true);
    }

    public boolean setUp(List<AbstractC10208b> list, boolean z10, int i10, File file, Map<String, String> map, boolean z11) {
        TextView textView;
        this.mUriList = list;
        this.mPlayPosition = i10;
        this.mMapHeadData = map;
        AbstractC10208b abstractC10208b = list.get(i10);
        boolean up = setUp(abstractC10208b.getUrl(), z10, file, abstractC10208b.getTitle(), z11);
        if (!TextUtils.isEmpty(abstractC10208b.getTitle()) && (textView = this.mTitleTextView) != null) {
            textView.setText(abstractC10208b.getTitle());
        }
        return up;
    }

    public ListGSYVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUriList = new ArrayList();
    }
}
