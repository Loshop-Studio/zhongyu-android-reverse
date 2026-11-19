.class final Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl$totalItemCount$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;-><init>(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V
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
.field final synthetic this$0:Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl$totalItemCount$2;->this$0:Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl$totalItemCount$2;->this$0:Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;

    invoke-static {v0}, Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;->access$getState$p(Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getItemCount$foundation_layout_release()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl$totalItemCount$2;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
