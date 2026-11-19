.class public Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;
.super Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;
.source "SourceFile"


# static fields
.field private static final CLASS_NAME:Ljava/lang/String; = "org.eclipse.paho.client.mqttv3.internal.SSLNetworkModule"


# instance fields
.field private enabledCiphers:[Ljava/lang/String;

.field private handshakeTimeoutSecs:I

.field private host:Ljava/lang/String;

.field private hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private httpsHostnameVerificationEnabled:Z

.field private log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

.field private port:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLSocketFactory;Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;-><init>(Ljavax/net/SocketFactory;Ljava/lang/String;ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    .line 5
    .line 6
    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->CLASS_NAME:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->httpsHostnameVerificationEnabled:Z

    .line 16
    .line 17
    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->host:Ljava/lang/String;

    .line 18
    .line 19
    iput p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->port:I

    .line 20
    .line 21
    invoke-interface {p1, p4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->setResourceName(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public getEnabledCiphers()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSSLHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public getServerURI()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ssl://"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->host:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ":"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->port:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public isHttpsHostnameVerificationEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->httpsHostnameVerificationEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public setEnabledCiphers([Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [Ljava/lang/String;

    .line 8
    .line 9
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 12
    .line 13
    if-eqz p1, :cond_4

    .line 14
    .line 15
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 20
    .line 21
    const/4 v0, 0x5

    .line 22
    invoke-interface {p1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->isLoggable(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 32
    .line 33
    array-length v1, v1

    .line 34
    if-lt v0, v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 37
    .line 38
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->CLASS_NAME:Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "260"

    .line 41
    .line 42
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v3, "setEnabledCiphers"

    .line 47
    .line 48
    invoke-interface {v0, v1, v3, v2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    if-lez v0, :cond_2

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p1, ","

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 82
    .line 83
    aget-object p1, p1, v0

    .line 84
    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    :goto_1
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 96
    .line 97
    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 98
    .line 99
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public setHttpsHostnameVerificationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->httpsHostnameVerificationEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSSLHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-void
.end method

.method public setSSLhandshakeTimeout(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->setConnectTimeout(I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->handshakeTimeoutSecs:I

    .line 5
    .line 6
    return-void
.end method

.method public start()V
    .locals 5

    .line 1
    invoke-super {p0}, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->start()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->enabledCiphers:[Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->setEnabledCiphers([Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 16
    .line 17
    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->handshakeTimeoutSecs:I

    .line 18
    .line 19
    mul-int/lit16 v2, v2, 0x3e8

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v1, Ljavax/net/ssl/SSLParameters;

    .line 25
    .line 26
    invoke-direct {v1}, Ljavax/net/ssl/SSLParameters;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Ljavax/net/ssl/SNIHostName;

    .line 36
    .line 37
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->host:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljavax/net/ssl/SNIHostName;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljavax/net/ssl/SSLParameters;->setServerNames(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 49
    .line 50
    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    :catch_0
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->httpsHostnameVerificationEnabled:Z

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    :try_start_1
    new-instance v1, Ljavax/net/ssl/SSLParameters;

    .line 60
    .line 61
    invoke-direct {v1}, Ljavax/net/ssl/SSLParameters;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "HTTPS"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljavax/net/ssl/SSLParameters;->setEndpointIdentificationAlgorithm(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 70
    .line 71
    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    .line 75
    .line 76
    :catch_1
    :cond_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 77
    .line 78
    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->httpsHostnameVerificationEnabled:Z

    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 92
    .line 93
    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 100
    .line 101
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->host:Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {v2, v3, v1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v1}, Ljavax/net/ssl/SSLSession;->invalidate()V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 116
    .line 117
    .line 118
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 119
    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v3, "Host: "

    .line 123
    .line 124
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/SSLNetworkModule;->host:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v3, ", Peer Host: "

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-interface {v1}, Ljavax/net/ssl/SSLSession;->getPeerHost()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :cond_2
    :goto_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/TCPNetworkModule;->socket:Ljava/net/Socket;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 155
    .line 156
    .line 157
    return-void
.end method
