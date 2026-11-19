package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.exercise.i */
/* loaded from: classes5.dex */
public abstract class AbstractC7849i {

    /* renamed from: a */
    public static final c f12128a = new c(null);

    /* renamed from: com.zykj.study.ui.home.exercise.i$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f12129a;

        /* renamed from: b */
        public final String f12130b;

        /* renamed from: c */
        public final int f12131c;

        public a(String requestKey, String localPath) {
            AbstractC9133u.m16133g(requestKey, "requestKey");
            AbstractC9133u.m16133g(localPath, "localPath");
            this.f12129a = requestKey;
            this.f12130b = localPath;
            this.f12131c = R$id.action_microEditFragment_to_microCropFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f12129a, aVar.f12129a) && AbstractC9133u.m16128b(this.f12130b, aVar.f12130b);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12131c;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("requestKey", this.f12129a);
            bundle.putString("localPath", this.f12130b);
            return bundle;
        }

        public int hashCode() {
            return (this.f12129a.hashCode() * 31) + this.f12130b.hashCode();
        }

        public String toString() {
            return "ActionMicroEditFragmentToMicroCropFragment(requestKey=" + this.f12129a + ", localPath=" + this.f12130b + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.i$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f12132a;

        /* renamed from: b */
        public final int f12133b;

        public b(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f12132a = path;
            this.f12133b = R$id.action_microEditFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f12132a, ((b) obj).f12132a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12133b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12132a);
            return bundle;
        }

        public int hashCode() {
            return this.f12132a.hashCode();
        }

        public String toString() {
            return "ActionMicroEditFragmentToMicroPlayFragment(path=" + this.f12132a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.i$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m10787a(String requestKey, String localPath) {
            AbstractC9133u.m16133g(requestKey, "requestKey");
            AbstractC9133u.m16133g(localPath, "localPath");
            return new a(requestKey, localPath);
        }

        /* renamed from: b */
        public final NavDirections m10788b(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new b(path);
        }

        public c() {
        }
    }
}
