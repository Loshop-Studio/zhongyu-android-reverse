package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class OpenFileFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7768a f11700b = new C7768a(null);

    /* renamed from: a */
    public final String f11701a;

    /* renamed from: com.zykj.study.ui.OpenFileFragmentArgs$a */
    public static final class C7768a {
        public /* synthetic */ C7768a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final OpenFileFragmentArgs m10488a(Bundle bundle) {
            String string;
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(OpenFileFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("path")) {
                string = bundle.getString("path");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
                }
            } else {
                string = "";
            }
            return new OpenFileFragmentArgs(string);
        }

        public C7768a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenFileFragmentArgs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final OpenFileFragmentArgs fromBundle(Bundle bundle) {
        return f11700b.m10488a(bundle);
    }

    /* renamed from: a */
    public final OpenFileFragmentArgs m10485a(String path) {
        AbstractC9133u.m16133g(path, "path");
        return new OpenFileFragmentArgs(path);
    }

    /* renamed from: b */
    public final String m10486b() {
        return this.f11701a;
    }

    /* renamed from: c */
    public final Bundle m10487c() {
        Bundle bundle = new Bundle();
        bundle.putString("path", this.f11701a);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenFileFragmentArgs) && AbstractC9133u.m16128b(this.f11701a, ((OpenFileFragmentArgs) obj).f11701a);
    }

    public int hashCode() {
        return this.f11701a.hashCode();
    }

    public String toString() {
        return "OpenFileFragmentArgs(path=" + this.f11701a + ")";
    }

    public OpenFileFragmentArgs(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f11701a = path;
    }

    public /* synthetic */ OpenFileFragmentArgs(String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
