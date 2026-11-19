package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "count", "<init>", "(II)V", "getType", "()I", "getCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnReadMessageBean {
    public static final int $stable = 0;
    private final int count;
    private final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnReadMessageBean() {
        int i6 = 0;
        this(i6, i6, 3, null);
    }

    public static /* synthetic */ UnReadMessageBean copy$default(UnReadMessageBean unReadMessageBean, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = unReadMessageBean.type;
        }
        if ((i8 & 2) != 0) {
            i7 = unReadMessageBean.count;
        }
        return unReadMessageBean.copy(i6, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final UnReadMessageBean copy(int type, int count) {
        return new UnReadMessageBean(type, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnReadMessageBean)) {
            return false;
        }
        UnReadMessageBean unReadMessageBean = (UnReadMessageBean) other;
        return this.type == unReadMessageBean.type && this.count == unReadMessageBean.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "UnReadMessageBean(type=" + this.type + ", count=" + this.count + ")";
    }

    public UnReadMessageBean(int i6, int i7) {
        this.type = i6;
        this.count = i7;
    }

    public /* synthetic */ UnReadMessageBean(int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? -1 : i6, (i8 & 2) != 0 ? 0 : i7);
    }
}
