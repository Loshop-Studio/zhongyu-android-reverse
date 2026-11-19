package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p176m4.AbstractC9311l;

/* renamed from: com.zykj.study.ui.home.exercise.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7843c {

    /* renamed from: a */
    public static final b f12103a = new b(null);

    /* renamed from: com.zykj.study.ui.home.exercise.c$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f12104a;

        /* renamed from: b */
        public final int f12105b;

        public a(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f12104a = path;
            this.f12105b = R$id.action_exerciseHistoryStudentFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f12104a, ((a) obj).f12104a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12105b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12104a);
            return bundle;
        }

        public int hashCode() {
            return this.f12104a.hashCode();
        }

        public String toString() {
            return "ActionExerciseHistoryStudentFragmentToMicroPlayFragment(path=" + this.f12104a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10782a(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new a(path);
        }

        /* renamed from: b */
        public final NavDirections m10783b(String url) {
            AbstractC9133u.m16133g(url, "url");
            return AbstractC9311l.f18335a.m17114c(url);
        }

        public b() {
        }
    }
}
