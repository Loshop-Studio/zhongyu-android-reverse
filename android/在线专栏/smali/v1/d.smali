.class public final Lv1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/c;


# instance fields
.field private final a:Landroidx/room/h0;

.field private final b:Lp0/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/g<",
            "Lv1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lv1/a;

.field private final d:Lp0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/f<",
            "Lv1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lp0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/f<",
            "Lv1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/h0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lv1/a;

    invoke-direct {v0}, Lv1/a;-><init>()V

    iput-object v0, p0, Lv1/d;->c:Lv1/a;

    .line 3
    iput-object p1, p0, Lv1/d;->a:Landroidx/room/h0;

    .line 4
    new-instance v0, Lv1/d$a;

    invoke-direct {v0, p0, p1}, Lv1/d$a;-><init>(Lv1/d;Landroidx/room/h0;)V

    iput-object v0, p0, Lv1/d;->b:Lp0/g;

    .line 5
    new-instance v0, Lv1/d$b;

    invoke-direct {v0, p0, p1}, Lv1/d$b;-><init>(Lv1/d;Landroidx/room/h0;)V

    iput-object v0, p0, Lv1/d;->d:Lp0/f;

    .line 6
    new-instance v0, Lv1/d$c;

    invoke-direct {v0, p0, p1}, Lv1/d$c;-><init>(Lv1/d;Landroidx/room/h0;)V

    iput-object v0, p0, Lv1/d;->e:Lp0/f;

    return-void
.end method

.method static synthetic d(Lv1/d;)Lv1/a;
    .locals 0

    iget-object p0, p0, Lv1/d;->c:Lv1/a;

    return-object p0
.end method

.method public static e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lv1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    iget-object v0, p0, Lv1/d;->e:Lp0/f;

    invoke-virtual {v0, p1}, Lp0/f;->h(Ljava/lang/Object;)I

    .line 4
    iget-object p1, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 6
    throw p1
.end method

.method public b(Lv1/b;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    iget-object v0, p0, Lv1/d;->b:Lp0/g;

    invoke-virtual {v0, p1}, Lp0/g;->i(Ljava/lang/Object;)J

    move-result-wide v0

    .line 4
    iget-object p1, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 6
    throw p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lv1/b;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "select * from download where downloadUrl = ? AND localPath = ?"

    const/4 v4, 0x2

    .line 1
    invoke-static {v3, v4}, Lp0/k;->d(Ljava/lang/String;I)Lp0/k;

    move-result-object v3

    const/4 v5, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {v3, v5}, Lp0/k;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v3, v5, v0}, Lp0/k;->c(ILjava/lang/String;)V

    :goto_0
    if-nez v2, :cond_1

    .line 4
    invoke-virtual {v3, v4}, Lp0/k;->k(I)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v3, v4, v2}, Lp0/k;->c(ILjava/lang/String;)V

    .line 6
    :goto_1
    iget-object v0, v1, Lv1/d;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 7
    iget-object v0, v1, Lv1/d;->a:Landroidx/room/h0;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Lr0/c;->b(Landroidx/room/h0;Ls0/e;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    .line 8
    invoke-static {v2, v0}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "downloadUrl"

    .line 9
    invoke-static {v2, v5}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "localPath"

    .line 10
    invoke-static {v2, v6}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "totalSize"

    .line 11
    invoke-static {v2, v7}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "downloadSize"

    .line 12
    invoke-static {v2, v8}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "verifyCode"

    .line 13
    invoke-static {v2, v9}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "flag"

    .line 14
    invoke-static {v2, v10}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    .line 15
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    if-eqz v11, :cond_2

    .line 16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    .line 17
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 18
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 19
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    .line 20
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    .line 21
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 22
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 23
    iget-object v4, v1, Lv1/d;->c:Lv1/a;

    invoke-virtual {v4, v0}, Lv1/a;->b(I)Lcom/zykj/download/DownloadFlag;

    move-result-object v21

    .line 24
    new-instance v4, Lv1/b;

    move-object v12, v4

    invoke-direct/range {v12 .. v21}, Lv1/b;-><init>(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :cond_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 26
    invoke-virtual {v3}, Lp0/k;->o()V

    return-object v4

    :catchall_0
    move-exception v0

    .line 27
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 28
    invoke-virtual {v3}, Lp0/k;->o()V

    .line 29
    throw v0
.end method
