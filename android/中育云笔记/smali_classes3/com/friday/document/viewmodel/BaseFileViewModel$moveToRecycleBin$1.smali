.class final Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->n0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.BaseFileViewModel$moveToRecycleBin$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x1b8,
        0x1ba,
        0x1bb,
        0x1bd,
        0x1c1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/viewmodel/BaseFileViewModel;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->f:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/util/List;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    if-eq v1, v6, :cond_4

    .line 16
    .line 17
    if-eq v1, v5, :cond_3

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-eq v1, v3, :cond_1

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Exception;

    .line 28
    .line 29
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 48
    .line 49
    :goto_0
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_2
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 65
    .line 66
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :try_start_3
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 78
    .line 79
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 86
    .line 87
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    .line 92
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 93
    .line 94
    invoke-static {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->o(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/l;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v0, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_6
    :try_start_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->o(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/l;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {v6}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->G()Ls2/a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->f:Ljava/util/List;

    .line 126
    .line 127
    iput v6, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 128
    .line 129
    invoke-interface {p1, v1, p0}, Ls2/a;->f(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-ne p1, v0, :cond_7

    .line 134
    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :cond_7
    :goto_1
    move-object v1, p1

    .line 138
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 139
    .line 140
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_9

    .line 145
    .line 146
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Ljava/util/List;

    .line 157
    .line 158
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    iput-object v8, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 163
    .line 164
    iput v5, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 165
    .line 166
    invoke-interface {p1, v3, p0}, Lcom/friday/common/dao/FileDao;->H(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-ne p1, v0, :cond_8

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 174
    .line 175
    invoke-static {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->p(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {v6}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 188
    .line 189
    iput v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 190
    .line 191
    invoke-interface {p1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v0, :cond_a

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 199
    .line 200
    invoke-static {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->p(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iput-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 213
    .line 214
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 215
    .line 216
    invoke-interface {p1, v4, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 220
    if-ne p1, v0, :cond_a

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_a
    :goto_3
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 224
    .line 225
    invoke-static {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->o(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/l;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-interface {p1, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :goto_4
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 241
    .line 242
    invoke-static {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->p(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->c:Ljava/lang/Object;

    .line 255
    .line 256
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->d:I

    .line 257
    .line 258
    invoke-interface {v1, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 262
    if-ne p1, v0, :cond_a

    .line 263
    .line 264
    :goto_5
    return-object v0

    .line 265
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 266
    .line 267
    return-object p1

    .line 268
    :goto_7
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 269
    .line 270
    invoke-static {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->o(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/l;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-interface {v0, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    throw p1
.end method
