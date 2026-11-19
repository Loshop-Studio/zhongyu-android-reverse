.class public final Lj3/o$b;
.super Lr2/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final c:Lr2/b0;

.field public final d:Lokio/BufferedSource;

.field public e:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lr2/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr2/b0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/o$b;->c:Lr2/b0;

    .line 5
    .line 6
    new-instance v0, Lj3/o$b$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lr2/b0;->f()Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p0, p1}, Lj3/o$b$a;-><init>(Lj3/o$b;Lokio/Source;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lj3/o$b;->d:Lokio/BufferedSource;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/o$b;->c:Lr2/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/b0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/o$b;->c:Lr2/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/b0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Lr2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/o$b;->c:Lr2/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/b0;->d()Lr2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/o$b;->d:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/o$b;->e:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    throw v0
.end method
