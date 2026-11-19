# RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。
.class public final Lcom/zykj/image/ImageCropFragment;
.super Lcom/zykj/image/Hilt_ImageCropFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/image/ImageCropFragment$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/image/ImageCropFragment$a;

.field public static final IMAGE_PATH:Ljava/lang/String; = "result_image_crop_path"

.field public static final RESULT_IMAGE_PATH_KEY:Ljava/lang/String; = "result_image_crop_key"


# instance fields
.field private final args$delegate:Landroidx/navigation/NavArgsLazy;

.field private localFilePath:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private processJob:Lkotlinx/coroutines/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/image/ImageCropFragment$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/image/ImageCropFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/image/ImageCropFragment;->Companion:Lcom/zykj/image/ImageCropFragment$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/image/ImageCropFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/image/ImageCropFragment$special$$inlined$navArgs$1;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/image/ImageCropFragment$special$$inlined$navArgs$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/image/ImageCropFragment;->args$delegate:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/image/ImageCropFragment;->localFilePath:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic access$getArgs(Lcom/zykj/image/ImageCropFragment;)Lcom/zykj/image/ImageCropFragmentArgs;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->getArgs()Lcom/zykj/image/ImageCropFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLocalFilePath$p(Lcom/zykj/image/ImageCropFragment;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/image/ImageCropFragment;->localFilePath:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$saveToLocal(Lcom/zykj/image/ImageCropFragment;Landroid/graphics/Bitmap;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment;->saveToLocal(Landroid/graphics/Bitmap;Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImageCropFragment;->showCropDialog$lambda-3(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private final getArgs()Lcom/zykj/image/ImageCropFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment;->args$delegate:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/image/ImageCropFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lcom/zykj/image/ImageCropFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImageCropFragment;->initView$lambda-0(Lcom/zykj/image/ImageCropFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImageCropFragment;->showCropDialog$lambda-4(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final initView$lambda-0(Lcom/zykj/image/ImageCropFragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/image/databinding/FragmentImageCropBinding;->c:Landroid/widget/ProgressBar;

    .line 23
    .line 24
    const-string v1, "mBindView.progressBar"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/image/databinding/FragmentImageCropBinding;->d:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImagePath(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 50
    .line 51
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;->d:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 52
    .line 53
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->getArgs()Lcom/zykj/image/ImageCropFragmentArgs;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/zykj/image/ImageCropFragmentArgs;->b()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setFixedAspectRatio(Z)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->getArgs()Lcom/zykj/image/ImageCropFragmentArgs;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/zykj/image/ImageCropFragmentArgs;->b()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 79
    .line 80
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;->d:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 81
    .line 82
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->getArgs()Lcom/zykj/image/ImageCropFragmentArgs;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/zykj/image/ImageCropFragmentArgs;->d()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->getArgs()Lcom/zykj/image/ImageCropFragmentArgs;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Lcom/zykj/image/ImageCropFragmentArgs;->e()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-virtual {p1, v0, p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d(II)V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method private static final initView$lambda-1(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V
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

.method private static final initView$lambda-2(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/image/ImageCropFragment;->showCropDialog()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic j(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImageCropFragment;->initView$lambda-2(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/image/ImageCropFragment;->initView$lambda-1(Lcom/zykj/image/ImageCropFragment;Landroid/view/View;)V

    return-void
.end method

# RE I/O 编码位图（Bitmap.compress）。
.method private final saveToLocal(Landroid/graphics/Bitmap;Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileOutputStream;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 12
    .line 13
    const/16 v1, 0x5a

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {v0, p1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    :catchall_1
    move-exception p2

    .line 26
    invoke-static {v0, p1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2
.end method

.method private final showCropDialog()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget v1, Lcom/zykj/image/R$string;->cutting:I

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->B(ZI)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lj3/a;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lj3/a;-><init>(Lcom/zykj/image/ImageCropFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lj3/b;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lj3/b;-><init>(Lcom/zykj/image/ImageCropFragment;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v1, Lcom/zykj/image/R$string;->cancel:I

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->u(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method private static final showCropDialog$lambda-3(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/image/ImageCropFragment;->processJob:Lkotlinx/coroutines/n;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 p1, 0x1

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, v0, p1, v0}, Lkotlinx/coroutines/n$a;->a(Lkotlinx/coroutines/n;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final showCropDialog$lambda-4(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;-><init>(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment;->processJob:Lkotlinx/coroutines/n;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6
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
    instance-of v0, p1, Lcom/zykj/image/ImageCropFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/image/ImageCropFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->d:I

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
    iput v1, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/image/ImageCropFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/image/ImageCropFragment$initData$1;-><init>(Lcom/zykj/image/ImageCropFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v2, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lcom/zykj/image/ImageCropFragment;

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object p0, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iput v4, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->d:I

    .line 67
    .line 68
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v1, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move-object v2, p0

    .line 76
    :goto_1
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v4, Lcom/zykj/image/ImageCropFragment$initData$2;

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-direct {v4, v2, v5}, Lcom/zykj/image/ImageCropFragment$initData$2;-><init>(Lcom/zykj/image/ImageCropFragment;Lm7/c;)V

    .line 84
    .line 85
    .line 86
    iput-object v5, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    iput v3, v0, Lcom/zykj/image/ImageCropFragment$initData$1;->d:I

    .line 89
    .line 90
    invoke-static {p1, v4, v0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v1, :cond_5

    .line 95
    .line 96
    :goto_2
    return-object v1

    .line 97
    :cond_5
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 98
    .line 99
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 1
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
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment;->localFilePath:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lj3/c;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lj3/c;-><init>(Lcom/zykj/image/ImageCropFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;->a:Landroid/widget/ImageView;

    .line 22
    .line 23
    new-instance p2, Lj3/d;

    .line 24
    .line 25
    invoke-direct {p2, p0}, Lj3/d;-><init>(Lcom/zykj/image/ImageCropFragment;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;->b:Landroid/widget/ImageView;

    .line 38
    .line 39
    new-instance p2, Lj3/e;

    .line 40
    .line 41
    invoke-direct {p2, p0}, Lj3/e;-><init>(Lcom/zykj/image/ImageCropFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 48
    .line 49
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/image/R$layout;->fragment_image_crop:I

    .line 2
    .line 3
    return v0
.end method
