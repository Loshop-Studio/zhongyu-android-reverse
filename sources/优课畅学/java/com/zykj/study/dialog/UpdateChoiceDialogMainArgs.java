package com.zykj.study.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.lib.ota.bean.VersionInfo;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UpdateChoiceDialogMainArgs implements NavArgs {

    /* renamed from: b */
    public static final C7729a f11238b = new C7729a(null);

    /* renamed from: c */
    public static final int f11239c = 8;

    /* renamed from: a */
    public final VersionInfo f11240a;

    /* renamed from: com.zykj.study.dialog.UpdateChoiceDialogMainArgs$a */
    public static final class C7729a {
        public /* synthetic */ C7729a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final UpdateChoiceDialogMainArgs m10305a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(UpdateChoiceDialogMainArgs.class.getClassLoader());
            if (!bundle.containsKey("versionInfoMain")) {
                throw new IllegalArgumentException("Required argument \"versionInfoMain\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(VersionInfo.class) || Serializable.class.isAssignableFrom(VersionInfo.class)) {
                VersionInfo versionInfo = (VersionInfo) bundle.get("versionInfoMain");
                if (versionInfo != null) {
                    return new UpdateChoiceDialogMainArgs(versionInfo);
                }
                throw new IllegalArgumentException("Argument \"versionInfoMain\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(VersionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C7729a() {
        }
    }

    public UpdateChoiceDialogMainArgs(VersionInfo versionInfoMain) {
        AbstractC9133u.m16133g(versionInfoMain, "versionInfoMain");
        this.f11240a = versionInfoMain;
    }

    public static final UpdateChoiceDialogMainArgs fromBundle(Bundle bundle) {
        return f11238b.m10305a(bundle);
    }

    /* renamed from: a */
    public final VersionInfo m10304a() {
        return this.f11240a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateChoiceDialogMainArgs) && AbstractC9133u.m16128b(this.f11240a, ((UpdateChoiceDialogMainArgs) obj).f11240a);
    }

    public int hashCode() {
        return this.f11240a.hashCode();
    }

    public String toString() {
        return "UpdateChoiceDialogMainArgs(versionInfoMain=" + this.f11240a + ")";
    }
}
