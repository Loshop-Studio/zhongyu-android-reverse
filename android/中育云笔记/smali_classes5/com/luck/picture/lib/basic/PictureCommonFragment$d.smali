.class public Lcom/luck/picture/lib/basic/PictureCommonFragment$d;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/basic/PictureCommonFragment;->S0(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:Lcom/luck/picture/lib/basic/PictureCommonFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->j:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->i:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->k()Ljava/util/ArrayList;

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
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->l(Ljava/util/ArrayList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->j:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 30
    .line 31
    iget-object v2, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->A()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->j:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d$a;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$d$a;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment$d;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    throw v0

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->i:Ljava/util/ArrayList;

    .line 69
    .line 70
    return-object v0
.end method

.method public l(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;->j:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->q(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
