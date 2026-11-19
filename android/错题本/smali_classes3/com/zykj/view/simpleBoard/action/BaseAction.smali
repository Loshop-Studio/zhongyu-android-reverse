.class public abstract Lcom/zykj/view/simpleBoard/action/BaseAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/simpleBoard/action/BaseAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u0000 F2\u00020\u0001:\u0001FB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008$\u0010\u000eJ\u0017\u0010%\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008%\u0010\u000eJ\u0017\u0010&\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008&\u0010\u000eJ\u0017\u0010\'\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\'\u0010\u000eJ\u0017\u0010(\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008(\u0010\u000eJ\u0017\u0010)\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008)\u0010\u000eJ\u0017\u0010*\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008*\u0010\u000eJ\u0017\u0010+\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008+\u0010\u000eJ\u0017\u0010,\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008,\u0010\u000eJ#\u0010/\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000c0-\u00a2\u0006\u0004\u0008/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00103R\u0014\u00104\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00102R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010B\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u00105R\u0014\u0010C\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u00105R\u0014\u0010D\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u00105R\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u00102\u00a8\u0006G"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/action/BaseAction;",
        "",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "boardConfig",
        "Landroid/graphics/Matrix;",
        "cameraMatrix",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "drawControl",
        "<init>",
        "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "Ld6/s;",
        "doubleTouchDown",
        "(Landroid/view/MotionEvent;)V",
        "doubleTouchMove",
        "doubleTouchUp",
        "handleTranslation",
        "(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;",
        "handleMatrixDown",
        "()V",
        "matrix",
        "handleMatrixMove",
        "(Landroid/graphics/Matrix;)V",
        "handleMatrixUp",
        "",
        "isQuickDoubleTouchDown",
        "()Z",
        "Landroid/graphics/PointF;",
        "pointF1",
        "pointF2",
        "calculateMiddlePointF",
        "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;",
        "",
        "calculateDistance",
        "(Landroid/graphics/PointF;Landroid/graphics/PointF;)F",
        "singleTouchDown",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "onTouchDown",
        "onTouchPointerDown",
        "onTouchMove",
        "onTouchPointerUp",
        "onTouchUp",
        "Lkotlin/Function0;",
        "callback",
        "isSingleFingerInput",
        "(Landroid/view/MotionEvent;Lr6/a;)V",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "Landroid/graphics/Matrix;",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "firstMiddlePointF",
        "Landroid/graphics/PointF;",
        "firstDistance",
        "F",
        "",
        "fingerMode",
        "I",
        "",
        "firstTouchDownTime",
        "J",
        "originMatrix",
        "Landroid/view/MotionEvent$PointerCoords;",
        "tempPointerCoords",
        "Landroid/view/MotionEvent$PointerCoords;",
        "tempFirstPointF",
        "tempSecondPointF",
        "tempMiddlePointF",
        "tempMatrix",
        "Companion",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/view/simpleBoard/action/BaseAction$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DOUBLE_CHECK_TIME:I = 0x30

.field private static final FINGER_MODE_DEFAULT:I = 0x0

.field private static final FINGER_MODE_DOUBLE:I = 0x2

.field private static final FINGER_MODE_SINGLE:I = 0x1


# instance fields
.field private final boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final drawControl:Lcom/zykj/view/simpleBoard/DrawControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fingerMode:I

.field private firstDistance:F

.field private final firstMiddlePointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private firstTouchDownTime:J

