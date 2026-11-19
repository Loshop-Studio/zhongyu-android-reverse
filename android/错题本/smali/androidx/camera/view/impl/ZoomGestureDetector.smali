.class public final Landroidx/camera/view/impl/ZoomGestureDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/impl/ZoomGestureDetector$Companion;,
        Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;,
        Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 -2\u00020\u0001:\u0003-./B+\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010(\u001a\u00020\u000cH\u0002J\u0008\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u001c\"\u0004\u0008 \u0010\u001eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u00060"
    }
    d2 = {
        "Landroidx/camera/view/impl/ZoomGestureDetector;",
        "",
        "context",
        "Landroid/content/Context;",
        "spanSlop",
        "",
        "minSpan",
        "listener",
        "Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;",
        "(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V",
        "anchoredZoomMode",
        "anchoredZoomStartX",
        "",
        "anchoredZoomStartY",
        "currentSpan",
        "currentSpanX",
        "currentSpanY",
        "eventBeforeOrAboveStartingGestureEvent",
        "",
        "eventTime",
        "",
        "focusX",
        "focusY",
        "gestureDetector",
        "Landroid/view/GestureDetector;",
        "initialSpan",
        "isInProgress",
        "isQuickZoomEnabled",
        "()Z",
        "setQuickZoomEnabled",
        "(Z)V",
        "isStylusZoomEnabled",
        "setStylusZoomEnabled",
        "prevTime",
        "previousSpan",
        "previousSpanX",
        "previousSpanY",
        "timeDelta",
        "getTimeDelta",
        "()J",
        "getIncrementalScaleFactor",
        "inAnchoredZoomMode",
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "Companion",
        "OnZoomGestureListener",
        "ZoomEvent",
        "camera-view_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ANCHORED_ZOOM_MODE_DOUBLE_TAP:I = 0x1

.field private static final ANCHORED_ZOOM_MODE_NONE:I = 0x0

.field private static final ANCHORED_ZOOM_MODE_STYLUS:I = 0x2

.field public static final Companion:Landroidx/camera/view/impl/ZoomGestureDetector$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEFAULT_MIN_SPAN:I = 0x0

.field private static final SCALE_FACTOR:F = 0.5f


# instance fields
.field private anchoredZoomMode:I

.field private anchoredZoomStartX:F

.field private anchoredZoomStartY:F

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentSpan:F

.field private currentSpanX:F

.field private currentSpanY:F

.field private eventBeforeOrAboveStartingGestureEvent:Z

.field private eventTime:J

.field private focusX:I
    .annotation build Landroidx/annotation/Px;
    .end annotation
.end field

.field private focusY:I
    .annotation build Landroidx/annotation/Px;
    .end annotation
.end field

.field private gestureDetector:Landroid/view/GestureDetector;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private initialSpan:F

.field private isInProgress:Z

.field private isQuickZoomEnabled:Z

.field private isStylusZoomEnabled:Z

.field private final listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final minSpan:I

.field private prevTime:J

.field private previousSpan:F

.field private previousSpanX:F

.field private previousSpanY:F

.field private final spanSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/view/impl/ZoomGestureDetector$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/camera/view/impl/ZoomGestureDetector$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Landroidx/camera/view/impl/ZoomGestureDetector;->Companion:Landroidx/camera/view/impl/ZoomGestureDetector$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p4    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->context:Landroid/content/Context;

    .line 5
    iput p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 6
    iput p3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 7
    iput-object p4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 9
    iput-boolean p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 10
    new-instance p2, Landroid/view/GestureDetector;

    .line 11
    new-instance p3, Landroidx/camera/view/impl/ZoomGestureDetector$gestureDetector$1;

    invoke-direct {p3, p0}, Landroidx/camera/view/impl/ZoomGestureDetector$gestureDetector$1;-><init>(Landroidx/camera/view/impl/ZoomGestureDetector;)V

    .line 12
    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->gestureDetector:Landroid/view/GestureDetector;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 13
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x0

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p3    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public static final synthetic access$setAnchoredZoomMode$p(Landroidx/camera/view/impl/ZoomGestureDetector;I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setAnchoredZoomStartX$p(Landroidx/camera/view/impl/ZoomGestureDetector;F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setAnchoredZoomStartY$p(Landroidx/camera/view/impl/ZoomGestureDetector;F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

    .line 2
    .line 3
    return-void
.end method

.method private final getIncrementalScaleFactor()F
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventBeforeOrAboveStartingGestureEvent:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 15
    .line 16
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 17
    .line 18
    cmpg-float v3, v3, v4

    .line 19
    .line 20
    if-ltz v3, :cond_1

    .line 21
    .line 22
    :cond_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 25
    .line 26
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 27
    .line 28
    cmpl-float v0, v0, v3

    .line 29
    .line 30
    if-lez v0, :cond_2

    .line 31
    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v0, 0x0

    .line 35
    :goto_0
    int-to-float v2, v2

    .line 36
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 37
    .line 38
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 39
    .line 40
    div-float/2addr v3, v4

    .line 41
    sub-float/2addr v2, v3

    .line 42
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/high16 v3, 0x3f000000    # 0.5f

    .line 47
    .line 48
    mul-float/2addr v2, v3

    .line 49
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 50
    .line 51
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 52
    .line 53
    int-to-float v4, v4

    .line 54
    cmpg-float v3, v3, v4

    .line 55
    .line 56
    if-gtz v3, :cond_3

    .line 57
    .line 58
    return v1

    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    add-float/2addr v2, v1

    .line 62
    return v2

    .line 63
    :cond_4
    sub-float/2addr v1, v2

    .line 64
    return v1

    .line 65
    :cond_5
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    cmpl-float v2, v0, v2

    .line 69
    .line 70
    if-lez v2, :cond_6

    .line 71
    .line 72
    iget v1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 73
    .line 74
    div-float/2addr v1, v0

    .line 75
    :cond_6
    return v1
.end method

.method private final inAnchoredZoomMode()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method


# virtual methods
.method public final getTimeDelta()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 2
    .line 3
    iget-wide v2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    return-wide v0
.end method

.method public final isQuickZoomEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isStylusZoomEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 26
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "event"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iput-wide v2, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iget-object v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->gestureDetector:Landroid/view/GestureDetector;

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    and-int/lit8 v4, v4, 0x20

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    move v4, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v4, v5

    .line 46
    :goto_0
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 47
    .line 48
    const/4 v8, 0x2

    .line 49
    if-ne v7, v8, :cond_2

    .line 50
    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    move v7, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v7, v5

    .line 56
    :goto_1
    if-eq v2, v6, :cond_4

    .line 57
    .line 58
    const/4 v9, 0x3

    .line 59
    if-eq v2, v9, :cond_4

    .line 60
    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v9, v5

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_2
    move v9, v6

    .line 67
    :goto_3
    const/4 v10, 0x0

    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    if-eqz v9, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    move/from16 v18, v6

    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_6
    :goto_4
    iget-boolean v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 77
    .line 78
    if-eqz v11, :cond_7

    .line 79
    .line 80
    iget-object v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 81
    .line 82
    new-instance v12, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;

    .line 83
    .line 84
    iget-wide v13, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 85
    .line 86
    iget v15, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 87
    .line 88
    move/from16 v18, v6

    .line 89
    .line 90
    iget v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 91
    .line 92
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 93
    .line 94
    .line 95
    move-result v17

    .line 96
    move/from16 v16, v6

    .line 97
    .line 98
    invoke-direct/range {v12 .. v17}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;-><init>(JIIF)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v11, v12}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 102
    .line 103
    .line 104
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 105
    .line 106
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 107
    .line 108
    iput v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_7
    move/from16 v18, v6

    .line 112
    .line 113
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_8

    .line 118
    .line 119
    if-eqz v9, :cond_8

    .line 120
    .line 121
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 122
    .line 123
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 124
    .line 125
    iput v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 126
    .line 127
    :cond_8
    :goto_5
    if-eqz v9, :cond_9

    .line 128
    .line 129
    goto/16 :goto_13

    .line 130
    .line 131
    :cond_9
    :goto_6
    iget-boolean v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 132
    .line 133
    if-nez v6, :cond_a

    .line 134
    .line 135
    iget-boolean v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 136
    .line 137
    if-eqz v6, :cond_a

    .line 138
    .line 139
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_a

    .line 144
    .line 145
    if-nez v9, :cond_a

    .line 146
    .line 147
    if-eqz v4, :cond_a

    .line 148
    .line 149
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

    .line 160
    .line 161
    iput v8, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 162
    .line 163
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 164
    .line 165
    :cond_a
    const/4 v4, 0x6

    .line 166
    if-eqz v2, :cond_c

    .line 167
    .line 168
    if-eq v2, v4, :cond_c

    .line 169
    .line 170
    const/4 v6, 0x5

    .line 171
    if-eq v2, v6, :cond_c

    .line 172
    .line 173
    if-eqz v7, :cond_b

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_b
    move v6, v5

    .line 177
    goto :goto_8

    .line 178
    :cond_c
    :goto_7
    move/from16 v6, v18

    .line 179
    .line 180
    :goto_8
    if-ne v2, v4, :cond_d

    .line 181
    .line 182
    move/from16 v4, v18

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_d
    move v4, v5

    .line 186
    :goto_9
    if-eqz v4, :cond_e

    .line 187
    .line 188
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    goto :goto_a

    .line 193
    :cond_e
    const/4 v7, -0x1

    .line 194
    :goto_a
    if-eqz v4, :cond_f

    .line 195
    .line 196
    add-int/lit8 v4, v3, -0x1

    .line 197
    .line 198
    goto :goto_b

    .line 199
    :cond_f
    move v4, v3

    .line 200
    :goto_b
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_11

    .line 205
    .line 206
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

    .line 207
    .line 208
    iget v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    cmpg-float v12, v12, v11

    .line 215
    .line 216
    if-gez v12, :cond_10

    .line 217
    .line 218
    move/from16 v12, v18

    .line 219
    .line 220
    goto :goto_c

    .line 221
    :cond_10
    move v12, v5

    .line 222
    :goto_c
    iput-boolean v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventBeforeOrAboveStartingGestureEvent:Z

    .line 223
    .line 224
    goto :goto_e

    .line 225
    :cond_11
    move v9, v5

    .line 226
    move v11, v10

    .line 227
    move v12, v11

    .line 228
    :goto_d
    if-ge v9, v3, :cond_13

    .line 229
    .line 230
    if-eq v7, v9, :cond_12

    .line 231
    .line 232
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    add-float/2addr v11, v13

    .line 237
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    add-float/2addr v12, v13

    .line 242
    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 243
    .line 244
    goto :goto_d

    .line 245
    :cond_13
    int-to-float v9, v4

    .line 246
    div-float/2addr v11, v9

    .line 247
    div-float v9, v12, v9

    .line 248
    .line 249
    move/from16 v25, v11

    .line 250
    .line 251
    move v11, v9

    .line 252
    move/from16 v9, v25

    .line 253
    .line 254
    :goto_e
    move v13, v5

    .line 255
    move v12, v10

    .line 256
    :goto_f
    if-ge v13, v3, :cond_15

    .line 257
    .line 258
    if-eq v7, v13, :cond_14

    .line 259
    .line 260
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getX(I)F

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    sub-float/2addr v14, v9

    .line 265
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    add-float/2addr v14, v10

    .line 270
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getY(I)F

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    sub-float/2addr v10, v11

    .line 275
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    add-float/2addr v10, v12

    .line 280
    move v12, v10

    .line 281
    move v10, v14

    .line 282
    :cond_14
    add-int/lit8 v13, v13, 0x1

    .line 283
    .line 284
    goto :goto_f

    .line 285
    :cond_15
    int-to-float v1, v4

    .line 286
    div-float/2addr v10, v1

    .line 287
    div-float/2addr v12, v1

    .line 288
    int-to-float v1, v8

    .line 289
    mul-float/2addr v10, v1

    .line 290
    mul-float/2addr v12, v1

    .line 291
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_16

    .line 296
    .line 297
    move v1, v12

    .line 298
    goto :goto_10

    .line 299
    :cond_16
    float-to-double v3, v10

    .line 300
    float-to-double v13, v12

    .line 301
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 302
    .line 303
    .line 304
    move-result-wide v3

    .line 305
    double-to-float v1, v3

    .line 306
    :goto_10
    iget-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 307
    .line 308
    invoke-static {v9}, Lt6/a;->q(F)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 313
    .line 314
    invoke-static {v11}, Lt6/a;->q(F)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 319
    .line 320
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-nez v4, :cond_18

    .line 325
    .line 326
    iget-boolean v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 327
    .line 328
    if-eqz v4, :cond_18

    .line 329
    .line 330
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 331
    .line 332
    int-to-float v4, v4

    .line 333
    cmpg-float v4, v1, v4

    .line 334
    .line 335
    if-ltz v4, :cond_17

    .line 336
    .line 337
    if-eqz v6, :cond_18

    .line 338
    .line 339
    :cond_17
    iget-object v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 340
    .line 341
    new-instance v19, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;

    .line 342
    .line 343
    iget-wide v13, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 344
    .line 345
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 346
    .line 347
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 348
    .line 349
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 350
    .line 351
    .line 352
    move-result v24

    .line 353
    move/from16 v22, v7

    .line 354
    .line 355
    move/from16 v23, v9

    .line 356
    .line 357
    move-wide/from16 v20, v13

    .line 358
    .line 359
    invoke-direct/range {v19 .. v24}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;-><init>(JIIF)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v7, v19

    .line 363
    .line 364
    invoke-interface {v4, v7}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 365
    .line 366
    .line 367
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 368
    .line 369
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 370
    .line 371
    :cond_18
    if-eqz v6, :cond_19

    .line 372
    .line 373
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 374
    .line 375
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 376
    .line 377
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 378
    .line 379
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 380
    .line 381
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 382
    .line 383
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 384
    .line 385
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 386
    .line 387
    :cond_19
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_1a

    .line 392
    .line 393
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 394
    .line 395
    goto :goto_11

    .line 396
    :cond_1a
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 397
    .line 398
    :goto_11
    iget-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 399
    .line 400
    if-nez v5, :cond_1c

    .line 401
    .line 402
    int-to-float v4, v4

    .line 403
    cmpl-float v4, v1, v4

    .line 404
    .line 405
    if-ltz v4, :cond_1c

    .line 406
    .line 407
    if-nez v3, :cond_1b

    .line 408
    .line 409
    iget v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 410
    .line 411
    sub-float v3, v1, v3

    .line 412
    .line 413
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 418
    .line 419
    int-to-float v4, v4

    .line 420
    cmpl-float v3, v3, v4

    .line 421
    .line 422
    if-lez v3, :cond_1c

    .line 423
    .line 424
    :cond_1b
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 425
    .line 426
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 427
    .line 428
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 429
    .line 430
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 431
    .line 432
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 433
    .line 434
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 435
    .line 436
    iget-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 437
    .line 438
    iput-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 439
    .line 440
    iget-object v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 441
    .line 442
    new-instance v6, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;

    .line 443
    .line 444
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 445
    .line 446
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 447
    .line 448
    invoke-direct {v6, v3, v4, v7, v9}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;-><init>(JII)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v5, v6}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    iput-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 456
    .line 457
    :cond_1c
    if-ne v2, v8, :cond_1e

    .line 458
    .line 459
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 460
    .line 461
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 462
    .line 463
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 464
    .line 465
    iget-boolean v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 466
    .line 467
    if-eqz v1, :cond_1d

    .line 468
    .line 469
    iget-object v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 470
    .line 471
    new-instance v2, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;

    .line 472
    .line 473
    iget-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 474
    .line 475
    iget v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 476
    .line 477
    iget v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 478
    .line 479
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    invoke-direct/range {v2 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;-><init>(JIIF)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v1, v2}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    goto :goto_12

    .line 491
    :cond_1d
    move/from16 v1, v18

    .line 492
    .line 493
    :goto_12
    if-eqz v1, :cond_1e

    .line 494
    .line 495
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 496
    .line 497
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 498
    .line 499
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 500
    .line 501
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 502
    .line 503
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 504
    .line 505
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 506
    .line 507
    iget-wide v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 508
    .line 509
    iput-wide v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 510
    .line 511
    :cond_1e
    :goto_13
    return v18
.end method

.method public final setQuickZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStylusZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 2
    .line 3
    return-void
.end method
