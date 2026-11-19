.class final Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/BasicTooltipKt;->TooltipPopup(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lsd/i0;ZLhd/p;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $scope:Lsd/i0;

.field final synthetic $state:Landroidx/compose/foundation/BasicTooltipState;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/BasicTooltipState;Lsd/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->$state:Landroidx/compose/foundation/BasicTooltipState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->$scope:Lsd/i0;

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
    invoke-virtual {p0}, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->$state:Landroidx/compose/foundation/BasicTooltipState;

    invoke-interface {v0}, Landroidx/compose/foundation/BasicTooltipState;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->$scope:Lsd/i0;

    new-instance v4, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1$1;

    iget-object v0, p0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;->$state:Landroidx/compose/foundation/BasicTooltipState;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1$1;-><init>(Landroidx/compose/foundation/BasicTooltipState;Lvc/c;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    :cond_0
    return-void
.end method
