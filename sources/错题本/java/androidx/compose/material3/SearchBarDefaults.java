package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u009e\u0001\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJÊ\u0001\u00101\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\u0006\u0010%\u001a\u00020$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020$2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\n\u001a\u00020\u001a2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b1\u00102J0\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u008a\u0001\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108R\u001d\u0010:\u001a\u0002098\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010>\u001a\u0002098\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R&\u0010@\u001a\u0002098\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b@\u0010;\u0012\u0004\bB\u0010\u0003\u001a\u0004\bA\u0010=R\u001d\u0010C\u001a\u0002098\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=R\u0011\u0010H\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0011\u0010L\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bK\u0010GR\u0011\u0010P\u001a\u00020M8G¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, m5110d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/SearchBarColors;", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "colors", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "", "query", "Lkotlin/Function1;", "Ld6/s;", "onQueryChange", "onSearch", "", "expanded", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "InputField", "(Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "placeholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/unit/Dp;", "TonalElevation", "F", "getTonalElevation-D9Ej5fM", "()F", "ShadowElevation", "getShadowElevation-D9Ej5fM", "Elevation", "getElevation-D9Ej5fM", "getElevation-D9Ej5fM$annotations", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getInputFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputFieldShape", "getFullScreenShape", "fullScreenShape", "getDockedShape", "dockedShape", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1243:1\n77#2:1244\n77#2:1257\n77#2:1260\n77#2:1275\n77#2:1288\n1223#3,6:1245\n1223#3,6:1251\n1223#3,6:1263\n1223#3,6:1269\n1223#3,6:1276\n1223#3,6:1282\n78#4:1258\n81#4:1259\n708#5:1261\n696#5:1262\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n418#1:1244\n501#1:1257\n507#1:1260\n535#1:1275\n606#1:1288\n497#1:1245,6\n500#1:1251,6\n522#1:1263,6\n523#1:1269,6\n538#1:1276,6\n567#1:1282,6\n503#1:1258\n504#1:1259\n507#1:1261\n507#1:1262\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;

    @NotNull
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        float fM9591getLevel0D9Ej5fM = elevationTokens.m9591getLevel0D9Ej5fM();
        TonalElevation = fM9591getLevel0D9Ej5fM;
        ShadowElevation = elevationTokens.m9591getLevel0D9Ej5fM();
        Elevation = fM9591getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m9892getContainerHeightD9Ej5fM();
    }

    private SearchBarDefaults() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8820getElevationD9Ej5fM$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void InputField(@org.jetbrains.annotations.NotNull final java.lang.String r83, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r84, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r85, final boolean r86, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r87, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r88, boolean r89, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r90, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r91, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r92, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r93, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r94, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r95, final int r96, final int r97, final int r98) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarDefaults.InputField(java.lang.String, r6.c, r6.c, boolean, r6.c, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, r6.e, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library.", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    @Composable
    @NotNull
    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m8821colorsKlgxPg(long j7, long j8, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i, int i8) {
        int i9;
        TextFieldColors textFieldColorsM8828inputFieldColorsITpI4ow;
        long value = (i8 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long value2 = (i8 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j8;
        if ((i8 & 4) != 0) {
            i9 = i;
            textFieldColorsM8828inputFieldColorsITpI4ow = m8828inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i << 3) & 57344, 16383);
        } else {
            i9 = i;
            textFieldColorsM8828inputFieldColorsITpI4ow = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216168196, i9, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, textFieldColorsM8828inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    @Composable
    @NotNull
    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final SearchBarColors m8822colorsdgg9oW8(long j7, long j8, @Nullable Composer composer, int i, int i8) {
        long value = (i8 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long value2 = (i8 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1507037523, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, m8828inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i << 6) & 57344, 16383), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    @Composable
    @JvmName(name = "getDockedShape")
    @NotNull
    public final Shape getDockedShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m8823getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getFullScreenShape")
    @NotNull
    public final Shape getFullScreenShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m8824getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    @Composable
    @JvmName(name = "getInputFieldShape")
    @NotNull
    public final Shape getInputFieldShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971556142, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m8825getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m8826getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2112270157, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statusBars;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m8827inputFieldColorsuKgnY(long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i, int i8, int i9) {
        long jM10681copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        long jM10681copywmQWz5c$default2;
        long jM10681copywmQWz5c$default3;
        long jM10681copywmQWz5c$default4;
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j7;
        if ((i9 & 2) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default = j8;
        }
        long value2 = (i9 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors3 = (i9 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value3 = (i9 & 16) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j10;
        long value4 = (i9 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        if ((i9 & 64) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            textSelectionColors2 = textSelectionColors3;
            jM10681copywmQWz5c$default2 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            textSelectionColors2 = textSelectionColors3;
            jM10681copywmQWz5c$default2 = j12;
        }
        long value5 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j13;
        long value6 = (i9 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if ((i9 & 512) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default3 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default3 = j15;
        }
        long value7 = (i9 & 1024) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j16;
        if ((i9 & 2048) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default4 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default4 = j17;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355927049, i, i8, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
        }
        int i10 = i << 3;
        int i11 = i8 << 6;
        int i12 = ((i >> 27) & 14) | ((i8 << 3) & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        long j18 = value7;
        TextFieldColors textFieldColorsM8828inputFieldColorsITpI4ow = m8828inputFieldColorsITpI4ow(value, value, jM10681copywmQWz5c$default, value2, textSelectionColors2, value3, value4, jM10681copywmQWz5c$default2, value5, value6, jM10681copywmQWz5c$default3, j18, j18, jM10681copywmQWz5c$default4, composer, (i & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), i12, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM8828inputFieldColorsITpI4ow;
    }

    @Composable
    @NotNull
    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m8828inputFieldColorsITpI4ow(long j7, long j8, long j9, long j10, @Nullable TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable Composer composer, int i, int i8, int i9) {
        long jM10681copywmQWz5c$default;
        long jM10681copywmQWz5c$default2;
        long jM10681copywmQWz5c$default3;
        long jM10681copywmQWz5c$default4;
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j7;
        long value2 = (i9 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j8;
        if ((i9 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default = j9;
        }
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors2 = (i9 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i9 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long value5 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        if ((i9 & 128) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default2 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default2 = j13;
        }
        long value6 = (i9 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        long value7 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        if ((i9 & 1024) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default3 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default3 = j16;
        }
        long value8 = (i9 & 2048) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j17;
        long value9 = (i9 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j18;
        if ((i9 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            jM10681copywmQWz5c$default4 = Color.m10681copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM10681copywmQWz5c$default4 = j19;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602148837, i, i8, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        int i10 = i8 << 18;
        int i11 = ((i >> 27) & 14) | ((i8 << 3) & 112) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        TextFieldColors textFieldColorsM9086colors0hiis_0 = TextFieldDefaults.INSTANCE.m9086colors0hiis_0(value, value2, jM10681copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, jM10681copywmQWz5c$default2, 0L, value6, value7, jM10681copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value8, value9, jM10681copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 1022) | ((i << 15) & 234881024), ((i >> 12) & 14) | (458752 & i) | (3670016 & i) | (i & 29360128) | ((i << 3) & 1879048192), i11, 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM9086colors0hiis_0;
    }
}
