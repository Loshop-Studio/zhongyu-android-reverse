package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.study.bean.course.CourseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TeachDetailsFragmentArgs implements NavArgs {

    /* renamed from: c */
    public static final C8083a f13466c = new C8083a(null);

    /* renamed from: d */
    public static final int f13467d = 8;

    /* renamed from: a */
    public final int f13468a;

    /* renamed from: b */
    public final CourseBean f13469b;

    /* renamed from: com.zykj.study.ui.home.my.TeachDetailsFragmentArgs$a */
    public static final class C8083a {
        public /* synthetic */ C8083a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final TeachDetailsFragmentArgs m11717a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(TeachDetailsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("superviseId")) {
                throw new IllegalArgumentException("Required argument \"superviseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("superviseId");
            if (!bundle.containsKey("courseBean")) {
                throw new IllegalArgumentException("Required argument \"courseBean\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CourseBean.class) || Serializable.class.isAssignableFrom(CourseBean.class)) {
                return new TeachDetailsFragmentArgs(i10, (CourseBean) bundle.get("courseBean"));
            }
            throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C8083a() {
        }
    }

    public TeachDetailsFragmentArgs(int i10, CourseBean courseBean) {
        this.f13468a = i10;
        this.f13469b = courseBean;
    }

    public static final TeachDetailsFragmentArgs fromBundle(Bundle bundle) {
        return f13466c.m11717a(bundle);
    }

    /* renamed from: a */
    public final CourseBean m11715a() {
        return this.f13469b;
    }

    /* renamed from: b */
    public final int m11716b() {
        return this.f13468a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeachDetailsFragmentArgs)) {
            return false;
        }
        TeachDetailsFragmentArgs teachDetailsFragmentArgs = (TeachDetailsFragmentArgs) obj;
        return this.f13468a == teachDetailsFragmentArgs.f13468a && AbstractC9133u.m16128b(this.f13469b, teachDetailsFragmentArgs.f13469b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f13468a) * 31;
        CourseBean courseBean = this.f13469b;
        return iHashCode + (courseBean == null ? 0 : courseBean.hashCode());
    }

    public String toString() {
        return "TeachDetailsFragmentArgs(superviseId=" + this.f13468a + ", courseBean=" + this.f13469b + ")";
    }
}
