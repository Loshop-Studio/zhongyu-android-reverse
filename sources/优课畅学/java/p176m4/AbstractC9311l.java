package p176m4;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.ExerciseBean;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: m4.l */
/* loaded from: classes4.dex */
public abstract class AbstractC9311l {

    /* renamed from: a */
    public static final c f18335a = new c(null);

    /* renamed from: m4.l$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final ExerciseBean f18336a;

        /* renamed from: b */
        public final int f18337b;

        /* renamed from: c */
        public final int f18338c;

        /* renamed from: d */
        public final int f18339d;

        public a(ExerciseBean exerciseBean, int i10, int i11) {
            AbstractC9133u.m16133g(exerciseBean, "exerciseBean");
            this.f18336a = exerciseBean;
            this.f18337b = i10;
            this.f18338c = i11;
            this.f18339d = R$id.action_global_exerciseHistoryStudentFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f18336a, aVar.f18336a) && this.f18337b == aVar.f18337b && this.f18338c == aVar.f18338c;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f18339d;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ExerciseBean.class)) {
                ExerciseBean exerciseBean = this.f18336a;
                AbstractC9133u.m16131e(exerciseBean, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("exerciseBean", exerciseBean);
            } else {
                if (!Serializable.class.isAssignableFrom(ExerciseBean.class)) {
                    throw new UnsupportedOperationException(ExerciseBean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                Parcelable parcelable = this.f18336a;
                AbstractC9133u.m16131e(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("exerciseBean", (Serializable) parcelable);
            }
            bundle.putInt("groupId", this.f18337b);
            bundle.putInt("index", this.f18338c);
            return bundle;
        }

        public int hashCode() {
            return (((this.f18336a.hashCode() * 31) + Integer.hashCode(this.f18337b)) * 31) + Integer.hashCode(this.f18338c);
        }

        public String toString() {
            return "ActionGlobalExerciseHistoryStudentFragment(exerciseBean=" + this.f18336a + ", groupId=" + this.f18337b + ", index=" + this.f18338c + ")";
        }
    }

    /* renamed from: m4.l$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f18340a;

        /* renamed from: b */
        public final int f18341b;

        public b(String url) {
            AbstractC9133u.m16133g(url, "url");
            this.f18340a = url;
            this.f18341b = R$id.action_global_showBigImageDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f18340a, ((b) obj).f18340a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f18341b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f18340a);
            return bundle;
        }

        public int hashCode() {
            return this.f18340a.hashCode();
        }

        public String toString() {
            return "ActionGlobalShowBigImageDialog(url=" + this.f18340a + ")";
        }
    }

    /* renamed from: m4.l$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ NavDirections m17112b(c cVar, ExerciseBean exerciseBean, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return cVar.m17113a(exerciseBean, i10, i11);
        }

        /* renamed from: a */
        public final NavDirections m17113a(ExerciseBean exerciseBean, int i10, int i11) {
            AbstractC9133u.m16133g(exerciseBean, "exerciseBean");
            return new a(exerciseBean, i10, i11);
        }

        /* renamed from: c */
        public final NavDirections m17114c(String url) {
            AbstractC9133u.m16133g(url, "url");
            return new b(url);
        }

        public c() {
        }
    }
}
