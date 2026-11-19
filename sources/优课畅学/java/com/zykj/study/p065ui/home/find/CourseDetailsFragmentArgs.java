package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.study.bean.course.CourseSimpleBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseDetailsFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7932a f12528b = new C7932a(null);

    /* renamed from: c */
    public static final int f12529c = 8;

    /* renamed from: a */
    public final CourseSimpleBean f12530a;

    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragmentArgs$a */
    public static final class C7932a {
        public /* synthetic */ C7932a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final CourseDetailsFragmentArgs m11029a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(CourseDetailsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("courseDetails")) {
                throw new IllegalArgumentException("Required argument \"courseDetails\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CourseSimpleBean.class) || Serializable.class.isAssignableFrom(CourseSimpleBean.class)) {
                CourseSimpleBean courseSimpleBean = (CourseSimpleBean) bundle.get("courseDetails");
                if (courseSimpleBean != null) {
                    return new CourseDetailsFragmentArgs(courseSimpleBean);
                }
                throw new IllegalArgumentException("Argument \"courseDetails\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(CourseSimpleBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C7932a() {
        }
    }

    public CourseDetailsFragmentArgs(CourseSimpleBean courseDetails) {
        AbstractC9133u.m16133g(courseDetails, "courseDetails");
        this.f12530a = courseDetails;
    }

    public static final CourseDetailsFragmentArgs fromBundle(Bundle bundle) {
        return f12528b.m11029a(bundle);
    }

    /* renamed from: a */
    public final CourseSimpleBean m11028a() {
        return this.f12530a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CourseDetailsFragmentArgs) && AbstractC9133u.m16128b(this.f12530a, ((CourseDetailsFragmentArgs) obj).f12530a);
    }

    public int hashCode() {
        return this.f12530a.hashCode();
    }

    public String toString() {
        return "CourseDetailsFragmentArgs(courseDetails=" + this.f12530a + ")";
    }
}
