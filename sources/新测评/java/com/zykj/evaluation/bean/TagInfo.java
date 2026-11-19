package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TagInfo;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagInfo {
    public static final int $stable = 0;
    private final long id;
    private final String name;

    public TagInfo() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = tagInfo.id;
        }
        if ((i10 & 2) != 0) {
            str = tagInfo.name;
        }
        return tagInfo.copy(j10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final TagInfo copy(long id, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TagInfo(id, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagInfo)) {
            return false;
        }
        TagInfo tagInfo = (TagInfo) other;
        return this.id == tagInfo.id && Intrinsics.areEqual(this.name, tagInfo.name);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "TagInfo(id=" + this.id + ", name=" + this.name + ")";
    }

    public TagInfo(long j10, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j10;
        this.name = name;
    }

    public /* synthetic */ TagInfo(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str);
    }
}
