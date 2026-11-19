.class public final Lw1/g$b;
.super Lw1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:Lw1/g$d;

.field public final c:Lw1/g$b;


# direct methods
.method public constructor <init>(Lw1/g$h;Lw1/g$d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lw1/g$b;->c:Lw1/g$b;

    .line 5
    .line 6
    iput-object p1, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 7
    .line 8
    iput-object p2, p0, Lw1/g$b;->b:Lw1/g$d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lcc/a$c;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lw1/g$b;->e()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lw1/g$i;

    .line 6
    .line 7
    iget-object v2, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 8
    .line 9
    iget-object v3, p0, Lw1/g$b;->b:Lw1/g$d;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lw1/g$i;-><init>(Lw1/g$h;Lw1/g$d;Lw1/h;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcc/b;->a(Ljava/util/Map;Lbc/d;)Lcc/a$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public b(Lcom/friday/document/view/viewer/VideoPlayerActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lcom/friday/paint/view/six/NewNoteActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lcom/friday/login/view/LoginActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-static {v0}, Lgc/d;->b(I)Lgc/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lb2/f;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lb2/d;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lw3/c;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Lw3/a;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Le4/c;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, Le4/a;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Lw3/g;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {}, Lw3/e;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lz2/e;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {}, Lz2/c;->a()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v1, Lw3/j;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {}, Lw3/h;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, Lw3/n;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, Lw3/l;->a()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Lm3/c;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {}, Lm3/a;->a()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, Lq3/c;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {}, Lq3/a;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sget-object v1, Ly1/c;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {}, Ly1/a;->a()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v1, Lz2/h;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {}, Lz2/f;->a()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, Le4/g;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {}, Le4/e;->a()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sget-object v1, Lz2/l;->a:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {}, Lz2/j;->a()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sget-object v1, Le4/j;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {}, Le4/h;->a()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v1, Le4/m;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {}, Le4/k;->a()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v1, Lz2/p;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {}, Lz2/n;->a()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v1, Lwa/d;->a:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {}, Lwa/b;->a()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sget-object v1, Lz2/t;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {}, Lz2/r;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget-object v1, Lw3/r;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {}, Lw3/p;->a()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    sget-object v1, Lz2/y;->a:Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {}, Lz2/w;->a()Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sget-object v1, Lz2/c0;->a:Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {}, Lz2/a0;->a()Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    sget-object v1, Lz2/m0;->a:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {}, Lz2/k0;->a()Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    sget-object v1, Lz2/s0;->a:Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {}, Lz2/q0;->a()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget-object v1, Lz2/v0;->a:Ljava/lang/String;

    .line 330
    .line 331
    invoke-static {}, Lz2/t0;->a()Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sget-object v1, Lz2/a1;->a:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {}, Lz2/y0;->a()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    sget-object v1, Li4/c;->a:Ljava/lang/String;

    .line 358
    .line 359
    invoke-static {}, Li4/a;->a()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v0, v1, v2}, Lgc/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lgc/d;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0}, Lgc/d;->a()Ljava/util/Map;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v0}, Lgc/c;->a(Ljava/util/Map;)Ljava/util/Map;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    return-object v0
.end method

