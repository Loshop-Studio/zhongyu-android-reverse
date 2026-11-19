package com.zykj.sketch.core.listener;

import com.zykj.sketch.core.data.PlayStatus;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public interface IUserPlay {
    void addPlayActionListener(PlayActionListener playActionListener);

    void destroy();

    PlayStatus getPlayStatus();

    void loadData(String str, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void pause();

    void removePlayActionListener(PlayActionListener playActionListener);

    void seekTo(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void start();

    void waiting();
}
