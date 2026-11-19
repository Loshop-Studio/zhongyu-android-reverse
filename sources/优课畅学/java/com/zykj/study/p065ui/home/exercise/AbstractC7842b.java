package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p176m4.AbstractC9310k;

/* renamed from: com.zykj.study.ui.home.exercise.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7842b {

    /* renamed from: a */
    public static final b f12100a = new b(null);

    /* renamed from: com.zykj.study.ui.home.exercise.b$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f12101a;

        /* renamed from: b */
        public final int f12102b;

        public a(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f12101a = path;
            this.f12102b = R$id.action_exerciseHistoryFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f12101a, ((a) obj).f12101a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12102b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12101a);
            return bundle;
        }

        public int hashCode() {
            return this.f12101a.hashCode();
        }

        public String toString() {
            return "ActionExerciseHistoryFragmentToMicroPlayFragment(path=" + this.f12101a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.b$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10780a(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new a(path);
        }

        /* renamed from: b */
        public final NavDirections m10781b(String url) {
            AbstractC9133u.m16133g(url, "url");
            return AbstractC9310k.f18332a.m17111b(url);
        }

        public b() {
        }
    }
}
