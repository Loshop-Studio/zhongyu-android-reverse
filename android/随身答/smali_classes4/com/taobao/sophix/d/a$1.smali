.class Lcom/taobao/sophix/d/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/taobao/sophix/c/c;

.field final synthetic b:Lcom/taobao/sophix/d/a;


# direct methods
.method public constructor <init>(Lcom/taobao/sophix/d/a;Lcom/taobao/sophix/c/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/sophix/d/a$1;->b:Lcom/taobao/sophix/d/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/taobao/sophix/d/a$1;->a:Lcom/taobao/sophix/c/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const-string v0, "NetworkManager"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lcom/taobao/sophix/d/a/b;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/taobao/sophix/d/a/b;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/taobao/sophix/d/a$1;->b:Lcom/taobao/sophix/d/a;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/taobao/sophix/d/a$1;->a:Lcom/taobao/sophix/c/c;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {v2, v1, v4, v3}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/d/a;Lcom/taobao/sophix/d/a/c;Ljava/lang/String;Lcom/taobao/sophix/c/c;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->a()V

    .line 17
    .line 18
    .line 19
    const-string v2, "commit success"

    .line 20
    .line 21
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->b()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v2, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    const/4 v2, 0x0

    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v3, "commit fail"

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v2}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    return-void
.end method
