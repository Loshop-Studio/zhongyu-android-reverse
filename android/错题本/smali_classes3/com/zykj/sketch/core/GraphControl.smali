.class public final Lcom/zykj/sketch/core/GraphControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/IControl;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u001f\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00102\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00081\u00102J\u000f\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000203H\u0016\u00a2\u0006\u0004\u00087\u00108J-\u0010>\u001a\u0008\u0012\u0004\u0012\u0002030=2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010@\u001a\u0008\u0012\u0004\u0012\u0002030=H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008B\u00102J\u000f\u0010C\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008C\u00102J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016\u00a2\u0006\u0004\u0008B\u0010FJ\u001f\u0010K\u001a\u00020\u00102\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0016\u00a2\u0006\u0004\u0008K\u0010LJ\u0019\u0010O\u001a\u00020\u00102\u0008\u0010N\u001a\u0004\u0018\u00010MH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ/\u0010U\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u0017\u0010U\u001a\u00020\u00102\u0006\u0010X\u001a\u00020WH\u0016\u00a2\u0006\u0004\u0008U\u0010YJ\u000f\u0010Z\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008Z\u0010[J\u000f\u0010\\\u001a\u00020WH\u0016\u00a2\u0006\u0004\u0008\\\u0010]J\u000f\u0010^\u001a\u00020MH\u0016\u00a2\u0006\u0004\u0008^\u0010_J\u000f\u0010`\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008`\u0010\'J\u0017\u0010`\u001a\u00020\u00102\u0006\u0010`\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008`\u0010*J\u000f\u0010a\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008a\u00102J\u000f\u0010b\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008b\u00102J\u000f\u0010c\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008c\u00102J\u000f\u0010d\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008d\u00102J\u000f\u0010e\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008e\u00102J\u0019\u0010g\u001a\u00020\u00102\u0008\u0010 \u001a\u0004\u0018\u00010fH\u0016\u00a2\u0006\u0004\u0008g\u0010hJ\u0011\u0010i\u001a\u0004\u0018\u00010fH\u0016\u00a2\u0006\u0004\u0008i\u0010jJ\u000f\u0010k\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008k\u0010lJ\r\u0010n\u001a\u00020m\u00a2\u0006\u0004\u0008n\u0010oJ\r\u0010p\u001a\u00020m\u00a2\u0006\u0004\u0008p\u0010oJ\r\u0010q\u001a\u00020m\u00a2\u0006\u0004\u0008q\u0010oJ\r\u0010r\u001a\u00020m\u00a2\u0006\u0004\u0008r\u0010oJ\u000f\u0010s\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008s\u0010-J\u001f\u0010t\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u00106\u001a\u000203H\u0002\u00a2\u0006\u0004\u0008t\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010wR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010xR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010yR\u0016\u0010z\u001a\u00020M8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0016\u0010|\u001a\u0002098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008|\u0010}R\u0016\u0010`\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008`\u0010~R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010~R\u0015\u0010\u007f\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u001c\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Lcom/zykj/sketch/core/GraphControl;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "Landroid/content/Context;",
        "context",
        "Lcom/zykj/sketch/core/listener/RealDraw;",
        "mDrawView",
        "Lcom/zykj/sketch/core/listener/ImitateDraw;",
        "mDrawTempView",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "sketchConfig",
        "<init>",
        "(Landroid/content/Context;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;Lcom/zykj/sketch/core/config/SketchConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "getMode",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "mode",
        "Ld6/s;",
        "setMode",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V",
        "",
        "getBackgroundColor",
        "()I",
        "color",
        "setBackgroundColor",
        "(I)V",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "getDrawArea",
        "()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "drawArea",
        "setDrawArea",
        "(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "listener",
        "setImageDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V",
        "getImageDeleteListener",
        "()Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "",
        "isTouch",
        "()Z",
        "touch",
        "setTouch",
        "(Z)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "getGraphConfig",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "config",
        "setRecordConfig",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V",
        "resetGraph",
        "()V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "getRootGraph",
        "()Lcom/zykj/sketch/core/graph/Graph;",
        "graph",
        "setRootGraph",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "",
        "x",
        "y",
        "offset",
        "",
        "findGraph",
        "(FFF)Ljava/util/List;",
        "findSelectGraph",
        "()Ljava/util/List;",
        "render",
        "forceRender",
        "Landroid/graphics/Canvas;",
        "canvas",
        "(Landroid/graphics/Canvas;)V",
        "Landroid/graphics/Path;",
        "path",
        "Landroid/graphics/Paint;",
        "paint",
        "renderTempPath",
        "(Landroid/graphics/Path;Landroid/graphics/Paint;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "renderTempThumbnail",
        "(Landroid/graphics/Bitmap;)V",
        "targetWidth",
        "targetHeight",
        "width",
        "height",
        "setCameraMatrix",
        "(IIII)V",
        "Landroid/graphics/Matrix;",
        "matrix",
        "(Landroid/graphics/Matrix;)V",
        "getScale",
        "()F",
        "getCameraMatrix",
        "()Landroid/graphics/Matrix;",
        "getDeleteBitmap",
        "()Landroid/graphics/Bitmap;",
        "isRender",
        "clearTempPaint",
        "resetStatus",
        "reset",
        "onDestroy",
        "clear",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "setGraphMatrixListener",
        "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V",
        "getGraphMatrixListener",
        "()Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "getSketchConfig",
        "()Lcom/zykj/sketch/core/config/SketchConfig;",
        "",
        "getBasePath",
        "()Ljava/lang/String;",
        "getBasePPTPath",
        "getBaseImagePath",
        "getBaseAudioPath",
        "initGraphConfig",
        "handleDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;Lcom/zykj/sketch/core/graph/Graph;)V",
        "Lcom/zykj/sketch/core/listener/RealDraw;",
        "Lcom/zykj/sketch/core/listener/ImitateDraw;",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "deleteBitmap",
        "Landroid/graphics/Bitmap;",
        "scale",
        "F",
        "Z",
        "cameraMatrix",
        "Landroid/graphics/Matrix;",
        "rootGraph",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "currentMode",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "backgroundColor",
        "I",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "graphMatrixListener",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "imageDeleteListener",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
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
.field private backgroundColor:I

