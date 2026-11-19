.class final Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $coroutineScope:Lsd/i0;

.field final synthetic $displayedMonth:Landroidx/compose/material3/internal/CalendarMonth;

.field final synthetic $monthsListState:Landroidx/compose/foundation/lazy/LazyListState;

.field final synthetic $yearPickerVisible$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $yearRange:Lnd/j;


# direct methods
.method public constructor <init>(Lsd/i0;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListState;Lnd/j;Landroidx/compose/material3/internal/CalendarMonth;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Lnd/j;",
            "Landroidx/compose/material3/internal/CalendarMonth;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$coroutineScope:Lsd/i0;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$yearPickerVisible$delegate:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$monthsListState:Landroidx/compose/foundation/lazy/LazyListState;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$yearRange:Lnd/j;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$displayedMonth:Landroidx/compose/material3/internal/CalendarMonth;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->invoke(I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 9

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$yearPickerVisible$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Landroidx/compose/material3/DatePickerKt;->access$DatePickerContent$lambda$10(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Landroidx/compose/material3/DatePickerKt;->access$DatePickerContent$lambda$11(Landroidx/compose/runtime/MutableState;Z)V

    .line 3
    iget-object v2, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$coroutineScope:Lsd/i0;

    new-instance v3, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1$1;

    iget-object v4, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$monthsListState:Landroidx/compose/foundation/lazy/LazyListState;

    iget-object v6, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$yearRange:Lnd/j;

    iget-object v7, p0, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1;->$displayedMonth:Landroidx/compose/material3/internal/CalendarMonth;

    const/4 v8, 0x0

    move v5, p1

    invoke-direct/range {v3 .. v8}, Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;ILnd/j;Landroidx/compose/material3/internal/CalendarMonth;Lvc/c;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void
.end method
