package p176m4;

import android.os.Bundle;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: m4.j */
/* loaded from: classes4.dex */
public abstract class AbstractC9309j {

    /* renamed from: a */
    public static final c f18327a = new c(null);

    /* renamed from: m4.j$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f18328a;

        /* renamed from: b */
        public final int f18329b;

        public a(String path) {
            AbstractC9133u.m16133g(path, "path");
            this.f18328a = path;
            this.f18329b = R$id.action_global_microPlayDialogFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f18328a, ((a) obj).f18328a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f18329b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("path", this.f18328a);
            return bundle;
        }

        public int hashCode() {
            return this.f18328a.hashCode();
        }

        public String toString() {
            return "ActionGlobalMicroPlayDialogFragment(path=" + this.f18328a + ")";
        }
    }

    /* renamed from: m4.j$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f18330a;

        /* renamed from: b */
        public final int f18331b;

        public b(String url) {
            AbstractC9133u.m16133g(url, "url");
            this.f18330a = url;
            this.f18331b = R$id.action_global_showBigImageDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f18330a, ((b) obj).f18330a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f18331b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f18330a);
            return bundle;
        }

        public int hashCode() {
            return this.f18330a.hashCode();
        }

        public String toString() {
            return "ActionGlobalShowBigImageDialog(url=" + this.f18330a + ")";
        }
    }

    /* renamed from: m4.j$c */
    public static final class c {
        public /* synthetic */ c(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m17107a() {
            return new ActionOnlyNavDirections(R$id.action_global_answerAreaFragment);
        }

        /* renamed from: b */
        public final NavDirections m17108b(String path) {
            AbstractC9133u.m16133g(path, "path");
            return new a(path);
        }

        /* renamed from: c */
        public final NavDirections m17109c(String url) {
            AbstractC9133u.m16133g(url, "url");
            return new b(url);
        }

        public c() {
        }
    }
}
