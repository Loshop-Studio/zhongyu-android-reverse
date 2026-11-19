package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u001f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GetTopicList;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "content", "sort", "", "isActive", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;IZ)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getContent", "getSort", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetTopicList {
    public static final int $stable = 0;
    private final String content;
    private final long id;
    private final boolean isActive;
    private final String name;
    private final int sort;

    public GetTopicList(long j10, String name, String content, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j10;
        this.name = name;
        this.content = content;
        this.sort = i10;
        this.isActive = z9;
    }

    public static /* synthetic */ GetTopicList copy$default(GetTopicList getTopicList, long j10, String str, String str2, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = getTopicList.id;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = getTopicList.name;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = getTopicList.content;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            i10 = getTopicList.sort;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            z9 = getTopicList.isActive;
        }
        return getTopicList.copy(j11, str3, str4, i12, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final GetTopicList copy(long id, String name, String content, int sort, boolean isActive) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        return new GetTopicList(id, name, content, sort, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTopicList)) {
            return false;
        }
        GetTopicList getTopicList = (GetTopicList) other;
        return this.id == getTopicList.id && Intrinsics.areEqual(this.name, getTopicList.name) && Intrinsics.areEqual(this.content, getTopicList.content) && this.sort == getTopicList.sort && this.isActive == getTopicList.isActive;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + Boolean.hashCode(this.isActive);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "GetTopicList(id=" + this.id + ", name=" + this.name + ", content=" + this.content + ", sort=" + this.sort + ", isActive=" + this.isActive + ")";
    }
}
