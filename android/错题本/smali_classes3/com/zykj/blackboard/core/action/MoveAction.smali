.class public abstract Lcom/zykj/blackboard/core/action/MoveAction;
.super Lcom/zykj/blackboard/core/action/BaseTouchAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/MoveAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 U2\u00020\u0001:\u0001UB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J#\u0010*\u001a\u00020\u000c2\u0008\u0010(\u001a\u0004\u0018\u00010\u00172\u0008\u0010)\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008,\u0010\u0008J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008-\u0010\u0008J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008.\u0010\u0008J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008/\u0010\u0008J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u00080\u0010\u0008J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u00081\u0010\u0008J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u00082\u0010\u0008J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u00083\u0010\u0008J\u0017\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u00084\u0010\u0008J\u000f\u00105\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u00085\u0010\u0003J\r\u00106\u001a\u00020\u0006\u00a2\u0006\u0004\u00086\u0010\u0003J!\u00107\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u00172\u0008\u0010)\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u00087\u00108J!\u00109\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u00172\u0008\u0010)\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u00089\u00108J\r\u0010:\u001a\u00020\u0017\u00a2\u0006\u0004\u0008:\u0010;J\r\u0010<\u001a\u00020\u0017\u00a2\u0006\u0004\u0008<\u0010;R$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020>0=j\u0008\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010B\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010D\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010CR\u0014\u0010E\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0016\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u001e\u0010M\u001a\n L*\u0004\u0018\u00010>0>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010QR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010T\u00a8\u0006V"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "Lcom/zykj/blackboard/core/action/BaseTouchAction;",
        "<init>",
        "()V",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "Ld6/s;",
        "doubleTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "initCalculateField",
        "doubleTouchMove",
        "doubleTouchUp",
        "Landroid/graphics/Matrix;",
        "handleTranslation",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;",
        "handleMatrixDown",
        "matrix",
        "",
        "time",
        "handleMatrixMove",
        "(Landroid/graphics/Matrix;J)V",
        "handleMatrixUp",
        "(Landroid/graphics/Matrix;Ljava/lang/Long;)V",
        "",
        "horizontal",
        "vertical",
        "onAreaMove",
        "(FF)V",
        "",
        "isQuickDoubleTouchDown",
        "()Z",
        "x",
        "y",
        "Landroid/graphics/PointF;",
        "getRenderPointF",
        "(FF)Landroid/graphics/PointF;",
        "pointF1",
        "pointF2",
        "calculateMiddlePointF",
        "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;",
        "horizontalProgress",
        "verticalProgress",
        "calculateMatrixByTranslateProgress",
        "(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;",
        "singleTouchDown",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "onTouchDown",
        "onTouchPointerDown",
        "onTouchMove",
        "onTouchPointerUp",
        "onTouchUp",
        "reset",
        "areaMoveStart",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMovEnd",
        "getVerticalProgress",
        "()F",
        "getHorizontalProgress",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "Lkotlin/collections/ArrayList;",
        "matrixList",
        "Ljava/util/ArrayList;",
        "tempMatrix",
        "Landroid/graphics/Matrix;",
        "tempMatrix2",
        "firstMiddlePointF",
        "Landroid/graphics/PointF;",
        "",
        "fingerMode",
        "I",
        "firstTouchDownTime",
        "J",
        "kotlin.jvm.PlatformType",
        "originMatrix",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "Landroid/graphics/RectF;",
        "configLimitRectF",
        "Landroid/graphics/RectF;",
        "limitRenderRectF",
        "isAreaMoving",
        "Z",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/action/MoveAction$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DOUBLE_CHECK_TIME:I = 0x30

.field private static final FINGER_MODE_DEFAULT:I = 0x0

.field private static final FINGER_MODE_DOUBLE:I = 0x2

.field private static final FINGER_MODE_SINGLE:I = 0x1


# instance fields
.field private final configLimitRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fingerMode:I

.field private final firstMiddlePointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private firstTouchDownTime:J

.field private isAreaMoving:Z

.field private final limitRenderRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixList:Ljava/util/ArrayList;
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

.field private originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

.field private final tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMatrix2:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/action/MoveAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/MoveAction$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/action/MoveAction;->Companion:Lcom/zykj/blackboard/core/action/MoveAction$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix2:Landroid/graphics/Matrix;

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 31
    .line 32
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 37
    .line 38
    new-instance v0, Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 44
    .line 45
    new-instance v0, Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 51
    .line 52
    return-void
.end method

