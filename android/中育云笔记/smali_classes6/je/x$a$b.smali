.class public final Lje/x$a$b;
.super Lje/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/x$a;->i(Lokio/ByteString;Lje/t;)Lje/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lje/t;

.field public final synthetic b:Lokio/ByteString;


# direct methods
.method public constructor <init>(Lje/t;Lokio/ByteString;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje/x$a$b;->a:Lje/t;

    .line 2
    .line 3
    iput-object p2, p0, Lje/x$a$b;->b:Lokio/ByteString;

    .line 4
    .line 5
    invoke-direct {p0}, Lje/x;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lje/x$a$b;->b:Lokio/ByteString;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public contentType()Lje/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/x$a$b;->a:Lje/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lje/x$a$b;->b:Lokio/ByteString;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lokio/BufferedSink;->write(Lokio/ByteString;)Lokio/BufferedSink;

    .line 9
    .line 10
    .line 11
    return-void
.end method
