package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class StudentExercisesFragmentArgs implements NavArgs {

    /* renamed from: f */
    public static final C8064a f13341f = new C8064a(null);

    /* renamed from: a */
    public final int f13342a;

    /* renamed from: b */
    public final String f13343b;

    /* renamed from: c */
    public final int f13344c;

    /* renamed from: d */
    public final String f13345d;

    /* renamed from: e */
    public final boolean f13346e;

    /* renamed from: com.zykj.study.ui.home.my.StudentExercisesFragmentArgs$a */
    public static final class C8064a {
        public /* synthetic */ C8064a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final StudentExercisesFragmentArgs m11618a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(StudentExercisesFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("superviseId")) {
                throw new IllegalArgumentException("Required argument \"superviseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("superviseId");
            if (!bundle.containsKey("title")) {
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (!bundle.containsKey("userId")) {
                throw new IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("userId");
            if (string2 != null) {
                return new StudentExercisesFragmentArgs(i10, string, i11, string2, bundle.containsKey("fromScore") ? bundle.getBoolean("fromScore") : false);
            }
            throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
        }

        public C8064a() {
        }
    }

    public StudentExercisesFragmentArgs(int i10, String title, int i11, String userId, boolean z10) {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(userId, "userId");
        this.f13342a = i10;
        this.f13343b = title;
        this.f13344c = i11;
        this.f13345d = userId;
        this.f13346e = z10;
    }

    public static final StudentExercisesFragmentArgs fromBundle(Bundle bundle) {
        return f13341f.m11618a(bundle);
    }

    /* renamed from: a */
    public final int m11613a() {
        return this.f13344c;
    }

    /* renamed from: b */
    public final boolean m11614b() {
        return this.f13346e;
    }

    /* renamed from: c */
    public final int m11615c() {
        return this.f13342a;
    }

    /* renamed from: d */
    public final String m11616d() {
        return this.f13343b;
    }

    /* renamed from: e */
    public final String m11617e() {
        return this.f13345d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudentExercisesFragmentArgs)) {
            return false;
        }
        StudentExercisesFragmentArgs studentExercisesFragmentArgs = (StudentExercisesFragmentArgs) obj;
        return this.f13342a == studentExercisesFragmentArgs.f13342a && AbstractC9133u.m16128b(this.f13343b, studentExercisesFragmentArgs.f13343b) && this.f13344c == studentExercisesFragmentArgs.f13344c && AbstractC9133u.m16128b(this.f13345d, studentExercisesFragmentArgs.f13345d) && this.f13346e == studentExercisesFragmentArgs.f13346e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f13342a) * 31) + this.f13343b.hashCode()) * 31) + Integer.hashCode(this.f13344c)) * 31) + this.f13345d.hashCode()) * 31) + Boolean.hashCode(this.f13346e);
    }

    public String toString() {
        return "StudentExercisesFragmentArgs(superviseId=" + this.f13342a + ", title=" + this.f13343b + ", catalogId=" + this.f13344c + ", userId=" + this.f13345d + ", fromScore=" + this.f13346e + ")";
    }
}
