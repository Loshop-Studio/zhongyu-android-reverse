.class public final Lcom/friday/common/camera/CameraActivity;
.super Lcom/friday/common/camera/Hilt_CameraActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/camera/CameraActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/camera/Hilt_CameraActivity<",
        "Lcom/friday/common/databinding/ActivityImageBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final i:Lcom/friday/common/camera/CameraActivity$a;

.field public static final j:I


# instance fields
.field public g:Lj2/b;

.field public final h:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/camera/CameraActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/camera/CameraActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/camera/CameraActivity;->i:Lcom/friday/common/camera/CameraActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/camera/CameraActivity;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/Hilt_CameraActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/common/camera/CameraViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/common/camera/CameraActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/common/camera/CameraActivity;->h:Lqc/d;

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic N(Lcom/friday/common/camera/CameraActivity;)Lcom/friday/common/camera/CameraViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraActivity;->P()Lcom/friday/common/camera/CameraViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final O()Lj2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraActivity;->g:Lj2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iClassManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final P()Lcom/friday/common/camera/CameraViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraActivity;->h:Lqc/d;

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

.method public final Q(Landroid/content/Intent;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string v0, "CAMERA_BEAN"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/friday/common/camera/CameraBean;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, Lcom/friday/common/R$id;->fragment_container:I

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/friday/common/camera/CameraBean;->h()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    sget-object v2, Lcom/friday/common/camera/ImagePickFragment;->x:Lcom/friday/common/camera/ImagePickFragment$a;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Lcom/friday/common/camera/ImagePickFragment$a;->a(Lcom/friday/common/camera/CameraBean;)Lcom/friday/common/camera/ImagePickFragment;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v2, Lcom/friday/common/camera/ImageCropFragment;->m:Lcom/friday/common/camera/ImageCropFragment$a;

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lcom/friday/common/camera/ImageCropFragment$a;->a(Lcom/friday/common/camera/CameraBean;)Lcom/friday/common/camera/ImageCropFragment;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    const-string v0, "\u53c2\u6570\u4e0d\u5bf9"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_image (0x7f0c001d), APK res/ju.xml
    sget v0, Lcom/friday/common/R$layout;->activity_image:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraActivity;->O()Lj2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lj2/b;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraActivity;->O()Lj2/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {v0, v1}, Lj2/b;->a(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lcom/friday/common/camera/CameraActivity;->Q(Landroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v4, Lcom/friday/common/camera/CameraActivity$initData$3;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {v4, p0, v0}, Lcom/friday/common/camera/CameraActivity$initData$3;-><init>(Lcom/friday/common/camera/CameraActivity;Lvc/c;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/camera/Hilt_CameraActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraActivity;->O()Lj2/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lj2/b;->g()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/camera/CameraActivity;->O()Lj2/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-interface {v0, v1}, Lj2/b;->a(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/friday/common/camera/CameraActivity;->Q(Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
