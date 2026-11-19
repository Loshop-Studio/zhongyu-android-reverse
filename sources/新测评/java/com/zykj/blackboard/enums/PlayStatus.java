package com.zykj.blackboard.enums;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/blackboard/enums/PlayStatus;", "", "", "state", "", "stateName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "I", "getState", "()I", "setState", "(I)V", "b", "Ljava/lang/String;", "getStateName", "()Ljava/lang/String;", "setStateName", "(Ljava/lang/String;)V", "c", "d", "e", "f", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public enum PlayStatus {
    RECORD_START(0, "录制开始"),
    RECORD_PAUSE(1, "录制暂停"),
    RECORD_RESUME(2, "录制继续"),
    RECORD_END(3, "录制结束");


    /* renamed from: a, reason: from kotlin metadata */
    public int state;

    /* renamed from: b, reason: from kotlin metadata */
    public String stateName;

    PlayStatus(int i10, String str) {
        this.state = i10;
        this.stateName = str;
    }
}
