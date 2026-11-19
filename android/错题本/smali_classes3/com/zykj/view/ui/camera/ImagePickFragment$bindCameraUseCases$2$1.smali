.class final Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->bindCameraUseCases()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    new-instance p1, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 15
    .line 16
    invoke-static {v1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->access$getMBindView$p(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "mBindView"

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->prevView:Landroidx/camera/view/PreviewView;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-float v1, v1

    .line 32
    iget-object v4, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 33
    .line 34
    invoke-static {v4}, Lcom/zykj/view/ui/camera/ImagePickFragment;->access$getMBindView$p(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    iget-object v2, v4, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->prevView:Landroidx/camera/view/PreviewView;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    invoke-direct {p1, v1, v2}, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1, v1, p2}, Landroidx/camera/core/MeteringPointFactory;->createPoint(FF)Landroidx/camera/core/MeteringPoint;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string p2, "createPoint(...)"

    .line 63
    .line 64
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    iget-object p2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 68
    .line 69
    invoke-static {p2}, Lcom/zykj/view/ui/camera/ImagePickFragment;->access$getCamera$p(Lcom/zykj/view/ui/camera/ImagePickFragment;)Landroidx/camera/core/Camera;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_1

    .line 74
    .line 75
    invoke-interface {p2}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance v1, Landroidx/camera/core/FocusMeteringAction$Builder;

    .line 80
    .line 81
    invoke-direct {v1, p1, v0}, Landroidx/camera/core/FocusMeteringAction$Builder;-><init>(Landroidx/camera/core/MeteringPoint;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->disableAutoCancel()Landroidx/camera/core/FocusMeteringAction$Builder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->build()Landroidx/camera/core/FocusMeteringAction;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p2, p1}, Landroidx/camera/core/CameraControl;->startFocusAndMetering(Landroidx/camera/core/FocusMeteringAction;)Le1/a;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catch_0
    move-exception p1

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const-string p1, "camera"

    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v3
    :try_end_0
    .catch Landroidx/camera/core/CameraInfoUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :goto_0
    const-string p2, "ERROR"

    .line 108
    .line 109
    const-string v1, "cannot access camera"

    .line 110
    .line 111
    invoke-static {p2, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :goto_1
    return v0

    .line 115
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v3

    .line 119
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v3

    .line 123
    :cond_4
    return v0
.end method
