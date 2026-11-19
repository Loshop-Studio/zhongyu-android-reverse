.class public Lxe/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lze/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lxe/b;

.field public final b:J

.field public final c:I

.field public d:J

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lxe/b;JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lxe/b$a;->d:J

    .line 9
    .line 10
    iput-wide p2, p0, Lxe/b$a;->b:J

    .line 11
    .line 12
    iput-object p1, p0, Lxe/b$a;->a:Lxe/b;

    .line 13
    .line 14
    invoke-virtual {p1}, Lwe/a;->m()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, Lxe/b$a;->c:I

    .line 19
    .line 20
    invoke-virtual {p1, p4}, Lwe/a;->q(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a(JIJ)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-wide p3, p0, Lxe/b$a;->d:J

    .line 6
    .line 7
    sub-long p3, p1, p3

    .line 8
    .line 9
    iget-wide v0, p0, Lxe/b$a;->b:J

    .line 10
    .line 11
    cmp-long p3, p3, v0

    .line 12
    .line 13
    if-lez p3, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object p3, p0, Lxe/b$a;->a:Lxe/b;

    .line 16
    .line 17
    invoke-virtual {p3}, Lxe/a;->t()V

    .line 18
    .line 19
    .line 20
    iget p3, p0, Lxe/b$a;->f:I

    .line 21
    .line 22
    add-int/lit8 p3, p3, 0x1

    .line 23
    .line 24
    iput p3, p0, Lxe/b$a;->f:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    iget p3, p0, Lxe/b$a;->g:I

    .line 28
    .line 29
    add-int/lit8 p3, p3, 0x1

    .line 30
    .line 31
    iput p3, p0, Lxe/b$a;->g:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_1
    iget p3, p0, Lxe/b$a;->e:I

    .line 35
    .line 36
    add-int/lit8 p3, p3, 0x1

    .line 37
    .line 38
    iput p3, p0, Lxe/b$a;->e:I

    .line 39
    .line 40
    :goto_0
    iput-wide p1, p0, Lxe/b$a;->d:J

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public b()[I
    .locals 4

    .line 1
    iget v0, p0, Lxe/b$a;->e:I

    .line 2
    .line 3
    :goto_0
    :try_start_0
    iget v1, p0, Lxe/b$a;->e:I

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lxe/b$a;->a:Lxe/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lxe/a;->A()I

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lxe/b$a;->e:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    iput v1, p0, Lxe/b$a;->e:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :catch_0
    :cond_0
    iget-object v1, p0, Lxe/b$a;->a:Lxe/b;

    .line 22
    .line 23
    iget v2, p0, Lxe/b$a;->c:I

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lwe/a;->q(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :goto_1
    iget-object v1, p0, Lxe/b$a;->a:Lxe/b;

    .line 30
    .line 31
    iget v2, p0, Lxe/b$a;->c:I

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lwe/a;->q(I)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :goto_2
    iget v1, p0, Lxe/b$a;->f:I

    .line 38
    .line 39
    iget v2, p0, Lxe/b$a;->e:I

    .line 40
    .line 41
    iget v3, p0, Lxe/b$a;->g:I

    .line 42
    .line 43
    filled-new-array {v1, v0, v2, v3}, [I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method
