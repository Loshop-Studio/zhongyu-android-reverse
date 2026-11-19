.class public final Lh2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
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


# virtual methods
.method public intercept(Lje/s$a;)Lje/y;
    .locals 6

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lje/y;->s()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v0}, Lje/z;->source()Lokio/BufferedSource;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-wide v2, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2, v3}, Lokio/BufferedSource;->request(J)Z

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "UTF-8"

    .line 43
    .line 44
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0}, Lje/z;->contentType()Lje/t;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lje/t;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lokio/Buffer;->clone()Lokio/Buffer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {}, Lh2/b;->b()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-class v3, Lcom/friday/common/property/BaseResponse;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 95
    .line 96
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    check-cast v3, Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v3, v2}, Lh2/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v3, Lcom/friday/common/property/BaseResponse;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-class v5, Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {v2, v5}, Lcom/alibaba/fastjson/JSON;->parseObject(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v3, v4, v1, v2}, Lcom/friday/common/property/BaseResponse;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v1, v3

    .line 125
    :cond_1
    invoke-static {v1}, Lcom/alibaba/fastjson/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sget-object v2, Lje/z;->Companion:Lje/z$b;

    .line 130
    .line 131
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v2, v1, v0}, Lje/z$b;->a(Ljava/lang/String;Lje/t;)Lje/z;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1}, Lje/y;->v()Lje/y$a;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1, v0}, Lje/y$a;->b(Lje/z;)Lje/y$a;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lje/y$a;->c()Lje/y;

    .line 155
    .line 156
    .line 157
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    return-object p1

    .line 159
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v2, "\u89e3\u5bc6\u5f02\u5e38====\u300b"

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :cond_2
    const-string v0, "\u54cd\u5e94\u4f53\u4e3a\u7a7a"

    .line 185
    .line 186
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    return-object p1
.end method
