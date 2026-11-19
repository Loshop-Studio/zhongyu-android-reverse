package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\""}, m13558d2 = {"Lcom/zykj/evaluation/bean/GuideSubQuestion;", "", "qstType", "", "uuid", "", "number", "options", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "subQuestions", "<init>", "(ILjava/lang/String;ILjava/util/List;ILjava/util/List;)V", "getQstType", "()I", "getUuid", "()Ljava/lang/String;", "getNumber", "getOptions", "()Ljava/util/List;", "getType", "getSubQuestions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GuideSubQuestion {
    public static final int $stable = 8;
    private final int number;
    private final List<String> options;
    private final int qstType;
    private final List<GuideSubQuestion> subQuestions;
    private final int type;
    private final String uuid;

    public GuideSubQuestion(int i10, String uuid, int i11, List<String> list, int i12, List<GuideSubQuestion> list2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.qstType = i10;
        this.uuid = uuid;
        this.number = i11;
        this.options = list;
        this.type = i12;
        this.subQuestions = list2;
    }

    public static /* synthetic */ GuideSubQuestion copy$default(GuideSubQuestion guideSubQuestion, int i10, String str, int i11, List list, int i12, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = guideSubQuestion.qstType;
        }
        if ((i13 & 2) != 0) {
            str = guideSubQuestion.uuid;
        }
        if ((i13 & 4) != 0) {
            i11 = guideSubQuestion.number;
        }
        if ((i13 & 8) != 0) {
            list = guideSubQuestion.options;
        }
        if ((i13 & 16) != 0) {
            i12 = guideSubQuestion.type;
        }
        if ((i13 & 32) != 0) {
            list2 = guideSubQuestion.subQuestions;
        }
        int i14 = i12;
        List list3 = list2;
        return guideSubQuestion.copy(i10, str, i11, list, i14, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getQstType() {
        return this.qstType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public final List<String> component4() {
        return this.options;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final List<GuideSubQuestion> component6() {
        return this.subQuestions;
    }

    public final GuideSubQuestion copy(int qstType, String uuid, int number, List<String> options, int type, List<GuideSubQuestion> subQuestions) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new GuideSubQuestion(qstType, uuid, number, options, type, subQuestions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideSubQuestion)) {
            return false;
        }
        GuideSubQuestion guideSubQuestion = (GuideSubQuestion) other;
        return this.qstType == guideSubQuestion.qstType && Intrinsics.areEqual(this.uuid, guideSubQuestion.uuid) && this.number == guideSubQuestion.number && Intrinsics.areEqual(this.options, guideSubQuestion.options) && this.type == guideSubQuestion.type && Intrinsics.areEqual(this.subQuestions, guideSubQuestion.subQuestions);
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final int getQstType() {
        return this.qstType;
    }

    public final List<GuideSubQuestion> getSubQuestions() {
        return this.subQuestions;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.qstType) * 31) + this.uuid.hashCode()) * 31) + Integer.hashCode(this.number)) * 31;
        List<String> list = this.options;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.type)) * 31;
        List<GuideSubQuestion> list2 = this.subQuestions;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "GuideSubQuestion(qstType=" + this.qstType + ", uuid=" + this.uuid + ", number=" + this.number + ", options=" + this.options + ", type=" + this.type + ", subQuestions=" + this.subQuestions + ")";
    }
}
