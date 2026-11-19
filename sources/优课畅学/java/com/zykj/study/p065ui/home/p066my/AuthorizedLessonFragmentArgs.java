package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class AuthorizedLessonFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7986a f12806b = new C7986a(null);

    /* renamed from: a */
    public final int f12807a;

    /* renamed from: com.zykj.study.ui.home.my.AuthorizedLessonFragmentArgs$a */
    public static final class C7986a {
        public /* synthetic */ C7986a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AuthorizedLessonFragmentArgs m11209a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(AuthorizedLessonFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("courseId")) {
                return new AuthorizedLessonFragmentArgs(bundle.getInt("courseId"));
            }
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }

        public C7986a() {
        }
    }

    public AuthorizedLessonFragmentArgs(int i10) {
        this.f12807a = i10;
    }

    public static final AuthorizedLessonFragmentArgs fromBundle(Bundle bundle) {
        return f12806b.m11209a(bundle);
    }

    /* renamed from: a */
    public final int m11208a() {
        return this.f12807a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizedLessonFragmentArgs) && this.f12807a == ((AuthorizedLessonFragmentArgs) obj).f12807a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f12807a);
    }

    public String toString() {
        return "AuthorizedLessonFragmentArgs(courseId=" + this.f12807a + ")";
    }
}
