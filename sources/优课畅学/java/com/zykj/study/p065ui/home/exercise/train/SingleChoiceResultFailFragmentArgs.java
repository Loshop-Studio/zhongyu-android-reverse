package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SingleChoiceResultFailFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C7899a f12432b = new C7899a(null);

    /* renamed from: c */
    public static final int f12433c = 8;

    /* renamed from: a */
    public final String[] f12434a;

    /* renamed from: com.zykj.study.ui.home.exercise.train.SingleChoiceResultFailFragmentArgs$a */
    public static final class C7899a {
        public /* synthetic */ C7899a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final SingleChoiceResultFailFragmentArgs m10966a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(SingleChoiceResultFailFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("selectList")) {
                throw new IllegalArgumentException("Required argument \"selectList\" is missing and does not have an android:defaultValue");
            }
            String[] stringArray = bundle.getStringArray("selectList");
            if (stringArray != null) {
                return new SingleChoiceResultFailFragmentArgs(stringArray);
            }
            throw new IllegalArgumentException("Argument \"selectList\" is marked as non-null but was passed a null value.");
        }

        public C7899a() {
        }
    }

    public SingleChoiceResultFailFragmentArgs(String[] selectList) {
        AbstractC9133u.m16133g(selectList, "selectList");
        this.f12434a = selectList;
    }

    public static final SingleChoiceResultFailFragmentArgs fromBundle(Bundle bundle) {
        return f12432b.m10966a(bundle);
    }

    /* renamed from: a */
    public final String[] m10965a() {
        return this.f12434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleChoiceResultFailFragmentArgs) && AbstractC9133u.m16128b(this.f12434a, ((SingleChoiceResultFailFragmentArgs) obj).f12434a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12434a);
    }

    public String toString() {
        return "SingleChoiceResultFailFragmentArgs(selectList=" + Arrays.toString(this.f12434a) + ")";
    }
}
