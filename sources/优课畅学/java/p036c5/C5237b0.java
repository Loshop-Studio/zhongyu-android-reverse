package p036c5;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.study.R$drawable;
import com.zykj.study.R$mipmap;
import com.zykj.study.R$string;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10575q;

/* renamed from: c5.b0 */
/* loaded from: classes5.dex */
public final class C5237b0 {

    /* renamed from: a */
    public static final C5237b0 f2323a = new C5237b0();

    /* renamed from: b */
    public static InterfaceC10575q f2324b = ComposableLambdaKt.composableLambdaInstance(1475790299, false, new InterfaceC10575q() { // from class: c5.y
        @Override // p300x7.InterfaceC10575q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C5237b0.m2150h((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static InterfaceC10575q f2325c = ComposableLambdaKt.composableLambdaInstance(1293175538, false, new InterfaceC10575q() { // from class: c5.z
        @Override // p300x7.InterfaceC10575q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C5237b0.m2149g((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: d */
    public static InterfaceC10575q f2326d = ComposableLambdaKt.composableLambdaInstance(-746338083, false, new InterfaceC10575q() { // from class: c5.a0
        @Override // p300x7.InterfaceC10575q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C5237b0.m2151i((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: g */
    public static final C8736p m2149g(LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1293175538, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizedResultCardKt.lambda$1293175538.<anonymous> (AuthorizedResultCard.kt:86)");
            }
            AbstractC5236b.m2144b(StringResources_androidKt.stringResource(R$string.empty_authorized_list, composer, 0), R$mipmap.icon_empty_authorized_list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: h */
    public static final C8736p m2150h(LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1475790299, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizedResultCardKt.lambda$1475790299.<anonymous> (AuthorizedResultCard.kt:79)");
            }
            AbstractC5236b.m2144b(StringResources_androidKt.stringResource(com.zykj.lib.error.code.R$string.net_no_connect, composer, 0), R$drawable.ic_no_net, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public static final C8736p m2151i(LazyItemScope item, Composer composer, int i10) {
        AbstractC9133u.m16133g(item, "$this$item");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-746338083, i10, -1, "com.zykj.study.ui.home.my.card.ComposableSingletons$AuthorizedResultCardKt.lambda$-746338083.<anonymous> (AuthorizedResultCard.kt:95)");
            }
            AbstractC5236b.m2144b(StringResources_androidKt.stringResource(R$string.empty_authorized_list, composer, 0), R$mipmap.icon_empty_authorized_list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: d */
    public final InterfaceC10575q m2152d() {
        return f2326d;
    }

    /* renamed from: e */
    public final InterfaceC10575q m2153e() {
        return f2325c;
    }

    /* renamed from: f */
    public final InterfaceC10575q m2154f() {
        return f2324b;
    }
}
