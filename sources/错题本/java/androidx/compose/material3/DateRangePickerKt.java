package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.ScrollAxisRange;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a`\u0010#\u001a\u00020\u00002\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a½\u0001\u00105\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00172:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a²\u0001\u00106\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b6\u00107\u001a²\u0001\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00070.2\u0006\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b:\u0010;\u001ag\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010\u00112\b\u0010>\u001a\u0004\u0018\u00010\u00112:\u0010-\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00070(H\u0002¢\u0006\u0004\b?\u0010@\u001a&\u0010H\u001a\u00020\u0007*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0000ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a5\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010\u0001\u001a\u0002082\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020KH\u0002¢\u0006\u0004\bP\u0010Q\"\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0014\u0010W\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010T\"\u0014\u0010X\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010T\"\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, m5110d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lr6/e;Lr6/e;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lx6/f;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "DateRangePickerState", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startDateMillis", "endDateMillis", "onDatesSelectionChange", "Lkotlin/Function1;", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILr6/e;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "SwitchableDateEntryContent", "DateRangePickerContent", "(Ljava/lang/Long;Ljava/lang/Long;JLr6/e;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "VerticalMonthsList", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lr6/e;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "updateDateSelection", "(JLjava/lang/Long;Ljava/lang/Long;Lr6/e;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Lkotlinx/coroutines/v;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/v;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/Dp;", "HeaderHeightOffset", "F", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1072:1\n1223#2,6:1073\n1223#2,6:1079\n1223#2,6:1086\n1223#2,6:1092\n1223#2,6:1138\n1223#2,6:1144\n56#3:1085\n85#4:1098\n82#4,6:1099\n88#4:1133\n92#4:1137\n78#5,6:1105\n85#5,4:1120\n89#5,2:1130\n93#5:1136\n368#6,9:1111\n377#6:1132\n378#6,2:1134\n4032#7,6:1124\n57#8,4:1150\n57#8,4:1154\n148#9:1158\n148#9:1159\n148#9:1160\n148#9:1161\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n96#1:1073,6\n116#1:1079,6\n264#1:1086,6\n726#1:1092,6\n771#1:1138,6\n854#1:1144,6\n135#1:1085\n734#1:1098\n734#1:1099,6\n734#1:1133\n734#1:1137\n734#1:1105,6\n734#1:1120,4\n734#1:1130,2\n734#1:1136\n734#1:1111,9\n734#1:1132\n734#1:1134,2\n734#1:1124,6\n974#1:1150,4\n975#1:1154,4\n885#1:1158\n1064#1:1159\n1066#1:1160\n1071#1:1161\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangePickerKt {

    @NotNull
    private static final PaddingValues DateRangePickerHeadlinePadding;

    @NotNull
    private static final PaddingValues DateRangePickerTitlePadding;

    @NotNull
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(24), C2331Dp.m13305constructorimpl(20), 0.0f, C2331Dp.m13305constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = C2331Dp.m13305constructorimpl(60);

    static {
        float f = 64;
        float f7 = 12;
        DateRangePickerTitlePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(f), 0.0f, C2331Dp.m13305constructorimpl(f7), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m7259PaddingValuesa9UjIt4$default(C2331Dp.m13305constructorimpl(f), 0.0f, C2331Dp.m13305constructorimpl(f7), C2331Dp.m13305constructorimpl(f7), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DateRangePicker(@org.jetbrains.annotations.NotNull final androidx.compose.material3.DateRangePickerState r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerFormatter r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r29, boolean r30, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerColors r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, r6.e, r6.e, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0201  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DateRangePickerContent(final java.lang.Long r18, final java.lang.Long r19, final long r20, final p152r6.InterfaceC6473e r22, final p152r6.InterfaceC6471c r23, final androidx.compose.material3.internal.CalendarModel r24, final p200x6.C6756f r25, final androidx.compose.material3.DatePickerFormatter r26, final androidx.compose.material3.SelectableDates r27, final androidx.compose.material3.DatePickerColors r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent(java.lang.Long, java.lang.Long, long, r6.e, r6.c, androidx.compose.material3.internal.CalendarModel, x6.f, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m8436DateRangePickerStateHVP43zI(@NotNull Locale locale, @Nullable Long l, @Nullable Long l3, @Nullable Long l8, @NotNull C6756f c6756f, int i, @NotNull SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l, l3, l8, c6756f, i, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m8437DateRangePickerStateHVP43zI$default(Locale locale, Long l, Long l3, Long l8, C6756f c6756f, int i, SelectableDates selectableDates, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            l = null;
        }
        if ((i8 & 4) != 0) {
            l3 = null;
        }
        if ((i8 & 8) != 0) {
            l8 = l;
        }
        if ((i8 & 16) != 0) {
            c6756f = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i8 & 32) != 0) {
            i = DisplayMode.INSTANCE.m8464getPickerjFl4v0();
        }
        if ((i8 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m8436DateRangePickerStateHVP43zI(locale, l, l3, l8, c6756f, i, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m8438SwitchableDateEntryContentRN2D1Q(final Long l, final Long l3, final long j7, final int i, final InterfaceC6473e interfaceC6473e, final InterfaceC6471c interfaceC6471c, final CalendarModel calendarModel, final C6756f c6756f, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i8, final int i9) {
        int i10;
        Long l8;
        long j8;
        InterfaceC6473e interfaceC6473e2;
        InterfaceC6471c interfaceC6471c2;
        CalendarModel calendarModel2;
        C6756f c6756f2;
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532789335);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            l8 = l3;
            i10 |= composerStartRestartGroup.changed(l8) ? 32 : 16;
        } else {
            l8 = l3;
        }
        if ((i8 & 384) == 0) {
            j8 = j7;
            i10 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        } else {
            j8 = j7;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            interfaceC6473e2 = interfaceC6473e;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 16384 : 8192;
        } else {
            interfaceC6473e2 = interfaceC6473e;
        }
        if ((196608 & i8) == 0) {
            interfaceC6471c2 = interfaceC6471c;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6471c2) ? 131072 : 65536;
        } else {
            interfaceC6471c2 = interfaceC6471c;
        }
        if ((1572864 & i8) == 0) {
            calendarModel2 = calendarModel;
            i10 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 1048576 : 524288;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((12582912 & i8) == 0) {
            c6756f2 = c6756f;
            i10 |= composerStartRestartGroup.changedInstance(c6756f2) ? 8388608 : 4194304;
        } else {
            c6756f2 = c6756f;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= (i8 & 134217728) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i10 & 306783379) == 306783378 && (i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i10, i11, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:665)");
            }
            final Long l9 = l8;
            final InterfaceC6473e interfaceC6473e3 = interfaceC6473e2;
            final C6756f c6756f3 = c6756f2;
            final long j9 = j8;
            final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
            final CalendarModel calendarModel3 = calendarModel2;
            composer2 = composerStartRestartGroup;
            CrossfadeKt.Crossfade(DisplayMode.m8456boximpl(i), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new InterfaceC6471c() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new InterfaceC6474f() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m8443invokeQujVXRc(((DisplayMode) obj).getValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m8443invokeQujVXRc(int i12, @Nullable Composer composer3, int i13) {
                    int i14;
                    if ((i13 & 6) == 0) {
                        i14 = i13 | (composer3.changed(i12) ? 4 : 2);
                    } else {
                        i14 = i13;
                    }
                    if ((i14 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026642619, i14, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:677)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.m8459equalsimpl0(i12, companion.m8464getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-1871299185);
                        DateRangePickerKt.DateRangePickerContent(l, l9, j9, interfaceC6473e3, interfaceC6471c3, calendarModel3, c6756f3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m8459equalsimpl0(i12, companion.m8463getInputjFl4v0())) {
                        composer3.startReplaceGroup(-1871277944);
                        DateRangeInputKt.DateRangeInputContent(l, l9, interfaceC6473e3, calendarModel3, c6756f3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(2120399965);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i10 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    DateRangePickerKt.m8438SwitchableDateEntryContentRN2D1Q(l, l3, j7, i, interfaceC6473e, interfaceC6471c, calendarModel, c6756f, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalMonthsList(LazyListState lazyListState, final Long l, final Long l3, final InterfaceC6473e interfaceC6473e, final InterfaceC6471c interfaceC6471c, final CalendarModel calendarModel, final C6756f c6756f, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i8;
        Long l8;
        Long l9;
        InterfaceC6473e interfaceC6473e2;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1257365001);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            l8 = l;
            i8 |= composerStartRestartGroup.changed(l8) ? 32 : 16;
        } else {
            l8 = l;
        }
        if ((i & 384) == 0) {
            l9 = l3;
            i8 |= composerStartRestartGroup.changed(l9) ? 256 : 128;
        } else {
            l9 = l3;
        }
        if ((i & 3072) == 0) {
            interfaceC6473e2 = interfaceC6473e;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 2048 : 1024;
        } else {
            interfaceC6473e2 = interfaceC6473e;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(c6756f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i8 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i8, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:767)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(c6756f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(c6756f.f11420a, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            final Long l10 = l8;
            final InterfaceC6473e interfaceC6473e3 = interfaceC6473e2;
            int i9 = i8;
            final Long l11 = l9;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new InterfaceC6473e() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i10) {
                    if ((i10 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1090773432, i10, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:777)");
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_range_picker_scroll_to_previous_month), composer2, 0);
                    String strM9393getString2EP1pXo2 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_date_range_picker_scroll_to_next_month), composer2, 0);
                    boolean zChanged2 = composer2.changed(l10) | composer2.changed(l11) | composer2.changed(interfaceC6473e3);
                    final Long l12 = l10;
                    final Long l13 = l11;
                    final InterfaceC6473e interfaceC6473e4 = interfaceC6473e3;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Number) obj).longValue());
                                return C5443s.f8405a;
                            }

                            public final void invoke(long j7) {
                                DateRangePickerKt.updateDateSelection(j7, l12, l13, interfaceC6473e4);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue3;
                    final List listCustomScrollActions = DateRangePickerKt.customScrollActions(lazyListState2, coroutineScope, strM9393getString2EP1pXo, strM9393getString2EP1pXo2);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new InterfaceC6471c() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new InterfaceC6469a() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new InterfaceC6469a() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    boolean zChangedInstance = composer2.changedInstance(c6756f) | composer2.changedInstance(calendarModel) | composer2.changed(calendarMonth) | composer2.changedInstance(datePickerFormatter) | composer2.changedInstance(listCustomScrollActions) | composer2.changed(datePickerColors) | composer2.changed(l10) | composer2.changed(l11) | composer2.changed(interfaceC6471c2) | composer2.changed(today) | composer2.changed(selectableDates);
                    final C6756f c6756f2 = c6756f;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Long l14 = l10;
                    final Long l15 = l11;
                    final CalendarDate calendarDate = today;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        Object obj = new InterfaceC6471c() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LazyListScope) obj2);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(c6756f2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Long l16 = l14;
                                final Long l17 = l15;
                                final InterfaceC6471c interfaceC6471c3 = interfaceC6471c2;
                                final CalendarDate calendarDate2 = calendarDate;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                final List<CustomAccessibilityAction> list = listCustomScrollActions;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new InterfaceC6475g() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // p152r6.InterfaceC6475g
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        invoke((LazyItemScope) obj2, ((Number) obj3).intValue(), (Composer) obj4, ((Number) obj5).intValue());
                                        return C5443s.f8405a;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
                                    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
                                    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
                                    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.Composable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyItemScope r19, int r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, int r22) {
                                        /*
                                            Method dump skipped, instructions count: 345
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.C16331.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue4 = obj;
                    }
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState3, null, false, null, null, null, false, (InterfaceC6471c) objRememberedValue4, composer2, 0, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i10 = i9 & 14;
            boolean zChangedInstance = (i10 == 4) | ((57344 & i9) == 16384) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(c6756f);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, interfaceC6471c, calendarModel, c6756f, null);
                composerStartRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (InterfaceC6473e) dateRangePickerKt$VerticalMonthsList$2$1, composerStartRestartGroup, i10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    DateRangePickerKt.VerticalMonthsList(lazyListState2, l, l3, interfaceC6473e, interfaceC6471c, calendarModel, c6756f, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final InterfaceC6009v interfaceC6009v, String str, String str2) {
        return AbstractC5806u.m5287z(new CustomAccessibilityAction(str, new InterfaceC6469a() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", m5303f = "DateRangePicker.kt", m5304i = {}, m5305l = {1046}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1 */
            public static final class C16361 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16361(LazyListState lazyListState, InterfaceC5631c<? super C16361> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new C16361(this.$state, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C16361) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Boolean invoke() {
                boolean z8;
                if (lazyListState.getCanScrollBackward()) {
                    AbstractC6014x.m5651v(interfaceC6009v, null, null, new C16361(lazyListState, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }), new CustomAccessibilityAction(str2, new InterfaceC6469a() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", m5303f = "DateRangePicker.kt", m5304i = {}, m5305l = {1054}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1 */
            public static final class C16351 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16351(LazyListState lazyListState, InterfaceC5631c<? super C16351> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new C16351(this.$state, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C16351) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Boolean invoke() {
                boolean z8;
                if (lazyListState.getCanScrollForward()) {
                    AbstractC6014x.m5651v(interfaceC6009v, null, null, new C16351(lazyListState, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }));
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m8440drawRangeBackgroundmxwnekA(@NotNull ContentDrawScope contentDrawScope, @NotNull SelectedRangeInfo selectedRangeInfo, long j7) {
        float fMo6903toPx0680j_4 = contentDrawScope.mo6903toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo6903toPx0680j_42 = contentDrawScope.mo6903toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo6903toPx0680j_43 = contentDrawScope.mo6903toPx0680j_4(DatePickerModalTokens.INSTANCE.m9562getDateStateLayerHeightD9Ej5fM());
        float f = 2;
        float f7 = (fMo6903toPx0680j_42 - fMo6903toPx0680j_43) / f;
        float f8 = 7;
        float fM1037a = AbstractC1923c.m1037a(f8, fMo6903toPx0680j_4, Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()), f8);
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int iM13433getXimpl = IntOffset.m13433getXimpl(gridStartCoordinates);
        int iM13434getYimpl = IntOffset.m13434getYimpl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int iM13433getXimpl2 = IntOffset.m13433getXimpl(gridEndCoordinates);
        int iM13434getYimpl2 = IntOffset.m13434getYimpl(gridEndCoordinates);
        float f9 = iM13433getXimpl;
        float f10 = fMo6903toPx0680j_4 + fM1037a;
        float f11 = fM1037a / f;
        float fM10510getWidthimpl = (f9 * f10) + (selectedRangeInfo.getFirstIsSelectionStart() ? fMo6903toPx0680j_4 / f : 0.0f) + f11;
        float f12 = (iM13434getYimpl * fMo6903toPx0680j_42) + f7;
        float f13 = iM13433getXimpl2 * f10;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fMo6903toPx0680j_4 /= f;
        }
        float fM10510getWidthimpl2 = f13 + fMo6903toPx0680j_4 + f11;
        float f14 = (iM13434getYimpl2 * fMo6903toPx0680j_42) + f7;
        boolean z8 = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z8) {
            fM10510getWidthimpl = Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()) - fM10510getWidthimpl;
            fM10510getWidthimpl2 = Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()) - fM10510getWidthimpl2;
        }
        float fM10510getWidthimpl3 = fM10510getWidthimpl2;
        DrawScope.m11227drawRectnJ9OG0$default(contentDrawScope, j7, OffsetKt.Offset(fM10510getWidthimpl, f12), SizeKt.Size(iM13434getYimpl == iM13434getYimpl2 ? fM10510getWidthimpl3 - fM10510getWidthimpl : z8 ? -fM10510getWidthimpl : Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()) - fM10510getWidthimpl, fMo6903toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        if (iM13434getYimpl != iM13434getYimpl2) {
            for (int i = (iM13434getYimpl2 - iM13434getYimpl) - 1; i > 0; i--) {
                DrawScope.m11227drawRectnJ9OG0$default(contentDrawScope, j7, OffsetKt.Offset(0.0f, (i * fMo6903toPx0680j_42) + f12), SizeKt.Size(Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()), fMo6903toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            long jOffset = OffsetKt.Offset(contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()), f14);
            if (z8) {
                fM10510getWidthimpl3 -= Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc());
            }
            DrawScope.m11227drawRectnJ9OG0$default(contentDrawScope, j7, jOffset, SizeKt.Size(fM10510getWidthimpl3, fMo6903toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    @NotNull
    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m8441rememberDateRangePickerStateIlFM19s(@Nullable Long l, @Nullable Long l3, @Nullable Long l8, @Nullable C6756f c6756f, int i, @Nullable SelectableDates selectableDates, @Nullable Composer composer, int i8, int i9) {
        final Long l9 = (i9 & 1) != 0 ? null : l;
        final Long l10 = (i9 & 2) != 0 ? null : l3;
        final Long l11 = (i9 & 4) != 0 ? l9 : l8;
        final C6756f yearRange = (i9 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : c6756f;
        final int iM8464getPickerjFl4v0 = (i9 & 16) != 0 ? DisplayMode.INSTANCE.m8464getPickerjFl4v0() : i;
        final SelectableDates allDates = (i9 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i8, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.INSTANCE.Saver(allDates, localeDefaultLocale);
        boolean zChangedInstance = ((((i8 & 112) ^ 48) > 32 && composer.changed(l10)) || (i8 & 48) == 32) | ((((i8 & 14) ^ 6) > 4 && composer.changed(l9)) || (i8 & 6) == 4) | ((((i8 & 896) ^ 384) > 256 && composer.changed(l11)) || (i8 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i8) ^ 24576) > 16384 && composer.changed(iM8464getPickerjFl4v0)) || (i8 & 24576) == 16384) | ((((458752 & i8) ^ ProfileVerifier.CompilationStatus.f1352xf2722a21) > 131072 && composer.changed(allDates)) || (i8 & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 131072) | composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new InterfaceC6469a() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l9, l10, l11, yearRange, iM8464getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j7, Long l, Long l3, InterfaceC6473e interfaceC6473e) {
        if ((l == null && l3 == null) || (l != null && l3 != null)) {
            interfaceC6473e.invoke(Long.valueOf(j7), null);
        } else if (l == null || j7 < l.longValue()) {
            interfaceC6473e.invoke(Long.valueOf(j7), null);
        } else {
            interfaceC6473e.invoke(l, Long.valueOf(j7));
        }
    }
}
