.class public Lcom/umeng/analytics/pro/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/aj$d;,
        Lcom/umeng/analytics/pro/aj$f;,
        Lcom/umeng/analytics/pro/aj$b;,
        Lcom/umeng/analytics/pro/aj$c;,
        Lcom/umeng/analytics/pro/aj$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/analytics/pro/aj;",
        "Lcom/umeng/analytics/pro/aj$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final m:Lg2/u;

.field public static final n:Lg2/p;

.field public static final o:Lg2/p;

.field public static final p:Lg2/p;

.field public static final q:Lg2/p;

.field public static final r:Lg2/p;

.field public static final s:Lg2/p;

.field public static final t:Lg2/p;

.field public static final u:Lg2/p;

.field public static final v:Lg2/p;

.field public static final w:Lg2/p;

.field public static final x:Ljava/util/Map;

.field public static final y:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/nio/ByteBuffer;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:B

.field public l:[Lcom/umeng/analytics/pro/aj$e;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "UMEnvelope"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/analytics/pro/aj;->m:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "version"

    .line 13
    .line 14
    const/16 v2, 0xb

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/analytics/pro/aj;->n:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const-string v4, "address"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v0, v4, v2, v5}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/umeng/analytics/pro/aj;->o:Lg2/p;

    .line 31
    .line 32
    new-instance v0, Lg2/p;

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    const-string v7, "signature"

    .line 36
    .line 37
    invoke-direct {v0, v7, v2, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/umeng/analytics/pro/aj;->p:Lg2/p;

    .line 41
    .line 42
    new-instance v0, Lg2/p;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    const-string v8, "serial_num"

    .line 46
    .line 47
    const/16 v9, 0x8

    .line 48
    .line 49
    invoke-direct {v0, v8, v9, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/umeng/analytics/pro/aj;->q:Lg2/p;

    .line 53
    .line 54
    new-instance v0, Lg2/p;

    .line 55
    .line 56
    const/4 v6, 0x5

    .line 57
    const-string v10, "ts_secs"

    .line 58
    .line 59
    invoke-direct {v0, v10, v9, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcom/umeng/analytics/pro/aj;->r:Lg2/p;

    .line 63
    .line 64
    new-instance v0, Lg2/p;

    .line 65
    .line 66
    const/4 v6, 0x6

    .line 67
    const-string v11, "length"

    .line 68
    .line 69
    invoke-direct {v0, v11, v9, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lcom/umeng/analytics/pro/aj;->s:Lg2/p;

    .line 73
    .line 74
    new-instance v0, Lg2/p;

    .line 75
    .line 76
    const/4 v6, 0x7

    .line 77
    const-string v12, "entity"

    .line 78
    .line 79
    invoke-direct {v0, v12, v2, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/umeng/analytics/pro/aj;->t:Lg2/p;

    .line 83
    .line 84
    new-instance v0, Lg2/p;

    .line 85
    .line 86
    const-string v6, "guid"

    .line 87
    .line 88
    invoke-direct {v0, v6, v2, v9}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lcom/umeng/analytics/pro/aj;->u:Lg2/p;

    .line 92
    .line 93
    new-instance v0, Lg2/p;

    .line 94
    .line 95
    const/16 v13, 0x9

    .line 96
    .line 97
    const-string v14, "checksum"

    .line 98
    .line 99
    invoke-direct {v0, v14, v2, v13}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lcom/umeng/analytics/pro/aj;->v:Lg2/p;

    .line 103
    .line 104
    new-instance v0, Lg2/p;

    .line 105
    .line 106
    const/16 v13, 0xa

    .line 107
    .line 108
    const-string v15, "codex"

    .line 109
    .line 110
    invoke-direct {v0, v15, v9, v13}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lcom/umeng/analytics/pro/aj;->w:Lg2/p;

    .line 114
    .line 115
    new-instance v0, Ljava/util/HashMap;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 118
    .line 119
    .line 120
    sput-object v0, Lcom/umeng/analytics/pro/aj;->x:Ljava/util/Map;

    .line 121
    .line 122
    new-instance v13, Lcom/umeng/analytics/pro/aj$c;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-direct {v13, v5}, Lcom/umeng/analytics/pro/aj$c;-><init>(Lcom/umeng/analytics/pro/aj$a;)V

    .line 126
    .line 127
    .line 128
    const-class v9, Lg2/x;

    .line 129
    .line 130
    invoke-interface {v0, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    new-instance v9, Lcom/umeng/analytics/pro/aj$f;

    .line 134
    .line 135
    invoke-direct {v9, v5}, Lcom/umeng/analytics/pro/aj$f;-><init>(Lcom/umeng/analytics/pro/aj$a;)V

    .line 136
    .line 137
    .line 138
    const-class v5, Lg2/z;

    .line 139
    .line 140
    invoke-interface {v0, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    new-instance v0, Ljava/util/EnumMap;

    .line 144
    .line 145
    const-class v5, Lcom/umeng/analytics/pro/aj$e;

    .line 146
    .line 147
    invoke-direct {v0, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 148
    .line 149
    .line 150
    sget-object v5, Lcom/umeng/analytics/pro/aj$e;->c:Lcom/umeng/analytics/pro/aj$e;

    .line 151
    .line 152
    new-instance v9, Lcom/umeng/analytics/pro/bc;

    .line 153
    .line 154
    new-instance v13, Lcom/umeng/analytics/pro/bd;

    .line 155
    .line 156
    invoke-direct {v13, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v9, v1, v3, v13}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->d:Lcom/umeng/analytics/pro/aj$e;

    .line 166
    .line 167
    new-instance v5, Lcom/umeng/analytics/pro/bc;

    .line 168
    .line 169
    new-instance v9, Lcom/umeng/analytics/pro/bd;

    .line 170
    .line 171
    invoke-direct {v9, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v5, v4, v3, v9}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->e:Lcom/umeng/analytics/pro/aj$e;

    .line 181
    .line 182
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 183
    .line 184
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 185
    .line 186
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 187
    .line 188
    .line 189
    invoke-direct {v4, v7, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->f:Lcom/umeng/analytics/pro/aj$e;

    .line 196
    .line 197
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 198
    .line 199
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 200
    .line 201
    const/16 v7, 0x8

    .line 202
    .line 203
    invoke-direct {v5, v7}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 204
    .line 205
    .line 206
    invoke-direct {v4, v8, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->g:Lcom/umeng/analytics/pro/aj$e;

    .line 213
    .line 214
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 215
    .line 216
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 217
    .line 218
    invoke-direct {v5, v7}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 219
    .line 220
    .line 221
    invoke-direct {v4, v10, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->h:Lcom/umeng/analytics/pro/aj$e;

    .line 228
    .line 229
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 230
    .line 231
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 232
    .line 233
    invoke-direct {v5, v7}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 234
    .line 235
    .line 236
    invoke-direct {v4, v11, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->i:Lcom/umeng/analytics/pro/aj$e;

    .line 243
    .line 244
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 245
    .line 246
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 247
    .line 248
    invoke-direct {v5, v2, v3}, Lcom/umeng/analytics/pro/bd;-><init>(BZ)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v4, v12, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->j:Lcom/umeng/analytics/pro/aj$e;

    .line 258
    .line 259
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 260
    .line 261
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 262
    .line 263
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 264
    .line 265
    .line 266
    invoke-direct {v4, v6, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->k:Lcom/umeng/analytics/pro/aj$e;

    .line 273
    .line 274
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 275
    .line 276
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 277
    .line 278
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v4, v14, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    sget-object v1, Lcom/umeng/analytics/pro/aj$e;->l:Lcom/umeng/analytics/pro/aj$e;

    .line 288
    .line 289
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 290
    .line 291
    new-instance v3, Lcom/umeng/analytics/pro/bd;

    .line 292
    .line 293
    const/16 v7, 0x8

    .line 294
    .line 295
    invoke-direct {v3, v7}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 296
    .line 297
    .line 298
    const/4 v4, 0x2

    .line 299
    invoke-direct {v2, v15, v4, v3}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    sput-object v0, Lcom/umeng/analytics/pro/aj;->y:Ljava/util/Map;

    .line 310
    .line 311
    const-class v1, Lcom/umeng/analytics/pro/aj;

    .line 312
    .line 313
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 314
    .line 315
    .line 316
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 6
    .line 7
    sget-object v0, Lcom/umeng/analytics/pro/aj$e;->l:Lcom/umeng/analytics/pro/aj$e;

    .line 8
    .line 9
    filled-new-array {v0}, [Lcom/umeng/analytics/pro/aj$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/pro/aj;->l:[Lcom/umeng/analytics/pro/aj$e;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic A()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->u:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic B()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->v:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic C()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->w:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic q()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->m:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic t()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->n:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic u()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->o:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic v()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->p:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic w()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->q:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic x()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->r:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic y()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->s:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic z()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->t:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public D(I)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/aj;->d:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/aj;->Q(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public E(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public F(Ljava/nio/ByteBuffer;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->g:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public G([B)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/aj;->F(Ljava/nio/ByteBuffer;)Lcom/umeng/analytics/pro/aj;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public H(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public I(I)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/aj;->e:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/aj;->S(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public J(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public K(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public L(I)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/aj;->f:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/aj;->T(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public M(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public N(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->c:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public O(I)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/aj;->j:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/aj;->X(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public P(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public Q(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 9
    .line 10
    return-void
.end method

.method public R(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public S(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 9
    .line 10
    return-void
.end method

.method public T(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 9
    .line 10
    return-void
.end method

.method public U(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->g:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public V(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->h:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public W(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->i:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public X(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 9
    .line 10
    return-void
.end method

.method public Y()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public Z()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public a0()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public g()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/aj;->k:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->x:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg2/s;->c()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lg2/w;

    .line 12
    .line 13
    invoke-interface {v0}, Lg2/w;->b()Lg2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1, p0}, Lg2/v;->b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->c:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->g:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->h:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->i:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "Required field \'checksum\' was not present! Struct: "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "Required field \'guid\' was not present! Struct: "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v2, "Required field \'entity\' was not present! Struct: "

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_3
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v2, "Required field \'signature\' was not present! Struct: "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_4
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 135
    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v2, "Required field \'address\' was not present! Struct: "

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0

    .line 161
    :cond_5
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 162
    .line 163
    new-instance v1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v2, "Required field \'version\' was not present! Struct: "

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aj;->x:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg2/s;->c()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lg2/w;

    .line 12
    .line 13
    invoke-interface {v0}, Lg2/w;->b()Lg2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1, p0}, Lg2/v;->a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UMEnvelope("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "version:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "null"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :goto_0
    const-string v1, ", "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, "address:"

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, "signature:"

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->c:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, "serial_num:"

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v3, p0, Lcom/umeng/analytics/pro/aj;->d:I

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v3, "ts_secs:"

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget v3, p0, Lcom/umeng/analytics/pro/aj;->e:I

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v3, "length:"

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v3, p0, Lcom/umeng/analytics/pro/aj;->f:I

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v3, "entity:"

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->g:Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    if-nez v3, :cond_3

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_3
    invoke-static {v3, v0}, Lg2/n;->i(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v3, "guid:"

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->h:Ljava/lang/String;

    .line 133
    .line 134
    if-nez v3, :cond_4

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, "checksum:"

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->i:Ljava/lang/String;

    .line 152
    .line 153
    if-nez v3, :cond_5

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    :goto_5
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj;->g()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_6

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, "codex:"

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget v1, p0, Lcom/umeng/analytics/pro/aj;->j:I

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    :cond_6
    const-string v1, ")"

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0
.end method
