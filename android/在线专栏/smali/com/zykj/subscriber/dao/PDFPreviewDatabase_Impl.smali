.class public final Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;
.super Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
.source "SourceFile"


# instance fields
.field private volatile p:Le2/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;-><init>()V

    return-void
.end method

.method static synthetic F(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic H(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic I(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic J(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic K(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic L(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic M(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;Ls0/b;)Ls0/b;
    .locals 0

    iput-object p1, p0, Landroidx/room/h0;->a:Ls0/b;

    return-object p1
.end method

.method static synthetic N(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;Ls0/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/h0;->t(Ls0/b;)V

    return-void
.end method

.method static synthetic O(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic P(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/h0;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public E()Le2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->p:Le2/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->p:Le2/b;

    return-object v0

    .line 3
    :cond_0
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->p:Le2/b;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Le2/c;

    invoke-direct {v0, p0}, Le2/c;-><init>(Landroidx/room/h0;)V

    iput-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->p:Le2/b;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->p:Le2/b;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected g()Landroidx/room/o;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 2
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 3
    new-instance v1, Landroidx/room/o;

    const-string v3, "previewInfo"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/o;-><init>(Landroidx/room/h0;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected h(Landroidx/room/i;)Ls0/c;
    .locals 4

    .line 1
    new-instance v0, Landroidx/room/i0;

    new-instance v1, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;-><init>(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;I)V

    const-string v2, "43b6ca552b2fc97cead13e6104e3e4b4"

    const-string v3, "fa316293a896d0c677ebb7e47cd8e391"

    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/room/i0;-><init>(Landroidx/room/i;Landroidx/room/i0$a;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p1, Landroidx/room/i;->b:Landroid/content/Context;

    invoke-static {v1}, Ls0/c$b;->a(Landroid/content/Context;)Ls0/c$b$a;

    move-result-object v1

    iget-object v2, p1, Landroidx/room/i;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {v1, v2}, Ls0/c$b$a;->c(Ljava/lang/String;)Ls0/c$b$a;

    move-result-object v1

    .line 4
    invoke-virtual {v1, v0}, Ls0/c$b$a;->b(Ls0/c$a;)Ls0/c$b$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ls0/c$b$a;->a()Ls0/c$b;

    move-result-object v0

    .line 6
    iget-object p1, p1, Landroidx/room/i;->a:Ls0/c$c;

    invoke-interface {p1, v0}, Ls0/c$c;->a(Ls0/c$b;)Ls0/c;

    move-result-object p1

    return-object p1
.end method

.method protected n()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    const-class v1, Le2/b;

    invoke-static {}, Le2/c;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
