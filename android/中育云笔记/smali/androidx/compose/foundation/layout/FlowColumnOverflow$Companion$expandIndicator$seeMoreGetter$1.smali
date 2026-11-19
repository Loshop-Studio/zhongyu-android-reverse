.class final Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;->expandIndicator(Lhd/q;)Landroidx/compose/foundation/layout/FlowColumnOverflow;
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
.field final synthetic $content:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1;->$content:Lhd/q;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lhd/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")",
            "Lhd/p;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1;->$content:Lhd/q;

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1$1;-><init>(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Lhd/q;)V

    const p1, 0x1279449

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1;->invoke(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lhd/p;

    move-result-object p1

    return-object p1
.end method
