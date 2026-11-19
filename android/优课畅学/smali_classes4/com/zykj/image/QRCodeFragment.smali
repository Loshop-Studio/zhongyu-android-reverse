.class public final Lcom/zykj/image/QRCodeFragment;
.super Lcom/zykj/image/Hilt_QRCodeFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/image/QRCodeFragment$b;,
        Lcom/zykj/image/QRCodeFragment$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/image/QRCodeFragment$a;

.field public static final RESULT_QR_KEY:Ljava/lang/String; = "qr_code_key"

.field public static final RESULT_QR_TEXT:Ljava/lang/String; = "qr_code_text"

.field public static final TAG:Ljava/lang/String; = "QRCodeFragment"


# instance fields
.field private cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

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

    new-instance v0, Lcom/zykj/image/QRCodeFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/image/QRCodeFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/image/QRCodeFragment;->Companion:Lcom/zykj/image/QRCodeFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/Hilt_QRCodeFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lj3/p;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lj3/p;-><init>(Lcom/zykj/image/QRCodeFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "registerForActivityResult(\n        ActivityResultContracts.RequestPermission()\n    ) { isGranted: Boolean ->\n        if (isGranted) {\n            startCamera()\n        } else {\n            XToastUtils.warning(R.string.no_camera_permission)\n            findNavController().navigateUp()\n        }\n    }"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/image/QRCodeFragment;->requestPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 24
    .line 25
    return-void
.end method

.method private final bindCameraUseCases()V
    .locals 11

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
    new-instance v4, Landroidx/camera/core/ImageAnalysis$Builder;

    .line 40
    .line 41
    invoke-direct {v4}, Landroidx/camera/core/ImageAnalysis$Builder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v3}, Landroidx/camera/core/ImageAnalysis$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/ImageAnalysis$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Landroidx/camera/core/ImageAnalysis$Builder;->build()Landroidx/camera/core/ImageAnalysis;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lcom/zykj/image/QRCodeFragment$b;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Lcom/zykj/image/databinding/FragmentQrCodeBinding;

    .line 63
    .line 64
    iget-object v7, v7, Lcom/zykj/image/databinding/FragmentQrCodeBinding;->b:Landroidx/camera/view/PreviewView;

    .line 65
    .line 66
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Lcom/zykj/image/databinding/FragmentQrCodeBinding;

    .line 75
    .line 76
    iget-object v8, v8, Lcom/zykj/image/databinding/FragmentQrCodeBinding;->b:Landroidx/camera/view/PreviewView;

    .line 77
    .line 78
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, Lcom/zykj/image/databinding/FragmentQrCodeBinding;

    .line 87
    .line 88
    iget-object v9, v9, Lcom/zykj/image/databinding/FragmentQrCodeBinding;->d:Lcom/zykj/image/ViewfinderView;

    .line 89
    .line 90
    const-string v10, "mBindView.viewFinder"

    .line 91
    .line 92
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v10, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;

    .line 96
    .line 97
    invoke-direct {v10, p0}, Lcom/zykj/image/QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1;-><init>(Lcom/zykj/image/QRCodeFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v6, v7, v8, v9, v10}, Lcom/zykj/image/QRCodeFragment$b;-><init>(IILcom/zykj/image/ViewfinderView;Lx7/l;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v5, v6}, Landroidx/camera/core/ImageAnalysis;->setAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V

    .line 104
    .line 105
    .line 106
    const-string v5, "Builder()\n            .setTargetAspectRatio(AspectRatio.RATIO_4_3)\n            .build().apply {\n                this@apply.setAnalyzer(\n                    Executors.newSingleThreadExecutor(),\n                    QrCodeAnalyzer(\n                        mBindView.prevView.width,\n                        mBindView.prevView.height,\n                        mBindView.viewFinder\n                    ) { result ->\n                        lifecycleScope.launch(Dispatchers.Main) {\n\n                            val vibrator =\n                                requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator\n                            vibrator.vibrate(200L, null)\n\n                            setFragmentResult(\n                                RESULT_QR_KEY,\n                                bundleOf(RESULT_QR_TEXT to result)\n                            )\n\n                            findNavController().navigateUp()\n                        }\n                    }\n                )\n            }"

    .line 107
    .line 108
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v5, p0, Lcom/zykj/image/QRCodeFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 112
    .line 113
    if-nez v5, :cond_0

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {v5}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 117
    .line 118
    .line 119
    :goto_0
    :try_start_0
    iget-object v5, p0, Lcom/zykj/image/QRCodeFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 120
    .line 121
    if-nez v5, :cond_1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    const/4 v6, 0x2

    .line 125
    new-array v6, v6, [Landroidx/camera/core/UseCase;

    .line 126
    .line 127
    aput-object v2, v6, v3

    .line 128
    .line 129
    aput-object v4, v6, v1

    .line 130
    .line 131
    invoke-virtual {v5, p0, v0, v6}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-nez v0, :cond_2

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lcom/zykj/image/QRCodeFragment;->mCameraControl:Landroidx/camera/core/CameraControl;

    .line 143
    .line 144
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Lcom/zykj/image/databinding/FragmentQrCodeBinding;

    .line 149
    .line 150
    iget-object v0, v0, Lcom/zykj/image/databinding/FragmentQrCodeBinding;->b:Landroidx/camera/view/PreviewView;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v2, v0}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :catch_0
    move-exception v0

    .line 161
    const-string v1, "QRCodeFragment"

    .line 162
    .line 163
    const-string v2, "Use case binding failed"

    .line 164
    .line 165
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public static synthetic g(Lcom/zykj/image/QRCodeFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/QRCodeFragment;->requestPermissionLauncher$lambda-0(Lcom/zykj/image/QRCodeFragment;Z)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/image/QRCodeFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/QRCodeFragment;->setUpCamera$lambda-3$lambda-2(Lcom/zykj/image/QRCodeFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/image/QRCodeFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/QRCodeFragment;->initView$lambda-1(Lcom/zykj/image/QRCodeFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda-1(Lcom/zykj/image/QRCodeFragment;Landroid/view/View;)V
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

.method private final requestCameraPermission()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment;->requestPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

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

.method private static final requestPermissionLauncher$lambda-0(Lcom/zykj/image/QRCodeFragment;Z)V
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
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment;->startCamera()V

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
    new-instance v1, Lj3/n;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lj3/n;-><init>(Lcom/zykj/image/QRCodeFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_QRCodeFragment;->getContext()Landroid/content/Context;

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

.method private static final setUpCamera$lambda-3$lambda-2(Lcom/zykj/image/QRCodeFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
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
    iput-object p1, p0, Lcom/zykj/image/QRCodeFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment;->bindCameraUseCases()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final startCamera()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment;->setUpCamera()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "android.permission.CAMERA"

    .line 6
    .line 7
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment;->startCamera()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/zykj/image/QRCodeFragment;->requestCameraPermission()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/image/databinding/FragmentQrCodeBinding;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentQrCodeBinding;->a:Landroid/widget/ImageView;

    .line 27
    .line 28
    new-instance p2, Lj3/o;

    .line 29
    .line 30
    invoke-direct {p2, p0}, Lj3/o;-><init>(Lcom/zykj/image/QRCodeFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 37
    .line 38
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/image/R$layout;->fragment_qr_code:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
