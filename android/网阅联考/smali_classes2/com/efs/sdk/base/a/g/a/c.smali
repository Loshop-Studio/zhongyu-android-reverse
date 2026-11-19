.class public final Lcom/efs/sdk/base/a/g/a/c;
.super Lcom/efs/sdk/base/a/g/a/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/a/g/a/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static c(Lcom/efs/sdk/base/a/f/b;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/efs/sdk/base/a/f/b;->b()Z

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
    iget-byte v2, v0, Lcom/efs/sdk/base/a/f/a;->b:B

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lcom/efs/sdk/base/a/f/b;->b:Lcom/efs/sdk/base/a/f/c;

    .line 15
    .line 16
    iget-boolean p0, p0, Lcom/efs/sdk/base/a/f/c;->a:Z

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_0
    iget p0, v0, Lcom/efs/sdk/base/a/f/a;->c:I

    .line 21
    .line 22
    if-ne v1, p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/a/f/b;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/efs/sdk/base/a/g/a/c;->c(Lcom/efs/sdk/base/a/f/b;)Z

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
    iget-object v0, p1, Lcom/efs/sdk/base/a/f/b;->c:[B

    .line 12
    .line 13
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/c;->a([B)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "gzip error"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const-string v2, "efs.base"

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/a/g/a/a;->b(Lcom/efs/sdk/base/a/f/b;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/a/f/b;->a([B)V

    .line 32
    .line 33
    .line 34
    const-string v0, "gzip"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/a/f/b;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/a/g/a/a;->b(Lcom/efs/sdk/base/a/f/b;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
