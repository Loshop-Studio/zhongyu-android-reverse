package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CourseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.find.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7956b {

    /* renamed from: a */
    public static final b f12672a = new b(null);

    /* renamed from: com.zykj.study.ui.home.find.b$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final CourseBean f12673a;

        /* renamed from: b */
        public final boolean f12674b;

        /* renamed from: c */
        public final String f12675c;

        /* renamed from: d */
        public final String f12676d;

        /* renamed from: e */
        public final String f12677e;

        /* renamed from: f */
        public final int f12678f;

        public a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            this.f12673a = courseBean;
            this.f12674b = z10;
            this.f12675c = str;
            this.f12676d = url;
            this.f12677e = title;
            this.f12678f = R$id.action_courseDetailsFragment_to_courseContentFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f12673a, aVar.f12673a) && this.f12674b == aVar.f12674b && AbstractC9133u.m16128b(this.f12675c, aVar.f12675c) && AbstractC9133u.m16128b(this.f12676d, aVar.f12676d) && AbstractC9133u.m16128b(this.f12677e, aVar.f12677e);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12678f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f12676d);
            bundle.putString("title", this.f12677e);
            if (Parcelable.class.isAssignableFrom(CourseBean.class)) {
                bundle.putParcelable("courseBean", this.f12673a);
            } else {
                if (!Serializable.class.isAssignableFrom(CourseBean.class)) {
                    throw new UnsupportedOperationException(CourseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("courseBean", (Serializable) this.f12673a);
            }
            bundle.putBoolean("isAuthor", this.f12674b);
            bundle.putString("superviseId", this.f12675c);
            return bundle;
        }

        public int hashCode() {
            CourseBean courseBean = this.f12673a;
            int iHashCode = (((courseBean == null ? 0 : courseBean.hashCode()) * 31) + Boolean.hashCode(this.f12674b)) * 31;
            String str = this.f12675c;
            return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f12676d.hashCode()) * 31) + this.f12677e.hashCode();
        }

        public String toString() {
            return "ActionCourseDetailsFragmentToCourseContentFragment(courseBean=" + this.f12673a + ", isAuthor=" + this.f12674b + ", superviseId=" + this.f12675c + ", url=" + this.f12676d + ", title=" + this.f12677e + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.b$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11142a(CourseBean courseBean, boolean z10, String str, String url, String title) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(title, "title");
            return new a(courseBean, z10, str, url, title);
        }

        public b() {
        }
    }
}
