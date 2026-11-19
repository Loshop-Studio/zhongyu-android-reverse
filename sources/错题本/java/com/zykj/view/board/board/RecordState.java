package com.zykj.view.board.board;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.RecordStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordState;", "", "recordStatus", "Lcom/zykj/view/board/board/RecordStatus;", "isMicrophoneOn", "", "progress", "", "<init>", "(Lcom/zykj/view/board/board/RecordStatus;ZLjava/lang/String;)V", "getRecordStatus", "()Lcom/zykj/view/board/board/RecordStatus;", "()Z", "getProgress", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class RecordState {
    private final boolean isMicrophoneOn;

    @NotNull
    private final String progress;

    @NotNull
    private final RecordStatus recordStatus;

    public RecordState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ RecordState copy$default(RecordState recordState, RecordStatus recordStatus, boolean z8, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            recordStatus = recordState.recordStatus;
        }
        if ((i & 2) != 0) {
            z8 = recordState.isMicrophoneOn;
        }
        if ((i & 4) != 0) {
            str = recordState.progress;
        }
        return recordState.copy(recordStatus, z8, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RecordStatus getRecordStatus() {
        return this.recordStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMicrophoneOn() {
        return this.isMicrophoneOn;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProgress() {
        return this.progress;
    }

    @NotNull
    public final RecordState copy(@NotNull RecordStatus recordStatus, boolean isMicrophoneOn, @NotNull String progress) {
        AbstractC5830k.m5330g(recordStatus, "recordStatus");
        AbstractC5830k.m5330g(progress, "progress");
        return new RecordState(recordStatus, isMicrophoneOn, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordState)) {
            return false;
        }
        RecordState recordState = (RecordState) other;
        return AbstractC5830k.m5325b(this.recordStatus, recordState.recordStatus) && this.isMicrophoneOn == recordState.isMicrophoneOn && AbstractC5830k.m5325b(this.progress, recordState.progress);
    }

    @NotNull
    public final String getProgress() {
        return this.progress;
    }

    @NotNull
    public final RecordStatus getRecordStatus() {
        return this.recordStatus;
    }

    public int hashCode() {
        return this.progress.hashCode() + AbstractC0584a.m908i(this.isMicrophoneOn, this.recordStatus.hashCode() * 31, 31);
    }

    public final boolean isMicrophoneOn() {
        return this.isMicrophoneOn;
    }

    @NotNull
    public String toString() {
        RecordStatus recordStatus = this.recordStatus;
        boolean z8 = this.isMicrophoneOn;
        String str = this.progress;
        StringBuilder sb = new StringBuilder("RecordState(recordStatus=");
        sb.append(recordStatus);
        sb.append(", isMicrophoneOn=");
        sb.append(z8);
        sb.append(", progress=");
        return AbstractC0037f.m91p(sb, str, ")");
    }

    public RecordState(@NotNull RecordStatus recordStatus, boolean z8, @NotNull String progress) {
        AbstractC5830k.m5330g(recordStatus, "recordStatus");
        AbstractC5830k.m5330g(progress, "progress");
        this.recordStatus = recordStatus;
        this.isMicrophoneOn = z8;
        this.progress = progress;
    }

    public /* synthetic */ RecordState(RecordStatus recordStatus, boolean z8, String str, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? RecordStatus.Init.INSTANCE : recordStatus, (i & 2) != 0 ? false : z8, (i & 4) != 0 ? "00:00" : str);
    }
}
