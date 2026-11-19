.class final Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt;->rememberDatePickerState-EU0dCGE(Ljava/lang/Long;Ljava/lang/Long;Lnd/j;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $initialDisplayMode:I

.field final synthetic $initialDisplayedMonthMillis:Ljava/lang/Long;

.field final synthetic $initialSelectedDateMillis:Ljava/lang/Long;

.field final synthetic $locale:Ljava/util/Locale;

.field final synthetic $selectableDates:Landroidx/compose/material3/SelectableDates;

.field final synthetic $yearRange:Lnd/j;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Lnd/j;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialSelectedDateMillis:Ljava/lang/Long;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialDisplayedMonthMillis:Ljava/lang/Long;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$yearRange:Lnd/j;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialDisplayMode:I

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$locale:Ljava/util/Locale;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/material3/DatePickerStateImpl;
    .locals 8

    .line 2
    new-instance v0, Landroidx/compose/material3/DatePickerStateImpl;

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialSelectedDateMillis:Ljava/lang/Long;

    .line 4
    iget-object v2, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialDisplayedMonthMillis:Ljava/lang/Long;

    .line 5
    iget-object v3, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$yearRange:Lnd/j;

    .line 6
    iget v4, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$initialDisplayMode:I

    .line 7
    iget-object v5, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    .line 8
    iget-object v6, p0, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->$locale:Ljava/util/Locale;

    const/4 v7, 0x0

    .line 9
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/DatePickerStateImpl;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lnd/j;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/DatePickerKt$rememberDatePickerState$1$1;->invoke()Landroidx/compose/material3/DatePickerStateImpl;

    move-result-object v0

    return-object v0
.end method
