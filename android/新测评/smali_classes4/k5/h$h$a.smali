.class public final Lk5/h$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:I


# direct methods
.method public constructor <init>(Lk5/h$h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 5
    .line 6
    iput p2, p0, Lk5/h$h$a;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static bridge synthetic a(Lk5/h$h$a;)Lk5/h$h;
    .locals 0

    .line 1
    iget-object p0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lk5/h$h$a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lk5/h$h$a;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lp5/m;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;)La9/v;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 25
    .line 26
    iget-object v0, v0, Lk5/h$h;->w:Lo8/f;

    .line 27
    .line 28
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La9/v;

    .line 33
    .line 34
    invoke-static {v0}, Lp5/n;->a(La9/v;)Lp5/k;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_2
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 40
    .line 41
    iget-object v0, v0, Lk5/h$h;->h:Lo8/f;

    .line 42
    .line 43
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lr9/d0;

    .line 48
    .line 49
    invoke-static {v0}, Lp5/h;->a(Lr9/d0;)Lh7/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :pswitch_3
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 55
    .line 56
    iget-object v0, v0, Lk5/h$h;->j:Lo8/f;

    .line 57
    .line 58
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/zykj/evaluation/di/AppDatabase;

    .line 63
    .line 64
    iget-object v1, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 65
    .line 66
    iget-object v1, v1, Lk5/h$h;->k:Lo8/f;

    .line 67
    .line 68
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lr5/b;->a(Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_4
    new-instance v0, Lk5/h$h$a$h;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lk5/h$h$a$h;-><init>(Lk5/h$h$a;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_5
    new-instance v0, Lk5/h$h$a$g;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Lk5/h$h$a$g;-><init>(Lk5/h$h$a;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_6
    new-instance v0, Lk5/h$h$a$f;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Lk5/h$h$a$f;-><init>(Lk5/h$h$a;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_7
    new-instance v0, Lk5/h$h$a$e;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Lk5/h$h$a$e;-><init>(Lk5/h$h$a;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_8
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 104
    .line 105
    iget-object v0, v0, Lk5/h$h;->h:Lo8/f;

    .line 106
    .line 107
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lr9/d0;

    .line 112
    .line 113
    invoke-static {v0}, Lp5/e;->a(Lr9/d0;)Lp5/j;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_9
    new-instance v0, Lk5/h$h$a$d;

    .line 119
    .line 120
    invoke-direct {v0, p0}, Lk5/h$h$a$d;-><init>(Lk5/h$h$a;)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_a
    new-instance v0, Lk5/h$h$a$c;

    .line 125
    .line 126
    invoke-direct {v0, p0}, Lk5/h$h$a$c;-><init>(Lk5/h$h$a;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_b
    new-instance v0, Lk5/h$h$a$b;

    .line 131
    .line 132
    invoke-direct {v0, p0}, Lk5/h$h$a$b;-><init>(Lk5/h$h$a;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_c
    new-instance v0, Lk5/h$h$a$a;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Lk5/h$h$a$a;-><init>(Lk5/h$h$a;)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_d
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 143
    .line 144
    invoke-static {v0}, Lk5/h$h;->d(Lk5/h$h;)Lm8/a;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, Lm8/b;->a(Lm8/a;)Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lm5/h;->a(Landroid/content/Context;)Lcom/zykj/evaluation/di/AppDatabase;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_e
    new-instance v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;

    .line 158
    .line 159
    iget-object v1, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 160
    .line 161
    iget-object v1, v1, Lk5/h$h;->d:Lo8/f;

    .line 162
    .line 163
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 168
    .line 169
    invoke-direct {v0, v1}, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_f
    invoke-static {}, Lp5/f;->a()Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    return-object v0

    .line 178
    :pswitch_10
    invoke-static {}, Lp5/b;->a()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_11
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 184
    .line 185
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 189
    .line 190
    invoke-virtual {v1}, Lk5/h$h;->e()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget-object v2, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 195
    .line 196
    invoke-virtual {v2}, Lk5/h$h;->l()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v0, v1, v2}, Lp5/c;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)La9/v;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :pswitch_12
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 206
    .line 207
    iget-object v0, v0, Lk5/h$h;->g:Lo8/f;

    .line 208
    .line 209
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, La9/v;

    .line 214
    .line 215
    invoke-static {v0}, Lp5/d;->a(La9/v;)Lr9/d0;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0

    .line 220
    :pswitch_13
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 221
    .line 222
    iget-object v0, v0, Lk5/h$h;->h:Lo8/f;

    .line 223
    .line 224
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lr9/d0;

    .line 229
    .line 230
    invoke-static {v0}, Lf7/e;->a(Lr9/d0;)Lf7/c;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :pswitch_14
    invoke-static {}, Lp5/g;->a()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0

    .line 240
    :pswitch_15
    iget-object v0, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 241
    .line 242
    iget-object v0, v0, Lk5/h$h;->c:Lo8/f;

    .line 243
    .line 244
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 249
    .line 250
    iget-object v1, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 251
    .line 252
    iget-object v1, v1, Lk5/h$h;->i:Lo8/f;

    .line 253
    .line 254
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Lf7/c;

    .line 259
    .line 260
    iget-object v2, p0, Lk5/h$h$a;->a:Lk5/h$h;

    .line 261
    .line 262
    iget-object v2, v2, Lk5/h$h;->j:Lo8/f;

    .line 263
    .line 264
    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    check-cast v2, Lcom/zykj/evaluation/di/AppDatabase;

    .line 269
    .line 270
    invoke-static {v0, v1, v2}, Lf7/f;->a(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
