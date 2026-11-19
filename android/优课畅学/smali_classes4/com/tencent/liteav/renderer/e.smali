.class public Lcom/tencent/liteav/renderer/e;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/renderer/e$a;
    }
.end annotation


# static fields
.field private static final a:[F


# instance fields
.field private A:J

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Lcom/tencent/liteav/renderer/e$a;

.field private b:Landroid/graphics/SurfaceTexture;

.field private c:I

.field protected d:Landroid/view/TextureView;

.field protected e:Lcom/tencent/liteav/renderer/d;

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:I

.field protected j:I

.field protected k:I

.field protected volatile l:I

.field protected m:I

.field protected n:I

.field protected o:Lcom/tencent/liteav/renderer/f;

.field p:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private q:Lcom/tencent/liteav/basic/c/d;

.field private r:Lcom/tencent/liteav/renderer/h;

.field private s:Landroid/view/Surface;

.field private t:I

.field private u:I

.field private v:[I

.field private w:I

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/tencent/liteav/renderer/e;->a:[F

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/module/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->f:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->g:I

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 14
    .line 15
    const/16 v1, 0x320

    .line 16
    .line 17
    iput v1, p0, Lcom/tencent/liteav/renderer/e;->c:I

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->t:I

    .line 20
    .line 21
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    iput v1, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 25
    .line 26
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->m:I

    .line 27
    .line 28
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->n:I

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    new-array v1, v1, [I

    .line 32
    .line 33
    iput-object v1, p0, Lcom/tencent/liteav/renderer/e;->v:[I

    .line 34
    .line 35
    const/16 v1, 0x1f4

    .line 36
    .line 37
    iput v1, p0, Lcom/tencent/liteav/renderer/e;->w:I

    .line 38
    .line 39
    const-wide/16 v1, 0x0

    .line 40
    .line 41
    iput-wide v1, p0, Lcom/tencent/liteav/renderer/e;->x:J

    .line 42
    .line 43
    iput-wide v1, p0, Lcom/tencent/liteav/renderer/e;->y:J

    .line 44
    .line 45
    iput-wide v1, p0, Lcom/tencent/liteav/renderer/e;->z:J

    .line 46
    .line 47
    iput-wide v1, p0, Lcom/tencent/liteav/renderer/e;->A:J

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->C:Z

    .line 52
    .line 53
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->E:Z

    .line 54
    .line 55
    new-instance v1, Lcom/tencent/liteav/renderer/e$a;

    .line 56
    .line 57
    invoke-direct {v1}, Lcom/tencent/liteav/renderer/e$a;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 61
    .line 62
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->D:Z

    .line 63
    .line 64
    return-void
.end method

.method private a(J)J
    .locals 3

    .line 123
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    sub-long/2addr v0, p1

    return-wide v0
.end method

.method private a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    int-to-float p3, p3

    int-to-float p2, p2

    div-float v0, p3, p2

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p2, p3

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float p2, p3, p2

    .line 8
    :goto_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    invoke-virtual {v5, p2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 10
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    return-object p1
.end method

.method private a(Landroid/graphics/Matrix;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    .line 12
    iget v3, v0, Lcom/tencent/liteav/renderer/e;->t:I

    iget v4, v0, Lcom/tencent/liteav/renderer/e;->k:I

    add-int/2addr v3, v4

    rem-int/lit16 v3, v3, 0x168

    rsub-int v3, v3, 0x168

    .line 13
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    const/4 v10, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v9, p1

    move-object/from16 v4, p2

    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 14
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->recycle()V

    if-eqz v3, :cond_0

    .line 15
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v3, v3

    .line 16
    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 17
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v17}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 18
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v11

    .line 19
    :goto_0
    iget v3, v0, Lcom/tencent/liteav/renderer/e;->u:I

    if-nez v3, :cond_6

    .line 20
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 21
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    const/4 v3, 0x0

    const/4 v5, 0x1

    if-ge v1, v2, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    if-ge v7, v8, :cond_2

    move v3, v5

    :cond_2
    if-eq v6, v3, :cond_4

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz v6, :cond_3

    int-to-float v5, v8

    int-to-float v1, v1

    mul-float/2addr v5, v1

    int-to-float v2, v2

    div-float/2addr v5, v2

    int-to-float v2, v7

    sub-float/2addr v2, v5

    mul-float/2addr v2, v3

    .line 22
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    div-float/2addr v1, v5

    .line 23
    invoke-virtual {v9, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    float-to-int v1, v2

    float-to-int v7, v5

    const/4 v10, 0x0

    const/4 v6, 0x0

    move v5, v1

    .line 24
    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 25
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    return-object v1

    :cond_3
    int-to-float v5, v7

    int-to-float v1, v1

    div-float/2addr v5, v1

    int-to-float v1, v2

    mul-float/2addr v5, v1

    int-to-float v2, v8

    sub-float/2addr v2, v5

    mul-float/2addr v2, v3

    .line 26
    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    div-float/2addr v1, v5

    .line 27
    invoke-virtual {v13, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    float-to-int v6, v2

    float-to-int v8, v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    .line 28
    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 29
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    const/4 v14, 0x0

    const/4 v9, 0x0

    invoke-static/range {v8 .. v14}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 30
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    return-object v1

    .line 31
    :cond_4
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-eq v1, v3, :cond_5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-eq v2, v3, :cond_5

    .line 32
    invoke-direct {v0, v4, v1, v2}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1

    :cond_5
    return-object v4

    .line 33
    :cond_6
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-eq v1, v3, :cond_7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-eq v2, v3, :cond_7

    .line 34
    invoke-direct {v0, v4, v1, v2}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1

    :cond_7
    return-object v4
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/e;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/Matrix;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/e;)Lcom/tencent/liteav/basic/c/d;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    return-object p0
.end method

.method private a(III[FZ)[I
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->a()Z

    move-result v0

    if-eq v0, p5, :cond_0

    .line 105
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->c()V

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    if-nez v0, :cond_1

    .line 108
    new-instance v0, Lcom/tencent/liteav/renderer/h;

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/liteav/renderer/h;-><init>(Ljava/lang/Boolean;)V

    iput-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    .line 109
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->b()V

    :cond_1
    if-eqz p4, :cond_2

    .line 110
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {v0, p4}, Lcom/tencent/liteav/renderer/h;->a([F)V

    goto :goto_0

    .line 111
    :cond_2
    iget-object p4, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    sget-object v0, Lcom/tencent/liteav/renderer/e;->a:[F

    invoke-virtual {p4, v0}, Lcom/tencent/liteav/renderer/h;->a([F)V

    .line 112
    :goto_0
    iget p4, p0, Lcom/tencent/liteav/renderer/e;->m:I

    .line 113
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->n:I

    .line 114
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->u:I

    if-nez v1, :cond_3

    .line 115
    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    sget v2, Lcom/tencent/liteav/renderer/h;->a:I

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/renderer/h;->a(I)V

    goto :goto_1

    .line 116
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    sget v2, Lcom/tencent/liteav/renderer/h;->b:I

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/renderer/h;->a(I)V

    .line 117
    :goto_1
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->t:I

    iget v2, p0, Lcom/tencent/liteav/renderer/e;->k:I

    add-int v3, v1, v2

    rem-int/lit16 v3, v3, 0x168

    if-eqz p5, :cond_5

    const/16 p5, 0x5a

    if-eq v1, p5, :cond_4

    const/16 p5, 0x10e

    if-ne v1, p5, :cond_5

    :cond_4
    add-int/2addr v1, v2

    add-int/lit16 v1, v1, 0xb4

    .line 118
    rem-int/lit16 v3, v1, 0x168

    .line 119
    :cond_5
    iget-object p5, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {p5, v3}, Lcom/tencent/liteav/renderer/h;->b(I)V

    .line 120
    iget-object p5, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {p5, p2, p3}, Lcom/tencent/liteav/renderer/h;->b(II)V

    .line 121
    iget-object p2, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {p2, p4, v0}, Lcom/tencent/liteav/renderer/h;->a(II)V

    .line 122
    iget-object p2, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    invoke-virtual {p2, p1}, Lcom/tencent/liteav/renderer/h;->d(I)I

    move-result p1

    filled-new-array {p1, p4, v0}, [I

    move-result-object p1

    return-object p1
.end method

.method private b()V
    .locals 13

    .line 42
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->D:Z

    const-string v1, "TXCVideoRender"

    const-wide/16 v2, 0x0

    if-nez v0, :cond_0

    .line 43
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 44
    const-string v4, "EVT_USERID"

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v4, "EVT_ID"

    const/16 v5, 0x7d3

    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    const-string v4, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v6

    invoke-virtual {v0, v4, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 47
    const-string v4, "EVT_MSG"

    const-string v6, "Render the first video frame(IDR)"

    invoke-virtual {v0, v4, v6}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 48
    const-string v4, "EVT_PARAM1"

    iget v6, p0, Lcom/tencent/liteav/renderer/e;->h:I

    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 49
    const-string v4, "EVT_PARAM2"

    iget v6, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 50
    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->p:Ljava/lang/ref/WeakReference;

    invoke-static {v4, v5, v0}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    .line 51
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/16 v5, 0x1771

    invoke-virtual {p0, v5, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 52
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    iget v4, p0, Lcom/tencent/liteav/renderer/e;->h:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x177f

    invoke-virtual {p0, v5, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 53
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    iget v4, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x1780

    invoke-virtual {p0, v5, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "trtc_render render first frame "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->D:Z

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "streamType: 2-big, 3-small, 7-sub"

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v6, v0, v4, v5}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 57
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v0

    const v4, 0x9c56

    iget v5, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v0, v4, v2, v3, v5}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->c:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->c:J

    .line 59
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->n()V

    .line 60
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->d:J

    cmp-long v8, v4, v2

    if-eqz v8, :cond_4

    .line 61
    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/renderer/e;->a(J)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    .line 62
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    iget v8, p0, Lcom/tencent/liteav/renderer/e;->w:I

    int-to-long v8, v8

    cmp-long v4, v4, v8

    const-string v5, " block time:"

    const-string v8, "render frame count:"

    if-lez v4, :cond_2

    .line 63
    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->e:J

    add-long/2addr v9, v6

    iput-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->e:J

    .line 64
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/16 v9, 0x1773

    invoke-virtual {p0, v9, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    iget-wide v11, v0, Lcom/tencent/liteav/renderer/e$a;->h:J

    cmp-long v4, v9, v11

    if-lez v4, :cond_1

    .line 66
    iput-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->h:J

    .line 67
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/16 v9, 0x1775

    invoke-virtual {p0, v9, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->g:J

    iget-wide v11, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    add-long/2addr v9, v11

    iput-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->g:J

    .line 69
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/16 v9, 0x1776

    invoke-virtual {p0, v9, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v4, Lcom/tencent/liteav/renderer/e$a;->c:J

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v4, Lcom/tencent/liteav/renderer/e$a;->i:J

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "> 500"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->c:I

    int-to-long v11, v0

    cmp-long v0, v9, v11

    if-lez v0, :cond_3

    .line 72
    iget-wide v11, p0, Lcom/tencent/liteav/renderer/e;->x:J

    add-long/2addr v11, v6

    iput-wide v11, p0, Lcom/tencent/liteav/renderer/e;->x:J

    .line 73
    iget-wide v11, p0, Lcom/tencent/liteav/renderer/e;->z:J

    add-long/2addr v11, v9

    iput-wide v11, p0, Lcom/tencent/liteav/renderer/e;->z:J

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v4, Lcom/tencent/liteav/renderer/e$a;->c:J

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v4, Lcom/tencent/liteav/renderer/e$a;->i:J

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "> "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/tencent/liteav/renderer/e;->c:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Current video playback stuck for "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v10, v10, Lcom/tencent/liteav/renderer/e$a;->i:J

    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, "ms"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x839

    invoke-static {v0, v4, v10, v9}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;ILjava/lang/String;)V

    .line 76
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    const-wide/16 v11, 0x3e8

    cmp-long v4, v9, v11

    if-lez v4, :cond_4

    .line 77
    iget-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->f:J

    add-long/2addr v9, v6

    iput-wide v9, v0, Lcom/tencent/liteav/renderer/e$a;->f:J

    .line 78
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/16 v6, 0x1774

    invoke-virtual {p0, v6, v0, v4}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v6, v4, Lcom/tencent/liteav/renderer/e$a;->c:J

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v4, v4, Lcom/tencent/liteav/renderer/e$a;->i:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "> 1000"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_4
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    .line 81
    iget-wide v4, p0, Lcom/tencent/liteav/renderer/e;->y:J

    cmp-long v6, v4, v2

    if-nez v6, :cond_5

    .line 82
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/e;->y:J

    goto :goto_0

    :cond_5
    sub-long v4, v0, v4

    const-wide/16 v6, 0x7d0

    cmp-long v4, v4, v6

    if-ltz v4, :cond_7

    .line 83
    iget v4, p0, Lcom/tencent/liteav/renderer/e;->j:I

    iget-wide v5, p0, Lcom/tencent/liteav/renderer/e;->x:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/16 v6, 0x4277

    invoke-virtual {p0, v6, v4, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 84
    iget v4, p0, Lcom/tencent/liteav/renderer/e;->j:I

    iget-wide v5, p0, Lcom/tencent/liteav/renderer/e;->z:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/16 v6, 0x4278

    invoke-virtual {p0, v6, v4, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 85
    iget-wide v4, p0, Lcom/tencent/liteav/renderer/e;->A:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_6

    .line 86
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Lcom/tencent/liteav/renderer/e;->z:J

    long-to-int v5, v5

    int-to-long v5, v5

    iget v7, p0, Lcom/tencent/liteav/renderer/e;->j:I

    const v8, 0x9c45

    invoke-static {v4, v8, v5, v6, v7}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 87
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Lcom/tencent/liteav/renderer/e;->y:J

    sub-long v5, v0, v5

    long-to-int v5, v5

    int-to-long v5, v5

    iget v7, p0, Lcom/tencent/liteav/renderer/e;->j:I

    const v8, 0x9c46

    invoke-static {v4, v8, v5, v6, v7}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 88
    :cond_6
    iput-wide v2, p0, Lcom/tencent/liteav/renderer/e;->x:J

    .line 89
    iput-wide v0, p0, Lcom/tencent/liteav/renderer/e;->y:J

    .line 90
    iput-wide v2, p0, Lcom/tencent/liteav/renderer/e;->z:J

    .line 91
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/tencent/liteav/renderer/e$a;->d:J

    .line 92
    iget-wide v0, p0, Lcom/tencent/liteav/renderer/e;->A:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    .line 93
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget-wide v0, v0, Lcom/tencent/liteav/renderer/e$a;->d:J

    iput-wide v0, p0, Lcom/tencent/liteav/renderer/e;->A:J

    .line 94
    :cond_8
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->i:I

    iput v1, v0, Lcom/tencent/liteav/renderer/e$a;->k:I

    .line 95
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iput v1, v0, Lcom/tencent/liteav/renderer/e$a;->j:I

    return-void
.end method

.method private b(Landroid/view/Surface;)V
    .locals 4

    .line 29
    const-string v0, "TXCVideoRender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "surface-render: set surface "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->s:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    .line 31
    const-string p1, "TXCVideoRender"

    const-string v0, "surface-render: set the same surface, ignore "

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 32
    :cond_0
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->s:Landroid/view/Surface;

    const/4 v0, 0x1

    .line 33
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->l:I

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 34
    const-string v1, "TXCVideoRender"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "surface-render: set surface start render thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/e;->c(Ljava/lang/Object;)V

    return-void

    .line 36
    :cond_1
    monitor-enter p0

    .line 37
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz p1, :cond_2

    .line 38
    const-string p1, "TXCVideoRender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "surface-render: set surface stop render thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {p1}, Lcom/tencent/liteav/basic/c/d;->a()V

    .line 40
    iput-object v0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private b(Landroid/view/TextureView;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    if-nez v1, :cond_1

    if-nez p1, :cond_2

    :cond_1
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 7
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "play:vrender: set video view @old="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",new="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TXCVideoRender"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_9

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    if-nez v1, :cond_4

    .line 9
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/liteav/renderer/e;->b(Landroid/graphics/SurfaceTexture;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 11
    :cond_4
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    if-eqz p1, :cond_9

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_5

    .line 13
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/tencent/liteav/renderer/e;->f:I

    .line 14
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    if-eqz p1, :cond_6

    .line 15
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/tencent/liteav/renderer/e;->g:I

    .line 16
    :cond_6
    new-instance p1, Lcom/tencent/liteav/renderer/d;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-direct {p1, v0}, Lcom/tencent/liteav/renderer/d;-><init>(Landroid/view/TextureView;)V

    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    .line 17
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/renderer/d;->b(II)V

    .line 18
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->f:I

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->g:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/renderer/d;->a(II)V

    .line 19
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->u:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/d;->a(I)V

    .line 20
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->t:I

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->k:I

    add-int/2addr v0, v1

    rem-int/lit16 v0, v0, 0x168

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/renderer/d;->c(I)V

    .line 21
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 22
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    if-eqz p1, :cond_8

    .line 23
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    if-eq p1, v0, :cond_7

    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "play:vrender: setSurfaceTexture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", surfaceTexture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    return-void

    .line 26
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "play:vrender: not setSurfaceTexture old surfaceTexture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", new surfaceTexture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 27
    :cond_8
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 28
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/SurfaceTexture;)V

    :cond_9
    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/renderer/e;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/renderer/e;->v:[I

    return-object p0
.end method


# virtual methods
.method public a()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    return-void
.end method

.method public a(II)V
    .locals 2

    .line 68
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    if-ne v0, p1, :cond_0

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->i:I

    if-eq v1, p2, :cond_2

    :cond_0
    if-ne v0, p1, :cond_1

    .line 69
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->i:I

    if-eq v0, p2, :cond_2

    .line 70
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 71
    iput p2, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 72
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    if-eqz v0, :cond_2

    .line 73
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/renderer/d;->b(II)V

    :cond_2
    return-void
.end method

.method public a(IIIZI)V
    .locals 0

    .line 51
    invoke-virtual {p0, p2, p3}, Lcom/tencent/liteav/renderer/e;->a(II)V

    return-void
.end method

.method public a(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x1

    .line 67
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/e;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public a(Landroid/view/TextureView;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/tencent/liteav/renderer/e;->b(Landroid/view/TextureView;)V

    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 43
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/liteav/renderer/e;->p:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/c/k;)V
    .locals 6

    .line 35
    iget-object v4, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    const/4 v0, 0x0

    if-eqz v4, :cond_1

    .line 36
    :try_start_0
    invoke-virtual {v4}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v1

    goto :goto_0

    :catch_0
    move-object v3, v0

    :goto_0
    if-eqz v3, :cond_0

    .line 37
    invoke-virtual {v4, v0}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v2

    .line 38
    new-instance v0, Lcom/tencent/liteav/renderer/e$1;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/renderer/e$1;-><init>(Lcom/tencent/liteav/renderer/e;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Landroid/view/TextureView;Lcom/tencent/liteav/basic/c/k;)V

    invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_0
    move-object v1, p0

    goto :goto_1

    :cond_1
    move-object v1, p0

    move-object v5, p1

    .line 39
    iget-object p1, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz p1, :cond_2

    .line 40
    new-instance v0, Lcom/tencent/liteav/renderer/e$2;

    invoke-direct {v0, p0, v5}, Lcom/tencent/liteav/renderer/e$2;-><init>(Lcom/tencent/liteav/renderer/e;Lcom/tencent/liteav/basic/c/k;)V

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/basic/c/d;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    if-eqz v5, :cond_3

    .line 41
    invoke-interface {v5, v0}, Lcom/tencent/liteav/basic/c/k;->a(Landroid/graphics/Bitmap;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;III)V
    .locals 0

    .line 46
    iget p1, p0, Lcom/tencent/liteav/renderer/e;->k:I

    if-eq p4, p1, :cond_0

    .line 47
    iput p4, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 48
    iget p1, p0, Lcom/tencent/liteav/renderer/e;->t:I

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/e;->d(I)V

    .line 49
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/tencent/liteav/renderer/e;->a(II)V

    .line 50
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/e;->b()V

    return-void
.end method

.method public a(Lcom/tencent/liteav/renderer/f;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->o:Lcom/tencent/liteav/renderer/f;

    return-void
.end method

.method public a(Ljava/lang/Object;I[FZ)V
    .locals 18

    move-object/from16 v1, p0

    .line 74
    iget v0, v1, Lcom/tencent/liteav/renderer/e;->l:I

    const/4 v7, 0x1

    if-ne v0, v7, :cond_7

    .line 75
    iget v3, v1, Lcom/tencent/liteav/renderer/e;->h:I

    iget v4, v1, Lcom/tencent/liteav/renderer/e;->i:I

    move/from16 v2, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/tencent/liteav/renderer/e;->a(III[FZ)[I

    move-result-object v0

    const/4 v2, 0x0

    .line 76
    aget v9, v0, v2

    .line 77
    aget v14, v0, v7

    const/4 v3, 0x2

    .line 78
    aget v15, v0, v3

    .line 79
    iget-object v3, v1, Lcom/tencent/liteav/renderer/e;->v:[I

    const/4 v4, 0x3

    invoke-static {v0, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x4

    if-eqz p4, :cond_0

    .line 80
    iget-object v2, v1, Lcom/tencent/liteav/renderer/e;->v:[I

    aput v7, v2, v4

    const/16 v3, 0xb4

    .line 81
    aput v3, v2, v0

    goto :goto_0

    .line 82
    :cond_0
    iget-object v3, v1, Lcom/tencent/liteav/renderer/e;->v:[I

    aput v2, v3, v4

    .line 83
    aput v2, v3, v0

    .line 84
    :goto_0
    monitor-enter p0

    .line 85
    :try_start_0
    iget-object v0, v1, Lcom/tencent/liteav/renderer/e;->s:Landroid/view/Surface;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    .line 86
    iget-object v3, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz v3, :cond_2

    .line 87
    invoke-virtual {v3}, Lcom/tencent/liteav/basic/c/d;->b()Landroid/view/Surface;

    move-result-object v3

    if-ne v3, v0, :cond_1

    if-eqz v3, :cond_2

    .line 88
    invoke-virtual {v3}, Landroid/view/Surface;->isValid()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    .line 89
    :cond_1
    :goto_1
    const-string v4, "TXCVideoRender"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "surface-render: onDrawTextureToSurface surface change stop render thread "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iget-object v3, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v3}, Lcom/tencent/liteav/basic/c/d;->a()V

    .line 91
    iput-object v2, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 92
    :cond_2
    iget-object v2, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-nez v2, :cond_3

    iget v2, v1, Lcom/tencent/liteav/renderer/e;->l:I

    if-ne v2, v7, :cond_3

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 93
    new-instance v2, Lcom/tencent/liteav/basic/c/d;

    invoke-direct {v2}, Lcom/tencent/liteav/basic/c/d;-><init>()V

    iput-object v2, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 94
    const-string v2, "TXCVideoRender"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "surface-render: onDrawTextureToSurface start render thread "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    iget-object v2, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3, v0}, Lcom/tencent/liteav/basic/c/d;->a(Ljava/lang/Object;Landroid/view/Surface;)V

    .line 96
    :cond_3
    iget-object v0, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz v0, :cond_6

    iget v0, v1, Lcom/tencent/liteav/renderer/e;->l:I

    if-ne v0, v7, :cond_6

    if-eqz p4, :cond_4

    .line 97
    iget-object v8, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    iget v12, v1, Lcom/tencent/liteav/renderer/e;->m:I

    iget v13, v1, Lcom/tencent/liteav/renderer/e;->n:I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v10, 0x1

    const/16 v11, 0xb4

    invoke-virtual/range {v8 .. v17}, Lcom/tencent/liteav/basic/c/d;->a(IZIIIIIZZ)V

    goto :goto_2

    .line 98
    :cond_4
    iget-object v8, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    iget v12, v1, Lcom/tencent/liteav/renderer/e;->m:I

    iget v13, v1, Lcom/tencent/liteav/renderer/e;->n:I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v8 .. v17}, Lcom/tencent/liteav/basic/c/d;->a(IZIIIIIZZ)V

    goto :goto_2

    .line 99
    :cond_5
    iget-object v0, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz v0, :cond_6

    .line 100
    const-string v0, "TXCVideoRender"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "surface-render: onDrawTextureToSurface stop render thread "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iget-object v0, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/d;->a()V

    .line 102
    iput-object v2, v1, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 103
    :cond_6
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_7
    return-void
.end method

.method public a(Z)V
    .locals 6

    .line 52
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->C:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]"

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lcom/tencent/liteav/renderer/e;->j:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eqz p1, :cond_0

    const-string v5, "true"

    goto :goto_0

    :cond_0
    const-string v5, "false"

    :goto_0
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "streamType: 2-big, 3-small, 7-sub"

    const/4 v3, 0x2

    invoke-static {v3, v0, v2, v1}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 54
    :cond_1
    iput-boolean v1, p0, Lcom/tencent/liteav/renderer/e;->C:Z

    .line 55
    iput-boolean v1, p0, Lcom/tencent/liteav/renderer/e;->D:Z

    .line 56
    iput-boolean v1, p0, Lcom/tencent/liteav/renderer/e;->E:Z

    if-eqz p1, :cond_3

    .line 57
    iget p1, p0, Lcom/tencent/liteav/renderer/e;->l:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    .line 58
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 59
    const-string p1, "TXCVideoRender"

    const-string v0, "play:vrender: quit render thread when stop"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->e()V

    .line 61
    monitor-enter p0

    .line 62
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz p1, :cond_2

    .line 63
    const-string p1, "TXCVideoRender"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surface-render:stop render thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    invoke-virtual {p1}, Lcom/tencent/liteav/basic/c/d;->a()V

    const/4 p1, 0x0

    .line 65
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 66
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public b(I)V
    .locals 0

    if-lez p1, :cond_0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->c:I

    :cond_0
    return-void
.end method

.method public b(II)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/liteav/renderer/e;->a(II)V

    return-void
.end method

.method public b(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    return-void
.end method

.method public c(I)V
    .locals 1

    .line 2
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->u:I

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/d;->a(I)V

    :cond_0
    return-void
.end method

.method public c(II)V
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surface-render: set setSurfaceSize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCVideoRender"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->m:I

    if-ne p1, v0, :cond_1

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->n:I

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/tencent/liteav/renderer/e;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->v:[I

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    new-instance v1, Lcom/tencent/liteav/renderer/e$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/liteav/renderer/e$3;-><init>(Lcom/tencent/liteav/renderer/e;II)V

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/basic/c/d;->a(Ljava/lang/Runnable;)V

    return-void

    .line 9
    :cond_2
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->m:I

    .line 10
    iput p2, p0, Lcom/tencent/liteav/renderer/e;->n:I

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 8
    .line 9
    add-int/2addr p1, v1

    .line 10
    rem-int/lit16 p1, p1, 0x168

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/renderer/d;->c(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/renderer/e;->w:I

    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]"

    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x2

    .line 30
    const-string v2, "streamType: 2-big, 3-small, 7-sub"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {v1, v0, v2, v3}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->C:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->E:Z

    .line 40
    .line 41
    iput-boolean v3, p0, Lcom/tencent/liteav/renderer/e;->D:Z

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->m()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->s:Landroid/view/Surface;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->m:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->s:Landroid/view/Surface;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->n:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "TXCVideoRender"

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "surface-render: onRenderThreadEGLDestroy stop render thread "

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/d;->a()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lcom/tencent/liteav/renderer/e;->q:Lcom/tencent/liteav/basic/c/d;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/h;->c()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lcom/tencent/liteav/renderer/e;->r:Lcom/tencent/liteav/renderer/h;

    .line 50
    .line 51
    :cond_1
    return-void

    .line 52
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
.end method

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 10
    .line 11
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->b:J

    .line 12
    .line 13
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->c:J

    .line 14
    .line 15
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->d:J

    .line 16
    .line 17
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->e:J

    .line 18
    .line 19
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->f:J

    .line 20
    .line 21
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->g:J

    .line 22
    .line 23
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->h:J

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->i:J

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput v1, v0, Lcom/tencent/liteav/renderer/e$a;->j:I

    .line 29
    .line 30
    iput v1, v0, Lcom/tencent/liteav/renderer/e$a;->k:I

    .line 31
    .line 32
    const/16 v0, 0x1771

    .line 33
    .line 34
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 40
    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/16 v2, 0x1772

    .line 48
    .line 49
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x1773

    .line 53
    .line 54
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 55
    .line 56
    invoke-virtual {p0, v0, v1, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x1775

    .line 60
    .line 61
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 62
    .line 63
    invoke-virtual {p0, v0, v1, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const/16 v0, 0x1776

    .line 67
    .line 68
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 69
    .line 70
    invoke-virtual {p0, v0, v1, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    const/16 v0, 0x1774

    .line 74
    .line 75
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 76
    .line 77
    invoke-virtual {p0, v0, v1, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public n()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, v0, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 23
    .line 24
    iget-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 25
    .line 26
    sub-long/2addr v0, v3

    .line 27
    const-wide/16 v3, 0x3e8

    .line 28
    .line 29
    cmp-long v3, v0, v3

    .line 30
    .line 31
    if-ltz v3, :cond_1

    .line 32
    .line 33
    iget-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->c:J

    .line 34
    .line 35
    iget-wide v5, v2, Lcom/tencent/liteav/renderer/e$a;->b:J

    .line 36
    .line 37
    sub-long/2addr v3, v5

    .line 38
    long-to-double v2, v3

    .line 39
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    mul-double/2addr v2, v4

    .line 45
    long-to-double v4, v0

    .line 46
    div-double/2addr v2, v4

    .line 47
    iget v4, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 48
    .line 49
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const/16 v6, 0x1772

    .line 54
    .line 55
    invoke-virtual {p0, v6, v4, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(IILjava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    double-to-int v2, v2

    .line 63
    int-to-long v2, v2

    .line 64
    iget v5, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 65
    .line 66
    const v6, 0x9c41

    .line 67
    .line 68
    .line 69
    invoke-static {v4, v6, v2, v3, v5}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 73
    .line 74
    iget-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->c:J

    .line 75
    .line 76
    iput-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->b:J

    .line 77
    .line 78
    iget-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 79
    .line 80
    add-long/2addr v3, v0

    .line 81
    iput-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "play:vrender: texture available @"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "id "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "_"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "TXCVideoRender"

    .line 41
    .line 42
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput p2, p0, Lcom/tencent/liteav/renderer/e;->f:I

    .line 46
    .line 47
    iput p3, p0, Lcom/tencent/liteav/renderer/e;->g:I

    .line 48
    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, p2, p3}, Lcom/tencent/liteav/renderer/d;->a(II)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object p2, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 57
    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p2, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 67
    .line 68
    if-eq p1, p2, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const/4 p1, 0x0

    .line 76
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/SurfaceTexture;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    .line 84
    .line 85
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 5

    .line 1
    const-string v0, "TXCVideoRender"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iput-boolean v1, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v3, "play:vrender:  onSurfaceTextureDestroyed when need save texture : "

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-boolean v3, p0, Lcom/tencent/liteav/renderer/e;->E:Z

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, "id "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, "_"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v3, p0, Lcom/tencent/liteav/renderer/e;->j:I

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v2, p0, Lcom/tencent/liteav/renderer/e;->E:Z

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->F:Lcom/tencent/liteav/renderer/e$a;

    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    iput-wide v3, v2, Lcom/tencent/liteav/renderer/e$a;->a:J

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/e;->b(Landroid/graphics/SurfaceTexture;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 69
    .line 70
    if-ne p1, v2, :cond_1

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :goto_0
    const-string v2, "onSurfaceTextureDestroyed failed."

    .line 77
    .line 78
    invoke-static {v0, v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->b:Landroid/graphics/SurfaceTexture;

    .line 82
    .line 83
    if-nez p1, :cond_2

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    :cond_2
    return v1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "play:vrender: texture size change new:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ","

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, " old:"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v2, p0, Lcom/tencent/liteav/renderer/e;->f:I

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->g:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "TXCVideoRender"

    .line 45
    .line 46
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    .line 50
    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    const-string v0, "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger"

    .line 54
    .line 55
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Lcom/tencent/liteav/renderer/e;->B:Z

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/SurfaceTexture;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    iput p2, p0, Lcom/tencent/liteav/renderer/e;->f:I

    .line 65
    .line 66
    iput p3, p0, Lcom/tencent/liteav/renderer/e;->g:I

    .line 67
    .line 68
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1, p2, p3}, Lcom/tencent/liteav/renderer/d;->a(II)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
