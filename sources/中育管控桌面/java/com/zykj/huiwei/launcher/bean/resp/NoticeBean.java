package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;", "", "title", "", "content", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "targetCount", "readCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "getTitle", "()Ljava/lang/String;", "getContent", "getType", "()I", "getTargetCount", "getReadCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NoticeBean {
    public static final int $stable = 0;
    private final String content;
    private final int readCount;
    private final int targetCount;
    private final String title;
    private final int type;

    public NoticeBean() {
        this(null, null, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ NoticeBean copy$default(NoticeBean noticeBean, String str, String str2, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = noticeBean.title;
        }
        if ((i9 & 2) != 0) {
            str2 = noticeBean.content;
        }
        if ((i9 & 4) != 0) {
            i6 = noticeBean.type;
        }
        if ((i9 & 8) != 0) {
            i7 = noticeBean.targetCount;
        }
        if ((i9 & 16) != 0) {
            i8 = noticeBean.readCount;
        }
        int i10 = i8;
        int i11 = i6;
        return noticeBean.copy(str, str2, i11, i7, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTargetCount() {
        return this.targetCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getReadCount() {
        return this.readCount;
    }

    public final NoticeBean copy(String title, String content, int type, int targetCount, int readCount) {
        return new NoticeBean(title, content, type, targetCount, readCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeBean)) {
            return false;
        }
        NoticeBean noticeBean = (NoticeBean) other;
        return Intrinsics.areEqual(this.title, noticeBean.title) && Intrinsics.areEqual(this.content, noticeBean.content) && this.type == noticeBean.type && this.targetCount == noticeBean.targetCount && this.readCount == noticeBean.readCount;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getReadCount() {
        return this.readCount;
    }

    public final int getTargetCount() {
        return this.targetCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.targetCount)) * 31) + Integer.hashCode(this.readCount);
    }

    public String toString() {
        return "NoticeBean(title=" + this.title + ", content=" + this.content + ", type=" + this.type + ", targetCount=" + this.targetCount + ", readCount=" + this.readCount + ")";
    }

    public NoticeBean(String str, String str2, int i6, int i7, int i8) {
        this.title = str;
        this.content = str2;
        this.type = i6;
        this.targetCount = i7;
        this.readCount = i8;
    }

    public /* synthetic */ NoticeBean(String str, String str2, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0 : i6, (i9 & 8) != 0 ? 0 : i7, (i9 & 16) != 0 ? 0 : i8);
    }
}
