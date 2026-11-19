.class public Lg5/c;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/c$f;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String; = "c"


# instance fields
.field public a:I

.field public b:I

.field public c:Lg5/c$f;

.field public d:Lg5/f;

.field public e:Landroid/hardware/Camera;

.field public f:F

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lg5/b;

.field public k:Ljava/lang/Runnable;

.field public l:Landroid/hardware/Camera$AutoFocusCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lg5/c;->a:I

    .line 6
    .line 7
    iput p1, p0, Lg5/c;->b:I

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput p1, p0, Lg5/c;->f:F

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lg5/c;->g:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lg5/c;->h:Z

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lg5/c;->i:Z

    .line 20
    .line 21
    new-instance p1, Lg5/c$c;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lg5/c$c;-><init>(Lg5/c;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lg5/c;->k:Ljava/lang/Runnable;

    .line 27
    .line 28
    new-instance p1, Lg5/c$d;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lg5/c$d;-><init>(Lg5/c;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lg5/c;->l:Landroid/hardware/Camera$AutoFocusCallback;

    .line 34
    .line 35
    iput-object p2, p0, Lg5/c;->d:Lg5/f;

    .line 36
    .line 37
    iput-object p2, p0, Lg5/c;->c:Lg5/c$f;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lg5/c;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Lg5/c;Landroid/hardware/Camera;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg5/c;->i(Landroid/hardware/Camera;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lg5/c;)Landroid/hardware/Camera;
    .locals 0

    .line 1
    iget-object p0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lg5/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg5/c;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lg5/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg5/c;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lg5/c;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lg5/c;->k:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lg5/c;)Lg5/c$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lg5/c;->c:Lg5/c$f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static h(FFFII)Landroid/graphics/Rect;
    .locals 3

    .line 1
    const/high16 v0, 0x43960000    # 300.0f

    .line 2
    .line 3
    mul-float/2addr p2, v0

    .line 4
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    int-to-float p3, p3

    .line 13
    div-float/2addr p0, p3

    .line 14
    const/high16 p3, 0x44fa0000    # 2000.0f

    .line 15
    .line 16
    mul-float/2addr p0, p3

    .line 17
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 18
    .line 19
    sub-float/2addr p0, v0

    .line 20
    float-to-int p0, p0

    .line 21
    int-to-float p4, p4

    .line 22
    div-float/2addr p1, p4

    .line 23
    mul-float/2addr p1, p3

    .line 24
    sub-float/2addr p1, v0

    .line 25
    float-to-int p1, p1

    .line 26
    div-int/lit8 p2, p2, 0x2

    .line 27
    .line 28
    new-instance p3, Landroid/graphics/RectF;

    .line 29
    .line 30
    sub-int p4, p0, p2

    .line 31
    .line 32
    const/16 v0, -0x3e8

    .line 33
    .line 34
    const/16 v1, 0x3e8

    .line 35
    .line 36
    invoke-static {p4, v0, v1}, Lg5/c;->j(III)I

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    int-to-float p4, p4

    .line 41
    sub-int v2, p1, p2

    .line 42
    .line 43
    invoke-static {v2, v0, v1}, Lg5/c;->j(III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    int-to-float v2, v2

    .line 48
    add-int/2addr p0, p2

    .line 49
    invoke-static {p0, v0, v1}, Lg5/c;->j(III)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    int-to-float p0, p0

    .line 54
    add-int/2addr p1, p2

    .line 55
    invoke-static {p1, v0, v1}, Lg5/c;->j(III)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-float p1, p1

    .line 60
    invoke-direct {p3, p4, v2, p0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 61
    .line 62
    .line 63
    new-instance p0, Landroid/graphics/Rect;

    .line 64
    .line 65
    iget p1, p3, Landroid/graphics/RectF;->left:F

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 72
    .line 73
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget p4, p3, Landroid/graphics/RectF;->right:F

    .line 78
    .line 79
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    .line 84
    .line 85
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    invoke-direct {p0, p1, p2, p4, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public static j(III)I
    .locals 0

    .line 1
    if-le p0, p2, :cond_0

    .line 2
    .line 3
    return p2

    .line 4
    :cond_0
    if-ge p0, p1, :cond_1

    .line 5
    .line 6
    return p1

    .line 7
    :cond_1
    return p0
.end method

.method public static k(Landroid/view/MotionEvent;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sub-float/2addr v0, p0

    .line 21
    mul-float/2addr v1, v1

    .line 22
    mul-float/2addr v0, v0

    .line 23
    add-float/2addr v1, v0

    .line 24
    float-to-double v0, v1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float p0, v0

    .line 30
    return p0
.end method


# virtual methods
.method public getDisplayOrientation()I
    .locals 5

    .line 1
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "window"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroid/view/WindowManager;

    .line 21
    .line 22
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    if-eq v2, v3, :cond_2

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    if-eq v2, v4, :cond_1

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    if-eq v2, v4, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v1, 0x10e

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/16 v1, 0xb4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v1, 0x5a

    .line 49
    .line 50
    :cond_3
    :goto_0
    iget v2, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 51
    .line 52
    if-ne v2, v3, :cond_4

    .line 53
    .line 54
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 55
    .line 56
    add-int/2addr v0, v1

    .line 57
    rem-int/lit16 v0, v0, 0x168

    .line 58
    .line 59
    rsub-int v0, v0, 0x168

    .line 60
    .line 61
    rem-int/lit16 v0, v0, 0x168

    .line 62
    .line 63
    return v0

    .line 64
    :cond_4
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    add-int/lit16 v0, v0, 0x168

    .line 68
    .line 69
    rem-int/lit16 v0, v0, 0x168

    .line 70
    .line 71
    return v0
.end method

.method public getPicSize()Landroid/graphics/Point;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    iget-object v1, p0, Lg5/c;->j:Lg5/b;

    .line 4
    .line 5
    iget-object v1, v1, Lg5/b;->d:Landroid/graphics/Point;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final i(Landroid/hardware/Camera;)V
    .locals 2

    .line 1
    new-instance v0, Lg5/c$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg5/c$e;-><init>(Lg5/c;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v1, v1, v0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final l(Landroid/view/MotionEvent;Landroid/hardware/Camera;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v2, p1, v3, v0, v1}, Lg5/c;->h(FFFII)Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v2, Landroid/hardware/Camera$Area;

    .line 44
    .line 45
    const/16 v3, 0x320

    .line 46
    .line 47
    invoke-direct {v2, p1, v3}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sget-object p1, Lg5/c;->m:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "focus areas not supported"

    .line 60
    .line 61
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    const-string v3, "macro"

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lg5/c$a;

    .line 103
    .line 104
    invoke-direct {v0, p0, p1}, Lg5/c$a;-><init>(Lg5/c;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final m(ZLandroid/hardware/Camera;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->isZoomSupported()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxZoom()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getZoom()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    if-ge v2, v1, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-lez v2, :cond_2

    .line 30
    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setZoom(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    sget-object p1, Lg5/c;->m:Ljava/lang/String;

    .line 41
    .line 42
    const-string p2, "zoom not supported"

    .line 43
    .line 44
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x100

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x5a

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 18
    .line 19
    invoke-virtual {p0}, Lg5/c;->getDisplayOrientation()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    iput-boolean v1, p0, Lg5/c;->g:Z

    .line 7
    .line 8
    iget-object v1, p0, Lg5/c;->j:Lg5/b;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lg5/b;->d(Landroid/hardware/Camera;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    sget-object v0, Lg5/c;->m:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "onMesure"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lg5/c;->a:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v2, v1, :cond_1

    .line 12
    .line 13
    iget v1, p0, Lg5/c;->b:I

    .line 14
    .line 15
    if-ne v2, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string p2, "onMesure-x="

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget p2, p0, Lg5/c;->a:I

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p2, ",y="

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget p2, p0, Lg5/c;->b:I

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lg5/c;->a:I

    .line 51
    .line 52
    iget p2, p0, Lg5/c;->b:I

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onMeasure(II)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    iget-boolean v0, p0, Lg5/c;->g:Z

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 21
    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Lg5/c;->l(Landroid/view/MotionEvent;Landroid/hardware/Camera;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    and-int/lit16 v0, v0, 0xff

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    if-eq v0, v2, :cond_2

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    if-eq v0, v2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-static {p1}, Lg5/c;->k(Landroid/view/MotionEvent;)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lg5/c;->f:F

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {p1}, Lg5/c;->k(Landroid/view/MotionEvent;)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget v0, p0, Lg5/c;->f:F

    .line 58
    .line 59
    cmpl-float v2, p1, v0

    .line 60
    .line 61
    if-lez v2, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lg5/c;->m(ZLandroid/hardware/Camera;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    cmpg-float v0, p1, v0

    .line 70
    .line 71
    if-gez v0, :cond_4

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    iget-object v2, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 75
    .line 76
    invoke-virtual {p0, v0, v2}, Lg5/c;->m(ZLandroid/hardware/Camera;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    iput p1, p0, Lg5/c;->f:F

    .line 80
    .line 81
    :cond_5
    :goto_1
    return v1
.end method

.method public p()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg5/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lg5/c;->o()V

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Lg5/c;->o()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lg5/c;->k:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lg5/c;->g:Z

    .line 12
    .line 13
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public setCamera(Landroid/hardware/Camera;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lg5/c;->n()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lg5/b;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p1, v0}, Lg5/b;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lg5/c;->j:Lg5/b;

    .line 18
    .line 19
    iget-object v0, p0, Lg5/c;->e:Landroid/hardware/Camera;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lg5/b;->c(Landroid/hardware/Camera;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lg5/c;->q()V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lg5/c$b;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lg5/c$b;-><init>(Lg5/c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lg5/c;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lg5/c;->i:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lg5/c;->q()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
