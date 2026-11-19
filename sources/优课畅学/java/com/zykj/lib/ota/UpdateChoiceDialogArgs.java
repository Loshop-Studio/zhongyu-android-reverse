package com.zykj.lib.ota;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavArgs;
import com.zykj.lib.ota.bean.VersionInfo;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class UpdateChoiceDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7372a f10220b = new C7372a(null);

    /* renamed from: a */
    public final VersionInfo f10221a;

    /* renamed from: com.zykj.lib.ota.UpdateChoiceDialogArgs$a */
    public static final class C7372a {
        public /* synthetic */ C7372a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final UpdateChoiceDialogArgs m9458a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(UpdateChoiceDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("versionInfo")) {
                throw new IllegalArgumentException("Required argument \"versionInfo\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(VersionInfo.class) || Serializable.class.isAssignableFrom(VersionInfo.class)) {
                VersionInfo versionInfo = (VersionInfo) bundle.get("versionInfo");
                if (versionInfo != null) {
                    return new UpdateChoiceDialogArgs(versionInfo);
                }
                throw new IllegalArgumentException("Argument \"versionInfo\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(VersionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C7372a() {
        }
    }

    public UpdateChoiceDialogArgs(VersionInfo versionInfo) {
        AbstractC9133u.m16133g(versionInfo, "versionInfo");
        this.f10221a = versionInfo;
    }

    public static final UpdateChoiceDialogArgs fromBundle(Bundle bundle) {
        return f10220b.m9458a(bundle);
    }

    /* renamed from: a */
    public final VersionInfo m9457a() {
        return this.f10221a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateChoiceDialogArgs) && AbstractC9133u.m16128b(this.f10221a, ((UpdateChoiceDialogArgs) obj).f10221a);
    }

    public int hashCode() {
        return this.f10221a.hashCode();
    }

    public String toString() {
        return "UpdateChoiceDialogArgs(versionInfo=" + this.f10221a + ")";
    }
}
