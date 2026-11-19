# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/sketch/core/graph/ImageGraph;
.super Lcom/zykj/sketch/core/graph/ViewGraph;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/graph/ImageGraph$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000cJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\nJ\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J,\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\u0010H\u0016J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nJ\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "Lcom/zykj/sketch/core/graph/ViewGraph;",
        "actionControl",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "width",
        "",
        "height",
        "viewWidth",
        "viewHeight",
        "fileName",
        "",
        "positionFlag",
        "(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "checkOldData",
        "",
        "getFileName",
        "getSnapshot",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "getTranslateCenterMatrix",
        "Landroid/graphics/Matrix;",
        "graphType",
        "Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "onMeasure",
        "refreshBitmap",
        "path",
        "reloadBitmap",
        "file",
        "Ljava/io/File;",
        "render",
        "canvas",
        "Landroid/graphics/Canvas;",
        "Companion",
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


# static fields
.field public static final BOTTOM_CENTER:I = 0x8

.field public static final BOTTOM_LEFT:I = 0x7

.field public static final BOTTOM_RIGHT:I = 0x9

.field public static final CENTER:I = 0x0

.field public static final CENTER_LEFT:I = 0x4

.field public static final CENTER_RIGHT:I = 0x6

.field public static final Companion:Lcom/zykj/sketch/core/graph/ImageGraph$Companion;

.field public static final MODE_ADAPTER:I = 0x18

.field public static final MODE_ADAPTER_8:I = 0x19

.field public static final MODE_MAX_HEIGHT:I = 0x15

.field public static final MODE_MAX_VALUE:I = 0x16

.field public static final MODE_MAX_WIDTH:I = 0x14

.field public static final MODE_MIN_VALUE:I = 0x17

.field public static final TOP_CENTER:I = 0x2

.field public static final TOP_LEFT:I = 0x1

.field public static final TOP_RIGHT:I = 0x3


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private fileName:Ljava/lang/String;

.field private height:I

.field private final positionFlag:I

.field private viewHeight:I

.field private viewWidth:I

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/graph/ImageGraph$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/graph/ImageGraph$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/sketch/core/graph/ImageGraph;->Companion:Lcom/zykj/sketch/core/graph/ImageGraph$Companion;

    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V
    .locals 1

    const-string v0, "actionControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/ViewGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 3
    iput p2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->width:I

    .line 4
    iput p3, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->height:I

    .line 5
    iput p4, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewWidth:I

    .line 6
    iput p5, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewHeight:I

    .line 7
    iput-object p6, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->positionFlag:I

    .line 9
    :try_start_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    move-result-object p2

    invoke-interface {p2}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "res"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 11
    sget-object p3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object p3, p2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 12
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {v1 .. v8}, Lcom/zykj/sketch/core/graph/ImageGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V

    return-void
.end method

