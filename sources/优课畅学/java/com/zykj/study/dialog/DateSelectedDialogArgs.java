package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class DateSelectedDialogArgs implements NavArgs {

    /* renamed from: c */
    public static final C7711a f11173c = new C7711a(null);

    /* renamed from: a */
    public final String f11174a;

    /* renamed from: b */
    public final String f11175b;

    /* renamed from: com.zykj.study.dialog.DateSelectedDialogArgs$a */
    public static final class C7711a {
        public /* synthetic */ C7711a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final DateSelectedDialogArgs m10248a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(DateSelectedDialogArgs.class.getClassLoader());
            if (!bundle.containsKey("start")) {
                throw new IllegalArgumentException("Required argument \"start\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("start");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("end")) {
                throw new IllegalArgumentException("Required argument \"end\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("end");
            if (string2 != null) {
                return new DateSelectedDialogArgs(string, string2);
            }
            throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
        }

        public C7711a() {
        }
    }

    public DateSelectedDialogArgs(String start, String end) {
        AbstractC9133u.m16133g(start, "start");
        AbstractC9133u.m16133g(end, "end");
        this.f11174a = start;
        this.f11175b = end;
    }

    public static final DateSelectedDialogArgs fromBundle(Bundle bundle) {
        return f11173c.m10248a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateSelectedDialogArgs)) {
            return false;
        }
        DateSelectedDialogArgs dateSelectedDialogArgs = (DateSelectedDialogArgs) obj;
        return AbstractC9133u.m16128b(this.f11174a, dateSelectedDialogArgs.f11174a) && AbstractC9133u.m16128b(this.f11175b, dateSelectedDialogArgs.f11175b);
    }

    public int hashCode() {
        return (this.f11174a.hashCode() * 31) + this.f11175b.hashCode();
    }

    public String toString() {
        return "DateSelectedDialogArgs(start=" + this.f11174a + ", end=" + this.f11175b + ")";
    }
}
