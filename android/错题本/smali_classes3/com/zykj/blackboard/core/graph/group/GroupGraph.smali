.class public Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.super Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/graph/group/IChangeField;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/graph/group/GroupGraph$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u0016\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(JE\u0010*\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00086\u00107J\u0017\u00108\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00088\u00107J\u0017\u00109\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u00089\u00101J\u001f\u0010:\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008?\u0010@R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\"\u0010K\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u00104R\u0014\u0010P\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\"\u0010T\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u0010U\u001a\u0004\u0008V\u0010W\"\u0004\u0008X\u00101R\u0014\u0010Y\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010UR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010\\\u00a8\u0006_"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
        "Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;",
        "Lcom/zykj/blackboard/core/graph/group/IChangeField;",
        "",
        "id",
        "Landroid/graphics/RectF;",
        "outRectF",
        "sourceFileName",
        "",
        "sourceId",
        "<init>",
        "(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Matrix;",
        "matrix",
        "Lkotlin/Function1;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "",
        "interceptRendVoid",
        "Ld6/s;",
        "drawChildrenDirectly",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;)V",
        "isComplete",
        "updateGroupBitmap",
        "(ZLandroid/graphics/Matrix;Lr6/c;)Z",
        "updateReusableBitmapRenderRect",
        "(ZLandroid/graphics/Matrix;)Z",
        "getBitmapRenderRect",
        "(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "canDrawBitmap",
        "(Landroid/graphics/Bitmap;)Z",
        "oldM",
        "newM",
        "shouldRebuildBitmapForMatrix",
        "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "isScreenCanvas",
        "onDraw",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V",
        "newRectF",
        "changeOriginalRectF",
        "(Landroid/graphics/RectF;)V",
        "newMatrix",
        "changeRenderMatrix",
        "(Landroid/graphics/Matrix;)V",
        "newUpdate",
        "changeUpdate",
        "(Z)V",
        "graph",
        "addGraph",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "removeGraph",
        "concatMatrix",
        "render",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V",
        "onDestroy",
        "()V",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "copy",
        "()Lcom/zykj/blackboard/core/graph/Graph;",
        "Ljava/lang/String;",
        "getSourceFileName",
        "()Ljava/lang/String;",
        "setSourceFileName",
        "(Ljava/lang/String;)V",
        "Ljava/lang/Integer;",
        "getSourceId",
        "()Ljava/lang/Integer;",
        "setSourceId",
        "(Ljava/lang/Integer;)V",
        "needUpdate",
        "Z",
        "getNeedUpdate",
        "()Z",
        "setNeedUpdate",
        "bitmapRenderRect",
        "Landroid/graphics/RectF;",
        "groupBitmap",
        "Landroid/graphics/Bitmap;",
        "tempMatrix",
        "Landroid/graphics/Matrix;",
        "getTempMatrix",
        "()Landroid/graphics/Matrix;",
        "setTempMatrix",
        "prevMatrix",
        "",
        "screenWidth",
        "F",
        "screenHeight",
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
.field private static final BITMAP_BUFFER:F = 200.0f

.field private static final BITMAP_REBUILD_TRANSLATION_THRESHOLD:F = 100.0f

.field public static final Companion:Lcom/zykj/blackboard/core/graph/group/GroupGraph$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_BITMAP_SIZE:I = 0x1000

.field private static final MAX_DRAW_BITMAP_BYTES:I = 0x6400000


# instance fields
.field private final bitmapRenderRect:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private groupBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private needUpdate:Z

.field private final prevMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private screenHeight:F

.field private screenWidth:F

