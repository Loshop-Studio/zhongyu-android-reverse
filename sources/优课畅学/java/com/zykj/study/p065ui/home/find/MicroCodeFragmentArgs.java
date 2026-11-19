package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class MicroCodeFragmentArgs implements NavArgs {

    /* renamed from: c */
    public static final C7947a f12655c = new C7947a(null);

    /* renamed from: a */
    public final String f12656a;

    /* renamed from: b */
    public final String f12657b;

    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragmentArgs$a */
    public static final class C7947a {
        public /* synthetic */ C7947a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MicroCodeFragmentArgs m11104a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MicroCodeFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("code")) {
                throw new IllegalArgumentException("Required argument \"code\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("code");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("path");
            if (string2 != null) {
                return new MicroCodeFragmentArgs(string, string2);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7947a() {
        }
    }

    public MicroCodeFragmentArgs(String code, String path) {
        AbstractC9133u.m16133g(code, "code");
        AbstractC9133u.m16133g(path, "path");
        this.f12656a = code;
        this.f12657b = path;
    }

    public static final MicroCodeFragmentArgs fromBundle(Bundle bundle) {
        return f12655c.m11104a(bundle);
    }

    /* renamed from: a */
    public final String m11102a() {
        return this.f12656a;
    }

    /* renamed from: b */
    public final String m11103b() {
        return this.f12657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroCodeFragmentArgs)) {
            return false;
        }
        MicroCodeFragmentArgs microCodeFragmentArgs = (MicroCodeFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f12656a, microCodeFragmentArgs.f12656a) && AbstractC9133u.m16128b(this.f12657b, microCodeFragmentArgs.f12657b);
    }

    public int hashCode() {
        return (this.f12656a.hashCode() * 31) + this.f12657b.hashCode();
    }

    public String toString() {
        return "MicroCodeFragmentArgs(code=" + this.f12656a + ", path=" + this.f12657b + ")";
    }
}
