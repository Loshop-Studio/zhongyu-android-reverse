.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->A(FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "color",
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

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->b:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v2}, Li4/a;->u()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    .line 3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :cond_0
    :goto_0
    if-ge v6, v4, :cond_1

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    move-object v9, v7

    check-cast v9, Lq4/c;

    .line 4
    instance-of v7, v9, Lr4/d;

    if-eqz v7, :cond_0

    .line 5
    move-object v7, v9

    check-cast v7, Lr4/d;

    invoke-virtual {v7}, Lr4/d;->J()Landroid/graphics/Paint;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 6
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v7, v8}, Lr4/d;->L(Landroid/graphics/Paint;)V

    .line 7
    invoke-virtual {v3}, Li4/a;->q()Lg4/b;

    move-result-object v7

    .line 8
    sget-object v10, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 9
    new-instance v13, Landroid/graphics/Paint;

    invoke-direct {v13, v8}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    const/16 v17, 0xec

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v8, v7

    .line 10
    invoke-static/range {v8 .. v18}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TextFunction:TextColor -> color:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v3}, Li4/a;->u()Ljava/util/ArrayList;

    move-result-object v3

    .line 12
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v5

    :goto_1
    if-ge v7, v6, :cond_2

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    .line 14
    check-cast v8, Lq4/c;

    .line 15
    invoke-interface {v8}, Lq4/c;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 16
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    move-result-object v2

    invoke-interface {v2}, Lg4/b;->e()Lc5/f;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Lc5/f;->d(I)V

    .line 17
    :cond_3
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v2}, Li4/a;->o()Lk4/c;

    move-result-object v2

    invoke-interface {v2}, Lk4/c;->e()V

    .line 18
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    move-result-object v2

    invoke-interface {v2}, Lg4/b;->l()V

    .line 19
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->b:Ljava/util/List;

    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1$3;

    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-direct {v3, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1$3;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    invoke-static {v2, v1, v3}, Lh4/d;->g(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    .line 20
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->b:Ljava/util/List;

    invoke-static {v2}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lh4/f;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->k0(Ljava/lang/Integer;)V

    .line 21
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;->a:Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;

    invoke-virtual {v1, v5}, Li4/a;->U(Z)V

    return-void
.end method
