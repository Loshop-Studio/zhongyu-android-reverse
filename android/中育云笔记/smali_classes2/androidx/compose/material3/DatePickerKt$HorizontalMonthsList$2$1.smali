.class final Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt;->HorizontalMonthsList(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lhd/l;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1"
    f = "DatePicker.kt"
    l = {
        0x6a2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $calendarModel:Landroidx/compose/material3/internal/CalendarModel;

.field final synthetic $lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

.field final synthetic $onDisplayedMonthChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $yearRange:Lnd/j;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lhd/l;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lnd/j;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$onDisplayedMonthChange:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$calendarModel:Landroidx/compose/material3/internal/CalendarModel;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$yearRange:Lnd/j;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$onDisplayedMonthChange:Lhd/l;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$calendarModel:Landroidx/compose/material3/internal/CalendarModel;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$yearRange:Lnd/j;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$lazyListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$onDisplayedMonthChange:Lhd/l;

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$calendarModel:Landroidx/compose/material3/internal/CalendarModel;

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->$yearRange:Lnd/j;

    .line 34
    .line 35
    iput v2, p0, Landroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1;->label:I

    .line 36
    .line 37
    invoke-static {p1, v1, v3, v4, p0}, Landroidx/compose/material3/DatePickerKt;->updateDisplayedMonth(Landroidx/compose/foundation/lazy/LazyListState;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Lvc/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 45
    .line 46
    return-object p1
.end method
