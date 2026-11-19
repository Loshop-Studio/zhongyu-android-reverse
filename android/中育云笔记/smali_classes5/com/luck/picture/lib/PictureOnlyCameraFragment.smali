.class public Lcom/luck/picture/lib/PictureOnlyCameraFragment;
.super Lcom/luck/picture/lib/basic/PictureCommonFragment;
.source "SourceFile"


# static fields
.field public static final m:Ljava/lang/String; = "PictureOnlyCameraFragment"


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

.method public static U0()Lcom/luck/picture/lib/PictureOnlyCameraFragment;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureOnlyCameraFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/PictureOnlyCameraFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public P(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lw6/a;->c(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {}, La7/j;->e()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, La7/j;->f()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 30
    .line 31
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lh6/a;->a()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lw6/a;->f(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_0
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->A0()V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lw6/a;->c(Landroid/content/Context;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget v1, Lcom/luck/picture/lib/R$string;->ps_camera:I

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {p1, v1}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {}, La7/j;->f()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 85
    .line 86
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-static {}, Lh6/a;->a()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lw6/a;->f(Landroid/content/Context;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    :goto_1
    if-nez p1, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget v1, Lcom/luck/picture/lib/R$string;->ps_jurisdiction:I

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {p1, v1}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 119
    .line 120
    .line 121
    :goto_3
    new-array p1, v0, [Ljava/lang/String;

    .line 122
    .line 123
    sput-object p1, Lw6/b;->a:[Ljava/lang/String;

    .line 124
    .line 125
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_1

    .line 5
    .line 6
    invoke-static {}, La7/j;->e()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->A0()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lw6/b;->c:[Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Lcom/luck/picture/lib/PictureOnlyCameraFragment$a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureOnlyCameraFragment$a;-><init>(Lcom/luck/picture/lib/PictureOnlyCameraFragment;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0, p2, v0}, Lw6/a;->i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method
