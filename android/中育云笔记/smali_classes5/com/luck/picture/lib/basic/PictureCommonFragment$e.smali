.class public Lcom/luck/picture/lib/basic/PictureCommonFragment$e;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/basic/PictureCommonFragment;->F(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Lcom/luck/picture/lib/basic/PictureCommonFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->h:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->k()Ljava/util/ArrayList;

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
    check-cast p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->l(Ljava/util/ArrayList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->h:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 20
    .line 21
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 31
    .line 32
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 33
    .line 34
    new-instance v0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e$a;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$e$a;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment$e;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    throw v0
.end method

.method public l(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;->i:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->q(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
