# RE note 对资源文件中的字节计算摘要，供文件完整性校验。
.class public final Lcom/zykj/blackboard/utils/FileValidateUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;,
        Lcom/zykj/blackboard/utils/FileValidateUtils$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/blackboard/utils/FileValidateUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/FileValidateUtils;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeEnum"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils$a;->a:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    aget p2, v0, p2

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p2, v0, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-ne p2, v1, :cond_0

    .line 27
    .line 28
    const-string p2, "SHA-256"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 32
    .line 33
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    const-string p2, "SHA-1"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-string p2, "MD5"

    .line 41
    .line 42
    :goto_0
    const/4 v1, 0x0

    .line 43
    :try_start_0
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string v2, "getInstance(type)"

    .line 48
    .line 49
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5

    .line 50
    .line 51
    .line 52
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    .line 53
    .line 54
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4

    .line 55
    .line 56
    .line 57
    const/16 p1, 0x2000

    .line 58
    .line 59
    new-array p1, p1, [B

    .line 60
    .line 61
    :goto_1
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-lez v3, :cond_3

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-virtual {p2, p1, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p1, v0

    .line 74
    goto :goto_4

    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {p2}, Ljava/security/MessageDigest;->digest()[B

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Ljava/math/BigInteger;

    .line 83
    .line 84
    invoke-direct {p2, v0, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 85
    .line 86
    .line 87
    const/16 p1, 0x10

    .line 88
    .line 89
    invoke-virtual {p2, p1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object p2, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 94
    .line 95
    const-string p2, "%32s"

    .line 96
    .line 97
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string p1, "format(format, *args)"

    .line 110
    .line 111
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 v7, 0x4

    .line 115
    const/4 v8, 0x0

    .line 116
    const/16 v4, 0x20

    .line 117
    .line 118
    const/16 v5, 0x30

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-static/range {v3 .. v8}, Lqd/z;->J(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :catch_1
    move-exception v0

    .line 130
    move-object p2, v0

    .line 131
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :goto_2
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    .line 137
    .line 138
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :catch_2
    move-exception v0

    .line 143
    move-object p1, v0

    .line 144
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 145
    .line 146
    .line 147
    :goto_3
    return-object v1

    .line 148
    :goto_4
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :catch_3
    move-exception v0

    .line 153
    move-object p2, v0

    .line 154
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 155
    .line 156
    .line 157
    :goto_5
    throw p1

    .line 158
    :catch_4
    move-exception v0

    .line 159
    move-object p1, v0

    .line 160
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :catch_5
    move-exception v0

    .line 165
    move-object p1, v0

    .line 166
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 167
    .line 168
    .line 169
    return-object v1
.end method

.method public final c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z
    .locals 4

    .line 1
    const-string v0, "typeEnum"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "standardStr"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    if-nez p3, :cond_0

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "FileValidateUtils ["

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, "] validate:"

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p3, p1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->a(Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, "] calculateValidate:"

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const/4 v0, 0x1

    .line 106
    invoke-static {p1, p2, v0}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_2

    .line 111
    .line 112
    new-instance p2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p3, "] \u6587\u4ef6\u6821\u9a8c\u672a\u901a\u8fc7"

    .line 128
    .line 129
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    return p1

    .line 144
    :cond_3
    :goto_0
    return v1
.end method
