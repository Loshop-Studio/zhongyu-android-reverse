.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->handleClick(FF)Z
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

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

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

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->invoke(I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    sget-object v2, Lcom/zykj/blackboard/utils/ColorUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ColorUtils;

    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getHighlighterColorAlpha()F

    move-result v3

    invoke-virtual {v2, v1, v3}, Lcom/zykj/blackboard/utils/ColorUtils;->toAlphaColor(IF)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    .line 4
    :goto_0
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    .line 5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :cond_1
    :goto_1
    if-ge v7, v5, :cond_4

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    move-result-object v9

    .line 7
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 8
    instance-of v10, v12, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    if-eqz v10, :cond_2

    .line 9
    move-object v10, v12

    check-cast v10, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    invoke-virtual {v10}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    move-result-object v10

    if-eqz v10, :cond_2

    .line 10
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v11

    .line 12
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14, v10}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    const/16 v20, 0xec

    const/16 v21, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 14
    invoke-static/range {v11 .. v21}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    .line 15
    :cond_3
    instance-of v9, v8, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    if-eqz v9, :cond_1

    .line 16
    check-cast v8, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    const/4 v9, 0x1

    invoke-interface {v8, v9}, Lcom/zykj/blackboard/core/graph/group/IChangeField;->changeUpdate(Z)V

    goto :goto_1

    .line 17
    :cond_4
    const-string v3, "WriteFunction:Color -> color:"

    const-string v4, " list: "

    .line 18
    invoke-static {v2, v3, v4}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 19
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    move-result-object v3

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v7, v6

    :goto_3
    if-ge v7, v5, :cond_5

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    .line 22
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 23
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 24
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorChangeListener()Lr6/c;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    :cond_6
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 26
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 27
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1$3;

    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-direct {v3, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1$3;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;)V

    invoke-static {v2, v1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->handleWithColor(Ljava/util/List;ILr6/c;)V

    .line 28
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->$functionColorList:Ljava/util/List;

    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->setLastChangeColor(Ljava/lang/Integer;)V

    .line 29
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;

    invoke-virtual {v1, v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    return-void
.end method
