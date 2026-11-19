# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/repository/RefreshRepositoryImp;
.super Li3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/repository/RefreshRepositoryImp$a;
    }
.end annotation


# static fields
.field public static final h:Lcom/zykj/study/repository/RefreshRepositoryImp$a;

.field public static final i:I

.field public static final j:Ljava/lang/String;


# instance fields
.field public final a:Lo4/h;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Ll8/g;

.field public d:Ll8/h;

.field public final e:Lcom/zykj/study/bean/ClientCodeLiveData;

.field public volatile f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public g:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/repository/RefreshRepositoryImp$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/repository/RefreshRepositoryImp$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/repository/RefreshRepositoryImp;->h:Lcom/zykj/study/repository/RefreshRepositoryImp$a;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    sput v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->i:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getName(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/zykj/study/repository/RefreshRepositoryImp;->j:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lo4/h;Landroidx/datastore/core/DataStore;Ll8/g;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)V
    .locals 1

    .line 1
    const-string v0, "autoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serverDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "unauthorizedFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headerBeanFlow"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "clientCodeLiveData"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Li3/a;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->a:Lo4/h;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->b:Landroidx/datastore/core/DataStore;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->c:Ll8/g;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->d:Ll8/h;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->e:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 38
    .line 39
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    new-instance p1, Ljava/lang/StringBuffer;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic b(Lcom/zykj/study/repository/RefreshRepositoryImp;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/repository/RefreshRepositoryImp;->c(Lcom/zykj/study/repository/RefreshRepositoryImp;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/study/repository/RefreshRepositoryImp;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->d:Ll8/h;

    .line 5
    .line 6
    :cond_0
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    const/16 v9, 0x17

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    invoke-static/range {v3 .. v10}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->d()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, v0, p1}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 47
    .line 48
    .line 49
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 50
    .line 51
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v10, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;-><init>(Lcom/zykj/study/repository/RefreshRepositoryImp;Lm7/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->i:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 38
    .line 39
    const-wide/16 v11, 0x64

    .line 40
    .line 41
    const/4 v14, 0x1

    .line 42
    const/4 v15, 0x0

    .line 43
    packed-switch v3, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :pswitch_0
    iget-object v2, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/lang/Throwable;

    .line 57
    .line 58
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lcom/zykj/lib/login/proto/ServerBean;

    .line 61
    .line 62
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lcom/zykj/lib/login/proto/ServerBean;

    .line 65
    .line 66
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_e

    .line 74
    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto/16 :goto_10

    .line 77
    .line 78
    :pswitch_1
    iget v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 79
    .line 80
    iget-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Lcom/zykj/study/bean/TokenResp;

    .line 83
    .line 84
    iget-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Lcom/zykj/http/bean/ApiResp;

    .line 87
    .line 88
    iget-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean;

    .line 91
    .line 92
    iget-object v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Lcom/zykj/lib/login/proto/ServerBean;

    .line 95
    .line 96
    iget-object v7, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v7, Ljava/lang/String;

    .line 99
    .line 100
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    goto/16 :goto_9

    .line 104
    .line 105
    :catchall_1
    move-exception v0

    .line 106
    goto/16 :goto_c

    .line 107
    .line 108
    :pswitch_2
    iget v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->h:I

    .line 109
    .line 110
    iget v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 111
    .line 112
    iget-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->f:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v5, Lcom/zykj/study/bean/TokenResp;

    .line 115
    .line 116
    iget-object v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, Lcom/zykj/http/bean/ApiResp;

    .line 119
    .line 120
    iget-object v7, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->d:Ljava/lang/Object;

    .line 121
    .line 122
    iget-object v8, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v8, Lcom/zykj/lib/login/proto/ServerBean;

    .line 125
    .line 126
    iget-object v9, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v9, Lcom/zykj/lib/login/proto/ServerBean;

    .line 129
    .line 130
    iget-object v11, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v11, Ljava/lang/String;

    .line 133
    .line 134
    :try_start_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    move v0, v3

    .line 138
    move v3, v4

    .line 139
    move-object v4, v5

    .line 140
    move-object v5, v8

    .line 141
    move-object v8, v7

    .line 142
    move-object v7, v6

    .line 143
    move-object v6, v9

    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :catchall_2
    move-exception v0

    .line 147
    move v3, v4

    .line 148
    move-object v5, v8

    .line 149
    move-object v6, v9

    .line 150
    :goto_2
    move-object v7, v11

    .line 151
    goto/16 :goto_c

    .line 152
    .line 153
    :pswitch_3
    iget v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 154
    .line 155
    iget-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v5, v4

    .line 158
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean;

    .line 159
    .line 160
    iget-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 161
    .line 162
    move-object v6, v4

    .line 163
    check-cast v6, Lcom/zykj/lib/login/proto/ServerBean;

    .line 164
    .line 165
    iget-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v7, v4

    .line 168
    check-cast v7, Ljava/lang/String;

    .line 169
    .line 170
    :try_start_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 171
    .line 172
    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :pswitch_4
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Lcom/zykj/lib/login/proto/ServerBean;

    .line 178
    .line 179
    iget-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v16, v3

    .line 187
    .line 188
    move-object/from16 v17, v4

    .line 189
    .line 190
    goto/16 :goto_5

    .line 191
    .line 192
    :pswitch_5
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :pswitch_6
    iget-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v3, Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-object v0, v3

    .line 208
    goto :goto_3

    .line 209
    :pswitch_7
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 213
    .line 214
    invoke-virtual {v0, v15, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_2

    .line 219
    .line 220
    move-object/from16 v0, p1

    .line 221
    .line 222
    :cond_1
    :goto_3
    iget-object v3, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_e

    .line 229
    .line 230
    sget-object v3, Lcom/zykj/study/repository/RefreshRepositoryImp;->j:Ljava/lang/String;

    .line 231
    .line 232
    const-string v4, "token\u6b63\u5728\u83b7\u53d6\u4e2d"

    .line 233
    .line 234
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iput-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 242
    .line 243
    iput v14, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 244
    .line 245
    invoke-static {v11, v12, v10}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    if-ne v3, v2, :cond_1

    .line 250
    .line 251
    goto/16 :goto_d

    .line 252
    .line 253
    :cond_2
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->b:Landroidx/datastore/core/DataStore;

    .line 254
    .line 255
    invoke-interface {v0}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    move-object/from16 v3, p1

    .line 260
    .line 261
    iput-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 262
    .line 263
    const/4 v4, 0x2

    .line 264
    iput v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 265
    .line 266
    invoke-static {v0, v10}, Ll8/e;->x(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-ne v0, v2, :cond_3

    .line 271
    .line 272
    goto/16 :goto_d

    .line 273
    .line 274
    :cond_3
    :goto_4
    check-cast v0, Lcom/zykj/lib/login/proto/ServerBean;

    .line 275
    .line 276
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    const-string v5, "getAccessToken(...)"

    .line 281
    .line 282
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-lez v4, :cond_4

    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-nez v4, :cond_4

    .line 304
    .line 305
    iget-object v2, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 306
    .line 307
    invoke-virtual {v2, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :cond_4
    sget-object v4, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 320
    .line 321
    invoke-virtual {v4}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_5

    .line 326
    .line 327
    new-instance v0, Lt4/e;

    .line 328
    .line 329
    invoke-direct {v0, v1}, Lt4/e;-><init>(Lcom/zykj/study/repository/RefreshRepositoryImp;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4, v0}, Lcom/zykj/message/client/MessageClient;->h(Lx7/l;)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_f

    .line 336
    .line 337
    :cond_5
    iget-object v4, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->b:Landroidx/datastore/core/DataStore;

    .line 338
    .line 339
    invoke-interface {v4}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-static {v3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    iput-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    iput-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 354
    .line 355
    const/4 v5, 0x3

    .line 356
    iput v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 357
    .line 358
    invoke-static {v4, v10}, Ll8/e;->x(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    if-ne v4, v2, :cond_6

    .line 363
    .line 364
    goto/16 :goto_d

    .line 365
    .line 366
    :cond_6
    move-object/from16 v16, v0

    .line 367
    .line 368
    move-object/from16 v17, v3

    .line 369
    .line 370
    move-object v0, v4

    .line 371
    :goto_5
    move-object v3, v0

    .line 372
    check-cast v3, Lcom/zykj/lib/login/proto/ServerBean;

    .line 373
    .line 374
    :try_start_4
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->a:Lo4/h;

    .line 375
    .line 376
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/ServerBean;->getServerUrl()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    new-instance v5, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v4, "/api/TokenAuth/RefreshToken"

    .line 389
    .line 390
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    const-string v5, "com.zhongyukejiao.learningexpert"

    .line 398
    .line 399
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    new-instance v7, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    const-string v8, "bearer "

    .line 409
    .line 410
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/ServerBean;->getRefreshToken()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    const-string v6, "getRefreshToken(...)"

    .line 425
    .line 426
    invoke-static {v8, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iget-object v6, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->e:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 430
    .line 431
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    check-cast v6, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 436
    .line 437
    if-nez v6, :cond_7

    .line 438
    .line 439
    :try_start_5
    const-string v6, ""
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 440
    .line 441
    :cond_7
    move-object v9, v6

    .line 442
    goto :goto_6

    .line 443
    :catchall_3
    move-exception v0

    .line 444
    move-object v5, v3

    .line 445
    move v3, v15

    .line 446
    move-object/from16 v6, v16

    .line 447
    .line 448
    move-object/from16 v7, v17

    .line 449
    .line 450
    goto/16 :goto_c

    .line 451
    .line 452
    :goto_6
    :try_start_6
    invoke-static/range {v17 .. v17}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    iput-object v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 457
    .line 458
    invoke-static/range {v16 .. v16}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    iput-object v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 465
    .line 466
    iput v15, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 467
    .line 468
    const/4 v6, 0x4

    .line 469
    iput v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 470
    .line 471
    const/16 v6, 0x2777

    .line 472
    .line 473
    move-object/from16 v18, v3

    .line 474
    .line 475
    move-object v3, v0

    .line 476
    :try_start_7
    invoke-interface/range {v3 .. v10}, Lo4/h;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 480
    if-ne v0, v2, :cond_8

    .line 481
    .line 482
    goto/16 :goto_d

    .line 483
    .line 484
    :cond_8
    move v3, v15

    .line 485
    move-object/from16 v6, v16

    .line 486
    .line 487
    move-object/from16 v7, v17

    .line 488
    .line 489
    move-object/from16 v5, v18

    .line 490
    .line 491
    :goto_7
    :try_start_8
    move-object v4, v0

    .line 492
    check-cast v4, Lcom/zykj/http/bean/ApiResp;

    .line 493
    .line 494
    invoke-virtual {v4}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    check-cast v8, Lcom/zykj/study/bean/TokenResp;

    .line 499
    .line 500
    if-nez v8, :cond_9

    .line 501
    .line 502
    new-instance v0, Ljava/lang/StringBuffer;

    .line 503
    .line 504
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 505
    .line 506
    .line 507
    iput-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 508
    .line 509
    goto/16 :goto_a

    .line 510
    .line 511
    :cond_9
    iget-object v9, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->d:Ll8/h;

    .line 512
    .line 513
    :cond_a
    invoke-interface {v9}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v14

    .line 517
    move-object/from16 v16, v14

    .line 518
    .line 519
    check-cast v16, Lcom/zykj/http/bean/HeaderBean;

    .line 520
    .line 521
    invoke-virtual {v8}, Lcom/zykj/study/bean/TokenResp;->getAccessToken()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v20

    .line 525
    invoke-virtual {v8}, Lcom/zykj/study/bean/TokenResp;->getRefreshToken()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v21

    .line 529
    const/16 v22, 0x7

    .line 530
    .line 531
    const/16 v23, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    const/16 v19, 0x0

    .line 538
    .line 539
    invoke-static/range {v16 .. v23}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 540
    .line 541
    .line 542
    move-result-object v13

    .line 543
    invoke-interface {v9, v14, v13}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v13

    .line 547
    if-eqz v13, :cond_a

    .line 548
    .line 549
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    iput-object v9, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 554
    .line 555
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    iput-object v9, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 560
    .line 561
    iput-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 562
    .line 563
    iput-object v0, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->d:Ljava/lang/Object;

    .line 564
    .line 565
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    iput-object v9, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->e:Ljava/lang/Object;

    .line 570
    .line 571
    iput-object v8, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->f:Ljava/lang/Object;

    .line 572
    .line 573
    iput v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 574
    .line 575
    iput v15, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->h:I

    .line 576
    .line 577
    const/4 v9, 0x5

    .line 578
    iput v9, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 579
    .line 580
    invoke-static {v11, v12, v10}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 584
    if-ne v9, v2, :cond_b

    .line 585
    .line 586
    goto/16 :goto_d

    .line 587
    .line 588
    :cond_b
    move-object v11, v7

    .line 589
    move-object v7, v4

    .line 590
    move-object v4, v8

    .line 591
    move-object v8, v0

    .line 592
    move v0, v15

    .line 593
    :goto_8
    :try_start_9
    iget-object v9, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->b:Landroidx/datastore/core/DataStore;

    .line 594
    .line 595
    new-instance v12, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    invoke-direct {v12, v4, v13}, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$3$1$2;-><init>(Lcom/zykj/study/bean/TokenResp;Lm7/c;)V

    .line 599
    .line 600
    .line 601
    invoke-static {v11}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v13

    .line 605
    iput-object v13, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 606
    .line 607
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v13

    .line 611
    iput-object v13, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 612
    .line 613
    iput-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 614
    .line 615
    iput-object v8, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->d:Ljava/lang/Object;

    .line 616
    .line 617
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    iput-object v7, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->e:Ljava/lang/Object;

    .line 622
    .line 623
    iput-object v4, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->f:Ljava/lang/Object;

    .line 624
    .line 625
    iput v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 626
    .line 627
    iput v0, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->h:I

    .line 628
    .line 629
    const/4 v0, 0x6

    .line 630
    iput v0, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 631
    .line 632
    invoke-interface {v9, v12, v10}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 636
    if-ne v0, v2, :cond_c

    .line 637
    .line 638
    goto :goto_d

    .line 639
    :cond_c
    move-object v7, v11

    .line 640
    :goto_9
    :try_start_a
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 641
    .line 642
    invoke-virtual {v4}, Lcom/zykj/study/bean/TokenResp;->getAccessToken()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    invoke-virtual {v0, v15, v4}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 647
    .line 648
    .line 649
    :goto_a
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 650
    .line 651
    const/4 v2, 0x1

    .line 652
    invoke-virtual {v0, v2, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 653
    .line 654
    .line 655
    goto :goto_f

    .line 656
    :catchall_4
    move-exception v0

    .line 657
    goto/16 :goto_2

    .line 658
    .line 659
    :catchall_5
    move-exception v0

    .line 660
    :goto_b
    move v3, v15

    .line 661
    move-object/from16 v6, v16

    .line 662
    .line 663
    move-object/from16 v7, v17

    .line 664
    .line 665
    move-object/from16 v5, v18

    .line 666
    .line 667
    goto :goto_c

    .line 668
    :catchall_6
    move-exception v0

    .line 669
    move-object/from16 v18, v3

    .line 670
    .line 671
    goto :goto_b

    .line 672
    :goto_c
    :try_start_b
    iget-object v4, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 673
    .line 674
    invoke-virtual {v5}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v8

    .line 678
    invoke-virtual {v4, v15, v8}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 679
    .line 680
    .line 681
    iget-object v4, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->c:Ll8/g;

    .line 682
    .line 683
    sget-object v8, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 684
    .line 685
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    iput-object v7, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->a:Ljava/lang/Object;

    .line 690
    .line 691
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    iput-object v6, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->b:Ljava/lang/Object;

    .line 696
    .line 697
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    iput-object v5, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->c:Ljava/lang/Object;

    .line 702
    .line 703
    iput-object v0, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->d:Ljava/lang/Object;

    .line 704
    .line 705
    const/4 v13, 0x0

    .line 706
    iput-object v13, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->e:Ljava/lang/Object;

    .line 707
    .line 708
    iput-object v13, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->f:Ljava/lang/Object;

    .line 709
    .line 710
    iput v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->g:I

    .line 711
    .line 712
    const/4 v3, 0x7

    .line 713
    iput v3, v10, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    .line 714
    .line 715
    invoke-interface {v4, v8, v10}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    if-ne v3, v2, :cond_d

    .line 720
    .line 721
    :goto_d
    return-object v2

    .line 722
    :cond_d
    move-object v2, v0

    .line 723
    :goto_e
    sget-object v0, Lcom/zykj/study/repository/RefreshRepositoryImp;->j:Ljava/lang/String;

    .line 724
    .line 725
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    new-instance v4, Ljava/lang/StringBuilder;

    .line 734
    .line 735
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    const-string v3, " token\u83b7\u53d6\u5931\u8d25 "

    .line 742
    .line 743
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    invoke-static {v0}, Lo7/a;->c(I)Ljava/lang/Integer;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 758
    .line 759
    .line 760
    goto :goto_a

    .line 761
    :cond_e
    :goto_f
    iget-object v0, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->g:Ljava/lang/StringBuffer;

    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    const-string v2, "toString(...)"

    .line 768
    .line 769
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    return-object v0

    .line 773
    :goto_10
    iget-object v2, v1, Lcom/zykj/study/repository/RefreshRepositoryImp;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 774
    .line 775
    const/4 v3, 0x1

    .line 776
    invoke-virtual {v2, v3, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 777
    .line 778
    .line 779
    throw v0

    .line 780
    nop

    .line 781
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
