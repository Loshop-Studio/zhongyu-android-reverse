package com.zykj.evaluation.bean.bundle;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/bean/bundle/SketchPlayBundle;", "", "examId", "", "questionId", "url", "", "<init>", "(JJLjava/lang/String;)V", "getExamId", "()J", "getQuestionId", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SketchPlayBundle {
    public static final int $stable = 0;
    private final long examId;
    private final long questionId;
    private final String url;

    public SketchPlayBundle(long j10, long j11, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.examId = j10;
        this.questionId = j11;
        this.url = url;
    }

    public static /* synthetic */ SketchPlayBundle copy$default(SketchPlayBundle sketchPlayBundle, long j10, long j11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sketchPlayBundle.examId;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = sketchPlayBundle.questionId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = sketchPlayBundle.url;
        }
        return sketchPlayBundle.copy(j12, j13, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getExamId() {
        return this.examId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SketchPlayBundle copy(long examId, long questionId, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new SketchPlayBundle(examId, questionId, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SketchPlayBundle)) {
            return false;
        }
        SketchPlayBundle sketchPlayBundle = (SketchPlayBundle) other;
        return this.examId == sketchPlayBundle.examId && this.questionId == sketchPlayBundle.questionId && Intrinsics.areEqual(this.url, sketchPlayBundle.url);
    }

    public final long getExamId() {
        return this.examId;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((Long.hashCode(this.examId) * 31) + Long.hashCode(this.questionId)) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "SketchPlayBundle(examId=" + this.examId + ", questionId=" + this.questionId + ", url=" + this.url + ")";
    }
}