.method private final calculateMatrixByTranslateProgress(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    mul-float/2addr v1, p1

    .line 17
    sub-float/2addr v2, v1

    .line 18
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v0

    .line 24
    :goto_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 31
    .line 32
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    mul-float/2addr v0, p2

    .line 39
    sub-float/2addr v1, v0

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p2, p1, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {p2, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 66
    .line 67
    .line 68
    :cond_3
    new-instance p1, Landroid/graphics/Matrix;

    .line 69
    .line 70
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 108
    .line 109
    .line 110
    return-object p1
.end method

.method private final calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    add-float/2addr v1, v2

    .line 11
    const/4 v2, 0x2

    .line 12
    int-to-float v2, v2

    .line 13
    div-float/2addr v1, v2

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    add-float/2addr p1, p2

    .line 19
    div-float/2addr p1, v2

    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method private final doubleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/zykj/blackboard/core/action/IActionListener;->getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/zykj/blackboard/listener/IAreaMoveListener;->onMoveStart()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-direct {p0, v1, v0}, Lcom/zykj/blackboard/core/action/MoveAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-direct {p0, v2, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 59
    .line 60
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v1, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->initCalculateField()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-static {p1, v0, v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 93
    .line 94
    :cond_1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixDown()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method private final doubleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->handleTranslation(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-direct {p0, v0, v1, v2}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixMove(Landroid/graphics/Matrix;J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private final doubleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->handleTranslation(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixUp(Landroid/graphics/Matrix;Ljava/lang/Long;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/zykj/blackboard/listener/IAreaMoveListener;->onMoveEnd()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private final getRenderPointF(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private final handleMatrixDown()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeStart()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private final handleMatrixMove(Landroid/graphics/Matrix;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, p2, p3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-interface {p2, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChanging(Landroid/graphics/Matrix;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private final handleMatrixUp(Landroid/graphics/Matrix;Ljava/lang/Long;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {p1, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {p2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 40
    .line 41
    invoke-static {p2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeEnd(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-object p1, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 49
    .line 50
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->DELETE_ACTION:Lcom/zykj/blackboard/utils/EventKey;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 62
    .line 63
    const-string v0, "originMatrix"

    .line 64
    .line 65
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    :cond_2
    new-instance v0, Landroid/graphics/Matrix;

    .line 81
    .line 82
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 83
    .line 84
    .line 85
    :cond_3
    const-wide/16 v1, 0x0

    .line 86
    .line 87
    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-interface {p1, p2, v0, v1}, Lcom/zykj/blackboard/core/action/IActionListener;->transformCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    const/4 p2, 0x1

    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-static {p1, v0, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;->cameraChangeEnd$default(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;Landroid/graphics/Matrix;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    return-void
.end method

.method private final handleTranslation(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p1, v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p1, v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-direct {p0, v4, v3}, Lcom/zykj/blackboard/core/action/MoveAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {p1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoords(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-direct {p0, v4, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getHorizontalTranslate()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 76
    .line 77
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 80
    .line 81
    cmpg-float v2, v5, v2

    .line 82
    .line 83
    if-gez v2, :cond_3

    .line 84
    .line 85
    invoke-direct {p0, v3, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 90
    .line 91
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 92
    .line 93
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 94
    .line 95
    sub-float/2addr v2, v5

    .line 96
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v6, v5, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    cmpg-float v7, v2, v6

    .line 101
    .line 102
    if-gez v7, :cond_1

    .line 103
    .line 104
    move v2, v6

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 107
    .line 108
    cmpl-float v6, v2, v5

    .line 109
    .line 110
    if-lez v6, :cond_2

    .line 111
    .line 112
    move v2, v5

    .line 113
    :cond_2
    :goto_0
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 114
    .line 115
    invoke-virtual {v5, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    move v2, v4

    .line 120
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getVerticalTranslate()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 127
    .line 128
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 129
    .line 130
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 131
    .line 132
    cmpg-float v0, v5, v0

    .line 133
    .line 134
    if-gez v0, :cond_7

    .line 135
    .line 136
    if-nez v1, :cond_4

    .line 137
    .line 138
    invoke-direct {p0, v3, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :cond_4
    iget p1, v1, Landroid/graphics/PointF;->y:F

    .line 143
    .line 144
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 145
    .line 146
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 147
    .line 148
    sub-float/2addr p1, v0

    .line 149
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 150
    .line 151
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 152
    .line 153
    cmpg-float v3, p1, v1

    .line 154
    .line 155
    if-gez v3, :cond_5

    .line 156
    .line 157
    move p1, v1

    .line 158
    goto :goto_2

    .line 159
    :cond_5
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 160
    .line 161
    cmpl-float v1, p1, v0

    .line 162
    .line 163
    if-lez v1, :cond_6

    .line 164
    .line 165
    move p1, v0

    .line 166
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 167
    .line 168
    invoke-virtual {v0, v4, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 169
    .line 170
    .line 171
    move v4, p1

    .line 172
    :cond_7
    invoke-direct {p0, v2, v4}, Lcom/zykj/blackboard/core/action/MoveAction;->onAreaMove(FF)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Landroid/graphics/Matrix;

    .line 176
    .line 177
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getScreenMatrix()Landroid/graphics/Matrix;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 215
    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_8
    return-object v1
.end method

.method private final initCalculateField()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->getPageRectF()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x1

    .line 28
    if-lt v2, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-lt v2, v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-float v3, v3

    .line 45
    mul-float/2addr v2, v3

    .line 46
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    int-to-float v1, v1

    .line 55
    mul-float/2addr v3, v1

    .line 56
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    :cond_0
    new-instance v1, Landroid/graphics/Matrix;

    .line 75
    .line 76
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 77
    .line 78
    .line 79
    :cond_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 85
    .line 86
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 87
    .line 88
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 89
    .line 90
    iget v4, v3, Landroid/graphics/RectF;->right:F

    .line 91
    .line 92
    sub-float/2addr v2, v4

    .line 93
    iget v4, v0, Landroid/graphics/RectF;->bottom:F

    .line 94
    .line 95
    iget v5, v3, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    sub-float/2addr v4, v5

    .line 98
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 101
    .line 102
    sub-float/2addr v5, v6

    .line 103
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 104
    .line 105
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    sub-float/2addr v0, v3

    .line 108
    invoke-virtual {v1, v2, v4, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v1, "configRectF -> "

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "MoveAction"

    .line 128
    .line 129
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v2, "limitRenderRectF -> "

    .line 135
    .line 136
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private final isQuickDoubleTouchDown()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstTouchDownTime:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "time -> "

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "MoveAction"

    .line 23
    .line 24
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0x30

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return v0
.end method

.method private final onAreaMove(FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "horizontal->"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "  vertical->"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "MoveAction"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-lez v0, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 48
    .line 49
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 50
    .line 51
    sub-float/2addr v2, p1

    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    div-float/2addr v2, p1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v2, v1

    .line 59
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    cmpl-float p1, p1, v1

    .line 66
    .line 67
    if-lez p1, :cond_1

    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 70
    .line 71
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 72
    .line 73
    sub-float/2addr v0, p2

    .line 74
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    div-float v1, v0, p1

    .line 79
    .line 80
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    const/4 v0, 0x1

    .line 97
    if-eqz p2, :cond_2

    .line 98
    .line 99
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-eqz p2, :cond_2

    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getHorizontalTranslate()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-ne p2, v0, :cond_2

    .line 110
    .line 111
    invoke-interface {p1, v2}, Lcom/zykj/blackboard/listener/IAreaMoveListener;->onHorizontalMove(F)V

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-eqz p2, :cond_3

    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getVerticalTranslate()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-ne p2, v0, :cond_3

    .line 131
    .line 132
    invoke-interface {p1, v1}, Lcom/zykj/blackboard/listener/IAreaMoveListener;->onVerticalMove(F)V

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void
.end method


# virtual methods
.method public final areaMovEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/MoveAction;->calculateMatrixByTranslateProgress(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixUp(Landroid/graphics/Matrix;Ljava/lang/Long;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/MoveAction;->isAreaMoving:Z

    .line 26
    .line 27
    return-void
.end method

.method public final areaMoveStart()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->isAreaMoving:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->initCalculateField()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->originMatrix:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixDown()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/MoveAction;->calculateMatrixByTranslateProgress(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-direct {p0, p1, v0, v1}, Lcom/zykj/blackboard/core/action/MoveAction;->handleMatrixMove(Landroid/graphics/Matrix;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final getHorizontalProgress()F
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->initCalculateField()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    div-float/2addr v1, v0

    .line 32
    :cond_0
    return v1
.end method

.method public final getVerticalProgress()F
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->initCalculateField()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->configLimitRectF:Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->limitRenderRectF:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    div-float/2addr v1, v0

    .line 32
    :cond_0
    return v1
.end method

.method public onTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->onTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne v0, v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v1

    .line 27
    :goto_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->doubleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v2, v1

    .line 48
    :goto_1
    sget-object v3, Lcom/zykj/blackboard/utils/EventConvert;->INSTANCE:Lcom/zykj/blackboard/utils/EventConvert;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    move-object v1, v0

    .line 56
    :cond_2
    invoke-virtual {v3, p1, v1}, Lcom/zykj/blackboard/utils/EventConvert;->updateTouchEventByNewMatrix(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_3
    const/4 v0, 0x1

    .line 61
    iput v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->firstTouchDownTime:J

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public onTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->onTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->doubleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->onTouchPointerDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->isAreaMoving:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    iput v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;->isQuickDoubleTouchDown()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->doubleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->onTouchPointerUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    iget v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->doubleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public onTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->onTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->fingerMode:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/MoveAction;->singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/MoveAction;->matrixList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
