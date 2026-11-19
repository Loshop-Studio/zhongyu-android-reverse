.class Lcom/zykj/download/data/AppDatabase_Impl$a;
.super Landroidx/room/i0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/data/AppDatabase_Impl;->h(Landroidx/room/i;)Ls0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/zykj/download/data/AppDatabase_Impl;


# direct methods
.method constructor <init>(Lcom/zykj/download/data/AppDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-direct {p0, p2}, Landroidx/room/i0$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Ls0/b;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `download` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `downloadUrl` TEXT NOT NULL, `localPath` TEXT NOT NULL, `totalSize` INTEGER NOT NULL, `downloadSize` INTEGER NOT NULL, `verifyCode` TEXT, `flag` INTEGER NOT NULL)"

    .line 1
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `upload` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    .line 2
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 3
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'2eb05d347b056192efce82d4a1a31864\')"

    .line 4
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ls0/b;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `download`"

    .line 1
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `upload`"

    .line 2
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/download/data/AppDatabase_Impl;->F(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/download/data/AppDatabase_Impl;->G(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5
    iget-object v2, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/download/data/AppDatabase_Impl;->I(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/room/h0$b;

    invoke-virtual {v2, p1}, Landroidx/room/h0$b;->b(Ls0/b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected c(Ls0/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/download/data/AppDatabase_Impl;->J(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/download/data/AppDatabase_Impl;->K(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3
    iget-object v2, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/download/data/AppDatabase_Impl;->L(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/room/h0$b;

    invoke-virtual {v2, p1}, Landroidx/room/h0$b;->a(Ls0/b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Ls0/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v0, p1}, Lcom/zykj/download/data/AppDatabase_Impl;->M(Lcom/zykj/download/data/AppDatabase_Impl;Ls0/b;)Ls0/b;

    .line 2
    iget-object v0, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v0, p1}, Lcom/zykj/download/data/AppDatabase_Impl;->N(Lcom/zykj/download/data/AppDatabase_Impl;Ls0/b;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/download/data/AppDatabase_Impl;->O(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/download/data/AppDatabase_Impl;->P(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5
    iget-object v2, p0, Lcom/zykj/download/data/AppDatabase_Impl$a;->b:Lcom/zykj/download/data/AppDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/download/data/AppDatabase_Impl;->H(Lcom/zykj/download/data/AppDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/room/h0$b;

    invoke-virtual {v2, p1}, Landroidx/room/h0$b;->c(Ls0/b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Ls0/b;)V
    .locals 0

    return-void
.end method

.method public f(Ls0/b;)V
    .locals 0

    invoke-static {p1}, Lr0/c;->a(Ls0/b;)V

    return-void
.end method

.method protected g(Ls0/b;)Landroidx/room/i0$b;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 2
    new-instance v1, Lr0/g$a;

    const-string v3, "id"

    const-string v4, "INTEGER"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Lr0/g$a;

    const-string v4, "downloadUrl"

    const-string v5, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "downloadUrl"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v1, Lr0/g$a;

    const-string v5, "localPath"

    const-string v6, "TEXT"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "localPath"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v1, Lr0/g$a;

    const-string v5, "totalSize"

    const-string v6, "INTEGER"

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "totalSize"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    new-instance v1, Lr0/g$a;

    const-string v5, "downloadSize"

    const-string v6, "INTEGER"

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "downloadSize"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    new-instance v1, Lr0/g$a;

    const-string v5, "verifyCode"

    const-string v6, "TEXT"

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "verifyCode"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    new-instance v1, Lr0/g$a;

    const-string v5, "flag"

    const-string v6, "INTEGER"

    const/4 v7, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "flag"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    new-instance v1, Ljava/util/HashSet;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 10
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 11
    new-instance v5, Lr0/g;

    const-string v6, "download"

    invoke-direct {v5, v6, v0, v1, v4}, Lr0/g;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 12
    invoke-static {p1, v6}, Lr0/g;->a(Ls0/b;Ljava/lang/String;)Lr0/g;

    move-result-object v0

    .line 13
    invoke-virtual {v5, v0}, Lr0/g;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "\n Found:\n"

    if-nez v1, :cond_0

    .line 14
    new-instance p1, Landroidx/room/i0$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download(com.zykj.download.data.DownloadEntity).\n Expected:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Landroidx/room/i0$b;-><init>(ZLjava/lang/String;)V

    return-object p1

    .line 15
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    new-instance v12, Lr0/g$a;

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v6, "id"

    const-string v7, "INTEGER"

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v0, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 18
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 19
    new-instance v6, Lr0/g;

    const-string v7, "upload"

    invoke-direct {v6, v7, v0, v2, v5}, Lr0/g;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 20
    invoke-static {p1, v7}, Lr0/g;->a(Ls0/b;Ljava/lang/String;)Lr0/g;

    move-result-object p1

    .line 21
    invoke-virtual {v6, p1}, Lr0/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 22
    new-instance v0, Landroidx/room/i0$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "upload(com.zykj.download.data.UploadEntity).\n Expected:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Landroidx/room/i0$b;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 23
    :cond_1
    new-instance p1, Landroidx/room/i0$b;

    const/4 v0, 0x0

    invoke-direct {p1, v1, v0}, Landroidx/room/i0$b;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
