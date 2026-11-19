package androidx.compose.material3;

import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SwipeToDismissBoxKt {
    private static final float DismissVelocityThreshold = C3186Dp.m33501constructorimpl(125);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwipeToDismissBox(final androidx.compose.material3.SwipeToDismissBoxState r27, final p181hd.InterfaceC9545q r28, androidx.compose.p014ui.Modifier r29, boolean r30, boolean r31, boolean r32, final p181hd.InterfaceC9545q r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox(androidx.compose.material3.SwipeToDismissBoxState, hd.q, androidx.compose.ui.Modifier, boolean, boolean, boolean, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(final SwipeToDismissBoxValue swipeToDismissBoxValue, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((i11 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.SwipeToDismissBoxKt.rememberSwipeToDismissBoxState.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l2 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-246335487, i10, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:186)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.Companion.Saver(interfaceC9540l, interfaceC9540l2, density);
        boolean zChanged = (((6 ^ (i10 & 14)) > 4 && composer.changed(swipeToDismissBoxValue)) || (i10 & 6) == 4) | composer.changed(density) | ((((i10 & 112) ^ 48) > 32 && composer.changed(interfaceC9540l)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(interfaceC9540l2)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final SwipeToDismissBoxState invoke() {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, interfaceC9540l, interfaceC9540l2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeToDismissBoxState;
    }
}
