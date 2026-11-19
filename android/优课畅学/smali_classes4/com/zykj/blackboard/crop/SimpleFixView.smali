.class public final Lcom/zykj/blackboard/crop/SimpleFixView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/canvas/view/FixLayer;


# instance fields
.field private final height:I

.field private mBackgroundColor:I

.field private mBitmap:Landroid/graphics/Bitmap;

.field private mCanvas:Landroid/graphics/Canvas;

.field private final paint:Landroid/graphics/Paint;

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->width:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->height:I

    .line 7
    .line 8
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 9
    .line 10
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "createBitmap(width, heig\u2026 Bitmap.Config.ARGB_8888)"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mBitmap:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/Canvas;

    .line 22
    .line 23
    iget-object p2, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mBitmap:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-direct {p1, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mCanvas:Landroid/graphics/Canvas;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 36
    .line 37
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 38
    .line 39
    invoke-direct {p2, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->paint:Landroid/graphics/Paint;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->paint:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v0, p1, v1, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public rect()Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->width:I

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->height:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public refresh()V
    .locals 0

    return-void
.end method

.method public reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mCanvas:Landroid/graphics/Canvas;

    .line 10
    .line 11
    iget v1, p0, Lcom/zykj/blackboard/crop/SimpleFixView;->mBackgroundColor:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
