# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/app/a$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$d;

.field public final c:Lcom/zykj/huiwei/launcher/app/a$l;

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lcom/zykj/huiwei/launcher/app/a$l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->d:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/VersionViewModel;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->g()Lw3/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 23
    .line 24
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/app/a$j;->t:La5/f;

    .line 25
    .line 26
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/viewmodels/VersionViewModel;-><init>(Lw3/d;Landroidx/datastore/core/DataStore;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_2
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;-><init>()V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_3
    new-instance v0, Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$l;->j:La5/f;

    .line 53
    .line 54
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/zykj/gallery/repository/GalleryRepository;

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lcom/zykj/gallery/ui/share/page/ShareViewModel;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_4
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 73
    .line 74
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/app/a$l;->c(Lcom/zykj/huiwei/launcher/app/a$l;)Landroidx/lifecycle/SavedStateHandle;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_5
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 85
    .line 86
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$l;->m:La5/f;

    .line 87
    .line 88
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 93
    .line 94
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 95
    .line 96
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 97
    .line 98
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 103
    .line 104
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;)V

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_6
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_7
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 121
    .line 122
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->q:La5/f;

    .line 125
    .line 126
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    move-object v3, v0

    .line 131
    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 134
    .line 135
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->i:La5/f;

    .line 136
    .line 137
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v4, v0

    .line 142
    check-cast v4, Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 143
    .line 144
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 145
    .line 146
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Ly4/b;->a(Ly4/a;)Landroid/app/Application;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 155
    .line 156
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->j:La5/f;

    .line 157
    .line 158
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    move-object v6, v0

    .line 163
    check-cast v6, Lcom/zykj/gallery/repository/GalleryRepository;

    .line 164
    .line 165
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 166
    .line 167
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 168
    .line 169
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v7, v0

    .line 174
    check-cast v7, Landroidx/datastore/core/DataStore;

    .line 175
    .line 176
    invoke-direct/range {v2 .. v7}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroid/app/Application;Lcom/zykj/gallery/repository/GalleryRepository;Landroidx/datastore/core/DataStore;)V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :pswitch_8
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/AuthRepository;

    .line 181
    .line 182
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 183
    .line 184
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->j:La5/f;

    .line 185
    .line 186
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 191
    .line 192
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/repository/AuthRepository;-><init>(Lcom/zykj/huiwei/launcher/api/AuthService;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_9
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 197
    .line 198
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 199
    .line 200
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 201
    .line 202
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v3, v0

    .line 207
    check-cast v3, Landroidx/datastore/core/DataStore;

    .line 208
    .line 209
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 210
    .line 211
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 212
    .line 213
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    move-object v4, v0

    .line 218
    check-cast v4, Landroidx/datastore/core/DataStore;

    .line 219
    .line 220
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 221
    .line 222
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->f:La5/f;

    .line 223
    .line 224
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    move-object v5, v0

    .line 229
    check-cast v5, Landroidx/datastore/core/DataStore;

    .line 230
    .line 231
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 232
    .line 233
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->g:La5/f;

    .line 234
    .line 235
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move-object v6, v0

    .line 240
    check-cast v6, Landroidx/datastore/core/DataStore;

    .line 241
    .line 242
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 243
    .line 244
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->h:La5/f;

    .line 245
    .line 246
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object v7, v0

    .line 251
    check-cast v7, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 252
    .line 253
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 254
    .line 255
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->r:La5/f;

    .line 256
    .line 257
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object v8, v0

    .line 262
    check-cast v8, Lcom/zykj/huiwei/launcher/repository/AuthRepository;

    .line 263
    .line 264
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 265
    .line 266
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->n:La5/f;

    .line 267
    .line 268
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    move-object v9, v0

    .line 273
    check-cast v9, Lw3/b;

    .line 274
    .line 275
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/a$l;->d()Lw3/a;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 288
    .line 289
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/app/a$j;->f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Ly4/b;->a(Ly4/a;)Landroid/app/Application;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    invoke-direct/range {v2 .. v12}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;-><init>(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/repository/AuthRepository;Lw3/b;Lcom/zykj/huiwei/launcher/repository/UserRepository;Lw3/a;Landroid/app/Application;)V

    .line 298
    .line 299
    .line 300
    return-object v2

    .line 301
    :pswitch_a
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    .line 302
    .line 303
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 304
    .line 305
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->q:La5/f;

    .line 306
    .line 307
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 312
    .line 313
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_b
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;

    .line 318
    .line 319
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 320
    .line 321
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->q:La5/f;

    .line 322
    .line 323
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 328
    .line 329
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 330
    .line 331
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/app/a$j;->m:La5/f;

    .line 332
    .line 333
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 338
    .line 339
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/api/HomeService;)V

    .line 340
    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_c
    new-instance v0, Lw3/b;

    .line 344
    .line 345
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 346
    .line 347
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->p:La5/f;

    .line 348
    .line 349
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, Lcom/zykj/huiwei/launcher/api/GatewayService;

    .line 354
    .line 355
    invoke-direct {v0, v1}, Lw3/b;-><init>(Lcom/zykj/huiwei/launcher/api/GatewayService;)V

    .line 356
    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_d
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 360
    .line 361
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 362
    .line 363
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->o:La5/f;

    .line 364
    .line 365
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    check-cast v1, Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 370
    .line 371
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;-><init>(Lcom/zykj/huiwei/launcher/api/NotificationService;)V

    .line 372
    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_e
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 376
    .line 377
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 378
    .line 379
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->f:La5/f;

    .line 380
    .line 381
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    move-object v3, v0

    .line 386
    check-cast v3, Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 387
    .line 388
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 389
    .line 390
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->m:La5/f;

    .line 391
    .line 392
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    move-object v4, v0

    .line 397
    check-cast v4, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 398
    .line 399
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 400
    .line 401
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->g:La5/f;

    .line 402
    .line 403
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object v5, v0

    .line 408
    check-cast v5, Landroidx/datastore/core/DataStore;

    .line 409
    .line 410
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 411
    .line 412
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 413
    .line 414
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    move-object v6, v0

    .line 419
    check-cast v6, Landroidx/datastore/core/DataStore;

    .line 420
    .line 421
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 422
    .line 423
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 424
    .line 425
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    move-object v7, v0

    .line 430
    check-cast v7, Landroidx/datastore/core/DataStore;

    .line 431
    .line 432
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 433
    .line 434
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/app/a$l;->n:La5/f;

    .line 435
    .line 436
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    move-object v8, v0

    .line 441
    check-cast v8, Lw3/b;

    .line 442
    .line 443
    invoke-direct/range {v2 .. v8}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lw3/b;)V

    .line 444
    .line 445
    .line 446
    return-object v2

    .line 447
    :pswitch_f
    new-instance v0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;

    .line 448
    .line 449
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 450
    .line 451
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$l;->j:La5/f;

    .line 452
    .line 453
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    check-cast v1, Lcom/zykj/gallery/repository/GalleryRepository;

    .line 458
    .line 459
    invoke-direct {v0, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;)V

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_10
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository;

    .line 464
    .line 465
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 466
    .line 467
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->n:La5/f;

    .line 468
    .line 469
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Lcom/zykj/gallery/api/PictureService;

    .line 474
    .line 475
    invoke-direct {v0, v1}, Lcom/zykj/gallery/repository/GalleryRepository;-><init>(Lcom/zykj/gallery/api/PictureService;)V

    .line 476
    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_11
    new-instance v0, Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;

    .line 480
    .line 481
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 482
    .line 483
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$l;->j:La5/f;

    .line 484
    .line 485
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Lcom/zykj/gallery/repository/GalleryRepository;

    .line 490
    .line 491
    invoke-direct {v0, v1}, Lcom/zykj/gallery/ui/gallery/detail/DetailViewModel;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_12
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;

    .line 496
    .line 497
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 498
    .line 499
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V

    .line 504
    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_13
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 508
    .line 509
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 510
    .line 511
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 516
    .line 517
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/app/a$l;->c(Lcom/zykj/huiwei/launcher/app/a$l;)Landroidx/lifecycle/SavedStateHandle;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V

    .line 522
    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_14
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 526
    .line 527
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 528
    .line 529
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/app/a$j;->m:La5/f;

    .line 530
    .line 531
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    check-cast v1, Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 536
    .line 537
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;-><init>(Lcom/zykj/huiwei/launcher/api/HomeService;)V

    .line 538
    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_15
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 542
    .line 543
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 544
    .line 545
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/a$l;->f()Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->c:Lcom/zykj/huiwei/launcher/app/a$l;

    .line 550
    .line 551
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/app/a$l;->f:La5/f;

    .line 552
    .line 553
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    check-cast v2, Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 558
    .line 559
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/app/a$l$a;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 560
    .line 561
    iget-object v3, v3, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 562
    .line 563
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    check-cast v3, Landroidx/datastore/core/DataStore;

    .line 568
    .line 569
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;-><init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Lcom/zykj/huiwei/launcher/repository/HomeRepository;Landroidx/datastore/core/DataStore;)V

    .line 570
    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_16
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 574
    .line 575
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;-><init>()V

    .line 576
    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
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
