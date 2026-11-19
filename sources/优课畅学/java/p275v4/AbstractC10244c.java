package p275v4;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.lib.ota.bean.AppType;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.data.MyCourseEntity;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: v4.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10244c {

    /* renamed from: a */
    public static final h f20434a = new h(null);

    /* renamed from: v4.c$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final CourseBean f20435a;

        /* renamed from: b */
        public final boolean f20436b;

        /* renamed from: c */
        public final String f20437c;

        /* renamed from: d */
        public final String f20438d;

        /* renamed from: e */
        public final String f20439e;

        /* renamed from: f */
        public final int f20440f;

        public a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            this.f20435a = courseBean;
            this.f20436b = z10;
            this.f20437c = str;
            this.f20438d = url;
            this.f20439e = title;
            this.f20440f = R$id.action_homeFragment_to_courseContentFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f20435a, aVar.f20435a) && this.f20436b == aVar.f20436b && AbstractC9133u.m16128b(this.f20437c, aVar.f20437c) && AbstractC9133u.m16128b(this.f20438d, aVar.f20438d) && AbstractC9133u.m16128b(this.f20439e, aVar.f20439e);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20440f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f20438d);
            bundle.putString("title", this.f20439e);
            if (Parcelable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putParcelable("courseBean", this.f20435a);
            } else {
                if (!Serializable.class.isAssignableFrom(CourseBean.class)) {
                    throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("courseBean", (Serializable) this.f20435a);
            }
            bundle.putBoolean("isAuthor", this.f20436b);
            bundle.putString("superviseId", this.f20437c);
            return bundle;
        }

        public int hashCode() {
            CourseBean courseBean = this.f20435a;
            int iHashCode = (((courseBean == null ? 0 : courseBean.hashCode()) * 31) + Boolean.hashCode(this.f20436b)) * 31;
            String str = this.f20437c;
            return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f20438d.hashCode()) * 31) + this.f20439e.hashCode();
        }

        public String toString() {
            return "ActionHomeFragmentToCourseContentFragment(courseBean=" + this.f20435a + ", isAuthor=" + this.f20436b + ", superviseId=" + this.f20437c + ", url=" + this.f20438d + ", title=" + this.f20439e + ")";
        }
    }

    /* renamed from: v4.c$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final CourseSimpleBean f20441a;

        /* renamed from: b */
        public final int f20442b;

        public b(CourseSimpleBean courseDetails) {
            AbstractC9133u.m16133g(courseDetails, "courseDetails");
            this.f20441a = courseDetails;
            this.f20442b = R$id.action_homeFragment_to_courseDetailsFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f20441a, ((b) obj).f20441a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20442b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CourseSimpleBean.class)) {
                CourseSimpleBean courseSimpleBean = this.f20441a;
                AbstractC9133u.m16131e(courseSimpleBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("courseDetails", courseSimpleBean);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(CourseSimpleBean.class)) {
                Parcelable parcelable = this.f20441a;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("courseDetails", (Serializable) parcelable);
                return bundle;
            }
            throw new UnsupportedOperationException(CourseSimpleBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            return this.f20441a.hashCode();
        }

        public String toString() {
            return "ActionHomeFragmentToCourseDetailsFragment(courseDetails=" + this.f20441a + ")";
        }
    }

    /* renamed from: v4.c$c */
    public static final class c implements NavDirections {

        /* renamed from: a */
        public final MyCourseEntity f20443a;

        /* renamed from: b */
        public final int f20444b = R$id.action_homeFragment_to_editCourseFragment;

        public c(MyCourseEntity myCourseEntity) {
            this.f20443a = myCourseEntity;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC9133u.m16128b(this.f20443a, ((c) obj).f20443a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20444b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(MyCourseEntity.class)) {
                bundle.putParcelable("myCourseEntity", this.f20443a);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(MyCourseEntity.class)) {
                bundle.putSerializable("myCourseEntity", (Serializable) this.f20443a);
                return bundle;
            }
            throw new UnsupportedOperationException(MyCourseEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            MyCourseEntity myCourseEntity = this.f20443a;
            if (myCourseEntity == null) {
                return 0;
            }
            return myCourseEntity.hashCode();
        }

        public String toString() {
            return "ActionHomeFragmentToEditCourseFragment(myCourseEntity=" + this.f20443a + ")";
        }
    }

    /* renamed from: v4.c$d */
    public static final class d implements NavDirections {

        /* renamed from: a */
        public final String f20445a;

        /* renamed from: b */
        public final String f20446b;

        /* renamed from: c */
        public final int f20447c;

        public d(String code, String path) {
            AbstractC9133u.m16133g(code, "code");
            AbstractC9133u.m16133g(path, "path");
            this.f20445a = code;
            this.f20446b = path;
            this.f20447c = R$id.action_homeFragment_to_microCodeFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC9133u.m16128b(this.f20445a, dVar.f20445a) && AbstractC9133u.m16128b(this.f20446b, dVar.f20446b);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20447c;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("code", this.f20445a);
            bundle.putString("path", this.f20446b);
            return bundle;
        }

        public int hashCode() {
            return (this.f20445a.hashCode() * 31) + this.f20446b.hashCode();
        }

        public String toString() {
            return "ActionHomeFragmentToMicroCodeFragment(code=" + this.f20445a + ", path=" + this.f20446b + ")";
        }
    }

    /* renamed from: v4.c$e */
    public static final class e implements NavDirections {

        /* renamed from: a */
        public final MyCourseEntity f20448a;

        /* renamed from: b */
        public final int f20449b;

        public e(MyCourseEntity myCourse) {
            AbstractC9133u.m16133g(myCourse, "myCourse");
            this.f20448a = myCourse;
            this.f20449b = R$id.action_homeFragment_to_myCourseDetailsFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC9133u.m16128b(this.f20448a, ((e) obj).f20448a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20449b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(MyCourseEntity.class)) {
                MyCourseEntity myCourseEntity = this.f20448a;
                AbstractC9133u.m16131e(myCourseEntity, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("myCourse", myCourseEntity);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(MyCourseEntity.class)) {
                Parcelable parcelable = this.f20448a;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("myCourse", (Serializable) parcelable);
                return bundle;
            }
            throw new UnsupportedOperationException(MyCourseEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            return this.f20448a.hashCode();
        }

        public String toString() {
            return "ActionHomeFragmentToMyCourseDetailsFragment(myCourse=" + this.f20448a + ")";
        }
    }

    /* renamed from: v4.c$f */
    public static final class f implements NavDirections {

        /* renamed from: a */
        public final String f20450a;

        /* renamed from: b */
        public final int f20451b;

        /* renamed from: c */
        public final String f20452c;

        /* renamed from: d */
        public final AppType f20453d;

        /* renamed from: e */
        public final boolean f20454e;

        /* renamed from: f */
        public final int f20455f;

        public f(String packageName, int i10, String versionName, AppType appType, boolean z10) {
            AbstractC9133u.m16133g(packageName, "packageName");
            AbstractC9133u.m16133g(versionName, "versionName");
            AbstractC9133u.m16133g(appType, "appType");
            this.f20450a = packageName;
            this.f20451b = i10;
            this.f20452c = versionName;
            this.f20453d = appType;
            this.f20454e = z10;
            this.f20455f = R$id.action_homeFragment_to_nav_version_check;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC9133u.m16128b(this.f20450a, fVar.f20450a) && this.f20451b == fVar.f20451b && AbstractC9133u.m16128b(this.f20452c, fVar.f20452c) && this.f20453d == fVar.f20453d && this.f20454e == fVar.f20454e;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20455f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", this.f20450a);
            bundle.putInt("versionCode", this.f20451b);
            bundle.putString("versionName", this.f20452c);
            if (Parcelable.class.isAssignableFrom(AppType.class)) {
                Object obj = this.f20453d;
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("appType", (Parcelable) obj);
            } else {
                if (!Serializable.class.isAssignableFrom(AppType.class)) {
                    throw new UnsupportedOperationException(AppType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                AppType appType = this.f20453d;
                AbstractC9133u.m16131e(appType, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("appType", appType);
            }
            bundle.putBoolean("silence", this.f20454e);
            return bundle;
        }

        public int hashCode() {
            return (((((((this.f20450a.hashCode() * 31) + Integer.hashCode(this.f20451b)) * 31) + this.f20452c.hashCode()) * 31) + this.f20453d.hashCode()) * 31) + Boolean.hashCode(this.f20454e);
        }

        public String toString() {
            return "ActionHomeFragmentToNavVersionCheck(packageName=" + this.f20450a + ", versionCode=" + this.f20451b + ", versionName=" + this.f20452c + ", appType=" + this.f20453d + ", silence=" + this.f20454e + ")";
        }
    }

    /* renamed from: v4.c$g */
    public static final class g implements NavDirections {

        /* renamed from: a */
        public final int f20456a;

        /* renamed from: b */
        public final CourseBean f20457b;

        /* renamed from: c */
        public final int f20458c = R$id.action_homeFragment_to_teachDetailsFragment;

        public g(int i10, CourseBean courseBean) {
            this.f20456a = i10;
            this.f20457b = courseBean;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f20456a == gVar.f20456a && AbstractC9133u.m16128b(this.f20457b, gVar.f20457b);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f20458c;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("superviseId", this.f20456a);
            if (Parcelable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putParcelable("courseBean", this.f20457b);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putSerializable("courseBean", (Serializable) this.f20457b);
                return bundle;
            }
            throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f20456a) * 31;
            CourseBean courseBean = this.f20457b;
            return iHashCode + (courseBean == null ? 0 : courseBean.hashCode());
        }

        public String toString() {
            return "ActionHomeFragmentToTeachDetailsFragment(superviseId=" + this.f20456a + ", courseBean=" + this.f20457b + ")";
        }
    }

    /* renamed from: v4.c$h */
    public static final class h {
        public /* synthetic */ h(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m19158a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            return new a(courseBean, z10, str, url, title);
        }

        /* renamed from: b */
        public final NavDirections m19159b(CourseSimpleBean courseDetails) {
            AbstractC9133u.m16133g(courseDetails, "courseDetails");
            return new b(courseDetails);
        }

        /* renamed from: c */
        public final NavDirections m19160c(MyCourseEntity myCourseEntity) {
            return new c(myCourseEntity);
        }

        /* renamed from: d */
        public final NavDirections m19161d(String code, String path) {
            AbstractC9133u.m16133g(code, "code");
            AbstractC9133u.m16133g(path, "path");
            return new d(code, path);
        }

        /* renamed from: e */
        public final NavDirections m19162e(MyCourseEntity myCourse) {
            AbstractC9133u.m16133g(myCourse, "myCourse");
            return new e(myCourse);
        }

        /* renamed from: f */
        public final NavDirections m19163f() {
            return new ActionOnlyNavDirections(R$id.action_homeFragment_to_nav_qr_code);
        }

        /* renamed from: g */
        public final NavDirections m19164g(String packageName, int i10, String versionName, AppType appType, boolean z10) {
            AbstractC9133u.m16133g(packageName, "packageName");
            AbstractC9133u.m16133g(versionName, "versionName");
            AbstractC9133u.m16133g(appType, "appType");
            return new f(packageName, i10, versionName, appType, z10);
        }

        /* renamed from: h */
        public final NavDirections m19165h() {
            return new ActionOnlyNavDirections(R$id.action_homeFragment_to_searchFragment);
        }

        /* renamed from: i */
        public final NavDirections m19166i(int i10, CourseBean courseBean) {
            return new g(i10, courseBean);
        }

        public h() {
        }
    }
}
