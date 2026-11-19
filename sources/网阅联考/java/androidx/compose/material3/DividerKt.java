package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(m5174d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, m5175d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DividerKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public static final void m7951Divider9IZ8Weo(Modifier modifier, float f4, long j4, Composer composer, final int i4, final int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1562471785);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i6 |= ((i5 & 4) == 0 && composerStartRestartGroup.changed(j4)) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i8 != 0) {
                    f4 = DividerDefaults.INSTANCE.m7950getThicknessD9Ej5fM();
                }
                if ((i5 & 4) != 0) {
                    j4 = DividerDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562471785, i4, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(1232935509);
            float fM11525constructorimpl = C1700Dp.m11530equalsimpl0(f4, C1700Dp.INSTANCE.m11543getHairlineD9Ej5fM()) ? C1700Dp.m11525constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f4;
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m7068backgroundbw27NRU$default(SizeKt.m7345height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), fM11525constructorimpl), j4, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f5 = f4;
        final long j5 = j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i9) {
                DividerKt.m7951Divider9IZ8Weo(modifier2, f5, j5, composer2, i4 | 1, i5);
            }
        });
    }
}
