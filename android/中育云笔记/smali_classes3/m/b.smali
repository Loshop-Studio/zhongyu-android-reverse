.class public final Lm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# instance fields
.field public final c:Lokio/Sink;

.field public final d:Lhd/l;

.field public e:Z


# direct methods
.method public constructor <init>(Lokio/Sink;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/b;->c:Lokio/Sink;

    .line 5
    .line 6
    iput-object p2, p0, Lm/b;->d:Lhd/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lm/b;->c:Lokio/Sink;

    .line 2
    .line 3
    invoke-interface {v0}, Lokio/Sink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lm/b;->e:Z

    .line 10
    .line 11
    iget-object v1, p0, Lm/b;->d:Lhd/l;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public flush()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lm/b;->c:Lokio/Sink;

    .line 2
    .line 3
    invoke-interface {v0}, Lokio/Sink;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lm/b;->e:Z

    .line 10
    .line 11
    iget-object v1, p0, Lm/b;->d:Lhd/l;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b;->c:Lokio/Sink;

    .line 2
    .line 3
    invoke-interface {v0}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lokio/Buffer;->skip(J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lm/b;->c:Lokio/Sink;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3}, Lokio/Sink;->write(Lokio/Buffer;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p0, Lm/b;->e:Z

    .line 18
    .line 19
    iget-object p2, p0, Lm/b;->d:Lhd/l;

    .line 20
    .line 21
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method
