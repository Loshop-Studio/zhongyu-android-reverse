package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.exercise.train.l */
/* loaded from: classes5.dex */
public abstract class AbstractC7921l {

    /* renamed from: a */
    public static final b f12500a = new b(null);

    /* renamed from: com.zykj.study.ui.home.exercise.train.l$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String[] f12501a;

        /* renamed from: b */
        public final int f12502b;

        public a(String[] selectList) {
            AbstractC9133u.m16133g(selectList, "selectList");
            this.f12501a = selectList;
            this.f12502b = R$id.action_singleChoiceFragment_to_singleChoiceResultFailFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f12501a, ((a) obj).f12501a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12502b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putStringArray("selectList", this.f12501a);
            return bundle;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f12501a);
        }

        public String toString() {
            return "ActionSingleChoiceFragmentToSingleChoiceResultFailFragment(selectList=" + Arrays.toString(this.f12501a) + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.l$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10995a(String[] selectList) {
            AbstractC9133u.m16133g(selectList, "selectList");
            return new a(selectList);
        }

        /* renamed from: b */
        public final NavDirections m10996b() {
            return new ActionOnlyNavDirections(R$id.action_singleChoiceFragment_to_singleChoiceResultSuccessFragment);
        }

        public b() {
        }
    }
}
