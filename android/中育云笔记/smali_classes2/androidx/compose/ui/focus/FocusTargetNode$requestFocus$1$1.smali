.class final Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusTargetNode;->requestFocus-3ESFkO8(I)Z
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
.field final synthetic this$0:Landroidx/compose/ui/focus/FocusTargetNode;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;->this$0:Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;->this$0:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;->this$0:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    :cond_0
    return-void
.end method
