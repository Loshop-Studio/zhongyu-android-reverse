.class public Lb6/c;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# instance fields
.field public a:Ljavax/net/ssl/SSLContext;

.field public b:Ljavax/net/ssl/SSLSocket;

.field public c:[Ljava/lang/String;

.field public d:Ljavax/net/ssl/X509TrustManager;

.field public e:[Ljava/lang/String;

.field public f:[Ljava/lang/String;

.field public g:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;Ljava/security/SecureRandom;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lb6/c;->a:Ljavax/net/ssl/SSLContext;

    .line 6
    .line 7
    iput-object v0, p0, Lb6/c;->b:Ljavax/net/ssl/SSLSocket;

    .line 8
    .line 9
    invoke-static {}, Lb6/a;->f()Ljavax/net/ssl/SSLContext;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lb6/c;->a:Ljavax/net/ssl/SSLContext;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lb6/c;->b(Ljavax/net/ssl/X509TrustManager;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lb6/c;->a:Ljavax/net/ssl/SSLContext;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    new-array v2, v2, [Ljavax/net/ssl/X509TrustManager;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object p1, v2, v3

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2, p2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/Socket;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb6/c;->g:[Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ld6/c;->a([Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "SSLFNew"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "set protocols"

    .line 13
    .line 14
    invoke-static {v1, v0}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 19
    .line 20
    iget-object v3, p0, Lb6/c;->g:[Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v3}, Lb6/a;->e(Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v2

    .line 28
    :goto_0
    iget-object v3, p0, Lb6/c;->f:[Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3}, Ld6/c;->a([Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iget-object v3, p0, Lb6/c;->e:[Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3}, Ld6/c;->a([Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    :cond_1
    const-string v2, "set cipher"

    .line 45
    .line 46
    invoke-static {v1, v2}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v2, p1

    .line 50
    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 51
    .line 52
    invoke-static {v2}, Lb6/a;->d(Ljavax/net/ssl/SSLSocket;)V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lb6/c;->f:[Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v3}, Ld6/c;->a([Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    iget-object v3, p0, Lb6/c;->f:[Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2, v3}, Lb6/a;->h(Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v3, p0, Lb6/c;->e:[Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2, v3}, Lb6/a;->b(Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :cond_3
    :goto_1
    if-nez v0, :cond_4

    .line 77
    .line 78
    const-string v0, "set default protocols"

    .line 79
    .line 80
    invoke-static {v1, v0}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v0, p1

    .line 84
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 85
    .line 86
    invoke-static {v0}, Lb6/a;->d(Ljavax/net/ssl/SSLSocket;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-nez v2, :cond_5

    .line 90
    .line 91
    const-string v0, "set default cipher"

    .line 92
    .line 93
    invoke-static {v1, v0}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 97
    .line 98
    invoke-static {p1}, Lb6/a;->c(Ljavax/net/ssl/SSLSocket;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    return-void
.end method

.method public b(Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb6/c;->d:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-void
.end method

.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 2

    const-string v0, "SSLFNew"

    const-string v1, "createSocket: host , port"

    .line 1
    invoke-static {v0, v1}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lb6/c;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    .line 3
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lb6/c;->a(Ljava/net/Socket;)V

    .line 5
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    iput-object p2, p0, Lb6/c;->b:Ljavax/net/ssl/SSLSocket;

    .line 6
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Lb6/c;->c:[Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2}, Lb6/c;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 7
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb6/c;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 9
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb6/c;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2

    const-string v0, "SSLFNew"

    const-string v1, "createSocket"

    .line 10
    invoke-static {v0, v1}, Ld6/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lb6/c;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p1

    .line 12
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 13
    invoke-virtual {p0, p1}, Lb6/c;->a(Ljava/net/Socket;)V

    .line 14
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    iput-object p2, p0, Lb6/c;->b:Ljavax/net/ssl/SSLSocket;

    .line 15
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Lb6/c;->c:[Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/c;->c:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method
