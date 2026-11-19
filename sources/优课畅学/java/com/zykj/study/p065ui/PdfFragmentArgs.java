package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class PdfFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7771a f11717b = new C7771a(null);

    /* renamed from: a */
    public final String f11718a;

    /* renamed from: com.zykj.study.ui.PdfFragmentArgs$a */
    public static final class C7771a {
        public /* synthetic */ C7771a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final PdfFragmentArgs m10499a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(PdfFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new PdfFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7771a() {
        }
    }

    public PdfFragmentArgs(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f11718a = path;
    }

    public static final PdfFragmentArgs fromBundle(Bundle bundle) {
        return f11717b.m10499a(bundle);
    }

    /* renamed from: a */
    public final String m10498a() {
        return this.f11718a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PdfFragmentArgs) && AbstractC9133u.m16128b(this.f11718a, ((PdfFragmentArgs) obj).f11718a);
    }

    public int hashCode() {
        return this.f11718a.hashCode();
    }

    public String toString() {
        return "PdfFragmentArgs(path=" + this.f11718a + ")";
    }
}
