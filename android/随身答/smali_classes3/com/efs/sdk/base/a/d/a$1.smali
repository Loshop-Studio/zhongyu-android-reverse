.class final Lcom/efs/sdk/base/a/d/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/base/a/d/a;->c(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/base/protocol/ILogProtocol;

.field final synthetic b:Lcom/efs/sdk/base/a/d/a;


# direct methods
.method public constructor <init>(Lcom/efs/sdk/base/a/d/a;Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/base/a/d/a$1;->b:Lcom/efs/sdk/base/a/d/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/efs/sdk/base/a/d/a$1;->a:Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/d/a$1;->a:Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 2
    .line 3
    invoke-static {}, Lcom/efs/sdk/base/a/c/c$a;->a()Lcom/efs/sdk/base/a/c/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/efs/sdk/base/protocol/ILogProtocol;->insertGlobal(Lcom/efs/sdk/base/a/c/b;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "wa"

    .line 13
    .line 14
    iget-object v1, p0, Lcom/efs/sdk/base/a/d/a$1;->a:Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/efs/sdk/base/protocol/ILogProtocol;->getLogType()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/efs/sdk/base/a/d/a$1;->a:Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/efs/sdk/base/a/d/a;->b(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-boolean v0, v0, Lcom/efs/sdk/base/a/c/a;->e:Z

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/efs/sdk/base/a/d/a$1;->a:Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/efs/sdk/base/a/f/b;->a(Lcom/efs/sdk/base/protocol/ILogProtocol;)Lcom/efs/sdk/base/a/f/b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {}, Lcom/efs/sdk/base/a/g/d$a;->a()Lcom/efs/sdk/base/a/g/d;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, Lcom/efs/sdk/base/a/g/d$1;

    .line 54
    .line 55
    invoke-direct {v2, v1, v0}, Lcom/efs/sdk/base/a/g/d$1;-><init>(Lcom/efs/sdk/base/a/g/d;Lcom/efs/sdk/base/a/f/b;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lcom/efs/sdk/base/a/h/a/d;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_1
    const-string v1, "efs.base"

    .line 63
    .line 64
    const-string v2, "log send error"

    .line 65
    .line 66
    invoke-static {v1, v2, v0}, Lcom/efs/sdk/base/a/h/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
