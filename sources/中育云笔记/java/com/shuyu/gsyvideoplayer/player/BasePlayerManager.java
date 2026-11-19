package com.shuyu.gsyvideoplayer.player;

import p249m7.C10207a;

/* loaded from: classes5.dex */
public abstract class BasePlayerManager implements IPlayerManager {
    protected IPlayerInitSuccessListener mPlayerInitSuccessListener;

    public IPlayerInitSuccessListener getPlayerPreparedSuccessListener() {
        return this.mPlayerInitSuccessListener;
    }

    public void initSuccess(C10207a c10207a) {
        IPlayerInitSuccessListener iPlayerInitSuccessListener = this.mPlayerInitSuccessListener;
        if (iPlayerInitSuccessListener != null) {
            iPlayerInitSuccessListener.onPlayerInitSuccess(getMediaPlayer(), c10207a);
        }
    }

    public void setPlayerInitSuccessListener(IPlayerInitSuccessListener iPlayerInitSuccessListener) {
        this.mPlayerInitSuccessListener = iPlayerInitSuccessListener;
    }
}
