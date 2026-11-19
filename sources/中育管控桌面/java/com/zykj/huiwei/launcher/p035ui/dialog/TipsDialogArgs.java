package com.zykj.huiwei.launcher.p035ui.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0018BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;", "Landroidx/navigation/NavArgs;", "", "content", "cancel", "confirm", "", "isShowCancel", "cancelable", "canceledOnTouchOutside", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "Landroid/os/Bundle;", "g", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Z", "f", "()Z", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TipsDialogArgs implements NavArgs {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String content;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String cancel;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String confirm;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isShowCancel;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean cancelable;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean canceledOnTouchOutside;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.TipsDialogArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TipsDialogArgs m5753a(Bundle bundle) {
            String string;
            String string2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(TipsDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("content")) {
                throw new IllegalArgumentException("Required argument \"content\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString("content");
            if (string3 == null) {
                throw new IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("cancel")) {
                string = bundle.getString("cancel");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"cancel\" is marked as non-null but was passed a null value.");
                }
            } else {
                string = "取消";
            }
            String str = string;
            if (bundle.containsKey("confirm")) {
                string2 = bundle.getString("confirm");
                if (string2 == null) {
                    throw new IllegalArgumentException("Argument \"confirm\" is marked as non-null but was passed a null value.");
                }
            } else {
                string2 = "确定";
            }
            return new TipsDialogArgs(string3, str, string2, bundle.containsKey("isShowCancel") ? bundle.getBoolean("isShowCancel") : true, bundle.containsKey("cancelable") ? bundle.getBoolean("cancelable") : true, bundle.containsKey("canceledOnTouchOutside") ? bundle.getBoolean("canceledOnTouchOutside") : true);
        }

        public Companion() {
        }
    }

    public TipsDialogArgs(String content, String cancel, String confirm, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        this.content = content;
        this.cancel = cancel;
        this.confirm = confirm;
        this.isShowCancel = z6;
        this.cancelable = z7;
        this.canceledOnTouchOutside = z8;
    }

    @JvmStatic
    public static final TipsDialogArgs fromBundle(Bundle bundle) {
        return INSTANCE.m5753a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getCancel() {
        return this.cancel;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCanceledOnTouchOutside() {
        return this.canceledOnTouchOutside;
    }

    /* renamed from: d, reason: from getter */
    public final String getConfirm() {
        return this.confirm;
    }

    /* renamed from: e, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsDialogArgs)) {
            return false;
        }
        TipsDialogArgs tipsDialogArgs = (TipsDialogArgs) other;
        return Intrinsics.areEqual(this.content, tipsDialogArgs.content) && Intrinsics.areEqual(this.cancel, tipsDialogArgs.cancel) && Intrinsics.areEqual(this.confirm, tipsDialogArgs.confirm) && this.isShowCancel == tipsDialogArgs.isShowCancel && this.cancelable == tipsDialogArgs.cancelable && this.canceledOnTouchOutside == tipsDialogArgs.canceledOnTouchOutside;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsShowCancel() {
        return this.isShowCancel;
    }

    /* renamed from: g */
    public final Bundle m5752g() {
        Bundle bundle = new Bundle();
        bundle.putString("content", this.content);
        bundle.putString("cancel", this.cancel);
        bundle.putString("confirm", this.confirm);
        bundle.putBoolean("isShowCancel", this.isShowCancel);
        bundle.putBoolean("cancelable", this.cancelable);
        bundle.putBoolean("canceledOnTouchOutside", this.canceledOnTouchOutside);
        return bundle;
    }

    public int hashCode() {
        return (((((((((this.content.hashCode() * 31) + this.cancel.hashCode()) * 31) + this.confirm.hashCode()) * 31) + Boolean.hashCode(this.isShowCancel)) * 31) + Boolean.hashCode(this.cancelable)) * 31) + Boolean.hashCode(this.canceledOnTouchOutside);
    }

    public String toString() {
        return "TipsDialogArgs(content=" + this.content + ", cancel=" + this.cancel + ", confirm=" + this.confirm + ", isShowCancel=" + this.isShowCancel + ", cancelable=" + this.cancelable + ", canceledOnTouchOutside=" + this.canceledOnTouchOutside + ")";
    }

    public /* synthetic */ TipsDialogArgs(String str, String str2, String str3, boolean z6, boolean z7, boolean z8, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? "取消" : str2, (i6 & 4) != 0 ? "确定" : str3, (i6 & 8) != 0 ? true : z6, (i6 & 16) != 0 ? true : z7, (i6 & 32) != 0 ? true : z8);
    }
}