.field private final originMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempFirstPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMiddlePointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempSecondPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/simpleBoard/action/BaseAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/view/simpleBoard/action/BaseAction;->Companion:Lcom/zykj/view/simpleBoard/action/BaseAction$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V
    .locals 1
    .param p1    # Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/view/simpleBoard/DrawControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 31
    .line 32
    const/high16 p1, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstDistance:F

    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->originMatrix:Landroid/graphics/Matrix;

    .line 42
    .line 43
    new-instance p1, Landroid/view/MotionEvent$PointerCoords;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 56
    .line 57
    new-instance p1, Landroid/graphics/PointF;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 63
    .line 64
    new-instance p1, Landroid/graphics/PointF;

    .line 65
    .line 66
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMiddlePointF:Landroid/graphics/PointF;

    .line 70
    .line 71
    new-instance p1, Landroid/graphics/Matrix;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 77
    .line 78
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchPointerDown$lambda$1(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchMove$lambda$2(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchDown$lambda$0(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final calculateDistance(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 4

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    float-to-double v0, v0

    .line 7
    const/4 v2, 0x2

    .line 8
    int-to-double v2, v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float v0, v0

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    sub-float/2addr p1, p2

    .line 19
    float-to-double p1, p1

    .line 20
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    double-to-float p1, p1

    .line 25
    add-float/2addr v0, p1

    .line 26
    float-to-double p1, v0

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    return p1
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

.method public static synthetic d(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchUp$lambda$3(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final doubleTouchDown(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 18
    .line 19
    iget v2, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 20
    .line 21
    iget v1, v1, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 35
    .line 36
    iget v1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 37
    .line 38
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 59
    .line 60
    invoke-direct {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->calculateDistance(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstDistance:F

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleMatrixDown()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private final doubleTouchMove(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleTranslation(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleMatrixMove(Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final doubleTouchUp(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleTranslation(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleMatrixUp(Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final handleMatrixDown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->originMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final handleMatrixMove(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->originMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->handleCameraMatrix(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final handleMatrixUp(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->handleMatrixMove(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final handleTranslation(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 10
    .line 11
    iget v2, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 12
    .line 13
    iget v1, v1, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempPointerCoords:Landroid/view/MotionEvent$PointerCoords;

    .line 27
    .line 28
    iget v1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 29
    .line 30
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 31
    .line 32
    invoke-virtual {p1, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEnableControl()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-direct {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->calculateDistance(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstDistance:F

    .line 57
    .line 58
    div-float/2addr p1, v0

    .line 59
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 62
    .line 63
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    invoke-virtual {v0, p1, p1, v2, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMiddlePointF:Landroid/graphics/PointF;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempFirstPointF:Landroid/graphics/PointF;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempSecondPointF:Landroid/graphics/PointF;

    .line 75
    .line 76
    invoke-direct {p0, v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->calculateMiddlePointF(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMiddlePointF:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 88
    .line 89
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstMiddlePointF:Landroid/graphics/PointF;

    .line 90
    .line 91
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 92
    .line 93
    sub-float/2addr v1, v3

    .line 94
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 95
    .line 96
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    sub-float/2addr v0, v2

    .line 99
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 103
    .line 104
    return-object p1
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
    iget-wide v2, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstTouchDownTime:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x30

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private static final onTouchDown$lambda$0(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->singleTouchDown(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final onTouchMove$lambda$2(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->singleTouchMove(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final onTouchPointerDown$lambda$1(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->singleTouchUp(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final onTouchUp$lambda$3(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->singleTouchUp(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final isSingleFingerInput(Landroid/view/MotionEvent;Lr6/a;)V
    .locals 5
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEnableFinger()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/view/MotionEvent$PointerProperties;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v3, v0}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 33
    .line 34
    .line 35
    iget v4, v0, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 36
    .line 37
    if-ne v4, v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-ne p1, v1, :cond_2

    .line 48
    .line 49
    invoke-interface {p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public onTouchDown(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
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
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->firstTouchDownTime:J

    .line 14
    .line 15
    new-instance v0, Lg5/a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lg5/a;-><init>(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->isSingleFingerInput(Landroid/view/MotionEvent;Lr6/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onTouchMove(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
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
    iget v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->doubleTouchMove(Landroid/view/MotionEvent;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance v0, Lg5/a;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lg5/a;-><init>(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->isSingleFingerInput(Landroid/view/MotionEvent;Lr6/a;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onTouchPointerDown(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
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
    iget v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iput v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->isQuickDoubleTouchDown()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->singleTouchCancel(Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lg5/a;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, p0, p1, v1}, Lg5/a;-><init>(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->isSingleFingerInput(Landroid/view/MotionEvent;Lr6/a;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->doubleTouchDown(Landroid/view/MotionEvent;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public onTouchPointerUp(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
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
    iget v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->doubleTouchUp(Landroid/view/MotionEvent;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onTouchUp(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
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
    iget v0, p0, Lcom/zykj/view/simpleBoard/action/BaseAction;->fingerMode:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lg5/a;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, p0, p1, v1}, Lg5/a;-><init>(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/action/BaseAction;->isSingleFingerInput(Landroid/view/MotionEvent;Lr6/a;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public abstract singleTouchCancel(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchDown(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchMove(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract singleTouchUp(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
