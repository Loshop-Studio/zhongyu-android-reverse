.class public Lcom/zykj/video/play/controller/TCControllerFloat;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lk5/b;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field public b:Lk5/c;

.field public c:I

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/zykj/video/play/controller/TCControllerFloat;->a(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget v0, Lcom/zykj/video/play/R$layout;->superplayer_vod_controller_float:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_float_cloud_video_view:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 19
    .line 20
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_close:I

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private getStatusBarHeight()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "com.android.internal.R$dimen"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "status_bar_height"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :cond_0
    :goto_0
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->c:I

    .line 47
    .line 48
    return v0
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->f:F

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->h:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    float-to-int v0, v0

    .line 7
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->g:F

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->i:F

    .line 10
    .line 11
    sub-float/2addr v1, v2

    .line 12
    float-to-int v1, v1

    .line 13
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v2, v2, Lcom/zykj/video/play/a;->b:Lcom/zykj/video/play/a$a;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput v0, v2, Lcom/zykj/video/play/a$a;->a:I

    .line 22
    .line 23
    iput v1, v2, Lcom/zykj/video/play/a$a;->b:I

    .line 24
    .line 25
    :cond_0
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->b:Lk5/c;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2, v0, v1}, Lk5/c;->f(II)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public getFloatVideoView()Lcom/tencent/rtmp/ui/TXCloudVideoView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->a:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 2
    .line 3
    return-object v0
.end method

.method public hide()V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_close:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->b:Lk5/c;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v0}, Lk5/c;->b(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->f:F

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerFloat;->getStatusBarHeight()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    sub-float/2addr p1, v0

    .line 30
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->g:F

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFloat;->c()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->d:F

    .line 37
    .line 38
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->f:F

    .line 39
    .line 40
    cmpl-float p1, p1, v0

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    iget p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->e:F

    .line 45
    .line 46
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->g:F

    .line 47
    .line 48
    cmpl-float p1, p1, v0

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->b:Lk5/c;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-interface {p1, v1}, Lk5/c;->j(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->h:F

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->i:F

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->d:F

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerFloat;->getStatusBarHeight()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-float v2, v2

    .line 87
    sub-float/2addr v0, v2

    .line 88
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->e:F

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->f:F

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerFloat;->getStatusBarHeight()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    int-to-float v0, v0

    .line 105
    sub-float/2addr p1, v0

    .line 106
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->g:F

    .line 107
    .line 108
    :cond_3
    :goto_0
    return v1
.end method

.method public setBackground(Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public setCallback(Lk5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFloat;->b:Lk5/c;

    .line 2
    .line 3
    return-void
.end method

.method public setVideoQualityList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj5/g;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
