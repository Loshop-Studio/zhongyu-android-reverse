.class public Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MAX_CONNECTION_TIME_OUT:I = 0x2710

.field private static final MAX_READ_CONNECTION_STREAM_TIME_OUT:I = 0xea60

.field public static mErrorCode:I

.field private static mRestSslSocketFactory:Lcom/alibaba/sdk/android/tbrest/request/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "http.keepAlive"

    .line 2
    .line 3
    const-string v1, "true"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sendRequest use adashx, bytes length : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_0

    const-string v1, "0"

    goto :goto_0

    :cond_0
    array-length v1, p3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    invoke-direct {v0}, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;-><init>()V

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->openHttp:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_1
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    :goto_1
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p2

    check-cast p2, Ljava/net/HttpURLConnection;

    .line 7
    instance-of v2, p2, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_c

    if-eqz v2, :cond_3

    .line 8
    :try_start_1
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->mRestSslSocketFactory:Lcom/alibaba/sdk/android/tbrest/request/a;

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 9
    new-instance v2, Lcom/alibaba/sdk/android/tbrest/request/a;

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/alibaba/sdk/android/tbrest/request/a;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->mRestSslSocketFactory:Lcom/alibaba/sdk/android/tbrest/request/a;

    .line 10
    :cond_2
    move-object v1, p2

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v2, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->mRestSslSocketFactory:Lcom/alibaba/sdk/android/tbrest/request/a;

    invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_c

    :catch_0
    :cond_3
    if-eqz p2, :cond_c

    const/4 v1, 0x1

    .line 11
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 12
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 13
    :try_start_2
    const-string v2, "POST"

    invoke-virtual {p2, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_c

    const/4 v2, 0x0

    .line 14
    invoke-virtual {p2, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const/16 v3, 0x2710

    .line 15
    invoke-virtual {p2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const v3, 0xea60

    .line 16
    invoke-virtual {p2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 17
    invoke-virtual {p2, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 18
    const-string v3, "Content-Type"

    const-string v4, "application/x-www-form-urlencoded"

    invoke-virtual {p2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string v3, "Charset"

    const-string v4, "UTF-8"

    invoke-virtual {p2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 21
    const-string v3, "x-k"

    invoke-virtual {p2, v3, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_4
    :try_start_3
    iget-object p0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appSecret:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    const-string v3, "x-t"

    const-string v4, "x-s"

    const-string v5, "signValue:"

    if-eqz p0, :cond_5

    :try_start_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_5

    .line 24
    new-instance v6, Lcom/alibaba/sdk/android/tbrest/a/a;

    invoke-direct {v6, p1, p0, v1}, Lcom/alibaba/sdk/android/tbrest/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 25
    invoke-static {p3}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->getMd5Hex([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Lcom/alibaba/sdk/android/tbrest/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p2, v4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string p0, "2"

    invoke-virtual {p2, v3, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 29
    :cond_5
    const-string p0, ""

    .line 30
    new-instance v1, Lcom/alibaba/sdk/android/tbrest/a/a;

    invoke-direct {v1, p1, p0, v2}, Lcom/alibaba/sdk/android/tbrest/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 31
    invoke-static {p3}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->getMd5Hex([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/tbrest/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p2, v4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string p0, "3"

    invoke-virtual {p2, v3, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    .line 35
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 36
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    const/4 v1, 0x0

    .line 37
    :try_start_5
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    if-eqz p3, :cond_6

    .line 38
    array-length v3, p3

    if-lez v3, :cond_6

    .line 39
    new-instance v3, Ljava/io/DataOutputStream;

    invoke-virtual {p2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_5
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 40
    :try_start_6
    invoke-virtual {v3, p3}, Ljava/io/OutputStream;->write([B)V

    .line 41
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_6
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p0

    move-object v1, v3

    goto/16 :goto_e

    :catch_1
    move-exception p2

    move-object v1, v3

    goto/16 :goto_b

    :catch_2
    move-exception p2

    move-object v1, v3

    goto/16 :goto_d

    :catchall_2
    move-exception p0

    goto/16 :goto_e

    :catch_3
    move-exception p2

    goto/16 :goto_b

    :catch_4
    move-exception p2

    goto/16 :goto_d

    :cond_6
    move-object v3, v1

    :goto_4
    if-eqz v3, :cond_7

    .line 42
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_5

    :catch_5
    move-exception p3

    .line 43
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 44
    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, p0

    iput-wide v3, v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->rt:J

    .line 45
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 46
    :try_start_8
    new-instance p1, Ljava/io/DataInputStream;

    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const/16 p2, 0x800

    .line 47
    :try_start_9
    new-array p3, p2, [B

    .line 48
    :goto_6
    invoke-virtual {p1, p3, v2, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_8

    .line 49
    invoke-virtual {p0, p3, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception p0

    move-object v1, p1

    goto :goto_9

    :catch_6
    move-exception p2

    move-object v1, p1

    goto :goto_7

    .line 50
    :cond_8
    :try_start_a
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_8

    :catch_7
    move-exception p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    goto :goto_8

    :catchall_4
    move-exception p0

    goto :goto_9

    :catch_8
    move-exception p2

    .line 52
    :goto_7
    :try_start_b
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-eqz v1, :cond_9

    .line 53
    :try_start_c
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 54
    :cond_9
    :goto_8
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-lez p1, :cond_c

    .line 55
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/request/BizRequest;->parseResult([B)I

    move-result p0

    sput p0, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->mErrorCode:I

    .line 56
    iput p0, v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->errCode:I

    .line 57
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/request/BizRequest;->mResponseAdditionalData:Ljava/lang/String;

    iput-object p0, v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->data:Ljava/lang/String;

    goto :goto_10

    :goto_9
    if-eqz v1, :cond_a

    .line 58
    :try_start_d
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    goto :goto_a

    :catch_9
    move-exception p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 60
    :cond_a
    :goto_a
    throw p0

    .line 61
    :goto_b
    :try_start_e
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long/2addr p2, p0

    iput-wide p2, v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->rt:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    if-eqz v1, :cond_c

    .line 63
    :goto_c
    :try_start_f
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    goto :goto_10

    :catch_a
    move-exception p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    goto :goto_10

    .line 65
    :goto_d
    :try_start_10
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long/2addr p2, p0

    iput-wide p2, v0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->rt:J
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    if-eqz v1, :cond_c

    goto :goto_c

    :goto_e
    if-eqz v1, :cond_b

    .line 67
    :try_start_11
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b

    goto :goto_f

    :catch_b
    move-exception p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 69
    :cond_b
    :goto_f
    throw p0

    :catch_c
    :cond_c
    :goto_10
    return-object v0
.end method

.method public static sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 71
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->openHttp:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "/upload"

    if-eqz v1, :cond_0

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http://"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 73
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 74
    :goto_0
    invoke-static {p0, v0, p1, p2}, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    move-result-object p0

    return-object p0
.end method

.method public static sendRequestByUrl(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
