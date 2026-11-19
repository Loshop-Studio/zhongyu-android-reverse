.class final Landroidx/compose/foundation/ScrollingContainerNode$attachOverscrollNodeIfNeeded$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ScrollingContainerNode;->attachOverscrollNodeIfNeeded()V
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
.field final synthetic this$0:Landroidx/compose/foundation/ScrollingContainerNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollingContainerNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/ScrollingContainerNode$attachOverscrollNodeIfNeeded$1;->this$0:Landroidx/compose/foundation/ScrollingContainerNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/ScrollingContainerNode$attachOverscrollNodeIfNeeded$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerNode$attachOverscrollNodeIfNeeded$1;->this$0:Landroidx/compose/foundation/ScrollingContainerNode;

    invoke-static {}, Landroidx/compose/foundation/OverscrollKt;->getLocalOverscrollFactory()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/OverscrollFactory;

    invoke-static {v0, v1}, Landroidx/compose/foundation/ScrollingContainerNode;->access$setLocalOverscrollFactory$p(Landroidx/compose/foundation/ScrollingContainerNode;Landroidx/compose/foundation/OverscrollFactory;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerNode$attachOverscrollNodeIfNeeded$1;->this$0:Landroidx/compose/foundation/ScrollingContainerNode;

    .line 4
    invoke-static {v0}, Landroidx/compose/foundation/ScrollingContainerNode;->access$getLocalOverscrollFactory$p(Landroidx/compose/foundation/ScrollingContainerNode;)Landroidx/compose/foundation/OverscrollFactory;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/compose/foundation/OverscrollFactory;->createOverscrollEffect()Landroidx/compose/foundation/OverscrollEffect;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 5
    :goto_0
    invoke-static {v0, v1}, Landroidx/compose/foundation/ScrollingContainerNode;->access$setLocalOverscrollFactoryCreatedOverscrollEffect$p(Landroidx/compose/foundation/ScrollingContainerNode;Landroidx/compose/foundation/OverscrollEffect;)V

    return-void
.end method
