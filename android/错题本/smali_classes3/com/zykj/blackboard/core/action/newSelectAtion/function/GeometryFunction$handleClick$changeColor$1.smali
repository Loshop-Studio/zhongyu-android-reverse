.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->handleClick(FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "color",
        "Ld6/s;",
        "invoke",
        "(I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $functionColorList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

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

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->invoke(I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

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

    check-cast v9, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 4
    instance-of v7, v9, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    if-eqz v7, :cond_0

    .line 5
    move-object v7, v9

    check-cast v7, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    invoke-virtual {v7}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getPaint()Landroid/graphics/Paint;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 6
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v7, v8}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 7
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v7

    .line 8
    sget-object v10, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GEOMETRY_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    invoke-static/range {v8 .. v18}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_1
    const-string v2, "GeometryFunction:GeometryColor -> color:"

    const-string v3, " list: "

    .line 12
    invoke-static {v1, v2, v3}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 13
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    move-result-object v3

    .line 14
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v5

    :goto_1
    if-ge v7, v6, :cond_2

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    .line 16
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 17
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 18
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/blackboard/core/action/IActionListener;->getGeometrySelectListener()Lcom/zykj/blackboard/listener/IGeometrySelectListener;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Lcom/zykj/blackboard/listener/IGeometrySelectListener;->geometryColorChange(I)V

    .line 19
    :cond_3
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 20
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 21
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1$3;

    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-direct {v3, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1$3;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;)V

    invoke-static {v2, v1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->handleWithColor(Ljava/util/List;ILr6/c;)V

    .line 22
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->setLastChangeColor(Ljava/lang/Integer;)V

    .line 23
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;

    invoke-virtual {v1, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    return-void
.end method
