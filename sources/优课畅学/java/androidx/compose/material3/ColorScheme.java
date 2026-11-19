package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes2.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private NavigationItemColors defaultExpressiveNavigationBarItemColorsCached;
    private IconButtonColors defaultFilledIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private TopAppBarColors defaultLargeTopAppBarColorsCached;
    private TopAppBarColors defaultMediumTopAppBarColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private IconButtonColors defaultOutlinedIconButtonColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    public /* synthetic */ ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45);
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21868copyCXl9yA$default(ColorScheme colorScheme, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        long j73;
        long j74;
        long j75;
        ColorScheme colorScheme2;
        long j76;
        long j77;
        long j78;
        long j79;
        long j80;
        long j81 = (i10 & 1) != 0 ? colorScheme.primary : j10;
        long j82 = (i10 & 2) != 0 ? colorScheme.onPrimary : j11;
        long j83 = (i10 & 4) != 0 ? colorScheme.primaryContainer : j12;
        long j84 = (i10 & 8) != 0 ? colorScheme.onPrimaryContainer : j13;
        long j85 = (i10 & 16) != 0 ? colorScheme.inversePrimary : j14;
        long j86 = (i10 & 32) != 0 ? colorScheme.secondary : j15;
        long j87 = (i10 & 64) != 0 ? colorScheme.onSecondary : j16;
        long j88 = j81;
        long j89 = (i10 & 128) != 0 ? colorScheme.secondaryContainer : j17;
        long j90 = (i10 & 256) != 0 ? colorScheme.onSecondaryContainer : j18;
        long j91 = (i10 & 512) != 0 ? colorScheme.tertiary : j19;
        long j92 = (i10 & 1024) != 0 ? colorScheme.onTertiary : j20;
        long j93 = (i10 & 2048) != 0 ? colorScheme.tertiaryContainer : j21;
        long j94 = (i10 & 4096) != 0 ? colorScheme.onTertiaryContainer : j22;
        long j95 = (i10 & 8192) != 0 ? colorScheme.background : j23;
        long j96 = (i10 & 16384) != 0 ? colorScheme.onBackground : j24;
        long j97 = (i10 & 32768) != 0 ? colorScheme.surface : j25;
        long j98 = (i10 & 65536) != 0 ? colorScheme.onSurface : j26;
        long j99 = (i10 & 131072) != 0 ? colorScheme.surfaceVariant : j27;
        long j100 = (i10 & 262144) != 0 ? colorScheme.onSurfaceVariant : j28;
        long j101 = (i10 & 524288) != 0 ? colorScheme.surfaceTint : j29;
        long j102 = (i10 & 1048576) != 0 ? colorScheme.inverseSurface : j30;
        long j103 = (i10 & 2097152) != 0 ? colorScheme.inverseOnSurface : j31;
        long j104 = (i10 & 4194304) != 0 ? colorScheme.error : j32;
        long j105 = (i10 & 8388608) != 0 ? colorScheme.onError : j33;
        long j106 = (i10 & 16777216) != 0 ? colorScheme.errorContainer : j34;
        long j107 = (i10 & 33554432) != 0 ? colorScheme.onErrorContainer : j35;
        long j108 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme.outline : j36;
        long j109 = (i10 & 134217728) != 0 ? colorScheme.outlineVariant : j37;
        long j110 = (i10 & 268435456) != 0 ? colorScheme.scrim : j38;
        long j111 = (i10 & 536870912) != 0 ? colorScheme.surfaceBright : j39;
        long j112 = (i10 & BasicMeasure.EXACTLY) != 0 ? colorScheme.surfaceDim : j40;
        long j113 = (i10 & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j41;
        long j114 = (i11 & 1) != 0 ? colorScheme.surfaceContainerHigh : j42;
        long j115 = (i11 & 2) != 0 ? colorScheme.surfaceContainerHighest : j43;
        long j116 = (i11 & 4) != 0 ? colorScheme.surfaceContainerLow : j44;
        if ((i11 & 8) != 0) {
            j47 = j116;
            j46 = colorScheme.surfaceContainerLowest;
            j49 = j110;
            j50 = j111;
            j51 = j112;
            j52 = j113;
            j53 = j114;
            j54 = j115;
            j56 = j103;
            j57 = j104;
            j58 = j105;
            j59 = j106;
            j60 = j107;
            j61 = j108;
            j48 = j109;
            j63 = j96;
            j64 = j97;
            j65 = j98;
            j66 = j99;
            j67 = j100;
            j68 = j101;
            j55 = j102;
            j70 = j89;
            j71 = j90;
            j72 = j91;
            j73 = j92;
            j74 = j93;
            j75 = j94;
            j62 = j95;
            colorScheme2 = colorScheme;
            j76 = j82;
            j77 = j83;
            j78 = j84;
            j79 = j85;
            j80 = j86;
            j69 = j87;
        } else {
            j46 = j45;
            j47 = j116;
            j48 = j109;
            j49 = j110;
            j50 = j111;
            j51 = j112;
            j52 = j113;
            j53 = j114;
            j54 = j115;
            j55 = j102;
            j56 = j103;
            j57 = j104;
            j58 = j105;
            j59 = j106;
            j60 = j107;
            j61 = j108;
            j62 = j95;
            j63 = j96;
            j64 = j97;
            j65 = j98;
            j66 = j99;
            j67 = j100;
            j68 = j101;
            j69 = j87;
            j70 = j89;
            j71 = j90;
            j72 = j91;
            j73 = j92;
            j74 = j93;
            j75 = j94;
            colorScheme2 = colorScheme;
            j76 = j82;
            j77 = j83;
            j78 = j84;
            j79 = j85;
            j80 = j86;
        }
        return colorScheme2.m21870copyCXl9yA(j88, j76, j77, j78, j79, j80, j69, j70, j71, j72, j73, j74, j75, j62, j63, j64, j65, j66, j67, j68, j55, j56, j57, j58, j59, j60, j61, j48, j49, j50, j51, j52, j53, j54, j47, j46);
    }

    /* renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21869copyG1PFcw$default(ColorScheme colorScheme, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        ColorScheme colorScheme2;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67 = (i10 & 1) != 0 ? colorScheme.primary : j10;
        long j68 = (i10 & 2) != 0 ? colorScheme.onPrimary : j11;
        long j69 = (i10 & 4) != 0 ? colorScheme.primaryContainer : j12;
        long j70 = (i10 & 8) != 0 ? colorScheme.onPrimaryContainer : j13;
        long j71 = (i10 & 16) != 0 ? colorScheme.inversePrimary : j14;
        long j72 = (i10 & 32) != 0 ? colorScheme.secondary : j15;
        long j73 = (i10 & 64) != 0 ? colorScheme.onSecondary : j16;
        long j74 = j67;
        long j75 = (i10 & 128) != 0 ? colorScheme.secondaryContainer : j17;
        long j76 = (i10 & 256) != 0 ? colorScheme.onSecondaryContainer : j18;
        long j77 = (i10 & 512) != 0 ? colorScheme.tertiary : j19;
        long j78 = (i10 & 1024) != 0 ? colorScheme.onTertiary : j20;
        long j79 = (i10 & 2048) != 0 ? colorScheme.tertiaryContainer : j21;
        long j80 = (i10 & 4096) != 0 ? colorScheme.onTertiaryContainer : j22;
        long j81 = (i10 & 8192) != 0 ? colorScheme.background : j23;
        long j82 = (i10 & 16384) != 0 ? colorScheme.onBackground : j24;
        long j83 = (i10 & 32768) != 0 ? colorScheme.surface : j25;
        long j84 = (i10 & 65536) != 0 ? colorScheme.onSurface : j26;
        long j85 = (i10 & 131072) != 0 ? colorScheme.surfaceVariant : j27;
        long j86 = (i10 & 262144) != 0 ? colorScheme.onSurfaceVariant : j28;
        long j87 = (i10 & 524288) != 0 ? colorScheme.surfaceTint : j29;
        long j88 = (i10 & 1048576) != 0 ? colorScheme.inverseSurface : j30;
        long j89 = (i10 & 2097152) != 0 ? colorScheme.inverseOnSurface : j31;
        long j90 = (i10 & 4194304) != 0 ? colorScheme.error : j32;
        long j91 = (i10 & 8388608) != 0 ? colorScheme.onError : j33;
        long j92 = (i10 & 16777216) != 0 ? colorScheme.errorContainer : j34;
        long j93 = (i10 & 33554432) != 0 ? colorScheme.onErrorContainer : j35;
        long j94 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme.outline : j36;
        long j95 = (i10 & 134217728) != 0 ? colorScheme.outlineVariant : j37;
        if ((i10 & 268435456) != 0) {
            j40 = j95;
            j39 = colorScheme.scrim;
            j42 = j89;
            j43 = j90;
            j44 = j91;
            j45 = j92;
            j46 = j93;
            j47 = j94;
            j49 = j82;
            j50 = j83;
            j51 = j84;
            j52 = j85;
            j53 = j86;
            j54 = j87;
            j41 = j88;
            j56 = j75;
            j57 = j76;
            j58 = j77;
            j59 = j78;
            j60 = j79;
            j61 = j80;
            j48 = j81;
            colorScheme2 = colorScheme;
            j62 = j68;
            j63 = j69;
            j64 = j70;
            j65 = j71;
            j66 = j72;
            j55 = j73;
        } else {
            j39 = j38;
            j40 = j95;
            j41 = j88;
            j42 = j89;
            j43 = j90;
            j44 = j91;
            j45 = j92;
            j46 = j93;
            j47 = j94;
            j48 = j81;
            j49 = j82;
            j50 = j83;
            j51 = j84;
            j52 = j85;
            j53 = j86;
            j54 = j87;
            j55 = j73;
            j56 = j75;
            j57 = j76;
            j58 = j77;
            j59 = j78;
            j60 = j79;
            j61 = j80;
            colorScheme2 = colorScheme;
            j62 = j68;
            j63 = j69;
            j64 = j70;
            j65 = j71;
            j66 = j72;
        }
        return colorScheme2.m21871copyG1PFcw(j74, j62, j63, j64, j65, j66, j55, j56, j57, j58, j59, j60, j61, j48, j49, j50, j51, j52, j53, j54, j41, j42, j43, j44, j45, j46, j47, j40, j39);
    }

    /* renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m921x47b39765() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    /* renamed from: getDefaultLargeTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m922xb8636ff9() {
    }

    /* renamed from: getDefaultMediumTopAppBarColorsCached$material3_release$annotations */
    public static /* synthetic */ void m923xe7680889() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    /* renamed from: getDefaultSegmentedButtonColorsCached$material3_release$annotations */
    public static /* synthetic */ void m924xc0225afb() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m21870copyCXl9yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, null);
    }

    @InterfaceC8721a
    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m21871copyG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m21868copyCXl9yA$default(this, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m21872getBackground0d7_KjU() {
        return this.background;
    }

    public final ChipColors getDefaultAssistChipColorsCached$material3_release() {
        return this.defaultAssistChipColorsCached;
    }

    public final ButtonColors getDefaultButtonColorsCached$material3_release() {
        return this.defaultButtonColorsCached;
    }

    public final CardColors getDefaultCardColorsCached$material3_release() {
        return this.defaultCardColorsCached;
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached$material3_release() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    public final CheckboxColors getDefaultCheckboxColorsCached$material3_release() {
        return this.defaultCheckboxColorsCached;
    }

    public final DatePickerColors getDefaultDatePickerColorsCached$material3_release() {
        return this.defaultDatePickerColorsCached;
    }

    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3_release() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    public final ButtonColors getDefaultElevatedButtonColorsCached$material3_release() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final CardColors getDefaultElevatedCardColorsCached$material3_release() {
        return this.defaultElevatedCardColorsCached;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3_release() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3_release() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    /* renamed from: getDefaultExpressiveNavigationBarItemColorsCached$material3_release */
    public final NavigationItemColors m925x3d63aaa1() {
        return this.defaultExpressiveNavigationBarItemColorsCached;
    }

    public final IconButtonColors getDefaultFilledIconButtonColorsCached$material3_release() {
        return this.defaultFilledIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached$material3_release() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3_release() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached$material3_release() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    /* renamed from: getDefaultFilledTonalIconToggleButtonColorsCached$material3_release */
    public final IconToggleButtonColors m926x5914e7b2() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    public final SelectableChipColors getDefaultFilterChipColorsCached$material3_release() {
        return this.defaultFilterChipColorsCached;
    }

    public final IconButtonColors getDefaultIconButtonColorsCached$material3_release() {
        return this.defaultIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached$material3_release() {
        return this.defaultIconToggleButtonColorsCached;
    }

    public final SelectableChipColors getDefaultInputChipColorsCached$material3_release() {
        return this.defaultInputChipColorsCached;
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached$material3_release() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached$material3_release() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    public final MenuItemColors getDefaultMenuItemColorsCached$material3_release() {
        return this.defaultMenuItemColorsCached;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3_release() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3_release() {
        return this.defaultNavigationRailItemColorsCached;
    }

    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3_release() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final CardColors getDefaultOutlinedCardColorsCached$material3_release() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached$material3_release() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached$material3_release() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3_release() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3_release() {
        return this.defaultRadioButtonColorsCached;
    }

    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3_release() {
        return this.defaultRichTooltipColorsCached;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3_release() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final SliderColors getDefaultSliderColorsCached$material3_release() {
        return this.defaultSliderColorsCached;
    }

    public final ChipColors getDefaultSuggestionChipColorsCached$material3_release() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final SwitchColors getDefaultSwitchColorsCached$material3_release() {
        return this.defaultSwitchColorsCached;
    }

    public final ButtonColors getDefaultTextButtonColorsCached$material3_release() {
        return this.defaultTextButtonColorsCached;
    }

    public final TextFieldColors getDefaultTextFieldColorsCached$material3_release() {
        return this.defaultTextFieldColorsCached;
    }

    public final TimePickerColors getDefaultTimePickerColorsCached$material3_release() {
        return this.defaultTimePickerColorsCached;
    }

    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3_release() {
        return this.defaultTopAppBarColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m21873getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m21874getErrorContainer0d7_KjU() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m21875getInverseOnSurface0d7_KjU() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m21876getInversePrimary0d7_KjU() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m21877getInverseSurface0d7_KjU() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m21878getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m21879getOnError0d7_KjU() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m21880getOnErrorContainer0d7_KjU() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m21881getOnPrimary0d7_KjU() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21882getOnPrimaryContainer0d7_KjU() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m21883getOnSecondary0d7_KjU() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21884getOnSecondaryContainer0d7_KjU() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m21885getOnSurface0d7_KjU() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m21886getOnSurfaceVariant0d7_KjU() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m21887getOnTertiary0d7_KjU() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21888getOnTertiaryContainer0d7_KjU() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m21889getOutline0d7_KjU() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m21890getOutlineVariant0d7_KjU() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m21891getPrimary0d7_KjU() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21892getPrimaryContainer0d7_KjU() {
        return this.primaryContainer;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m21893getScrim0d7_KjU() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m21894getSecondary0d7_KjU() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21895getSecondaryContainer0d7_KjU() {
        return this.secondaryContainer;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m21896getSurface0d7_KjU() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name */
    public final long m21897getSurfaceBright0d7_KjU() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name */
    public final long m21898getSurfaceContainer0d7_KjU() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name */
    public final long m21899getSurfaceContainerHigh0d7_KjU() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name */
    public final long m21900getSurfaceContainerHighest0d7_KjU() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name */
    public final long m21901getSurfaceContainerLow0d7_KjU() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name */
    public final long m21902getSurfaceContainerLowest0d7_KjU() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name */
    public final long m21903getSurfaceDim0d7_KjU() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m21904getSurfaceTint0d7_KjU() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m21905getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m21906getTertiary0d7_KjU() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m21907getTertiaryContainer0d7_KjU() {
        return this.tertiaryContainer;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    /* renamed from: setDefaultExpressiveNavigationBarItemColorsCached$material3_release */
    public final void m927x8a7577ad(NavigationItemColors navigationItemColors) {
        this.defaultExpressiveNavigationBarItemColorsCached = navigationItemColors;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    /* renamed from: setDefaultFilledTonalIconToggleButtonColorsCached$material3_release */
    public final void m928xa626b4be(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3_release(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultSliderColorsCached$material3_release(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3_release(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m24284toStringimpl(this.primary)) + "onPrimary=" + ((Object) Color.m24284toStringimpl(this.onPrimary)) + "primaryContainer=" + ((Object) Color.m24284toStringimpl(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.m24284toStringimpl(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) Color.m24284toStringimpl(this.inversePrimary)) + "secondary=" + ((Object) Color.m24284toStringimpl(this.secondary)) + "onSecondary=" + ((Object) Color.m24284toStringimpl(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.m24284toStringimpl(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.m24284toStringimpl(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.m24284toStringimpl(this.tertiary)) + "onTertiary=" + ((Object) Color.m24284toStringimpl(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.m24284toStringimpl(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.m24284toStringimpl(this.onTertiaryContainer)) + "background=" + ((Object) Color.m24284toStringimpl(this.background)) + "onBackground=" + ((Object) Color.m24284toStringimpl(this.onBackground)) + "surface=" + ((Object) Color.m24284toStringimpl(this.surface)) + "onSurface=" + ((Object) Color.m24284toStringimpl(this.onSurface)) + "surfaceVariant=" + ((Object) Color.m24284toStringimpl(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.m24284toStringimpl(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.m24284toStringimpl(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.m24284toStringimpl(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.m24284toStringimpl(this.inverseOnSurface)) + "error=" + ((Object) Color.m24284toStringimpl(this.error)) + "onError=" + ((Object) Color.m24284toStringimpl(this.onError)) + "errorContainer=" + ((Object) Color.m24284toStringimpl(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.m24284toStringimpl(this.onErrorContainer)) + "outline=" + ((Object) Color.m24284toStringimpl(this.outline)) + "outlineVariant=" + ((Object) Color.m24284toStringimpl(this.outlineVariant)) + "scrim=" + ((Object) Color.m24284toStringimpl(this.scrim)) + "surfaceBright=" + ((Object) Color.m24284toStringimpl(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.m24284toStringimpl(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.m24284toStringimpl(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.m24284toStringimpl(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.m24284toStringimpl(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.m24284toStringimpl(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.m24284toStringimpl(this.surfaceContainerLowest)) + ')';
    }

    @InterfaceC8721a
    public /* synthetic */ ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38);
    }

    private ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        this.primary = j10;
        this.onPrimary = j11;
        this.primaryContainer = j12;
        this.onPrimaryContainer = j13;
        this.inversePrimary = j14;
        this.secondary = j15;
        this.onSecondary = j16;
        this.secondaryContainer = j17;
        this.onSecondaryContainer = j18;
        this.tertiary = j19;
        this.onTertiary = j20;
        this.tertiaryContainer = j21;
        this.onTertiaryContainer = j22;
        this.background = j23;
        this.onBackground = j24;
        this.surface = j25;
        this.onSurface = j26;
        this.surfaceVariant = j27;
        this.onSurfaceVariant = j28;
        this.surfaceTint = j29;
        this.inverseSurface = j30;
        this.inverseOnSurface = j31;
        this.error = j32;
        this.onError = j33;
        this.errorContainer = j34;
        this.onErrorContainer = j35;
        this.outline = j36;
        this.outlineVariant = j37;
        this.scrim = j38;
        this.surfaceBright = j39;
        this.surfaceDim = j40;
        this.surfaceContainer = j41;
        this.surfaceContainerHigh = j42;
        this.surfaceContainerHighest = j43;
        this.surfaceContainerLow = j44;
        this.surfaceContainerLowest = j45;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        Color.Companion companion = Color.Companion;
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), companion.m24312getUnspecified0d7_KjU(), null);
    }
}
