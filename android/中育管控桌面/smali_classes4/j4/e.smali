.class public final Lj4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/appcompat/app/AppCompatActivity;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkotlin/jvm/functions/Function0;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Ljava/lang/String;

.field public f:Landroidx/activity/result/ActivityResultLauncher;

.field public g:Landroidx/activity/result/ActivityResultLauncher;

.field public final h:Lj4/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onServiceConnected"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onServiceDisconnected"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 20
    .line 21
    iput-object p2, p0, Lj4/e;->b:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    iput-object p3, p0, Lj4/e;->c:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iput-object p4, p0, Lj4/e;->d:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    const-string p1, "FloatingToolManager"

    .line 28
    .line 29
    iput-object p1, p0, Lj4/e;->e:Ljava/lang/String;

    .line 30
    .line 31
    new-instance p1, Lj4/e$a;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lj4/e$a;-><init>(Lj4/e;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lj4/e;->h:Lj4/e$a;

    .line 37
    .line 38
    invoke-virtual {p0}, Lj4/e;->k()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic a(Lj4/e;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/e;->m(Lj4/e;Z)V

    return-void
.end method

.method public static synthetic b(Lj4/e;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/e;->l(Lj4/e;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static final synthetic c(Lj4/e;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lj4/e;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lj4/e;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lj4/e;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lj4/e;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 1
    iget-object p0, p0, Lj4/e;->c:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lj4/e;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lj4/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lj4/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj4/e;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Lj4/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj4/e;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final l(Lj4/e;Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lj4/e;->i()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lj4/e;->o()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final m(Lj4/e;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lj4/e;->q()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 8
    .line 9
    const-string p1, "\u8bfb\u53d6\u5b58\u50a8\u6743\u9650\u88ab\u62d2\u7edd\uff0c\u65e0\u6cd5\u663e\u793a\u56fe\u7247"

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lj4/e;->j()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "requestStoragePermissionLauncher"

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lj4/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v0

    .line 35
    :goto_0
    invoke-virtual {v2, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, p0, Lj4/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move-object v2, v0

    .line 48
    :goto_1
    invoke-virtual {v2, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lj4/e;->p()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lj4/e;->q()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lj4/b;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Lj4/b;-><init>(Lj4/e;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lj4/e;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 18
    .line 19
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 20
    .line 21
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 22
    .line 23
    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lj4/c;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lj4/c;-><init>(Lj4/e;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lj4/e;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 36
    .line 37
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v1, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "package:"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 31
    .line 32
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lj4/e;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    const-string v1, "overlayPermissionLauncher"

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :cond_0
    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final o()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 4
    .line 5
    iget-object v2, v0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;-><init>(Landroidx/appcompat/app/AppCompatActivity;Z)V

    .line 9
    .line 10
    .line 11
    const v2, 0x7f11005b

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v7, "getString(...)"

    .line 19
    .line 20
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x6

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->m(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const v1, 0x7f110059

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v12, 0x6

    .line 42
    const/4 v13, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    invoke-static/range {v8 .. v13}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->g(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    const v1, 0x7f110062

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v15

    .line 56
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/16 v23, 0xfe

    .line 60
    .line 61
    const/16 v24, 0x0

    .line 62
    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    const/16 v18, 0x0

    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/16 v20, 0x0

    .line 72
    .line 73
    const/16 v21, 0x0

    .line 74
    .line 75
    const/16 v22, 0x0

    .line 76
    .line 77
    invoke-static/range {v14 .. v24}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->i(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/4 v2, 0x1

    .line 82
    invoke-virtual {v1, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->e(Z)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    const v1, 0x7f110067

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lj4/e$b;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Lj4/e$b;-><init>(Lj4/e;)V

    .line 99
    .line 100
    .line 101
    const/16 v17, 0x7e

    .line 102
    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x0

    .line 106
    move-object/from16 v16, v1

    .line 107
    .line 108
    invoke-static/range {v8 .. v18}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->k(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->n()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final p()V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 4
    .line 5
    iget-object v2, v0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v1, v2, v3}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;-><init>(Landroidx/appcompat/app/AppCompatActivity;Z)V

    .line 9
    .line 10
    .line 11
    const v2, 0x7f11005a

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v7, "getString(...)"

    .line 19
    .line 20
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x6

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->m(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const v1, 0x7f110058

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v12, 0x6

    .line 42
    const/4 v13, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    invoke-static/range {v8 .. v13}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->g(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    const v1, 0x7f110062

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v15

    .line 56
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lj4/e$c;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lj4/e$c;-><init>(Lj4/e;)V

    .line 62
    .line 63
    .line 64
    const/16 v23, 0x7e

    .line 65
    .line 66
    const/16 v24, 0x0

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    const/16 v19, 0x0

    .line 75
    .line 76
    const/16 v20, 0x0

    .line 77
    .line 78
    const/16 v21, 0x0

    .line 79
    .line 80
    move-object/from16 v22, v1

    .line 81
    .line 82
    invoke-static/range {v14 .. v24}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->i(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 83
    .line 84
    .line 85
    move-result-object v25

    .line 86
    const v1, 0x7f110067

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lcom/blankj/utilcode/util/h0;->b(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v2, Lj4/e$d;

    .line 97
    .line 98
    invoke-direct {v2, v0}, Lj4/e$d;-><init>(Lj4/e;)V

    .line 99
    .line 100
    .line 101
    const/16 v34, 0x7e

    .line 102
    .line 103
    const/16 v35, 0x0

    .line 104
    .line 105
    const/16 v27, 0x0

    .line 106
    .line 107
    const/16 v28, 0x0

    .line 108
    .line 109
    const/16 v29, 0x0

    .line 110
    .line 111
    const/16 v30, 0x0

    .line 112
    .line 113
    const/16 v31, 0x0

    .line 114
    .line 115
    const/16 v32, 0x0

    .line 116
    .line 117
    move-object/from16 v26, v1

    .line 118
    .line 119
    move-object/from16 v33, v2

    .line 120
    .line 121
    invoke-static/range {v25 .. v35}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->k(Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/a;->n()V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final q()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v1, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 11
    .line 12
    iget-object v2, p0, Lj4/e;->h:Lj4/e$a;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final r()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj4/e;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj4/e;->a:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    iget-object v1, p0, Lj4/e;->h:Lj4/e$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
