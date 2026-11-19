package p176m4;

import android.os.Bundle;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: m4.k */
/* loaded from: classes4.dex */
public abstract class AbstractC9310k {

    /* renamed from: a */
    public static final b f18332a = new b(null);

    /* renamed from: m4.k$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f18333a;

        /* renamed from: b */
        public final int f18334b;

        public a(String url) {
            AbstractC9133u.m16133g(url, "url");
            this.f18333a = url;
            this.f18334b = R$id.action_global_showBigImageDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f18333a, ((a) obj).f18333a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f18334b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f18333a);
            return bundle;
        }

        public int hashCode() {
            return this.f18333a.hashCode();
        }

        public String toString() {
            return "ActionGlobalShowBigImageDialog(url=" + this.f18333a + ")";
        }
    }

    /* renamed from: m4.k$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m17110a() {
            return new ActionOnlyNavDirections(R$id.action_global_mainFragment);
        }

        /* renamed from: b */
        public final NavDirections m17111b(String url) {
            AbstractC9133u.m16133g(url, "url");
            return new a(url);
        }

        public b() {
        }
    }
}
