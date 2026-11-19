package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.study.ui.home.exercise.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7844d {

    /* renamed from: a */
    public static final b f12106a = new b(null);

    /* renamed from: com.zykj.study.ui.home.exercise.d$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final int f12107a;

        /* renamed from: b */
        public final int f12108b;

        /* renamed from: c */
        public final int f12109c;

        /* renamed from: d */
        public final int f12110d;

        /* renamed from: e */
        public final int f12111e = R$id.action_exerciseTrainFragment_to_exerciseHistoryFragment;

        public a(int i10, int i11, int i12, int i13) {
            this.f12107a = i10;
            this.f12108b = i11;
            this.f12109c = i12;
            this.f12110d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12107a == aVar.f12107a && this.f12108b == aVar.f12108b && this.f12109c == aVar.f12109c && this.f12110d == aVar.f12110d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12111e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f12107a);
            bundle.putInt("catalogId", this.f12108b);
            bundle.putInt("groupId", this.f12109c);
            bundle.putInt("index", this.f12110d);
            return bundle;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f12107a) * 31) + Integer.hashCode(this.f12108b)) * 31) + Integer.hashCode(this.f12109c)) * 31) + Integer.hashCode(this.f12110d);
        }

        public String toString() {
            return "ActionExerciseTrainFragmentToExerciseHistoryFragment(courseId=" + this.f12107a + ", catalogId=" + this.f12108b + ", groupId=" + this.f12109c + ", index=" + this.f12110d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10784a(int i10, int i11, int i12, int i13) {
            return new a(i10, i11, i12, i13);
        }

        public b() {
        }
    }
}
