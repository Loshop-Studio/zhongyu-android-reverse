package androidx.compose.material3;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0098\u0001\u0010&\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001f¢\u0006\u0002\b!¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010'J¢\u0001\u0010&\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001f¢\u0006\u0002\b!¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*JW\u0010&\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001f¢\u0006\u0002\b!¢\u0006\u0002\b\"H\u0007¢\u0006\u0004\b&\u0010+R\u001a\u0010.\u001a\u00020\u00058 X \u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0001\u0001/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m5110d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/MenuAnchorType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "enabled", "menuAnchor-fsE2BvY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "menuAnchor", "matchTextFieldWidth", "exposedDropdownSize", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenu-vNxi1II", "(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lr6/f;Landroidx/compose/runtime/Composer;III)V", "ExposedDropdownMenu", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "focusable", "ExposedDropdownMenu-kbRbctU", "(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lr6/f;Landroidx/compose/runtime/Composer;III)V", "(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "getAnchorType-Mg6Rgbw$material3_release", "()Ljava/lang/String;", "anchorType", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1490:1\n1223#2,6:1491\n1223#2,6:1499\n1223#2,6:1505\n1223#2,6:1511\n1223#2,6:1517\n77#3:1497\n77#3:1498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n348#1:1491,6\n354#1:1499,6\n358#1:1505,6\n362#1:1511,6\n364#1:1517,6\n349#1:1497\n350#1:1498\n*E\n"})
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(AbstractC5824e abstractC5824e) {
        this();
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z8);
    }

    /* renamed from: menuAnchor-fsE2BvY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8474menuAnchorfsE2BvY$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
        }
        if ((i & 2) != 0) {
            z8 = true;
        }
        return exposedDropdownMenuBoxScope.mo8478menuAnchorfsE2BvY(modifier, str, z8);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void ExposedDropdownMenu(final boolean r26, final p152r6.InterfaceC6469a r27, androidx.compose.p011ui.Modifier r28, androidx.compose.foundation.ScrollState r29, final p152r6.InterfaceC6474f r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, r6.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper MenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8475ExposedDropdownMenukbRbctU(final boolean r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.ScrollState r38, boolean r39, boolean r40, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r41, long r42, float r44, float r45, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r46, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r47, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m8475ExposedDropdownMenukbRbctU(boolean, r6.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8476ExposedDropdownMenuvNxi1II(final boolean r37, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r38, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.ScrollState r40, boolean r41, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r42, long r43, float r45, float r46, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r47, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r48, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m8476ExposedDropdownMenuvNxi1II(boolean, r6.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @NotNull
    public abstract Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z8);

    @NotNull
    /* renamed from: getAnchorType-Mg6Rgbw$material3_release, reason: not valid java name */
    public abstract String mo8477getAnchorTypeMg6Rgbw$material3_release();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes MenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    @NotNull
    public final Modifier menuAnchor(@NotNull Modifier modifier) {
        return m8474menuAnchorfsE2BvY$default(this, modifier, MenuAnchorType.INSTANCE.m8625getPrimaryNotEditableMg6Rgbw(), false, 2, null);
    }

    @NotNull
    /* renamed from: menuAnchor-fsE2BvY, reason: not valid java name */
    public abstract Modifier mo8478menuAnchorfsE2BvY(@NotNull Modifier modifier, @NotNull String str, boolean z8);

    private ExposedDropdownMenuBoxScope() {
    }
}
