package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class CatalogDialogArgs implements NavArgs {

    /* renamed from: d */
    public static final C7709a f11167d = new C7709a(null);

    /* renamed from: a */
    public final int f11168a;

    /* renamed from: b */
    public final int f11169b;

    /* renamed from: c */
    public final int f11170c;

    /* renamed from: com.zykj.study.dialog.CatalogDialogArgs$a */
    public static final class C7709a {
        public /* synthetic */ C7709a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final CatalogDialogArgs m10235a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(CatalogDialogArgs.class.getClassLoader());
            return new CatalogDialogArgs(bundle.containsKey("periodId") ? bundle.getInt("periodId") : 0, bundle.containsKey("subjectId") ? bundle.getInt("subjectId") : 0, bundle.containsKey("gradeId") ? bundle.getInt("gradeId") : 0);
        }

        public C7709a() {
        }
    }

    public CatalogDialogArgs() {
        this(0, 0, 0, 7, null);
    }

    public static final CatalogDialogArgs fromBundle(Bundle bundle) {
        return f11167d.m10235a(bundle);
    }

    /* renamed from: a */
    public final int m10232a() {
        return this.f11170c;
    }

    /* renamed from: b */
    public final int m10233b() {
        return this.f11168a;
    }

    /* renamed from: c */
    public final int m10234c() {
        return this.f11169b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogDialogArgs)) {
            return false;
        }
        CatalogDialogArgs catalogDialogArgs = (CatalogDialogArgs) obj;
        return this.f11168a == catalogDialogArgs.f11168a && this.f11169b == catalogDialogArgs.f11169b && this.f11170c == catalogDialogArgs.f11170c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11168a) * 31) + Integer.hashCode(this.f11169b)) * 31) + Integer.hashCode(this.f11170c);
    }

    public String toString() {
        return "CatalogDialogArgs(periodId=" + this.f11168a + ", subjectId=" + this.f11169b + ", gradeId=" + this.f11170c + ")";
    }

    public CatalogDialogArgs(int i10, int i11, int i12) {
        this.f11168a = i10;
        this.f11169b = i11;
        this.f11170c = i12;
    }

    public /* synthetic */ CatalogDialogArgs(int i10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
