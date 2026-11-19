package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/PolicyTypeBean;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(Ljava/lang/Integer;)V", "getType", "()Ljava/lang/Integer;", "setType", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/zykj/huiwei/launcher/bean/PolicyTypeBean;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PolicyTypeBean {
    public static final int $stable = 8;
    private Integer type;

    public PolicyTypeBean(Integer num) {
        this.type = num;
    }

    public static /* synthetic */ PolicyTypeBean copy$default(PolicyTypeBean policyTypeBean, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = policyTypeBean.type;
        }
        return policyTypeBean.copy(num);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    public final PolicyTypeBean copy(Integer type) {
        return new PolicyTypeBean(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PolicyTypeBean) && Intrinsics.areEqual(this.type, ((PolicyTypeBean) other).type);
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "PolicyTypeBean(type=" + this.type + ")";
    }
}
