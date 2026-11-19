package com.zykj.blackboard.bean;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/blackboard/bean/PlaySpeed;", "", "<init>", "()V", "", "rate", "Ld6/s;", "setRate", "(F)V", "", "<set-?>", "playIncrement", "I", "getPlayIncrement", "()I", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlaySpeed {
    public static final int INITIAL_PLAY_INCREMENT = 16;
    private int playIncrement = 16;

    public final int getPlayIncrement() {
        return this.playIncrement;
    }

    public final synchronized void setRate(float rate) {
        this.playIncrement = (int) (16 * rate);
    }
}
