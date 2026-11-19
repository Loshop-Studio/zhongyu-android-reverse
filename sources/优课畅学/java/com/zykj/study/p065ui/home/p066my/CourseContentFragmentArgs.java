package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.bean.course.CourseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseContentFragmentArgs implements NavArgs {

    /* renamed from: f */
    public static final C7990a f12857f = new C7990a(null);

    /* renamed from: g */
    public static final int f12858g = 8;

    /* renamed from: a */
    public final CourseBean f12859a;

    /* renamed from: b */
    public final boolean f12860b;

    /* renamed from: c */
    public final String f12861c;

    /* renamed from: d */
    public final String f12862d;

    /* renamed from: e */
    public final String f12863e;

    /* renamed from: com.zykj.study.ui.home.my.CourseContentFragmentArgs$a */
    public static final class C7990a {
        public /* synthetic */ C7990a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final CourseContentFragmentArgs m11243a(Bundle bundle) {
            String str;
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(CourseContentFragmentArgs.class.getClassLoader());
            String string = "";
            if (bundle.containsKey(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                String string2 = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (string2 == null) {
                    throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
                }
                str = string2;
            } else {
                str = "";
            }
            if (bundle.containsKey("title") && (string = bundle.getString("title")) == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            String str2 = string;
            if (!bundle.containsKey("courseBean")) {
                throw new IllegalArgumentException("Required argument \"courseBean\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CourseBean.class) && !Serializable.class.isAssignableFrom(CourseBean.class)) {
                throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            CourseBean courseBean = (CourseBean) bundle.get("courseBean");
            if (!bundle.containsKey("isAuthor")) {
                throw new IllegalArgumentException("Required argument \"isAuthor\" is missing and does not have an android:defaultValue");
            }
            boolean z10 = bundle.getBoolean("isAuthor");
            if (bundle.containsKey("superviseId")) {
                return new CourseContentFragmentArgs(courseBean, z10, bundle.getString("superviseId"), str, str2);
            }
            throw new IllegalArgumentException("Required argument \"superviseId\" is missing and does not have an android:defaultValue");
        }

        public C7990a() {
        }
    }

    public CourseContentFragmentArgs(CourseBean courseBean, boolean z10, String str, String url, String title) {
        AbstractC9133u.m16133g(url, "url");
        AbstractC9133u.m16133g(title, "title");
        this.f12859a = courseBean;
        this.f12860b = z10;
        this.f12861c = str;
        this.f12862d = url;
        this.f12863e = title;
    }

    public static final CourseContentFragmentArgs fromBundle(Bundle bundle) {
        return f12857f.m11243a(bundle);
    }

    /* renamed from: a */
    public final CourseBean m11238a() {
        return this.f12859a;
    }

    /* renamed from: b */
    public final String m11239b() {
        return this.f12861c;
    }

    /* renamed from: c */
    public final String m11240c() {
        return this.f12863e;
    }

    /* renamed from: d */
    public final String m11241d() {
        return this.f12862d;
    }

    /* renamed from: e */
    public final boolean m11242e() {
        return this.f12860b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseContentFragmentArgs)) {
            return false;
        }
        CourseContentFragmentArgs courseContentFragmentArgs = (CourseContentFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f12859a, courseContentFragmentArgs.f12859a) && this.f12860b == courseContentFragmentArgs.f12860b && AbstractC9133u.m16128b(this.f12861c, courseContentFragmentArgs.f12861c) && AbstractC9133u.m16128b(this.f12862d, courseContentFragmentArgs.f12862d) && AbstractC9133u.m16128b(this.f12863e, courseContentFragmentArgs.f12863e);
    }

    public int hashCode() {
        CourseBean courseBean = this.f12859a;
        int iHashCode = (((courseBean == null ? 0 : courseBean.hashCode()) * 31) + Boolean.hashCode(this.f12860b)) * 31;
        String str = this.f12861c;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f12862d.hashCode()) * 31) + this.f12863e.hashCode();
    }

    public String toString() {
        return "CourseContentFragmentArgs(courseBean=" + this.f12859a + ", isAuthor=" + this.f12860b + ", superviseId=" + this.f12861c + ", url=" + this.f12862d + ", title=" + this.f12863e + ")";
    }
}
