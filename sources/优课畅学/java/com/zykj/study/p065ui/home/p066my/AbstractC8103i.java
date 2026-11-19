package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.data.MyCourseEntity;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.my.i */
/* loaded from: classes5.dex */
public abstract class AbstractC8103i {

    /* renamed from: a */
    public static final e f13562a = new e(null);

    /* renamed from: com.zykj.study.ui.home.my.i$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final int f13563a;

        /* renamed from: b */
        public final int f13564b = R$id.action_myCourseDetailsFragment_to_authorizedLessonFragment;

        public a(int i10) {
            this.f13563a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13563a == ((a) obj).f13563a;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13564b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f13563a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f13563a);
        }

        public String toString() {
            return "ActionMyCourseDetailsFragmentToAuthorizedLessonFragment(courseId=" + this.f13563a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.i$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final CourseBean f13565a;

        /* renamed from: b */
        public final boolean f13566b;

        /* renamed from: c */
        public final String f13567c;

        /* renamed from: d */
        public final String f13568d;

        /* renamed from: e */
        public final String f13569e;

        /* renamed from: f */
        public final int f13570f;

        public b(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            this.f13565a = courseBean;
            this.f13566b = z10;
            this.f13567c = str;
            this.f13568d = url;
            this.f13569e = title;
            this.f13570f = R$id.action_myCourseDetailsFragment_to_courseContentFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC9133u.m16128b(this.f13565a, bVar.f13565a) && this.f13566b == bVar.f13566b && AbstractC9133u.m16128b(this.f13567c, bVar.f13567c) && AbstractC9133u.m16128b(this.f13568d, bVar.f13568d) && AbstractC9133u.m16128b(this.f13569e, bVar.f13569e);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13570f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f13568d);
            bundle.putString("title", this.f13569e);
            if (Parcelable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putParcelable("courseBean", this.f13565a);
            } else {
                if (!Serializable.class.isAssignableFrom(CourseBean.class)) {
                    throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("courseBean", (Serializable) this.f13565a);
            }
            bundle.putBoolean("isAuthor", this.f13566b);
            bundle.putString("superviseId", this.f13567c);
            return bundle;
        }

        public int hashCode() {
            CourseBean courseBean = this.f13565a;
            int iHashCode = (((courseBean == null ? 0 : courseBean.hashCode()) * 31) + Boolean.hashCode(this.f13566b)) * 31;
            String str = this.f13567c;
            return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13568d.hashCode()) * 31) + this.f13569e.hashCode();
        }

        public String toString() {
            return "ActionMyCourseDetailsFragmentToCourseContentFragment(courseBean=" + this.f13565a + ", isAuthor=" + this.f13566b + ", superviseId=" + this.f13567c + ", url=" + this.f13568d + ", title=" + this.f13569e + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.i$c */
    public static final class c implements NavDirections {

        /* renamed from: a */
        public final MyCourseEntity f13571a;

        /* renamed from: b */
        public final int f13572b = R$id.action_myCourseDetailsFragment_to_editCourseFragment;

        public c(MyCourseEntity myCourseEntity) {
            this.f13571a = myCourseEntity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC9133u.m16128b(this.f13571a, ((c) obj).f13571a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13572b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(MyCourseEntity.class)) {
                bundle.putParcelable("myCourseEntity", this.f13571a);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(MyCourseEntity.class)) {
                bundle.putSerializable("myCourseEntity", (Serializable) this.f13571a);
                return bundle;
            }
            throw new UnsupportedOperationException(MyCourseEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            MyCourseEntity myCourseEntity = this.f13571a;
            if (myCourseEntity == null) {
                return 0;
            }
            return myCourseEntity.hashCode();
        }

        public String toString() {
            return "ActionMyCourseDetailsFragmentToEditCourseFragment(myCourseEntity=" + this.f13571a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.i$d */
    public static final class d implements NavDirections {

        /* renamed from: a */
        public final int f13573a;

        /* renamed from: b */
        public final int f13574b = R$id.action_myCourseDetailsFragment_to_managementSubscribeFragment;

        public d(int i10) {
            this.f13573a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f13573a == ((d) obj).f13573a;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13574b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f13573a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f13573a);
        }

        public String toString() {
            return "ActionMyCourseDetailsFragmentToManagementSubscribeFragment(courseId=" + this.f13573a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.i$e */
    public static final class e {
        public /* synthetic */ e(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11802a(int i10) {
            return new a(i10);
        }

        /* renamed from: b */
        public final NavDirections m11803b(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            return new b(courseBean, z10, str, url, title);
        }

        /* renamed from: c */
        public final NavDirections m11804c(MyCourseEntity myCourseEntity) {
            return new c(myCourseEntity);
        }

        /* renamed from: d */
        public final NavDirections m11805d(int i10) {
            return new d(i10);
        }

        public e() {
        }
    }
}
