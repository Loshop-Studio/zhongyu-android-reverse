package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006 "}, m5110d2 = {"Lcom/zykj/mistake/entity/req/MultiSetTagsReq;", "", "<init>", "()V", "bookId", "", "getBookId", "()I", "setBookId", "(I)V", "itemIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemIds", "()Ljava/util/ArrayList;", "setItemIds", "(Ljava/util/ArrayList;)V", "diff", "getDiff", "()Ljava/lang/Integer;", "setDiff", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "attainedLevel", "getAttainedLevel", "setAttainedLevel", "errorReason", "getErrorReason", "setErrorReason", "tagIdList", "getTagIdList", "setTagIdList", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MultiSetTagsReq {
    public static final int $stable = 8;

    @Nullable
    private Integer attainedLevel;
    private int bookId;

    @Nullable
    private Integer diff;

    @Nullable
    private Integer errorReason;

    @NotNull
    private ArrayList<Integer> itemIds = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> tagIdList = new ArrayList<>();

    @Nullable
    public final Integer getAttainedLevel() {
        return this.attainedLevel;
    }

    public final int getBookId() {
        return this.bookId;
    }

    @Nullable
    public final Integer getDiff() {
        return this.diff;
    }

    @Nullable
    public final Integer getErrorReason() {
        return this.errorReason;
    }

    @NotNull
    public final ArrayList<Integer> getItemIds() {
        return this.itemIds;
    }

    @NotNull
    public final ArrayList<Integer> getTagIdList() {
        return this.tagIdList;
    }

    public final void setAttainedLevel(@Nullable Integer num) {
        this.attainedLevel = num;
    }

    public final void setBookId(int i) {
        this.bookId = i;
    }

    public final void setDiff(@Nullable Integer num) {
        this.diff = num;
    }

    public final void setErrorReason(@Nullable Integer num) {
        this.errorReason = num;
    }

    public final void setItemIds(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.itemIds = arrayList;
    }

    public final void setTagIdList(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.tagIdList = arrayList;
    }
}
