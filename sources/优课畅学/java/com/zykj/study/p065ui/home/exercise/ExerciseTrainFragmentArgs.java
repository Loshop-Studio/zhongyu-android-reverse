package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ExerciseTrainFragmentArgs implements NavArgs {

    /* renamed from: d */
    public static final C7815a f11909d = new C7815a(null);

    /* renamed from: a */
    public final int f11910a;

    /* renamed from: b */
    public final int f11911b;

    /* renamed from: c */
    public final int f11912c;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseTrainFragmentArgs$a */
    public static final class C7815a {
        public /* synthetic */ C7815a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseTrainFragmentArgs m10649a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseTrainFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("courseId")) {
                throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("courseId");
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (bundle.containsKey("groupId")) {
                return new ExerciseTrainFragmentArgs(i10, i11, bundle.getInt("groupId"));
            }
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C7815a() {
        }
    }

    public ExerciseTrainFragmentArgs(int i10, int i11, int i12) {
        this.f11910a = i10;
        this.f11911b = i11;
        this.f11912c = i12;
    }

    public static final ExerciseTrainFragmentArgs fromBundle(Bundle bundle) {
        return f11909d.m10649a(bundle);
    }

    /* renamed from: a */
    public final int m10646a() {
        return this.f11911b;
    }

    /* renamed from: b */
    public final int m10647b() {
        return this.f11910a;
    }

    /* renamed from: c */
    public final int m10648c() {
        return this.f11912c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseTrainFragmentArgs)) {
            return false;
        }
        ExerciseTrainFragmentArgs exerciseTrainFragmentArgs = (ExerciseTrainFragmentArgs) obj;
        return this.f11910a == exerciseTrainFragmentArgs.f11910a && this.f11911b == exerciseTrainFragmentArgs.f11911b && this.f11912c == exerciseTrainFragmentArgs.f11912c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11910a) * 31) + Integer.hashCode(this.f11911b)) * 31) + Integer.hashCode(this.f11912c);
    }

    public String toString() {
        return "ExerciseTrainFragmentArgs(courseId=" + this.f11910a + ", catalogId=" + this.f11911b + ", groupId=" + this.f11912c + ")";
    }
}
