package com.zykj.lib.ota;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class DownloadProgressDialogArgs implements NavArgs {

    /* renamed from: c */
    public static final C7365a f10173c = new C7365a(null);

    /* renamed from: a */
    public final String f10174a;

    /* renamed from: b */
    public final boolean f10175b;

    /* renamed from: com.zykj.lib.ota.DownloadProgressDialogArgs$a */
    public static final class C7365a {
        public /* synthetic */ C7365a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final DownloadProgressDialogArgs m9429a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(DownloadProgressDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("fileUrl")) {
                throw new IllegalArgumentException("Required argument \"fileUrl\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("fileUrl");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"fileUrl\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("force")) {
                return new DownloadProgressDialogArgs(string, bundle.getBoolean("force"));
            }
            throw new IllegalArgumentException("Required argument \"force\" is missing and does not have an android:defaultValue");
        }

        public C7365a() {
        }
    }

    public DownloadProgressDialogArgs(String fileUrl, boolean z10) {
        AbstractC9133u.m16133g(fileUrl, "fileUrl");
        this.f10174a = fileUrl;
        this.f10175b = z10;
    }

    public static final DownloadProgressDialogArgs fromBundle(Bundle bundle) {
        return f10173c.m9429a(bundle);
    }

    /* renamed from: a */
    public final String m9427a() {
        return this.f10174a;
    }

    /* renamed from: b */
    public final boolean m9428b() {
        return this.f10175b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadProgressDialogArgs)) {
            return false;
        }
        DownloadProgressDialogArgs downloadProgressDialogArgs = (DownloadProgressDialogArgs) obj;
        return AbstractC9133u.m16128b(this.f10174a, downloadProgressDialogArgs.f10174a) && this.f10175b == downloadProgressDialogArgs.f10175b;
    }

    public int hashCode() {
        return (this.f10174a.hashCode() * 31) + Boolean.hashCode(this.f10175b);
    }

    public String toString() {
        return "DownloadProgressDialogArgs(fileUrl=" + this.f10174a + ", force=" + this.f10175b + ")";
    }
}
