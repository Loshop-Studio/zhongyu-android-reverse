.class public Lcom/tencent/liteav/renderer/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/TextureView;

.field private b:Landroid/os/Handler;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:F

.field private l:I


# direct methods
.method public constructor <init>(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->c:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->d:I

    .line 8
    .line 9
    const/16 v1, 0x280

    .line 10
    .line 11
    iput v1, p0, Lcom/tencent/liteav/renderer/d;->e:I

    .line 12
    .line 13
    const/16 v1, 0x1e0

    .line 14
    .line 15
    iput v1, p0, Lcom/tencent/liteav/renderer/d;->f:I

    .line 16
    .line 17
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->g:I

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->h:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iput v1, p0, Lcom/tencent/liteav/renderer/d;->i:I

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->j:I

    .line 25
    .line 26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    iput v1, p0, Lcom/tencent/liteav/renderer/d;->k:F

    .line 29
    .line 30
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->l:I

    .line 31
    .line 32
    iput-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->c:I

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->d:I

    .line 45
    .line 46
    new-instance v0, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/tencent/liteav/renderer/d;->b:Landroid/os/Handler;

    .line 60
    .line 61
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/renderer/d;->e:I

    return p0
.end method

.method private a()V
    .locals 3

    .line 5
    :try_start_0
    new-instance v0, Lcom/tencent/liteav/renderer/d$3;

    invoke-direct {v0, p0}, Lcom/tencent/liteav/renderer/d$3;-><init>(Lcom/tencent/liteav/renderer/d;)V

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/d;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 6
    const-string v1, "TXCTextureViewWrapper"

    const-string v2, "adjust video size failed."

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/renderer/d;II)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/renderer/d;->c(II)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 2

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 12
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/renderer/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/renderer/d;->f:I

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/renderer/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/renderer/d;->i:I

    return p0
.end method

