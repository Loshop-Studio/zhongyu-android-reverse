.class final Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.camera.ImagePickFragment$bindCameraUseCases$3$2"
    f = "ImagePickFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lb2/a;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb2/a;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->g(Lb2/a;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb2/a;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "mBindView"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v3

    .line 32
    :cond_0
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-float v1, v1

    .line 39
    iget-object v4, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 40
    .line 41
    invoke-static {v4}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v4, v3

    .line 51
    :cond_1
    iget-object v2, v4, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    int-to-float v2, v2

    .line 58
    invoke-direct {p1, v1, v2}, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lb2/a;->b()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0}, Lb2/a;->c()F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1, v1, v0}, Landroidx/camera/core/MeteringPointFactory;->createPoint(FF)Landroidx/camera/core/MeteringPoint;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v0, "createPoint(...)"

    .line 74
    .line 75
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 79
    .line 80
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->x(Lcom/friday/common/camera/ImagePickFragment;)Landroidx/camera/core/Camera;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    const-string v0, "camera"

    .line 87
    .line 88
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    move-object v3, v0

    .line 93
    :goto_0
    invoke-interface {v3}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Landroidx/camera/core/FocusMeteringAction$Builder;

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    invoke-direct {v1, p1, v2}, Landroidx/camera/core/FocusMeteringAction$Builder;-><init>(Landroidx/camera/core/MeteringPoint;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->disableAutoCancel()Landroidx/camera/core/FocusMeteringAction$Builder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->build()Landroidx/camera/core/FocusMeteringAction;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->startFocusAndMetering(Landroidx/camera/core/FocusMeteringAction;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/camera/core/CameraInfoUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    :catch_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method
