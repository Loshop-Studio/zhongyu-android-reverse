.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->x(FF)Z
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
.field public final synthetic c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

.field public final synthetic d:Lca/d;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lca/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

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

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->invoke(Ljava/lang/String;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lt9/a;->l()Lv9/c;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    invoke-virtual {v0}, Lba/a;->getId()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    invoke-virtual {v1}, Lca/d;->E()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    invoke-virtual {v2}, Lca/d;->F()Landroid/graphics/Paint;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    invoke-virtual {v3}, Lba/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    .line 7
    invoke-interface {p1, v0, v1, v2, v3}, Lv9/c;->C(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->T(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lt9/a;->Q(Lt9/a;ZILjava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lt9/a;->n()Lr9/b;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    .line 12
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    invoke-virtual {v1}, Lba/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    .line 14
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->d:Lca/d;

    invoke-virtual {p1}, Lca/d;->E()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0xf0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 15
    invoke-static/range {v0 .. v10}, Lr9/b$a;->a(Lr9/b;Lba/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 16
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->c:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Lt9/a;->n()Lr9/b;

    move-result-object p1

    invoke-interface {p1}, Lr9/b;->l()V

    return-void
.end method
