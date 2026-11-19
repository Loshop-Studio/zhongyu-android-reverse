package com.zykj.sketch.core.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/sketch/core/data/PlayStatus;", "", "state", "", "stateName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getState", "()I", "setState", "(I)V", "getStateName", "()Ljava/lang/String;", "setStateName", "(Ljava/lang/String;)V", "RECORD_START", "RECORD_PAUSE", "RECORD_RESUME", "RECORD_END", "RECORD_WAIT", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public enum PlayStatus {
    RECORD_START(0, "录制开始"),
    RECORD_PAUSE(1, "录制暂停"),
    RECORD_RESUME(2, "录制继续"),
    RECORD_END(3, "录制结束"),
    RECORD_WAIT(4, "等待");

    private int state;

    @NotNull
    private String stateName;

    PlayStatus(int i, String str) {
        this.state = i;
        this.stateName = str;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getStateName() {
        return this.stateName;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setStateName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.stateName = str;
    }
}
