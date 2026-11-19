.class public final Lcom/zykj/view/simpleBoard/DrawControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0014\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u001b\u0010$\u001a\u00020\u001a2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\n\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010)\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008/\u0010.J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u00080\u0010.J\r\u00101\u001a\u00020\u001a\u00a2\u0006\u0004\u00081\u00102J\r\u00103\u001a\u00020\u0017\u00a2\u0006\u0004\u00083\u00104J\u0015\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u0015\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020\u001e\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010<\u001a\u00020\u001a2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010:\u00a2\u0006\u0004\u0008<\u0010=J\r\u0010>\u001a\u00020\u001a\u00a2\u0006\u0004\u0008>\u00102J\u0015\u0010?\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008?\u0010@J#\u0010B\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008B\u0010CJ\r\u0010D\u001a\u00020\u001a\u00a2\u0006\u0004\u0008D\u00102J\u0015\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000b\u00a2\u0006\u0004\u0008F\u0010GJ\u0015\u0010H\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000b\u00a2\u0006\u0004\u0008H\u0010GJ\u0015\u0010J\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u0004\u00a2\u0006\u0004\u0008J\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010NR$\u0010O\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u00109\"\u0004\u0008R\u0010!R\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010MR\'\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00110Wj\u0008\u0012\u0004\u0012\u00020\u0011`X8\u0006\u00a2\u0006\u000c\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\R\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0014\u0010a\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010^R\u0014\u0010b\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010MR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0014\u0010f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0014\u0010h\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010g\u00a8\u0006i"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "mBoardConfig",
        "Landroid/graphics/Matrix;",
        "mCameraMatrix",
        "Lcom/zykj/view/simpleBoard/view/IBoardView;",
        "mDrawView",
        "<init>",
        "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/view/IBoardView;)V",
        "",
        "Landroid/graphics/PointF;",
        "pointList",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Path;",
        "path",
        "Lcom/zykj/view/simpleBoard/action/WritePath;",
        "buildWritePathData",
        "(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lcom/zykj/view/simpleBoard/action/WritePath;",
        "pointF",
        "",
        "offset",
        "",
        "checkPointFUnionPath",
        "(Landroid/graphics/PointF;Ljava/util/List;F)Z",
        "Ld6/s;",
        "initPenPaint",
        "(Landroid/graphics/Paint;)V",
        "initEraserPaint",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "setImageBackground",
        "(Landroid/graphics/Bitmap;)V",
        "Lcom/zykj/view/utils/ProtoPath;",
        "pathList",
        "setPathList",
        "(Ljava/util/List;)V",
        "",
        "viewWidth",
        "viewHeight",
        "updateSize",
        "(II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawBackgroundBitmap",
        "(Landroid/graphics/Canvas;)V",
        "drawPathBitmap",
        "drawTempPath",
        "clean",
        "()V",
        "isEmpty",
        "()Z",
        "scale",
        "setScale",
        "(F)V",
        "buildBitmap",
        "()Landroid/graphics/Bitmap;",
        "Lkotlin/Function0;",
        "listener",
        "setOnActionListener",
        "(Lr6/a;)V",
        "reset",
        "handleWritePath",
        "(Landroid/graphics/Path;)V",
        "pointFList",
        "handleWritePathEnd",
        "(Landroid/graphics/Path;Ljava/util/List;)V",
        "handleWritePathCancel",
        "currentPointF",
        "handleEraser",
        "(Landroid/graphics/PointF;)V",
        "handleEraserEnd",
        "matrix",
        "handleCameraMatrix",
        "(Landroid/graphics/Matrix;)V",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "Landroid/graphics/Matrix;",
        "Lcom/zykj/view/simpleBoard/view/IBoardView;",
        "mBackgroundBitmap",
        "Landroid/graphics/Bitmap;",
        "getMBackgroundBitmap",
        "setMBackgroundBitmap",
        "Landroid/graphics/RectF;",
        "mBackgroundRectF",
        "Landroid/graphics/RectF;",
        "mBackgroundMatrix",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "mPathList",
        "Ljava/util/ArrayList;",
        "getMPathList",
        "()Ljava/util/ArrayList;",
        "mTempPath",
        "Landroid/graphics/Path;",
        "mActionListener",
        "Lr6/a;",
        "tempPath",
        "tempMatrix",
        "",
        "tempMatrixValue",
        "[F",
        "mPathPaint",
        "Landroid/graphics/Paint;",
        "mTempPaint",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDrawControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawControl.kt\ncom/zykj/view/simpleBoard/DrawControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,597:1\n1563#2:598\n1634#2,3:599\n1869#2,2:602\n1869#2,2:604\n1878#2,3:606\n1#3:609\n268#4:610\n268#4:611\n*S KotlinDebug\n*F\n+ 1 DrawControl.kt\ncom/zykj/view/simpleBoard/DrawControl\n*L\n112#1:598\n112#1:599,3\n172#1:602,2\n252#1:604,2\n322#1:606,3\n405#1:610\n436#1:611\n*E\n"
    }
