package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageResp;", "", "data", "", "Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnReadMessageResp {
    public static final int $stable = 8;
    private final List<UnReadMessageBean> data;

    /* JADX WARN: Multi-variable type inference failed */
    public UnReadMessageResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnReadMessageResp copy$default(UnReadMessageResp unReadMessageResp, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = unReadMessageResp.data;
        }
        return unReadMessageResp.copy(list);
    }

    public final List<UnReadMessageBean> component1() {
        return this.data;
    }

    public final UnReadMessageResp copy(List<UnReadMessageBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new UnReadMessageResp(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnReadMessageResp) && Intrinsics.areEqual(this.data, ((UnReadMessageResp) other).data);
    }

    public final List<UnReadMessageBean> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "UnReadMessageResp(data=" + this.data + ")";
    }

    public UnReadMessageResp(List<UnReadMessageBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public /* synthetic */ UnReadMessageResp(List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? new ArrayList() : list);
    }
}
