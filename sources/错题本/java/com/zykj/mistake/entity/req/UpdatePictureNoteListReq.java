package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/UpdatePictureNoteListReq;", "", "mistakeItemId", "", "pictureNotes", "", "", "<init>", "(JLjava/util/List;)V", "getMistakeItemId", "()J", "getPictureNotes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class UpdatePictureNoteListReq {
    public static final int $stable = 8;
    private final long mistakeItemId;

    @NotNull
    private final List<String> pictureNotes;

    public UpdatePictureNoteListReq(long j7, @NotNull List<String> pictureNotes) {
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        this.mistakeItemId = j7;
        this.pictureNotes = pictureNotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatePictureNoteListReq copy$default(UpdatePictureNoteListReq updatePictureNoteListReq, long j7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = updatePictureNoteListReq.mistakeItemId;
        }
        if ((i & 2) != 0) {
            list = updatePictureNoteListReq.pictureNotes;
        }
        return updatePictureNoteListReq.copy(j7, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMistakeItemId() {
        return this.mistakeItemId;
    }

    @NotNull
    public final List<String> component2() {
        return this.pictureNotes;
    }

    @NotNull
    public final UpdatePictureNoteListReq copy(long mistakeItemId, @NotNull List<String> pictureNotes) {
        AbstractC5830k.m5330g(pictureNotes, "pictureNotes");
        return new UpdatePictureNoteListReq(mistakeItemId, pictureNotes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePictureNoteListReq)) {
            return false;
        }
        UpdatePictureNoteListReq updatePictureNoteListReq = (UpdatePictureNoteListReq) other;
        return this.mistakeItemId == updatePictureNoteListReq.mistakeItemId && AbstractC5830k.m5325b(this.pictureNotes, updatePictureNoteListReq.pictureNotes);
    }

    public final long getMistakeItemId() {
        return this.mistakeItemId;
    }

    @NotNull
    public final List<String> getPictureNotes() {
        return this.pictureNotes;
    }

    public int hashCode() {
        return this.pictureNotes.hashCode() + (Long.hashCode(this.mistakeItemId) * 31);
    }

    @NotNull
    public String toString() {
        return "UpdatePictureNoteListReq(mistakeItemId=" + this.mistakeItemId + ", pictureNotes=" + this.pictureNotes + ")";
    }
}
