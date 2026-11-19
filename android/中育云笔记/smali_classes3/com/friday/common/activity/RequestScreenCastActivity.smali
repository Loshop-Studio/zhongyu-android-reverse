.class public final Lcom/friday/common/activity/RequestScreenCastActivity;
.super Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/activity/RequestScreenCastActivity$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/friday/common/activity/RequestScreenCastActivity$a;

.field public static final j:I


# instance fields
.field public g:Lj2/e;

.field public final h:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/activity/RequestScreenCastActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/activity/RequestScreenCastActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/activity/RequestScreenCastActivity;->i:Lcom/friday/common/activity/RequestScreenCastActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/activity/RequestScreenCastActivity;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, La2/f;

    .line 10
    .line 11
    invoke-direct {v1, p0}, La2/f;-><init>(Lcom/friday/common/activity/RequestScreenCastActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/friday/common/activity/RequestScreenCastActivity;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic L(Lcom/friday/common/activity/RequestScreenCastActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/activity/RequestScreenCastActivity;->N(Lcom/friday/common/activity/RequestScreenCastActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static final N(Lcom/friday/common/activity/RequestScreenCastActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 3

    .line 1
    const-string v0, "activityResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne p1, v1, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->v()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const-string p1, "\u5f00\u59cb\u677f\u6f14"

    .line 32
    .line 33
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/activity/RequestScreenCastActivity;->M()Lj2/e;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lj2/e;->f()V

    .line 41
    .line 42
    .line 43
    :cond_0
    new-instance p1, Landroid/content/Intent;

    .line 44
    .line 45
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->getTopActivity()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, Lcom/friday/common/activity/PusherService;

    .line 50
    .line 51
    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    const-string v1, "resultIntent"

    .line 55
    .line 56
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "key_port"

    .line 64
    .line 65
    const/16 v2, 0x224e

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const-string v1, "port"

    .line 72
    .line 73
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/blankj/utilcode/util/ServiceUtils;->startService(Landroid/content/Intent;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 p1, 0x0

    .line 81
    new-array p1, p1, [Ljava/lang/Object;

    .line 82
    .line 83
    const-string v0, "\u83b7\u53d6\u6295\u5c4f\u6743\u9650\u5931\u8d25"

    .line 84
    .line 85
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 89
    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final M()Lj2/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/activity/RequestScreenCastActivity;->g:Lj2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iFloatWindowManager"

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "media_projection"

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/media/projection/MediaProjectionManager;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/common/activity/RequestScreenCastActivity;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/media/projection/MediaProjectionManager;->createScreenCaptureIntent()Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "createScreenCaptureIntent(...)"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
