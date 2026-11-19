.class public Lz5/a0$a;
.super Lf5/c0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz5/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lf5/c0;

.field public final b:Lf5/y;


# direct methods
.method public constructor <init>(Lf5/c0;Lf5/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf5/c0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/a0$a;->a:Lf5/c0;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/a0$a;->b:Lf5/y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lz5/a0$a;->a:Lf5/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf5/c0;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Lf5/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a0$a;->b:Lf5/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a0$a;->a:Lf5/c0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf5/c0;->writeTo(Lokio/BufferedSink;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
