.class public final Lcom/zykj/blackboard/core/action/TextAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\t\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\'\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\'\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008$\u0010%J/\u0010*\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J7\u0010,\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u00080\u0010\u0003J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u000201H\u0002\u00a2\u0006\u0004\u00082\u00103J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00084\u00105J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00086\u00105J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010?\u001a\u00020&2\u0006\u0010<\u001a\u00020(2\u0006\u0010>\u001a\u00020=2\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008?\u0010@JO\u0010I\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u001f\u0010K\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008K\u0010LR\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u0010MR\u0014\u0010N\u001a\u00020\u00128\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010P\u001a\u00020\r8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0016\u0010U\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010OR\u0016\u0010V\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010OR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010OR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010OR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010OR(\u0010[\u001a\u0004\u0018\u00010\u001f2\u0008\u0010Z\u001a\u0004\u0018\u00010\u001f8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R(\u0010_\u001a\u0004\u0018\u00010&2\u0008\u0010Z\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010bR$\u0010c\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008c\u0010d\u001a\u0004\u0008e\u0010fR\u0016\u0010g\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008g\u0010dR\u0016\u0010h\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010j\u001a\u00020\u00128\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008j\u0010OR\u0016\u0010k\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010QR\u0016\u0010l\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010MR\u0016\u0010m\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010iR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010dR&\u0010r\u001a\u0012\u0012\u0004\u0012\u00020p0oj\u0008\u0012\u0004\u0012\u00020p`q8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u0016\u0010t\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0016\u0010v\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010M\u00a8\u0006w"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/TextAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "Ld6/s;",
        "reset",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "singleTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "",
        "color",
        "",
        "changeTextColor",
        "(I)Z",
        "",
        "size",
        "changeTextSize",
        "(F)Z",
        "Landroid/graphics/PointF;",
        "pointF",
        "isClickInSelect",
        "(Landroid/graphics/PointF;)Z",
        "x",
        "y",
        "Landroid/graphics/Matrix;",
        "handleTranslate",
        "(FF)Landroid/graphics/Matrix;",
        "Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "graph",
        "handleScale",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;FF)V",
        "isNewGraph",
        "handleTextEdit",
        "(FFZ)V",
        "Landroid/graphics/RectF;",
        "rectF",
        "",
        "text",
        "buildTextGraph",
        "(Landroid/graphics/RectF;FFLjava/lang/String;)Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "handleTextConfirm",
        "(ZLandroid/graphics/RectF;FFLjava/lang/String;)V",
        "selectGraph",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V",
        "selectCancel",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "buildSelectedRectF",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "isMove",
        "(FF)Z",
        "isDoubleTap",
        "getRenderPointF",
        "(FF)Landroid/graphics/PointF;",
        "matrix",
        "handleMatrix",
        "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;",
        "content",
        "Landroid/graphics/Paint;",
        "paint",
        "calculateRectF",
        "(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;",
        "x1",
        "y1",
        "x2",
        "y2",
        "x3",
        "y3",
        "x4",
        "y4",
        "calculateScaleOffset",
        "(FFFFFFFF)F",
        "calculateRadians",
        "(FF)F",
        "Z",
        "minMoveDistance",
        "F",
        "maxInterval",
        "I",
        "",
        "lastTapTime",
        "J",
        "lastTapX",
        "lastTapY",
        "firstX",
        "firstY",
        "firstSelectedWidth",
        "<set-?>",
        "selectedGraph",
        "Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "getSelectedGraph",
        "()Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "selectedRectF",
        "Landroid/graphics/RectF;",
        "getSelectedRectF",
        "()Landroid/graphics/RectF;",
        "selectedRectFMatrix",
        "Landroid/graphics/Matrix;",
        "getSelectedRectFMatrix",
        "()Landroid/graphics/Matrix;",
        "selectedMatrix",
        "selectedRectFPaint",
        "Landroid/graphics/Paint;",
        "iconWidth",
        "currentTextActionType",
        "isTextActionMode",
        "textPaint",
        "tempMatrix",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "Lkotlin/collections/ArrayList;",
        "tempMatrixList",
        "Ljava/util/ArrayList;",
        "tempContent",
        "Ljava/lang/String;",
        "isHandingEdit",
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
.field private currentTextActionType:I

.field private firstSelectedWidth:F

.field private firstX:F

.field private firstY:F

.field private final iconWidth:F

.field private isHandingEdit:Z

