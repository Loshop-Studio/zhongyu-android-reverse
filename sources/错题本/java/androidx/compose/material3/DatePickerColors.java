package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u008c\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u00020\u001b*\u0004\u0018\u00010\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"H\u0000¢\u0006\u0004\b$\u0010%J5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0001¢\u0006\u0004\b-\u0010.J-\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010/\u001a\u00020'H\u0001¢\u0006\u0004\b0\u00101J-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u00103\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0001¢\u0006\u0004\b4\u00101J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\bA\u0010@R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bB\u0010@R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bC\u0010@R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bD\u0010@R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bE\u0010@R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bF\u0010@R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bG\u0010@R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bH\u0010@R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bI\u0010@R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bJ\u0010@R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bK\u0010@R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bL\u0010@R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bM\u0010@R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bN\u0010@R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bO\u0010@R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bP\u0010@R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bQ\u0010@R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\bR\u0010@R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bS\u0010@R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bT\u0010@R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\bU\u0010@R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\bV\u0010@R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bW\u0010@R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010X\u001a\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m5110d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/e;)V", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/material3/TextFieldColors;Lr6/a;)Landroidx/compose/material3/TextFieldColors;", "takeOrElse", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContainerColor", "currentYear", "yearContentColor$material3_release", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getTitleContentColor-0d7_KjU", "getHeadlineContentColor-0d7_KjU", "getWeekdayContentColor-0d7_KjU", "getSubheadContentColor-0d7_KjU", "getNavigationContentColor-0d7_KjU", "getYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "getCurrentYearContentColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "getDayContentColor-0d7_KjU", "getDisabledDayContentColor-0d7_KjU", "getSelectedDayContentColor-0d7_KjU", "getDisabledSelectedDayContentColor-0d7_KjU", "getSelectedDayContainerColor-0d7_KjU", "getDisabledSelectedDayContainerColor-0d7_KjU", "getTodayContentColor-0d7_KjU", "getTodayDateBorderColor-0d7_KjU", "getDayInSelectionRangeContainerColor-0d7_KjU", "getDayInSelectionRangeContentColor-0d7_KjU", "getDividerColor-0d7_KjU", "Landroidx/compose/material3/TextFieldColors;", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2272:1\n708#2:2273\n696#2:2274\n708#2:2275\n696#2:2276\n708#2:2277\n696#2:2278\n708#2:2279\n696#2:2280\n708#2:2281\n696#2:2282\n708#2:2283\n696#2:2284\n708#2:2285\n696#2:2286\n708#2:2287\n696#2:2288\n708#2:2289\n696#2:2290\n708#2:2291\n696#2:2292\n708#2:2293\n696#2:2294\n708#2:2295\n696#2:2296\n708#2:2297\n696#2:2298\n708#2:2299\n696#2:2300\n708#2:2301\n696#2:2302\n708#2:2303\n696#2:2304\n708#2:2305\n696#2:2306\n708#2:2307\n696#2:2308\n708#2:2309\n696#2:2310\n708#2:2311\n696#2:2312\n708#2:2313\n696#2:2314\n708#2:2315\n696#2:2316\n708#2:2317\n696#2:2318\n708#2:2319\n696#2:2320\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n856#1:2273\n856#1:2274\n857#1:2275\n857#1:2276\n858#1:2277\n858#1:2278\n859#1:2279\n859#1:2280\n860#1:2281\n860#1:2282\n861#1:2283\n861#1:2284\n862#1:2285\n862#1:2286\n863#1:2287\n863#1:2288\n864#1:2289\n864#1:2290\n865#1:2291\n865#1:2292\n866#1:2293\n866#1:2294\n867#1:2295\n867#1:2296\n868#1:2297\n868#1:2298\n871#1:2299\n871#1:2300\n872#1:2301\n872#1:2302\n873#1:2303\n873#1:2304\n874#1:2305\n874#1:2306\n875#1:2307\n875#1:2308\n876#1:2309\n876#1:2310\n877#1:2311\n877#1:2312\n878#1:2313\n878#1:2314\n879#1:2315\n879#1:2316\n880#1:2317\n880#1:2318\n881#1:2319\n881#1:2320\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;

    @NotNull
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    public /* synthetic */ DatePickerColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, TextFieldColors textFieldColors, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, textFieldColors);
    }

    @NotNull
    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m8382copytNwlRmA(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, @Nullable TextFieldColors dateTextFieldColors) {
        return new DatePickerColors(containerColor != 16 ? containerColor : this.containerColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, headlineContentColor != 16 ? headlineContentColor : this.headlineContentColor, weekdayContentColor != 16 ? weekdayContentColor : this.weekdayContentColor, subheadContentColor != 16 ? subheadContentColor : this.subheadContentColor, navigationContentColor != 16 ? navigationContentColor : this.navigationContentColor, yearContentColor != 16 ? yearContentColor : this.yearContentColor, disabledYearContentColor != 16 ? disabledYearContentColor : this.disabledYearContentColor, currentYearContentColor != 16 ? currentYearContentColor : this.currentYearContentColor, selectedYearContentColor != 16 ? selectedYearContentColor : this.selectedYearContentColor, disabledSelectedYearContentColor != 16 ? disabledSelectedYearContentColor : this.disabledSelectedYearContentColor, selectedYearContainerColor != 16 ? selectedYearContainerColor : this.selectedYearContainerColor, disabledSelectedYearContainerColor != 16 ? disabledSelectedYearContainerColor : this.disabledSelectedYearContainerColor, dayContentColor != 16 ? dayContentColor : this.dayContentColor, disabledDayContentColor != 16 ? disabledDayContentColor : this.disabledDayContentColor, selectedDayContentColor != 16 ? selectedDayContentColor : this.selectedDayContentColor, disabledSelectedDayContentColor != 16 ? disabledSelectedDayContentColor : this.disabledSelectedDayContentColor, selectedDayContainerColor != 16 ? selectedDayContainerColor : this.selectedDayContainerColor, disabledSelectedDayContainerColor != 16 ? disabledSelectedDayContainerColor : this.disabledSelectedDayContainerColor, todayContentColor != 16 ? todayContentColor : this.todayContentColor, todayDateBorderColor != 16 ? todayDateBorderColor : this.todayDateBorderColor, dayInSelectionRangeContainerColor != 16 ? dayInSelectionRangeContainerColor : this.dayInSelectionRangeContainerColor, dayInSelectionRangeContentColor != 16 ? dayInSelectionRangeContentColor : this.dayInSelectionRangeContentColor, dividerColor != 16 ? dividerColor : this.dividerColor, takeOrElse$material3_release(dateTextFieldColors, new InterfaceC6469a() { // from class: androidx.compose.material3.DatePickerColors$copy$25
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final TextFieldColors invoke() {
                return this.this$0.getDateTextFieldColors();
            }
        }), null);
    }

    @Composable
    @NotNull
    public final State<Color> dayContainerColor$material3_release(boolean z8, boolean z9, boolean z10, @Nullable Composer composer, int i) {
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)");
        }
        long jM10717getTransparent0d7_KjU = z8 ? z9 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor : Color.INSTANCE.m10717getTransparent0d7_KjU();
        if (z10) {
            composer.startReplaceGroup(-217363149);
            stateRememberUpdatedState = SingleValueAnimationKt.m6627animateColorAsStateeuL9pac(jM10717getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-217247953);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m10672boximpl(jM10717getTransparent0d7_KjU), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> dayContentColor$material3_release(boolean z8, boolean z9, boolean z10, boolean z11, @Nullable Composer composer, int i) {
        State<Color> stateM6627animateColorAsStateeuL9pac;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)");
        }
        long j7 = (z9 && z11) ? this.selectedDayContentColor : (!z9 || z11) ? (z10 && z11) ? this.dayInSelectionRangeContentColor : (!z10 || z11) ? z8 ? this.todayContentColor : z11 ? this.dayContentColor : this.disabledDayContentColor : this.disabledDayContentColor : this.disabledSelectedDayContentColor;
        if (z10) {
            composer.startReplaceGroup(-828303257);
            stateM6627animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m10672boximpl(j7), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-828241443);
            stateM6627animateColorAsStateeuL9pac = SingleValueAnimationKt.m6627animateColorAsStateeuL9pac(j7, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM6627animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) other;
        return Color.m10683equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m10683equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m10683equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m10683equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m10683equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m10683equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m10683equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m10683equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m10683equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m10683equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m10683equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m10683equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m10683equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m10683equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m10683equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m10683equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m10683equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m10683equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m10683equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m10683equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m10683equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m10683equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCurrentYearContentColor() {
        return this.currentYearContentColor;
    }

    @NotNull
    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayContentColor() {
        return this.dayContentColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContentColor() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledDayContentColor() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContainerColor() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContentColor() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContainerColor() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContentColor() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledYearContentColor() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContainerColor() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContentColor() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContainerColor() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContentColor() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayContentColor() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getYearContentColor() {
        return this.yearContentColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.dayInSelectionRangeContentColor) + AbstractC0584a.m904e(this.dayInSelectionRangeContainerColor, AbstractC0584a.m904e(this.todayDateBorderColor, AbstractC0584a.m904e(this.todayContentColor, AbstractC0584a.m904e(this.disabledSelectedDayContainerColor, AbstractC0584a.m904e(this.selectedDayContainerColor, AbstractC0584a.m904e(this.disabledSelectedDayContentColor, AbstractC0584a.m904e(this.selectedDayContentColor, AbstractC0584a.m904e(this.disabledDayContentColor, AbstractC0584a.m904e(this.dayContentColor, AbstractC0584a.m904e(this.disabledSelectedYearContainerColor, AbstractC0584a.m904e(this.selectedYearContainerColor, AbstractC0584a.m904e(this.disabledSelectedYearContentColor, AbstractC0584a.m904e(this.selectedYearContentColor, AbstractC0584a.m904e(this.currentYearContentColor, AbstractC0584a.m904e(this.disabledYearContentColor, AbstractC0584a.m904e(this.yearContentColor, AbstractC0584a.m904e(this.subheadContentColor, AbstractC0584a.m904e(this.weekdayContentColor, AbstractC0584a.m904e(this.headlineContentColor, AbstractC0584a.m904e(this.titleContentColor, Color.m10689hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final TextFieldColors takeOrElse$material3_release(@Nullable TextFieldColors textFieldColors, @NotNull InterfaceC6469a interfaceC6469a) {
        return textFieldColors == null ? (TextFieldColors) interfaceC6469a.invoke() : textFieldColors;
    }

    @Composable
    @NotNull
    public final State<Color> yearContainerColor$material3_release(boolean z8, boolean z9, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)");
        }
        State<Color> stateM6627animateColorAsStateeuL9pac = SingleValueAnimationKt.m6627animateColorAsStateeuL9pac(z8 ? z9 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor : Color.INSTANCE.m10717getTransparent0d7_KjU(), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM6627animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> yearContentColor$material3_release(boolean z8, boolean z9, boolean z10, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)");
        }
        State<Color> stateM6627animateColorAsStateeuL9pac = SingleValueAnimationKt.m6627animateColorAsStateeuL9pac((z9 && z10) ? this.selectedYearContentColor : (!z9 || z10) ? z8 ? this.currentYearContentColor : z10 ? this.yearContentColor : this.disabledYearContentColor : this.disabledSelectedYearContentColor, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM6627animateColorAsStateeuL9pac;
    }

    private DatePickerColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, TextFieldColors textFieldColors) {
        this.containerColor = j7;
        this.titleContentColor = j8;
        this.headlineContentColor = j9;
        this.weekdayContentColor = j10;
        this.subheadContentColor = j11;
        this.navigationContentColor = j12;
        this.yearContentColor = j13;
        this.disabledYearContentColor = j14;
        this.currentYearContentColor = j15;
        this.selectedYearContentColor = j16;
        this.disabledSelectedYearContentColor = j17;
        this.selectedYearContainerColor = j18;
        this.disabledSelectedYearContainerColor = j19;
        this.dayContentColor = j20;
        this.disabledDayContentColor = j21;
        this.selectedDayContentColor = j22;
        this.disabledSelectedDayContentColor = j23;
        this.selectedDayContainerColor = j24;
        this.disabledSelectedDayContainerColor = j25;
        this.todayContentColor = j26;
        this.todayDateBorderColor = j27;
        this.dayInSelectionRangeContainerColor = j28;
        this.dayInSelectionRangeContentColor = j29;
        this.dividerColor = j30;
        this.dateTextFieldColors = textFieldColors;
    }
}
