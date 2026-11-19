.class public abstract Lp9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation


# instance fields
.field public final a:Li9/w;

.field public final b:Lokio/ForwardingTimeout;

.field public c:Z

.field public final synthetic d:Lp9/b;


# direct methods
.method public constructor <init>(Lp9/b;Li9/w;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lp9/b$a;->d:Lp9/b;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lp9/b$a;->a:Li9/w;

    .line 12
    .line 13
    new-instance p2, Lokio/ForwardingTimeout;

    .line 14
    .line 15
    invoke-static {p1}, Lp9/b;->n(Lp9/b;)Lokio/BufferedSource;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p2, p1}, Lokio/ForwardingTimeout;-><init>(Lokio/Timeout;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lp9/b$a;->b:Lokio/ForwardingTimeout;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp9/b$a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b(Li9/v;)V
    .locals 3

    .line 1
    const-string v0, "trailers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 7
    .line 8
    invoke-static {v0}, Lp9/b;->o(Lp9/b;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x6

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 17
    .line 18
    invoke-static {v0}, Lp9/b;->o(Lp9/b;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x5

    .line 23
    if-ne v0, v2, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 26
    .line 27
    iget-object v2, p0, Lp9/b$a;->b:Lokio/ForwardingTimeout;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lp9/b;->j(Lp9/b;Lokio/ForwardingTimeout;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lp9/b;->r(Lp9/b;Li9/v;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lp9/b;->q(Lp9/b;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Li9/v;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 49
    .line 50
    invoke-static {v0}, Lp9/b;->k(Lp9/b;)Li9/a0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Li9/a0;->n()Li9/n;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v1, p0, Lp9/b$a;->a:Li9/w;

    .line 63
    .line 64
    invoke-static {v0, v1, p1}, Lo9/e;->f(Li9/n;Li9/w;Li9/v;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_0
    return-void

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v1, "state: "

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lp9/b$a;->d:Lp9/b;

    .line 81
    .line 82
    invoke-static {v1}, Lp9/b;->o(Lp9/b;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lp9/b$a;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lp9/b$a;->d:Lp9/b;

    .line 7
    .line 8
    invoke-static {v0}, Lp9/b;->n(Lp9/b;)Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-wide p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p2, p0, Lp9/b$a;->d:Lp9/b;

    .line 19
    .line 20
    invoke-virtual {p2}, Lp9/b;->h()Lo9/d$a;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Lo9/d$a;->b()V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lp9/b;->p()Li9/v;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p2}, Lp9/b$a;->b(Li9/v;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lp9/b$a;->b:Lokio/ForwardingTimeout;

    .line 2
    .line 3
    return-object v0
.end method
