.class final Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt$YearPicker$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $colors:Landroidx/compose/material3/DatePickerColors;

.field final synthetic $coroutineScope:Lsd/i0;

.field final synthetic $currentYear:I

.field final synthetic $displayedYear:I

.field final synthetic $lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $onYearSelected:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $scrollToEarlierYearsLabel:Ljava/lang/String;

.field final synthetic $scrollToLaterYearsLabel:Ljava/lang/String;

.field final synthetic $selectableDates:Landroidx/compose/material3/SelectableDates;

.field final synthetic $yearRange:Lnd/j;


# direct methods
.method public constructor <init>(Lnd/j;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lsd/i0;Ljava/lang/String;Ljava/lang/String;IILhd/l;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnd/j;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Lsd/i0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lhd/l;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lnd/j;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$coroutineScope:Lsd/i0;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToEarlierYearsLabel:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToLaterYearsLabel:Ljava/lang/String;

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$displayedYear:I

    .line 12
    .line 13
    iput p7, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$currentYear:I

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$onYearSelected:Lhd/l;

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V
    .locals 14

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lnd/j;

    invoke-static {v0}, Lrc/g0;->f0(Ljava/lang/Iterable;)I

    move-result v2

    new-instance v3, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1;

    iget-object v4, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$yearRange:Lnd/j;

    iget-object v5, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$lazyGridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v6, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$coroutineScope:Lsd/i0;

    iget-object v7, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToEarlierYearsLabel:Ljava/lang/String;

    iget-object v8, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$scrollToLaterYearsLabel:Ljava/lang/String;

    iget v9, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$displayedYear:I

    iget v10, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$currentYear:I

    iget-object v11, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$onYearSelected:Lhd/l;

    iget-object v12, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$selectableDates:Landroidx/compose/material3/SelectableDates;

    iget-object v13, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1;->$colors:Landroidx/compose/material3/DatePickerColors;

    invoke-direct/range {v3 .. v13}, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1;-><init>(Lnd/j;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lsd/i0;Ljava/lang/String;Ljava/lang/String;IILhd/l;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;)V

    const v0, 0x3e06a802

    const/4 v1, 0x1

    invoke-static {v0, v1, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;ILhd/l;Lhd/p;Lhd/l;Lhd/r;ILjava/lang/Object;)V

    return-void
.end method
