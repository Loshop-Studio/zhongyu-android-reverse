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
public final class MultipleChoiceFragmentArgs implements NavArgs {

    /* renamed from: e */
    public static final C7870a f12321e = new C7870a(null);

    /* renamed from: f */
    public static final int f12322f = 8;

    /* renamed from: a */
    public final long f12323a;

    /* renamed from: b */
    public final int f12324b;

    /* renamed from: c */
    public final QuestionBean f12325c;

    /* renamed from: d */
    public final boolean f12326d;

    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragmentArgs$a */
    public static final class C7870a {
        public /* synthetic */ C7870a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MultipleChoiceFragmentArgs m10901a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MultipleChoiceFragmentArgs.class.getClassLoader());
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
                return new MultipleChoiceFragmentArgs(j10, i10, questionBean, bundle.getBoolean("isLastQuestion"));
            }
            throw new IllegalArgumentException("Required argument \"isLastQuestion\" is missing and does not have an android:defaultValue");
        }

        public C7870a() {
        }
    }

    public MultipleChoiceFragmentArgs(long j10, int i10, QuestionBean questionBean, boolean z10) {
        AbstractC9133u.m16133g(questionBean, "questionBean");
        this.f12323a = j10;
        this.f12324b = i10;
        this.f12325c = questionBean;
        this.f12326d = z10;
    }

    public static final MultipleChoiceFragmentArgs fromBundle(Bundle bundle) {
        return f12321e.m10901a(bundle);
    }

    /* renamed from: a */
    public final long m10897a() {
        return this.f12323a;
    }

    /* renamed from: b */
    public final int m10898b() {
        return this.f12324b;
    }

    /* renamed from: c */
    public final QuestionBean m10899c() {
        return this.f12325c;
    }

    /* renamed from: d */
    public final boolean m10900d() {
        return this.f12326d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleChoiceFragmentArgs)) {
            return false;
        }
        MultipleChoiceFragmentArgs multipleChoiceFragmentArgs = (MultipleChoiceFragmentArgs) obj;
        return this.f12323a == multipleChoiceFragmentArgs.f12323a && this.f12324b == multipleChoiceFragmentArgs.f12324b && AbstractC9133u.m16128b(this.f12325c, multipleChoiceFragmentArgs.f12325c) && this.f12326d == multipleChoiceFragmentArgs.f12326d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f12323a) * 31) + Integer.hashCode(this.f12324b)) * 31) + this.f12325c.hashCode()) * 31) + Boolean.hashCode(this.f12326d);
    }

    public String toString() {
        return "MultipleChoiceFragmentArgs(exerciseId=" + this.f12323a + ", groupId=" + this.f12324b + ", questionBean=" + this.f12325c + ", isLastQuestion=" + this.f12326d + ")";
    }
}
