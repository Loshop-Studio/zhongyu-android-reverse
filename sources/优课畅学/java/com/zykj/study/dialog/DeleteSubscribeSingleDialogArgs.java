package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class DeleteSubscribeSingleDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7715a f11182b = new C7715a(null);

    /* renamed from: a */
    public final String f11183a;

    /* renamed from: com.zykj.study.dialog.DeleteSubscribeSingleDialogArgs$a */
    public static final class C7715a {
        public /* synthetic */ C7715a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final DeleteSubscribeSingleDialogArgs m10258a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(DeleteSubscribeSingleDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("accountId")) {
                throw new IllegalArgumentException("Required argument \"accountId\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("accountId");
            if (string != null) {
                return new DeleteSubscribeSingleDialogArgs(string);
            }
            throw new IllegalArgumentException("Argument \"accountId\" is marked as non-null but was passed a null value.");
        }

        public C7715a() {
        }
    }

    public DeleteSubscribeSingleDialogArgs(String accountId) {
        AbstractC9133u.m16133g(accountId, "accountId");
        this.f11183a = accountId;
    }

    public static final DeleteSubscribeSingleDialogArgs fromBundle(Bundle bundle) {
        return f11182b.m10258a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteSubscribeSingleDialogArgs) && AbstractC9133u.m16128b(this.f11183a, ((DeleteSubscribeSingleDialogArgs) obj).f11183a);
    }

    public int hashCode() {
        return this.f11183a.hashCode();
    }

    public String toString() {
        return "DeleteSubscribeSingleDialogArgs(accountId=" + this.f11183a + ")";
    }
}
