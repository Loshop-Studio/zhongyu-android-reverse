.class public Ls5/e;
.super Lcom/huawei/hms/common/internal/TaskApiCall;
.source "SourceFile"


# instance fields
.field public f:Landroid/content/Context;

.field public g:Lcom/huawei/hms/aaid/entity/TokenReq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hms/aaid/entity/TokenReq;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/huawei/hms/utils/JsonUtil;->createJsonString(Lcom/huawei/hms/core/aidl/e;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0, p4}, Lcom/huawei/hms/common/internal/TaskApiCall;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Ls5/e;->f:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Ls5/e;->g:Lcom/huawei/hms/aaid/entity/TokenReq;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic b(Ls5/e;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Ls5/e;->f:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lcom/huawei/hms/common/internal/AnyClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lw4/f;)V
    .locals 0

    .line 1
    check-cast p1, Lc5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Ls5/e;->c(Lc5/a;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lw4/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lc5/a;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lw4/f;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p3, Ly4/a;->d:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "TokenTask failed, ErrorCode:"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p3, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, p4}, Ls5/e;->d(Lcom/huawei/hms/common/internal/ResponseErrorCode;Lw4/f;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_0
    new-instance v0, Lcom/huawei/hms/aaid/entity/TokenResp;

    .line 39
    .line 40
    invoke-direct {v0}, Lcom/huawei/hms/aaid/entity/TokenResp;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {p3, v0}, Lcom/huawei/hms/utils/JsonUtil;->jsonToEntity(Ljava/lang/String;Lcom/huawei/hms/core/aidl/e;)Lcom/huawei/hms/core/aidl/e;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Lcom/huawei/hms/aaid/entity/TokenResp;

    .line 48
    .line 49
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getRetCode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->a(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sget-object v1, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 58
    .line 59
    if-eq v0, v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f()Lcom/huawei/hms/common/ApiException;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-virtual {p4, p3}, Lw4/f;->b(Ljava/lang/Exception;)V

    .line 66
    .line 67
    .line 68
    sget-object p3, Ly4/a;->d:Ljava/lang/String;

    .line 69
    .line 70
    new-instance p4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v1, "TokenTask failed, StatusCode:"

    .line 76
    .line 77
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->c()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    invoke-static {p3, p4}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    new-instance v0, Lcom/huawei/hms/aaid/entity/TokenResult;

    .line 96
    .line 97
    invoke-direct {v0}, Lcom/huawei/hms/aaid/entity/TokenResult;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getToken()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setToken(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getBelongId()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setBelongId(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getRetCode()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-static {v1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->a(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->c()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setRetCode(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p4, v0}, Lw4/f;->c(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getToken()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result p4

    .line 140
    if-eqz p4, :cond_2

    .line 141
    .line 142
    sget-object p3, Ly4/a;->d:Ljava/lang/String;

    .line 143
    .line 144
    const-string p4, "GetTokenTask receive an empty token, please check onNewToken callback method."

    .line 145
    .line 146
    invoke-static {p3, p4}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/huawei/hms/common/internal/BaseHmsClient;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0}, Lcom/huawei/hms/common/internal/TaskApiCall;->getUri()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-static {p1, p3, p2}, Ls5/f;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/common/internal/ResponseErrorCode;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_2
    iget-object p4, p0, Ls5/e;->g:Lcom/huawei/hms/aaid/entity/TokenReq;

    .line 162
    .line 163
    invoke-virtual {p4}, Lcom/huawei/hms/aaid/entity/TokenReq;->getSubjectId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p4

    .line 167
    invoke-virtual {p0, p3, p4}, Ls5/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hms/common/internal/BaseHmsClient;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p0}, Lcom/huawei/hms/common/internal/TaskApiCall;->getUri()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-static {p1, p3, p2}, Ls5/f;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/common/internal/ResponseErrorCode;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final d(Lcom/huawei/hms/common/internal/ResponseErrorCode;Lw4/f;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->a(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/huawei/hms/aaid/constant/ErrorEnum;->l:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f()Lcom/huawei/hms/common/ApiException;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2, p1}, Lw4/f;->b(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lcom/huawei/hms/common/ApiException;

    .line 22
    .line 23
    new-instance v1, Lcom/huawei/hms/support/api/client/Status;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {p1}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorReason()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v1, v2, p1}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, Lcom/huawei/hms/common/ApiException;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Lw4/f;->b(Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ls5/e$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Ls5/e$a;-><init>(Ls5/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ld5/a;->a(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getMinApkVersion()I
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/e;->g:Lcom/huawei/hms/aaid/entity/TokenReq;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/entity/TokenReq;->isMultiSender()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const v0, 0x2fb014c

    .line 10
    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const v0, 0x1c9c380

    .line 14
    .line 15
    .line 16
    return v0
.end method
