.class public final Lcom/friday/common/camera/ImagePickFragment$d;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$d;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 6

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$d;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->x(Lcom/friday/common/camera/ImagePickFragment;)Landroidx/camera/core/Camera;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$d;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->x(Lcom/friday/common/camera/ImagePickFragment;)Landroidx/camera/core/Camera;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "camera"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_0
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getZoomState()Landroidx/lifecycle/LiveData;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroidx/camera/core/ZoomState;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Landroidx/camera/core/ZoomState;->getZoomRatio()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    mul-float/2addr v0, p1

    .line 54
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$d;->c:Lcom/friday/common/camera/ImagePickFragment;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    float-to-double v2, p1

    .line 65
    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    .line 66
    .line 67
    mul-double/2addr v2, v4

    .line 68
    invoke-static {v2, v3}, Ljd/c;->c(D)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    int-to-double v2, p1

    .line 73
    div-double/2addr v2, v4

    .line 74
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v4, "mBindView"

    .line 79
    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object p1, v1

    .line 86
    :cond_1
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 87
    .line 88
    double-to-float v2, v2

    .line 89
    invoke-virtual {p1, v2}, Lcom/friday/common/camera/ZoomControlView;->setRealTimeValue(F)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-nez p1, :cond_2

    .line 97
    .line 98
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-object v1, p1

    .line 103
    :goto_0
    iget-object p1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-static {v0, p1}, Lcom/friday/common/camera/ImagePickFragment;->B(Lcom/friday/common/camera/ImagePickFragment;F)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->C(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    const/4 p1, 0x1

    .line 116
    return p1
.end method
