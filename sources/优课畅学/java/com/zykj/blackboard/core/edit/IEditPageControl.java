package com.zykj.blackboard.core.edit;

import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public interface IEditPageControl extends IPageControl {
    long duration();

    String getFileName();

    void hide();

    void onDelete();

    void refresh();

    void release();

    void show(InterfaceC10559a interfaceC10559a);
}
