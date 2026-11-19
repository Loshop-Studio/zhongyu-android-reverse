.class final Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;->this$0:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;->this$0:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->getCoroutineScope$foundation_release()Lsd/i0;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v3, Lkotlinx/coroutines/CoroutineStart;->f:Lkotlinx/coroutines/CoroutineStart;

    new-instance v4, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1;

    iget-object v0, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;->this$0:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1;-><init>(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbar$1$paste$1;->this$0:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->hideSelectionToolbar$foundation_release()V

    return-void
.end method
