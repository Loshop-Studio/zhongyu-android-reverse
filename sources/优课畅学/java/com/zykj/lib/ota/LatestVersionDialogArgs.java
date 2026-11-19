package com.zykj.lib.ota;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class LatestVersionDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7367a f10198b = new C7367a(null);

    /* renamed from: a */
    public final String f10199a;

    /* renamed from: com.zykj.lib.ota.LatestVersionDialogArgs$a */
    public static final class C7367a {
        public /* synthetic */ C7367a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final LatestVersionDialogArgs m9439a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(LatestVersionDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("versionName")) {
                throw new IllegalArgumentException("Required argument \"versionName\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("versionName");
            if (string != null) {
                return new LatestVersionDialogArgs(string);
            }
            throw new IllegalArgumentException("Argument \"versionName\" is marked as non-null but was passed a null value.");
        }

        public C7367a() {
        }
    }

    public LatestVersionDialogArgs(String versionName) {
        AbstractC9133u.m16133g(versionName, "versionName");
        this.f10199a = versionName;
    }

    public static final LatestVersionDialogArgs fromBundle(Bundle bundle) {
        return f10198b.m9439a(bundle);
    }

    /* renamed from: a */
    public final String m9438a() {
        return this.f10199a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LatestVersionDialogArgs) && AbstractC9133u.m16128b(this.f10199a, ((LatestVersionDialogArgs) obj).f10199a);
    }

    public int hashCode() {
        return this.f10199a.hashCode();
    }

    public String toString() {
        return "LatestVersionDialogArgs(versionName=" + this.f10199a + ")";
    }
}
