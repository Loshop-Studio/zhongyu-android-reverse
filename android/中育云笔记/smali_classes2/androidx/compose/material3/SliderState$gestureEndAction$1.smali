.class final Landroidx/compose/material3/SliderState$gestureEndAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderState;-><init>(FILhd/a;Lnd/f;)V
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
.field final synthetic this$0:Landroidx/compose/material3/SliderState;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/SliderState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/SliderState$gestureEndAction$1;->this$0:Landroidx/compose/material3/SliderState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/SliderState$gestureEndAction$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/SliderState$gestureEndAction$1;->this$0:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->isDragging$material3_release()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/material3/SliderState$gestureEndAction$1;->this$0:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getOnValueChangeFinished()Lhd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
