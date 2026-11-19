package p057f4;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.manage.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f4.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6340m0 {

    /* renamed from: a */
    public static final b f7710a = new b(null);

    /* renamed from: f4.m0$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final long f7711a;

        /* renamed from: b */
        public final long f7712b;

        /* renamed from: c */
        public final String f7713c;

        /* renamed from: d */
        public final String f7714d;

        /* renamed from: e */
        public final int f7715e;

        public a(long j6, long j7, String creatorName, String str) {
            Intrinsics.checkNotNullParameter(creatorName, "creatorName");
            this.f7711a = j6;
            this.f7712b = j7;
            this.f7713c = creatorName;
            this.f7714d = str;
            this.f7715e = R.id.action_notificationFragment_to_notificationDetailFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7711a == aVar.f7711a && this.f7712b == aVar.f7712b && Intrinsics.areEqual(this.f7713c, aVar.f7713c) && Intrinsics.areEqual(this.f7714d, aVar.f7714d);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f7715e;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putLong("messageId", this.f7711a);
            bundle.putLong("parameterId", this.f7712b);
            bundle.putString("creatorName", this.f7713c);
            bundle.putString("createTime", this.f7714d);
            return bundle;
        }

        public int hashCode() {
            int iHashCode = ((((Long.hashCode(this.f7711a) * 31) + Long.hashCode(this.f7712b)) * 31) + this.f7713c.hashCode()) * 31;
            String str = this.f7714d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ActionNotificationFragmentToNotificationDetailFragment(messageId=" + this.f7711a + ", parameterId=" + this.f7712b + ", creatorName=" + this.f7713c + ", createTime=" + this.f7714d + ")";
        }
    }

    /* renamed from: f4.m0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m6474a(long j6, long j7, String creatorName, String str) {
            Intrinsics.checkNotNullParameter(creatorName, "creatorName");
            return new a(j6, j7, creatorName, str);
        }

        public b() {
        }
    }
}
