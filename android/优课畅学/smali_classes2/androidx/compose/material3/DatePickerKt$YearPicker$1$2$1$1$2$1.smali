.class final Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $onYearSelected:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field final synthetic $selectedYear:I


# direct methods
.method public constructor <init>(Lx7/l;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            "I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;->$onYearSelected:Lx7/l;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;->$selectedYear:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;->$onYearSelected:Lx7/l;

    iget v1, p0, Landroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1$2$1;->$selectedYear:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
