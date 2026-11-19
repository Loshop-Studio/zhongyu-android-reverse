.class public Ld7/e;
.super Ld7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    new-instance v0, Ld7/c;

    invoke-direct {v0}, Ld7/c;-><init>()V

    invoke-direct {p0, v0}, Ld7/a;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    return-void
.end method

.method public synthetic constructor <init>(Ld7/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld7/e;-><init>()V

    return-void
.end method

.method public static n()Ld7/e;
    .locals 1

    .line 1
    invoke-static {}, Ld7/e$b;->a()Ld7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Landroid/content/ContentValues;
    .locals 0

    .line 1
    check-cast p1, Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld7/e;->l(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic e(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld7/e;->o(Landroid/database/Cursor;)Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k(Ljava/lang/String;)Lcom/lzy/okgo/model/Progress;
    .locals 1

    .line 1
    const-string v0, "tag=?"

    .line 2
    .line 3
    filled-new-array {p1}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Ld7/a;->g(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/lzy/okgo/model/Progress;

    .line 12
    .line 13
    return-object p1
.end method

.method public l(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/lzy/okgo/model/Progress;->c(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public m()Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "5"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const-string v7, "date ASC"

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "status not in(?)"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v8}, Ld7/a;->f([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public o(Landroid/database/Cursor;)Lcom/lzy/okgo/model/Progress;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/lzy/okgo/model/Progress;->g(Landroid/database/Cursor;)Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(Landroid/content/ContentValues;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "tag=?"

    .line 2
    .line 3
    filled-new-array {p2}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, v0, p2}, Ld7/a;->j(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
