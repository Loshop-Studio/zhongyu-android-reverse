.class public abstract Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;


# instance fields
.field private volatile cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCachedToken()Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getFederationToken()Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/alibaba/sdk/android/oss/ClientException;
        }
    .end annotation
.end method

.method public declared-synchronized getValidFederationToken()Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/alibaba/sdk/android/oss/ClientException;
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "token expired! current time: "

    .line 2
    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 6
    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/alibaba/sdk/android/oss/common/utils/DateUtil;->getFixedSkewedTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    div-long/2addr v4, v2

    .line 16
    iget-object v1, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;->getExpiration()J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    const-wide/16 v8, 0x12c

    .line 23
    .line 24
    sub-long/2addr v6, v8

    .line 25
    cmp-long v1, v4, v6

    .line 26
    .line 27
    if-lez v1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/alibaba/sdk/android/oss/common/utils/DateUtil;->getFixedSkewedTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    div-long/2addr v4, v2

    .line 46
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, " token expired: "

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;->getExpiration()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lcom/alibaba/sdk/android/oss/common/OSSLog;->logDebug(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->getFederationToken()Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;

    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationCredentialProvider;->cachedToken:Lcom/alibaba/sdk/android/oss/common/auth/OSSFederationToken;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object v0

    .line 80
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw v0
.end method
