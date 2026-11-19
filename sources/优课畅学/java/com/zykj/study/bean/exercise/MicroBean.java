package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class MicroBean {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f11009id;
    private final String name;
    private final String type;
    private final String url;

    public MicroBean(int i10, String type, String url, String name) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(url, "url");
        AbstractC9133u.m16133g(name, "name");
        this.f11009id = i10;
        this.type = type;
        this.url = url;
        this.name = name;
    }

    public static /* synthetic */ MicroBean copy$default(MicroBean microBean, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = microBean.f11009id;
        }
        if ((i11 & 2) != 0) {
            str = microBean.type;
        }
        if ((i11 & 4) != 0) {
            str2 = microBean.url;
        }
        if ((i11 & 8) != 0) {
            str3 = microBean.name;
        }
        return microBean.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.f11009id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.name;
    }

    public final MicroBean copy(int i10, String type, String url, String name) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(url, "url");
        AbstractC9133u.m16133g(name, "name");
        return new MicroBean(i10, type, url, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroBean)) {
            return false;
        }
        MicroBean microBean = (MicroBean) obj;
        return this.f11009id == microBean.f11009id && AbstractC9133u.m16128b(this.type, microBean.type) && AbstractC9133u.m16128b(this.url, microBean.url) && AbstractC9133u.m16128b(this.name, microBean.name);
    }

    public final int getId() {
        return this.f11009id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f11009id) * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
    }

    public final String snapshotUrl() {
        return AbstractC8687z.m14101I(this.url, ".zip", ".jpg", false, 4, null);
    }

    public String toString() {
        return "MicroBean(id=" + this.f11009id + ", type=" + this.type + ", url=" + this.url + ", name=" + this.name + ")";
    }
}
