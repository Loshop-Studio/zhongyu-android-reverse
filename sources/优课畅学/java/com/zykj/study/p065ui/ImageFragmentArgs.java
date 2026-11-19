package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ImageFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7756a f11591b = new C7756a(null);

    /* renamed from: a */
    public final String f11592a;

    /* renamed from: com.zykj.study.ui.ImageFragmentArgs$a */
    public static final class C7756a {
        public /* synthetic */ C7756a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ImageFragmentArgs m10432a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ImageFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new ImageFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public C7756a() {
        }
    }

    public ImageFragmentArgs(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f11592a = path;
    }

    public static final ImageFragmentArgs fromBundle(Bundle bundle) {
        return f11591b.m10432a(bundle);
    }

    /* renamed from: a */
    public final String m10431a() {
        return this.f11592a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageFragmentArgs) && AbstractC9133u.m16128b(this.f11592a, ((ImageFragmentArgs) obj).f11592a);
    }

    public int hashCode() {
        return this.f11592a.hashCode();
    }

    public String toString() {
        return "ImageFragmentArgs(path=" + this.f11592a + ")";
    }
}
