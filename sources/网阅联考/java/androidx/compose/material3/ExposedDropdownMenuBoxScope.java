package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p006ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@ExperimentalMaterial3Api
@Metadata(m5174d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&J\f\u0010\u0012\u001a\u00020\t*\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m5175d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "menuAnchor", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {

    /* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void m264a(final androidx.compose.material3.ExposedDropdownMenuBoxScope r23, final boolean r24, final kotlin.jvm.functions.Function0 r25, androidx.compose.p006ui.Modifier r26, final kotlin.jvm.functions.Function3 r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.CC.m264a(androidx.compose.material3.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
        }

        /* renamed from: b */
        public static /* synthetic */ Modifier m265b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i4 & 1) != 0) {
                z3 = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z3);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z3, Function0<Unit> function0, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i4, int i5);

    Modifier exposedDropdownSize(Modifier modifier, boolean z3);

    Modifier menuAnchor(Modifier modifier);
}
