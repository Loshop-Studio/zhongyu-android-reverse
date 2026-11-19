package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.util.AttributeSet;
import p220k7.C9827c;

/* loaded from: classes5.dex */
public abstract class GSYVideoPlayer extends GSYBaseVideoPlayer {
    public GSYVideoPlayer(Context context, Boolean bool) {
        super(context, bool);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean backFromFull(Context context) {
        return C9827c.m19925p(context);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public int getFullId() {
        return C9827c.f23107u;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public GSYVideoViewBridge getGSYVideoManager() {
        C9827c.m19926q().m19918i(getContext().getApplicationContext());
        return C9827c.m19926q();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public int getSmallId() {
        return C9827c.f23106t;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void releaseVideos() {
        C9827c.m19927r();
    }

    public GSYVideoPlayer(Context context) {
        super(context);
    }

    public GSYVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GSYVideoPlayer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
