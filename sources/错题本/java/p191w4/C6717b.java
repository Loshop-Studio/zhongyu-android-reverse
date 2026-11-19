package p191w4;

import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: w4.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6717b implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f11337a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6473e f11338b;

    public /* synthetic */ C6717b(InterfaceC6473e interfaceC6473e, int i) {
        this.f11337a = i;
        this.f11338b = interfaceC6473e;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11337a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1047862485, iIntValue, -1, "com.zykj.mistake.platform.MainRouteCompositionLocals.<anonymous> (MainRouteCompositionLocals.kt:26)");
                    }
                    this.f11338b.invoke(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2100617979, iIntValue2, -1, "com.zykj.mistake.platform.compose.AppComposeTheme.<anonymous> (AppComposeTheme.kt:15)");
                    }
                    MaterialThemeKt.MaterialTheme(null, null, null, this.f11338b, composer2, 0, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return C5443s.f8405a;
    }
}
