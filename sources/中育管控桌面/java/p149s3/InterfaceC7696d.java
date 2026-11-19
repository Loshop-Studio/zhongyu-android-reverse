package p149s3;

import android.os.Bundle;
import androidx.navigation.AnimBuilder;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p149s3.InterfaceC7696d;

/* renamed from: s3.d */
/* loaded from: classes4.dex */
public interface InterfaceC7696d {

    /* renamed from: a0 */
    public static final a f10157a0 = a.f10158a;

    /* renamed from: s3.d$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f10158a = new a();

        /* renamed from: b */
        public static final Lazy f10159b = LazyKt.lazy(new Function0() { // from class: s3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterfaceC7696d.a.m9156e();
            }
        });

        /* renamed from: e */
        public static final NavOptions m9156e() {
            return NavOptionsBuilderKt.navOptions(new Function1() { // from class: s3.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InterfaceC7696d.a.m9157f((NavOptionsBuilder) obj);
                }
            });
        }

        /* renamed from: f */
        public static final Unit m9157f(NavOptionsBuilder navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.anim(new Function1() { // from class: s3.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InterfaceC7696d.a.m9158g((AnimBuilder) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* renamed from: g */
        public static final Unit m9158g(AnimBuilder anim) {
            Intrinsics.checkNotNullParameter(anim, "$this$anim");
            anim.setEnter(R.anim.slide_in_right);
            anim.setExit(R.anim.slide_out_left);
            anim.setPopEnter(R.anim.slide_in_left);
            anim.setPopExit(R.anim.slide_out_right);
            return Unit.INSTANCE;
        }

        /* renamed from: d */
        public final NavOptions m9159d() {
            return (NavOptions) f10159b.getValue();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9152a(InterfaceC7696d interfaceC7696d, int i6, Bundle bundle, NavOptions navOptions, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i7 & 2) != 0) {
            bundle = null;
        }
        if ((i7 & 4) != 0) {
            navOptions = f10157a0.m9159d();
        }
        interfaceC7696d.mo5283d(i6, bundle, navOptions);
    }

    /* renamed from: d */
    void mo5283d(int i6, Bundle bundle, NavOptions navOptions);
}
