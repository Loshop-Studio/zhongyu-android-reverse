package com.zykj.lib.login.p062ui.teacher.pwd;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ComposeModifyPasswordDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7352a f10072b = new C7352a(null);

    /* renamed from: a */
    public final int f10073a;

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialogArgs$a */
    public static final class C7352a {
        public /* synthetic */ C7352a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ComposeModifyPasswordDialogArgs m9359a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ComposeModifyPasswordDialogArgs.class.getClassLoader());
            return new ComposeModifyPasswordDialogArgs(bundle.containsKey("arg_pwd_level") ? bundle.getInt("arg_pwd_level") : 1);
        }

        public C7352a() {
        }
    }

    public ComposeModifyPasswordDialogArgs() {
        this(0, 1, null);
    }

    public static final ComposeModifyPasswordDialogArgs fromBundle(Bundle bundle) {
        return f10072b.m9359a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComposeModifyPasswordDialogArgs) && this.f10073a == ((ComposeModifyPasswordDialogArgs) obj).f10073a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f10073a);
    }

    public String toString() {
        return "ComposeModifyPasswordDialogArgs(argPwdLevel=" + this.f10073a + ")";
    }

    public ComposeModifyPasswordDialogArgs(int i10) {
        this.f10073a = i10;
    }

    public /* synthetic */ ComposeModifyPasswordDialogArgs(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 1 : i10);
    }
}
