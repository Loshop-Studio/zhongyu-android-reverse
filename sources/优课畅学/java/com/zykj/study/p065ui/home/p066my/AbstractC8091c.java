package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.my.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8091c {

    /* renamed from: a */
    public static final f f13511a = new f(null);

    /* renamed from: com.zykj.study.ui.home.my.c$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final int f13512a;

        /* renamed from: b */
        public final int f13513b;

        /* renamed from: c */
        public final int f13514c;

        /* renamed from: d */
        public final int f13515d = R$id.action_courseContentFragment_to_exerciseStatisticsFragment;

        public a(int i10, int i11, int i12) {
            this.f13512a = i10;
            this.f13513b = i11;
            this.f13514c = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13512a == aVar.f13512a && this.f13513b == aVar.f13513b && this.f13514c == aVar.f13514c;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13515d;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("superviseId", this.f13512a);
            bundle.putInt("catalogId", this.f13513b);
            bundle.putInt("groupId", this.f13514c);
            return bundle;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f13512a) * 31) + Integer.hashCode(this.f13513b)) * 31) + Integer.hashCode(this.f13514c);
        }

        public String toString() {
            return "ActionCourseContentFragmentToExerciseStatisticsFragment(superviseId=" + this.f13512a + ", catalogId=" + this.f13513b + ", groupId=" + this.f13514c + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.c$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final int f13516a;

        /* renamed from: b */
        public final int f13517b;

        /* renamed from: c */
        public final int f13518c;

        /* renamed from: d */
        public final int f13519d;

        /* renamed from: e */
        public final boolean f13520e;

        /* renamed from: f */
        public final int f13521f = R$id.action_courseContentFragment_to_exerciseViewerFragment;

        public b(int i10, int i11, int i12, int i13, boolean z10) {
            this.f13516a = i10;
            this.f13517b = i11;
            this.f13518c = i12;
            this.f13519d = i13;
            this.f13520e = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13516a == bVar.f13516a && this.f13517b == bVar.f13517b && this.f13518c == bVar.f13518c && this.f13519d == bVar.f13519d && this.f13520e == bVar.f13520e;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13521f;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f13516a);
            bundle.putInt("catalogId", this.f13517b);
            bundle.putInt("groupId", this.f13518c);
            bundle.putInt("index", this.f13519d);
            bundle.putBoolean("isAuthor", this.f13520e);
            return bundle;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f13516a) * 31) + Integer.hashCode(this.f13517b)) * 31) + Integer.hashCode(this.f13518c)) * 31) + Integer.hashCode(this.f13519d)) * 31) + Boolean.hashCode(this.f13520e);
        }

        public String toString() {
            return "ActionCourseContentFragmentToExerciseViewerFragment(courseId=" + this.f13516a + ", catalogId=" + this.f13517b + ", groupId=" + this.f13518c + ", index=" + this.f13519d + ", isAuthor=" + this.f13520e + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.c$c */
    public static final class c implements NavDirections {

        /* renamed from: a */
        public final String f13522a;

        /* renamed from: b */
        public final int f13523b;

        public c(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f13522a = path;
            this.f13523b = R$id.action_courseContentFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC9133u.m16128b(this.f13522a, ((c) obj).f13522a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13523b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f13522a);
            return bundle;
        }

        public int hashCode() {
            return this.f13522a.hashCode();
        }

        public String toString() {
            return "ActionCourseContentFragmentToMicroPlayFragment(path=" + this.f13522a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.c$d */
    public static final class d implements NavDirections {

        /* renamed from: a */
        public final int f13524a;

        /* renamed from: b */
        public final int f13525b;

        /* renamed from: c */
        public final int f13526c;

        /* renamed from: d */
        public final int f13527d;

        /* renamed from: e */
        public final int f13528e = R$id.action_courseContentFragment_to_nav_exercise;

        public d(int i10, int i11, int i12, int i13) {
            this.f13524a = i10;
            this.f13525b = i11;
            this.f13526c = i12;
            this.f13527d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f13524a == dVar.f13524a && this.f13525b == dVar.f13525b && this.f13526c == dVar.f13526c && this.f13527d == dVar.f13527d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13528e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f13524a);
            bundle.putInt("catalogId", this.f13525b);
            bundle.putInt("groupId", this.f13526c);
            bundle.putInt(NotificationCompat.CATEGORY_STATUS, this.f13527d);
            return bundle;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f13524a) * 31) + Integer.hashCode(this.f13525b)) * 31) + Integer.hashCode(this.f13526c)) * 31) + Integer.hashCode(this.f13527d);
        }

        public String toString() {
            return "ActionCourseContentFragmentToNavExercise(courseId=" + this.f13524a + ", catalogId=" + this.f13525b + ", groupId=" + this.f13526c + ", status=" + this.f13527d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.c$e */
    public static final class e implements NavDirections {

        /* renamed from: a */
        public final String f13529a;

        /* renamed from: b */
        public final int f13530b;

        public e(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f13529a = path;
            this.f13530b = R$id.action_courseContentFragment_to_openFileFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC9133u.m16128b(this.f13529a, ((e) obj).f13529a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13530b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f13529a);
            return bundle;
        }

        public int hashCode() {
            return this.f13529a.hashCode();
        }

        public String toString() {
            return "ActionCourseContentFragmentToOpenFileFragment(path=" + this.f13529a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.c$f */
    public static final class f {
        public /* synthetic */ f(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11746a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        /* renamed from: b */
        public final NavDirections m11747b(int i10, int i11, int i12, int i13, boolean z10) {
            return new b(i10, i11, i12, i13, z10);
        }

        /* renamed from: c */
        public final NavDirections m11748c(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new c(path);
        }

        /* renamed from: d */
        public final NavDirections m11749d(int i10, int i11, int i12, int i13) {
            return new d(i10, i11, i12, i13);
        }

        /* renamed from: e */
        public final NavDirections m11750e(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new e(path);
        }

        public f() {
        }
    }
}
