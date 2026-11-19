package com.zykj.lib.ota;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.zykj.lib.ota.bean.VersionInfo;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.lib.ota.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7373a {

    /* renamed from: a */
    public static final c f10222a = new c(null);

    /* renamed from: com.zykj.lib.ota.a$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f10223a;

        /* renamed from: b */
        public final int f10224b;

        public a(String versionName) {
            AbstractC9133u.m16133g(versionName, "versionName");
            this.f10223a = versionName;
            this.f10224b = R$id.action_checkVersionProgressDialog_to_latestVersionDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f10223a, ((a) obj).f10223a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f10224b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("versionName", this.f10223a);
            return bundle;
        }

        public int hashCode() {
            return this.f10223a.hashCode();
        }

        public String toString() {
            return "ActionCheckVersionProgressDialogToLatestVersionDialog(versionName=" + this.f10223a + ")";
        }
    }

    /* renamed from: com.zykj.lib.ota.a$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final VersionInfo f10225a;

        /* renamed from: b */
        public final int f10226b;

        public b(VersionInfo versionInfo) {
            AbstractC9133u.m16133g(versionInfo, "versionInfo");
            this.f10225a = versionInfo;
            this.f10226b = R$id.action_checkVersionProgressDialog_to_updateChoiceDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f10225a, ((b) obj).f10225a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f10226b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(VersionInfo.class)) {
                VersionInfo versionInfo = this.f10225a;
                AbstractC9133u.m16131e(versionInfo, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("versionInfo", versionInfo);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(VersionInfo.class)) {
                Parcelable parcelable = this.f10225a;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("versionInfo", (Serializable) parcelable);
                return bundle;
            }
            throw new UnsupportedOperationException(VersionInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            return this.f10225a.hashCode();
        }

        public String toString() {
            return "ActionCheckVersionProgressDialogToUpdateChoiceDialog(versionInfo=" + this.f10225a + ")";
        }
    }

    /* renamed from: com.zykj.lib.ota.a$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m9459a(String versionName) {
            AbstractC9133u.m16133g(versionName, "versionName");
            return new a(versionName);
        }

        /* renamed from: b */
        public final NavDirections m9460b(VersionInfo versionInfo) {
            AbstractC9133u.m16133g(versionInfo, "versionInfo");
            return new b(versionInfo);
        }

        public c() {
        }
    }
}
