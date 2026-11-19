package com.zykj.blackboard.core.play;

import com.zykj.blackboard.listener.PageListener;
import java.util.List;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public interface IPlayControl {
    IPlayPageControl getCurrentPlayPageControl();

    int getCurrentPlayPageIndex();

    List<IPlayPageControl> getPlayPageControlList();

    String getRootPath();

    void loadPath(String str, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void release();

    void setPageListener(PageListener pageListener);

    boolean switchCurrentPlayPage(int i10, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2);
}
