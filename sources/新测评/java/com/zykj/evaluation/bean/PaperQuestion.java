package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jq\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006/"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperQuestion;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "id", "", "groupKey", "", RequestParameters.POSITION, "Lcom/zykj/evaluation/bean/PaperPosition;", "selects", "", "Lcom/zykj/evaluation/bean/PaperSelect;", "blanks", "Lcom/zykj/evaluation/bean/PaperBlank;", "items", "Lcom/zykj/evaluation/bean/PaperHand;", "numericalOrder", "<init>", "(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getType", "()I", "getId", "()J", "getGroupKey", "()Ljava/lang/String;", "getPosition", "()Lcom/zykj/evaluation/bean/PaperPosition;", "getSelects", "()Ljava/util/List;", "getBlanks", "getItems", "getNumericalOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperQuestion {
    public static final int $stable = 8;

    @SerializedName("Blanks")
    private final List<PaperBlank> blanks;

    @SerializedName("GroupKey")
    private final String groupKey;

    @SerializedName("Id")
    private final long id;

    @SerializedName("Items")
    private final List<PaperHand> items;

    @SerializedName("NumericalOrder")
    private final int numericalOrder;

    @SerializedName("Position")
    private final PaperPosition position;

    @SerializedName("Selects")
    private final List<PaperSelect> selects;

    @SerializedName("Type")
    private final int type;

    public PaperQuestion(int i10, long j10, String groupKey, PaperPosition position, List<PaperSelect> list, List<PaperBlank> list2, List<PaperHand> list3, int i11) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(position, "position");
        this.type = i10;
        this.id = j10;
        this.groupKey = groupKey;
        this.position = position;
        this.selects = list;
        this.blanks = list2;
        this.items = list3;
        this.numericalOrder = i11;
    }

    public static /* synthetic */ PaperQuestion copy$default(PaperQuestion paperQuestion, int i10, long j10, String str, PaperPosition paperPosition, List list, List list2, List list3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = paperQuestion.type;
        }
        if ((i12 & 2) != 0) {
            j10 = paperQuestion.id;
        }
        if ((i12 & 4) != 0) {
            str = paperQuestion.groupKey;
        }
        if ((i12 & 8) != 0) {
            paperPosition = paperQuestion.position;
        }
        if ((i12 & 16) != 0) {
            list = paperQuestion.selects;
        }
        if ((i12 & 32) != 0) {
            list2 = paperQuestion.blanks;
        }
        if ((i12 & 64) != 0) {
            list3 = paperQuestion.items;
        }
        if ((i12 & 128) != 0) {
            i11 = paperQuestion.numericalOrder;
        }
        List list4 = list3;
        int i13 = i11;
        return paperQuestion.copy(i10, j10, str, paperPosition, list, list2, list4, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    /* renamed from: component4, reason: from getter */
    public final PaperPosition getPosition() {
        return this.position;
    }

    public final List<PaperSelect> component5() {
        return this.selects;
    }

    public final List<PaperBlank> component6() {
        return this.blanks;
    }

    public final List<PaperHand> component7() {
        return this.items;
    }

    /* renamed from: component8, reason: from getter */
    public final int getNumericalOrder() {
        return this.numericalOrder;
    }

    public final PaperQuestion copy(int type, long id, String groupKey, PaperPosition position, List<PaperSelect> selects, List<PaperBlank> blanks, List<PaperHand> items, int numericalOrder) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(position, "position");
        return new PaperQuestion(type, id, groupKey, position, selects, blanks, items, numericalOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperQuestion)) {
            return false;
        }
        PaperQuestion paperQuestion = (PaperQuestion) other;
        return this.type == paperQuestion.type && this.id == paperQuestion.id && Intrinsics.areEqual(this.groupKey, paperQuestion.groupKey) && Intrinsics.areEqual(this.position, paperQuestion.position) && Intrinsics.areEqual(this.selects, paperQuestion.selects) && Intrinsics.areEqual(this.blanks, paperQuestion.blanks) && Intrinsics.areEqual(this.items, paperQuestion.items) && this.numericalOrder == paperQuestion.numericalOrder;
    }

    public final List<PaperBlank> getBlanks() {
        return this.blanks;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getId() {
        return this.id;
    }

    public final List<PaperHand> getItems() {
        return this.items;
    }

    public final int getNumericalOrder() {
        return this.numericalOrder;
    }

    public final PaperPosition getPosition() {
        return this.position;
    }

    public final List<PaperSelect> getSelects() {
        return this.selects;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.id)) * 31) + this.groupKey.hashCode()) * 31) + this.position.hashCode()) * 31;
        List<PaperSelect> list = this.selects;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PaperBlank> list2 = this.blanks;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaperHand> list3 = this.items;
        return ((iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + Integer.hashCode(this.numericalOrder);
    }

    public String toString() {
        return "PaperQuestion(type=" + this.type + ", id=" + this.id + ", groupKey=" + this.groupKey + ", position=" + this.position + ", selects=" + this.selects + ", blanks=" + this.blanks + ", items=" + this.items + ", numericalOrder=" + this.numericalOrder + ")";
    }
}
