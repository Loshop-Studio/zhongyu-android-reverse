.class public final synthetic La5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La5/e;Landroid/widget/DatePicker;Landroid/widget/DatePicker;La5/c;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput p1, p0, La5/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La5/h;->b:Ljava/lang/Object;

    iput-object p3, p0, La5/h;->c:Ljava/lang/Object;

    iput-object p4, p0, La5/h;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p3, p0, La5/h;->a:I

    iput-object p1, p0, La5/h;->b:Ljava/lang/Object;

    iput-object p2, p0, La5/h;->c:Ljava/lang/Object;

    iput-object p4, p0, La5/h;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, La5/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 9
    .line 10
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 13
    .line 14
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/data/SourceLoad;->a(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/support/v4/media/h;

    .line 25
    .line 26
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lretrofit2/h;

    .line 29
    .line 30
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/lang/Throwable;

    .line 33
    .line 34
    iget-object v0, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lretrofit2/n;

    .line 37
    .line 38
    invoke-interface {v1, v0, v2}, Lretrofit2/h;->k(Lretrofit2/e;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/support/v4/media/h;

    .line 45
    .line 46
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lretrofit2/h;

    .line 49
    .line 50
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lretrofit2/n0;

    .line 53
    .line 54
    iget-object v0, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lretrofit2/n;

    .line 57
    .line 58
    iget-object v3, v0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 59
    .line 60
    invoke-interface {v3}, Lretrofit2/e;->isCanceled()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    new-instance v2, Ljava/io/IOException;

    .line 67
    .line 68
    const-string v3, "Canceled"

    .line 69
    .line 70
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v0, v2}, Lretrofit2/h;->k(Lretrofit2/e;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-interface {v1, v0, v2}, Lretrofit2/h;->n(Lretrofit2/e;Lretrofit2/n0;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :pswitch_2
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 84
    .line 85
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lr6/c;

    .line 88
    .line 89
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Ljava/io/IOException;

    .line 92
    .line 93
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/IOException;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_3
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 100
    .line 101
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Lr6/c;

    .line 104
    .line 105
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ljava/io/FileNotFoundException;

    .line 108
    .line 109
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->f(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/FileNotFoundException;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_4
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 116
    .line 117
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lr6/c;

    .line 120
    .line 121
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lcom/zykj/sketch/exception/HighVersionException;

    .line 124
    .line 125
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->j(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_5
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 132
    .line 133
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Lr6/c;

    .line 136
    .line 137
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Lcom/zykj/sketch/exception/LowVersionException;

    .line 140
    .line 141
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->i(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_6
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 148
    .line 149
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lr6/c;

    .line 152
    .line 153
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Ljava/lang/Throwable;

    .line 156
    .line 157
    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->o(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_7
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 164
    .line 165
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 168
    .line 169
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, Ljava/util/List;

    .line 172
    .line 173
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->h(Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_8
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 180
    .line 181
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Lr6/c;

    .line 184
    .line 185
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ljava/lang/Exception;

    .line 188
    .line 189
    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;Ljava/lang/Exception;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_9
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 196
    .line 197
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, Lr6/c;

    .line 200
    .line 201
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, Lr6/c;

    .line 204
    .line 205
    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lr6/c;Lr6/c;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_a
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Landroidx/camera/video/internal/audio/BufferedAudioStream;

    .line 212
    .line 213
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

    .line 216
    .line 217
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 220
    .line 221
    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->e(Landroidx/camera/video/internal/audio/BufferedAudioStream;Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_b
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Landroidx/camera/video/internal/audio/AudioSource;

    .line 228
    .line 229
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;

    .line 236
    .line 237
    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/audio/AudioSource;->b(Landroidx/camera/video/internal/audio/AudioSource;Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_c
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    .line 244
    .line 245
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, Ljava/lang/Runnable;

    .line 248
    .line 249
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Ljava/lang/Runnable;

    .line 252
    .line 253
    invoke-static {v0, v1, v2}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->a(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_d
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Landroidx/camera/core/processing/SurfaceProcessorNode;

    .line 260
    .line 261
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Landroidx/camera/core/processing/SurfaceEdge;

    .line 264
    .line 265
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, Ljava/util/Map$Entry;

    .line 268
    .line 269
    invoke-static {v0, v1, v2}, Landroidx/camera/core/processing/SurfaceProcessorNode;->a(Landroidx/camera/core/processing/SurfaceProcessorNode;Landroidx/camera/core/processing/SurfaceEdge;Ljava/util/Map$Entry;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_e
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Landroidx/camera/core/processing/InternalImageProcessor;

    .line 276
    .line 277
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, Landroidx/camera/core/ImageProcessor$Request;

    .line 280
    .line 281
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v2, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    .line 284
    .line 285
    invoke-static {v0, v1, v2}, Landroidx/camera/core/processing/InternalImageProcessor;->b(Landroidx/camera/core/processing/InternalImageProcessor;Landroidx/camera/core/ImageProcessor$Request;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_f
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    .line 292
    .line 293
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, Ljava/lang/Runnable;

    .line 296
    .line 297
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v2, Ljava/lang/Runnable;

    .line 300
    .line 301
    invoke-static {v0, v1, v2}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->m(Landroidx/camera/core/processing/DefaultSurfaceProcessor;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_10
    iget-object v0, p0, La5/h;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Landroid/widget/DatePicker;

    .line 308
    .line 309
    iget-object v1, p0, La5/h;->c:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v1, Landroid/widget/DatePicker;

    .line 312
    .line 313
    iget-object v2, p0, La5/h;->d:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v2, La5/c;

    .line 316
    .line 317
    invoke-static {v0}, La5/e;->e(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    invoke-static {v1}, La5/e;->e(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, La5/c;->invoke()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
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
