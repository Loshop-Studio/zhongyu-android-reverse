.class public final Lcom/zykj/image/ImagePickFragment;
.super Lcom/zykj/image/Hilt_ImagePickFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/image/ImagePickFragment$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/image/ImagePickFragment$a;

.field public static final TAG:Ljava/lang/String; = "ImagePickFragment"


# instance fields
.field private final args$delegate:Landroidx/navigation/NavArgsLazy;

.field private cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

.field private imageCapture:Landroidx/camera/core/ImageCapture;

.field private mCameraControl:Landroidx/camera/core/CameraControl;

.field private final requestPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/image/ImagePickFragment$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/image/ImagePickFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/image/ImagePickFragment;->Companion:Lcom/zykj/image/ImagePickFragment$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/Hilt_ImagePickFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/image/ImagePickFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/image/ImagePickFragment$special$$inlined$navArgs$1;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/image/ImagePickFragment$special$$inlined$navArgs$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/image/ImagePickFragment;->args$delegate:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lj3/k;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Lj3/k;-><init>(Lcom/zykj/image/ImagePickFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "registerForActivityResult(\n        ActivityResultContracts.RequestPermission()\n    ) { isGranted: Boolean ->\n        if (isGranted) {\n            startCamera()\n        } else {\n            XToastUtils.warning(R.string.no_camera_permission)\n            findNavController().navigateUp()\n        }\n    }"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/image/ImagePickFragment;->requestPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic access$getArgs(Lcom/zykj/image/ImagePickFragment;)Lcom/zykj/image/ImagePickFragmentArgs;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/ImagePickFragment;->getArgs()Lcom/zykj/image/ImagePickFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final bindCameraUseCases()V
    .locals 7

    .line 1
    new-instance v0, Landroidx/camera/core/CameraSelector$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/CameraSelector$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/core/CameraSelector$Builder;->requireLensFacing(I)Landroidx/camera/core/CameraSelector$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/CameraSelector$Builder;->build()Landroidx/camera/core/CameraSelector;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK)\n                .build()"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroidx/camera/core/Preview$Builder;

    .line 21
    .line 22
    invoke-direct {v2}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3}, Landroidx/camera/core/Preview$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/Preview$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v4, "Builder()\n            .setTargetAspectRatio(AspectRatio.RATIO_4_3)\n            .build()"

    .line 35
    .line 36
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Landroidx/camera/core/ImageCapture$Builder;

    .line 40
    .line 41
    invoke-direct {v4}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v3}, Landroidx/camera/core/ImageCapture$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/ImageCapture$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iput-object v4, p0, Lcom/zykj/image/ImagePickFragment;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/zykj/image/ImagePickFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 55
    .line 56
    if-nez v4, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v4}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 60
    .line 61
    .line 62
    :goto_0
    :try_start_0
    iget-object v4, p0, Lcom/zykj/image/ImagePickFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object v5, p0, Lcom/zykj/image/ImagePickFragment;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 68
    .line 69
    const/4 v6, 0x2

    .line 70
    new-array v6, v6, [Landroidx/camera/core/UseCase;

    .line 71
    .line 72
    aput-object v2, v6, v3

    .line 73
    .line 74
    aput-object v5, v6, v1

    .line 75
    .line 76
    invoke-virtual {v4, p0, v0, v6}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lcom/zykj/image/ImagePickFragment;->mCameraControl:Landroidx/camera/core/CameraControl;

    .line 88
    .line 89
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 98
    .line 99
    iget-object v1, v1, Lcom/zykj/image/databinding/FragmentImagePickBinding;->c:Landroid/widget/CheckBox;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 106
    .line 107
    .line 108
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/zykj/image/databinding/FragmentImagePickBinding;->d:Landroidx/camera/view/PreviewView;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v2, v0}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catch_0
    move-exception v0

    .line 125
    const-string v1, "ImagePickFragment"

    .line 126
    .line 127
    const-string v2, "Use case binding failed"

    .line 128
    .line 129
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public static synthetic g(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImagePickFragment;->initView$lambda-2(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method private final getArgs()Lcom/zykj/image/ImagePickFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment;->args$delegate:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/image/ImagePickFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lcom/zykj/image/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/image/ImagePickFragment;->initView$lambda-3(Lcom/zykj/image/ImagePickFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImagePickFragment;->setUpCamera$lambda-5$lambda-4(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method private static final initView$lambda-1(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/image/ImagePickFragment;->takePic()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final initView$lambda-2(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final initView$lambda-3(Lcom/zykj/image/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/image/ImagePickFragment;->mCameraControl:Landroidx/camera/core/CameraControl;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p0, p2}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic j(Lcom/zykj/image/ImagePickFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImagePickFragment;->requestPermissionLauncher$lambda-0(Lcom/zykj/image/ImagePickFragment;Z)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImagePickFragment;->initView$lambda-1(Lcom/zykj/image/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method private final requestCameraPermission()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment;->requestPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 2
    .line 3
    const-string v1, "android.permission.CAMERA"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final requestPermissionLauncher$lambda-0(Lcom/zykj/image/ImagePickFragment;Z)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/image/ImagePickFragment;->startCamera()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 13
    .line 14
    sget v0, Lcom/zykj/image/R$string;->no_camera_permission:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->warning(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final setUpCamera()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->getInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lj3/j;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lj3/j;-><init>(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImagePickFragment;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static final setUpCamera$lambda-5$lambda-4(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_run"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/image/ImagePickFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/zykj/image/ImagePickFragment;->bindCameraUseCases()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final startCamera()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/ImagePickFragment;->setUpCamera()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final takePic()V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, ".jpg"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;-><init>(Ljava/io/File;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;->build()Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "Builder(\n                file\n            ).build()"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/zykj/image/ImagePickFragment;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 50
    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    new-instance v4, Lcom/zykj/image/ImagePickFragment$takePic$1;

    .line 59
    .line 60
    invoke-direct {v4, p0, v0}, Lcom/zykj/image/ImagePickFragment$takePic$1;-><init>(Lcom/zykj/image/ImagePickFragment;Ljava/io/File;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1, v3, v4}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/zykj/image/ImagePickFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/image/ImagePickFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/image/ImagePickFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/image/ImagePickFragment$initData$1;-><init>(Lcom/zykj/image/ImagePickFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lcom/zykj/image/ImagePickFragment;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput v3, v0, Lcom/zykj/image/ImagePickFragment$initData$1;->d:I

    .line 60
    .line 61
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    move-object v0, p0

    .line 69
    :goto_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v1, "android.permission.CAMERA"

    .line 74
    .line 75
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    invoke-direct {v0}, Lcom/zykj/image/ImagePickFragment;->startCamera()V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-direct {v0}, Lcom/zykj/image/ImagePickFragment;->requestCameraPermission()V

    .line 86
    .line 87
    .line 88
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 89
    .line 90
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;->b:Landroid/widget/ImageView;

    .line 8
    .line 9
    new-instance p2, Lj3/g;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lj3/g;-><init>(Lcom/zykj/image/ImagePickFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;->a:Landroid/widget/ImageView;

    .line 24
    .line 25
    new-instance p2, Lj3/h;

    .line 26
    .line 27
    invoke-direct {p2, p0}, Lj3/h;-><init>(Lcom/zykj/image/ImagePickFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImagePickBinding;->c:Landroid/widget/CheckBox;

    .line 40
    .line 41
    new-instance p2, Lj3/i;

    .line 42
    .line 43
    invoke-direct {p2, p0}, Lj3/i;-><init>(Lcom/zykj/image/ImagePickFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 50
    .line 51
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/image/R$layout;->fragment_image_pick:I

    .line 2
    .line 3
    return v0
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment;->mCameraControl:Landroidx/camera/core/CameraControl;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/zykj/image/databinding/FragmentImagePickBinding;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/zykj/image/databinding/FragmentImagePickBinding;->c:Landroid/widget/CheckBox;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 22
    .line 23
    .line 24
    return-void
.end method
