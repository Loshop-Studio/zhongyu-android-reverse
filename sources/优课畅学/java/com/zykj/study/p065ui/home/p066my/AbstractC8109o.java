package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.my.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8109o {

    /* renamed from: a */
    public static final c f13580a = new c(null);

    /* renamed from: com.zykj.study.ui.home.my.o$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final CourseBean f13581a;

        /* renamed from: b */
        public final boolean f13582b;

        /* renamed from: c */
        public final String f13583c;

        /* renamed from: d */
        public final String f13584d;

        /* renamed from: e */
        public final String f13585e;

        /* renamed from: f */
        public final int f13586f;

        public a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            this.f13581a = courseBean;
            this.f13582b = z10;
            this.f13583c = str;
            this.f13584d = url;
            this.f13585e = title;
            this.f13586f = R$id.action_teachDetailsFragment_to_courseContentFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f13581a, aVar.f13581a) && this.f13582b == aVar.f13582b && AbstractC9133u.m16128b(this.f13583c, aVar.f13583c) && AbstractC9133u.m16128b(this.f13584d, aVar.f13584d) && AbstractC9133u.m16128b(this.f13585e, aVar.f13585e);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13586f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f13584d);
            bundle.putString("title", this.f13585e);
            if (Parcelable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putParcelable("courseBean", this.f13581a);
            } else {
                if (!Serializable.class.isAssignableFrom(CourseBean.class)) {
                    throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("courseBean", (Serializable) this.f13581a);
            }
            bundle.putBoolean("isAuthor", this.f13582b);
            bundle.putString("superviseId", this.f13583c);
            return bundle;
        }

        public int hashCode() {
            CourseBean courseBean = this.f13581a;
            int iHashCode = (((courseBean == null ? 0 : courseBean.hashCode()) * 31) + Boolean.hashCode(this.f13582b)) * 31;
            String str = this.f13583c;
            return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13584d.hashCode()) * 31) + this.f13585e.hashCode();
        }

        public String toString() {
            return "ActionTeachDetailsFragmentToCourseContentFragment(courseBean=" + this.f13581a + ", isAuthor=" + this.f13582b + ", superviseId=" + this.f13583c + ", url=" + this.f13584d + ", title=" + this.f13585e + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.o$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final int f13587a;

        /* renamed from: b */
        public final String f13588b;

        /* renamed from: c */
        public final int f13589c;

        /* renamed from: d */
        public final String f13590d;

        /* renamed from: e */
        public final boolean f13591e;

        /* renamed from: f */
        public final int f13592f;

        public b(int i10, String title, int i11, String userId, boolean z10) {
            AbstractC9133u.m16133g(title, "title");
            AbstractC9133u.m16133g(userId, "userId");
            this.f13587a = i10;
            this.f13588b = title;
            this.f13589c = i11;
            this.f13590d = userId;
            this.f13591e = z10;
            this.f13592f = R$id.action_teachDetailsFragment_to_studentExercisesFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13587a == bVar.f13587a && AbstractC9133u.m16128b(this.f13588b, bVar.f13588b) && this.f13589c == bVar.f13589c && AbstractC9133u.m16128b(this.f13590d, bVar.f13590d) && this.f13591e == bVar.f13591e;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13592f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("superviseId", this.f13587a);
            bundle.putString("title", this.f13588b);
            bundle.putInt("catalogId", this.f13589c);
            bundle.putString("userId", this.f13590d);
            bundle.putBoolean("fromScore", this.f13591e);
            return bundle;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f13587a) * 31) + this.f13588b.hashCode()) * 31) + Integer.hashCode(this.f13589c)) * 31) + this.f13590d.hashCode()) * 31) + Boolean.hashCode(this.f13591e);
        }

        public String toString() {
            return "ActionTeachDetailsFragmentToStudentExercisesFragment(superviseId=" + this.f13587a + ", title=" + this.f13588b + ", catalogId=" + this.f13589c + ", userId=" + this.f13590d + ", fromScore=" + this.f13591e + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.o$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ NavDirections m11806c(c cVar, int i10, String str, int i11, String str2, boolean z10, int i12, Object obj) {
            if ((i12 & 16) != 0) {
                z10 = false;
            }
            return cVar.m11808b(i10, str, i11, str2, z10);
        }

        /* renamed from: a */
        public final NavDirections m11807a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            return new a(courseBean, z10, str, url, title);
        }

        /* renamed from: b */
        public final NavDirections m11808b(int i10, String title, int i11, String userId, boolean z10) {
            AbstractC9133u.m16133g(title, "title");
            AbstractC9133u.m16133g(userId, "userId");
            return new b(i10, title, i11, userId, z10);
        }

        public c() {
        }
    }
}
