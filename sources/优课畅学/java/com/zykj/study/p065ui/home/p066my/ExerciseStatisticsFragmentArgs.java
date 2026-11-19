package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ExerciseStatisticsFragmentArgs implements NavArgs {

    /* renamed from: d */
    public static final C8013a f12991d = new C8013a(null);

    /* renamed from: a */
    public final int f12992a;

    /* renamed from: b */
    public final int f12993b;

    /* renamed from: c */
    public final int f12994c;

    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragmentArgs$a */
    public static final class C8013a {
        public /* synthetic */ C8013a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseStatisticsFragmentArgs m11376a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseStatisticsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("superviseId")) {
                throw new IllegalArgumentException("Required argument \"superviseId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("superviseId");
            if (!bundle.containsKey("catalogId")) {
                throw new IllegalArgumentException("Required argument \"catalogId\" is missing and does not have an android:defaultValue");
            }
            int i11 = bundle.getInt("catalogId");
            if (bundle.containsKey("groupId")) {
                return new ExerciseStatisticsFragmentArgs(i10, i11, bundle.getInt("groupId"));
            }
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C8013a() {
        }
    }

    public ExerciseStatisticsFragmentArgs(int i10, int i11, int i12) {
        this.f12992a = i10;
        this.f12993b = i11;
        this.f12994c = i12;
    }

    public static final ExerciseStatisticsFragmentArgs fromBundle(Bundle bundle) {
        return f12991d.m11376a(bundle);
    }

    /* renamed from: a */
    public final int m11373a() {
        return this.f12993b;
    }

    /* renamed from: b */
    public final int m11374b() {
        return this.f12994c;
    }

    /* renamed from: c */
    public final int m11375c() {
        return this.f12992a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseStatisticsFragmentArgs)) {
            return false;
        }
        ExerciseStatisticsFragmentArgs exerciseStatisticsFragmentArgs = (ExerciseStatisticsFragmentArgs) obj;
        return this.f12992a == exerciseStatisticsFragmentArgs.f12992a && this.f12993b == exerciseStatisticsFragmentArgs.f12993b && this.f12994c == exerciseStatisticsFragmentArgs.f12994c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f12992a) * 31) + Integer.hashCode(this.f12993b)) * 31) + Integer.hashCode(this.f12994c);
    }

    public String toString() {
        return "ExerciseStatisticsFragmentArgs(superviseId=" + this.f12992a + ", catalogId=" + this.f12993b + ", groupId=" + this.f12994c + ")";
    }
}
