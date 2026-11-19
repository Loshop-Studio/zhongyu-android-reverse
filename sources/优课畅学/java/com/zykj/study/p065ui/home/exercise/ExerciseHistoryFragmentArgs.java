package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ExerciseHistoryFragmentArgs implements NavArgs {

    /* renamed from: e */
    public static final C7792a f11827e = new C7792a(null);

    /* renamed from: a */
    public final int f11828a;

    /* renamed from: b */
    public final int f11829b;

    /* renamed from: c */
    public final int f11830c;

    /* renamed from: d */
    public final int f11831d;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragmentArgs$a */
    public static final class C7792a {
        public /* synthetic */ C7792a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseHistoryFragmentArgs m10580a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseHistoryFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("courseId")) {
                throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("courseId");
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (bundle.containsKey("groupId")) {
                return new ExerciseHistoryFragmentArgs(i10, i11, bundle.getInt("groupId"), bundle.containsKey("index") ? bundle.getInt("index") : 0);
            }
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C7792a() {
        }
    }

    public ExerciseHistoryFragmentArgs(int i10, int i11, int i12, int i13) {
        this.f11828a = i10;
        this.f11829b = i11;
        this.f11830c = i12;
        this.f11831d = i13;
    }

    public static final ExerciseHistoryFragmentArgs fromBundle(Bundle bundle) {
        return f11827e.m10580a(bundle);
    }

    /* renamed from: a */
    public final int m10576a() {
        return this.f11829b;
    }

    /* renamed from: b */
    public final int m10577b() {
        return this.f11828a;
    }

    /* renamed from: c */
    public final int m10578c() {
        return this.f11830c;
    }

    /* renamed from: d */
    public final int m10579d() {
        return this.f11831d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseHistoryFragmentArgs)) {
            return false;
        }
        ExerciseHistoryFragmentArgs exerciseHistoryFragmentArgs = (ExerciseHistoryFragmentArgs) obj;
        return this.f11828a == exerciseHistoryFragmentArgs.f11828a && this.f11829b == exerciseHistoryFragmentArgs.f11829b && this.f11830c == exerciseHistoryFragmentArgs.f11830c && this.f11831d == exerciseHistoryFragmentArgs.f11831d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f11828a) * 31) + Integer.hashCode(this.f11829b)) * 31) + Integer.hashCode(this.f11830c)) * 31) + Integer.hashCode(this.f11831d);
    }

    public String toString() {
        return "ExerciseHistoryFragmentArgs(courseId=" + this.f11828a + ", catalogId=" + this.f11829b + ", groupId=" + this.f11830c + ", index=" + this.f11831d + ")";
    }
}
