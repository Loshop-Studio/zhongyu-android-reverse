package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class CourseManageDialogFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7993a f12883b = new C7993a(null);

    /* renamed from: a */
    public final long f12884a;

    /* renamed from: com.zykj.study.ui.home.my.CourseManageDialogFragmentArgs$a */
    public static final class C7993a {
        public /* synthetic */ C7993a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final CourseManageDialogFragmentArgs m11263a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(CourseManageDialogFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("courseId")) {
                return new CourseManageDialogFragmentArgs(bundle.getLong("courseId"));
            }
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }

        public C7993a() {
        }
    }

    public CourseManageDialogFragmentArgs(long j10) {
        this.f12884a = j10;
    }

    public static final CourseManageDialogFragmentArgs fromBundle(Bundle bundle) {
        return f12883b.m11263a(bundle);
    }

    /* renamed from: a */
    public final long m11261a() {
        return this.f12884a;
    }

    /* renamed from: b */
    public final Bundle m11262b() {
        Bundle bundle = new Bundle();
        bundle.putLong("courseId", this.f12884a);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CourseManageDialogFragmentArgs) && this.f12884a == ((CourseManageDialogFragmentArgs) obj).f12884a;
    }

    public int hashCode() {
        return Long.hashCode(this.f12884a);
    }

    public String toString() {
        return "CourseManageDialogFragmentArgs(courseId=" + this.f12884a + ")";
    }
}