.field private isMove:Z

.field private isTextActionMode:Z

.field private lastTapTime:J

.field private lastTapX:F

.field private lastTapY:F

.field private final maxInterval:I

.field private final minMoveDistance:F

.field private selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selectedMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectedRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selectedRectFMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectedRectFPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tempContent:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tempMatrixList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private textPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x41f00000    # 30.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->minMoveDistance:F

    .line 7
    .line 8
    const/16 v0, 0x1f4

    .line 9
    .line 10
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->maxInterval:I

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedMatrix:Landroid/graphics/Matrix;

    .line 25
    .line 26
    new-instance v0, Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 32
    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isTextActionMode:Z

    .line 42
    .line 43
    new-instance v1, Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 49
    .line 50
    new-instance v1, Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 56
    .line 57
    new-instance v1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrixList:Ljava/util/ArrayList;

    .line 63
    .line 64
    const-string v1, ""

    .line 65
    .line 66
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempContent:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 69
    .line 70
    const v2, -0x414142

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 77
    .line 78
    const/high16 v2, 0x40000000    # 2.0f

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 84
    .line 85
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 101
    .line 102
    const v2, -0xb8680d

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 109
    .line 110
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 116
    .line 117
    const/high16 v2, 0x42200000    # 40.0f

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 133
    .line 134
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 135
    .line 136
    new-instance v2, Lcom/zykj/blackboard/core/action/TextAction$1;

    .line 137
    .line 138
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/TextAction$1;-><init>(Lcom/zykj/blackboard/core/action/TextAction;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/EventBus;->register(Lcom/zykj/blackboard/utils/EventKey;Lr6/a;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public static final synthetic access$buildSelectedRectF(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$calculateRectF(Lcom/zykj/blackboard/core/action/TextAction;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/TextAction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getIconWidth$p(Lcom/zykj/blackboard/core/action/TextAction;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getSelectedRectFPaint$p(Lcom/zykj/blackboard/core/action/TextAction;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTempContent$p(Lcom/zykj/blackboard/core/action/TextAction;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempContent:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handleTextConfirm(Lcom/zykj/blackboard/core/action/TextAction;ZLandroid/graphics/RectF;FFLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/blackboard/core/action/TextAction;->handleTextConfirm(ZLandroid/graphics/RectF;FFLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$selectCancel(Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/TextAction;->selectCancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$selectGraph(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->selectGraph(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setHandingEdit$p(Lcom/zykj/blackboard/core/action/TextAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->isHandingEdit:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setSelectedGraph$p(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    return-void
.end method

.method private final buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedMatrix:Landroid/graphics/Matrix;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final buildTextGraph(Landroid/graphics/RectF;FFLjava/lang/String;)Lcom/zykj/blackboard/core/graph/group/TextGraph;
    .locals 8

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    new-instance v2, Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    const/16 v6, 0x1c

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/blackboard/core/graph/group/TextGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/e;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p2, 0x0

    .line 39
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p4}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method private final calculateRadians(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    cmpl-float v1, p1, v0

    .line 8
    .line 9
    if-lez v1, :cond_1

    .line 10
    .line 11
    move v1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    double-to-float v1, v1

    .line 23
    :goto_0
    cmpl-float v0, p2, v0

    .line 24
    .line 25
    if-lez v0, :cond_2

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v0, 0x1

    .line 30
    :goto_1
    div-float/2addr p2, p1

    .line 31
    float-to-double p1, p2

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    double-to-float p1, p1

    .line 37
    int-to-float p2, v0

    .line 38
    mul-float/2addr v1, p2

    .line 39
    add-float/2addr v1, p1

    .line 40
    return v1
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x0

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move p1, p2

    .line 49
    :goto_0
    cmpl-float p1, v0, p1

    .line 50
    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    iget p1, p3, Landroid/graphics/RectF;->top:F

    .line 54
    .line 55
    add-float/2addr v0, p1

    .line 56
    iput v0, p3, Landroid/graphics/RectF;->bottom:F

    .line 57
    .line 58
    return-object p3

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    :cond_2
    iget p1, p3, Landroid/graphics/RectF;->top:F

    .line 76
    .line 77
    add-float/2addr p2, p1

    .line 78
    iput p2, p3, Landroid/graphics/RectF;->bottom:F

    .line 79
    .line 80
    return-object p3
.end method

.method private final calculateScaleOffset(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-direct {p0, p3, p4}, Lcom/zykj/blackboard/core/action/TextAction;->calculateRadians(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-direct {p0, p7, p8}, Lcom/zykj/blackboard/core/action/TextAction;->calculateRadians(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p8, p7

    .line 17
    float-to-double p2, p8

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method

.method private final getRenderPointF(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final handleMatrix(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method private final handleScale(Lcom/zykj/blackboard/core/graph/group/TextGraph;FF)V
    .locals 11

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p3, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2, p3}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 61
    .line 62
    invoke-virtual {v0, v2, v3, p3}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 67
    .line 68
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 69
    .line 70
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 71
    .line 72
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 73
    .line 74
    iget v7, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstX:F

    .line 75
    .line 76
    iget v8, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstY:F

    .line 77
    .line 78
    iget v9, p2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iget v10, p2, Landroid/graphics/PointF;->y:F

    .line 81
    .line 82
    move-object v2, p0

    .line 83
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/action/TextAction;->calculateScaleOffset(FFFFFFFF)F

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iget v0, v2, Lcom/zykj/blackboard/core/action/TextAction;->firstSelectedWidth:F

    .line 88
    .line 89
    add-float/2addr v0, p2

    .line 90
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-virtual {p3, p2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    iget v1, v2, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 128
    .line 129
    const/16 v3, 0xa

    .line 130
    .line 131
    int-to-float v3, v3

    .line 132
    add-float/2addr v1, v3

    .line 133
    cmpg-float v1, v0, v1

    .line 134
    .line 135
    if-lez v1, :cond_3

    .line 136
    .line 137
    cmpg-float p2, v0, p2

    .line 138
    .line 139
    if-gtz p2, :cond_1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_1
    invoke-static {p3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    new-instance p3, Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {p3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 157
    .line 158
    .line 159
    iget v0, p3, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    add-float/2addr v0, p2

    .line 162
    iput v0, p3, Landroid/graphics/RectF;->right:F

    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-nez p2, :cond_2

    .line 169
    .line 170
    const-string p2, ""

    .line 171
    .line 172
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {p0, p2, v0, p3}, Lcom/zykj/blackboard/core/action/TextAction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 186
    .line 187
    .line 188
    :cond_3
    :goto_0
    return-void

    .line 189
    :cond_4
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 190
    .line 191
    const-string p2, "Char sequence is empty."

    .line 192
    .line 193
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1
.end method

.method private final handleTextConfirm(ZLandroid/graphics/RectF;FFLjava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 20
    .line 21
    new-instance v8, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;

    .line 22
    .line 23
    invoke-direct {v8, v0}, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;-><init>(Lcom/zykj/blackboard/core/action/TextAction;)V

    .line 24
    .line 25
    .line 26
    move/from16 v4, p3

    .line 27
    .line 28
    move/from16 v5, p4

    .line 29
    .line 30
    move-object/from16 v7, p5

    .line 31
    .line 32
    invoke-interface/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/IActionListener;->textGraphEvent(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    move-object/from16 v13, p5

    .line 77
    .line 78
    invoke-interface {v1, v2, v13, v3, v4}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-object/from16 v13, p5

    .line 83
    .line 84
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    iget-object v10, v0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 91
    .line 92
    invoke-static {v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v11, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 96
    .line 97
    const/16 v18, 0xf4

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 104
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    invoke-static/range {v9 .. v19}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 118
    .line 119
    .line 120
    :cond_3
    return-void
.end method

.method private final handleTextEdit(FFZ)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isHandingEdit:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isHandingEdit:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 35
    .line 36
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalText()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {p0, p2, v1, v2, v3}, Lcom/zykj/blackboard/core/action/TextAction;->buildTextGraph(Landroid/graphics/RectF;FFLjava/lang/String;)Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    :goto_0
    invoke-direct {p0, p2}, Lcom/zykj/blackboard/core/action/TextAction;->buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 65
    .line 66
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 72
    .line 73
    iget v6, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    invoke-interface/range {v2 .. v7}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    new-instance v2, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawGraphInActive(Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, ""

    .line 101
    .line 102
    if-nez v1, :cond_5

    .line 103
    .line 104
    move-object v1, v2

    .line 105
    :cond_5
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempContent:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getTextEditView()Lcom/zykj/blackboard/proxy/TextEditView;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-nez v1, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    move-object v2, v1

    .line 121
    :goto_1
    new-instance v1, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;

    .line 122
    .line 123
    invoke-direct {v1, p0, p2}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$2;-><init>(Lcom/zykj/blackboard/core/action/TextAction;Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 124
    .line 125
    .line 126
    new-instance v3, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;

    .line 127
    .line 128
    invoke-direct {v3, p0, p3, p2, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;-><init>(Lcom/zykj/blackboard/core/action/TextAction;ZLcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/PointF;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;

    .line 132
    .line 133
    invoke-direct {p1, p2, p0}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$4;-><init>(Lcom/zykj/blackboard/core/graph/group/TextGraph;Lcom/zykj/blackboard/core/action/TextAction;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, v2, v1, v3, p1}, Lcom/zykj/blackboard/proxy/TextEditView;->showEditView(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V

    .line 137
    .line 138
    .line 139
    :cond_7
    :goto_2
    return-void
.end method

.method private final handleTranslate(FF)Landroid/graphics/Matrix;
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstX:F

    .line 10
    .line 11
    sub-float/2addr v0, v1

    .line 12
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstY:F

    .line 15
    .line 16
    sub-float/2addr p1, v1

    .line 17
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->handleMatrix(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method private final isClickInSelect(Landroid/graphics/PointF;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedMatrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    iget v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    int-to-float v3, v3

    .line 26
    div-float/2addr v2, v3

    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    div-float/2addr v2, v3

    .line 34
    new-instance v3, Landroid/graphics/RectF;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    sub-float/2addr v4, v2

    .line 44
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    sub-float/2addr v5, v2

    .line 52
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 53
    .line 54
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    add-float/2addr v6, v2

    .line 60
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-static {v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 66
    .line 67
    add-float/2addr v7, v2

    .line 68
    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 69
    .line 70
    .line 71
    new-instance v4, Landroid/graphics/RectF;

    .line 72
    .line 73
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 74
    .line 75
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 79
    .line 80
    sub-float/2addr v5, v2

    .line 81
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 82
    .line 83
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 87
    .line 88
    sub-float/2addr v6, v2

    .line 89
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 90
    .line 91
    invoke-static {v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 95
    .line 96
    add-float/2addr v7, v2

    .line 97
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 98
    .line 99
    invoke-static {v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 103
    .line 104
    add-float/2addr v8, v2

    .line 105
    invoke-direct {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 109
    .line 110
    invoke-virtual {v2, v3, v0, p1}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    const/4 v5, 0x1

    .line 115
    if-eqz v3, :cond_1

    .line 116
    .line 117
    sget-object p1, Lcom/zykj/blackboard/enums/TextActionType;->DELETE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 124
    .line 125
    return v5

    .line 126
    :cond_1
    invoke-virtual {v2, v4, v0, p1}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    sget-object p1, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 139
    .line 140
    return v5

    .line 141
    :cond_2
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 142
    .line 143
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v3, v0, p1}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_3

    .line 151
    .line 152
    sget-object p1, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 159
    .line 160
    return v5

    .line 161
    :cond_3
    return v1
.end method

.method private final isDoubleTap(FF)Z
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    iget v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapX:F

    .line 17
    .line 18
    sub-float/2addr p2, v2

    .line 19
    float-to-double v4, p2

    .line 20
    const/4 p2, 0x2

    .line 21
    int-to-double v6, p2

    .line 22
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    double-to-float p2, v4

    .line 27
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 28
    .line 29
    iget v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapY:F

    .line 30
    .line 31
    sub-float/2addr p1, v2

    .line 32
    float-to-double v4, p1

    .line 33
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    double-to-float p1, v4

    .line 38
    add-float/2addr p2, p1

    .line 39
    float-to-double p1, p2

    .line 40
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    double-to-float p1, p1

    .line 45
    iget-wide v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapTime:J

    .line 46
    .line 47
    sub-long/2addr v0, v4

    .line 48
    iget p2, p0, Lcom/zykj/blackboard/core/action/TextAction;->maxInterval:I

    .line 49
    .line 50
    int-to-long v4, p2

    .line 51
    cmp-long p2, v0, v4

    .line 52
    .line 53
    if-gez p2, :cond_0

    .line 54
    .line 55
    iget p2, p0, Lcom/zykj/blackboard/core/action/TextAction;->minMoveDistance:F

    .line 56
    .line 57
    cmpg-float p1, p1, p2

    .line 58
    .line 59
    if-gez p1, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    return v3
.end method

.method private final isMove(FF)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstX:F

    .line 8
    .line 9
    sub-float/2addr p2, v0

    .line 10
    float-to-double v0, p2

    .line 11
    const/4 p2, 0x2

    .line 12
    int-to-double v2, p2

    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-float p2, v0

    .line 18
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 19
    .line 20
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstY:F

    .line 21
    .line 22
    sub-float/2addr p1, v0

    .line 23
    float-to-double v0, p1

    .line 24
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    double-to-float p1, v0

    .line 29
    add-float/2addr p2, p1

    .line 30
    float-to-double p1, p2

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    double-to-float p1, p1

    .line 36
    iget p2, p0, Lcom/zykj/blackboard/core/action/TextAction;->minMoveDistance:F

    .line 37
    .line 38
    cmpl-float p1, p1, p2

    .line 39
    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method private final selectCancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Lcom/zykj/blackboard/listener/ITextSelectListener;->textSelectedCancel()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method private final selectGraph(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-interface/range {v0 .. v5}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/listener/ITextSelectListener;->textSelected(IF)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method


# virtual methods
.method public final changeTextColor(I)Z
    .locals 11

    .line 1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    if-eqz v1, :cond_4

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/listener/ITextSelectListener;->textColorChange(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const/16 v9, 0xec

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 72
    .line 73
    .line 74
    :cond_3
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_4
    const/4 p1, 0x0

    .line 77
    return p1
.end method

.method public final changeTextSize(F)Z
    .locals 11

    .line 1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v1, :cond_7

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    cmpl-float v2, p1, v2

    .line 15
    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {v0, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getContent()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    const-string v2, ""

    .line 45
    .line 46
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v2, v3, v0}, Lcom/zykj/blackboard/core/action/TextAction;->calculateRectF(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->buildSelectedRectF(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 78
    .line 79
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 83
    .line 84
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFPaint:Landroid/graphics/Paint;

    .line 85
    .line 86
    iget v6, p0, Lcom/zykj/blackboard/core/action/TextAction;->iconWidth:F

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-interface/range {v2 .. v7}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/listener/ITextSelectListener;->textSizeChange(F)V

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->getPaint()Landroid/graphics/Paint;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/graphics/Paint;->getColor()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    .line 132
    .line 133
    const/16 v9, 0xe8

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 150
    .line 151
    .line 152
    :cond_6
    const/4 p1, 0x1

    .line 153
    return p1

    .line 154
    :cond_7
    return v0
.end method

.method public final getSelectedGraph()Lcom/zykj/blackboard/core/graph/group/TextGraph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectedRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectedRectFMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public reset()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextColor()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->textPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextSize()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrixList:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/TextAction;->selectCancel()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 2
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
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
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstX:F

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 26
    .line 27
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstY:F

    .line 28
    .line 29
    new-instance p1, Landroid/graphics/PointF;

    .line 30
    .line 31
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstX:F

    .line 32
    .line 33
    iget v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstY:F

    .line 34
    .line 35
    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->isClickInSelect(Landroid/graphics/PointF;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->isTextActionMode:Z

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 47
    .line 48
    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ne p1, v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationStart(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-ne p1, v0, :cond_2

    .line 85
    .line 86
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->firstSelectedWidth:F

    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 104
    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->textHandleStart(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 114
    .line 115
    .line 116
    :cond_2
    return-void
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
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
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->isMove(FF)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 22
    .line 23
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isTextActionMode:Z

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 28
    .line 29
    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v0, v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->handleTranslate(FF)Landroid/graphics/Matrix;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translation(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrixList:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-static {p1, v0, v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-ne v0, v1, :cond_4

    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-direct {p0, v0, v1, p1}, Lcom/zykj/blackboard/core/action/TextAction;->handleScale(Lcom/zykj/blackboard/core/graph/group/TextGraph;FF)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 114
    .line 115
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 116
    .line 117
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 13
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
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
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isTextActionMode:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {p0, v0, v2}, Lcom/zykj/blackboard/core/action/TextAction;->isDoubleTap(FF)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {p0, v0, v1, v2}, Lcom/zykj/blackboard/core/action/TextAction;->handleTextEdit(FFZ)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 40
    .line 41
    if-nez v0, :cond_6

    .line 42
    .line 43
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 44
    .line 45
    sget-object v2, Lcom/zykj/blackboard/enums/TextActionType;->DELETE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ne v0, v2, :cond_4

    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    invoke-interface {v2, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/TextAction;->selectCancel()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-interface {v2, v0, v3, v4}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_15

    .line 104
    .line 105
    new-instance v2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-interface {v0, v2, v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_6
    iget v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->currentTextActionType:I

    .line 123
    .line 124
    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-ne v0, v1, :cond_a

    .line 131
    .line 132
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedMatrix:Landroid/graphics/Matrix;

    .line 133
    .line 134
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->handleTranslate(FF)Landroid/graphics/Matrix;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-instance v1, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 157
    .line 158
    if-eqz v2, :cond_7

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-eqz v2, :cond_8

    .line 168
    .line 169
    invoke-interface {v2, v1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrixList:Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-static {v0, v2, v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_9

    .line 190
    .line 191
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->tempMatrixList:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-interface {v0, v1, v2}, Lcom/zykj/blackboard/core/action/IActionListener;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_15

    .line 201
    .line 202
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_a
    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TextActionType;->getValue()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-ne v0, v1, :cond_15

    .line 214
    .line 215
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 216
    .line 217
    if-eqz v3, :cond_15

    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-direct {p0, v3, v0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->handleScale(Lcom/zykj/blackboard/core/graph/group/TextGraph;FF)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 237
    .line 238
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectFMatrix:Landroid/graphics/Matrix;

    .line 239
    .line 240
    invoke-interface {v0, v3, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->textHandleEnd(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    .line 241
    .line 242
    .line 243
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-eqz v2, :cond_c

    .line 248
    .line 249
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 250
    .line 251
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    const/16 v11, 0xf8

    .line 256
    .line 257
    const/4 v12, 0x0

    .line 258
    const/4 v6, 0x0

    .line 259
    const/4 v7, 0x0

    .line 260
    const/4 v8, 0x0

    .line 261
    const/4 v9, 0x0

    .line 262
    const/4 v10, 0x0

    .line 263
    invoke-static/range {v2 .. v12}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-eqz v0, :cond_15

    .line 271
    .line 272
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :cond_d
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 278
    .line 279
    if-eqz v0, :cond_e

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_e
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 284
    .line 285
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_f

    .line 290
    .line 291
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_f

    .line 296
    .line 297
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    :cond_f
    const/4 v0, 0x1

    .line 302
    if-eqz v1, :cond_12

    .line 303
    .line 304
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_10

    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    sub-int/2addr v2, v0

    .line 316
    :goto_0
    const/4 v3, -0x1

    .line 317
    if-ge v3, v2, :cond_12

    .line 318
    .line 319
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    instance-of v3, v3, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 324
    .line 325
    if-eqz v3, :cond_11

    .line 326
    .line 327
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 332
    .line 333
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderRectF()Landroid/graphics/RectF;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_11

    .line 350
    .line 351
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    const-string v2, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph"

    .line 356
    .line 357
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 361
    .line 362
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 363
    .line 364
    goto :goto_1

    .line 365
    :cond_11
    add-int/lit8 v2, v2, -0x1

    .line 366
    .line 367
    goto :goto_0

    .line 368
    :cond_12
    :goto_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedGraph:Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 369
    .line 370
    if-eqz v1, :cond_13

    .line 371
    .line 372
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/action/TextAction;->selectGraph(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V

    .line 376
    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_13
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction;->selectedRectF:Landroid/graphics/RectF;

    .line 380
    .line 381
    if-nez v1, :cond_14

    .line 382
    .line 383
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    invoke-direct {p0, v1, v2, v0}, Lcom/zykj/blackboard/core/action/TextAction;->handleTextEdit(FFZ)V

    .line 392
    .line 393
    .line 394
    goto :goto_2

    .line 395
    :cond_14
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/TextAction;->selectCancel()V

    .line 396
    .line 397
    .line 398
    :cond_15
    :goto_2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->isMove:Z

    .line 399
    .line 400
    if-nez v0, :cond_16

    .line 401
    .line 402
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 415
    .line 416
    iput v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapX:F

    .line 417
    .line 418
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 419
    .line 420
    iput p1, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapY:F

    .line 421
    .line 422
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 423
    .line 424
    .line 425
    move-result-wide v0

    .line 426
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/TextAction;->lastTapTime:J

    .line 427
    .line 428
    :cond_16
    :goto_3
    return-void
.end method
