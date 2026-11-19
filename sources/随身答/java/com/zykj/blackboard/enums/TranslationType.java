package com.zykj.blackboard.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m13413d2 = {"Lcom/zykj/blackboard/enums/TranslationType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "c", "()I", "setValue", "(I)V", "b", "d", "e", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public enum TranslationType {
    ROTATE(0),
    DELETE(1),
    TRANSLATE(2),
    SCALE(3);


    /* renamed from: a, reason: from kotlin metadata */
    public int value;

    TranslationType(int i9) {
        this.value = i9;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
