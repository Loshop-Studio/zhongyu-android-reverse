package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialogArgs;", "Landroidx/navigation/NavArgs;", "", "argPwdLevel", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getArgPwdLevel", "b", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ComposeModifyPasswordDialogArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final int argPwdLevel;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ComposeModifyPasswordDialogArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ComposeModifyPasswordDialogArgs m5775a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(ComposeModifyPasswordDialogArgs.class.getClassLoader());
            return new ComposeModifyPasswordDialogArgs(bundle.containsKey("arg_pwd_level") ? bundle.getInt("arg_pwd_level") : 1);
        }

        public Companion() {
        }
    }

    public ComposeModifyPasswordDialogArgs() {
        this(0, 1, null);
    }

    @JvmStatic
    public static final ComposeModifyPasswordDialogArgs fromBundle(Bundle bundle) {
        return INSTANCE.m5775a(bundle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComposeModifyPasswordDialogArgs) && this.argPwdLevel == ((ComposeModifyPasswordDialogArgs) other).argPwdLevel;
    }

    public int hashCode() {
        return Integer.hashCode(this.argPwdLevel);
    }

    public String toString() {
        return "ComposeModifyPasswordDialogArgs(argPwdLevel=" + this.argPwdLevel + ")";
    }

    public ComposeModifyPasswordDialogArgs(int i6) {
        this.argPwdLevel = i6;
    }

    public /* synthetic */ ComposeModifyPasswordDialogArgs(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 1 : i6);
    }
}
