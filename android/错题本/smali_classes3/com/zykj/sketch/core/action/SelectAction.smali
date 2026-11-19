.class public final Lcom/zykj/sketch/core/action/SelectAction;
.super Lcom/zykj/sketch/core/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001bR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'R\"\u0010*\u001a\u00020%8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010\'\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Lcom/zykj/sketch/core/action/SelectAction;",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "actionControl",
        "<init>",
        "(Lcom/zykj/sketch/core/listener/IControl;)V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "it",
        "Ld6/s;",
        "initTempValue",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "event",
        "onTouchDown",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V",
        "onTouchPointerDown",
        "onTouchMove",
        "onTouchPointerUp",
        "onTouchUp",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "enumType",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "selectGraph",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "",
        "anchorX",
        "F",
        "anchorY",
        "oldDistance",
        "oldRotation",
        "Landroid/graphics/PointF;",
        "midPoint",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/Matrix;",
        "mTempMatrix",
        "Landroid/graphics/Matrix;",
        "",
        "NONE",
        "I",
        "DRAG",
        "ZOOM",
        "mode",
        "getMode",
        "()I",
        "setMode",
        "(I)V",
        "sketch_release"
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
.field private final DRAG:I

.field private final NONE:I

.field private final ZOOM:I

.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private anchorX:F

.field private anchorY:F

.field private mTempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private midPoint:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mode:I

.field private oldDistance:F

.field private oldRotation:F

.field private selectGraph:Lcom/zykj/sketch/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    const/high16 p1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->oldDistance:F

    .line 14
    .line 15
    new-instance p1, Landroid/graphics/PointF;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->midPoint:Landroid/graphics/PointF;

    .line 21
    .line 22
    new-instance p1, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->DRAG:I

    .line 31
    .line 32
    const/4 p1, 0x4

    .line 33
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->ZOOM:I

    .line 34
    .line 35
    iget p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->NONE:I

    .line 36
    .line 37
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 38
    .line 39
    return-void
.end method

.method private final initTempValue(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SELECT:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 2
    .line 3
    return v0
.end method

.method public onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 7
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lcom/zykj/sketch/core/listener/IControl$DefaultImpls;->findGraph$default(Lcom/zykj/sketch/core/listener/IControl;FFFILjava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 38
    .line 39
    iput-object v1, p0, Lcom/zykj/sketch/core/action/SelectAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 40
    .line 41
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 45
    .line 46
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setSelect(Z)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/action/SelectAction;->initTempValue(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Landroid/graphics/PointF;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-direct {v2, v3, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v0, v2, p1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 86
    .line 87
    iput v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->anchorX:F

    .line 88
    .line 89
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->anchorY:F

    .line 92
    .line 93
    iget p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->DRAG:I

    .line 94
    .line 95
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 96
    .line 97
    iget-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 98
    .line 99
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/action/BaseAction;->setRecord(Z)V

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method public onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 9
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget v1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 14
    .line 15
    iget v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->DRAG:I

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    new-instance v1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 27
    .line 28
    .line 29
    new-instance v2, Landroid/graphics/PointF;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {v2, v3, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {v0, v2, p1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    iget v3, p0, Lcom/zykj/sketch/core/action/SelectAction;->anchorX:F

    .line 53
    .line 54
    sub-float/2addr v2, v3

    .line 55
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 56
    .line 57
    iget v3, p0, Lcom/zykj/sketch/core/action/SelectAction;->anchorY:F

    .line 58
    .line 59
    sub-float/2addr p1, v3

    .line 60
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_0
    iget v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->ZOOM:I

    .line 69
    .line 70
    if-ne v1, v2, :cond_1

    .line 71
    .line 72
    new-instance v1, Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->mTempMatrix:Landroid/graphics/Matrix;

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/4 v5, 0x1

    .line 100
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {v3, v4, v6, v7, v8}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getDistance(FFFFLandroid/graphics/Matrix;)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    iget v4, p0, Lcom/zykj/sketch/core/action/SelectAction;->oldDistance:F

    .line 125
    .line 126
    div-float/2addr v3, v4

    .line 127
    iget-object v4, p0, Lcom/zykj/sketch/core/action/SelectAction;->midPoint:Landroid/graphics/PointF;

    .line 128
    .line 129
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 130
    .line 131
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 132
    .line 133
    invoke-virtual {v1, v3, v3, v6, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-static {v3, v4, v6, v7, v8}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getRotation(FFFFLandroid/graphics/Matrix;)F

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget v4, p0, Lcom/zykj/sketch/core/action/SelectAction;->oldRotation:F

    .line 177
    .line 178
    sub-float/2addr v3, v4

    .line 179
    iget-object v4, p0, Lcom/zykj/sketch/core/action/SelectAction;->midPoint:Landroid/graphics/PointF;

    .line 180
    .line 181
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 182
    .line 183
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 184
    .line 185
    invoke-virtual {v1, v3, v6, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-virtual {p1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-virtual {p1, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v3, v2, v4, p1, v5}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getMidPoint(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 229
    .line 230
    iget-object v3, p0, Lcom/zykj/sketch/core/action/SelectAction;->midPoint:Landroid/graphics/PointF;

    .line 231
    .line 232
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 233
    .line 234
    sub-float/2addr v2, v4

    .line 235
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 236
    .line 237
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 238
    .line 239
    sub-float/2addr p1, v3

    .line 240
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 244
    .line 245
    .line 246
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 247
    .line 248
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 249
    .line 250
    .line 251
    :cond_2
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 8
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/action/SelectAction;->selectGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/action/SelectAction;->initTempValue(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-static {v2, v3, v5, v6, v7}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getDistance(FFFFLandroid/graphics/Matrix;)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iput v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->oldDistance:F

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v2, v3, v5, v6, v7}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getRotation(FFFFLandroid/graphics/Matrix;)F

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iput v2, p0, Lcom/zykj/sketch/core/action/SelectAction;->oldRotation:F

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-virtual {p1, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-static {v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v2, v1, v3, p1, v0}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getMidPoint(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->midPoint:Landroid/graphics/PointF;

    .line 143
    .line 144
    iget p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->ZOOM:I

    .line 145
    .line 146
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 147
    .line 148
    iget-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 149
    .line 150
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 151
    .line 152
    .line 153
    :cond_0
    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->NONE:I

    .line 10
    .line 11
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 12
    .line 13
    return-void
.end method

.method public onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/action/BaseAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->NONE:I

    .line 10
    .line 11
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/action/SelectAction;->mode:I

    .line 2
    .line 3
    return-void
.end method
