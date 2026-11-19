package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperConfig;", "", "pages", "", "Lcom/zykj/evaluation/bean/PaperPage;", "version", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPages", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperConfig {
    public static final int $stable = 8;

    @SerializedName("Pages")
    private final List<PaperPage> pages;

    @SerializedName("Version")
    private final String version;

    public PaperConfig(List<PaperPage> pages, String version) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(version, "version");
        this.pages = pages;
        this.version = version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaperConfig copy$default(PaperConfig paperConfig, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paperConfig.pages;
        }
        if ((i10 & 2) != 0) {
            str = paperConfig.version;
        }
        return paperConfig.copy(list, str);
    }

    public final List<PaperPage> component1() {
        return this.pages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final PaperConfig copy(List<PaperPage> pages, String version) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(version, "version");
        return new PaperConfig(pages, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaperConfig)) {
            return false;
        }
        PaperConfig paperConfig = (PaperConfig) other;
        return Intrinsics.areEqual(this.pages, paperConfig.pages) && Intrinsics.areEqual(this.version, paperConfig.version);
    }

    public final List<PaperPage> getPages() {
        return this.pages;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.pages.hashCode() * 31) + this.version.hashCode();
    }

    public String toString() {
        return "PaperConfig(pages=" + this.pages + ", version=" + this.version + ")";
    }
}
