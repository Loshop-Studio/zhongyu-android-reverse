package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.exercise.train.i */
/* loaded from: classes5.dex */
public abstract class AbstractC7918i {

    /* renamed from: a */
    public static final b f12495a = new b(null);

    /* renamed from: com.zykj.study.ui.home.exercise.train.i$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String[] f12496a;

        /* renamed from: b */
        public final int f12497b;

        public a(String[] selectList) {
            AbstractC9133u.m16133g(selectList, "selectList");
            this.f12496a = selectList;
            this.f12497b = R$id.f10710xfba362eb;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f12496a, ((a) obj).f12496a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12497b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putStringArray("selectList", this.f12496a);
            return bundle;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f12496a);
        }

        public String toString() {
            return "ActionMultipleChoiceFragmentToMultipleChoiceResultFailFragment(selectList=" + Arrays.toString(this.f12496a) + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.i$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10991a(String[] selectList) {
            AbstractC9133u.m16133g(selectList, "selectList");
            return new a(selectList);
        }

        /* renamed from: b */
        public final NavDirections m10992b() {
            return new ActionOnlyNavDirections(R$id.f10711xc9a6f6f6);
        }

        public b() {
        }
    }
}
