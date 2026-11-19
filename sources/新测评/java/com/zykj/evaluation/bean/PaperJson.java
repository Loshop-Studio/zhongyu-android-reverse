package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperJson;", "", "config", "Lcom/zykj/evaluation/bean/PaperConfig;", "<init>", "(Lcom/zykj/evaluation/bean/PaperConfig;)V", "getConfig", "()Lcom/zykj/evaluation/bean/PaperConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperJson {
    public static final int $stable = 8;

    @SerializedName("Config")
    private final PaperConfig config;

    public PaperJson(PaperConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public static /* synthetic */ PaperJson copy$default(PaperJson paperJson, PaperConfig paperConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paperConfig = paperJson.config;
        }
        return paperJson.copy(paperConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final PaperConfig getConfig() {
        return this.config;
    }

    public final PaperJson copy(PaperConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new PaperJson(config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaperJson) && Intrinsics.areEqual(this.config, ((PaperJson) other).config);
    }

    public final PaperConfig getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public String toString() {
        return "PaperJson(config=" + this.config + ")";
    }
}