.field private sourceFileName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sourceId:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->Companion:Lcom/zykj/blackboard/core/graph/group/GroupGraph$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceFileName:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceId:Ljava/lang/Integer;

    .line 5
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->tempMatrix:Landroid/graphics/Matrix;

    .line 7
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->prevMatrix:Landroid/graphics/Matrix;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic access$setGroupBitmap$p(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method private final canDrawBitmap(Landroid/graphics/Bitmap;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    const-wide/32 v2, 0x6400000

    .line 7
    .line 8
    .line 9
    cmp-long p1, v0, v2

    .line 10
    .line 11
    if-gez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private final drawChildrenDirectly(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 6
    .line 7
    filled-new-array {v0}, [Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Lcom/zykj/blackboard/core/graph/group/GroupGraph$drawChildrenDirectly$1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$drawChildrenDirectly$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 42
    .line 43
    const-string v1, "it"

    .line 44
    .line 45
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/16 v8, 0x18

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    move-object v3, p1

    .line 54
    move-object v4, p2

    .line 55
    move-object v5, p3

    .line 56
    invoke-static/range {v2 .. v9}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
.end method

.method private final getBitmapRenderRect(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lcom/zykj/blackboard/core/graph/Graph;->getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenWidth:F

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    cmpl-float p1, p1, v0

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenHeight:F

    .line 15
    .line 16
    cmpl-float p1, p1, v0

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenWidth:F

    .line 23
    .line 24
    const/high16 v1, 0x43480000    # 200.0f

    .line 25
    .line 26
    add-float/2addr v0, v1

    .line 27
    iget v2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenHeight:F

    .line 28
    .line 29
    add-float/2addr v2, v1

    .line 30
    const/high16 v1, -0x3cb80000    # -200.0f

    .line 31
    .line 32
    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return-object p1

    .line 43
    :cond_0
    return-object p2
.end method

.method private final shouldRebuildBitmapForMatrix(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x9

    .line 10
    .line 11
    new-array v2, v0, [F

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 14
    .line 15
    .line 16
    new-array p1, v0, [F

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 19
    .line 20
    .line 21
    aget p2, v2, v1

    .line 22
    .line 23
    aget v0, p1, v1

    .line 24
    .line 25
    cmpg-float p2, p2, v0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    aget v3, v2, p2

    .line 32
    .line 33
    aget p2, p1, p2

    .line 34
    .line 35
    cmpg-float p2, v3, p2

    .line 36
    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    const/4 p2, 0x2

    .line 40
    aget v3, v2, p2

    .line 41
    .line 42
    aget p2, p1, p2

    .line 43
    .line 44
    sub-float/2addr v3, p2

    .line 45
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v3, 0x5

    .line 50
    aget v2, v2, v3

    .line 51
    .line 52
    aget p1, p1, v3

    .line 53
    .line 54
    sub-float/2addr v2, p1

    .line 55
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/high16 v2, 0x42c80000    # 100.0f

    .line 60
    .line 61
    cmpl-float p2, p2, v2

    .line 62
    .line 63
    if-gtz p2, :cond_2

    .line 64
    .line 65
    cmpl-float p1, p1, v2

    .line 66
    .line 67
    if-lez p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return v1

    .line 71
    :cond_2
    :goto_0
    return v0
.end method

.method private final updateGroupBitmap(ZLandroid/graphics/Matrix;Lr6/c;)Z
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseKtx"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/graphics/Matrix;",
            "Lr6/c;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getBitmapRenderRect(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 9
    .line 10
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$nextRenderRect$1$1;

    .line 17
    .line 18
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$nextRenderRect$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    float-to-int p1, p1

    .line 37
    const/4 v1, 0x1

    .line 38
    add-int/2addr p1, v1

    .line 39
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    float-to-int v2, v2

    .line 46
    add-int/2addr v2, v1

    .line 47
    int-to-long v3, p1

    .line 48
    int-to-long v5, v2

    .line 49
    mul-long/2addr v3, v5

    .line 50
    const-wide/16 v5, 0x4

    .line 51
    .line 52
    mul-long/2addr v3, v5

    .line 53
    if-lez p1, :cond_5

    .line 54
    .line 55
    if-lez v2, :cond_5

    .line 56
    .line 57
    const/16 v5, 0x1000

    .line 58
    .line 59
    if-gt p1, v5, :cond_5

    .line 60
    .line 61
    if-le v2, v5, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const-wide/32 v5, 0x6400000

    .line 65
    .line 66
    .line 67
    cmp-long v3, v3, v5

    .line 68
    .line 69
    if-ltz v3, :cond_2

    .line 70
    .line 71
    sget-object p1, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$2;

    .line 80
    .line 81
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$2;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2, p3}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 85
    .line 86
    .line 87
    return v0

    .line 88
    :cond_2
    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 89
    .line 90
    invoke-static {p1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    const/4 p1, 0x0

    .line 96
    :goto_0
    if-nez p1, :cond_3

    .line 97
    .line 98
    sget-object p1, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 99
    .line 100
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$3;

    .line 107
    .line 108
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$3;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, p3}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 112
    .line 113
    .line 114
    return v0

    .line 115
    :cond_3
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    new-instance v3, Landroid/graphics/Canvas;

    .line 118
    .line 119
    invoke-direct {v3, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 123
    .line 124
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 125
    .line 126
    neg-float v0, v0

    .line 127
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 128
    .line 129
    neg-float p1, p1

    .line 130
    invoke-virtual {v3, v0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v3, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    move-object v2, v0

    .line 155
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 156
    .line 157
    const-string v0, "it"

    .line 158
    .line 159
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/16 v8, 0x18

    .line 163
    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v4, p2

    .line 168
    move-object v5, p3

    .line 169
    invoke-static/range {v2 .. v9}, Lcom/zykj/blackboard/core/graph/IDraw$DefaultImpls;->onDraw$default(Lcom/zykj/blackboard/core/graph/IDraw;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    return v1

    .line 174
    :cond_5
    :goto_2
    sget-object p1, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 175
    .line 176
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 177
    .line 178
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$1;

    .line 183
    .line 184
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p2, p3}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 188
    .line 189
    .line 190
    return v0
.end method

.method private final updateReusableBitmapRenderRect(ZLandroid/graphics/Matrix;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getBitmapRenderRect(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    float-to-int p2, p2

    .line 25
    const/4 v2, 0x1

    .line 26
    add-int/2addr p2, v2

    .line 27
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    float-to-int v3, v3

    .line 32
    add-int/2addr v3, v2

    .line 33
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne p2, v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eq v3, p2, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_3
    :goto_0
    return v1
.end method


# virtual methods
.method public addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/graph/Graph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 11
    .line 12
    return-void
.end method

.method public changeOriginalRectF(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "newRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->updateRenderRectF()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 18
    .line 19
    return-void
.end method

.method public changeRenderMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "newMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->updateRenderRectF()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 18
    .line 19
    return-void
.end method

.method public changeUpdate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 2
    .line 3
    return-void
.end method

.method public concatMatrix(Landroid/graphics/Matrix;)V
    .locals 1
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/graph/Graph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 11
    .line 12
    return-void
.end method

.method public copy()Lcom/zykj/blackboard/core/graph/Graph;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    const/16 v5, 0xc

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/e;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->copy()Lcom/zykj/blackboard/core/graph/Graph;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public final getNeedUpdate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSourceFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSourceId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTempMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->tempMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GROUP_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/graph/Graph;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/blackboard/utils/BitmapUtil;->INSTANCE:Lcom/zykj/blackboard/utils/BitmapUtil;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    filled-new-array {v1}, [Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/BitmapUtil;->recycle([Landroid/graphics/Bitmap;Lr6/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Lr6/c;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->prevMatrix:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {p0, v0, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->shouldRebuildBitmapForMatrix(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x1

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    if-eqz p5, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-direct {p0, p5, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->updateReusableBitmapRenderRect(ZLandroid/graphics/Matrix;)Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    if-nez p4, :cond_7

    .line 62
    .line 63
    invoke-direct {p0, p5, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->updateGroupBitmap(ZLandroid/graphics/Matrix;Lr6/c;)Z

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-eqz p4, :cond_7

    .line 68
    .line 69
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->prevMatrix:Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_0
    if-eqz p4, :cond_5

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    int-to-float p4, p4

    .line 82
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenWidth:F

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    int-to-float p4, p4

    .line 89
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->screenHeight:F

    .line 90
    .line 91
    :cond_5
    invoke-direct {p0, p5, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->updateGroupBitmap(ZLandroid/graphics/Matrix;Lr6/c;)Z

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    if-eqz p4, :cond_6

    .line 96
    .line 97
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->prevMatrix:Landroid/graphics/Matrix;

    .line 98
    .line 99
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    const/4 p4, 0x0

    .line 103
    iput-boolean p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 104
    .line 105
    :cond_7
    :goto_1
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->groupBitmap:Landroid/graphics/Bitmap;

    .line 106
    .line 107
    if-eqz p4, :cond_8

    .line 108
    .line 109
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 110
    .line 111
    .line 112
    move-result p5

    .line 113
    if-nez p5, :cond_8

    .line 114
    .line 115
    invoke-direct {p0, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->canDrawBitmap(Landroid/graphics/Bitmap;)Z

    .line 116
    .line 117
    .line 118
    move-result p5

    .line 119
    if-eqz p5, :cond_8

    .line 120
    .line 121
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->bitmapRenderRect:Landroid/graphics/RectF;

    .line 122
    .line 123
    iget p3, p2, Landroid/graphics/RectF;->left:F

    .line 124
    .line 125
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    const/4 p5, 0x0

    .line 128
    invoke-virtual {p1, p4, p3, p2, p5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_8
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->drawChildrenDirectly(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public removeGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
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
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/graph/Graph;->removeGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 11
    .line 12
    return-void
.end method

.method public render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "matrix"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setNeedUpdate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->needUpdate:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSourceFileName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSourceId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->sourceId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setTempMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->tempMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method
