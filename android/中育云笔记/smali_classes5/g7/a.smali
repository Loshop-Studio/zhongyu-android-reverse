.class public Lg7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/a$b;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lh7/c;

.field public c:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "download"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg7/a;->a:Ljava/lang/String;

    .line 4
    invoke-static {v0}, Lf7/b;->c(Ljava/lang/String;)Z

    .line 5
    new-instance v0, Lh7/c;

    invoke-direct {v0}, Lh7/c;-><init>()V

    iput-object v0, p0, Lg7/a;->b:Lh7/c;

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lg7/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    invoke-static {}, Ld7/e;->n()Ld7/e;

    move-result-object v0

    invoke-virtual {v0}, Ld7/e;->m()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/lzy/okgo/model/Progress;

    .line 9
    iget v3, v2, Lcom/lzy/okgo/model/Progress;->l:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    :cond_1
    const/4 v3, 0x0

    .line 10
    iput v3, v2, Lcom/lzy/okgo/model/Progress;->l:I

    goto :goto_0

    .line 11
    :cond_2
    invoke-static {}, Ld7/e;->n()Ld7/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Ld7/a;->i(Ljava/util/List;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lg7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg7/a;-><init>()V

    return-void
.end method

.method public static b()Lg7/a;
    .locals 1

    .line 1
    invoke-static {}, Lg7/a$b;->a()Lg7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static f(Ljava/lang/String;Lcom/lzy/okgo/request/base/Request;)Lh7/b;
    .locals 2

    .line 1
    invoke-static {}, Lg7/a;->b()Lg7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg7/a;->d()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lh7/b;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lh7/b;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lh7/b;-><init>(Ljava/lang/String;Lcom/lzy/okgo/request/base/Request;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v1
.end method

.method public static g(Lcom/lzy/okgo/model/Progress;)Lh7/b;
    .locals 2

    .line 1
    invoke-static {}, Lg7/a;->b()Lg7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg7/a;->d()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lh7/b;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lh7/b;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lh7/b;-><init>(Lcom/lzy/okgo/model/Progress;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ljava/lang/String;)Lh7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lh7/b;

    .line 8
    .line 9
    return-object p1
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lh7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->b:Lh7/c;

    .line 2
    .line 3
    return-object v0
.end method