.field private final cameraMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentMode:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private deleteBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private drawArea:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private graphMatrixListener:Lcom/zykj/sketch/core/listener/GraphMatrixListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private imageDeleteListener:Lcom/zykj/sketch/core/listener/ImageDeleteListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isRender:Z

.field private isTouch:Z

.field private final mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rootGraph:Lcom/zykj/sketch/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private scale:F

.field private final sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;Lcom/zykj/sketch/core/config/SketchConfig;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/core/listener/RealDraw;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/sketch/core/listener/ImitateDraw;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/sketch/core/config/SketchConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mDrawView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mDrawTempView"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sketchConfig"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 27
    .line 28
    iput-object p4, p0, Lcom/zykj/sketch/core/GraphControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 29
    .line 30
    const/high16 p3, 0x3f800000    # 1.0f

    .line 31
    .line 32
    iput p3, p0, Lcom/zykj/sketch/core/GraphControl;->scale:F

    .line 33
    .line 34
    const/4 p3, 0x1

    .line 35
    iput-boolean p3, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    .line 36
    .line 37
    new-instance p4, Landroid/graphics/Matrix;

    .line 38
    .line 39
    invoke-direct {p4}, Landroid/graphics/Matrix;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p4, p0, Lcom/zykj/sketch/core/GraphControl;->cameraMatrix:Landroid/graphics/Matrix;

    .line 43
    .line 44
    new-instance p4, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;

    .line 45
    .line 46
    invoke-direct {p4, p0}, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 47
    .line 48
    .line 49
    iput-object p4, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 50
    .line 51
    sget-object p4, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 52
    .line 53
    iput-object p4, p0, Lcom/zykj/sketch/core/GraphControl;->currentMode:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 54
    .line 55
    const/4 p4, -0x1

    .line 56
    iput p4, p0, Lcom/zykj/sketch/core/GraphControl;->backgroundColor:I

    .line 57
    .line 58
    invoke-direct {p0}, Lcom/zykj/sketch/core/GraphControl;->initGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    iput-object p4, p0, Lcom/zykj/sketch/core/GraphControl;->config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget p4, Lcom/zykj/sketch/R$drawable;->mark_delete:I

    .line 69
    .line 70
    invoke-static {p1, p4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p4, Lcom/zykj/sketch/core/graph/Graph;->Companion:Lcom/zykj/sketch/core/graph/Graph$Companion;

    .line 75
    .line 76
    invoke-virtual {p4}, Lcom/zykj/sketch/core/graph/Graph$Companion;->getCornerSize()Landroid/graphics/PointF;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 81
    .line 82
    float-to-int v0, v0

    .line 83
    invoke-virtual {p4}, Lcom/zykj/sketch/core/graph/Graph$Companion;->getCornerSize()Landroid/graphics/PointF;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    iget p4, p4, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    float-to-int p4, p4

    .line 90
    invoke-static {p1, v0, p4, p3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p3, "createScaledBitmap(\n    \u2026y.toInt(), true\n        )"

    .line 95
    .line 96
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 102
    .line 103
    invoke-interface {p2, p1}, Lcom/zykj/sketch/core/listener/RealDraw;->drawGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method private final handleDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    instance-of v0, p2, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/ImageGraph;->getFileName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1, v0}, Lcom/zykj/sketch/core/listener/ImageDeleteListener;->onDeleteImagePath(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of v0, p2, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->getFileName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1, v0}, Lcom/zykj/sketch/core/listener/ImageDeleteListener;->onDeleteImagePath(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/zykj/sketch/core/graph/Graph;

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, Lcom/zykj/sketch/core/GraphControl;->handleDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;Lcom/zykj/sketch/core/graph/Graph;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    return-void
.end method

.method private final initGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, -0xffff01

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->setColor(I)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x40a00000    # 5.0f

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->setWidth(F)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->imageDeleteListener:Lcom/zykj/sketch/core/listener/ImageDeleteListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/GraphControl;->handleDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;Lcom/zykj/sketch/core/graph/Graph;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->clear()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->resetStatus()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public clearTempPaint()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/ImitateDraw;->clearGraph()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public findGraph(FFF)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/sketch/core/graph/Graph;->findGraph(FFF)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public findSelectGraph()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->findSelectGraph()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public forceRender()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/RealDraw;->drawGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/GraphControl;->backgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBaseAudioPath()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "res"

    .line 20
    .line 21
    const-string v3, "audio"

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v1, v3}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final getBaseImagePath()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "res"

    .line 20
    .line 21
    invoke-static {v0, v1, v2, v1}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final getBasePPTPath()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "res"

    .line 20
    .line 21
    const-string v3, "ppt"

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v1, v3}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final getBasePath()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public getCameraMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->cameraMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDeleteBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->drawArea:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphMatrixListener()Lcom/zykj/sketch/core/listener/GraphMatrixListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->graphMatrixListener:Lcom/zykj/sketch/core/listener/GraphMatrixListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageDeleteListener()Lcom/zykj/sketch/core/listener/ImageDeleteListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->imageDeleteListener:Lcom/zykj/sketch/core/listener/ImageDeleteListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->currentMode:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootGraph()Lcom/zykj/sketch/core/graph/Graph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/GraphControl;->scale:F

    .line 2
    .line 3
    return v0
