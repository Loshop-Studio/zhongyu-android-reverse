package com.zykj.student.dialogue.p076ui.home;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.student.dialogue.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.student.dialogue.ui.home.i */
/* loaded from: classes5.dex */
public abstract class AbstractC7629i {

    /* renamed from: a */
    public static final b f11875a = new b(null);

    /* renamed from: com.zykj.student.dialogue.ui.home.i$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final boolean f11876a;

        /* renamed from: b */
        public final int f11877b = R.id.actionHomeFragmentToAskQuestionDialog;

        public a(boolean z9) {
            this.f11876a = z9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11876a == ((a) obj).f11876a;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f11877b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("quoraSearchEnable", this.f11876a);
            return bundle;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11876a);
        }

        public String toString() {
            return "ActionHomeFragmentToAskQuestionDialog(quoraSearchEnable=" + this.f11876a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.i$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11033a(boolean z9) {
            return new a(z9);
        }

        public b() {
        }
    }
}
