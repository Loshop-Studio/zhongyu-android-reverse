package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/SetNoteReq;", "", "<init>", "()V", "mistakeItemId", "", "getMistakeItemId", "()J", "setMistakeItemId", "(J)V", "note", "", "getNote", "()Ljava/lang/String;", "setNote", "(Ljava/lang/String;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SetNoteReq {
    public static final int $stable = 8;
    private long mistakeItemId;

    @NotNull
    private String note = "";

    public final long getMistakeItemId() {
        return this.mistakeItemId;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final void setMistakeItemId(long j7) {
        this.mistakeItemId = j7;
    }

    public final void setNote(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.note = str;
    }
}
