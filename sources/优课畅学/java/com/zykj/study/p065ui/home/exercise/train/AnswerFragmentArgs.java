package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.study.bean.exercise.QuestionBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AnswerFragmentArgs implements NavArgs {

    /* renamed from: e */
    public static final C7856a f12172e = new C7856a(null);

    /* renamed from: f */
    public static final int f12173f = 8;

    /* renamed from: a */
    public final long f12174a;

    /* renamed from: b */
    public final int f12175b;

    /* renamed from: c */
    public final QuestionBean f12176c;

    /* renamed from: d */
    public final boolean f12177d;

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerFragmentArgs$a */
    public static final class C7856a {
        public /* synthetic */ C7856a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AnswerFragmentArgs m10818a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(AnswerFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("exerciseId")) {
                throw new IllegalArgumentException("Required argument \"exerciseId\" is missing and does not have an android:defaultValue");
            }
            long j10 = bundle.getLong("exerciseId");
            if (!bundle.containsKey("groupId")) {
                throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("groupId");
            if (!bundle.containsKey("questionBean")) {
                throw new IllegalArgumentException("Required argument \"questionBean\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(QuestionBean.class) && !Serializable.class.isAssignableFrom(QuestionBean.class)) {
                throw new UnsupportedOperationException(QuestionBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            QuestionBean questionBean = (QuestionBean) bundle.get("questionBean");
            if (questionBean == null) {
                throw new IllegalArgumentException("Argument \"questionBean\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("isLastQuestion")) {
                return new AnswerFragmentArgs(j10, i10, questionBean, bundle.getBoolean("isLastQuestion"));
            }
            throw new IllegalArgumentException("Required argument \"isLastQuestion\" is missing and does not have an android:defaultValue");
        }

        public C7856a() {
        }
    }

    public AnswerFragmentArgs(long j10, int i10, QuestionBean questionBean, boolean z10) {
        AbstractC9133u.m16133g(questionBean, "questionBean");
        this.f12174a = j10;
        this.f12175b = i10;
        this.f12176c = questionBean;
        this.f12177d = z10;
    }

    public static final AnswerFragmentArgs fromBundle(Bundle bundle) {
        return f12172e.m10818a(bundle);
    }

    /* renamed from: a */
    public final long m10814a() {
        return this.f12174a;
    }

    /* renamed from: b */
    public final int m10815b() {
        return this.f12175b;
    }

    /* renamed from: c */
    public final QuestionBean m10816c() {
        return this.f12176c;
    }

    /* renamed from: d */
    public final boolean m10817d() {
        return this.f12177d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerFragmentArgs)) {
            return false;
        }
        AnswerFragmentArgs answerFragmentArgs = (AnswerFragmentArgs) obj;
        return this.f12174a == answerFragmentArgs.f12174a && this.f12175b == answerFragmentArgs.f12175b && AbstractC9133u.m16128b(this.f12176c, answerFragmentArgs.f12176c) && this.f12177d == answerFragmentArgs.f12177d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f12174a) * 31) + Integer.hashCode(this.f12175b)) * 31) + this.f12176c.hashCode()) * 31) + Boolean.hashCode(this.f12177d);
    }

    public String toString() {
        return "AnswerFragmentArgs(exerciseId=" + this.f12174a + ", groupId=" + this.f12175b + ", questionBean=" + this.f12176c + ", isLastQuestion=" + this.f12177d + ")";
    }
}
