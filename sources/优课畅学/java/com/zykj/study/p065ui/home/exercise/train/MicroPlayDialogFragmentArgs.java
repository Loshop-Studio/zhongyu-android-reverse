package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class MicroPlayDialogFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7867a f12300b = new C7867a(null);

    /* renamed from: a */
    public final String f12301a;

    /* renamed from: com.zykj.study.ui.home.exercise.train.MicroPlayDialogFragmentArgs$a */
    public static final class C7867a {
        public /* synthetic */ C7867a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MicroPlayDialogFragmentArgs m10888a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MicroPlayDialogFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new MicroPlayDialogFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7867a() {
        }
    }

    public MicroPlayDialogFragmentArgs(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f12301a = path;
    }

    public static final MicroPlayDialogFragmentArgs fromBundle(Bundle bundle) {
        return f12300b.m10888a(bundle);
    }

    /* renamed from: a */
    public final String m10887a() {
        return this.f12301a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MicroPlayDialogFragmentArgs) && AbstractC9133u.m16128b(this.f12301a, ((MicroPlayDialogFragmentArgs) obj).f12301a);
    }

    public int hashCode() {
        return this.f12301a.hashCode();
    }

    public String toString() {
        return "MicroPlayDialogFragmentArgs(path=" + this.f12301a + ")";
    }
}
