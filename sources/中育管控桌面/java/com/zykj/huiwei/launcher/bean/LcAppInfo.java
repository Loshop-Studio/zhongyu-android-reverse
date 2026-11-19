package com.zykj.huiwei.launcher.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/LcAppInfo;", "", HintConstants.AUTOFILL_HINT_NAME, "", "visible", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getVisible", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LcAppInfo {
    public static final int $stable = 0;
    private final String name;
    private final boolean visible;

    public LcAppInfo(String name, boolean z6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.visible = z6;
    }

    public static /* synthetic */ LcAppInfo copy$default(LcAppInfo lcAppInfo, String str, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = lcAppInfo.name;
        }
        if ((i6 & 2) != 0) {
            z6 = lcAppInfo.visible;
        }
        return lcAppInfo.copy(str, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final LcAppInfo copy(String name, boolean visible) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LcAppInfo(name, visible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LcAppInfo)) {
            return false;
        }
        LcAppInfo lcAppInfo = (LcAppInfo) other;
        return Intrinsics.areEqual(this.name, lcAppInfo.name) && this.visible == lcAppInfo.visible;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.visible);
    }

    public String toString() {
        return "LcAppInfo(name=" + this.name + ", visible=" + this.visible + ")";
    }
}
