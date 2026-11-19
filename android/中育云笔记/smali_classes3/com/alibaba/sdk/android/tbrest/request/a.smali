.class public Lcom/alibaba/sdk/android/tbrest/request/a;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/reflect/Method;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->a:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->f:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 0

    .line 2
    const/4 p1, 0x0

    return-object p1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 3
    const/4 p1, 0x0

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 4
    const/4 p1, 0x0

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 5
    const/4 p1, 0x0

    return-object p1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 7
    iput-object p2, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->f:Ljava/lang/String;

    .line 8
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "host"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "port"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "autoClose"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p2

    if-eqz p4, :cond_1

    .line 10
    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    :cond_1
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Landroid/net/SSLCertificateSocketFactory;->getDefault(I)Ljavax/net/SocketFactory;

    move-result-object p1

    check-cast p1, Landroid/net/SSLCertificateSocketFactory;

    .line 12
    invoke-virtual {p1, p2, p3}, Landroid/net/SSLCertificateSocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p2

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 13
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSupportedProtocols()[Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 14
    iget-object p3, p0, Lcom/alibaba/sdk/android/tbrest/request/a;->f:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Landroid/net/SSLCertificateSocketFactory;->setHostname(Ljava/net/Socket;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    return-object p2
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
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    return-object v0
.end method