.end method

.method public getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRender(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    return-void
.end method

.method public isRender()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    return v0
.end method

.method public isTouch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/GraphControl;->isTouch:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public render()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/RealDraw;->drawGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    :cond_0
    return-void
.end method

.method public render(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    iget-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/ImitateDraw;->clearGraph()V

    return-void
.end method

.method public renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
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
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->cameraMatrix:Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Lcom/zykj/sketch/core/listener/ImitateDraw;->graphMatrix(Landroid/graphics/Matrix;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 40
    .line 41
    invoke-interface {v0, p1, p2}, Lcom/zykj/sketch/core/listener/ImitateDraw;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public renderTempThumbnail(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/ImitateDraw;->drawThumbnail(Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/ImitateDraw;->clearGraph()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/sketch/core/GraphControl;->initGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lcom/zykj/sketch/core/GraphControl;->backgroundColor:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->drawArea:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Lcom/zykj/sketch/core/listener/RealDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 29
    .line 30
    iget v2, p0, Lcom/zykj/sketch/core/GraphControl;->backgroundColor:I

    .line 31
    .line 32
    invoke-interface {v1, v2}, Lcom/zykj/sketch/core/listener/RealDraw;->setDrawBackground(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Lcom/zykj/sketch/core/listener/ImitateDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->render()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public resetGraph()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/core/GraphControl;->initGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 6
    .line 7
    return-void
.end method

.method public resetStatus()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/GraphControl;->isRender:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/ImitateDraw;->clearGraph()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->render()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/GraphControl;->backgroundColor:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/RealDraw;->setDrawBackground(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setCameraMatrix(IIII)V
    .locals 3

    int-to-float v0, p1

    int-to-float v1, p3

    div-float/2addr v0, v1

    int-to-float v1, p2

    int-to-float v2, p4

    div-float/2addr v1, v2

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    move v0, v1

    .line 1
    :cond_0
    iput v0, p0, Lcom/zykj/sketch/core/GraphControl;->scale:F

    .line 2
    div-int/lit8 p3, p3, 0x2

    .line 3
    div-int/lit8 p4, p4, 0x2

    .line 4
    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, p3

    .line 5
    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p2, p4

    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    iget v1, p0, Lcom/zykj/sketch/core/GraphControl;->scale:F

    int-to-float p3, p3

    int-to-float p4, p4

    invoke-virtual {v0, v1, v1, p3, p4}, Landroid/graphics/Matrix;->setScale(FFFF)V

    int-to-float p1, p1

    int-to-float p2, p2

    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 9
    iget-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->cameraMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public setCameraMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "matrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->cameraMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V
    .locals 6
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->drawArea:Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/ImitateDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/RealDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawTempView:Lcom/zykj/sketch/core/listener/ImitateDraw;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/ImitateDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/sketch/core/GraphControl;->mDrawView:Lcom/zykj/sketch/core/listener/RealDraw;

    .line 61
    .line 62
    new-instance v1, Landroid/graphics/RectF;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-direct {v1, v2, v3, v4, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/RealDraw;->setLimitDrawArea(Landroid/graphics/RectF;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void
.end method

.method public setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
    .locals 0
    .param p1    # Lcom/zykj/sketch/core/listener/GraphMatrixListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->graphMatrixListener:Lcom/zykj/sketch/core/listener/GraphMatrixListener;

    .line 2
    .line 3
    return-void
.end method

.method public setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
    .locals 0
    .param p1    # Lcom/zykj/sketch/core/listener/ImageDeleteListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->imageDeleteListener:Lcom/zykj/sketch/core/listener/ImageDeleteListener;

    .line 2
    .line 3
    return-void
.end method

.method public setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->currentMode:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 7
    .line 8
    return-void
.end method

.method public setRecordConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->config:Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 7
    .line 8
    return-void
.end method

.method public setRootGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/GraphControl;->rootGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 7
    .line 8
    return-void
.end method

.method public setTouch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/GraphControl;->isTouch:Z

    .line 2
    .line 3
    return-void
.end method
