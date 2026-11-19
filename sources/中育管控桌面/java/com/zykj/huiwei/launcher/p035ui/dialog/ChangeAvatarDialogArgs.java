package com.zykj.huiwei.launcher.p035ui.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0015"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;", "Landroidx/navigation/NavArgs;", "", "url", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChangeAvatarDialogArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String url;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialogArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChangeAvatarDialogArgs m5645a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(ChangeAvatarDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("url")) {
                throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("url");
            if (string != null) {
                return new ChangeAvatarDialogArgs(string);
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }

        public Companion() {
        }
    }

    public ChangeAvatarDialogArgs(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @JvmStatic
    public static final ChangeAvatarDialogArgs fromBundle(Bundle bundle) {
        return INSTANCE.m5645a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: b */
    public final Bundle m5644b() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.url);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChangeAvatarDialogArgs) && Intrinsics.areEqual(this.url, ((ChangeAvatarDialogArgs) other).url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "ChangeAvatarDialogArgs(url=" + this.url + ")";
    }
}
