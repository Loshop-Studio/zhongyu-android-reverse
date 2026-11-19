.class public Lcom/xuexiang/xui/widget/imageview/edit/e;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field public c:[I

.field public d:Landroid/media/effect/EffectContext;

.field public e:Landroid/media/effect/Effect;

.field public f:Lcom/xuexiang/xui/widget/imageview/edit/g;

.field public g:I

.field public h:I

.field public i:Z

.field public j:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

.field public k:Landroid/graphics/Bitmap;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    new-array p1, p1, [I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 8
    .line 9
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/xuexiang/xui/widget/imageview/edit/g;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->i:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->l:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->b()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget v2, v1, v2

    .line 7
    .line 8
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->g:I

    .line 9
    .line 10
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->h:I

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    aget v1, v1, v5

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/media/effect/Effect;->apply(IIII)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->c:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->g(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->d:Landroid/media/effect/EffectContext;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/media/effect/EffectContext;->getFactory()Landroid/media/effect/EffectFactory;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/media/effect/Effect;->release()V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/edit/e$a;->a:[I

    .line 21
    .line 22
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->j:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    aget v2, v2, v3

    .line 29
    .line 30
    const-string v3, "android.media.effect.effects.FlipEffect"

    .line 31
    .line 32
    const-string v4, "strength"

    .line 33
    .line 34
    const-string v5, "scale"

    .line 35
    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    :pswitch_0
    return-void

    .line 40
    :pswitch_1
    const-string v2, "android.media.effect.effects.VignetteEffect"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 47
    .line 48
    invoke-virtual {v1, v5, v0}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    const-string v0, "android.media.effect.effects.TintEffect"

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 59
    .line 60
    const v1, -0xff01

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "tint"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    const-string v0, "android.media.effect.effects.ColorTemperatureEffect"

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 80
    .line 81
    const v1, 0x3f666666    # 0.9f

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    const-string v0, "android.media.effect.effects.SharpenEffect"

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_5
    const-string v0, "android.media.effect.effects.SepiaEffect"

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_6
    const-string v2, "android.media.effect.effects.SaturateEffect"

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 117
    .line 118
    invoke-virtual {v1, v5, v0}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_7
    const-string v0, "android.media.effect.effects.RotateEffect"

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 129
    .line 130
    const/16 v1, 0xb4

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "angle"

    .line 137
    .line 138
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_8
    const-string v0, "android.media.effect.effects.PosterizeEffect"

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_9
    const-string v0, "android.media.effect.effects.NegativeEffect"

    .line 152
    .line 153
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_a
    const-string v0, "android.media.effect.effects.LomoishEffect"

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_b
    const-string v0, "android.media.effect.effects.GrayscaleEffect"

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_c
    const-string v0, "android.media.effect.effects.GrainEffect"

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 185
    .line 186
    const/high16 v1, 0x3f800000    # 1.0f

    .line 187
    .line 188
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v4, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_d
    invoke-virtual {v1, v3}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 201
    .line 202
    const-string v1, "vertical"

    .line 203
    .line 204
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v0, v1, v2}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_e
    invoke-virtual {v1, v3}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 215
    .line 216
    const-string v1, "horizontal"

    .line 217
    .line 218
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {v0, v1, v2}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_f
    const-string v2, "android.media.effect.effects.FisheyeEffect"

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 231
    .line 232
    invoke-virtual {v1, v5, v0}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_10
    const-string v0, "android.media.effect.effects.FillLightEffect"

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 243
    .line 244
    const v1, 0x3f4ccccd    # 0.8f

    .line 245
    .line 246
    .line 247
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0, v4, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_11
    const-string v0, "android.media.effect.effects.DuotoneEffect"

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 262
    .line 263
    const/16 v1, -0x100

    .line 264
    .line 265
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    const-string v2, "first_color"

    .line 270
    .line 271
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 275
    .line 276
    const v1, -0xbbbbbc

    .line 277
    .line 278
    .line 279
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    const-string v2, "second_color"

    .line 284
    .line 285
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_12
    const-string v0, "android.media.effect.effects.DocumentaryEffect"

    .line 290
    .line 291
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_13
    const-string v0, "android.media.effect.effects.CrossProcessEffect"

    .line 299
    .line 300
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_14
    const-string v0, "android.media.effect.effects.ContrastEffect"

    .line 308
    .line 309
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 314
    .line 315
    const v1, 0x3fb33333    # 1.4f

    .line 316
    .line 317
    .line 318
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    const-string v2, "contrast"

    .line 323
    .line 324
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :pswitch_15
    const-string v0, "android.media.effect.effects.BrightnessEffect"

    .line 329
    .line 330
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 335
    .line 336
    const/high16 v1, 0x40000000    # 2.0f

    .line 337
    .line 338
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    const-string v2, "brightness"

    .line 343
    .line 344
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_16
    const-string v0, "android.media.effect.effects.BlackWhiteEffect"

    .line 349
    .line 350
    invoke-virtual {v1, v0}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 355
    .line 356
    const v1, 0x3dcccccd    # 0.1f

    .line 357
    .line 358
    .line 359
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    const-string v2, "black"

    .line 364
    .line 365
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 369
    .line 370
    const v1, 0x3f333333    # 0.7f

    .line 371
    .line 372
    .line 373
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    const-string v2, "white"

    .line 378
    .line 379
    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :pswitch_17
    const-string v2, "android.media.effect.effects.AutoFixEffect"

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->e:Landroid/media/effect/Effect;

    .line 390
    .line 391
    invoke-virtual {v1, v5, v0}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
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
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->k:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->g:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->k:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->h:I

    .line 25
    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 27
    .line 28
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->g:I

    .line 29
    .line 30
    invoke-virtual {v1, v3, v0}, Lcom/xuexiang/xui/widget/imageview/edit/g;->d(II)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 34
    .line 35
    aget v0, v0, v2

    .line 36
    .line 37
    const/16 v1, 0xde1

    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->k:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    invoke-static {v1, v2, v0, v2}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/edit/d;->c()V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->j:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->c:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget v1, v1, v2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/g;->c(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->c:[I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget v1, v1, v2

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/g;->c(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public f(Lcom/xuexiang/xui/widget/imageview/edit/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->j:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->i:Z

    .line 5
    .line 6
    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/media/effect/EffectContext;->createWithCurrentGlContext()Landroid/media/effect/EffectContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->d:Landroid/media/effect/EffectContext;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/g;->b()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->d()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->i:Z

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->j:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 23
    .line 24
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->c:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->c()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->a()V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/e;->e()V

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->l:Z

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-static {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/a;->a(Landroid/opengl/GLSurfaceView;Ljavax/microedition/khronos/opengles/GL10;)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "onDrawFrame: "

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "ImageFilterView"

    .line 64
    .line 65
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->l:Z

    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/e;->f:Lcom/xuexiang/xui/widget/imageview/edit/g;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/edit/g;->e(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    return-void
.end method
