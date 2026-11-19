package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;", "", "code", "", "fxLink", "updateTime", "daily", "", "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getFxLink", "getUpdateTime", "getDaily", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WeatherBean {
    public static final int $stable = 8;
    private final String code;
    private final List<WeatherCityBean> daily;
    private final String fxLink;
    private final String updateTime;

    public WeatherBean(String str, String str2, String str3, List<WeatherCityBean> list) {
        this.code = str;
        this.fxLink = str2;
        this.updateTime = str3;
        this.daily = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeatherBean copy$default(WeatherBean weatherBean, String str, String str2, String str3, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = weatherBean.code;
        }
        if ((i6 & 2) != 0) {
            str2 = weatherBean.fxLink;
        }
        if ((i6 & 4) != 0) {
            str3 = weatherBean.updateTime;
        }
        if ((i6 & 8) != 0) {
            list = weatherBean.daily;
        }
        return weatherBean.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFxLink() {
        return this.fxLink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final List<WeatherCityBean> component4() {
        return this.daily;
    }

    public final WeatherBean copy(String code, String fxLink, String updateTime, List<WeatherCityBean> daily) {
        return new WeatherBean(code, fxLink, updateTime, daily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherBean)) {
            return false;
        }
        WeatherBean weatherBean = (WeatherBean) other;
        return Intrinsics.areEqual(this.code, weatherBean.code) && Intrinsics.areEqual(this.fxLink, weatherBean.fxLink) && Intrinsics.areEqual(this.updateTime, weatherBean.updateTime) && Intrinsics.areEqual(this.daily, weatherBean.daily);
    }

    public final String getCode() {
        return this.code;
    }

    public final List<WeatherCityBean> getDaily() {
        return this.daily;
    }

    public final String getFxLink() {
        return this.fxLink;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fxLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<WeatherCityBean> list = this.daily;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "WeatherBean(code=" + this.code + ", fxLink=" + this.fxLink + ", updateTime=" + this.updateTime + ", daily=" + this.daily + ")";
    }
}
