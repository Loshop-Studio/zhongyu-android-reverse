package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "positionalThreshold", "Landroidx/compose/material3/SwipeToDismissBoxState;", "rememberSwipeToDismissBoxState", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Landroidx/compose/foundation/layout/RowScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "backgroundContent", "Landroidx/compose/ui/Modifier;", "modifier", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "gesturesEnabled", "content", "SwipeToDismissBox", "(Landroidx/compose/material3/SwipeToDismissBoxState;Lr6/f;Landroidx/compose/ui/Modifier;ZZZLr6/f;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "DismissVelocityThreshold", "F", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,266:1\n77#2:267\n77#2:274\n1223#3,6:268\n1223#3,6:351\n71#4:275\n68#4,6:276\n74#4:310\n78#4:400\n78#5,6:282\n85#5,4:297\n89#5,2:307\n78#5,6:318\n85#5,4:333\n89#5,2:343\n93#5:349\n78#5,6:364\n85#5,4:379\n89#5,2:389\n93#5:395\n93#5:399\n368#6,9:288\n377#6:309\n368#6,9:324\n377#6:345\n378#6,2:347\n368#6,9:370\n377#6:391\n378#6,2:393\n378#6,2:397\n4032#7,6:301\n4032#7,6:337\n4032#7,6:383\n98#8:311\n95#8,6:312\n101#8:346\n105#8:350\n98#8:357\n95#8,6:358\n101#8:392\n105#8:396\n148#9:401\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n188#1:267\n226#1:274\n196#1:268,6\n240#1:351,6\n228#1:275\n228#1:276,6\n228#1:310\n228#1:400\n228#1:282,6\n228#1:297,4\n228#1:307,2\n236#1:318,6\n236#1:333,4\n236#1:343,2\n236#1:349\n237#1:364,6\n237#1:379,4\n237#1:389,2\n237#1:395\n228#1:399\n228#1:288,9\n228#1:309\n236#1:324,9\n236#1:345\n236#1:347,2\n237#1:370,9\n237#1:391\n237#1:393,2\n228#1:397,2\n228#1:301,6\n236#1:337,6\n237#1:383,6\n236#1:311\n236#1:312,6\n236#1:346\n236#1:350\n237#1:357\n237#1:358,6\n237#1:392\n237#1:396\n265#1:401\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissBoxKt {
    private static final float DismissVelocityThreshold = C2331Dp.m13305constructorimpl(125);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
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
    public static final void SwipeToDismissBox(@org.jetbrains.annotations.NotNull final androidx.compose.material3.SwipeToDismissBoxState r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, boolean r30, boolean r31, boolean r32, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6474f r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox(androidx.compose.material3.SwipeToDismissBoxState, r6.f, androidx.compose.ui.Modifier, boolean, boolean, boolean, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @NotNull
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(@Nullable final SwipeToDismissBoxValue swipeToDismissBoxValue, @Nullable final InterfaceC6471c interfaceC6471c, @Nullable final InterfaceC6471c interfaceC6471c2, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((i8 & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.SwipeToDismissBoxKt.rememberSwipeToDismissBoxState.1
                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull SwipeToDismissBoxValue swipeToDismissBoxValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i8 & 4) != 0) {
            interfaceC6471c2 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-246335487, i, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:186)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.INSTANCE.Saver(interfaceC6471c, interfaceC6471c2, density);
        boolean zChanged = (((6 ^ (i & 14)) > 4 && composer.changed(swipeToDismissBoxValue)) || (i & 6) == 4) | composer.changed(density) | ((((i & 112) ^ 48) > 32 && composer.changed(interfaceC6471c)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(interfaceC6471c2)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final SwipeToDismissBoxState invoke() {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, interfaceC6471c, interfaceC6471c2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeToDismissBoxState;
    }
}
