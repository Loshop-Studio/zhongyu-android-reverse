package p371v3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.FavoriteBorderKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* renamed from: v3.f */
/* loaded from: classes4.dex */
public final class C11476f {

    /* renamed from: a */
    public static final C11476f f27316a = new C11476f();

    /* renamed from: b */
    public static InterfaceC9544p f27317b = ComposableLambdaKt.composableLambdaInstance(-93972196, false, new InterfaceC9544p() { // from class: v3.e
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Object obj, Object obj2) {
            return C11476f.m25378c((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static final C10786q m25378c(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-93972196, i10, -1, "com.friday.main.view.ComposableSingletons$DBActivityKt.lambda$-93972196.<anonymous> (DBActivity.kt:80)");
            }
            IconKt.m28746Iconww6aTOc(FavoriteBorderKt.getFavoriteBorder(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: b */
    public final InterfaceC9544p m25379b() {
        return f27317b;
    }
}
