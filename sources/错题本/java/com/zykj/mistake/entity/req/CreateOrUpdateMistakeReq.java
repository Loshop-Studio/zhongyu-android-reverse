package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00170$j\b\u0012\u0004\u0012\u00020\u0017`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R.\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010$j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R.\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010$j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)¨\u00063"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "topicId", "getTopicId", "()J", "setTopicId", "(J)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "diff", "", "getDiff", "()Ljava/lang/Integer;", "setDiff", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "attainedLevel", "getAttainedLevel", "setAttainedLevel", "errorReason", "getErrorReason", "setErrorReason", "tagIdList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTagIdList", "()Ljava/util/ArrayList;", "setTagIdList", "(Ljava/util/ArrayList;)V", "stemShoot", "getStemShoot", "setStemShoot", "extraStems", "getExtraStems", "setExtraStems", "extraAnswers", "getExtraAnswers", "setExtraAnswers", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CreateOrUpdateMistakeReq {
    public static final int $stable = 8;

    @Nullable
    private Integer attainedLevel;

    @Nullable
    private Integer diff;

    @Nullable
    private Integer errorReason;

    @Nullable
    private ArrayList<String> extraAnswers;

    @Nullable
    private ArrayList<String> extraStems;

    @Nullable
    private Long id;

    @Nullable
    private String stemShoot;
    private long topicId;

    @NotNull
    private String title = "";

    @NotNull
    private ArrayList<Integer> tagIdList = new ArrayList<>();

    @Nullable
    public final Integer getAttainedLevel() {
        return this.attainedLevel;
    }

    @Nullable
    public final Integer getDiff() {
        return this.diff;
    }

    @Nullable
    public final Integer getErrorReason() {
        return this.errorReason;
    }

    @Nullable
    public final ArrayList<String> getExtraAnswers() {
        return this.extraAnswers;
    }

    @Nullable
    public final ArrayList<String> getExtraStems() {
        return this.extraStems;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getStemShoot() {
        return this.stemShoot;
    }

    @NotNull
    public final ArrayList<Integer> getTagIdList() {
        return this.tagIdList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public final void setAttainedLevel(@Nullable Integer num) {
        this.attainedLevel = num;
    }

    public final void setDiff(@Nullable Integer num) {
        this.diff = num;
    }

    public final void setErrorReason(@Nullable Integer num) {
        this.errorReason = num;
    }

    public final void setExtraAnswers(@Nullable ArrayList<String> arrayList) {
        this.extraAnswers = arrayList;
    }

    public final void setExtraStems(@Nullable ArrayList<String> arrayList) {
        this.extraStems = arrayList;
    }

    public final void setId(@Nullable Long l) {
        this.id = l;
    }

    public final void setStemShoot(@Nullable String str) {
        this.stemShoot = str;
    }

    public final void setTagIdList(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.tagIdList = arrayList;
    }

    public final void setTitle(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.title = str;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }
}
