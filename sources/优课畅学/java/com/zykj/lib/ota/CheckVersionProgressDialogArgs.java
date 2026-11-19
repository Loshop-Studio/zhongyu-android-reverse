package com.zykj.lib.ota;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavArgs;
import com.zykj.lib.ota.bean.AppType;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CheckVersionProgressDialogArgs implements NavArgs {

    /* renamed from: f */
    public static final C7361a f10162f = new C7361a(null);

    /* renamed from: a */
    public final String f10163a;

    /* renamed from: b */
    public final int f10164b;

    /* renamed from: c */
    public final String f10165c;

    /* renamed from: d */
    public final AppType f10166d;

    /* renamed from: e */
    public final boolean f10167e;

    /* renamed from: com.zykj.lib.ota.CheckVersionProgressDialogArgs$a */
    public static final class C7361a {
        public /* synthetic */ C7361a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final CheckVersionProgressDialogArgs m9424a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(CheckVersionProgressDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("packageName")) {
                throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("packageName");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("versionCode")) {
                throw new IllegalArgumentException("Required argument \"versionCode\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("versionCode");
            if (!bundle.containsKey("versionName")) {
                throw new IllegalArgumentException("Required argument \"versionName\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("versionName");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"versionName\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("appType")) {
                throw new IllegalArgumentException("Required argument \"appType\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(AppType.class) || Serializable.class.isAssignableFrom(AppType.class)) {
                AppType appType = (AppType) bundle.get("appType");
                if (appType != null) {
                    return new CheckVersionProgressDialogArgs(string, i10, string2, appType, bundle.containsKey("silence") ? bundle.getBoolean("silence") : true);
                }
                throw new IllegalArgumentException("Argument \"appType\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(AppType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C7361a() {
        }
    }

    public CheckVersionProgressDialogArgs(String packageName, int i10, String versionName, AppType appType, boolean z10) {
        AbstractC9133u.m16133g(packageName, "packageName");
        AbstractC9133u.m16133g(versionName, "versionName");
        AbstractC9133u.m16133g(appType, "appType");
        this.f10163a = packageName;
        this.f10164b = i10;
        this.f10165c = versionName;
        this.f10166d = appType;
        this.f10167e = z10;
    }

    public static final CheckVersionProgressDialogArgs fromBundle(Bundle bundle) {
        return f10162f.m9424a(bundle);
    }

    /* renamed from: a */
    public final AppType m9419a() {
        return this.f10166d;
    }

    /* renamed from: b */
    public final String m9420b() {
        return this.f10163a;
    }

    /* renamed from: c */
    public final boolean m9421c() {
        return this.f10167e;
    }

    /* renamed from: d */
    public final int m9422d() {
        return this.f10164b;
    }

    /* renamed from: e */
    public final String m9423e() {
        return this.f10165c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckVersionProgressDialogArgs)) {
            return false;
        }
        CheckVersionProgressDialogArgs checkVersionProgressDialogArgs = (CheckVersionProgressDialogArgs) obj;
        return AbstractC9133u.m16128b(this.f10163a, checkVersionProgressDialogArgs.f10163a) && this.f10164b == checkVersionProgressDialogArgs.f10164b && AbstractC9133u.m16128b(this.f10165c, checkVersionProgressDialogArgs.f10165c) && this.f10166d == checkVersionProgressDialogArgs.f10166d && this.f10167e == checkVersionProgressDialogArgs.f10167e;
    }

    public int hashCode() {
        return (((((((this.f10163a.hashCode() * 31) + Integer.hashCode(this.f10164b)) * 31) + this.f10165c.hashCode()) * 31) + this.f10166d.hashCode()) * 31) + Boolean.hashCode(this.f10167e);
    }

    public String toString() {
        return "CheckVersionProgressDialogArgs(packageName=" + this.f10163a + ", versionCode=" + this.f10164b + ", versionName=" + this.f10165c + ", appType=" + this.f10166d + ", silence=" + this.f10167e + ")";
    }
}
