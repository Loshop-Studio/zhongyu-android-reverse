.class public abstract Lg5/f;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lg5/e$a;
.implements Lg5/c$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/f$d;
    }
.end annotation


# instance fields
.field public a:Landroid/hardware/Camera;

.field public b:Lg5/c;

.field public c:Lg5/g;

.field public d:Lg5/f$d;

.field public e:Z

.field public f:Lg5/e;

.field public g:Landroid/view/View;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/ImageView;

.field public k:Lg5/d;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-boolean p3, p0, Lg5/f;->e:Z

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    iput-boolean p3, p0, Lg5/f;->l:Z

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lg5/f;->g(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic b(Lg5/f;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lg5/f;->setLight(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lg5/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg5/f;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method private setLight(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const-string v1, "\u8be5\u8bbe\u5907\u4e0d\u652f\u6301\u95ea\u5149\u706f"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "torch"

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v3}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    const-string v4, "off"

    .line 60
    .line 61
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v4}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    iget-object p1, p0, Lg5/f;->k:Lg5/d;

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    iget-object p1, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    :cond_3
    iget-object p1, p0, Lg5/f;->k:Lg5/d;

    .line 111
    .line 112
    invoke-interface {p1, v2}, Lg5/d;->a(Z)V

    .line 113
    .line 114
    .line 115
    :cond_4
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/f;->f:Lg5/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg5/e;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lg5/f;->f:Lg5/e;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/camera/R$styleable;->QRCodeView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/zykj/camera/R$styleable;->QRCodeView_view_TipText:I

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, Lg5/f;->i:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final g(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    new-instance v0, Lg5/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lg5/c;-><init>(Landroid/content/Context;Lg5/f;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lg5/f;->b:Lg5/c;

    .line 11
    .line 12
    new-instance v0, Lg5/g;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Lg5/g;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lg5/g;->i(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x11

    .line 40
    .line 41
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 42
    .line 43
    iget-object v1, p0, Lg5/f;->b:Lg5/c;

    .line 44
    .line 45
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lg5/f;->getTipsView()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 58
    .line 59
    sget v1, Lcom/zykj/camera/R$id;->tips:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Landroid/widget/TextView;

    .line 66
    .line 67
    iput-object v0, p0, Lg5/f;->h:Landroid/widget/TextView;

    .line 68
    .line 69
    iget-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 70
    .line 71
    sget v1, Lcom/zykj/camera/R$id;->tv_portrait_tip:I

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroid/widget/TextView;

    .line 78
    .line 79
    iput-object v0, p0, Lg5/f;->i:Landroid/widget/TextView;

    .line 80
    .line 81
    iget-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 82
    .line 83
    sget v1, Lcom/zykj/camera/R$id;->ck_light:I

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/widget/ImageView;

    .line 90
    .line 91
    iput-object v0, p0, Lg5/f;->j:Landroid/widget/ImageView;

    .line 92
    .line 93
    new-instance v1, Lg5/f$a;

    .line 94
    .line 95
    invoke-direct {v1, p0}, Lg5/f$a;-><init>(Lg5/f;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Lg5/f;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public abstract getTipsView()Landroid/view/View;
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg5/f;->g:Landroid/view/View;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lg5/f;->c:Lg5/g;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0}, Lg5/f;->j(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public j(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-boolean p2, p0, Lg5/f;->l:Z

    .line 7
    .line 8
    new-instance p2, Landroid/hardware/Camera$CameraInfo;

    .line 9
    .line 10
    invoke-direct {p2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ge v0, v1, :cond_2

    .line 19
    .line 20
    invoke-static {v0, p2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 21
    .line 22
    .line 23
    iget v1, p2, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 24
    .line 25
    if-ne v1, p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lg5/f;->k(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    return-void
.end method

.method public final k(I)V
    .locals 1

    .line 1
    new-instance v0, Lg5/f$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lg5/f$b;-><init>(Lg5/f;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l(Z)V
    .locals 1

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lg5/f;->n(IZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg5/f;->h:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Lg5/f;->l(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public n(IZ)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lg5/f;->e:Z

    .line 3
    .line 4
    iput-boolean p2, p0, Lg5/f;->l:Z

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1, p2}, Lg5/f;->j(IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg5/f;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg5/f;->j:Landroid/widget/ImageView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lg5/f;->b:Lg5/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lg5/c;->q()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lg5/f;->b:Lg5/c;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Lg5/c;->setCamera(Landroid/hardware/Camera;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg5/f;->h()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lg5/f;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lg5/f;->d()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lg5/f$c;

    .line 12
    .line 13
    invoke-direct {v0, p0, p2, p1, p0}, Lg5/f$c;-><init>(Lg5/f;Landroid/hardware/Camera;[BLg5/e$a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lg5/e;->c()Lg5/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lg5/f;->f:Lg5/e;

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg5/f;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg5/f;->j:Landroid/widget/ImageView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 8
    .line 9
    .line 10
    iput-boolean v1, p0, Lg5/f;->e:Z

    .line 11
    .line 12
    iget-object v0, p0, Lg5/f;->a:Landroid/hardware/Camera;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public q()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg5/f;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg5/f;->e()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setDelegate(Lg5/f$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/f;->d:Lg5/f$d;

    .line 2
    .line 3
    return-void
.end method

.method public setOnLightStatusListener(Lg5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/f;->k:Lg5/d;

    .line 2
    .line 3
    return-void
.end method

.method public setResultTips(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg5/f;->h:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
