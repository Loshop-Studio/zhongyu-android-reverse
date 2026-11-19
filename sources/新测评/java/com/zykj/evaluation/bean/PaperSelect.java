package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperSelect;", "", "uuid", "", "options", "", "Lcom/zykj/evaluation/bean/PaperOption;", RequestParameters.POSITION, "Lcom/zykj/evaluation/bean/PaperPosition;", "order", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;I)V", "getUuid", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getPosition", "()Lcom/zykj/evaluation/bean/PaperPosition;", "getOrder", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperSelect {
    public static final int $stable = 8;

    @SerializedName("Options")
    private final List<PaperOption> options;

    @SerializedName("Order")
    private final int order;

    @SerializedName("Position")
    private final PaperPosition position;

    @SerializedName("Uuid")
    private final String uuid;

    public PaperSelect(String uuid, List<PaperOption> options, PaperPosition paperPosition, int i10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(options, "options");
        this.uuid = uuid;
        this.options = options;
        this.position = paperPosition;
        this.order = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaperSelect copy$default(PaperSelect paperSelect, String str, List list, PaperPosition paperPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paperSelect.uuid;
        }
        if ((i11 & 2) != 0) {
            list = paperSelect.options;
        }
        if ((i11 & 4) != 0) {
            paperPosition = paperSelect.position;
        }
        if ((i11 & 8) != 0) {
            i10 = paperSelect.order;
        }
        return paperSelect.copy(str, list, paperPosition, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<PaperOption> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final PaperPosition getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public final PaperSelect copy(String uuid, List<PaperOption> options, PaperPosition position, int order) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(options, "options");
        return new PaperSelect(uuid, options, position, order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperSelect)) {
            return false;
        }
        PaperSelect paperSelect = (PaperSelect) other;
        return Intrinsics.areEqual(this.uuid, paperSelect.uuid) && Intrinsics.areEqual(this.options, paperSelect.options) && Intrinsics.areEqual(this.position, paperSelect.position) && this.order == paperSelect.order;
    }

    public final List<PaperOption> getOptions() {
        return this.options;
    }

    public final int getOrder() {
        return this.order;
    }

    public final PaperPosition getPosition() {
        return this.position;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = ((this.uuid.hashCode() * 31) + this.options.hashCode()) * 31;
        PaperPosition paperPosition = this.position;
        return ((iHashCode + (paperPosition == null ? 0 : paperPosition.hashCode())) * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        return "PaperSelect(uuid=" + this.uuid + ", options=" + this.options + ", position=" + this.position + ", order=" + this.order + ")";
    }
}
