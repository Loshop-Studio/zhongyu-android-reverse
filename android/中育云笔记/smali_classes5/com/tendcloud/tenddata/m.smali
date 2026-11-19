.class Lcom/tendcloud/tenddata/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/m$a;
    }
.end annotation


# instance fields
.field private volatile a:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/m;->a:Landroid/util/LruCache;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/m$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/m;-><init>()V

    return-void
.end method

.method public static c()Lcom/tendcloud/tenddata/m;
    .locals 1

    .line 7
    invoke-static {}, Lcom/tendcloud/tenddata/m$a;->access$000()Lcom/tendcloud/tenddata/m;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    invoke-static {p1}, Lcom/tendcloud/tenddata/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    :try_start_0
    const-string v1, "UTF-8"

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/o;->b()V

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v1

    const-string v2, "hybrid"

    invoke-virtual {v1, p1, v2}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/o;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method private d()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/o;->b()V

    .line 2
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v0

    const-string v1, "hybrid_value"

    const-string v2, "currentElements"

    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/o;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 4
    :catchall_0
    const-string v0, ""

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    const-string p0, ""

    return-object p0

    .line 7
    :cond_0
    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 9
    :cond_1
    const-string v0, "#"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    invoke-direct {p0}, Lcom/tendcloud/tenddata/m;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/m;->b:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->a:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 4
    monitor-exit p0

    return-object v0

    .line 5
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/tendcloud/tenddata/m;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 9
    :cond_1
    :try_start_2
    const-string p1, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 10
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->a:Landroid/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->a:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/m;->a:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/m;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
