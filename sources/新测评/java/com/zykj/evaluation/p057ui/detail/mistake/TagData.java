package com.zykj.evaluation.p057ui.detail.mistake;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/mistake/TagData;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "isSelected", "", "<init>", "(JLjava/lang/String;Z)V", "getId", "()J", "getName", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagData {
    public static final int $stable = 0;
    private final long id;
    private final boolean isSelected;
    private final String name;

    public TagData() {
        this(0L, null, false, 7, null);
    }

    public static /* synthetic */ TagData copy$default(TagData tagData, long j10, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = tagData.id;
        }
        if ((i10 & 2) != 0) {
            str = tagData.name;
        }
        if ((i10 & 4) != 0) {
            z9 = tagData.isSelected;
        }
        return tagData.copy(j10, str, z9);
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
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final TagData copy(long id, String name, boolean isSelected) {
        return new TagData(id, name, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagData)) {
            return false;
        }
        TagData tagData = (TagData) other;
        return this.id == tagData.id && Intrinsics.areEqual(this.name, tagData.name) && this.isSelected == tagData.isSelected;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "TagData(id=" + this.id + ", name=" + this.name + ", isSelected=" + this.isSelected + ")";
    }

    public TagData(long j10, String str, boolean z9) {
        this.id = j10;
        this.name = str;
        this.isSelected = z9;
    }

    public /* synthetic */ TagData(long j10, String str, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z9);
    }
}
