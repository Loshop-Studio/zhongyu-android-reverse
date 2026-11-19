.class public final Le2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/b;


# instance fields
.field private final a:Landroidx/room/h0;

.field private final b:Lp0/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/g<",
            "Le2/a;",
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
    iput-object p1, p0, Le2/c;->a:Landroidx/room/h0;

    .line 3
    new-instance v0, Le2/c$a;

    invoke-direct {v0, p0, p1}, Le2/c$a;-><init>(Le2/c;Landroidx/room/h0;)V

    iput-object v0, p0, Le2/c;->b:Lp0/g;

    return-void
.end method

.method public static c()Ljava/util/List;
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
.method public a(Ljava/lang/String;)Le2/a;
    .locals 6

    const-string v0, "SELECT * FROM previewInfo WHERE path = ?"

    const/4 v1, 0x1

    .line 1
    invoke-static {v0, v1}, Lp0/k;->d(Ljava/lang/String;I)Lp0/k;

    move-result-object v0

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lp0/k;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, v1, p1}, Lp0/k;->c(ILjava/lang/String;)V

    .line 4
    :goto_0
    iget-object p1, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->d()V

    .line 5
    iget-object p1, p0, Le2/c;->a:Landroidx/room/h0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lr0/c;->b(Landroidx/room/h0;Ls0/e;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "path"

    .line 6
    invoke-static {p1, v1}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "pageIndex"

    .line 7
    invoke-static {p1, v3}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "pageOffset"

    .line 8
    invoke-static {p1, v4}, Lr0/b;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    .line 9
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 10
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 11
    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 12
    :goto_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 13
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getFloat(I)F

    move-result v3

    .line 14
    new-instance v4, Le2/a;

    invoke-direct {v4, v2, v1, v3}, Le2/a;-><init>(Ljava/lang/String;IF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v4

    .line 15
    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 16
    invoke-virtual {v0}, Lp0/k;->o()V

    return-object v2

    :catchall_0
    move-exception v1

    .line 17
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 18
    invoke-virtual {v0}, Lp0/k;->o()V

    .line 19
    throw v1
.end method

.method public b(Le2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    iget-object v0, p0, Le2/c;->b:Lp0/g;

    invoke-virtual {v0, p1}, Lp0/g;->h(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Le2/c;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 6
    throw p1
.end method
