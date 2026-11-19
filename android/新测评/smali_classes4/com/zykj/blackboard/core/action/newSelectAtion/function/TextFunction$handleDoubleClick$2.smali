.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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
.field public final synthetic a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

.field public final synthetic b:Lr4/d;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lr4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

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

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Li4/a;->o()Lk4/c;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    invoke-virtual {v0}, Lq4/a;->getId()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    invoke-virtual {v1}, Lr4/d;->I()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    invoke-virtual {v2}, Lr4/d;->J()Landroid/graphics/Paint;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    invoke-virtual {v3}, Lq4/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    .line 7
    invoke-interface {p1, v0, v1, v2, v3}, Lk4/c;->B(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-static {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->Z(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Li4/a;->V(Li4/a;ZILjava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Li4/a;->q()Lg4/b;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    .line 12
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    invoke-virtual {v1}, Lq4/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    .line 14
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->b:Lr4/d;

    invoke-virtual {p1}, Lr4/d;->I()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0xf0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 15
    invoke-static/range {v0 .. v10}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 16
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {p1}, Li4/a;->q()Lg4/b;

    move-result-object p1

    invoke-interface {p1}, Lg4/b;->l()V

    return-void
.end method
