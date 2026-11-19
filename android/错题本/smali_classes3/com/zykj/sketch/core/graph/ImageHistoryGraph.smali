# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/sketch/core/graph/ImageHistoryGraph;
.super Lcom/zykj/sketch/core/graph/ViewGraph;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ3\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010 R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u0016\u0010\u0008\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010 R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010!R\u001e\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/zykj/sketch/core/graph/ImageHistoryGraph;",
        "Lcom/zykj/sketch/core/graph/ViewGraph;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "actionControl",
        "",
        "width",
        "height",
        "viewWidth",
        "viewHeight",
        "",
        "fileName",
        "<init>",
        "(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;)V",
        "Landroid/graphics/Matrix;",
        "getSaleCenterMatrix",
        "(IIII)Landroid/graphics/Matrix;",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Ld6/s;",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "onMeasure",
        "()V",
        "getFileName",
        "()Ljava/lang/String;",
        "onDestroy",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "getSnapshot",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "graphType",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "I",
        "Ljava/lang/String;",
        "Landroid/graphics/Bitmap;",
        "kotlin.jvm.PlatformType",
        "bitmap",
        "Landroid/graphics/Bitmap;",
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
.field private bitmap:Landroid/graphics/Bitmap;

.field private fileName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private height:I

.field private viewHeight:I

.field private viewWidth:I

.field private width:I


# direct methods
# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
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
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/ViewGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 12
    .line 13
    .line 14
    iput p2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->width:I

    .line 15
    .line 16
    iput p3, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->height:I

    .line 17
    .line 18
    iput p4, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewWidth:I

    .line 19
    .line 20
    iput p5, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewHeight:I

    .line 21
    .line 22
    iput-object p6, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->fileName:Ljava/lang/String;

    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p3, "res"

    .line 50
    .line 51
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->fileName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    .line 67
    .line 68
    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object p3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    iput-object p3, p2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 74
    .line 75
    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    iget p1, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->width:I

    .line 82
    .line 83
    iget p2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->height:I

    .line 84
    .line 85
    iget p3, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewWidth:I

    .line 86
    .line 87
    iget p4, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewHeight:I

    .line 88
    .line 89
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->onMeasure()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private final getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;
    .locals 0

    .line 1
    div-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    div-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    div-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    sub-int/2addr p3, p1

    .line 8
    div-int/lit8 p2, p2, 0x2

    .line 9
    .line 10
    sub-int/2addr p4, p2

    .line 11
    new-instance p1, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    int-to-float p2, p3

    .line 17
    int-to-float p3, p4

    .line 18
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public static synthetic getSaleCenterMatrix$default(Lcom/zykj/sketch/core/graph/ImageHistoryGraph;IIIIILjava/lang/Object;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final getFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getSnapshotBuild()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$File;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->fileName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setFileName(Ljava/lang/String;)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->width:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->height:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewWidth:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->viewHeight:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$File;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "builder.build()"

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->IMAGE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    const-string v1, "bitmap"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v0

    .line 39
    throw p1

    .line 40
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onMeasure()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->width:I

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->height:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p0, v1, v1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    int-to-float v2, v2

    .line 30
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {p0, v2, v1, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-float v3, v3

    .line 45
    iget-object v4, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    int-to-float v4, v4

    .line 52
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {p0, v3, v4, v5}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, p0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    int-to-float v4, v4

    .line 67
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {p0, v1, v4, v5}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 80
    .line 81
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 82
    .line 83
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 84
    .line 85
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 86
    .line 87
    invoke-virtual {v4, v0, v2, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
