.class Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;
.super Landroidx/room/i0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->h(Landroidx/room/i;)Ls0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-direct {p0, p2}, Landroidx/room/i0$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Ls0/b;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `previewInfo` (`path` TEXT NOT NULL, `pageIndex` INTEGER NOT NULL, `pageOffset` REAL NOT NULL, PRIMARY KEY(`path`))"

    .line 1
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'43b6ca552b2fc97cead13e6104e3e4b4\')"

    .line 3
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ls0/b;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `previewInfo`"

    .line 1
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->F(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iget-object v1, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->G(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 4
    iget-object v2, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->I(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->J(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->K(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3
    iget-object v2, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->L(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v0, p1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->M(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;Ls0/b;)Ls0/b;

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v0, p1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->N(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;Ls0/b;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->O(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->P(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5
    iget-object v2, p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl$a;->b:Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;

    invoke-static {v2}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;->H(Lcom/zykj/subscriber/dao/PDFPreviewDatabase_Impl;)Ljava/util/List;

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
    .locals 10

    .line 1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 2
    new-instance v1, Lr0/g$a;

    const-string v3, "path"

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "path"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Lr0/g$a;

    const-string v4, "pageIndex"

    const-string v5, "INTEGER"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "pageIndex"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v1, Lr0/g$a;

    const-string v4, "pageOffset"

    const-string v5, "REAL"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lr0/g$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "pageOffset"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 6
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 7
    new-instance v4, Lr0/g;

    const-string v5, "previewInfo"

    invoke-direct {v4, v5, v0, v1, v3}, Lr0/g;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 8
    invoke-static {p1, v5}, Lr0/g;->a(Ls0/b;Ljava/lang/String;)Lr0/g;

    move-result-object p1

    .line 9
    invoke-virtual {v4, p1}, Lr0/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Landroidx/room/i0$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "previewInfo(com.zykj.subscriber.dao.PDFPreviewInfo).\n Expected:\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n Found:\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Landroidx/room/i0$b;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 11
    :cond_0
    new-instance p1, Landroidx/room/i0$b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroidx/room/i0$b;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
