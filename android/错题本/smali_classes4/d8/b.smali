.class public final Ld8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/m;


# static fields
.field public static final c:Lokhttp3/u;


# instance fields
.field public final a:Lcom/google/gson/g;

.field public final b:Lcom/google/gson/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/u;->d:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, Lokhttp3/o;->f(Ljava/lang/String;)Lokhttp3/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ld8/b;->c:Lokhttp3/u;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/google/gson/g;Lcom/google/gson/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld8/b;->a:Lcom/google/gson/g;

    .line 5
    .line 6
    iput-object p2, p0, Ld8/b;->b:Lcom/google/gson/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lokio/Buffer;

    .line 2
    .line 3
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    invoke-interface {v0}, Lokio/BufferedSink;->outputStream()Ljava/io/OutputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Ld8/b;->a:Lcom/google/gson/g;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lcom/google/gson/g;->e(Ljava/io/Writer;)Ll1/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Ld8/b;->b:Lcom/google/gson/p;

    .line 24
    .line 25
    invoke-virtual {v2, v1, p1}, Lcom/google/gson/p;->c(Ll1/b;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ll1/b;->close()V

    .line 29
    .line 30
    .line 31
    sget-object p1, Ld8/b;->c:Lokhttp3/u;

    .line 32
    .line 33
    invoke-virtual {v0}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, Lokhttp3/g0;->create(Lokhttp3/u;Lokio/ByteString;)Lokhttp3/g0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method
