package com.zykj.mistake.entity.req;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/MonitorPictureReq;", "", "appName", "", "packageName", "pictures", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getPictures", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class MonitorPictureReq {
    public static final int $stable = 8;

    @NotNull
    private final String appName;

    @NotNull
    private final String packageName;

    @NotNull
    private final List<String> pictures;

    public MonitorPictureReq(@NotNull String appName, @NotNull String packageName, @NotNull List<String> pictures) {
        AbstractC5830k.m5330g(appName, "appName");
        AbstractC5830k.m5330g(packageName, "packageName");
        AbstractC5830k.m5330g(pictures, "pictures");
        this.appName = appName;
        this.packageName = packageName;
        this.pictures = pictures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonitorPictureReq copy$default(MonitorPictureReq monitorPictureReq, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monitorPictureReq.appName;
        }
        if ((i & 2) != 0) {
            str2 = monitorPictureReq.packageName;
        }
        if ((i & 4) != 0) {
            list = monitorPictureReq.pictures;
        }
        return monitorPictureReq.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final List<String> component3() {
        return this.pictures;
    }

    @NotNull
    public final MonitorPictureReq copy(@NotNull String appName, @NotNull String packageName, @NotNull List<String> pictures) {
        AbstractC5830k.m5330g(appName, "appName");
        AbstractC5830k.m5330g(packageName, "packageName");
        AbstractC5830k.m5330g(pictures, "pictures");
        return new MonitorPictureReq(appName, packageName, pictures);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitorPictureReq)) {
            return false;
        }
        MonitorPictureReq monitorPictureReq = (MonitorPictureReq) other;
        return AbstractC5830k.m5325b(this.appName, monitorPictureReq.appName) && AbstractC5830k.m5325b(this.packageName, monitorPictureReq.packageName) && AbstractC5830k.m5325b(this.pictures, monitorPictureReq.pictures);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final List<String> getPictures() {
        return this.pictures;
    }

    public int hashCode() {
        return this.pictures.hashCode() + AbstractC0584a.m903d(this.appName.hashCode() * 31, 31, this.packageName);
    }

    @NotNull
    public String toString() {
        String str = this.appName;
        String str2 = this.packageName;
        List<String> list = this.pictures;
        StringBuilder sbM101z = AbstractC0037f.m101z("MonitorPictureReq(appName=", str, ", packageName=", str2, ", pictures=");
        sbM101z.append(list);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
