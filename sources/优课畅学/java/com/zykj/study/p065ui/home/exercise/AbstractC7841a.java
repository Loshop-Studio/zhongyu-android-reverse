package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.study.ui.home.exercise.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7841a {

    /* renamed from: a */
    public static final c f12090a = new c(null);

    /* renamed from: com.zykj.study.ui.home.exercise.a$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final int f12091a;

        /* renamed from: b */
        public final int f12092b;

        /* renamed from: c */
        public final int f12093c;

        /* renamed from: d */
        public final int f12094d;

        /* renamed from: e */
        public final int f12095e = R$id.action_exerciseFragment_to_exerciseHistoryFragment;

        public a(int i10, int i11, int i12, int i13) {
            this.f12091a = i10;
            this.f12092b = i11;
            this.f12093c = i12;
            this.f12094d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12091a == aVar.f12091a && this.f12092b == aVar.f12092b && this.f12093c == aVar.f12093c && this.f12094d == aVar.f12094d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12095e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f12091a);
            bundle.putInt("catalogId", this.f12092b);
            bundle.putInt("groupId", this.f12093c);
            bundle.putInt("index", this.f12094d);
            return bundle;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f12091a) * 31) + Integer.hashCode(this.f12092b)) * 31) + Integer.hashCode(this.f12093c)) * 31) + Integer.hashCode(this.f12094d);
        }

        public String toString() {
            return "ActionExerciseFragmentToExerciseHistoryFragment(courseId=" + this.f12091a + ", catalogId=" + this.f12092b + ", groupId=" + this.f12093c + ", index=" + this.f12094d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.a$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final int f12096a;

        /* renamed from: b */
        public final int f12097b;

        /* renamed from: c */
        public final int f12098c;

        /* renamed from: d */
        public final int f12099d = R$id.action_exerciseFragment_to_exerciseTrainFragment;

        public b(int i10, int i11, int i12) {
            this.f12096a = i10;
            this.f12097b = i11;
            this.f12098c = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12096a == bVar.f12096a && this.f12097b == bVar.f12097b && this.f12098c == bVar.f12098c;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12099d;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("courseId", this.f12096a);
            bundle.putInt("catalogId", this.f12097b);
            bundle.putInt("groupId", this.f12098c);
            return bundle;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f12096a) * 31) + Integer.hashCode(this.f12097b)) * 31) + Integer.hashCode(this.f12098c);
        }

        public String toString() {
            return "ActionExerciseFragmentToExerciseTrainFragment(courseId=" + this.f12096a + ", catalogId=" + this.f12097b + ", groupId=" + this.f12098c + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.a$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ NavDirections m10777b(c cVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 8) != 0) {
                i13 = 0;
            }
            return cVar.m10778a(i10, i11, i12, i13);
        }

        /* renamed from: a */
        public final NavDirections m10778a(int i10, int i11, int i12, int i13) {
            return new a(i10, i11, i12, i13);
        }

        /* renamed from: c */
        public final NavDirections m10779c(int i10, int i11, int i12) {
            return new b(i10, i11, i12);
        }

        public c() {
        }
    }
}
