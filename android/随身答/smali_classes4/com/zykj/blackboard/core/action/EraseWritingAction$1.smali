.class final Lcom/zykj/blackboard/core/action/EraseWritingAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/EraseWritingAction;-><init>()V
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
.field public final synthetic a:Lcom/zykj/blackboard/core/action/EraseWritingAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;->a:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;->a:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->K(Lcom/zykj/blackboard/core/action/EraseWritingAction;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;->a:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, La5/c;->m()Lg5/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lg5/c;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;->a:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg5/c;

    .line 5
    new-instance v3, Landroid/graphics/RectF;

    invoke-interface {v2}, Lg5/c;->f()Landroid/graphics/RectF;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    invoke-interface {v2}, Lg5/c;->b()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 8
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lz4/a;->b()Landroid/graphics/Matrix;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 9
    :cond_0
    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 10
    invoke-interface {v2}, Lg5/c;->e()Ljava/util/List;

    move-result-object v4

    .line 11
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg5/c;

    .line 12
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lz4/a;->b()Landroid/graphics/Matrix;

    move-result-object v6

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v5, v6}, Lg5/c;->i(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v6

    .line 13
    invoke-static {v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->K(Lcom/zykj/blackboard/core/action/EraseWritingAction;)Ljava/util/HashMap;

    move-result-object v7

    invoke-interface {v5}, Lg5/c;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-virtual {v3, v6}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    goto :goto_1

    .line 15
    :cond_2
    invoke-static {v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->K(Lcom/zykj/blackboard/core/action/EraseWritingAction;)Ljava/util/HashMap;

    move-result-object v4

    invoke-interface {v2}, Lg5/c;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method
