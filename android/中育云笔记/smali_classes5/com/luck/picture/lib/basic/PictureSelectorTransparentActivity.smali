.class public Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private J()V
    .locals 4

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->S()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->C()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->V()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v1}, La7/o;->c(I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 33
    .line 34
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_1
    invoke-static {v2}, La7/o;->c(I)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 45
    .line 46
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :cond_2
    invoke-static {p0, v1, v2, v0}, Lp6/a;->a(Landroidx/appcompat/app/AppCompatActivity;IIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private M()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.luck.picture.lib.mode_type_source"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->q:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->j1()Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x2

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 26
    .line 27
    sget-object v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->P:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->U1()Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "com.luck.picture.lib.current_preview_position"

    .line 38
    .line 39
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-static {}, Lu6/a;->m()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v6, "com.luck.picture.lib.external_preview_display_delete"

    .line 57
    .line 58
    invoke-virtual {v4, v6, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->i2(IILjava/util/ArrayList;Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v0, Lcom/luck/picture/lib/PictureOnlyCameraFragment;->m:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {}, Lcom/luck/picture/lib/PictureOnlyCameraFragment;->U0()Lcom/luck/picture/lib/PictureOnlyCameraFragment;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4, v3}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-static {v2, v0, v1}, Lk6/a;->b(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.luck.picture.lib.mode_type_source"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    return v2
.end method

.method public final L()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x33

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 16
    .line 17
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 21
    .line 22
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public finish()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "com.luck.picture.lib.mode_type_source"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 27
    .line 28
    invoke-virtual {v0}, Lz6/a;->e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v0, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->d:I

    .line 33
    .line 34
    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget v0, Lcom/luck/picture/lib/R$anim;->ps_anim_fade_out:I

    .line 39
    .line 40
    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;->J()V

    .line 5
    .line 6
    .line 7
    # RE layout layout/ps_empty (0x7f0c0131), APK res/wt.xml
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_empty:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;->K()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;->L()V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-direct {p0}, Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;->M()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
