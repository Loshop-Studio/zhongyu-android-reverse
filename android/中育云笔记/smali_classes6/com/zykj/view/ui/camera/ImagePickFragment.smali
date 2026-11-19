.class public final Lcom/zykj/view/ui/camera/ImagePickFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/ui/camera/ImagePickFragment$a;
    }
.end annotation


# static fields
.field public static final k:Lcom/zykj/view/ui/camera/ImagePickFragment$a;


# instance fields
.field public d:Landroidx/camera/lifecycle/ProcessCameraProvider;

.field public e:Landroidx/camera/core/ImageCapture;

.field public f:Landroidx/camera/core/CameraControl;

.field public g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

.field public h:Landroidx/camera/core/Camera;

.field public i:Landroidx/camera/core/Preview;

.field public final j:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/ui/camera/ImagePickFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/ui/camera/ImagePickFragment;->k:Lcom/zykj/view/ui/camera/ImagePickFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

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
    new-instance v1, Ltb/e;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Ltb/e;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "registerForActivityResult(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->j:Landroidx/activity/result/ActivityResultLauncher;

    .line 24
    .line 25
    return-void
.end method

.method private final A()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->j:Landroidx/activity/result/ActivityResultLauncher;

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

.method public static final B(Lcom/zykj/view/ui/camera/ImagePickFragment;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->E()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "\u6ca1\u6709\u7167\u76f8\u673a\u6743\u9650"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final C()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/lifecycle/ProcessCameraProvider;->Companion:Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;->getInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ltb/a;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Ltb/a;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final D(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->d:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->v()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final E()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->C()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final F()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->w()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->uri2File(Landroid/net/Uri;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_0
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ".webp"

    .line 52
    .line 53
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    new-instance v1, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;-><init>(Ljava/io/File;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;->build()Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "build(...)"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->e:Landroidx/camera/core/ImageCapture;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v3, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;

    .line 86
    .line 87
    invoke-direct {v3, p0}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v0, v2, v3}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
.end method

.method private final initData()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/camera/core/Preview$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/core/Preview$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/Preview$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->i:Landroidx/camera/core/Preview;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string v1, "mBindView"

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->h:Landroidx/camera/view/PreviewView;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "android.permission.CAMERA"

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->E()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->A()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final initView()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBindView"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 13
    .line 14
    const-string v0, "capture"

    .line 15
    .line 16
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v6, Ltb/b;

    .line 20
    .line 21
    invoke-direct {v6, p0}, Ltb/b;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 22
    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    const/4 v8, 0x0

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_1
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->c:Landroid/widget/ImageView;

    .line 40
    .line 41
    const-string v0, "cancel"

    .line 42
    .line 43
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Ltb/c;

    .line 47
    .line 48
    invoke-direct {v6, p0}, Ltb/c;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 49
    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    const-wide/16 v4, 0x0

    .line 54
    .line 55
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v1, v0

    .line 67
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->e:Landroid/widget/CheckBox;

    .line 68
    .line 69
    new-instance v1, Ltb/d;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Ltb/d;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->y(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->x(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/ui/camera/ImagePickFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->B(Lcom/zykj/view/ui/camera/ImagePickFragment;Z)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment;->z(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->D(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public static final synthetic t(Lcom/zykj/view/ui/camera/ImagePickFragment;)Landroidx/camera/core/Camera;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->h:Landroidx/camera/core/Camera;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method private final v()V
    .locals 8

    .line 1
    new-instance v0, Landroidx/camera/core/ImageCapture$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageCapture$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/ImageCapture$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->e:Landroidx/camera/core/ImageCapture;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->d:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "getViewLifecycleOwner(...)"

    .line 29
    .line 30
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Landroidx/camera/core/CameraSelector$Builder;

    .line 34
    .line 35
    invoke-direct {v3}, Landroidx/camera/core/CameraSelector$Builder;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-virtual {v3, v4}, Landroidx/camera/core/CameraSelector$Builder;->requireLensFacing(I)Landroidx/camera/core/CameraSelector$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Landroidx/camera/core/CameraSelector$Builder;->build()Landroidx/camera/core/CameraSelector;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v5, "build(...)"

    .line 48
    .line 49
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->e:Landroidx/camera/core/ImageCapture;

    .line 53
    .line 54
    iget-object v6, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->i:Landroidx/camera/core/Preview;

    .line 55
    .line 56
    const/4 v7, 0x2

    .line 57
    new-array v7, v7, [Landroidx/camera/core/UseCase;

    .line 58
    .line 59
    aput-object v5, v7, v1

    .line 60
    .line 61
    aput-object v6, v7, v4

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3, v7}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->f:Landroidx/camera/core/CameraControl;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->h:Landroidx/camera/core/Camera;

    .line 74
    .line 75
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 76
    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    const-string v0, "mBindView"

    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->h:Landroidx/camera/view/PreviewView;

    .line 86
    .line 87
    const-string v1, "prevView"

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Lcom/zykj/view/ui/camera/ImagePickFragment$b;

    .line 97
    .line 98
    invoke-direct {v2, v0, p0}, Lcom/zykj/view/ui/camera/ImagePickFragment$b;-><init>(Landroid/view/View;Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public static final x(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, "mBindView"

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->F()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static final y(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final z(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->f:Landroidx/camera/core/CameraControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p2}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "mBindView"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->f:Landroidx/camera/core/CameraControl;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment;->g:Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "mBindView"

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->e:Landroid/widget/CheckBox;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->initView()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->initData()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final w()Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "Uri"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/net/Uri;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method
