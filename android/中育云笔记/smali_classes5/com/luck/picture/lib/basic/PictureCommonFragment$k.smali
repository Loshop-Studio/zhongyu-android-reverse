.class public Lcom/luck/picture/lib/basic/PictureCommonFragment$k;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/basic/PictureCommonFragment;->Q(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Landroid/content/Intent;

.field public final synthetic i:Lcom/luck/picture/lib/basic/PictureCommonFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->h:Landroid/content/Intent;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->k()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->l(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->h:Landroid/content/Intent;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->V(Landroid/content/Intent;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 18
    .line 19
    iput-object v0, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    return-object v0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 38
    .line 39
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 40
    .line 41
    invoke-static {}, Ll6/d;->b()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->o(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 53
    .line 54
    iget-object v1, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public l(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p(Lcom/luck/picture/lib/basic/PictureCommonFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
