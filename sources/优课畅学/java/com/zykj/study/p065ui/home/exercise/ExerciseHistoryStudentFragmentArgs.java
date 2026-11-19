package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.study.bean.exercise.ExerciseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseHistoryStudentFragmentArgs implements NavArgs {

    /* renamed from: d */
    public static final C7807a f11861d = new C7807a(null);

    /* renamed from: e */
    public static final int f11862e = 8;

    /* renamed from: a */
    public final ExerciseBean f11863a;

    /* renamed from: b */
    public final int f11864b;

    /* renamed from: c */
    public final int f11865c;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragmentArgs$a */
    public static final class C7807a {
        public /* synthetic */ C7807a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseHistoryStudentFragmentArgs m10606a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ExerciseHistoryStudentFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("exerciseBean")) {
                throw new IllegalArgumentException("Required argument \"exerciseBean\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(ExerciseBean.class) && !Serializable.class.isAssignableFrom(ExerciseBean.class)) {
                throw new UnsupportedOperationException(ExerciseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            ExerciseBean exerciseBean = (ExerciseBean) bundle.get("exerciseBean");
            if (exerciseBean == null) {
                throw new IllegalArgumentException("Argument \"exerciseBean\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("groupId")) {
                return new ExerciseHistoryStudentFragmentArgs(exerciseBean, bundle.getInt("groupId"), bundle.containsKey("index") ? bundle.getInt("index") : 0);
            }
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C7807a() {
        }
    }

    public ExerciseHistoryStudentFragmentArgs(ExerciseBean exerciseBean, int i10, int i11) {
        AbstractC9133u.m16133g(exerciseBean, "exerciseBean");
        this.f11863a = exerciseBean;
        this.f11864b = i10;
        this.f11865c = i11;
    }

    public static final ExerciseHistoryStudentFragmentArgs fromBundle(Bundle bundle) {
        return f11861d.m10606a(bundle);
    }

    /* renamed from: a */
    public final ExerciseBean m10604a() {
        return this.f11863a;
    }

    /* renamed from: b */
    public final int m10605b() {
        return this.f11864b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseHistoryStudentFragmentArgs)) {
            return false;
        }
        ExerciseHistoryStudentFragmentArgs exerciseHistoryStudentFragmentArgs = (ExerciseHistoryStudentFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f11863a, exerciseHistoryStudentFragmentArgs.f11863a) && this.f11864b == exerciseHistoryStudentFragmentArgs.f11864b && this.f11865c == exerciseHistoryStudentFragmentArgs.f11865c;
    }

    public int hashCode() {
        return (((this.f11863a.hashCode() * 31) + Integer.hashCode(this.f11864b)) * 31) + Integer.hashCode(this.f11865c);
    }

    public String toString() {
        return "ExerciseHistoryStudentFragmentArgs(exerciseBean=" + this.f11863a + ", groupId=" + this.f11864b + ", index=" + this.f11865c + ")";
    }
}
