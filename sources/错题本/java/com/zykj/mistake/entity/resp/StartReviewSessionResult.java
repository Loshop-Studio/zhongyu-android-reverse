package com.zykj.mistake.entity.resp;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;", "", "sessionId", "", "mode", "", "totalCount", "needStrengthenCount", "consolidatingCount", "masteredCount", "hasQuestion", "", "<init>", "(JIIIIIZ)V", "getSessionId", "()J", "getMode", "()I", "getTotalCount", "getNeedStrengthenCount", "getConsolidatingCount", "getMasteredCount", "getHasQuestion", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class StartReviewSessionResult {
    public static final int $stable = 0;
    private final int consolidatingCount;
    private final boolean hasQuestion;
    private final int masteredCount;
    private final int mode;
    private final int needStrengthenCount;
    private final long sessionId;
    private final int totalCount;

    public StartReviewSessionResult() {
        this(0L, 0, 0, 0, 0, 0, false, 127, null);
    }

    public static /* synthetic */ StartReviewSessionResult copy$default(StartReviewSessionResult startReviewSessionResult, long j7, int i, int i8, int i9, int i10, int i11, boolean z8, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j7 = startReviewSessionResult.sessionId;
        }
        long j8 = j7;
        if ((i12 & 2) != 0) {
            i = startReviewSessionResult.mode;
        }
        int i13 = i;
        if ((i12 & 4) != 0) {
            i8 = startReviewSessionResult.totalCount;
        }
        int i14 = i8;
        if ((i12 & 8) != 0) {
            i9 = startReviewSessionResult.needStrengthenCount;
        }
        int i15 = i9;
        if ((i12 & 16) != 0) {
            i10 = startReviewSessionResult.consolidatingCount;
        }
        return startReviewSessionResult.copy(j8, i13, i14, i15, i10, (i12 & 32) != 0 ? startReviewSessionResult.masteredCount : i11, (i12 & 64) != 0 ? startReviewSessionResult.hasQuestion : z8);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNeedStrengthenCount() {
        return this.needStrengthenCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getConsolidatingCount() {
        return this.consolidatingCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMasteredCount() {
        return this.masteredCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasQuestion() {
        return this.hasQuestion;
    }

    @NotNull
    public final StartReviewSessionResult copy(long sessionId, int mode, int totalCount, int needStrengthenCount, int consolidatingCount, int masteredCount, boolean hasQuestion) {
        return new StartReviewSessionResult(sessionId, mode, totalCount, needStrengthenCount, consolidatingCount, masteredCount, hasQuestion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartReviewSessionResult)) {
            return false;
        }
        StartReviewSessionResult startReviewSessionResult = (StartReviewSessionResult) other;
        return this.sessionId == startReviewSessionResult.sessionId && this.mode == startReviewSessionResult.mode && this.totalCount == startReviewSessionResult.totalCount && this.needStrengthenCount == startReviewSessionResult.needStrengthenCount && this.consolidatingCount == startReviewSessionResult.consolidatingCount && this.masteredCount == startReviewSessionResult.masteredCount && this.hasQuestion == startReviewSessionResult.hasQuestion;
    }

    public final int getConsolidatingCount() {
        return this.consolidatingCount;
    }

    public final boolean getHasQuestion() {
        return this.hasQuestion;
    }

    public final int getMasteredCount() {
        return this.masteredCount;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getNeedStrengthenCount() {
        return this.needStrengthenCount;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasQuestion) + AbstractC0584a.m902c(this.masteredCount, AbstractC0584a.m902c(this.consolidatingCount, AbstractC0584a.m902c(this.needStrengthenCount, AbstractC0584a.m902c(this.totalCount, AbstractC0584a.m902c(this.mode, Long.hashCode(this.sessionId) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "StartReviewSessionResult(sessionId=" + this.sessionId + ", mode=" + this.mode + ", totalCount=" + this.totalCount + ", needStrengthenCount=" + this.needStrengthenCount + ", consolidatingCount=" + this.consolidatingCount + ", masteredCount=" + this.masteredCount + ", hasQuestion=" + this.hasQuestion + ")";
    }

    public StartReviewSessionResult(long j7, int i, int i8, int i9, int i10, int i11, boolean z8) {
        this.sessionId = j7;
        this.mode = i;
        this.totalCount = i8;
        this.needStrengthenCount = i9;
        this.consolidatingCount = i10;
        this.masteredCount = i11;
        this.hasQuestion = z8;
    }

    public /* synthetic */ StartReviewSessionResult(long j7, int i, int i8, int i9, int i10, int i11, boolean z8, int i12, AbstractC5824e abstractC5824e) {
        this((i12 & 1) != 0 ? 0L : j7, (i12 & 2) != 0 ? 0 : i, (i12 & 4) != 0 ? 0 : i8, (i12 & 8) != 0 ? 0 : i9, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? false : z8);
    }
}