.end annotation


# instance fields
.field private mActionListener:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mBackgroundBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mBackgroundMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mBackgroundRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mCameraMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mPathList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/view/simpleBoard/action/WritePath;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mPathPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mTempPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mTempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMatrixValue:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/view/IBoardView;)V
    .locals 3
    .param p1    # Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/view/simpleBoard/view/IBoardView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "mBoardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mCameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mDrawView"

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
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 52
    .line 53
    new-instance p1, Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 59
    .line 60
    new-instance p1, Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 66
    .line 67
    const/16 p1, 0x9

    .line 68
    .line 69
    new-array p2, p1, [F

    .line 70
    .line 71
    const/4 p3, 0x0

    .line 72
    :goto_0
    if-ge p3, p1, :cond_0

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    aput v0, p2, p3

    .line 76
    .line 77
    add-int/lit8 p3, p3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 81
    .line 82
    new-instance p1, Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 85
    .line 86
    .line 87
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 90
    .line 91
    .line 92
    sget-object p3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 93
    .line 94
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 105
    .line 106
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 107
    .line 108
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 112
    .line 113
    .line 114
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathPaint:Landroid/graphics/Paint;

    .line 115
    .line 116
    new-instance p1, Landroid/graphics/Paint;

    .line 117
    .line 118
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 131
    .line 132
    .line 133
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 134
    .line 135
    invoke-direct {p2, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPaint:Landroid/graphics/Paint;

    .line 142
    .line 143
    return-void
.end method

.method private final buildWritePathData(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lcom/zykj/view/simpleBoard/action/WritePath;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Paint;",
            "Landroid/graphics/Path;",
            ")",
            "Lcom/zykj/view/simpleBoard/action/WritePath;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance p3, Landroid/graphics/PointF;

    .line 15
    .line 16
    invoke-direct {p3}, Landroid/graphics/PointF;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    add-int/lit8 v6, v4, 0x1

    .line 35
    .line 36
    if-ltz v4, :cond_3

    .line 37
    .line 38
    check-cast v5, Landroid/graphics/PointF;

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 43
    .line 44
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 45
    .line 46
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 47
    .line 48
    .line 49
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 50
    .line 51
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 52
    .line 53
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    sub-int/2addr v7, v2

    .line 65
    if-ne v4, v7, :cond_2

    .line 66
    .line 67
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 72
    .line 73
    add-float/2addr v8, v4

    .line 74
    int-to-float v9, v1

    .line 75
    div-float/2addr v8, v9

    .line 76
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 77
    .line 78
    add-float/2addr v10, v7

    .line 79
    div-float/2addr v10, v9

    .line 80
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 81
    .line 82
    .line 83
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 84
    .line 85
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 86
    .line 87
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 92
    .line 93
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 94
    .line 95
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 96
    .line 97
    add-float/2addr v8, v4

    .line 98
    int-to-float v9, v1

    .line 99
    div-float/2addr v8, v9

    .line 100
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 101
    .line 102
    add-float/2addr v10, v7

    .line 103
    div-float/2addr v10, v9

    .line 104
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    move v4, v6

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    throw p1

    .line 117
    :cond_4
    :goto_2
    new-instance p3, Landroid/graphics/Paint;

    .line 118
    .line 119
    invoke-direct {p3, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 120
    .line 121
    .line 122
    new-instance p2, Landroid/graphics/RectF;

    .line 123
    .line 124
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p2, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 128
    .line 129
    .line 130
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEraserSize()F

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    int-to-float v1, v1

    .line 151
    mul-float/2addr v1, v2

    .line 152
    cmpg-float v3, v3, v1

    .line 153
    .line 154
    if-gez v3, :cond_5

    .line 155
    .line 156
    iget v3, p2, Landroid/graphics/RectF;->left:F

    .line 157
    .line 158
    sub-float/2addr v3, v2

    .line 159
    iput v3, p2, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 162
    .line 163
    add-float/2addr v3, v2

    .line 164
    iput v3, p2, Landroid/graphics/RectF;->right:F

    .line 165
    .line 166
    :cond_5
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    cmpg-float v1, v3, v1

    .line 171
    .line 172
    if-gez v1, :cond_6

    .line 173
    .line 174
    iget v1, p2, Landroid/graphics/RectF;->top:F

    .line 175
    .line 176
    sub-float/2addr v1, v2

    .line 177
    iput v1, p2, Landroid/graphics/RectF;->top:F

    .line 178
    .line 179
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 180
    .line 181
    add-float/2addr v1, v2

    .line 182
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 183
    .line 184
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    .line 191
    .line 192
    new-instance p1, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 193
    .line 194
    invoke-direct {p1, v0, p3, p2, v1}, Lcom/zykj/view/simpleBoard/action/WritePath;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/RectF;Ljava/util/List;)V

    .line 195
    .line 196
    .line 197
    return-object p1
.end method

.method public static synthetic buildWritePathData$default(Lcom/zykj/view/simpleBoard/DrawControl;Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;ILjava/lang/Object;)Lcom/zykj/view/simpleBoard/action/WritePath;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/DrawControl;->buildWritePathData(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final checkPointFUnionPath(Landroid/graphics/PointF;Ljava/util/List;F)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;F)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    if-ge v3, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Landroid/graphics/PointF;

    .line 16
    .line 17
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 18
    .line 19
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget v6, v4, Landroid/graphics/PointF;->y:F

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Landroid/graphics/PointF;

    .line 34
    .line 35
    iget v7, v4, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Landroid/graphics/PointF;

    .line 42
    .line 43
    iget v8, v4, Landroid/graphics/PointF;->y:F

    .line 44
    .line 45
    iget v9, p1, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v10, p1, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-static/range {v5 .. v10}, Lcom/zykj/blackboard/extensions/ExtensionsKt;->pointToLine(FFFFFF)F

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    cmpg-float v4, v4, p3

    .line 54
    .line 55
    if-gtz v4, :cond_0

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    return v2
.end method

.method private final initEraserPaint(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEraserColor()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final initPenPaint(Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getPenColor()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getPenWidth()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->isPenDashed()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    new-array v1, v1, [F

    .line 36
    .line 37
    fill-array-data v1, :array_0

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method


# virtual methods
.method public final buildBitmap()Landroid/graphics/Bitmap;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    float-to-int v0, v0

    .line 14
    float-to-int v1, v1

    .line 15
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    move-object v0, v2

    .line 43
    :cond_0
    check-cast v0, Landroid/graphics/Bitmap;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    new-instance v1, Landroid/graphics/Canvas;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 55
    .line 56
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 64
    .line 65
    invoke-virtual {v1, v3, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const/4 v2, -0x1

    .line 70
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x0

    .line 80
    :goto_2
    if-ge v4, v3, :cond_2

    .line 81
    .line 82
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    check-cast v5, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 89
    .line 90
    iget-object v6, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 91
    .line 92
    invoke-virtual {v5}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPath()Landroid/graphics/Path;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v6, v7}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 97
    .line 98
    .line 99
    iget-object v6, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 100
    .line 101
    invoke-virtual {v5}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPaint()Landroid/graphics/Paint;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    return-object v0

    .line 110
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    .line 111
    .line 112
    const-string v1, "view have not init"

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v0
.end method

.method public final clean()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mActionListener:Lr6/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final drawBackgroundBitmap(Landroid/graphics/Canvas;)V
    .locals 3
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/zykj/blackboard/utils/CanvasUtils;->INSTANCE:Lcom/zykj/blackboard/utils/CanvasUtils;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0, v2}, Lcom/zykj/blackboard/utils/CanvasUtils;->drawLargeBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/4 v0, -0x1

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final drawPathBitmap(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    check-cast v3, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPath()Landroid/graphics/Path;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPaint()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public final drawTempPath(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final getMBackgroundBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMPathList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/view/simpleBoard/action/WritePath;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final handleCameraMatrix(Landroid/graphics/Matrix;)V
    .locals 13
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "before -> "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "DrawControl"

    .line 34
    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    aget v3, v0, v2

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    aget v5, v0, v4

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    aget v7, v0, v6

    .line 53
    .line 54
    const/4 v8, 0x5

    .line 55
    aget v0, v0, v8

    .line 56
    .line 57
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 58
    .line 59
    invoke-virtual {v9}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getMaxScaleTime()F

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const/high16 v10, 0x3f800000    # 1.0f

    .line 64
    .line 65
    cmpl-float v9, v9, v10

    .line 66
    .line 67
    if-lez v9, :cond_0

    .line 68
    .line 69
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 70
    .line 71
    invoke-virtual {v9}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getMaxScaleTime()F

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move v9, v10

    .line 77
    :goto_0
    cmpg-float v11, v3, v10

    .line 78
    .line 79
    if-gez v11, :cond_1

    .line 80
    .line 81
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 82
    .line 83
    aput v10, v11, v2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    cmpl-float v11, v3, v9

    .line 87
    .line 88
    if-lez v11, :cond_2

    .line 89
    .line 90
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 91
    .line 92
    aput v9, v11, v2

    .line 93
    .line 94
    :cond_2
    :goto_1
    cmpg-float v11, v5, v10

    .line 95
    .line 96
    if-gez v11, :cond_3

    .line 97
    .line 98
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 99
    .line 100
    aput v10, v9, v4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    cmpl-float v10, v3, v9

    .line 104
    .line 105
    if-lez v10, :cond_4

    .line 106
    .line 107
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 108
    .line 109
    aput v9, v10, v4

    .line 110
    .line 111
    :cond_4
    :goto_2
    const/4 v9, 0x0

    .line 112
    cmpl-float v10, v7, v9

    .line 113
    .line 114
    const/4 v11, 0x1

    .line 115
    if-lez v10, :cond_5

    .line 116
    .line 117
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 118
    .line 119
    aput v9, v2, v6

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_5
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 124
    .line 125
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    mul-float/2addr v10, v3

    .line 130
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 131
    .line 132
    check-cast v12, Landroid/view/View;

    .line 133
    .line 134
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    int-to-float v12, v12

    .line 139
    sub-float/2addr v10, v12

    .line 140
    neg-float v10, v10

    .line 141
    cmpg-float v10, v7, v10

    .line 142
    .line 143
    if-gez v10, :cond_6

    .line 144
    .line 145
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 146
    .line 147
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 148
    .line 149
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 154
    .line 155
    aget v2, v10, v2

    .line 156
    .line 157
    mul-float/2addr v7, v2

    .line 158
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 159
    .line 160
    check-cast v2, Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    int-to-float v2, v2

    .line 167
    sub-float/2addr v7, v2

    .line 168
    neg-float v2, v7

    .line 169
    aput v2, v3, v6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 173
    .line 174
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    mul-float/2addr v10, v3

    .line 179
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 180
    .line 181
    check-cast v12, Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    int-to-float v12, v12

    .line 188
    cmpg-float v10, v10, v12

    .line 189
    .line 190
    if-nez v10, :cond_7

    .line 191
    .line 192
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 193
    .line 194
    aput v9, v2, v6

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    int-to-float v10, v11

    .line 198
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 199
    .line 200
    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    mul-float/2addr v12, v3

    .line 205
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 206
    .line 207
    check-cast v3, Landroid/view/View;

    .line 208
    .line 209
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    int-to-float v3, v3

    .line 214
    sub-float/2addr v12, v3

    .line 215
    div-float/2addr v7, v12

    .line 216
    add-float/2addr v7, v10

    .line 217
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 218
    .line 219
    sub-float/2addr v7, v10

    .line 220
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 221
    .line 222
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 227
    .line 228
    aget v2, v12, v2

    .line 229
    .line 230
    mul-float/2addr v10, v2

    .line 231
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 232
    .line 233
    check-cast v2, Landroid/view/View;

    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    int-to-float v2, v2

    .line 240
    sub-float/2addr v10, v2

    .line 241
    mul-float/2addr v10, v7

    .line 242
    aput v10, v3, v6

    .line 243
    .line 244
    :goto_3
    cmpl-float v2, v0, v9

    .line 245
    .line 246
    if-lez v2, :cond_8

    .line 247
    .line 248
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 249
    .line 250
    aput v9, v0, v8

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_8
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 255
    .line 256
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    mul-float/2addr v2, v5

    .line 261
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 262
    .line 263
    check-cast v3, Landroid/view/View;

    .line 264
    .line 265
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    int-to-float v3, v3

    .line 270
    sub-float/2addr v2, v3

    .line 271
    neg-float v2, v2

    .line 272
    cmpg-float v2, v0, v2

    .line 273
    .line 274
    if-gez v2, :cond_9

    .line 275
    .line 276
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 277
    .line 278
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 279
    .line 280
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 285
    .line 286
    aget v3, v3, v4

    .line 287
    .line 288
    mul-float/2addr v2, v3

    .line 289
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 290
    .line 291
    check-cast v3, Landroid/view/View;

    .line 292
    .line 293
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    int-to-float v3, v3

    .line 298
    sub-float/2addr v2, v3

    .line 299
    neg-float v2, v2

    .line 300
    aput v2, v0, v8

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_9
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 304
    .line 305
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    mul-float/2addr v2, v5

    .line 310
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 311
    .line 312
    check-cast v3, Landroid/view/View;

    .line 313
    .line 314
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    int-to-float v3, v3

    .line 319
    cmpg-float v2, v2, v3

    .line 320
    .line 321
    if-nez v2, :cond_a

    .line 322
    .line 323
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 324
    .line 325
    aput v9, v0, v8

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_a
    int-to-float v2, v11

    .line 329
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 330
    .line 331
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    mul-float/2addr v3, v5

    .line 336
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 337
    .line 338
    check-cast v5, Landroid/view/View;

    .line 339
    .line 340
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    int-to-float v5, v5

    .line 345
    sub-float/2addr v3, v5

    .line 346
    div-float/2addr v0, v3

    .line 347
    add-float/2addr v0, v2

    .line 348
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 349
    .line 350
    sub-float/2addr v0, v2

    .line 351
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 352
    .line 353
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 358
    .line 359
    aget v4, v5, v4

    .line 360
    .line 361
    mul-float/2addr v2, v4

    .line 362
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 363
    .line 364
    check-cast v4, Landroid/view/View;

    .line 365
    .line 366
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    int-to-float v4, v4

    .line 371
    sub-float/2addr v2, v4

    .line 372
    mul-float/2addr v2, v0

    .line 373
    aput v2, v3, v8

    .line 374
    .line 375
    :goto_4
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 376
    .line 377
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    new-instance v2, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v3, "after -> "

    .line 387
    .line 388
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 402
    .line 403
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 404
    .line 405
    .line 406
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 407
    .line 408
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateImageView()V

    .line 409
    .line 410
    .line 411
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 412
    .line 413
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 414
    .line 415
    .line 416
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 417
    .line 418
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 419
    .line 420
    .line 421
    return-void
.end method

.method public final handleEraser(Landroid/graphics/PointF;)V
    .locals 6
    .param p1    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 18
    .line 19
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 20
    .line 21
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEraserSize()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPaint:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->initEraserPaint(Landroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "iterator(...)"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "next(...)"

    .line 62
    .line 63
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v2, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/zykj/view/simpleBoard/action/WritePath;->getRectF()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v2}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPointList()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 87
    .line 88
    invoke-static {v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEraserSize()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-direct {p0, p1, v2, v3}, Lcom/zykj/view/simpleBoard/DrawControl;->checkPointFUnionPath(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_0

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_1
    if-eqz v1, :cond_2

    .line 114
    .line 115
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mActionListener:Lr6/a;

    .line 116
    .line 117
    if-eqz p1, :cond_2

    .line 118
    .line 119
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 123
    .line 124
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 128
    .line 129
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final handleEraserEnd(Landroid/graphics/PointF;)V
    .locals 6
    .param p1    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "iterator(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "next(...)"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/zykj/view/simpleBoard/action/WritePath;->getRectF()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPointList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-static {v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getEraserSize()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-direct {p0, p1, v2, v3}, Lcom/zykj/view/simpleBoard/DrawControl;->checkPointFUnionPath(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mActionListener:Lr6/a;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 95
    .line 96
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 100
    .line 101
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final handleWritePath(Landroid/graphics/Path;)V
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempPath:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPaint:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->initPenPaint(Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 31
    .line 32
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final handleWritePathCancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final handleWritePathEnd(Landroid/graphics/Path;Ljava/util/List;)V
    .locals 2
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Path;",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointFList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mTempPath:Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathPaint:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->initPenPaint(Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathPaint:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-direct {p0, p2, v1, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->buildWritePathData(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mActionListener:Lr6/a;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 40
    .line 41
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 45
    .line 46
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateTempPathView()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public final reset()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 45
    .line 46
    invoke-interface {v0}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateImageView()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 50
    .line 51
    invoke-interface {v0}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final setImageBackground(Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    :cond_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 38
    .line 39
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v0, Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-lez v0, :cond_1

    .line 51
    .line 52
    int-to-float v0, v0

    .line 53
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    int-to-float v1, v1

    .line 58
    div-float v1, v0, v1

    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-virtual {v2, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    int-to-float p1, p1

    .line 72
    mul-float/2addr p1, v1

    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-virtual {v2, v1, v1, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 75
    .line 76
    .line 77
    :cond_1
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 78
    .line 79
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updateImageView()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final setMBackgroundBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnActionListener(Lr6/a;)V
    .locals 0
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mActionListener:Lr6/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setPathList(Ljava/util/List;)V
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/view/utils/ProtoPath;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "pathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mPathList:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/zykj/view/utils/ProtoPath;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/zykj/view/utils/ProtoPath;->getPointList()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v2}, Lcom/zykj/view/utils/ProtoPath;->getPaint()Landroid/graphics/Paint;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const/4 v7, 0x4

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    move-object v3, p0

    .line 52
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/simpleBoard/DrawControl;->buildWritePathData$default(Lcom/zykj/view/simpleBoard/DrawControl;Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;ILjava/lang/Object;)Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v3, p0

    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, v3, Lcom/zykj/view/simpleBoard/DrawControl;->mDrawView:Lcom/zykj/view/simpleBoard/view/IBoardView;

    .line 65
    .line 66
    invoke-interface {p1}, Lcom/zykj/view/simpleBoard/view/IBoardView;->updatePathView()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final setScale(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getMinScaleTime()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->getMaxScaleTime()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    cmpg-float v0, p1, v0

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrixValue:[F

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    aput p1, v0, v1

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    aput p1, v0, v1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/DrawControl;->tempMatrix:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->handleCameraMatrix(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 48
    .line 49
    const-string v0, "scale is not in range at config"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final updateSize(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    int-to-float p2, p2

    .line 12
    div-float p2, p1, p2

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundMatrix:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, p2, p2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    mul-float/2addr v0, p2

    .line 27
    invoke-virtual {v2, v1, v1, p1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/DrawControl;->mBackgroundRectF:Landroid/graphics/RectF;

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    int-to-float p2, p2

    .line 35
    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
