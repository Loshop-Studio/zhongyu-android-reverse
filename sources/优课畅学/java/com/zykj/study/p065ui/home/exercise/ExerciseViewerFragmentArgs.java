package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ExerciseViewerFragmentArgs implements NavArgs {

    /* renamed from: f */
    public static final C7824a f11972f = new C7824a(null);

    /* renamed from: a */
    public final int f11973a;

    /* renamed from: b */
    public final int f11974b;

    /* renamed from: c */
    public final int f11975c;

    /* renamed from: d */
    public final int f11976d;

    /* renamed from: e */
    public final boolean f11977e;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragmentArgs$a */
    public static final class C7824a {
        public /* synthetic */ C7824a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseViewerFragmentArgs m10705a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseViewerFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("courseId")) {
                throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("courseId");
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (bundle.containsKey("groupId")) {
                return new ExerciseViewerFragmentArgs(i10, i11, bundle.getInt("groupId"), bundle.containsKey("index") ? bundle.getInt("index") : 0, bundle.containsKey("isAuthor") ? bundle.getBoolean("isAuthor") : false);
            }
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C7824a() {
        }
    }

    public ExerciseViewerFragmentArgs(int i10, int i11, int i12, int i13, boolean z10) {
        this.f11973a = i10;
        this.f11974b = i11;
        this.f11975c = i12;
        this.f11976d = i13;
        this.f11977e = z10;
    }

    public static final ExerciseViewerFragmentArgs fromBundle(Bundle bundle) {
        return f11972f.m10705a(bundle);
    }

    /* renamed from: a */
    public final int m10702a() {
        return this.f11975c;
    }

    /* renamed from: b */
    public final int m10703b() {
        return this.f11976d;
    }

    /* renamed from: c */
    public final boolean m10704c() {
        return this.f11977e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseViewerFragmentArgs)) {
            return false;
        }
        ExerciseViewerFragmentArgs exerciseViewerFragmentArgs = (ExerciseViewerFragmentArgs) obj;
        return this.f11973a == exerciseViewerFragmentArgs.f11973a && this.f11974b == exerciseViewerFragmentArgs.f11974b && this.f11975c == exerciseViewerFragmentArgs.f11975c && this.f11976d == exerciseViewerFragmentArgs.f11976d && this.f11977e == exerciseViewerFragmentArgs.f11977e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f11973a) * 31) + Integer.hashCode(this.f11974b)) * 31) + Integer.hashCode(this.f11975c)) * 31) + Integer.hashCode(this.f11976d)) * 31) + Boolean.hashCode(this.f11977e);
    }

    public String toString() {
        return "ExerciseViewerFragmentArgs(courseId=" + this.f11973a + ", catalogId=" + this.f11974b + ", groupId=" + this.f11975c + ", index=" + this.f11976d + ", isAuthor=" + this.f11977e + ")";
    }
}
