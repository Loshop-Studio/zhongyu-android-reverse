.class public final Lcom/friday/common/camera/ImageCropFragment;
.super Lcom/friday/common/camera/Hilt_ImageCropFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/camera/ImageCropFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/camera/Hilt_ImageCropFragment<",
        "Lcom/friday/common/databinding/FragmentImageCropBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/friday/common/camera/ImageCropFragment$a;

.field public static final n:I


# instance fields
.field public i:Lcom/friday/common/databinding/FragmentImageCropBinding;

.field public j:Lcom/friday/common/camera/CameraBean;

.field public k:Z

.field public final l:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/camera/ImageCropFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/camera/ImageCropFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/camera/ImageCropFragment;->m:Lcom/friday/common/camera/ImageCropFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/camera/ImageCropFragment;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/Hilt_ImageCropFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/common/camera/CameraViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/common/camera/ImageCropFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/common/camera/ImageCropFragment;->l:Lqc/d;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic A(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/camera/ImageCropFragment;->I(Landroid/graphics/Bitmap;ZLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImageCropFragment;->J(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final D()Lcom/friday/common/camera/CameraViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/camera/CameraViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final E(Lcom/friday/common/camera/ImageCropFragment;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p2, p1

    .line 15
    :goto_0
    iput-boolean p2, p0, Lcom/friday/common/camera/ImageCropFragment;->k:Z

    .line 16
    .line 17
    iget-object p2, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const-string v1, "mBindView"

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p2, v0

    .line 28
    :cond_1
    iget-object p2, p2, Lcom/friday/common/databinding/FragmentImageCropBinding;->e:Landroid/widget/ProgressBar;

    .line 29
    .line 30
    const-string v2, "progressBar"

    .line 31
    .line 32
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x8

    .line 36
    .line 37
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 41
    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v0, p2

    .line 49
    :goto_1
    iget-object p2, v0, Lcom/friday/common/databinding/FragmentImageCropBinding;->d:Landroid/widget/ImageView;

    .line 50
    .line 51
    iget-boolean v0, p0, Lcom/friday/common/camera/ImageCropFragment;->k:Z

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 54
    .line 55
    .line 56
    if-eqz p3, :cond_3

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    new-instance p3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v0, "\u9875\u9762ImageCropFragment -> \u56fe\u7247\u52a0\u8f7d\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 68
    .line 69
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string p2, "\u56fe\u7247\u52a0\u8f7d\u5931\u8d25"

    .line 87
    .line 88
    new-array p1, p1, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/friday/common/camera/ImageCropFragment;->C()V

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method

.method public static final F(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/camera/ImageCropFragment;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "\u9875\u9762ImageCropFragment -> \u56fe\u7247\u52a0\u8f7d\u8d85\u65f6"

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v1, "\u56fe\u7247\u52a0\u8f7d\u8d85\u65f6"

    .line 24
    .line 25
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/common/camera/ImageCropFragment;->C()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public static final G(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/ImageCropFragment;->D()Lcom/friday/common/camera/CameraViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraViewModel;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final H(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v4, p0, p1}, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;-><init>(Lcom/friday/common/camera/ImageCropFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic r(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/camera/ImageCropFragment;->F(Lcom/friday/common/camera/ImageCropFragment;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImageCropFragment;->H(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/friday/common/camera/ImageCropFragment;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/camera/ImageCropFragment;->E(Lcom/friday/common/camera/ImageCropFragment;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImageCropFragment;->G(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic v(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/ImageCropFragment;->C()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic w(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/camera/CameraBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImageCropFragment;->j:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/databinding/FragmentImageCropBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/camera/CameraViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/ImageCropFragment;->D()Lcom/friday/common/camera/CameraViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lcom/friday/common/camera/ImageCropFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/friday/common/camera/ImageCropFragment;->k:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final C()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final I(Landroid/graphics/Bitmap;ZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->a()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;-><init>(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;ZLvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final J(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    const-string v0, "x"

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x40200000    # 2.5f

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/high16 p2, 0x40000000    # 2.0f

    .line 9
    .line 10
    :goto_0
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-float v1, v1

    .line 23
    mul-float/2addr v1, p2

    .line 24
    float-to-int p2, v1

    .line 25
    const/16 v1, 0x1000

    .line 26
    .line 27
    invoke-static {p2, v1}, Lnd/o;->i(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-double v3, v3

    .line 48
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    int-to-double v5, v5

    .line 53
    mul-double/2addr v3, v5

    .line 54
    const-wide v5, 0x4166e36000000000L    # 1.2E7

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    if-lt v2, p2, :cond_1

    .line 60
    .line 61
    if-gt v2, v1, :cond_1

    .line 62
    .line 63
    cmpg-double v1, v3, v5

    .line 64
    .line 65
    if-gtz v1, :cond_1

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_1
    int-to-float p2, p2

    .line 69
    int-to-float v1, v2

    .line 70
    div-float/2addr p2, v1

    .line 71
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    int-to-float v1, v1

    .line 76
    const/high16 v2, 0x45800000    # 4096.0f

    .line 77
    .line 78
    div-float v1, v2, v1

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    int-to-float v7, v7

    .line 85
    div-float/2addr v2, v7

    .line 86
    div-double/2addr v5, v3

    .line 87
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v3

    .line 91
    double-to-float v3, v3

    .line 92
    const/4 v4, 0x3

    .line 93
    new-array v4, v4, [F

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    aput v1, v4, v5

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    aput v2, v4, v1

    .line 100
    .line 101
    const/4 v2, 0x2

    .line 102
    aput v3, v4, v2

    .line 103
    .line 104
    invoke-static {p2, v4}, Luc/c;->k(F[F)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    const/high16 v2, 0x3f800000    # 1.0f

    .line 109
    .line 110
    cmpg-float v2, p2, v2

    .line 111
    .line 112
    if-nez v2, :cond_2

    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    int-to-float v2, v2

    .line 120
    mul-float/2addr v2, p2

    .line 121
    float-to-int v2, v2

    .line 122
    invoke-static {v2, v1}, Lnd/o;->e(II)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    int-to-float v3, v3

    .line 131
    mul-float/2addr v3, p2

    .line 132
    float-to-int p2, v3

    .line 133
    invoke-static {p2, v1}, Lnd/o;->e(II)I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    :try_start_0
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 138
    .line 139
    invoke-static {p1, v2, p2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v6, "\u9875\u9762ImageCropFragment -> \u88c1\u526a\u56fe\u7247\u5c3a\u5bf8\u8fc7\u5927\uff0c\u538b\u7f29\u540e\u63d2\u5165\uff0c\u539f\u5c3a\u5bf8="

    .line 165
    .line 166
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, "\uff0c\u65b0\u5c3a\u5bf8="

    .line 179
    .line 180
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    goto :goto_1

    .line 208
    :catchall_0
    move-exception p2

    .line 209
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 210
    .line 211
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-nez v0, :cond_3

    .line 224
    .line 225
    move-object p1, p2

    .line 226
    goto :goto_2

    .line 227
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v1, "\u9875\u9762ImageCropFragment -> \u88c1\u526a\u56fe\u7247\u538b\u7f29\u5931\u8d25\uff0c\u6cbf\u7528\u539f\u56fe\uff0c\u5f02\u5e38="

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :goto_2
    check-cast p1, Landroid/graphics/Bitmap;

    .line 256
    .line 257
    return-object p1
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/common/R$layout;->fragment_image_crop:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment;->j:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lcom/friday/common/camera/ImageCropFragment;->k:Z

    .line 7
    .line 8
    iget-object v2, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const-string v4, "mBindView"

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v3

    .line 19
    :cond_0
    iget-object v2, v2, Lcom/friday/common/databinding/FragmentImageCropBinding;->e:Landroid/widget/ProgressBar;

    .line 20
    .line 21
    const-string v5, "progressBar"

    .line 22
    .line 23
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v3

    .line 37
    :cond_1
    iget-object v2, v2, Lcom/friday/common/databinding/FragmentImageCropBinding;->d:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v1, v3

    .line 50
    :cond_2
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 51
    .line 52
    new-instance v2, Lb2/g;

    .line 53
    .line 54
    invoke-direct {v2, p0}, Lb2/g;-><init>(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lcom/canhub/cropper/CropImageView;->setOnSetImageUriCompleteListener(Lcom/canhub/cropper/CropImageView$g;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v1, v3

    .line 68
    :cond_3
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 69
    .line 70
    new-instance v2, Ljava/io/File;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->i()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1, v2}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 87
    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object v1, v3

    .line 94
    :cond_4
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 95
    .line 96
    new-instance v2, Lb2/h;

    .line 97
    .line 98
    invoke-direct {v2, p0}, Lb2/h;-><init>(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 99
    .line 100
    .line 101
    const-wide/16 v5, 0x2710

    .line 102
    .line 103
    invoke-virtual {v1, v2, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 107
    .line 108
    if-nez v1, :cond_5

    .line 109
    .line 110
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v3

    .line 114
    :cond_5
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->g()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {v1, v2}, Lcom/canhub/cropper/CropImageView;->setFixedAspectRatio(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->g()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 130
    .line 131
    if-nez v1, :cond_6

    .line 132
    .line 133
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v1, v3

    .line 137
    :cond_6
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->j()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->k()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {v1, v2, v0}, Lcom/canhub/cropper/CropImageView;->o(II)V

    .line 148
    .line 149
    .line 150
    :cond_7
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 151
    .line 152
    if-nez v0, :cond_8

    .line 153
    .line 154
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object v0, v3

    .line 158
    :cond_8
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImageCropBinding;->c:Landroid/widget/ImageView;

    .line 159
    .line 160
    new-instance v1, Lb2/i;

    .line 161
    .line 162
    invoke-direct {v1, p0}, Lb2/i;-><init>(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 169
    .line 170
    if-nez v0, :cond_9

    .line 171
    .line 172
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_9
    move-object v3, v0

    .line 177
    :goto_0
    iget-object v0, v3, Lcom/friday/common/databinding/FragmentImageCropBinding;->d:Landroid/widget/ImageView;

    .line 178
    .line 179
    new-instance v1, Lb2/j;

    .line 180
    .line 181
    invoke-direct {v1, p0}, Lb2/j;-><init>(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 182
    .line 183
    .line 184
    const-wide/16 v2, 0x7d0

    .line 185
    .line 186
    invoke-static {v0, v2, v3, v1}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    const-string v1, "\u53c2\u6570\u4e0d\u5bf9"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0
.end method

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
    invoke-static {p1, p2, p3}, Lcom/friday/common/databinding/FragmentImageCropBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/common/databinding/FragmentImageCropBinding;

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
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment;->i:Lcom/friday/common/databinding/FragmentImageCropBinding;

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p2, "CAMERA_BEAN"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/common/camera/CameraBean;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment;->j:Lcom/friday/common/camera/CameraBean;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
