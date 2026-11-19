.class public Lcom/luck/picture/lib/PictureSelectorSystemFragment;
.super Lcom/luck/picture/lib/basic/PictureCommonFragment;
.source "SourceFile"


# static fields
.field public static final q:Ljava/lang/String; = "PictureSelectorSystemFragment"


# instance fields
.field public m:Landroidx/activity/result/ActivityResultLauncher;

.field public n:Landroidx/activity/result/ActivityResultLauncher;

.field public o:Landroidx/activity/result/ActivityResultLauncher;

.field public p:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic U0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->k1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic V0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic W0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Y0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Z0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic a1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static j1()Lcom/luck/picture/lib/PictureSelectorSystemFragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public W()I
    .locals 1

    .line 1
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_empty:I

    .line 2
    .line 3
    return v0
.end method

.method public Z([Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 7
    .line 8
    invoke-static {}, La7/j;->f()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 15
    .line 16
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lh6/a;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lw6/a;->d(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->k1()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget v1, Lcom/luck/picture/lib/R$string;->ps_jurisdiction:I

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {p1, v1}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 53
    .line 54
    .line 55
    :goto_1
    new-array p1, v0, [Ljava/lang/String;

    .line 56
    .line 57
    sput-object p1, Lw6/b;->a:[Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$i;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->p:Landroidx/activity/result/ActivityResultLauncher;

    .line 16
    .line 17
    return-void
.end method

.method public final e1()V
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$g;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->o:Landroidx/activity/result/ActivityResultLauncher;

    .line 16
    .line 17
    return-void
.end method

.method public final f1()V
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$c;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorSystemFragment$d;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$d;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->m:Landroidx/activity/result/ActivityResultLauncher;

    .line 16
    .line 17
    return-void
.end method

.method public final g1()V
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$e;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorSystemFragment$f;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$f;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->n:Landroidx/activity/result/ActivityResultLauncher;

    .line 16
    .line 17
    return-void
.end method

.method public final h1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_1

    .line 7
    .line 8
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 9
    .line 10
    invoke-static {}, Ll6/d;->a()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->g1()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->d1()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 25
    .line 26
    invoke-static {}, Ll6/d;->a()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->f1()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->e1()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final i1()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 4
    .line 5
    invoke-static {}, Ll6/d;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, "video/*"

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 15
    .line 16
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 17
    .line 18
    invoke-static {}, Ll6/d;->b()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    const-string v0, "audio/*"

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    const-string v0, "image/*"

    .line 28
    .line 29
    return-object v0
.end method

.method public final k1()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 7
    .line 8
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const-string v3, "image/*,video/*"

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 16
    .line 17
    invoke-static {}, Ll6/d;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->n:Landroidx/activity/result/ActivityResultLauncher;

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->p:Landroidx/activity/result/ActivityResultLauncher;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->i1()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 40
    .line 41
    invoke-static {}, Ll6/d;->a()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->m:Landroidx/activity/result/ActivityResultLauncher;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->o:Landroidx/activity/result/ActivityResultLauncher;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->i1()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->m:Landroidx/activity/result/ActivityResultLauncher;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->n:Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->o:Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->p:Landroidx/activity/result/ActivityResultLauncher;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 30
    .line 31
    .line 32
    :cond_3
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->h1()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, La7/j;->f()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lh6/a;->a()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lw6/a;->d(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    :goto_0
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->k1()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    sget-object p1, Lw6/b;->b:[Ljava/lang/String;

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-virtual {p0, p2, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 45
    .line 46
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;-><init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p0, p1, v0}, Lw6/a;->i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
