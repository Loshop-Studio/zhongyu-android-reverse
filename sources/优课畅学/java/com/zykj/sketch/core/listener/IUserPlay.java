package com.zykj.sketch.core.listener;

import com.zykj.sketch.core.data.PlayStatus;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public interface IUserPlay {
    void addPlayActionListener(PlayActionListener playActionListener);

    void destroy();

    PlayStatus getPlayStatus();

    void loadData(String str, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void pause();

    void removePlayActionListener(PlayActionListener playActionListener);

    void seekTo(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void start();

    void waiting();
}
