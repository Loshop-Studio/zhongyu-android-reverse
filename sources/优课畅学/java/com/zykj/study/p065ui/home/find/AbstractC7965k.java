package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.find.k */
/* loaded from: classes5.dex */
public abstract class AbstractC7965k {

    /* renamed from: a */
    public static final c f12703a = new c(null);

    /* renamed from: com.zykj.study.ui.home.find.k$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f12704a;

        /* renamed from: b */
        public final String f12705b;

        /* renamed from: c */
        public final int f12706c;

        public a(String requestKey, String localPath) {
            AbstractC9133u.m16133g(requestKey, "requestKey");
            AbstractC9133u.m16133g(localPath, "localPath");
            this.f12704a = requestKey;
            this.f12705b = localPath;
            this.f12706c = R$id.action_microCodeFragment_to_microCropFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f12704a, aVar.f12704a) && AbstractC9133u.m16128b(this.f12705b, aVar.f12705b);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12706c;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("requestKey", this.f12704a);
            bundle.putString("localPath", this.f12705b);
            return bundle;
        }

        public int hashCode() {
            return (this.f12704a.hashCode() * 31) + this.f12705b.hashCode();
        }

        public String toString() {
            return "ActionMicroCodeFragmentToMicroCropFragment(requestKey=" + this.f12704a + ", localPath=" + this.f12705b + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.k$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f12707a;

        /* renamed from: b */
        public final int f12708b;

        public b(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f12707a = path;
            this.f12708b = R$id.action_microFragment_to_microPlayFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f12707a, ((b) obj).f12707a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f12708b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f12707a);
            return bundle;
        }

        public int hashCode() {
            return this.f12707a.hashCode();
        }

        public String toString() {
            return "ActionMicroFragmentToMicroPlayFragment(path=" + this.f12707a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.k$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11143a(String requestKey, String localPath) {
            AbstractC9133u.m16133g(requestKey, "requestKey");
            AbstractC9133u.m16133g(localPath, "localPath");
            return new a(requestKey, localPath);
        }

        /* renamed from: b */
        public final NavDirections m11144b(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new b(path);
        }

        public c() {
        }
    }
}
