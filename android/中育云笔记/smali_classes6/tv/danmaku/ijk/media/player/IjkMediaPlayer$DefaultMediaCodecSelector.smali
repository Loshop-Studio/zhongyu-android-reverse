.class public Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltv/danmaku/ijk/media/player/IjkMediaPlayer$OnMediaCodecSelectListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv/danmaku/ijk/media/player/IjkMediaPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DefaultMediaCodecSelector"
.end annotation


# static fields
.field public static final sInstance:Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;

    .line 2
    .line 3
    invoke-direct {v0}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;->sInstance:Ltv/danmaku/ijk/media/player/IjkMediaPlayer$DefaultMediaCodecSelector;

    .line 7
    .line 8
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
.method public onMediaCodecSelect(Ltv/danmaku/ijk/media/player/IMediaPlayer;Ljava/lang/String;II)Ljava/lang/String;
    .locals 11
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    filled-new-array {p2, p3, p4}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const-string p4, "onSelectCodec: mime=%s, profile=%d, level=%d"

    .line 28
    .line 29
    invoke-static {v1, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {p1, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    const/4 p4, 0x0

    .line 46
    move v1, p4

    .line 47
    :goto_0
    if-ge v1, p3, :cond_7

    .line 48
    .line 49
    invoke-static {v1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const-string v5, "  found codec: %s"

    .line 67
    .line 68
    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_1
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v3, :cond_2

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    array-length v4, v3

    .line 86
    move v5, p4

    .line 87
    :goto_1
    if-ge v5, v4, :cond_6

    .line 88
    .line 89
    aget-object v6, v3, v5

    .line 90
    .line 91
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 102
    .line 103
    const-string v8, "    mime: %s"

    .line 104
    .line 105
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_4

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    invoke-static {v2, p2}, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->setupCandidate(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-nez v6, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    iget v10, v6, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mRank:I

    .line 138
    .line 139
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    filled-new-array {v9, v10}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    const-string v10, "candidate codec: %s rank=%d"

    .line 148
    .line 149
    invoke-static {v7, v10, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v8, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, p2}, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->dumpProfileLevels(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_8

    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_8
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    check-cast p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    :cond_9
    :goto_4
    if-ge p4, p3, :cond_a

    .line 183
    .line 184
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    add-int/lit8 p4, p4, 0x1

    .line 189
    .line 190
    check-cast v1, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;

    .line 191
    .line 192
    iget v2, v1, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mRank:I

    .line 193
    .line 194
    iget v3, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mRank:I

    .line 195
    .line 196
    if-le v2, v3, :cond_9

    .line 197
    .line 198
    move-object p2, v1

    .line 199
    goto :goto_4

    .line 200
    :cond_a
    iget p1, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mRank:I

    .line 201
    .line 202
    const/16 p3, 0x258

    .line 203
    .line 204
    if-ge p1, p3, :cond_b

    .line 205
    .line 206
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 211
    .line 212
    iget-object p2, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mCodecInfo:Landroid/media/MediaCodecInfo;

    .line 213
    .line 214
    invoke-virtual {p2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    const-string p4, "unaccetable codec: %s"

    .line 223
    .line 224
    invoke-static {p3, p4, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_b
    invoke-static {}, Ltv/danmaku/ijk/media/player/IjkMediaPlayer;->access$100()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 237
    .line 238
    iget-object p4, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mCodecInfo:Landroid/media/MediaCodecInfo;

    .line 239
    .line 240
    invoke-virtual {p4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p4

    .line 244
    iget v0, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mRank:I

    .line 245
    .line 246
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    filled-new-array {p4, v0}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p4

    .line 254
    const-string v0, "selected codec: %s rank=%d"

    .line 255
    .line 256
    invoke-static {p3, v0, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p3

    .line 260
    invoke-static {p1, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    .line 262
    .line 263
    iget-object p1, p2, Ltv/danmaku/ijk/media/player/IjkMediaCodecInfo;->mCodecInfo:Landroid/media/MediaCodecInfo;

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    return-object p1
.end method
