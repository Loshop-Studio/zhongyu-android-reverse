package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.QuestionBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.exercise.train.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7910a {

    /* renamed from: a */
    public static final d f12464a = new d(null);

    /* renamed from: com.zykj.study.ui.home.exercise.train.a$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final long f12465a;

        /* renamed from: b */
        public final int f12466b;

        /* renamed from: c */
        public final QuestionBean f12467c;

        /* renamed from: d */
        public final boolean f12468d;

        /* renamed from: e */
        public final int f12469e;

        public a(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            this.f12465a = j10;
            this.f12466b = i10;
            this.f12467c = questionBean;
            this.f12468d = z10;
            this.f12469e = R$id.action_answerAreaFragment_to_answerFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12465a == aVar.f12465a && this.f12466b == aVar.f12466b && AbstractC9133u.m16128b(this.f12467c, aVar.f12467c) && this.f12468d == aVar.f12468d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12469e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putLong("exerciseId", this.f12465a);
            bundle.putInt("groupId", this.f12466b);
            if (Parcelable.class.isAssignableFrom(QuestionBean.class)) {
                QuestionBean questionBean = this.f12467c;
                AbstractC9133u.m16131e(questionBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("questionBean", questionBean);
            } else {
                if (!Serializable.class.isAssignableFrom(QuestionBean.class)) {
                    throw new UnsupportedOperationException(QuestionBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                Parcelable parcelable = this.f12467c;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("questionBean", (Serializable) parcelable);
            }
            bundle.putBoolean("isLastQuestion", this.f12468d);
            return bundle;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f12465a) * 31) + Integer.hashCode(this.f12466b)) * 31) + this.f12467c.hashCode()) * 31) + Boolean.hashCode(this.f12468d);
        }

        public String toString() {
            return "ActionAnswerAreaFragmentToAnswerFragment(exerciseId=" + this.f12465a + ", groupId=" + this.f12466b + ", questionBean=" + this.f12467c + ", isLastQuestion=" + this.f12468d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.a$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final long f12470a;

        /* renamed from: b */
        public final int f12471b;

        /* renamed from: c */
        public final QuestionBean f12472c;

        /* renamed from: d */
        public final boolean f12473d;

        /* renamed from: e */
        public final int f12474e;

        public b(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            this.f12470a = j10;
            this.f12471b = i10;
            this.f12472c = questionBean;
            this.f12473d = z10;
            this.f12474e = R$id.action_answerAreaFragment_to_multipleChoiceFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12470a == bVar.f12470a && this.f12471b == bVar.f12471b && AbstractC9133u.m16128b(this.f12472c, bVar.f12472c) && this.f12473d == bVar.f12473d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12474e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putLong("exerciseId", this.f12470a);
            bundle.putInt("groupId", this.f12471b);
            if (Parcelable.class.isAssignableFrom(QuestionBean.class)) {
                QuestionBean questionBean = this.f12472c;
                AbstractC9133u.m16131e(questionBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("questionBean", questionBean);
            } else {
                if (!Serializable.class.isAssignableFrom(QuestionBean.class)) {
                    throw new UnsupportedOperationException(QuestionBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                Parcelable parcelable = this.f12472c;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("questionBean", (Serializable) parcelable);
            }
            bundle.putBoolean("isLastQuestion", this.f12473d);
            return bundle;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f12470a) * 31) + Integer.hashCode(this.f12471b)) * 31) + this.f12472c.hashCode()) * 31) + Boolean.hashCode(this.f12473d);
        }

        public String toString() {
            return "ActionAnswerAreaFragmentToMultipleChoiceFragment(exerciseId=" + this.f12470a + ", groupId=" + this.f12471b + ", questionBean=" + this.f12472c + ", isLastQuestion=" + this.f12473d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.a$c */
    public static final class c implements NavDirections {

        /* renamed from: a */
        public final long f12475a;

        /* renamed from: b */
        public final int f12476b;

        /* renamed from: c */
        public final QuestionBean f12477c;

        /* renamed from: d */
        public final boolean f12478d;

        /* renamed from: e */
        public final int f12479e;

        public c(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            this.f12475a = j10;
            this.f12476b = i10;
            this.f12477c = questionBean;
            this.f12478d = z10;
            this.f12479e = R$id.action_answerAreaFragment_to_singleChoiceFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f12475a == cVar.f12475a && this.f12476b == cVar.f12476b && AbstractC9133u.m16128b(this.f12477c, cVar.f12477c) && this.f12478d == cVar.f12478d;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12479e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putLong("exerciseId", this.f12475a);
            bundle.putInt("groupId", this.f12476b);
            if (Parcelable.class.isAssignableFrom(QuestionBean.class)) {
                QuestionBean questionBean = this.f12477c;
                AbstractC9133u.m16131e(questionBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("questionBean", questionBean);
            } else {
                if (!Serializable.class.isAssignableFrom(QuestionBean.class)) {
                    throw new UnsupportedOperationException(QuestionBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                Parcelable parcelable = this.f12477c;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("questionBean", (Serializable) parcelable);
            }
            bundle.putBoolean("isLastQuestion", this.f12478d);
            return bundle;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f12475a) * 31) + Integer.hashCode(this.f12476b)) * 31) + this.f12477c.hashCode()) * 31) + Boolean.hashCode(this.f12478d);
        }

        public String toString() {
            return "ActionAnswerAreaFragmentToSingleChoiceFragment(exerciseId=" + this.f12475a + ", groupId=" + this.f12476b + ", questionBean=" + this.f12477c + ", isLastQuestion=" + this.f12478d + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.a$d */
    public static final class d {
        public /* synthetic */ d(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10985a(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            return new a(j10, i10, questionBean, z10);
        }

        /* renamed from: b */
        public final NavDirections m10986b(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            return new b(j10, i10, questionBean, z10);
        }

        /* renamed from: c */
        public final NavDirections m10987c(long j10, int i10, QuestionBean questionBean, boolean z10) {
            AbstractC9133u.m16133g(questionBean, "questionBean");
            return new c(j10, i10, questionBean, z10);
        }

        public d() {
        }
    }
}
