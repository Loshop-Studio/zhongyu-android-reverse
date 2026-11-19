package com.zykj.study.p065ui.home.find.search;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseSimpleBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.find.search.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7979a {

    /* renamed from: a */
    public static final b f12777a = new b(null);

    /* renamed from: com.zykj.study.ui.home.find.search.a$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final CourseSimpleBean f12778a;

        /* renamed from: b */
        public final int f12779b;

        public a(CourseSimpleBean courseDetails) {
            AbstractC9133u.m16133g(courseDetails, "courseDetails");
            this.f12778a = courseDetails;
            this.f12779b = R$id.action_searchFragment_to_courseDetailsFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f12778a, ((a) obj).f12778a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12779b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CourseSimpleBean.class)) {
                CourseSimpleBean courseSimpleBean = this.f12778a;
                AbstractC9133u.m16131e(courseSimpleBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("courseDetails", courseSimpleBean);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(CourseSimpleBean.class)) {
                Parcelable parcelable = this.f12778a;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("courseDetails", (Serializable) parcelable);
                return bundle;
            }
            throw new UnsupportedOperationException(CourseSimpleBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            return this.f12778a.hashCode();
        }

        public String toString() {
            return "ActionSearchFragmentToCourseDetailsFragment(courseDetails=" + this.f12778a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.search.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11184a(CourseSimpleBean courseDetails) {
            AbstractC9133u.m16133g(courseDetails, "courseDetails");
            return new a(courseDetails);
        }

        public b() {
        }
    }
}
