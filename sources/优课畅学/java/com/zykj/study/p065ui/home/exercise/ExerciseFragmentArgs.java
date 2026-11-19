package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ExerciseFragmentArgs implements NavArgs {

    /* renamed from: e */
    public static final C7786a f11787e = new C7786a(null);

    /* renamed from: a */
    public final int f11788a;

    /* renamed from: b */
    public final int f11789b;

    /* renamed from: c */
    public final int f11790c;

    /* renamed from: d */
    public final int f11791d;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseFragmentArgs$a */
    public static final class C7786a {
        public /* synthetic */ C7786a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseFragmentArgs m10543a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("courseId")) {
                throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("courseId");
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (!bundle.containsKey("groupId")) {
                throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
            }
            int i12 = bundle.getInt("groupId");
            if (bundle.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                return new ExerciseFragmentArgs(i10, i11, i12, bundle.getInt(NotificationCompat.CATEGORY_STATUS));
            }
            throw new IllegalArgumentException("Required argument \"status\" is missing and does not have an android:defaultValue");
        }

        public C7786a() {
        }
    }

    public ExerciseFragmentArgs(int i10, int i11, int i12, int i13) {
        this.f11788a = i10;
        this.f11789b = i11;
        this.f11790c = i12;
        this.f11791d = i13;
    }

    public static final ExerciseFragmentArgs fromBundle(Bundle bundle) {
        return f11787e.m10543a(bundle);
    }

    /* renamed from: a */
    public final int m10540a() {
        return this.f11789b;
    }

    /* renamed from: b */
    public final int m10541b() {
        return this.f11788a;
    }

    /* renamed from: c */
    public final int m10542c() {
        return this.f11790c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseFragmentArgs)) {
            return false;
        }
        ExerciseFragmentArgs exerciseFragmentArgs = (ExerciseFragmentArgs) obj;
        return this.f11788a == exerciseFragmentArgs.f11788a && this.f11789b == exerciseFragmentArgs.f11789b && this.f11790c == exerciseFragmentArgs.f11790c && this.f11791d == exerciseFragmentArgs.f11791d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f11788a) * 31) + Integer.hashCode(this.f11789b)) * 31) + Integer.hashCode(this.f11790c)) * 31) + Integer.hashCode(this.f11791d);
    }

    public String toString() {
        return "ExerciseFragmentArgs(courseId=" + this.f11788a + ", catalogId=" + this.f11789b + ", groupId=" + this.f11790c + ", status=" + this.f11791d + ")";
    }
}
