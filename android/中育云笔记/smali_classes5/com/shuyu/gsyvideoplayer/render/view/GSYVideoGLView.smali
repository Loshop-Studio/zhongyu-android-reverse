.class public Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Lr7/a;
.implements Lcom/shuyu/gsyvideoplayer/render/view/a;
.implements Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;
    }
.end annotation


# instance fields
.field public c:Lq7/a;

.field public d:Landroid/content/Context;

.field public e:Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

.field public f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

.field public g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

.field public h:Lr7/a;

.field public i:Lr7/c;

.field public j:[F

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lp7/a;

    invoke-direct {v0}, Lp7/a;-><init>()V

    iput-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e:Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 4
    invoke-direct {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    new-instance p2, Lp7/a;

    invoke-direct {p2}, Lp7/a;-><init>()V

    iput-object p2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e:Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

    const/4 p2, 0x0

    .line 7
    iput p2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 8
    invoke-direct {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f(Landroid/content/Context;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Landroid/view/ViewGroup;ILr7/c;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;[FLq7/a;I)Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    if-eqz p7, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p7}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setCustomRenderer(Lq7/a;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v0, p5}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setEffect(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p4}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setVideoParamsListener(Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;)V

    .line 24
    .line 25
    .line 26
    move/from16 v7, p8

    .line 27
    .line 28
    invoke-virtual {v0, v7}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setRenderMode(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p3}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setIGSYSurfaceListener(Lr7/c;)V

    .line 32
    .line 33
    .line 34
    int-to-float p5, p2

    .line 35
    invoke-virtual {v0, p5}, Landroid/view/View;->setRotation(F)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    move-object v3, p1

    .line 45
    move v4, p2

    .line 46
    move-object v5, p3

    .line 47
    move-object v6, p4

    .line 48
    invoke-direct/range {v1 .. v7}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$b;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;ILr7/c;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setGSYVideoGLRenderErrorListener(Lr7/b;)V

    .line 52
    .line 53
    .line 54
    if-eqz p6, :cond_2

    .line 55
    .line 56
    array-length p0, p6

    .line 57
    const/16 p3, 0x10

    .line 58
    .line 59
    if-ne p0, p3, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, p6}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setMVPMatrix([F)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    if-eqz p2, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->getRenderer()Lq7/a;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lq7/a;->e()[F

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    neg-int p2, p2

    .line 76
    int-to-float p4, p2

    .line 77
    const/4 p6, 0x0

    .line 78
    const/high16 p7, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const/4 p3, 0x0

    .line 81
    const/4 p5, 0x0

    .line 82
    move-object p2, p0

    .line 83
    invoke-static/range {p2 .. p7}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    invoke-static {p1, v0}, Lo7/a;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method private f(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->d:Landroid/content/Context;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lq7/b;

    .line 8
    .line 9
    invoke-direct {p1}, Lq7/b;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 13
    .line 14
    new-instance p1, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 15
    .line 16
    invoke-direct {p1, p0, p0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;-><init>(Landroid/view/View;Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 20
    .line 21
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lq7/a;->r(Landroid/opengl/GLSurfaceView;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " not support initCover now"

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
    invoke-static {v0}, Lcom/shuyu/gsyvideoplayer/utils/Debuger;->printfLog(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0
.end method

.method public b(Ljava/io/File;ZLl7/f;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p3, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$a;-><init>(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;Ll7/f;Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->i(Ll7/e;Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->j()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(Ll7/e;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->i(Ll7/e;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->j()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->onResume()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCurrentVideoHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getCurrentVideoHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getCurrentVideoWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getCurrentVideoWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getEffect()Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e:Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIGSYSurfaceListener()Lr7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->i:Lr7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMVPMatrix()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->j:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getRenderView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getRenderer()Lq7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSizeH()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getSizeW()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getVideoSarDen()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getVideoSarDen()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getVideoSarNum()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getVideoSarNum()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getCurrentVideoWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;->getCurrentVideoHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v3, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->getMeasuredWidth()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v2, v3}, Lq7/a;->l(I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3}, Lq7/a;->k(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Lq7/a;->j(I)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lq7/a;->i(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public i(Ll7/e;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lq7/a;->p(Ll7/e;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq7/a;->s()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    float-to-int v1, v1

    .line 16
    invoke-virtual {v0, p1, p2, v1}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->prepareMeasure(III)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->h()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    float-to-int v1, v1

    .line 30
    invoke-virtual {v0, p1, p2, v1}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->prepareMeasure(III)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->getMeasuredWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object p2, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->g:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lq7/a;->f()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onSurfaceAvailable(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->i:Lr7/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr7/c;->onSurfaceAvailable(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setCustomRenderer(Lq7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lq7/a;->r(Landroid/opengl/GLSurfaceView;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->h()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setEffect(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->e:Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq7/a;->m(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setGLEffectFilter(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setEffect(Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setGLMVPMatrix([F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setMVPMatrix([F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setGLRenderer(Lq7/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setCustomRenderer(Lq7/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setGSYVideoGLRenderErrorListener(Lr7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq7/a;->o(Lr7/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIGSYSurfaceListener(Lr7/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p0}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setOnGSYSurfaceListener(Lr7/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->i:Lr7/c;

    .line 5
    .line 6
    return-void
.end method

.method public setMVPMatrix([F)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->j:[F

    .line 4
    .line 5
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq7/a;->q([F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnGSYSurfaceListener(Lr7/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->h:Lr7/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->c:Lq7/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lq7/a;->n(Lr7/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setRenderMode(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->setMode(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setRenderTransform(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, " not support setRenderTransform now"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/shuyu/gsyvideoplayer/utils/Debuger;->printfLog(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setVideoParamsListener(Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/render/view/GSYVideoGLView;->f:Lcom/shuyu/gsyvideoplayer/utils/MeasureHelper$MeasureFormVideoParamsListener;

    .line 2
    .line 3
    return-void
.end method
