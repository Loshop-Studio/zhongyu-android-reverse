.class public final Lcom/friday/common/network/RefreshRepositoryImpl;
.super Lab/a;
.source "SourceFile"


# instance fields
.field public final a:Lvd/l;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lvd/l;)V
    .locals 1

    .line 1
    const-string v0, "headerBeanFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lab/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->a:Lvd/l;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuffer;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic b(Lcom/friday/common/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/network/RefreshRepositoryImpl;->c(Lcom/friday/common/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/friday/common/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;
    .locals 10

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getToken(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->a:Lvd/l;

    .line 19
    .line 20
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const/16 v8, 0x17

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    new-instance v0, Ljava/lang/StringBuffer;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 58
    .line 59
    :cond_1
    iget-object p0, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 64
    .line 65
    .line 66
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 67
    .line 68
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->h:I

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
    iput v1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;-><init>(Lcom/friday/common/network/RefreshRepositoryImpl;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->h:I

    .line 32
    .line 33
    const-wide/16 v3, 0x64

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v7, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget p1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->e:I

    .line 45
    .line 46
    iget-object v2, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 49
    .line 50
    iget-object v8, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object p2, v8

    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 80
    .line 81
    invoke-virtual {p2, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_5

    .line 86
    .line 87
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_b

    .line 94
    .line 95
    iput-object p1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    .line 96
    .line 97
    iput v7, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->h:I

    .line 98
    .line 99
    invoke-static {v3, v4, v0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-ne p2, v1, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    new-instance p2, Ljava/lang/StringBuffer;

    .line 107
    .line 108
    invoke-direct {p2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iput-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 112
    .line 113
    iget-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->a:Lvd/l;

    .line 114
    .line 115
    invoke-interface {p2}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Lcom/zykj/http/bean/HeaderBean;

    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-eqz v2, :cond_7

    .line 126
    .line 127
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-nez v2, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_7

    .line 147
    .line 148
    iget-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 149
    .line 150
    invoke-virtual {p1, v7, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :cond_7
    :goto_2
    sget-object v2, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 163
    .line 164
    new-instance v8, Lh2/d;

    .line 165
    .line 166
    invoke-direct {v8, p0}, Lh2/d;-><init>(Lcom/friday/common/network/RefreshRepositoryImpl;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v8}, Lcom/zykj/message/client/MessageClient;->g(Lhd/l;)V

    .line 170
    .line 171
    .line 172
    move-object v2, p2

    .line 173
    move-object p2, p1

    .line 174
    move p1, v6

    .line 175
    :goto_3
    iget-object v8, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-eqz v8, :cond_9

    .line 182
    .line 183
    const/16 v8, 0x1e

    .line 184
    .line 185
    if-ge p1, v8, :cond_9

    .line 186
    .line 187
    iput-object p2, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iput-object v8, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->d:Ljava/lang/Object;

    .line 194
    .line 195
    iput p1, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->e:I

    .line 196
    .line 197
    iput v5, v0, Lcom/friday/common/network/RefreshRepositoryImpl$refreshToken$1;->h:I

    .line 198
    .line 199
    invoke-static {v3, v4, v0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    if-ne v8, v1, :cond_8

    .line 204
    .line 205
    :goto_4
    return-object v1

    .line 206
    :cond_8
    :goto_5
    add-int/2addr p1, v7

    .line 207
    goto :goto_3

    .line 208
    :cond_9
    iget-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_a

    .line 215
    .line 216
    iget-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    .line 218
    invoke-virtual {p1, v7, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 219
    .line 220
    .line 221
    :cond_a
    move-object p1, p2

    .line 222
    :cond_b
    iget-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 223
    .line 224
    invoke-static {p2}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_c

    .line 229
    .line 230
    new-instance p2, Ljava/lang/StringBuffer;

    .line 231
    .line 232
    invoke-direct {p2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iput-object p2, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 236
    .line 237
    :cond_c
    iget-object p1, p0, Lcom/friday/common/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const-string p2, "toString(...)"

    .line 244
    .line 245
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-object p1
.end method
