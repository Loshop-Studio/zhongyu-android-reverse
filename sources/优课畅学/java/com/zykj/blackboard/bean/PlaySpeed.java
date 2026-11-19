package com.zykj.blackboard.bean;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes4.dex */
public final class PlaySpeed {
    public static final Companion Companion = new Companion(null);
    public static final int INITIAL_PLAY_INCREMENT = 16;
    private int playIncrement = 16;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public final int getPlayIncrement() {
        return this.playIncrement;
    }

    public final synchronized void setRate(float f10) {
        this.playIncrement = (int) (16 * f10);
    }
}
