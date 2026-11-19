.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u000fJ\u001d\u0010\u001f\u001a\u00020\t2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008!\u0010\u000fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0015\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u001cH\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008+\u0010\u000fJ\u001f\u0010,\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008,\u0010%J\u001f\u0010-\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008-\u0010%J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u00082\u0010\u000fJ\u001f\u00103\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u00083\u0010%J\u001f\u00104\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u00084\u0010%J\u001f\u00105\u001a\u00020#2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u00085\u0010%R$\u00107\u001a\u0004\u0018\u0001068\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020(0=j\u0008\u0012\u0004\u0012\u00020(`>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00160=j\u0008\u0012\u0004\u0012\u00020\u0016`>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010@R\u0014\u0010B\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010D\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010CR$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u00160=j\u0008\u0012\u0004\u0012\u00020\u0016`>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010@R\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010J\u001a\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u001c\u0010M\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010*\u00a8\u0006N"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "<init>",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "",
        "offset",
        "Ld6/s;",
        "handleTextSize",
        "(F)V",
        "x",
        "handleHScale",
        "initFunctionTypeList",
        "()V",
        "initFunctionRelativeRectF",
        "recalculateColorRectFList",
        "",
        "content",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/RectF;",
        "rectF",
        "calculateRectF",
        "(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;",
        "updateSelectedRectF",
        "calculateFunctionRectF",
        "",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
        "setSelectGraphList",
        "(Ljava/util/List;)V",
        "updateFunctionRectF",
        "y",
        "",
        "isClickInSelectFunction",
        "(FF)Z",
        "getMaxFunctionRectF",
        "()Landroid/graphics/RectF;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "getCurrentFunctionTypeList",
        "()Ljava/util/List;",
        "reset",
        "handleClick",
        "handleDoubleClick",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "handleTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "handleCustomColorUsed",
        "handleMoveStart",
        "handleMoving",
        "handleMoveEnd",
        "",
        "lastChangeColor",
        "Ljava/lang/Integer;",
        "getLastChangeColor",
        "()Ljava/lang/Integer;",
        "setLastChangeColor",
        "(Ljava/lang/Integer;)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "functionTypeList",
        "Ljava/util/ArrayList;",
        "funcRelativeRectFList",
        "sizeAdd",
        "Landroid/graphics/RectF;",
        "sizeReduce",
        "colorRectFList",
        "selectGraphOriginWidth",
        "F",
        "getSingleGraph",
        "()Z",
        "singleGraph",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "getFunctionColorList",
        "functionColorList",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final colorRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final funcRelativeRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final functionTypeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastChangeColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selectGraphOriginWidth:F