.method private final getTranslateCenterMatrix(IIII)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    int-to-float p3, p3

    .line 2
    const/high16 v0, 0x40000000    # 2.0f

    .line 3
    .line 4
    div-float v1, p3, v0

    .line 5
    .line 6
    int-to-float p4, p4

    .line 7
    div-float v2, p4, v0

    .line 8
    .line 9
    iget v3, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->positionFlag:I

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    goto :goto_2

    .line 15
    :pswitch_1
    int-to-float v1, p1

    .line 16
    div-float/2addr v1, v0

    .line 17
    sub-float v1, p3, v1

    .line 18
    .line 19
    :goto_0
    :pswitch_2
    int-to-float p3, p2

    .line 20
    div-float/2addr p3, v0

    .line 21
    sub-float v2, p4, p3

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :pswitch_3
    int-to-float p3, p1

    .line 25
    div-float v1, p3, v0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_4
    int-to-float p4, p1

    .line 29
    div-float/2addr p4, v0

    .line 30
    sub-float v1, p3, p4

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :pswitch_5
    int-to-float p3, p1

    .line 34
    div-float v1, p3, v0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :pswitch_6
    int-to-float p4, p1

    .line 38
    div-float/2addr p4, v0

    .line 39
    sub-float v1, p3, p4

    .line 40
    .line 41
    :goto_1
    :pswitch_7
    int-to-float p3, p2

    .line 42
    div-float v2, p3, v0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :pswitch_8
    int-to-float p3, p1

    .line 46
    div-float v1, p3, v0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :goto_2
    int-to-float p1, p1

    .line 50
    div-float/2addr p1, v0

    .line 51
    sub-float/2addr v1, p1

    .line 52
    int-to-float p1, p2

    .line 53
    div-float/2addr p1, v0

    .line 54
    sub-float/2addr v2, p1

    .line 55
    new-instance p1, Landroid/graphics/Matrix;

    .line 56
    .line 57
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic getTranslateCenterMatrix$default(Lcom/zykj/sketch/core/graph/ImageGraph;IIIIILjava/lang/Object;)Landroid/graphics/Matrix;
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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/core/graph/ImageGraph;->getTranslateCenterMatrix(IIII)Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method private final reloadBitmap(Ljava/io/File;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 17
    .line 18
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 24
    .line 25
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    int-to-float v2, v2

    .line 36
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v3, v3

    .line 41
    int-to-float v4, v0

    .line 42
    div-float/2addr v3, v4

    .line 43
    div-float/2addr v2, v3

    .line 44
    float-to-int v2, v2

    .line 45
    invoke-static {p1, v0, v2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/ImageGraph;->onMeasure()V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final checkOldData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getOutRect()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    cmpg-float v1, v1, v2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->width:I

    .line 42
    .line 43
    int-to-float v1, v1

    .line 44
    const/high16 v2, 0x3f800000    # 1.0f

    .line 45
    .line 46
    mul-float/2addr v1, v2

    .line 47
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v0, v0

    .line 52
    div-float/2addr v1, v0

    .line 53
    new-instance v0, Landroid/graphics/Matrix;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 59
    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Matrix;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 3

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
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setFileName(Ljava/lang/String;)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->width:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->height:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewWidth:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewHeight:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 32
    .line 33
    .line 34
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->positionFlag:I

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setPositionFlag(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$File;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "builder.build()"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->IMAGE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public onMeasure()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-float v3, v3

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Landroid/graphics/PointF;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/graph/Graph;->setChildExtendMatrix(Landroid/graphics/PointF;)V

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->width:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    mul-float/2addr v1, v2

    .line 49
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    int-to-float v0, v0

    .line 54
    div-float/2addr v1, v0

    .line 55
    new-instance v0, Landroid/graphics/Matrix;

    .line 56
    .line 57
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v0, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->width:I

    .line 72
    .line 73
    iget v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->height:I

    .line 74
    .line 75
    iget v3, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewWidth:I

    .line 76
    .line 77
    iget v4, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->viewHeight:I

    .line 78
    .line 79
    invoke-direct {p0, v1, v2, v3, v4}, Lcom/zykj/sketch/core/graph/ImageGraph;->getTranslateCenterMatrix(IIII)Landroid/graphics/Matrix;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void
.end method

.method public final refreshBitmap(Landroid/graphics/Bitmap;)V
    .locals 5

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "res"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, p1, v1}, Lcom/zykj/sketch/utils/FileUtils$Companion;->saveBitmap2SDCard(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    new-instance p1, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    move-result-object v1

    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/ImageGraph;->reloadBitmap(Ljava/io/File;)V

    return-void
.end method

.method public final refreshBitmap(Ljava/lang/String;)V
    .locals 4

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    move-result-object v2

    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "res"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    sget-object v1, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    invoke-virtual {v1, v0}, Lcom/zykj/sketch/utils/FileUtils$Companion;->Md5HashCode(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/utils/FileUtils$Companion;->Md5HashCode(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 11
    invoke-virtual {v1, v3, v0}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFileUsingFileChannels(Ljava/io/File;Ljava/io/File;)V

    .line 12
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/graph/ImageGraph;->reloadBitmap(Ljava/io/File;)V

    return-void

    .line 13
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 15
    sget-object p1, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    invoke-virtual {p1, v1, v0}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFileUsingFileChannels(Ljava/io/File;Ljava/io/File;)V

    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/graph/ImageGraph;->reloadBitmap(Ljava/io/File;)V

    :cond_1
    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public render(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "res"

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->fileName:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 74
    .line 75
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 76
    .line 77
    .line 78
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 79
    .line 80
    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 81
    .line 82
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    .line 84
    invoke-static {p1, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/ImageGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 89
    .line 90
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    monitor-exit v0

    .line 93
    return-void

    .line 94
    :goto_1
    monitor-exit v0

    .line 95
    throw p1

    .line 96
    :cond_1
    return-void
.end method
