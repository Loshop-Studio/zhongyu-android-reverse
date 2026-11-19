package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceResultFailFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7878a f12351b = new C7878a(null);

    /* renamed from: c */
    public static final int f12352c = 8;

    /* renamed from: a */
    public final String[] f12353a;

    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragmentArgs$a */
    public static final class C7878a {
        public /* synthetic */ C7878a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MultipleChoiceResultFailFragmentArgs m10918a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MultipleChoiceResultFailFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("selectList")) {
                throw new IllegalArgumentException("Required argument \"selectList\" is missing and does not have an android:defaultValue");
            }
            String[] stringArray = bundle.getStringArray("selectList");
            if (stringArray != null) {
                return new MultipleChoiceResultFailFragmentArgs(stringArray);
            }
            throw new IllegalArgumentException("Argument \"selectList\" is marked as non-null but was passed a null value.");
        }

        public C7878a() {
        }
    }

    public MultipleChoiceResultFailFragmentArgs(String[] selectList) {
        AbstractC9133u.m16133g(selectList, "selectList");
        this.f12353a = selectList;
    }

    public static final MultipleChoiceResultFailFragmentArgs fromBundle(Bundle bundle) {
        return f12351b.m10918a(bundle);
    }

    /* renamed from: a */
    public final String[] m10917a() {
        return this.f12353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultipleChoiceResultFailFragmentArgs) && AbstractC9133u.m16128b(this.f12353a, ((MultipleChoiceResultFailFragmentArgs) obj).f12353a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12353a);
    }

    public String toString() {
        return "MultipleChoiceResultFailFragmentArgs(selectList=" + Arrays.toString(this.f12353a) + ")";
    }
}
