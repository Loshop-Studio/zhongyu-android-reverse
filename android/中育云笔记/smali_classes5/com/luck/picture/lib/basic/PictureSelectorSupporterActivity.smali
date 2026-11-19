.class public Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;
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


# virtual methods
.method public final J()V
    .locals 4

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->S()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->C()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->V()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v1}, La7/o;->c(I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 26
    .line 27
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :cond_0
    invoke-static {v2}, La7/o;->c(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 38
    .line 39
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    :cond_1
    invoke-static {p0, v1, v2, v0}, Lp6/a;->a(Landroidx/appcompat/app/AppCompatActivity;IIZ)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public K()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0, v1}, Lr6/b;->d(Landroid/content/Context;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/PictureSelectorFragment;->B:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, Lcom/luck/picture/lib/PictureSelectorFragment;->h2()Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, v0, v1}, Lk6/a;->a(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 6
    .line 7
    invoke-static {p1, v0}, Lk6/c;->a(Landroid/content/Context;I)Landroid/content/ContextWrapper;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lz6/a;->e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    iget v0, v0, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->d:I

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;->K()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;->J()V

    .line 5
    .line 6
    .line 7
    # RE layout layout/ps_activity_container (0x7f0c0129), APK res/d01.xml
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_activity_container:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;->L()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
