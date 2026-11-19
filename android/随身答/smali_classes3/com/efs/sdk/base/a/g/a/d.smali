.class public final Lcom/efs/sdk/base/a/g/a/d;
.super Lcom/efs/sdk/base/a/g/a/a;
.source "SourceFile"


# instance fields
.field private b:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/a/g/a/a;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lcom/efs/sdk/base/a/c/a;->m:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/efs/sdk/base/a/g/b;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/efs/sdk/base/a/g/b;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/efs/sdk/base/a/g/a/d;->b:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lcom/efs/sdk/base/a/c/a;->m:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/efs/sdk/base/a/g/a/d;->b:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 27
    .line 28
    return-void
.end method

.method private static c(Lcom/efs/sdk/base/a/f/b;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/efs/sdk/base/a/f/b;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "wa"

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    .line 21
    .line 22
    iget-byte v2, v0, Lcom/efs/sdk/base/a/f/a;->b:B

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Lcom/efs/sdk/base/a/f/b;->b:Lcom/efs/sdk/base/a/f/c;

    .line 27
    .line 28
    iget-boolean p0, p0, Lcom/efs/sdk/base/a/f/c;->a:Z

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    :cond_0
    iget p0, v0, Lcom/efs/sdk/base/a/f/a;->c:I

    .line 33
    .line 34
    if-ne v1, p0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/a/f/b;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/efs/sdk/base/a/g/a/d;->c(Lcom/efs/sdk/base/a/f/b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/a/g/a/a;->b(Lcom/efs/sdk/base/a/f/b;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/g/a/d;->b:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 12
    .line 13
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, Lcom/efs/sdk/base/a/c/a;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p1, Lcom/efs/sdk/base/a/f/b;->c:[B

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Lcom/efs/sdk/base/processor/action/ILogEncryptAction;->encrypt(Ljava/lang/String;[B)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/a/f/b;->a([B)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/efs/sdk/base/a/g/a/d;->b:Lcom/efs/sdk/base/processor/action/ILogEncryptAction;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/efs/sdk/base/processor/action/ILogEncryptAction;->getDeVal()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/a/f/b;->a(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/a/g/a/a;->b(Lcom/efs/sdk/base/a/f/b;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
