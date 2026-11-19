package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/RemovePicReq;", "", "mistakeItemId", "", "pictureNote", "", "<init>", "(JLjava/lang/String;)V", "getMistakeItemId", "()J", "getPictureNote", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class RemovePicReq {
    public static final int $stable = 0;
    private final long mistakeItemId;

    @NotNull
    private final String pictureNote;

    public RemovePicReq(long j7, @NotNull String pictureNote) {
        AbstractC5830k.m5330g(pictureNote, "pictureNote");
        this.mistakeItemId = j7;
        this.pictureNote = pictureNote;
    }

    public static /* synthetic */ RemovePicReq copy$default(RemovePicReq removePicReq, long j7, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = removePicReq.mistakeItemId;
        }
        if ((i & 2) != 0) {
            str = removePicReq.pictureNote;
        }
        return removePicReq.copy(j7, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMistakeItemId() {
        return this.mistakeItemId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPictureNote() {
        return this.pictureNote;
    }

    @NotNull
    public final RemovePicReq copy(long mistakeItemId, @NotNull String pictureNote) {
        AbstractC5830k.m5330g(pictureNote, "pictureNote");
        return new RemovePicReq(mistakeItemId, pictureNote);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemovePicReq)) {
            return false;
        }
        RemovePicReq removePicReq = (RemovePicReq) other;
        return this.mistakeItemId == removePicReq.mistakeItemId && AbstractC5830k.m5325b(this.pictureNote, removePicReq.pictureNote);
    }

    public final long getMistakeItemId() {
        return this.mistakeItemId;
    }

    @NotNull
    public final String getPictureNote() {
        return this.pictureNote;
    }

    public int hashCode() {
        return this.pictureNote.hashCode() + (Long.hashCode(this.mistakeItemId) * 31);
    }

    @NotNull
    public String toString() {
        return "RemovePicReq(mistakeItemId=" + this.mistakeItemId + ", pictureNote=" + this.pictureNote + ")";
    }
}
