package org.android.spdy;

/* loaded from: classes.dex */
public enum RequestPriority {
    HIGHEST(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    LOWEST(4),
    IDLE(5),
    DEFAULT_PRIORITY(1);

    private int priority;

    RequestPriority(int i4) {
        this.priority = i4;
    }

    int getPriorityInt() {
        return this.priority;
    }
}
