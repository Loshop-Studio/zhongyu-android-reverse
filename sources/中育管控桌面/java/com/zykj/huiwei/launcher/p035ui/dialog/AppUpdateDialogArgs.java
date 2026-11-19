package com.zykj.huiwei.launcher.p035ui.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;", "Landroidx/navigation/NavArgs;", "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "versionInfo", "<init>", "(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "()Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppUpdateDialogArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c */
    public static final int f6414c = 8;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final VersionInfo versionInfo;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialogArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AppUpdateDialogArgs m5630a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(AppUpdateDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("versionInfo")) {
                throw new IllegalArgumentException("Required argument \"versionInfo\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(VersionInfo.class) || Serializable.class.isAssignableFrom(VersionInfo.class)) {
                VersionInfo versionInfo = (VersionInfo) bundle.get("versionInfo");
                if (versionInfo != null) {
                    return new AppUpdateDialogArgs(versionInfo);
                }
                throw new IllegalArgumentException("Argument \"versionInfo\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(VersionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public Companion() {
        }
    }

    public AppUpdateDialogArgs(VersionInfo versionInfo) {
        Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
        this.versionInfo = versionInfo;
    }

    @JvmStatic
    public static final AppUpdateDialogArgs fromBundle(Bundle bundle) {
        return INSTANCE.m5630a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /* renamed from: b */
    public final Bundle m5629b() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(VersionInfo.class)) {
            VersionInfo versionInfo = this.versionInfo;
            Intrinsics.checkNotNull(versionInfo, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("versionInfo", versionInfo);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(VersionInfo.class)) {
            Parcelable parcelable = this.versionInfo;
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("versionInfo", (Serializable) parcelable);
            return bundle;
        }
        throw new UnsupportedOperationException(VersionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppUpdateDialogArgs) && Intrinsics.areEqual(this.versionInfo, ((AppUpdateDialogArgs) other).versionInfo);
    }

    public int hashCode() {
        return this.versionInfo.hashCode();
    }

    public String toString() {
        return "AppUpdateDialogArgs(versionInfo=" + this.versionInfo + ")";
    }
}
