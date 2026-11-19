package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.bean.BaseGuideQuestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p202p7.C8859c;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u001e\u001a\u00020\u0007J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J_\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GuideGroup;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/evaluation/bean/BaseGuideQuestion;", "", "number", "", HintConstants.AUTOFILL_HINT_NAME, "", "qstCount", "score", "", "questions", "", "description", "showGroupNumber", "", "<init>", "(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)V", "getNumber", "()I", "getName", "()Ljava/lang/String;", "getQstCount", "getScore", "()D", "getQuestions", "()Ljava/util/List;", "getDescription", "getShowGroupNumber", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GuideGroup<T extends BaseGuideQuestion> {
    public static final int $stable = 8;
    private final String description;
    private final String name;
    private final int number;
    private final int qstCount;
    private final List<T> questions;
    private final double score;
    private final boolean showGroupNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public GuideGroup(int i10, String str, int i11, double d10, List<? extends T> questions, String str2, boolean z9) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.number = i10;
        this.name = str;
        this.qstCount = i11;
        this.score = d10;
        this.questions = questions;
        this.description = str2;
        this.showGroupNumber = z9;
    }

    public static /* synthetic */ GuideGroup copy$default(GuideGroup guideGroup, int i10, String str, int i11, double d10, List list, String str2, boolean z9, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = guideGroup.number;
        }
        if ((i12 & 2) != 0) {
            str = guideGroup.name;
        }
        if ((i12 & 4) != 0) {
            i11 = guideGroup.qstCount;
        }
        if ((i12 & 8) != 0) {
            d10 = guideGroup.score;
        }
        if ((i12 & 16) != 0) {
            list = guideGroup.questions;
        }
        if ((i12 & 32) != 0) {
            str2 = guideGroup.description;
        }
        if ((i12 & 64) != 0) {
            z9 = guideGroup.showGroupNumber;
        }
        boolean z10 = z9;
        List list2 = list;
        double d11 = d10;
        int i13 = i11;
        return guideGroup.copy(i10, str, i13, d11, list2, str2, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQstCount() {
        return this.qstCount;
    }

    /* renamed from: component4, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    public final List<T> component5() {
        return this.questions;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowGroupNumber() {
        return this.showGroupNumber;
    }

    public final GuideGroup<T> copy(int number, String name, int qstCount, double score, List<? extends T> questions, String description, boolean showGroupNumber) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new GuideGroup<>(number, name, qstCount, score, questions, description, showGroupNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideGroup)) {
            return false;
        }
        GuideGroup guideGroup = (GuideGroup) other;
        return this.number == guideGroup.number && Intrinsics.areEqual(this.name, guideGroup.name) && this.qstCount == guideGroup.qstCount && Double.compare(this.score, guideGroup.score) == 0 && Intrinsics.areEqual(this.questions, guideGroup.questions) && Intrinsics.areEqual(this.description, guideGroup.description) && this.showGroupNumber == guideGroup.showGroupNumber;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getQstCount() {
        return this.qstCount;
    }

    public final List<T> getQuestions() {
        return this.questions;
    }

    public final double getScore() {
        return this.score;
    }

    public final boolean getShowGroupNumber() {
        return this.showGroupNumber;
    }

    public final String getTitle() {
        String str;
        if (this.showGroupNumber) {
            str = C8859c.f15065e.m14858a(this.number) + " 、" + this.name;
        } else {
            str = this.name;
        }
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.number) * 31;
        String str = this.name;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.qstCount)) * 31) + Double.hashCode(this.score)) * 31) + this.questions.hashCode()) * 31;
        String str2 = this.description;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGroupNumber);
    }

    public String toString() {
        return "GuideGroup(number=" + this.number + ", name=" + this.name + ", qstCount=" + this.qstCount + ", score=" + this.score + ", questions=" + this.questions + ", description=" + this.description + ", showGroupNumber=" + this.showGroupNumber + ")";
    }
}
