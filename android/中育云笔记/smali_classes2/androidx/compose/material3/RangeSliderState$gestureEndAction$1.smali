.class final Landroidx/compose/material3/RangeSliderState$gestureEndAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/RangeSliderState;-><init>(FFILhd/a;Lnd/f;)V
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
.field final synthetic this$0:Landroidx/compose/material3/RangeSliderState;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/RangeSliderState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/RangeSliderState$gestureEndAction$1;->this$0:Landroidx/compose/material3/RangeSliderState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/material3/RangeSliderState$gestureEndAction$1;->invoke(Z)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 0

    .line 2
    iget-object p1, p0, Landroidx/compose/material3/RangeSliderState$gestureEndAction$1;->this$0:Landroidx/compose/material3/RangeSliderState;

    invoke-virtual {p1}, Landroidx/compose/material3/RangeSliderState;->getOnValueChangeFinished()Lhd/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
