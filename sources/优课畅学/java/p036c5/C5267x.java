package p036c5;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.PrimitiveResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.lib.error.code.R$string;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$drawable;
import com.zykj.study.R$mipmap;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* renamed from: c5.x */
/* loaded from: classes5.dex */
public final class C5267x {

    /* renamed from: a */
    public static final C5267x f2389a = new C5267x();

    /* renamed from: b */
    public static InterfaceC10574p f2390b = ComposableLambdaKt.composableLambdaInstance(-264574877, false, new InterfaceC10574p() { // from class: c5.u
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Object obj, Object obj2) {
            return C5267x.m2177i((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static InterfaceC10575q f2391c = ComposableLambdaKt.composableLambdaInstance(1273636691, false, new InterfaceC10575q() { // from class: c5.v
        @Override // p300x7.InterfaceC10575q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C5267x.m2175g((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: d */
    public static InterfaceC10575q f2392d = ComposableLambdaKt.composableLambdaInstance(583763714, false, new InterfaceC10575q() { // from class: c5.w
        @Override // p300x7.InterfaceC10575q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C5267x.m2176h((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: g */
    public static final C8736p m2175g(LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1273636691, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizationSearchListKt.lambda$1273636691.<anonymous> (AuthorizationSearchList.kt:145)");
            }
            AbstractC5236b.m2144b(StringResources_androidKt.stringResource(R$string.net_no_connect, composer, 0), R$drawable.ic_no_net, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: h */
    public static final C8736p m2176h(LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583763714, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizationSearchListKt.lambda$583763714.<anonymous> (AuthorizationSearchList.kt:157)");
            }
            AbstractC5236b.m2144b(StringResources_androidKt.stringResource(com.zykj.study.R$string.hint_page_of_searching_teacher, composer, 0), R$mipmap.icon_search_no_keyword, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public static final C8736p m2177i(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264574877, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizationSearchListKt.lambda$-264574877.<anonymous> (AuthorizationSearchList.kt:65)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R$mipmap.icon_search, composer, 0), (String) null, SizeKt.m20905sizeVpY3zN4(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(R$dimen.view_10, composer, 0), PrimitiveResources_androidKt.dimensionResource(R$dimen.view_10, composer, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: d */
    public final InterfaceC10574p m2178d() {
        return f2390b;
    }

    /* renamed from: e */
    public final InterfaceC10575q m2179e() {
        return f2391c;
    }

    /* renamed from: f */
    public final InterfaceC10575q m2180f() {
        return f2392d;
    }
}
