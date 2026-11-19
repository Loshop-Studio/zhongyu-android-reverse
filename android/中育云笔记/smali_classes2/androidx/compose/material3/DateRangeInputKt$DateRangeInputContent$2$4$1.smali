.class final Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DateRangeInputKt;->DateRangeInputContent(Ljava/lang/Long;Ljava/lang/Long;Lhd/p;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $onDatesSelectionChange:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $selectedStartDateMillis:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lhd/p;Ljava/lang/Long;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;->$onDatesSelectionChange:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;->$selectedStartDateMillis:Ljava/lang/Long;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;->invoke(Ljava/lang/Long;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Long;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;->$onDatesSelectionChange:Lhd/p;

    iget-object v1, p0, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;->$selectedStartDateMillis:Ljava/lang/Long;

    invoke-interface {v0, v1, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
