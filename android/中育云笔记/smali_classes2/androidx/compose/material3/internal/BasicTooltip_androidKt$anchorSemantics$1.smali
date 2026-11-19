.class final Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/internal/BasicTooltip_androidKt;->anchorSemantics(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/material3/TooltipState;Lsd/i0;)Landroidx/compose/ui/Modifier;
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
.field final synthetic $label:Ljava/lang/String;

.field final synthetic $scope:Lsd/i0;

.field final synthetic $state:Landroidx/compose/material3/TooltipState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lsd/i0;Landroidx/compose/material3/TooltipState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$label:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$scope:Lsd/i0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$state:Landroidx/compose/material3/TooltipState;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$label:Ljava/lang/String;

    .line 3
    new-instance v1, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1$1;

    iget-object v2, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$scope:Lsd/i0;

    iget-object v3, p0, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1;->$state:Landroidx/compose/material3/TooltipState;

    invoke-direct {v1, v2, v3}, Landroidx/compose/material3/internal/BasicTooltip_androidKt$anchorSemantics$1$1;-><init>(Lsd/i0;Landroidx/compose/material3/TooltipState;)V

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onLongClick(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;)V

    return-void
.end method
