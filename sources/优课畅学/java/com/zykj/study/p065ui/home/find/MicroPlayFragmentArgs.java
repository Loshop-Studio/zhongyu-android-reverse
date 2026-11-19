package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class MicroPlayFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7954a f12669b = new C7954a(null);

    /* renamed from: a */
    public final String f12670a;

    /* renamed from: com.zykj.study.ui.home.find.MicroPlayFragmentArgs$a */
    public static final class C7954a {
        public /* synthetic */ C7954a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MicroPlayFragmentArgs m11141a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MicroPlayFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new MicroPlayFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7954a() {
        }
    }

    public MicroPlayFragmentArgs(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f12670a = path;
    }

    public static final MicroPlayFragmentArgs fromBundle(Bundle bundle) {
        return f12669b.m11141a(bundle);
    }

    /* renamed from: a */
    public final String m11140a() {
        return this.f12670a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MicroPlayFragmentArgs) && AbstractC9133u.m16128b(this.f12670a, ((MicroPlayFragmentArgs) obj).f12670a);
    }

    public int hashCode() {
        return this.f12670a.hashCode();
    }

    public String toString() {
        return "MicroPlayFragmentArgs(path=" + this.f12670a + ")";
    }
}
