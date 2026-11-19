.class public final Ldf/t$b;
.super Lje/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final c:Lje/z;

.field public final d:Lokio/BufferedSource;

.field public e:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lje/z;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lje/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf/t$b;->c:Lje/z;

    .line 5
    .line 6
    new-instance v0, Ldf/t$b$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lje/z;->source()Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p0, p1}, Ldf/t$b$a;-><init>(Ldf/t$b;Lokio/Source;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ldf/t$b;->d:Lokio/BufferedSource;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/t$b;->c:Lje/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje/z;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Ldf/t$b;->c:Lje/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje/z;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Lje/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/t$b;->c:Lje/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje/z;->contentType()Lje/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/t$b;->e:Ljava/io/IOException;

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

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/t$b;->d:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
