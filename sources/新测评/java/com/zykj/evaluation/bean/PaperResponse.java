package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperResponse;", "", "answerSheet", "", "<init>", "(Ljava/lang/String;)V", "getAnswerSheet", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperResponse {
    public static final int $stable = 0;
    private final String answerSheet;

    public PaperResponse(String str) {
        this.answerSheet = str;
    }

    public static /* synthetic */ PaperResponse copy$default(PaperResponse paperResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paperResponse.answerSheet;
        }
        return paperResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAnswerSheet() {
        return this.answerSheet;
    }

    public final PaperResponse copy(String answerSheet) {
        return new PaperResponse(answerSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaperResponse) && Intrinsics.areEqual(this.answerSheet, ((PaperResponse) other).answerSheet);
    }

    public final String getAnswerSheet() {
        return this.answerSheet;
    }

    public int hashCode() {
        String str = this.answerSheet;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "PaperResponse(answerSheet=" + this.answerSheet + ")";
    }
}
