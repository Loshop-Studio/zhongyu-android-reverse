.class final Landroidx/compose/foundation/selection/ToggleableNode$_onClick$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/selection/ToggleableNode;-><init>(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLandroidx/compose/ui/semantics/Role;Lhd/l;)V
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
.field final synthetic this$0:Landroidx/compose/foundation/selection/ToggleableNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/selection/ToggleableNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/selection/ToggleableNode$_onClick$1;->this$0:Landroidx/compose/foundation/selection/ToggleableNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/selection/ToggleableNode$_onClick$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/selection/ToggleableNode$_onClick$1;->this$0:Landroidx/compose/foundation/selection/ToggleableNode;

    invoke-static {v0}, Landroidx/compose/foundation/selection/ToggleableNode;->access$getOnValueChange$p(Landroidx/compose/foundation/selection/ToggleableNode;)Lhd/l;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/selection/ToggleableNode$_onClick$1;->this$0:Landroidx/compose/foundation/selection/ToggleableNode;

    invoke-static {v1}, Landroidx/compose/foundation/selection/ToggleableNode;->access$getValue$p(Landroidx/compose/foundation/selection/ToggleableNode;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
