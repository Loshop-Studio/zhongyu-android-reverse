.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


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
        "Lhd/l;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/action/TextAction;

.field public final synthetic d:Lca/d;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;Lca/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->invoke(Ljava/lang/String;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v1}, Lca/d;->F()Landroid/graphics/Paint;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 4
    new-instance v2, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v3}, Lba/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 5
    invoke-static {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/action/TextAction;->J(Lcom/zykj/blackboard/core/action/TextAction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v1}, Lba/a;->g()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p(Landroid/graphics/RectF;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v0, p1}, Lca/d;->G(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->I(Lcom/zykj/blackboard/core/action/TextAction;Lba/c;)V

    .line 10
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->Y()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->Z()Landroid/graphics/Matrix;

    move-result-object v2

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/TextAction;->L(Lcom/zykj/blackboard/core/action/TextAction;)Landroid/graphics/Paint;

    move-result-object v3

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/TextAction;->K(Lcom/zykj/blackboard/core/action/TextAction;)F

    move-result v4

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lv9/c;->y(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->c:Lcom/zykj/blackboard/core/action/TextAction;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;->d:Lca/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v0}, Lv9/c;->j(Ljava/util/List;)V

    :cond_2
    return-void
.end method
