package com.zykj.sketch.core.data;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public enum PlayStatus {
    RECORD_START(0, "录制开始"),
    RECORD_PAUSE(1, "录制暂停"),
    RECORD_RESUME(2, "录制继续"),
    RECORD_END(3, "录制结束"),
    RECORD_WAIT(4, "等待");

    private int state;
    private String stateName;

    PlayStatus(int i10, String str) {
        this.state = i10;
        this.stateName = str;
    }

    public final int getState() {
        return this.state;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public final void setState(int i10) {
        this.state = i10;
    }

    public final void setStateName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.stateName = str;
    }
}
