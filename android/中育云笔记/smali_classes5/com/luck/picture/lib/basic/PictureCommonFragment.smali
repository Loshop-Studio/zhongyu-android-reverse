.class public abstract Lcom/luck/picture/lib/basic/PictureCommonFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field public d:Lw6/c;

.field public e:I

.field public f:Ls6/a;

.field public g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public h:Lm6/b;

.field public i:Landroid/media/SoundPool;

.field public j:I

.field public k:J

.field public l:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 6
    .line 7
    return-void
.end method

.method public static X(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget p1, Lcom/luck/picture/lib/R$string;->ps_message_video_max_num:I

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {p1}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget p1, Lcom/luck/picture/lib/R$string;->ps_message_audio_max_num:I

    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    sget p1, Lcom/luck/picture/lib/R$string;->ps_message_max_num:I

    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static synthetic o(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Lcom/luck/picture/lib/basic/PictureCommonFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->v0(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->S(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(ZLjava/lang/String;Ljava/lang/String;JJ)Z
    .locals 6

    .line 1
    invoke-static {p3, p2}, Ll6/c;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p3, :cond_a

    .line 7
    .line 8
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 9
    .line 10
    iget-wide v1, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v5, v1, v3

    .line 15
    .line 16
    if-lez v5, :cond_0

    .line 17
    .line 18
    cmp-long v5, p4, v1

    .line 19
    .line 20
    if-lez v5, :cond_0

    .line 21
    .line 22
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 23
    .line 24
    invoke-static {v1, v2}, La7/i;->f(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget p2, Lcom/luck/picture/lib/R$string;->ps_select_max_size:I

    .line 29
    .line 30
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v0

    .line 42
    :cond_0
    iget-wide v1, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C:J

    .line 43
    .line 44
    cmp-long p3, v1, v3

    .line 45
    .line 46
    if-lez p3, :cond_1

    .line 47
    .line 48
    cmp-long p3, p4, v1

    .line 49
    .line 50
    if-gez p3, :cond_1

    .line 51
    .line 52
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 53
    .line 54
    invoke-static {v1, v2}, La7/i;->f(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget p2, Lcom/luck/picture/lib/R$string;->ps_select_min_size:I

    .line 59
    .line 60
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return v0

    .line 72
    :cond_1
    invoke-static {p2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    const/4 p4, 0x2

    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 80
    .line 81
    iget p5, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 82
    .line 83
    if-ne p5, p4, :cond_3

    .line 84
    .line 85
    iget p4, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 86
    .line 87
    if-lez p4, :cond_2

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget p4, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 91
    .line 92
    :goto_0
    iput p4, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 93
    .line 94
    if-nez p1, :cond_3

    .line 95
    .line 96
    invoke-static {}, Lu6/a;->l()I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 101
    .line 102
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 103
    .line 104
    if-lt p3, p4, :cond_3

    .line 105
    .line 106
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 113
    .line 114
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 115
    .line 116
    invoke-static {p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->X(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return v0

    .line 124
    :cond_3
    if-nez p1, :cond_4

    .line 125
    .line 126
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 127
    .line 128
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 129
    .line 130
    if-lez p2, :cond_4

    .line 131
    .line 132
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide p2

    .line 136
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 137
    .line 138
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 139
    .line 140
    int-to-long v1, p4

    .line 141
    cmp-long p2, p2, v1

    .line 142
    .line 143
    if-gez p2, :cond_4

    .line 144
    .line 145
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 146
    .line 147
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_video_min_second:I

    .line 148
    .line 149
    div-int/lit16 p4, p4, 0x3e8

    .line 150
    .line 151
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return v0

    .line 167
    :cond_4
    if-nez p1, :cond_9

    .line 168
    .line 169
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 170
    .line 171
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 172
    .line 173
    if-lez p1, :cond_9

    .line 174
    .line 175
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 176
    .line 177
    .line 178
    move-result-wide p1

    .line 179
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 180
    .line 181
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 182
    .line 183
    int-to-long p4, p3

    .line 184
    cmp-long p1, p1, p4

    .line 185
    .line 186
    if-lez p1, :cond_9

    .line 187
    .line 188
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 189
    .line 190
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_video_max_second:I

    .line 191
    .line 192
    div-int/lit16 p3, p3, 0x3e8

    .line 193
    .line 194
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return v0

    .line 210
    :cond_5
    invoke-static {p2}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result p3

    .line 214
    if-eqz p3, :cond_8

    .line 215
    .line 216
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 217
    .line 218
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 219
    .line 220
    if-ne p3, p4, :cond_6

    .line 221
    .line 222
    if-nez p1, :cond_6

    .line 223
    .line 224
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 233
    .line 234
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 235
    .line 236
    if-lt p3, p4, :cond_6

    .line 237
    .line 238
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 239
    .line 240
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 245
    .line 246
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 247
    .line 248
    invoke-static {p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->X(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return v0

    .line 256
    :cond_6
    if-nez p1, :cond_7

    .line 257
    .line 258
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 259
    .line 260
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 261
    .line 262
    if-lez p2, :cond_7

    .line 263
    .line 264
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 265
    .line 266
    .line 267
    move-result-wide p2

    .line 268
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 269
    .line 270
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 271
    .line 272
    int-to-long v1, p4

    .line 273
    cmp-long p2, p2, v1

    .line 274
    .line 275
    if-gez p2, :cond_7

    .line 276
    .line 277
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 278
    .line 279
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_audio_min_second:I

    .line 280
    .line 281
    div-int/lit16 p4, p4, 0x3e8

    .line 282
    .line 283
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return v0

    .line 299
    :cond_7
    if-nez p1, :cond_9

    .line 300
    .line 301
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 302
    .line 303
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 304
    .line 305
    if-lez p1, :cond_9

    .line 306
    .line 307
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 308
    .line 309
    .line 310
    move-result-wide p1

    .line 311
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 312
    .line 313
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 314
    .line 315
    int-to-long p4, p3

    .line 316
    cmp-long p1, p1, p4

    .line 317
    .line 318
    if-lez p1, :cond_9

    .line 319
    .line 320
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 321
    .line 322
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_audio_max_second:I

    .line 323
    .line 324
    div-int/lit16 p3, p3, 0x3e8

    .line 325
    .line 326
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return v0

    .line 342
    :cond_8
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 343
    .line 344
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 345
    .line 346
    if-ne p3, p4, :cond_9

    .line 347
    .line 348
    if-nez p1, :cond_9

    .line 349
    .line 350
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 359
    .line 360
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 361
    .line 362
    if-lt p1, p3, :cond_9

    .line 363
    .line 364
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 365
    .line 366
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 371
    .line 372
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 373
    .line 374
    invoke-static {p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->X(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    return v0

    .line 382
    :cond_9
    const/4 p1, 0x0

    .line 383
    return p1

    .line 384
    :cond_a
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 385
    .line 386
    sget p1, Lcom/luck/picture/lib/R$string;->ps_rule:I

    .line 387
    .line 388
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    return v0
.end method

.method public A0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq v1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq v1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq v1, v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->B0()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->C0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->z0()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_3
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s0:I

    .line 30
    .line 31
    invoke-static {}, Ll6/d;->c()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v0, v1, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->z0()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_4
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 42
    .line 43
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s0:I

    .line 44
    .line 45
    invoke-static {}, Ll6/d;->d()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-ne v0, v1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->C0()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_5
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->y0()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public B()Z
    .locals 1

    .line 1
    invoke-static {}, La7/j;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public B0()V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-class v2, Lq6/h;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " interface needs to be implemented for recording"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public C()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public C0()V
    .locals 3

    .line 1
    sget-object v0, Lw6/b;->d:[Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/luck/picture/lib/basic/PictureCommonFragment$j;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$j;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0, v0, v2}, Lw6/a;->i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public D(ZLjava/lang/String;IJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-lez v5, :cond_0

    .line 11
    .line 12
    cmp-long v5, p4, v1

    .line 13
    .line 14
    if-lez v5, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 17
    .line 18
    invoke-static {v1, v2}, La7/i;->f(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget p2, Lcom/luck/picture/lib/R$string;->ps_select_max_size:I

    .line 23
    .line 24
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return v6

    .line 36
    :cond_0
    iget-wide v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C:J

    .line 37
    .line 38
    cmp-long v2, v0, v3

    .line 39
    .line 40
    if-lez v2, :cond_1

    .line 41
    .line 42
    cmp-long p4, p4, v0

    .line 43
    .line 44
    if-gez p4, :cond_1

    .line 45
    .line 46
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 47
    .line 48
    invoke-static {v0, v1}, La7/i;->f(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget p2, Lcom/luck/picture/lib/R$string;->ps_select_min_size:I

    .line 53
    .line 54
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return v6

    .line 66
    :cond_1
    invoke-static {p2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    const/4 p5, 0x2

    .line 71
    if-eqz p4, :cond_6

    .line 72
    .line 73
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 74
    .line 75
    iget v0, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 76
    .line 77
    if-ne v0, p5, :cond_4

    .line 78
    .line 79
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 80
    .line 81
    if-gtz p4, :cond_2

    .line 82
    .line 83
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 84
    .line 85
    sget p1, Lcom/luck/picture/lib/R$string;->ps_rule:I

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return v6

    .line 95
    :cond_2
    if-nez p1, :cond_3

    .line 96
    .line 97
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    iget-object p5, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 106
    .line 107
    iget p5, p5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 108
    .line 109
    if-lt p4, p5, :cond_3

    .line 110
    .line 111
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 112
    .line 113
    sget p1, Lcom/luck/picture/lib/R$string;->ps_message_max_num:I

    .line 114
    .line 115
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return v6

    .line 131
    :cond_3
    if-nez p1, :cond_4

    .line 132
    .line 133
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 134
    .line 135
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 136
    .line 137
    if-lt p3, p4, :cond_4

    .line 138
    .line 139
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 146
    .line 147
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 148
    .line 149
    invoke-static {p1, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->X(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return v6

    .line 157
    :cond_4
    if-nez p1, :cond_5

    .line 158
    .line 159
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 160
    .line 161
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 162
    .line 163
    if-lez p2, :cond_5

    .line 164
    .line 165
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 166
    .line 167
    .line 168
    move-result-wide p2

    .line 169
    iget-object p4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 170
    .line 171
    iget p4, p4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 172
    .line 173
    int-to-long v0, p4

    .line 174
    cmp-long p2, p2, v0

    .line 175
    .line 176
    if-gez p2, :cond_5

    .line 177
    .line 178
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 179
    .line 180
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_video_min_second:I

    .line 181
    .line 182
    div-int/lit16 p4, p4, 0x3e8

    .line 183
    .line 184
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return v6

    .line 200
    :cond_5
    if-nez p1, :cond_7

    .line 201
    .line 202
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 203
    .line 204
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 205
    .line 206
    if-lez p1, :cond_7

    .line 207
    .line 208
    invoke-static {p6, p7}, La7/d;->i(J)J

    .line 209
    .line 210
    .line 211
    move-result-wide p1

    .line 212
    iget-object p3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 213
    .line 214
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 215
    .line 216
    int-to-long p4, p3

    .line 217
    cmp-long p1, p1, p4

    .line 218
    .line 219
    if-lez p1, :cond_7

    .line 220
    .line 221
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 222
    .line 223
    sget p1, Lcom/luck/picture/lib/R$string;->ps_select_video_max_second:I

    .line 224
    .line 225
    div-int/lit16 p3, p3, 0x3e8

    .line 226
    .line 227
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return v6

    .line 243
    :cond_6
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 244
    .line 245
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 246
    .line 247
    if-ne p2, p5, :cond_7

    .line 248
    .line 249
    if-nez p1, :cond_7

    .line 250
    .line 251
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 260
    .line 261
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 262
    .line 263
    if-lt p1, p2, :cond_7

    .line 264
    .line 265
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 266
    .line 267
    sget p1, Lcom/luck/picture/lib/R$string;->ps_message_max_num:I

    .line 268
    .line 269
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return v6

    .line 285
    :cond_7
    const/4 p1, 0x0

    .line 286
    return p1
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->i:Landroid/media/SoundPool;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->j:I

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/high16 v6, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const v2, 0x3dcccccd    # 0.1f

    .line 17
    .line 18
    .line 19
    const/high16 v3, 0x3f000000    # 0.5f

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->b0(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xc8

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 25
    .line 26
    iget p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-ne p2, v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-lez p2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->G0(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/entity/LocalMedia;->j0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->D0()V

    .line 60
    .line 61
    .line 62
    move v1, v2

    .line 63
    :goto_0
    xor-int/lit8 p2, v1, 0x1

    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->H0(ZLcom/luck/picture/lib/entity/LocalMedia;)V

    .line 66
    .line 67
    .line 68
    return v1
.end method

.method public final E0()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->i:Landroid/media/SoundPool;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->i:Landroid/media/SoundPool;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final F(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O0()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$e;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public F0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lk6/b;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 38
    .line 39
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    const-string v2, ""

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    move-object v1, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 52
    .line 53
    iget-boolean v3, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v3, "_"

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 80
    .line 81
    iget-object v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 95
    .line 96
    iget v5, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 97
    .line 98
    iget-object v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v3, v5, v1, v2, v4}, La7/i;->b(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, Ljava/io/FileOutputStream;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2}, La7/i;->q(Ljava/io/InputStream;Ljava/io/OutputStream;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 124
    .line 125
    iget-object v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v0, v2}, La7/h;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iput-object v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    .line 138
    :cond_2
    return-void

    .line 139
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public G0(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    instance-of v3, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    check-cast v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->n0(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final H()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public H0(ZLcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    instance-of v3, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    check-cast v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 41
    .line 42
    invoke-virtual {v2, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->x0(ZLcom/luck/picture/lib/entity/LocalMedia;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final I()V
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public I0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    instance-of v3, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    check-cast v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g0()V

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final J()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public J0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->k:J

    .line 2
    .line 3
    return-void
.end method

.method public final K()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public K0(Lw6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->d:Lw6/c;

    .line 2
    .line 3
    return-void
.end method

.method public final L()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q0:Lq6/l;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public L0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 17
    .line 18
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final M()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public M0(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/luck/picture/lib/basic/PictureCommonFragment$f;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$f;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final N()V
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lj6/b;->a()Ln6/c;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final N0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->V()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v1, v0}, Lp6/a;->c(Landroid/app/Activity;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public O()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h:Lm6/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h:Lm6/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    return-void

    .line 29
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public O0()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h:Lm6/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h:Lm6/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    return-void

    .line 29
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public P(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final P0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->l:Landroid/app/Dialog;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, p1}, Lm6/c;->a(Landroid/content/Context;Ljava/lang/String;)Lm6/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->l:Landroid/app/Dialog;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final Q(Landroid/content/Intent;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$k;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public Q0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 17
    .line 18
    new-instance v0, Landroid/content/Intent;

    .line 19
    .line 20
    const-string v1, "android.media.action.IMAGE_CAPTURE"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lcom/luck/picture/lib/service/ForegroundService;->c(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 51
    .line 52
    invoke-static {v1, v2}, La7/g;->c(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 59
    .line 60
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k:Z

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    const-string v2, "android.intent.extras.CAMERA_FACING"

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    :cond_0
    const-string v2, "output"

    .line 71
    .line 72
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x38d

    .line 76
    .line 77
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void
.end method

.method public R()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->w()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->i0(Ljava/util/ArrayList;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->y()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->r0(Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->v()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h0(Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->x()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->q0(Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->u0(Ljava/util/ArrayList;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public R0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 17
    .line 18
    new-instance v0, Landroid/content/Intent;

    .line 19
    .line 20
    const-string v1, "android.media.action.VIDEO_CAPTURE"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lcom/luck/picture/lib/service/ForegroundService;->c(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 51
    .line 52
    invoke-static {v1, v2}, La7/g;->d(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    const-string v2, "output"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 64
    .line 65
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k:Z

    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    const-string v1, "android.intent.extras.CAMERA_FACING"

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 76
    .line 77
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o0:Z

    .line 78
    .line 79
    const-string v2, "android.intent.extra.quickCapture"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 85
    .line 86
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w:I

    .line 87
    .line 88
    const-string v2, "android.intent.extra.durationLimit"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 94
    .line 95
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r:I

    .line 96
    .line 97
    const-string v2, "android.intent.extra.videoQuality"

    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    const/16 v1, 0x38d

    .line 103
    .line 104
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-void
.end method

.method public final S(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->t()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->r(Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->C()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->T0(Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f0(Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final S0(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O0()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->S(Ljava/util/ArrayList;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$d;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final T(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->T0(Ljava/util/ArrayList;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f0(Ljava/util/ArrayList;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final T0(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v3}, Ll6/c;->l(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f0(Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/util/Map$Entry;

    .line 75
    .line 76
    sget-object v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$b;

    .line 88
    .line 89
    invoke-direct {v1, p0, v0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment$b;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/ArrayList;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    throw p1
.end method

.method public U()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->k:J

    .line 2
    .line 3
    const-wide/16 v2, 0x32

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-lez v4, :cond_0

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    :cond_0
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-ltz v4, :cond_1

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    return-wide v2
.end method

.method public V(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "output"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/net/Uri;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public W()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public Y([Ljava/lang/String;)V
    .locals 7

    .line 1
    sput-object p1, Lw6/b;->a:[Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v2, p1

    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    aget-object v3, p1, v1

    .line 15
    .line 16
    invoke-static {v2, v3, v0}, La7/n;->b(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 22
    .line 23
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 24
    .line 25
    const/16 v3, 0x44e

    .line 26
    .line 27
    if-eqz v2, :cond_5

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    array-length v2, p1

    .line 32
    if-lez v2, :cond_4

    .line 33
    .line 34
    array-length v2, p1

    .line 35
    move v4, v1

    .line 36
    move v5, v4

    .line 37
    :goto_0
    if-ge v4, v2, :cond_3

    .line 38
    .line 39
    aget-object v5, p1, v4

    .line 40
    .line 41
    const-string v6, "android.permission.READ_EXTERNAL_STORAGE"

    .line 42
    .line 43
    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    const-string v6, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 50
    .line 51
    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v5, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :goto_1
    move v5, v0

    .line 61
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v1, v5

    .line 65
    :cond_4
    invoke-static {p0, v1, v3}, Lw6/d;->b(Landroidx/fragment/app/Fragment;ZI)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    invoke-static {p0, v3}, Lw6/d;->a(Landroidx/fragment/app/Fragment;I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public Z([Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lr6/b;->d(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public b0(Lcom/luck/picture/lib/entity/LocalMedia;Z)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->p()J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->B()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 18
    .line 19
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 20
    .line 21
    const/4 v8, -0x1

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    move v3, v0

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ge v0, v1, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v0, p0

    .line 54
    move v1, p2

    .line 55
    invoke-virtual/range {v0 .. v7}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->D(ZLjava/lang/String;IJJ)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    return v8

    .line 62
    :cond_2
    move v1, p2

    .line 63
    invoke-static {}, Lu6/a;->o()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v0, p0

    .line 68
    invoke-virtual/range {v0 .. v7}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->A(ZLjava/lang/String;Ljava/lang/String;JJ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    return v8

    .line 75
    :cond_3
    const/16 p1, 0xc8

    .line 76
    .line 77
    return p1
.end method

.method public c0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lcom/luck/picture/lib/basic/PictureSelectorSupporterActivity;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Lcom/luck/picture/lib/basic/PictureSelectorTransparentActivity;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final d0(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->k0(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->l0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public e0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isStateSaved()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-ge v1, v2, :cond_2

    .line 48
    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    instance-of v3, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    check-cast v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->o0()V

    .line 62
    .line 63
    .line 64
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
.end method

.method public final f0(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1}, Lk6/f;->e(Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, -0x1

    .line 29
    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v2, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->w0(ILjava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q0:Lq6/l;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v0, p1}, Lq6/l;->a(Ljava/util/ArrayList;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->m0()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public g0()V
    .locals 0

    .line 1
    return-void
.end method

.method public h0(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O0()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v4}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v4}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    new-instance v5, Ljava/io/File;

    .line 53
    .line 54
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->u0(Ljava/util/ArrayList;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$l;

    .line 86
    .line 87
    invoke-direct {v1, p0, p1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$l;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    throw p1
.end method

.method public i0(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    move-object v3, v1

    .line 9
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-ge v2, v4, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 20
    .line 21
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v5}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    invoke-static {v3}, Ll6/c;->g(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    new-instance v4, Ljava/io/File;

    .line 58
    .line 59
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_1
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v5, "CROP_"

    .line 77
    .line 78
    invoke-static {v5}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v5, ".jpg"

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    sget-object v6, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    new-instance v6, Ljava/io/File;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-direct {v6, v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v6}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 114
    .line 115
    .line 116
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 120
    .line 121
    throw v1
.end method

.method public j0(Landroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k0()V
    .locals 0

    .line 1
    return-void
.end method

.method public l0()V
    .locals 0

    .line 1
    return-void
.end method

.method public m0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->c0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ge v1, v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 51
    .line 52
    instance-of v2, v2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e0()V

    .line 57
    .line 58
    .line 59
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :goto_1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->a()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public n0(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o0()V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/luck/picture/lib/service/ForegroundService;->d(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    const/16 v1, 0x38d

    .line 13
    .line 14
    if-ne p2, v0, :cond_8

    .line 15
    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->Q(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 p2, 0x2b8

    .line 23
    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->j0(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/16 p2, 0x45

    .line 31
    .line 32
    if-ne p1, p2, :cond_c

    .line 33
    .line 34
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/4 v0, 0x0

    .line 43
    const/4 v1, 0x1

    .line 44
    if-ne p2, v1, :cond_3

    .line 45
    .line 46
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 51
    .line 52
    invoke-static {p3}, Ll6/a;->b(Landroid/content/Intent;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p2

    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_2
    const-string v0, ""

    .line 67
    .line 68
    :goto_0
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->Z(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    xor-int/2addr v0, v1

    .line 80
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->Y(Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {p3}, Ll6/a;->h(Landroid/content/Intent;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->T(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {p3}, Ll6/a;->e(Landroid/content/Intent;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->S(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p3}, Ll6/a;->f(Landroid/content/Intent;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->U(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {p3}, Ll6/a;->g(Landroid/content/Intent;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->V(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {p3}, Ll6/a;->c(Landroid/content/Intent;)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {p2, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->W(F)V

    .line 116
    .line 117
    .line 118
    invoke-static {p3}, Ll6/a;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-virtual {p2, p3}, Lcom/luck/picture/lib/entity/LocalMedia;->X(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p2, p3}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_3
    const-string p2, "output"

    .line 135
    .line 136
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_4

    .line 145
    .line 146
    const-string p2, "com.yalantis.ucrop.OutputUri"

    .line 147
    .line 148
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    :cond_4
    new-instance p3, Lorg/json/JSONArray;

    .line 153
    .line 154
    invoke-direct {p3, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-ne p2, v2, :cond_5

    .line 166
    .line 167
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-ge v0, p2, :cond_5

    .line 172
    .line 173
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    check-cast p2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 178
    .line 179
    invoke-virtual {p3, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const-string v3, "outPutPath"

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->Z(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    xor-int/2addr v3, v1

    .line 201
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->Y(Z)V

    .line 202
    .line 203
    .line 204
    const-string v3, "imageWidth"

    .line 205
    .line 206
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->T(I)V

    .line 211
    .line 212
    .line 213
    const-string v3, "imageHeight"

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->S(I)V

    .line 220
    .line 221
    .line 222
    const-string v3, "offsetX"

    .line 223
    .line 224
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->U(I)V

    .line 229
    .line 230
    .line 231
    const-string v3, "offsetY"

    .line 232
    .line 233
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->V(I)V

    .line 238
    .line 239
    .line 240
    const-string v3, "aspectRatio"

    .line 241
    .line 242
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 243
    .line 244
    .line 245
    move-result-wide v3

    .line 246
    double-to-float v3, v3

    .line 247
    invoke-virtual {p2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->W(F)V

    .line 248
    .line 249
    .line 250
    const-string v3, "customExtraData"

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {p2, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->X(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {p2, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    .line 265
    .line 266
    add-int/lit8 v0, v0, 0x1

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-static {p3, p2}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_5
    :goto_3
    new-instance p2, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->v()Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_6

    .line 293
    .line 294
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h0(Ljava/util/ArrayList;)V

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_6
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->x()Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_7

    .line 303
    .line 304
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->q0(Ljava/util/ArrayList;)V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_7
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->u0(Ljava/util/ArrayList;)V

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_8
    const/16 v0, 0x60

    .line 313
    .line 314
    if-ne p2, v0, :cond_a

    .line 315
    .line 316
    if-eqz p3, :cond_9

    .line 317
    .line 318
    invoke-static {p3}, Ll6/a;->a(Landroid/content/Intent;)Ljava/lang/Throwable;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    goto :goto_4

    .line 323
    :cond_9
    new-instance p1, Ljava/lang/Throwable;

    .line 324
    .line 325
    const-string p2, "image crop error"

    .line 326
    .line 327
    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    :goto_4
    if-eqz p1, :cond_c

    .line 331
    .line 332
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p2, p1}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_a
    if-nez p2, :cond_c

    .line 345
    .line 346
    if-ne p1, v1, :cond_b

    .line 347
    .line 348
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 353
    .line 354
    iget-object p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {p1, p2}, La7/h;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_b
    const/16 p2, 0x44e

    .line 361
    .line 362
    if-ne p1, p2, :cond_c

    .line 363
    .line 364
    sget-object p1, Lw6/b;->a:[Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->Z([Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_c
    :goto_5
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->a0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->t0()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->a0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 0

    .line 1
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz6/a;->e()Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget p2, p1, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->c:I

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget p1, p1, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->c:I

    .line 18
    .line 19
    invoke-static {p2, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget p2, Lcom/luck/picture/lib/R$anim;->ps_anim_alpha_enter:I

    .line 29
    .line 30
    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    .line 35
    .line 36
    .line 37
    move-result-wide p2

    .line 38
    invoke-virtual {p0, p2, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->J0(J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->k0()V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    iget p2, p1, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->d:I

    .line 46
    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget p1, p1, Lcom/luck/picture/lib/style/PictureWindowAnimationStyle;->d:I

    .line 54
    .line 55
    invoke-static {p2, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget p2, Lcom/luck/picture/lib/R$anim;->ps_anim_alpha_exit:I

    .line 65
    .line 66
    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->l0()V

    .line 71
    .line 72
    .line 73
    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->W()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->W()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E0()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->d:Lw6/c;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->d:Lw6/c;

    .line 13
    .line 14
    invoke-virtual {p1, p3, p2}, Lw6/a;->g([ILw6/c;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->d:Lw6/c;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "com.luck.picture.lib.PictureSelectorConfig"

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lm6/b;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p1, v0}, Lm6/b;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->h:Lm6/b;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p1, "com.luck.picture.lib.PictureSelectorConfig"

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 36
    .line 37
    :cond_1
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->L0()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->N0()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->M0(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 53
    .line 54
    iget-boolean p2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N:Z

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    new-instance p1, Landroid/media/SoundPool;

    .line 63
    .line 64
    const/4 p2, 0x3

    .line 65
    const/4 v0, 0x0

    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {p1, v1, p2, v0}, Landroid/media/SoundPool;-><init>(III)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->i:Landroid/media/SoundPool;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget v0, Lcom/luck/picture/lib/R$raw;->ps_click_music:I

    .line 77
    .line 78
    invoke-virtual {p1, p2, v0, v1}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iput p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->j:I

    .line 83
    .line 84
    :cond_2
    return-void
.end method

.method public p0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, v1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->w0(ILjava/util/ArrayList;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q0:Lq6/l;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Lq6/l;->onCancel()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->m0()V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public q0(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->O0()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/luck/picture/lib/basic/PictureCommonFragment$a;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$a;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method

.method public final r(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->T(Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 82
    .line 83
    sget-object v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$c;

    .line 92
    .line 93
    invoke-direct {v1, p0, p1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$c;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;Ljava/util/ArrayList;Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    throw p1
.end method

.method public r0(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
.end method

.method public s(Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->c(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 10
    .line 11
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->R(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, La7/j;->e()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->q0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 37
    .line 38
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p0:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, p1}, La7/c;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-object v0
.end method

.method public s0(Z[Ljava/lang/String;)V
    .locals 0

    .line 1
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    return-void
.end method

.method public t()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public t0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->I()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->N()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->H()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->M()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->K()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->L()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->J()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final u()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne v1, v2, :cond_9

    .line 8
    .line 9
    iget-boolean v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 16
    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move v1, v3

    .line 24
    move v2, v1

    .line 25
    move v4, v2

    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ge v1, v5, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 37
    .line 38
    invoke-virtual {v5}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {v5}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 57
    .line 58
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    if-lez v1, :cond_4

    .line 62
    .line 63
    if-lt v2, v1, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    throw v5

    .line 72
    :cond_4
    :goto_2
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 73
    .line 74
    if-lez v0, :cond_9

    .line 75
    .line 76
    if-lt v4, v0, :cond_5

    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_5
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    throw v5

    .line 86
    :cond_6
    invoke-static {}, Lu6/a;->o()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x1

    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 98
    .line 99
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 100
    .line 101
    if-lez v1, :cond_7

    .line 102
    .line 103
    invoke-static {}, Lu6/a;->l()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iget-object v4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 108
    .line 109
    iget v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 110
    .line 111
    if-ge v1, v4, :cond_7

    .line 112
    .line 113
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 114
    .line 115
    sget v0, Lcom/luck/picture/lib/R$string;->ps_min_img_num:I

    .line 116
    .line 117
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return v2

    .line 133
    :cond_7
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 140
    .line 141
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 142
    .line 143
    if-lez v1, :cond_8

    .line 144
    .line 145
    invoke-static {}, Lu6/a;->l()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iget-object v4, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 150
    .line 151
    iget v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 152
    .line 153
    if-ge v1, v4, :cond_8

    .line 154
    .line 155
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 156
    .line 157
    sget v0, Lcom/luck/picture/lib/R$string;->ps_min_video_num:I

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return v2

    .line 175
    :cond_8
    invoke-static {v0}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_9

    .line 180
    .line 181
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 182
    .line 183
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q:I

    .line 184
    .line 185
    if-lez v0, :cond_9

    .line 186
    .line 187
    invoke-static {}, Lu6/a;->l()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 192
    .line 193
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q:I

    .line 194
    .line 195
    if-ge v0, v1, :cond_9

    .line 196
    .line 197
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 198
    .line 199
    sget v0, Lcom/luck/picture/lib/R$string;->ps_min_audio_num:I

    .line 200
    .line 201
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->P0(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_9
    :goto_3
    return v3
.end method

.method public u0(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->S0(Ljava/util/ArrayList;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->z()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->F(Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->d0(Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->S(Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public v()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public final v0(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, La7/j;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    new-instance v0, Lk6/d;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, v1, p1}, Lk6/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 70
    .line 71
    :goto_0
    new-instance v1, Lk6/d;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-direct {v1, v2, v0}, Lk6/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    new-instance p1, Ljava/io/File;

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v0, p1}, La7/h;->e(Landroid/content/Context;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/4 v0, -0x1

    .line 108
    if-eq p1, v0, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0, p1}, La7/h;->n(Landroid/content/Context;I)V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_1
    return-void
.end method

.method public w()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public w0(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public x()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public x0(ZLcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    return-void
.end method

.method public y()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return v0
.end method

.method public y0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->p()Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$g;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$g;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->r(Lq6/c;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/luck/picture/lib/basic/PictureCommonFragment$h;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$h;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->q(Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "PhotoItemSelectedDialog"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public z()Z
    .locals 1

    .line 1
    invoke-static {}, La7/j;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public z0()V
    .locals 3

    .line 1
    sget-object v0, Lw6/b;->d:[Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/luck/picture/lib/basic/PictureCommonFragment$i;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment$i;-><init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0, v0, v2}, Lw6/a;->i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
