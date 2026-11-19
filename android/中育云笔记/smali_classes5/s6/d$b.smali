.class public Ls6/d$b;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/d;->h(Lq6/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lq6/e;

.field public final synthetic i:Ls6/d;


# direct methods
.method public constructor <init>(Ls6/d;Lq6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/d$b;->i:Ls6/d;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/d$b;->h:Lq6/e;

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
    invoke-virtual {p0}, Ls6/d$b;->k()Lcom/luck/picture/lib/entity/LocalMediaFolder;

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
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls6/d$b;->l(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Lcom/luck/picture/lib/entity/LocalMediaFolder;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/d$b;->i:Ls6/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls6/a;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ls6/d$b;->i:Ls6/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Ls6/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public l(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls6/d$b;->h:Lq6/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lq6/e;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
