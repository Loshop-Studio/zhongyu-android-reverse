package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;", "", "itemId", "", "isCorrect", "", "<init>", "(IZ)V", "getItemId", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SetMistakeQstItemPracticeResultReq {
    public static final int $stable = 0;
    private final boolean isCorrect;
    private final int itemId;

    public SetMistakeQstItemPracticeResultReq(int i, boolean z8) {
        this.itemId = i;
        this.isCorrect = z8;
    }

    public static /* synthetic */ SetMistakeQstItemPracticeResultReq copy$default(SetMistakeQstItemPracticeResultReq setMistakeQstItemPracticeResultReq, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = setMistakeQstItemPracticeResultReq.itemId;
        }
        if ((i8 & 2) != 0) {
            z8 = setMistakeQstItemPracticeResultReq.isCorrect;
        }
        return setMistakeQstItemPracticeResultReq.copy(i, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCorrect() {
        return this.isCorrect;
    }

    @NotNull
    public final SetMistakeQstItemPracticeResultReq copy(int itemId, boolean isCorrect) {
        return new SetMistakeQstItemPracticeResultReq(itemId, isCorrect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetMistakeQstItemPracticeResultReq)) {
            return false;
        }
        SetMistakeQstItemPracticeResultReq setMistakeQstItemPracticeResultReq = (SetMistakeQstItemPracticeResultReq) other;
        return this.itemId == setMistakeQstItemPracticeResultReq.itemId && this.isCorrect == setMistakeQstItemPracticeResultReq.isCorrect;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCorrect) + (Integer.hashCode(this.itemId) * 31);
    }

    public final boolean isCorrect() {
        return this.isCorrect;
    }

    @NotNull
    public String toString() {
        return "SetMistakeQstItemPracticeResultReq(itemId=" + this.itemId + ", isCorrect=" + this.isCorrect + ")";
    }
}
