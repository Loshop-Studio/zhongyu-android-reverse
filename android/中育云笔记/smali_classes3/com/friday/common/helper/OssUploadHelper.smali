.class public final Lcom/friday/common/helper/OssUploadHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/helper/OssUploadHelper$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/friday/common/helper/OssUploadHelper$a;


# instance fields
.field public final a:Lcom/friday/common/entity/OssTokenResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/helper/OssUploadHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/helper/OssUploadHelper$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/entity/OssTokenResponse;)V
    .locals 1

    .line 1
    const-string v0, "ossToken"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/friday/common/helper/OssUploadHelper;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/helper/OssUploadHelper;->d(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResponse;->getEndpoint()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lje/u$a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, v2, v1, v2}, Lje/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lje/u;->k:Lje/t;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lje/u$a;->e(Lje/t;)Lje/u$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, Lje/x;->Companion:Lje/x$a;

    .line 24
    .line 25
    sget-object v4, Lje/t;->e:Lje/t$a;

    .line 26
    .line 27
    const-string v5, "multipart/form-data"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Lje/t$a;->b(Ljava/lang/String;)Lje/t;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v0, v4}, Lje/x$a;->a(Ljava/io/File;Lje/t;)Lje/x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "file"

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1, v0}, Lje/u$a;->a(Ljava/lang/String;Ljava/lang/String;Lje/x;)Lje/u$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lje/u$a;->d()Lje/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lje/w$a;

    .line 48
    .line 49
    invoke-direct {v0}, Lje/w$a;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/friday/common/entity/OssTokenResponse;->getEndpoint()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "/"

    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v0, p2}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResponse;->getSecurityToken()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "bearer "

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "Authorization"

    .line 106
    .line 107
    invoke-virtual {p2, v1, v0}, Lje/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const-string v0, "Checksum"

    .line 112
    .line 113
    const-string v1, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 114
    .line 115
    invoke-virtual {p2, v0, v1}, Lje/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2, p1}, Lje/w$a;->k(Lje/x;)Lje/w$a;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper$gridFsUpload$2;

    .line 132
    .line 133
    invoke-direct {v0, p1, v2}, Lcom/friday/common/helper/OssUploadHelper$gridFsUpload$2;-><init>(Lje/w;Lvc/c;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p2, v0, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;-><init>(Lcom/friday/common/helper/OssUploadHelper;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->j:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 54
    .line 55
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lcom/alibaba/sdk/android/oss/ClientConfiguration;

    .line 58
    .line 59
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->d:Ljava/lang/Object;

    .line 60
    .line 61
    move-object p2, p1

    .line 62
    check-cast p2, Ljava/lang/String;

    .line 63
    .line 64
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance p3, Lcom/alibaba/sdk/android/oss/ClientConfiguration;

    .line 85
    .line 86
    invoke-direct {p3}, Lcom/alibaba/sdk/android/oss/ClientConfiguration;-><init>()V

    .line 87
    .line 88
    .line 89
    const/16 v2, 0x3a98

    .line 90
    .line 91
    invoke-virtual {p3, v2}, Lcom/alibaba/sdk/android/oss/ClientConfiguration;->setConnectionTimeout(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, v2}, Lcom/alibaba/sdk/android/oss/ClientConfiguration;->setSocketTimeout(I)V

    .line 95
    .line 96
    .line 97
    const/4 v2, 0x5

    .line 98
    invoke-virtual {p3, v2}, Lcom/alibaba/sdk/android/oss/ClientConfiguration;->setMaxConcurrentRequest(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3, v4}, Lcom/alibaba/sdk/android/oss/ClientConfiguration;->setMaxErrorRetry(I)V

    .line 102
    .line 103
    .line 104
    new-instance v2, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    .line 105
    .line 106
    iget-object v5, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/friday/common/entity/OssTokenResponse;->getAccessKeyId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iget-object v6, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 113
    .line 114
    invoke-virtual {v6}, Lcom/friday/common/entity/OssTokenResponse;->getAccessKeySecret()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    iget-object v7, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 119
    .line 120
    invoke-virtual {v7}, Lcom/friday/common/entity/OssTokenResponse;->getSecurityToken()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-direct {v2, v5, v6, v7}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v5, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 128
    .line 129
    invoke-virtual {v5}, Lcom/friday/common/entity/OssTokenResponse;->getEndpoint()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object v5, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 134
    .line 135
    invoke-virtual {v5}, Lcom/friday/common/entity/OssTokenResponse;->getBucket()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v7, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v5, "."

    .line 148
    .line 149
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    const/4 v10, 0x4

    .line 157
    const/4 v11, 0x0

    .line 158
    const-string v8, ""

    .line 159
    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-static/range {v6 .. v11}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    new-instance v6, Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 166
    .line 167
    invoke-static {}, Lz1/b;->b()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-direct {v6, v7, v5, v2, p3}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;Lcom/alibaba/sdk/android/oss/ClientConfiguration;)V

    .line 172
    .line 173
    .line 174
    new-instance v7, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 175
    .line 176
    iget-object v8, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 177
    .line 178
    invoke-virtual {v8}, Lcom/friday/common/entity/OssTokenResponse;->getBucket()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-direct {v7, v8, p2, p1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    new-instance v9, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;

    .line 190
    .line 191
    invoke-direct {v9, v6, v7, p1, v3}, Lcom/friday/common/helper/OssUploadHelper$ossUpload$putObject$1;-><init>(Lcom/alibaba/sdk/android/oss/OSSClient;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;Ljava/lang/String;Lvc/c;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->c:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object p2, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->d:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->e:Ljava/lang/Object;

    .line 207
    .line 208
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->f:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->g:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->h:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iput-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->i:Ljava/lang/Object;

    .line 231
    .line 232
    iput v4, v0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    .line 233
    .line 234
    invoke-static {v8, v9, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    if-ne p3, v1, :cond_3

    .line 239
    .line 240
    return-object v1

    .line 241
    :cond_3
    :goto_1
    check-cast p3, Lcom/alibaba/sdk/android/oss/model/PutObjectResult;

    .line 242
    .line 243
    const-string p1, "["

    .line 244
    .line 245
    const/16 v0, 0xc8

    .line 246
    .line 247
    if-eqz p3, :cond_4

    .line 248
    .line 249
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/model/OSSResult;->getStatusCode()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-ne v1, v0, :cond_4

    .line 254
    .line 255
    new-instance v1, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string p1, "]\u4e0a\u4f20OSS\u6210\u529f"

    .line 267
    .line 268
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_4
    if-eqz p3, :cond_5

    .line 284
    .line 285
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/model/OSSResult;->getStatusCode()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string p1, "]\u4e0a\u4f20OSS\u5931\u8d25\uff0ccode:"

    .line 305
    .line 306
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :goto_2
    const/4 p1, 0x0

    .line 324
    if-eqz p3, :cond_6

    .line 325
    .line 326
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/model/OSSResult;->getStatusCode()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    if-ne p2, v0, :cond_6

    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_6
    move v4, p1

    .line 334
    :goto_3
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/friday/common/helper/OssUploadHelper$putObject$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/common/helper/OssUploadHelper$putObject$1;-><init>(Lcom/friday/common/helper/OssUploadHelper;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x3

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    move-object p2, p1

    .line 47
    check-cast p2, Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    move-object p2, p1

    .line 69
    check-cast p2, Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 80
    .line 81
    move-object p2, p1

    .line 82
    check-cast p2, Ljava/lang/String;

    .line 83
    .line 84
    iget-object p1, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p3, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 96
    .line 97
    invoke-virtual {p3}, Lcom/friday/common/entity/OssTokenResponse;->getStrategy()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    const-string v2, "GridFS"

    .line 102
    .line 103
    invoke-static {p3, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    iput-object p3, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p2, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    iput v4, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 118
    .line 119
    invoke-virtual {p0, p1, p2, v0}, Lcom/friday/common/helper/OssUploadHelper;->c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    if-ne p3, v1, :cond_5

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    const-string v2, "ZYFS"

    .line 134
    .line 135
    invoke-static {p3, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    if-eqz p3, :cond_8

    .line 140
    .line 141
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    iput-object p3, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object p2, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 148
    .line 149
    iput v3, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 150
    .line 151
    invoke-virtual {p0, p1, p2, v0}, Lcom/friday/common/helper/OssUploadHelper;->f(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    if-ne p3, v1, :cond_7

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    goto :goto_5

    .line 165
    :cond_8
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    iput-object p3, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->c:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object p2, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->d:Ljava/lang/Object;

    .line 172
    .line 173
    iput v5, v0, Lcom/friday/common/helper/OssUploadHelper$putObject$1;->g:I

    .line 174
    .line 175
    invoke-virtual {p0, p1, p2, v0}, Lcom/friday/common/helper/OssUploadHelper;->d(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    if-ne p3, v1, :cond_9

    .line 180
    .line 181
    :goto_3
    return-object v1

    .line 182
    :cond_9
    :goto_4
    check-cast p3, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    :goto_5
    if-eqz p1, :cond_a

    .line 189
    .line 190
    iget-object p1, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/friday/common/entity/OssTokenResponse;->getEndpoint()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    new-instance p3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string p1, "/"

    .line 205
    .line 206
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :cond_a
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 218
    .line 219
    const/4 p2, 0x0

    .line 220
    invoke-direct {p1, p2, p2, v5, p2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 221
    .line 222
    .line 223
    throw p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lje/u$a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, v2, v1, v2}, Lje/u$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lje/u;->k:Lje/t;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lje/u$a;->e(Lje/t;)Lje/u$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, Lje/x;->Companion:Lje/x$a;

    .line 24
    .line 25
    sget-object v4, Lje/t;->e:Lje/t$a;

    .line 26
    .line 27
    const-string v5, "multipart/form-data"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Lje/t$a;->b(Ljava/lang/String;)Lje/t;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v0, v4}, Lje/x$a;->a(Ljava/io/File;Lje/t;)Lje/x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "file"

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1, v0}, Lje/u$a;->a(Ljava/lang/String;Ljava/lang/String;Lje/x;)Lje/u$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lje/u$a;->d()Lje/u;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lje/w$a;

    .line 48
    .line 49
    invoke-direct {v0}, Lje/w$a;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/friday/common/entity/OssTokenResponse;->getEndpoint()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "/"

    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v0, p2}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget-object v0, p0, Lcom/friday/common/helper/OssUploadHelper;->a:Lcom/friday/common/entity/OssTokenResponse;

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResponse;->getSecurityToken()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "bearer "

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "Authorization"

    .line 106
    .line 107
    invoke-virtual {p2, v1, v0}, Lje/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const-string v0, "Checksum"

    .line 112
    .line 113
    const-string v1, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 114
    .line 115
    invoke-virtual {p2, v0, v1}, Lje/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lje/w$a;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2, p1}, Lje/w$a;->k(Lje/x;)Lje/w$a;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper$zyFsUpload$2;

    .line 132
    .line 133
    invoke-direct {v0, p1, v2}, Lcom/friday/common/helper/OssUploadHelper$zyFsUpload$2;-><init>(Lje/w;Lvc/c;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p2, v0, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method
