package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R*\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R\u001a\u00103\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\u001a\u00106\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&¨\u00069"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/MistakeListReq;", "", "<init>", "()V", "bookId", "", "getBookId", "()Ljava/lang/Long;", "setBookId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "diff", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDiff", "()Ljava/util/ArrayList;", "setDiff", "(Ljava/util/ArrayList;)V", "attainedLevel", "getAttainedLevel", "setAttainedLevel", "errorReason", "getErrorReason", "setErrorReason", "tagIdList", "getTagIdList", "setTagIdList", "haveNoTag", "", "getHaveNoTag", "()Z", "setHaveNoTag", "(Z)V", "timeType", "getTimeType", "()I", "setTimeType", "(I)V", "startTime", "", "getStartTime", "()Ljava/lang/String;", "setStartTime", "(Ljava/lang/String;)V", "endTime", "getEndTime", "setEndTime", "topicIds", "getTopicIds", "setTopicIds", "skipCount", "getSkipCount", "setSkipCount", "maxResultCount", "getMaxResultCount", "setMaxResultCount", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeListReq {
    public static final int $stable = 8;

    @Nullable
    private Long bookId;

    @Nullable
    private String endTime;
    private boolean haveNoTag;
    private int skipCount;

    @Nullable
    private String startTime;
    private int timeType;

    @NotNull
    private ArrayList<Integer> diff = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> attainedLevel = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> errorReason = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> tagIdList = new ArrayList<>();

    @NotNull
    private ArrayList<Long> topicIds = new ArrayList<>();
    private int maxResultCount = 20;

    @NotNull
    public final ArrayList<Integer> getAttainedLevel() {
        return this.attainedLevel;
    }

    @Nullable
    public final Long getBookId() {
        return this.bookId;
    }

    @NotNull
    public final ArrayList<Integer> getDiff() {
        return this.diff;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final ArrayList<Integer> getErrorReason() {
        return this.errorReason;
    }

    public final boolean getHaveNoTag() {
        return this.haveNoTag;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final ArrayList<Integer> getTagIdList() {
        return this.tagIdList;
    }

    public final int getTimeType() {
        return this.timeType;
    }

    @NotNull
    public final ArrayList<Long> getTopicIds() {
        return this.topicIds;
    }

    public final void setAttainedLevel(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.attainedLevel = arrayList;
    }

    public final void setBookId(@Nullable Long l) {
        this.bookId = l;
    }

    public final void setDiff(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.diff = arrayList;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setErrorReason(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.errorReason = arrayList;
    }

    public final void setHaveNoTag(boolean z8) {
        this.haveNoTag = z8;
    }

    public final void setMaxResultCount(int i) {
        this.maxResultCount = i;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setTagIdList(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.tagIdList = arrayList;
    }

    public final void setTimeType(int i) {
        this.timeType = i;
    }

    public final void setTopicIds(@NotNull ArrayList<Long> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.topicIds = arrayList;
    }
}
