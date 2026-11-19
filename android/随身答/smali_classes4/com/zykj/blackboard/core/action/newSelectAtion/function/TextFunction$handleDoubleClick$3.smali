.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->B(FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lh5/d;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/graphics/RectF;

.field public final synthetic d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;


# direct methods
.method public constructor <init>(Lh5/d;Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->c:Landroid/graphics/RectF;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lh5/d;->J(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->c:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    invoke-virtual {v1}, Lg5/a;->f()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->c:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n(Landroid/graphics/RectF;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v0}, Ly4/a;->o()La5/c;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    invoke-virtual {v1}, Lg5/a;->getId()Ljava/lang/String;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    invoke-virtual {v2}, Lh5/d;->H()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, ""

    .line 8
    :cond_1
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    invoke-virtual {v3}, Lh5/d;->I()Landroid/graphics/Paint;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->a:Lh5/d;

    invoke-virtual {v4}, Lg5/a;->f()Landroid/graphics/RectF;

    move-result-object v4

    .line 10
    invoke-interface {v0, v1, v2, v3, v4}, La5/c;->C(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->Z(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;->d:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ly4/a;->V(Ly4/a;ZILjava/lang/Object;)V

    return-void
.end method
