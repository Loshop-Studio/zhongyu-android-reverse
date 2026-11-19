.class public final Lca/t$b;
.super Li9/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Li9/e0;

.field public final b:Lokio/BufferedSource;

.field public c:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Li9/e0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Li9/e0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/t$b;->a:Li9/e0;

    .line 5
    .line 6
    new-instance v0, Lca/t$b$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Li9/e0;->source()Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p0, p1}, Lca/t$b$a;-><init>(Lca/t$b;Lokio/Source;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lca/t$b;->b:Lokio/BufferedSource;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lca/t$b;->c:Ljava/io/IOException;

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

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lca/t$b;->a:Li9/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li9/e0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lca/t$b;->a:Li9/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li9/e0;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Li9/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/t$b;->a:Li9/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li9/e0;->contentType()Li9/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/t$b;->b:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
