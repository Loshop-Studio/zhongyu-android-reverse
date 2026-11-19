.class Lcom/tendcloud/tenddata/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/j$c;,
        Lcom/tendcloud/tenddata/j$b;,
        Lcom/tendcloud/tenddata/j$a;
    }
.end annotation


# static fields
.field private static final d:I = 0x7530

.field private static final e:Ljava/nio/ByteBuffer;


# instance fields
.field private final a:Lcom/tendcloud/tenddata/j$a;

.field private final b:Lcom/tendcloud/tenddata/j$b;

.field private final c:Ljava/net/URI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/j;->e:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/net/URI;Lcom/tendcloud/tenddata/j$a;Ljava/net/Socket;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/tendcloud/tenddata/j;->a:Lcom/tendcloud/tenddata/j$a;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/tendcloud/tenddata/j;->c:Ljava/net/URI;

    .line 7
    .line 8
    :try_start_0
    new-instance p2, Lcom/tendcloud/tenddata/j$b;

    .line 9
    .line 10
    const/16 v0, 0x7530

    .line 11
    .line 12
    invoke-direct {p2, p0, p1, v0, p3}, Lcom/tendcloud/tenddata/j$b;-><init>(Lcom/tendcloud/tenddata/j;Ljava/net/URI;ILjava/net/Socket;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/tendcloud/tenddata/j;->b:Lcom/tendcloud/tenddata/j$b;

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/ar;->connectBlocking()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    new-instance p2, Ljava/lang/Exception;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p2
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/j;->a:Lcom/tendcloud/tenddata/j$a;

    return-object p0
.end method

.method private static a(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 1

    .line 4
    :try_start_0
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 8
    invoke-virtual {v0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/j;->b:Lcom/tendcloud/tenddata/j$b;

    return-object p0
.end method

.method public static synthetic c()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/j;->e:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/j;->b:Lcom/tendcloud/tenddata/j$b;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/j;->b:Lcom/tendcloud/tenddata/j$b;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->isClosing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/j;->b:Lcom/tendcloud/tenddata/j$b;

    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ar;->isFlushAndClose()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/io/BufferedOutputStream;
    .locals 3

    .line 2
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Lcom/tendcloud/tenddata/j$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tendcloud/tenddata/j$c;-><init>(Lcom/tendcloud/tenddata/j;Lcom/tendcloud/tenddata/j$1;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method
