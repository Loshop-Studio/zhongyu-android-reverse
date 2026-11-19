.class public final Lcom/zykj/mistake/utils/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lr6/a;

.field public c:Lr6/c;

.field public final d:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method public constructor <init>(Landroidx/activity/result/ActivityResultCaller;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/utils/g;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/camera/core/impl/d;

    .line 12
    .line 13
    const/16 v2, 0xc

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0, v1}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/utils/g;->d:Landroidx/activity/result/ActivityResultLauncher;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lr6/a;Lr6/c;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/g;->b:Lr6/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/utils/g;->c:Lr6/c;

    .line 4
    .line 5
    :try_start_0
    iget-object p2, p0, Lcom/zykj/mistake/utils/g;->d:Landroidx/activity/result/ActivityResultLauncher;

    .line 6
    .line 7
    new-instance v0, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "com.zykj.manage"

    .line 13
    .line 14
    const-string v2, "com.zykj.gallery.ui.share.ShareActivity"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const-string v1, "KEY_ENABLE_CAMERA"

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p2, Ld6/s;->a:Ld6/s;

    .line 29
    .line 30
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p2

    .line 36
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_0
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lcom/zykj/mistake/utils/g;->b:Lr6/a;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/zykj/mistake/utils/g;->c:Lr6/c;

    .line 57
    .line 58
    :cond_0
    return-void
.end method
