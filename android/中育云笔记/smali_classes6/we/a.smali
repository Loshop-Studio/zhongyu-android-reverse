.class public abstract Lwe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:Ljavax/net/SocketFactory;

.field public static final n:Ljavax/net/ServerSocketFactory;


# instance fields
.field public a:I

.field public b:Ljava/net/Socket;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Ljava/io/InputStream;

.field public f:Ljava/io/OutputStream;

.field public g:Ljavax/net/SocketFactory;

.field public h:Ljavax/net/ServerSocketFactory;

.field public i:I

.field public j:I

.field public k:I

.field public l:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lwe/a;->m:Ljavax/net/SocketFactory;

    .line 6
    .line 7
    invoke-static {}, Ljavax/net/ServerSocketFactory;->getDefault()Ljavax/net/ServerSocketFactory;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lwe/a;->n:Ljavax/net/ServerSocketFactory;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0xea60

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lwe/a;->i:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lwe/a;->j:I

    .line 11
    .line 12
    iput v0, p0, Lwe/a;->k:I

    .line 13
    .line 14
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lwe/a;->l:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 22
    .line 23
    iput-object v0, p0, Lwe/a;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v0, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 26
    .line 27
    iput-object v0, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lwe/a;->a:I

    .line 31
    .line 32
    iput v0, p0, Lwe/a;->d:I

    .line 33
    .line 34
    sget-object v0, Lwe/a;->m:Ljavax/net/SocketFactory;

    .line 35
    .line 36
    iput-object v0, p0, Lwe/a;->g:Ljavax/net/SocketFactory;

    .line 37
    .line 38
    sget-object v0, Lwe/a;->n:Ljavax/net/ServerSocketFactory;

    .line 39
    .line 40
    iput-object v0, p0, Lwe/a;->h:Ljavax/net/ServerSocketFactory;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/InetAddress;ILjava/net/InetAddress;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lwe/a;->g:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 8
    .line 9
    iget v1, p0, Lwe/a;->j:I

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setReceiveBufferSize(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lwe/a;->k:I

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSendBufferSize(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    if-eqz p3, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 29
    .line 30
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 31
    .line 32
    invoke-direct {v1, p3, p4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object p3, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 39
    .line 40
    new-instance p4, Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    invoke-direct {p4, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 43
    .line 44
    .line 45
    iget p1, p0, Lwe/a;->i:I

    .line 46
    .line 47
    invoke-virtual {p3, p4, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lwe/a;->b()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/a;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 11
    .line 12
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 19
    .line 20
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    iget v1, p0, Lwe/a;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public final e(Ljava/net/Socket;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iput-object p1, p0, Lwe/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-virtual {p0, p1, p2, v0, v1}, Lwe/a;->a(Ljava/net/InetAddress;ILjava/net/InetAddress;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lwe/a;->e(Ljava/net/Socket;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lwe/a;->d(Ljava/io/Closeable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lwe/a;->d(Ljava/io/Closeable;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 18
    .line 19
    iput-object v0, p0, Lwe/a;->c:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 22
    .line 23
    iput-object v0, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 24
    .line 25
    return-void
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/a;->j()Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/commons/net/ProtocolCommandSupport;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lwe/a;->j()Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/net/ProtocolCommandSupport;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public i(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/a;->j()Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/commons/net/ProtocolCommandSupport;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lwe/a;->j()Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/net/ProtocolCommandSupport;->c(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public abstract j()Lorg/apache/commons/net/ProtocolCommandSupport;
.end method

.method public k()Ljava/net/InetAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Ljava/net/InetAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwe/a;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwe/a;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r(Ljava/net/Socket;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lwe/a;->l()Ljava/net/InetAddress;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method
