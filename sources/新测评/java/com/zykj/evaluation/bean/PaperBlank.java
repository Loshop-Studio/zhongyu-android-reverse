package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperBlank;", "", "uuid", "", RequestParameters.POSITION, "Lcom/zykj/evaluation/bean/PaperPosition;", "<init>", "(Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;)V", "getUuid", "()Ljava/lang/String;", "getPosition", "()Lcom/zykj/evaluation/bean/PaperPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperBlank {
    public static final int $stable = 0;

    @SerializedName("Position")
    private final PaperPosition position;

    @SerializedName("Uuid")
    private final String uuid;

    public PaperBlank(String uuid, PaperPosition position) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(position, "position");
        this.uuid = uuid;
        this.position = position;
    }

    public static /* synthetic */ PaperBlank copy$default(PaperBlank paperBlank, String str, PaperPosition paperPosition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paperBlank.uuid;
        }
        if ((i10 & 2) != 0) {
            paperPosition = paperBlank.position;
        }
        return paperBlank.copy(str, paperPosition);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final PaperPosition getPosition() {
        return this.position;
    }

    public final PaperBlank copy(String uuid, PaperPosition position) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(position, "position");
        return new PaperBlank(uuid, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperBlank)) {
            return false;
        }
        PaperBlank paperBlank = (PaperBlank) other;
        return Intrinsics.areEqual(this.uuid, paperBlank.uuid) && Intrinsics.areEqual(this.position, paperBlank.position);
    }

    public final PaperPosition getPosition() {
        return this.position;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.position.hashCode();
    }

    public String toString() {
        return "PaperBlank(uuid=" + this.uuid + ", position=" + this.position + ")";
    }
}