.method public f(Lcom/friday/document/view/viewer/PdfViewerActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Lcom/zykj/cloudhelper/activity/NoteManagerActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Lcom/friday/document/view/viewer/TxtEditActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Lcom/friday/common/activity/RequestScreenCastActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$b;->z(Lcom/friday/common/activity/RequestScreenCastActivity;)Lcom/friday/common/activity/RequestScreenCastActivity;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public j(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Lcom/friday/cloudsnote/view/MainActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Lcom/friday/main/view/FullScreenPreviewActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Lcom/friday/paint/view/NoteActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$b;->y(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public o(Lcom/friday/document/view/TeacherOnlyActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Lcom/friday/document/view/share/ShareSearchActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lcom/friday/common/camera/CameraActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$b;->x(Lcom/friday/common/camera/CameraActivity;)Lcom/friday/common/camera/CameraActivity;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public r(Lcom/friday/main/view/FolderMoveActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(Lcom/friday/document/view/viewer/ImagePreviewActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t(Lcom/friday/main/view/SearchActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(Lcom/friday/main/view/DBActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public v()Lbc/d;
    .locals 4

    .line 1
    new-instance v0, Lw1/g$i;

    .line 2
    .line 3
    iget-object v1, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 4
    .line 5
    iget-object v2, p0, Lw1/g$b;->b:Lw1/g$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lw1/g$i;-><init>(Lw1/g$h;Lw1/g$d;Lw1/h;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public w()Lbc/c;
    .locals 5

    .line 1
    new-instance v0, Lw1/g$f;

    .line 2
    .line 3
    iget-object v1, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 4
    .line 5
    iget-object v2, p0, Lw1/g$b;->b:Lw1/g$d;

    .line 6
    .line 7
    iget-object v3, p0, Lw1/g$b;->c:Lw1/g$b;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lw1/g$f;-><init>(Lw1/g$h;Lw1/g$d;Lw1/g$b;Lw1/h;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final x(Lcom/friday/common/camera/CameraActivity;)Lcom/friday/common/camera/CameraActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 2
    .line 3
    invoke-static {v0}, Lw1/g$h;->i(Lw1/g$h;)Lc3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lc3/c;->a(Lc3/a;)Lj2/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, v0}, Lb2/c;->a(Lcom/friday/common/camera/CameraActivity;Lj2/b;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final y(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/view/HomeActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 2
    .line 3
    invoke-static {v0}, Lw1/g$h;->l(Lw1/g$h;)Lg4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lg4/b;->a(Lg4/a;)Lj2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, v0}, Lv3/u1;->g(Lcom/friday/main/view/HomeActivity;Lj2/j;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 15
    .line 16
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lp2/c;->a(Lp2/a;)Lj2/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Lv3/u1;->a(Lcom/friday/main/view/HomeActivity;Lj2/c;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 28
    .line 29
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lp2/f;->a(Lp2/a;)Lj2/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, Lv3/u1;->b(Lcom/friday/main/view/HomeActivity;Lj2/f;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 41
    .line 42
    invoke-static {v0}, Lw1/g$h;->i(Lw1/g$h;)Lc3/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lc3/c;->a(Lc3/a;)Lj2/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p1, v0}, Lv3/u1;->c(Lcom/friday/main/view/HomeActivity;Lj2/b;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 54
    .line 55
    invoke-static {v0}, Lw1/g$h;->i(Lw1/g$h;)Lc3/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lc3/b;->a(Lc3/a;)Lj2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {p1, v0}, Lv3/u1;->d(Lcom/friday/main/view/HomeActivity;Lj2/e;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 67
    .line 68
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lp2/i;->a(Lp2/a;)Lj2/i;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p1, v0}, Lv3/u1;->f(Lcom/friday/main/view/HomeActivity;Lj2/i;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 80
    .line 81
    invoke-static {v0}, Lw1/g$h;->g(Lw1/g$h;)Lp2/a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lp2/h;->a(Lp2/a;)Lj2/h;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p1, v0}, Lv3/u1;->e(Lcom/friday/main/view/HomeActivity;Lj2/h;)V

    .line 90
    .line 91
    .line 92
    return-object p1
.end method

.method public final z(Lcom/friday/common/activity/RequestScreenCastActivity;)Lcom/friday/common/activity/RequestScreenCastActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$b;->a:Lw1/g$h;

    .line 2
    .line 3
    invoke-static {v0}, Lw1/g$h;->i(Lw1/g$h;)Lc3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lc3/b;->a(Lc3/a;)Lj2/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, v0}, La2/h;->a(Lcom/friday/common/activity/RequestScreenCastActivity;Lj2/e;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method