.method private c(II)V
    .locals 5

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/renderer/d;->c:I

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/tencent/liteav/renderer/d;->d:I

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    int-to-double v2, p2

    int-to-double p1, p1

    div-double/2addr v2, p1

    int-to-double p1, v0

    mul-double/2addr p1, v2

    double-to-int p1, p1

    if-le v1, p1, :cond_2

    .line 6
    iput v0, p0, Lcom/tencent/liteav/renderer/d;->g:I

    int-to-double p1, v0

    mul-double/2addr p1, v2

    double-to-int p1, p1

    .line 7
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->h:I

    goto :goto_0

    :cond_2
    int-to-double p1, v1

    div-double/2addr p1, v2

    double-to-int p1, p1

    .line 8
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->g:I

    .line 9
    iput v1, p0, Lcom/tencent/liteav/renderer/d;->h:I

    .line 10
    :goto_0
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->g:I

    sub-int p2, v0, p1

    int-to-float p2, p2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr p2, v2

    .line 11
    iget v3, p0, Lcom/tencent/liteav/renderer/d;->h:I

    sub-int v4, v1, v3

    int-to-float v4, v4

    div-float/2addr v4, v2

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    int-to-float v0, v3

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 12
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    iget-object v2, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-virtual {v2, v1}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 14
    invoke-virtual {v1, p1, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 15
    invoke-virtual {v1, p2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 16
    iget-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-virtual {p1, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 17
    iget-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static synthetic d(Lcom/tencent/liteav/renderer/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/renderer/d;->j:I

    return p0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->b:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/liteav/renderer/d$1;

    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/renderer/d$1;-><init>(Lcom/tencent/liteav/renderer/d;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    const-string v0, "TXCTextureViewWrapper"

    const-string v1, "set render mode failed"

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public a(II)V
    .locals 2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vrender: set view size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCTextureViewWrapper"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->c:I

    .line 9
    iput p2, p0, Lcom/tencent/liteav/renderer/d;->d:I

    .line 10
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/d;->a()V

    return-void
.end method

.method public b(I)V
    .locals 7

    .line 2
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->i:I

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_b

    const/4 v1, 0x1

    const/16 v2, 0x5a

    const/16 v3, 0x10e

    const/16 v4, 0xb4

    const/high16 v5, 0x3f800000    # 1.0f

    if-ne p1, v1, :cond_4

    .line 4
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->j:I

    if-eqz p1, :cond_9

    if-ne p1, v4, :cond_0

    goto :goto_2

    :cond_0
    if-eq p1, v3, :cond_1

    if-ne p1, v2, :cond_9

    .line 5
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->g:I

    if-eqz p1, :cond_b

    iget v1, p0, Lcom/tencent/liteav/renderer/d;->h:I

    if-nez v1, :cond_2

    goto :goto_3

    .line 6
    :cond_2
    iget v2, p0, Lcom/tencent/liteav/renderer/d;->d:I

    int-to-float v2, v2

    int-to-float p1, p1

    div-float/2addr v2, p1

    .line 7
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->c:I

    int-to-float p1, p1

    int-to-float v1, v1

    div-float/2addr p1, v1

    cmpl-float v1, v2, p1

    if-lez v1, :cond_3

    :goto_0
    move v5, p1

    goto :goto_2

    :cond_3
    move v5, v2

    goto :goto_2

    :cond_4
    if-nez p1, :cond_9

    .line 8
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->g:I

    if-eqz p1, :cond_b

    iget v1, p0, Lcom/tencent/liteav/renderer/d;->h:I

    if-nez v1, :cond_5

    goto :goto_3

    .line 9
    :cond_5
    iget v6, p0, Lcom/tencent/liteav/renderer/d;->j:I

    if-eqz v6, :cond_8

    if-ne v6, v4, :cond_6

    goto :goto_1

    :cond_6
    if-eq v6, v3, :cond_7

    if-ne v6, v2, :cond_9

    .line 10
    :cond_7
    iget v2, p0, Lcom/tencent/liteav/renderer/d;->d:I

    int-to-float v2, v2

    int-to-float p1, p1

    div-float/2addr v2, p1

    .line 11
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->c:I

    int-to-float p1, p1

    int-to-float v1, v1

    div-float/2addr p1, v1

    cmpg-float v1, v2, p1

    if-gez v1, :cond_3

    goto :goto_0

    .line 12
    :cond_8
    :goto_1
    iget v2, p0, Lcom/tencent/liteav/renderer/d;->d:I

    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 13
    iget v1, p0, Lcom/tencent/liteav/renderer/d;->c:I

    int-to-float v1, v1

    int-to-float p1, p1

    div-float/2addr v1, p1

    cmpg-float p1, v2, v1

    if-gez p1, :cond_3

    move v5, v1

    .line 14
    :cond_9
    :goto_2
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->k:F

    const/4 v1, 0x0

    cmpg-float p1, p1, v1

    if-gez p1, :cond_a

    neg-float v5, v5

    .line 15
    :cond_a
    invoke-virtual {v0, v5}, Landroid/view/View;->setScaleX(F)V

    .line 16
    iget-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 17
    iput v5, p0, Lcom/tencent/liteav/renderer/d;->k:F

    :cond_b
    :goto_3
    return-void
.end method

.method public b(II)V
    .locals 2

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vrender: set video size:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXCTextureViewWrapper"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->e:I

    .line 20
    iput p2, p0, Lcom/tencent/liteav/renderer/d;->f:I

    .line 21
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/d;->a()V

    return-void
.end method

.method public c(I)V
    .locals 2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->b:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/liteav/renderer/d$2;

    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/renderer/d$2;-><init>(Lcom/tencent/liteav/renderer/d;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    const-string v0, "TXCTextureViewWrapper"

    const-string v1, "set render rotation failed."

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public d(I)V
    .locals 4

    .line 2
    rem-int/lit16 p1, p1, 0x168

    .line 3
    iput p1, p0, Lcom/tencent/liteav/renderer/d;->j:I

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_b

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_5

    const/16 v3, 0xb4

    if-ne p1, v3, :cond_0

    goto :goto_1

    :cond_0
    const/16 v3, 0x10e

    if-eq p1, v3, :cond_1

    const/16 v3, 0x5a

    if-ne p1, v3, :cond_9

    .line 5
    :cond_1
    iget v3, p0, Lcom/tencent/liteav/renderer/d;->g:I

    if-eqz v3, :cond_b

    iget v3, p0, Lcom/tencent/liteav/renderer/d;->h:I

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    rsub-int p1, p1, 0x168

    int-to-float p1, p1

    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    .line 7
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->d:I

    int-to-float p1, p1

    iget v0, p0, Lcom/tencent/liteav/renderer/d;->g:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 8
    iget v0, p0, Lcom/tencent/liteav/renderer/d;->c:I

    int-to-float v0, v0

    iget v3, p0, Lcom/tencent/liteav/renderer/d;->h:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    .line 9
    iget v3, p0, Lcom/tencent/liteav/renderer/d;->i:I

    if-ne v3, v1, :cond_4

    cmpl-float v1, p1, v0

    if-lez v1, :cond_3

    :goto_0
    move v2, v0

    goto :goto_2

    :cond_3
    move v2, p1

    goto :goto_2

    :cond_4
    if-nez v3, :cond_9

    cmpg-float v1, p1, v0

    if-gez v1, :cond_3

    goto :goto_0

    :cond_5
    :goto_1
    rsub-int p1, p1, 0x168

    int-to-float p1, p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    .line 11
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->i:I

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    if-nez p1, :cond_9

    .line 12
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->g:I

    if-eqz p1, :cond_b

    iget v0, p0, Lcom/tencent/liteav/renderer/d;->h:I

    if-nez v0, :cond_7

    goto :goto_3

    .line 13
    :cond_7
    iget v1, p0, Lcom/tencent/liteav/renderer/d;->d:I

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 14
    iget v0, p0, Lcom/tencent/liteav/renderer/d;->c:I

    int-to-float v0, v0

    int-to-float p1, p1

    div-float/2addr v0, p1

    cmpg-float p1, v1, v0

    if-gez p1, :cond_8

    goto :goto_0

    :cond_8
    move v2, v1

    .line 15
    :cond_9
    :goto_2
    iget p1, p0, Lcom/tencent/liteav/renderer/d;->k:F

    const/4 v0, 0x0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_a

    neg-float v2, v2

    .line 16
    :cond_a
    iget-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 17
    iget-object p1, p0, Lcom/tencent/liteav/renderer/d;->a:Landroid/view/TextureView;

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 18
    iput v2, p0, Lcom/tencent/liteav/renderer/d;->k:F

    :cond_b
    :goto_3
    return-void
.end method
