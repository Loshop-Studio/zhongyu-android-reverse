package com.zykj.merge.sketch.listener;

import com.zykj.merge.sketch.constant.PlayStatus;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public interface Play {
    void addPlayActionListener(PlayStatusListener playStatusListener);

    void destroy();

    String getPath();

    void isRend(boolean z10);

    void loadData(String str, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void pause();

    void release();

    void removePlayActionListener(PlayStatusListener playStatusListener);

    void reset();

    void resume();

    void seekTo(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    boolean setRate(double d10);

    void start();

    PlayStatus status();

    void waiting();
}
