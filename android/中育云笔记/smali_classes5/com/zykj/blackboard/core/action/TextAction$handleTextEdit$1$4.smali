.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/TextAction;->d0(FFZ)V
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
.field public final synthetic c:Lca/d;

.field public final synthetic d:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lca/d;Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->c:Lca/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->d:Lcom/zykj/blackboard/core/action/TextAction;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->c:Lca/d;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->d:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {v1}, Lcom/zykj/blackboard/core/action/TextAction;->M(Lcom/zykj/blackboard/core/action/TextAction;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lca/d;->G(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->d:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/TextAction;->O(Lcom/zykj/blackboard/core/action/TextAction;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->d:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv9/c;->g()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;->d:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->Q(Lcom/zykj/blackboard/core/action/TextAction;Z)V

    return-void
.end method
