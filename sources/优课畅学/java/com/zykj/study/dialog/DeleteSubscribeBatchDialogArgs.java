package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class DeleteSubscribeBatchDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7713a f11178b = new C7713a(null);

    /* renamed from: a */
    public final String f11179a;

    /* renamed from: com.zykj.study.dialog.DeleteSubscribeBatchDialogArgs$a */
    public static final class C7713a {
        public /* synthetic */ C7713a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final DeleteSubscribeBatchDialogArgs m10253a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(DeleteSubscribeBatchDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("number")) {
                throw new IllegalArgumentException("Required argument \"number\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("number");
            if (string != null) {
                return new DeleteSubscribeBatchDialogArgs(string);
            }
            throw new IllegalArgumentException("Argument \"number\" is marked as non-null but was passed a null value.");
        }

        public C7713a() {
        }
    }

    public DeleteSubscribeBatchDialogArgs(String number) {
        AbstractC9133u.m16133g(number, "number");
        this.f11179a = number;
    }

    public static final DeleteSubscribeBatchDialogArgs fromBundle(Bundle bundle) {
        return f11178b.m10253a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteSubscribeBatchDialogArgs) && AbstractC9133u.m16128b(this.f11179a, ((DeleteSubscribeBatchDialogArgs) obj).f11179a);
    }

    public int hashCode() {
        return this.f11179a.hashCode();
    }

    public String toString() {
        return "DeleteSubscribeBatchDialogArgs(number=" + this.f11179a + ")";
    }
}
