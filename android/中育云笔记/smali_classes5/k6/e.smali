.class public final Lk6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public final b:Lk6/f;


# direct methods
.method public constructor <init>(Lk6/f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6/e;->b:Lk6/f;

    .line 5
    .line 6
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->b()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lk6/e;->a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 11
    .line 12
    iput p2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 13
    .line 14
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lk6/e;->e(I)Lk6/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(Lq6/l;)V
    .locals 3

    .line 1
    invoke-static {}, La7/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lk6/e;->b:Lk6/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lk6/f;->c()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lk6/e;->a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput-boolean v2, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v0:Z

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput-boolean v2, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 24
    .line 25
    sput-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q0:Lq6/l;

    .line 26
    .line 27
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget p1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 32
    .line 33
    invoke-static {}, Ll6/d;->b()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ne p1, v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string v0, "imageEngine is null,Please implement ImageEngine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    new-instance p1, Landroid/content/Intent;

    .line 49
    .line 50
    const-class v1, Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;

    .line 51
    .line 52
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 59
    .line 60
    invoke-virtual {p1}, Lz6/a;->e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget p1, p1, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->c:I

    .line 65
    .line 66
    sget v1, Lcom/luck/picture/lib/R$anim;->ps_anim_fade_in:I

    .line 67
    .line 68
    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 73
    .line 74
    const-string v0, "OnResultCallbackListener cannot be null"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 81
    .line 82
    const-string v0, "Activity cannot be null"

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_4
    return-void
.end method

.method public b(Z)Lk6/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lk6/e;->a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iput-boolean p1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ln6/a;)Lk6/e;
    .locals 0

    .line 1
    sput-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Lk6/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lk6/e;->a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    move p1, v2

    .line 9
    :cond_0
    iput p1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 10
    .line 11
    return-object p0
.end method

.method public e(I)Lk6/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lk6/e;->a:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 4
    .line 5
    invoke-static {}, Ll6/d;->d()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :cond_0
    iput p1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 13
    .line 14
    return-object p0
.end method