.field private final sizeAdd:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sizeReduce:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeAdd:Landroid/graphics/RectF;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeReduce:Landroid/graphics/RectF;

    .line 36
    .line 37
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->initFunctionTypeList()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->initFunctionRelativeRectF()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final synthetic access$calculateRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$updateSelectedRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateSelectedRectF()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final calculateFunctionRectF()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getMaxFunctionRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectFAfterTransform()Landroid/graphics/RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getLimitRectFInPage()Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectFBySelectRectF(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setDirectionLeft(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateFunctionRectF()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->updateFunctionBackgroundRectF()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private final calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 12
    .line 13
    sub-float/2addr v0, v1

    .line 14
    sget-object v1, Lcom/zykj/blackboard/utils/TextGraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/TextGraphUtils;

    .line 15
    .line 16
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, p1, p2, v2}, Lcom/zykj/blackboard/utils/TextGraphUtils;->calculateTextToList(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-float p1, p1

    .line 29
    mul-float/2addr v0, p1

    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    cmpl-float p1, v0, p1

    .line 43
    .line 44
    if-lez p1, :cond_0

    .line 45
    .line 46
    iget p1, p3, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    add-float/2addr v0, p1

    .line 49
    iput v0, p3, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    return-object p3

    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 65
    .line 66
    add-float/2addr p1, p2

    .line 67
    iput p1, p3, Landroid/graphics/RectF;->bottom:F

    .line 68
    .line 69
    return-object p3
.end method

.method private final getFunctionColorList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getTextEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->getColorList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private final getSingleGraph()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private final handleHScale(F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFirstX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr p1, v0

    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast v0, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 41
    .line 42
    .line 43
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->selectGraphOriginWidth:F

    .line 44
    .line 45
    add-float/2addr v2, p1

    .line 46
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    const/4 v4, 0x2

    .line 92
    int-to-float v4, v4

    .line 93
    mul-float/2addr v3, v4

    .line 94
    cmpg-float v3, v2, v3

    .line 95
    .line 96
    if-lez v3, :cond_2

    .line 97
    .line 98
    cmpg-float p1, v2, p1

    .line 99
    .line 100
    if-gtz p1, :cond_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    new-instance v1, Landroid/graphics/RectF;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 118
    .line 119
    .line 120
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 121
    .line 122
    add-float/2addr v2, p1

    .line 123
    iput v2, v1, Landroid/graphics/RectF;->right:F

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0, p1, v2, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 148
    .line 149
    const-string v0, "Char sequence is empty."

    .line 150
    .line 151
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_2
    :goto_0
    return-void
.end method

.method private final handleTextSize(F)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v3, "TextFunction:TextSize -> offset:"

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v3, " list: "

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v5, 0xa

    .line 27
    .line 28
    invoke-static {v3, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v6, 0x0

    .line 40
    move v7, v6

    .line 41
    :goto_0
    if-ge v7, v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    add-int/lit8 v7, v7, 0x1

    .line 48
    .line 49
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    move v4, v6

    .line 82
    :cond_1
    :goto_1
    if-ge v4, v3, :cond_7

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    move-object v8, v5

    .line 91
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 92
    .line 93
    instance-of v5, v8, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 94
    .line 95
    if-eqz v5, :cond_1

    .line 96
    .line 97
    move-object v5, v8

    .line 98
    check-cast v5, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 99
    .line 100
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    if-eqz v7, :cond_1

    .line 105
    .line 106
    new-instance v9, Landroid/graphics/Matrix;

    .line 107
    .line 108
    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Landroid/graphics/Paint;->getTextSize()F

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    add-float/2addr v10, v1

    .line 138
    const/4 v11, 0x0

    .line 139
    cmpg-float v12, v1, v11

    .line 140
    .line 141
    if-gez v12, :cond_2

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-virtual {v12}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextMinSize()F

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    cmpg-float v12, v10, v12

    .line 152
    .line 153
    if-ltz v12, :cond_1

    .line 154
    .line 155
    :cond_2
    cmpl-float v11, v1, v11

    .line 156
    .line 157
    if-lez v11, :cond_3

    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-virtual {v11}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextMaxSize()F

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    cmpl-float v11, v10, v11

    .line 168
    .line 169
    if-lez v11, :cond_3

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    invoke-static {v9}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v9, v10}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v7}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 184
    .line 185
    .line 186
    new-instance v9, Landroid/graphics/RectF;

    .line 187
    .line 188
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    invoke-direct {v9, v11}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    const-string v12, ""

    .line 200
    .line 201
    if-nez v11, :cond_4

    .line 202
    .line 203
    move-object v11, v12

    .line 204
    :cond_4
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v0, v11, v13, v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v9}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-interface {v11}, Lcom/zykj/blackboard/core/action/IActionListener;->getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    if-eqz v11, :cond_5

    .line 226
    .line 227
    invoke-interface {v11, v10}, Lcom/zykj/blackboard/listener/ITextSelectListener;->textSizeChange(F)V

    .line 228
    .line 229
    .line 230
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    if-nez v5, :cond_6

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_6
    move-object v12, v5

    .line 246
    :goto_2
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-interface {v10, v11, v12, v7, v5}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    move-object v10, v9

    .line 258
    sget-object v9, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 259
    .line 260
    new-instance v12, Landroid/graphics/Paint;

    .line 261
    .line 262
    invoke-direct {v12, v7}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 263
    .line 264
    .line 265
    const/16 v16, 0xe8

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v13, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    const/4 v15, 0x0

    .line 273
    move-object v7, v5

    .line 274
    invoke-static/range {v7 .. v17}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 284
    .line 285
    .line 286
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateSelectedRectF()V

    .line 287
    .line 288
    .line 289
    const/4 v1, 0x0

    .line 290
    const/4 v2, 0x1

    .line 291
    invoke-static {v0, v6, v2, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method private final initFunctionRelativeRectF()V
    .locals 12

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 27
    .line 28
    sub-float/2addr v1, v2

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float/2addr v2, v1

    .line 38
    const/4 v3, 0x2

    .line 39
    int-to-float v3, v3

    .line 40
    div-float/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-float/2addr v4, v1

    .line 50
    div-float/2addr v4, v3

    .line 51
    add-float/2addr v4, v1

    .line 52
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x0

    .line 64
    move v8, v7

    .line 65
    :cond_0
    :goto_0
    if-ge v8, v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    move-object v10, v9

    .line 74
    check-cast v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 75
    .line 76
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-lez v10, :cond_0

    .line 85
    .line 86
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v6, 0x41b80000    # 23.0f

    .line 95
    .line 96
    :goto_1
    if-ge v7, v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    add-int/lit8 v7, v7, 0x1

    .line 103
    .line 104
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 105
    .line 106
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    iget-object v9, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v10, Landroid/graphics/RectF;

    .line 117
    .line 118
    add-float v11, v6, v8

    .line 119
    .line 120
    invoke-direct {v10, v6, v2, v11, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    const/high16 v9, 0x41f00000    # 30.0f

    .line 127
    .line 128
    add-float/2addr v8, v9

    .line 129
    add-float/2addr v6, v8

    .line 130
    goto :goto_1

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeReduce:Landroid/graphics/RectF;

    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/high16 v2, 0x41c00000    # 24.0f

    .line 142
    .line 143
    sub-float/2addr v1, v2

    .line 144
    div-float/2addr v1, v3

    .line 145
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    sub-float/2addr v4, v2

    .line 154
    div-float/2addr v4, v3

    .line 155
    add-float/2addr v4, v2

    .line 156
    const/high16 v5, 0x42000000    # 32.0f

    .line 157
    .line 158
    const/high16 v6, 0x42600000    # 56.0f

    .line 159
    .line 160
    invoke-virtual {v0, v5, v1, v6, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeAdd:Landroid/graphics/RectF;

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    sub-float/2addr v1, v2

    .line 174
    div-float/2addr v1, v3

    .line 175
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    sub-float/2addr v4, v2

    .line 184
    div-float/2addr v4, v3

    .line 185
    add-float/2addr v4, v2

    .line 186
    const/high16 v2, 0x42f40000    # 122.0f

    .line 187
    .line 188
    const/high16 v3, 0x43120000    # 146.0f

    .line 189
    .line 190
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->recalculateColorRectFList()V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method private final initFunctionTypeList()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getSingleGraph()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;-><init>(ZLjava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 33
    .line 34
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final recalculateColorRectFList()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x42180000    # 38.0f

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v0, v2

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-float/2addr v3, v1

    .line 29
    div-float/2addr v3, v2

    .line 30
    add-float/2addr v3, v1

    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-ge v4, v2, :cond_0

    .line 49
    .line 50
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v6, Landroid/graphics/RectF;

    .line 53
    .line 54
    const/high16 v7, 0x42740000    # 61.0f

    .line 55
    .line 56
    int-to-float v8, v4

    .line 57
    mul-float/2addr v8, v7

    .line 58
    const/high16 v7, 0x41b80000    # 23.0f

    .line 59
    .line 60
    add-float/2addr v8, v7

    .line 61
    add-float v7, v8, v1

    .line 62
    .line 63
    invoke-direct {v6, v8, v0, v7, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method

.method private final updateSelectedRectF()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v3, v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v4, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getTransformMatrix()Landroid/graphics/Matrix;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 52
    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public getCurrentFunctionTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastChangeColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->lastChangeColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFunctionRectF()Landroid/graphics/RectF;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    const/high16 v1, 0x41700000    # 15.0f

    .line 12
    .line 13
    add-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x41000000    # 8.0f

    .line 15
    .line 16
    add-float/2addr v0, v1

    .line 17
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    const/high16 v2, 0x41b80000    # 23.0f

    .line 28
    .line 29
    add-float/2addr v1, v2

    .line 30
    const/high16 v2, 0x433f0000    # 191.0f

    .line 31
    .line 32
    add-float/2addr v1, v2

    .line 33
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getFunctionColorList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v2, v3

    .line 46
    :goto_0
    if-eqz v2, :cond_1

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v2, 0x0

    .line 51
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/4 v5, 0x0

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v4, v3

    .line 66
    :goto_2
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-interface {v4}, Lcom/zykj/blackboard/proxy/CustomColorView;->getWidth()F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v4, v5

    .line 74
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const/high16 v7, 0x41500000    # 13.0f

    .line 83
    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    move-object v3, v6

    .line 89
    :cond_4
    if-eqz v3, :cond_5

    .line 90
    .line 91
    invoke-interface {v3}, Lcom/zykj/blackboard/proxy/CustomColorView;->getHeight()F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    add-float/2addr v2, v7

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move v2, v5

    .line 98
    :goto_4
    new-instance v3, Lkotlin/Pair;

    .line 99
    .line 100
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    const/4 v6, 0x2

    .line 117
    int-to-float v6, v6

    .line 118
    mul-float/2addr v1, v6

    .line 119
    add-float/2addr v1, v7

    .line 120
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectSizePair(Lkotlin/Pair;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    add-float/2addr v1, v2

    .line 163
    new-instance v2, Landroid/graphics/RectF;

    .line 164
    .line 165
    invoke-direct {v2, v5, v5, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 166
    .line 167
    .line 168
    return-object v2
.end method

.method public handleClick(FF)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleClick(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;->getIndex()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-interface {p1, p2, v2, v3}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->reset()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getTextEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_e

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    xor-int/2addr v0, v1

    .line 97
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->setSelected(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    instance-of v0, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Add;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    const/high16 p1, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->handleTextSize(F)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_4
    instance-of v0, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Reduce;

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    const/high16 p1, -0x3f800000    # -4.0f

    .line 121
    .line 122
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->handleTextSize(F)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :cond_5
    instance-of p1, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 128
    .line 129
    if-eqz p1, :cond_e

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 136
    .line 137
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;->getIndex()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getFunctionColorList()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    return v1

    .line 153
    :cond_6
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;

    .line 154
    .line 155
    invoke-direct {v2, p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleClick$changeColor$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    instance-of v3, v3, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 163
    .line 164
    if-eqz v3, :cond_d

    .line 165
    .line 166
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_8

    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-ne v3, v1, :cond_8

    .line 177
    .line 178
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->setOpen(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-nez p1, :cond_7

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_7
    const/4 v0, 0x0

    .line 193
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 194
    .line 195
    .line 196
    :goto_0
    invoke-virtual {p0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    if-nez p1, :cond_9

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_9
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->setOpen(Z)V

    .line 204
    .line 205
    .line 206
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-nez p1, :cond_a

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_a
    invoke-interface {p1, v2}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-eqz p1, :cond_b

    .line 225
    .line 226
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    goto :goto_3

    .line 231
    :cond_b
    move p1, p2

    .line 232
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-eqz v3, :cond_c

    .line 241
    .line 242
    invoke-interface {v3, p1}, Lcom/zykj/blackboard/proxy/CustomColorView;->isColorExist(I)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-ne v3, v1, :cond_c

    .line 247
    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-interface {v2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_c
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->selectCustom(Ljava/util/List;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_d
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-interface {v2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    :cond_e
    :goto_4
    return v1
.end method

.method public handleCustomColorUsed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getLastChangeColor()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->onColorUsed(Ljava/lang/Integer;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public handleDoubleClick(FF)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    const-string p2, ""

    .line 35
    .line 36
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getTextEditView()Lcom/zykj/blackboard/proxy/TextEditView;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$1;

    .line 56
    .line 57
    invoke-direct {v2, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;

    .line 61
    .line 62
    invoke-direct {v3, p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$2;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;

    .line 66
    .line 67
    invoke-direct {v4, p1, p2, v0, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction$handleDoubleClick$3;-><init>(Lcom/zykj/blackboard/core/graph/group/TextGraph;Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p2, v2, v3, v4}, Lcom/zykj/blackboard/proxy/TextEditView;->showEditView(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    return p2
.end method

.method public handleMoveEnd(FF)Z
    .locals 13

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleMoveEnd(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->handleHScale(F)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateSelectedRectF()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateFunctionRectF()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v2, p1

    .line 41
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getCurrentFunctionTypeList()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const/16 v11, 0x40

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    invoke-static/range {v3 .. v12}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;->newChangeHandleEnd$default(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 85
    .line 86
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/16 v10, 0xf8

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    invoke-static/range {v1 .. v11}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 106
    .line 107
    .line 108
    return v0
.end method

.method public handleMoveStart(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 26
    .line 27
    new-instance p2, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->selectGraphOriginWidth:F

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateSelectedRectF()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateFunctionRectF()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v1, p1

    .line 87
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getCurrentFunctionTypeList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const/16 v9, 0x80

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;->newChangeHandleStart$default(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    const/4 p1, 0x0

    .line 122
    return p1

    .line 123
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 124
    return p1
.end method

.method public handleMoving(FF)Z
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleMoving(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->handleHScale(F)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->updateSelectedRectF()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->calculateFunctionRectF()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v2, p1

    .line 49
    check-cast v2, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getCurrentFunctionTypeList()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const/16 v10, 0x80

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    invoke-static/range {v1 .. v11}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;->newChangeHandling$default(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return v0
.end method

.method public handleTouchEvent(Landroid/view/MotionEvent;)V
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    sub-float/2addr v1, v2

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    sub-float/2addr v2, v3

    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/proxy/CustomColorView;->dispatchTouchEvent(Landroid/view/MotionEvent;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public isClickInSelectFunction(FF)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getEditRectF()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getTextEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_a

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Add;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Add;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Reduce;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Reduce;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 120
    .line 121
    .line 122
    return v2

    .line 123
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getTextSizeRectF()Landroid/graphics/RectF;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    move v3, v1

    .line 156
    :goto_0
    if-ge v3, v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Landroid/graphics/RectF;

    .line 171
    .line 172
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_6

    .line 177
    .line 178
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 179
    .line 180
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 184
    .line 185
    .line 186
    return v2

    .line 187
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getColorRectF()Landroid/graphics/RectF;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_8

    .line 203
    .line 204
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 207
    .line 208
    .line 209
    return v2

    .line 210
    :cond_8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getFunctionColorList()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-ne v0, v2, :cond_a

    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_9

    .line 241
    .line 242
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 245
    .line 246
    .line 247
    return v2

    .line 248
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getCustomColorRectF()Landroid/graphics/RectF;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_a

    .line 261
    .line 262
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 263
    .line 264
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 265
    .line 266
    .line 267
    return v2

    .line 268
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const/4 v3, 0x2

    .line 277
    new-array v4, v3, [F

    .line 278
    .line 279
    aput p1, v4, v1

    .line 280
    .line 281
    aput p2, v4, v2

    .line 282
    .line 283
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 284
    .line 285
    .line 286
    aget p1, v4, v1

    .line 287
    .line 288
    aget p2, v4, v2

    .line 289
    .line 290
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    new-instance v4, Landroid/graphics/RectF;

    .line 303
    .line 304
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 309
    .line 310
    int-to-float v3, v3

    .line 311
    div-float/2addr v0, v3

    .line 312
    sub-float/2addr v5, v0

    .line 313
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    sub-float/2addr v3, v0

    .line 322
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 327
    .line 328
    add-float/2addr v6, v0

    .line 329
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    add-float/2addr v7, v0

    .line 338
    invoke-direct {v4, v5, v3, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 339
    .line 340
    .line 341
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getSingleGraph()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_b

    .line 346
    .line 347
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_b

    .line 352
    .line 353
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;

    .line 354
    .line 355
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 356
    .line 357
    .line 358
    return v2

    .line 359
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-eqz p1, :cond_c

    .line 368
    .line 369
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 370
    .line 371
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 372
    .line 373
    .line 374
    return v2

    .line 375
    :cond_c
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 376
    .line 377
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 378
    .line 379
    .line 380
    return v1
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->initFunctionTypeList()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->setLastChangeColor(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setLastChangeColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->lastChangeColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectGraphList(Ljava/util/List;)V
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectGraphList(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getTextEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_14

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getSingleGraph()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->setSingle(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object p1, v2

    .line 58
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v4, -0x1

    .line 76
    const/4 v5, 0x0

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    :cond_1
    move v7, v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    move v7, v5

    .line 86
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 97
    .line 98
    instance-of v9, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 99
    .line 100
    if-nez v9, :cond_3

    .line 101
    .line 102
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-ne v8, v9, :cond_3

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :goto_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move v6, v5

    .line 121
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_11

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    add-int/lit8 v9, v6, 0x1

    .line 132
    .line 133
    if-ltz v6, :cond_10

    .line 134
    .line 135
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 136
    .line 137
    instance-of v10, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 138
    .line 139
    const/4 v11, 0x1

    .line 140
    if-eqz v10, :cond_7

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    if-ne v7, v4, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-eqz v8, :cond_4

    .line 159
    .line 160
    invoke-interface {v8, v6}, Lcom/zykj/blackboard/proxy/CustomColorView;->isColorExist(I)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    goto :goto_4

    .line 165
    :cond_4
    move v6, v5

    .line 166
    :goto_4
    if-eqz v6, :cond_5

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_5
    move v11, v5

    .line 170
    :goto_5
    new-instance v6, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 171
    .line 172
    if-eqz v11, :cond_6

    .line 173
    .line 174
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    goto :goto_6

    .line 182
    :cond_6
    move v8, v5

    .line 183
    :goto_6
    invoke-direct {v6, v8, v11, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;-><init>(IZZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_c

    .line 187
    :cond_7
    instance-of v10, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;

    .line 188
    .line 189
    if-eqz v10, :cond_9

    .line 190
    .line 191
    new-instance v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;

    .line 192
    .line 193
    if-ne v6, v7, :cond_8

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_8
    move v11, v5

    .line 197
    :goto_7
    invoke-direct {v8, v11}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;-><init>(Z)V

    .line 198
    .line 199
    .line 200
    :goto_8
    move-object v6, v8

    .line 201
    goto :goto_c

    .line 202
    :cond_9
    instance-of v10, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;

    .line 203
    .line 204
    if-eqz v10, :cond_b

    .line 205
    .line 206
    new-instance v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;

    .line 207
    .line 208
    if-ne v6, v7, :cond_a

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_a
    move v11, v5

    .line 212
    :goto_9
    invoke-direct {v8, v11}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;-><init>(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_b
    instance-of v10, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;

    .line 217
    .line 218
    if-eqz v10, :cond_d

    .line 219
    .line 220
    new-instance v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;

    .line 221
    .line 222
    if-ne v6, v7, :cond_c

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_c
    move v11, v5

    .line 226
    :goto_a
    invoke-direct {v8, v11}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;-><init>(Z)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_d
    instance-of v10, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;

    .line 231
    .line 232
    if-eqz v10, :cond_f

    .line 233
    .line 234
    new-instance v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;

    .line 235
    .line 236
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-ne v6, v7, :cond_e

    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_e
    move v11, v5

    .line 244
    :goto_b
    invoke-direct {v10, v8, v11}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;-><init>(IZ)V

    .line 245
    .line 246
    .line 247
    move-object v6, v10

    .line 248
    :goto_c
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move v6, v9

    .line 252
    goto/16 :goto_3

    .line 253
    .line 254
    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 255
    .line 256
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_10
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 261
    .line 262
    .line 263
    throw v2

    .line 264
    :cond_11
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->setColorList(Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    if-eqz p1, :cond_13

    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->getColorList()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_12

    .line 286
    .line 287
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    :cond_12
    invoke-interface {p1, v2}, Lcom/zykj/blackboard/proxy/CustomColorView;->initColor(Ljava/lang/Integer;)V

    .line 296
    .line 297
    .line 298
    :cond_13
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->recalculateColorRectFList()V

    .line 299
    .line 300
    .line 301
    :cond_14
    return-void
.end method

.method public updateFunctionRectF()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    add-float/2addr v3, v4

    .line 29
    const/high16 v4, 0x41700000    # 15.0f

    .line 30
    .line 31
    sub-float/2addr v3, v4

    .line 32
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget-object v8, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    add-float/2addr v7, v8

    .line 55
    add-float/2addr v7, v4

    .line 56
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    add-float/2addr v9, v8

    .line 71
    invoke-virtual {v2, v3, v6, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Landroid/graphics/RectF;

    .line 92
    .line 93
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    add-float/2addr v3, v6

    .line 96
    sub-float/2addr v3, v4

    .line 97
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 108
    .line 109
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 118
    .line 119
    add-float/2addr v8, v7

    .line 120
    add-float/2addr v8, v4

    .line 121
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    add-float/2addr v7, v4

    .line 136
    invoke-virtual {v2, v3, v6, v8, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 148
    .line 149
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeReduce:Landroid/graphics/RectF;

    .line 150
    .line 151
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 152
    .line 153
    add-float/2addr v3, v4

    .line 154
    const/high16 v4, 0x42000000    # 32.0f

    .line 155
    .line 156
    sub-float/2addr v3, v4

    .line 157
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    add-float/2addr v7, v6

    .line 172
    const/high16 v6, 0x41500000    # 13.0f

    .line 173
    .line 174
    add-float/2addr v7, v6

    .line 175
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 180
    .line 181
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeReduce:Landroid/graphics/RectF;

    .line 182
    .line 183
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 184
    .line 185
    add-float/2addr v8, v9

    .line 186
    add-float/2addr v8, v4

    .line 187
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    const/4 v11, 0x2

    .line 202
    int-to-float v11, v11

    .line 203
    mul-float/2addr v10, v11

    .line 204
    add-float/2addr v10, v9

    .line 205
    add-float/2addr v10, v6

    .line 206
    invoke-virtual {v2, v3, v7, v8, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 218
    .line 219
    iget-object v7, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeAdd:Landroid/graphics/RectF;

    .line 220
    .line 221
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 222
    .line 223
    add-float/2addr v3, v7

    .line 224
    sub-float/2addr v3, v4

    .line 225
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    add-float/2addr v8, v7

    .line 240
    add-float/2addr v8, v6

    .line 241
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 246
    .line 247
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->sizeAdd:Landroid/graphics/RectF;

    .line 248
    .line 249
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 250
    .line 251
    add-float/2addr v7, v9

    .line 252
    add-float/2addr v7, v4

    .line 253
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 258
    .line 259
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    mul-float/2addr v9, v11

    .line 268
    add-float/2addr v9, v4

    .line 269
    add-float/2addr v9, v6

    .line 270
    invoke-virtual {v2, v3, v8, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 278
    .line 279
    add-float/2addr v2, v6

    .line 280
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 285
    .line 286
    .line 287
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    move v7, v5

    .line 294
    :goto_0
    if-ge v7, v4, :cond_0

    .line 295
    .line 296
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    add-int/lit8 v7, v7, 0x1

    .line 301
    .line 302
    check-cast v8, Landroid/graphics/RectF;

    .line 303
    .line 304
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    new-instance v10, Landroid/graphics/RectF;

    .line 309
    .line 310
    iget v12, v8, Landroid/graphics/RectF;->left:F

    .line 311
    .line 312
    add-float/2addr v12, v2

    .line 313
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 318
    .line 319
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    invoke-virtual {v14}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    add-float/2addr v14, v13

    .line 328
    add-float/2addr v14, v6

    .line 329
    iget v13, v8, Landroid/graphics/RectF;->top:F

    .line 330
    .line 331
    add-float/2addr v14, v13

    .line 332
    iget v13, v8, Landroid/graphics/RectF;->right:F

    .line 333
    .line 334
    add-float/2addr v13, v2

    .line 335
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 336
    .line 337
    .line 338
    move-result-object v15

    .line 339
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 342
    .line 343
    .line 344
    move-result-object v16

    .line 345
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 346
    .line 347
    .line 348
    move-result v16

    .line 349
    add-float v16, v16, v15

    .line 350
    .line 351
    add-float v16, v16, v6

    .line 352
    .line 353
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 354
    .line 355
    add-float v8, v16, v8

    .line 356
    .line 357
    invoke-direct {v10, v12, v14, v13, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_0

    .line 364
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-eqz v2, :cond_3

    .line 384
    .line 385
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;->getFunctionColorList()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    const/4 v4, 0x0

    .line 390
    if-eqz v3, :cond_1

    .line 391
    .line 392
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    goto :goto_1

    .line 397
    :cond_1
    move-object v3, v4

    .line 398
    :goto_1
    if-eqz v3, :cond_2

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_2
    move-object v2, v4

    .line 402
    :goto_2
    if-eqz v2, :cond_3

    .line 403
    .line 404
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 413
    .line 414
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    add-float/2addr v8, v6

    .line 429
    mul-float/2addr v8, v11

    .line 430
    add-float/2addr v8, v7

    .line 431
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 436
    .line 437
    invoke-interface {v2}, Lcom/zykj/blackboard/proxy/CustomColorView;->getWidth()F

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    add-float/2addr v9, v7

    .line 442
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 447
    .line 448
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    add-float/2addr v10, v6

    .line 457
    mul-float/2addr v10, v11

    .line 458
    add-float/2addr v10, v7

    .line 459
    invoke-interface {v2}, Lcom/zykj/blackboard/proxy/CustomColorView;->getHeight()F

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    add-float/2addr v2, v10

    .line 464
    invoke-virtual {v3, v4, v8, v9, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 465
    .line 466
    .line 467
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft()Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-nez v2, :cond_5

    .line 472
    .line 473
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 478
    .line 479
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 484
    .line 485
    sub-float/2addr v2, v3

    .line 486
    const/high16 v3, 0x41800000    # 16.0f

    .line 487
    .line 488
    add-float/2addr v2, v3

    .line 489
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    sub-float/2addr v4, v2

    .line 502
    const/4 v7, 0x0

    .line 503
    invoke-virtual {v3, v4, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    sub-float/2addr v4, v2

    .line 519
    invoke-virtual {v3, v4, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 527
    .line 528
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 533
    .line 534
    sub-float/2addr v2, v3

    .line 535
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    check-cast v3, Landroid/graphics/RectF;

    .line 544
    .line 545
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 546
    .line 547
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-static {v4}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    check-cast v4, Landroid/graphics/RectF;

    .line 556
    .line 557
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 558
    .line 559
    sub-float/2addr v3, v4

    .line 560
    const/high16 v4, 0x42380000    # 46.0f

    .line 561
    .line 562
    add-float/2addr v3, v4

    .line 563
    add-float/2addr v2, v6

    .line 564
    add-float/2addr v2, v3

    .line 565
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    sub-float/2addr v3, v2

    .line 574
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-virtual {v2, v3, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-virtual {v2, v3, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    :goto_3
    if-ge v5, v4, :cond_4

    .line 597
    .line 598
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    add-int/lit8 v5, v5, 0x1

    .line 603
    .line 604
    check-cast v6, Landroid/graphics/RectF;

    .line 605
    .line 606
    invoke-virtual {v6, v3, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 607
    .line 608
    .line 609
    goto :goto_3

    .line 610
    :cond_4
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    sub-float/2addr v3, v2

    .line 631
    invoke-virtual {v1, v3, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 632
    .line 633
    .line 634
    :cond_5
    return-void
.end method
