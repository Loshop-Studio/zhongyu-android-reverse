package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.exercise.e */
/* loaded from: classes5.dex */
public abstract class AbstractC7845e {

    /* renamed from: a */
    public static final c f12112a = new c(null);

    /* renamed from: com.zykj.study.ui.home.exercise.e$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f12113a;

        /* renamed from: b */
        public final int f12114b;

        /* renamed from: c */
        public final String f12115c;

        /* renamed from: d */
        public final int f12116d;

        public a(String path, int i10, String questionId) {
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(questionId, "questionId");
            this.f12113a = path;
            this.f12114b = i10;
            this.f12115c = questionId;
            this.f12116d = R$id.action_exerciseViewerFragment_to_microEditFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f12113a, aVar.f12113a) && this.f12114b == aVar.f12114b && AbstractC9133u.m16128b(this.f12115c, aVar.f12115c);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12116d;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12113a);
            bundle.putInt("groupId", this.f12114b);
            bundle.putString("questionId", this.f12115c);
            return bundle;
        }

        public int hashCode() {
            return (((this.f12113a.hashCode() * 31) + Integer.hashCode(this.f12114b)) * 31) + this.f12115c.hashCode();
        }

        public String toString() {
            return "ActionExerciseViewerFragmentToMicroEditFragment(path=" + this.f12113a + ", groupId=" + this.f12114b + ", questionId=" + this.f12115c + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.e$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f12117a;

        /* renamed from: b */
        public final int f12118b;

        public b(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f12117a = path;
            this.f12118b = R$id.action_exerciseViewerFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f12117a, ((b) obj).f12117a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12118b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12117a);
            return bundle;
        }

        public int hashCode() {
            return this.f12117a.hashCode();
        }

        public String toString() {
            return "ActionExerciseViewerFragmentToMicroPlayFragment(path=" + this.f12117a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.e$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10785a(String path, int i10, String questionId) {
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(questionId, "questionId");
            return new a(path, i10, questionId);
        }

        /* renamed from: b */
        public final NavDirections m10786b(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new b(path);
        }

        public c() {
        }
    }
}
