.class public abstract Lb4/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final e:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final g:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final i:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final k:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final m:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final o:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final q:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final s:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "\n\u000cSource.proto\u001a\u0016utils/TouchEvent.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0018enums/GeometryEnum.proto\"}\n\u000bTouchSource\u0012)\n\ttouchInfo\u0018\u0001 \u0003(\u000b2\u0016.TouchSource.TouchInfo\u001aC\n\tTouchInfo\u0012\u001f\n\ntouchEvent\u0018\u0001 \u0003(\u000b2\u000b.TouchEvent\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"c\n\u000cMatrixSource\u0012,\n\nmatrixInfo\u0018\u0001 \u0003(\u000b2\u0018.MatrixSource.MatrixInfo\u001a%\n\nMatrixInfo\u0012\u0017\n\u0006matrix\u0018\u0001 \u0003(\u000b2\u0007.Matrix\"\u007f\n\nFileSource\u0012&\n\u0008fileInfo\u0018\u0001 \u0003(\u000b2\u0014.FileSource.FileInfo\u001aI\n\u0008FileInfo\u0012\u000c\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0010\n\u0008validate\u0018\u0004 \u0001(\t\"w\n\u000bAudioSource\u0012)\n\taudioInfo\u0018\u0001 \u0003(\u000b2\u0016.AudioSource.AudioInfo\u001a=\n\tAudioInfo\u0012\u000c\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\u0008duration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\u0008validate\u0018\u0003 \u0001(\t\"h\n\nTextSource\u0012&\n\u0008textInfo\u0018\u0001 \u0003(\u000b2\u0014.TextSource.TextInfo\u001a2\n\u0008TextInfo\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"\u00a9\u0001\n\u000eGeometrySource\u00122\n\u000cgeometryInfo\u0018\u0001 \u0003(\u000b2\u001c.GeometrySource.GeometryInfo\u001ac\n\u000cGeometryInfo\u0012#\n\u000cgeometryType\u0018\u0001 \u0001(\u000e2\r.GeometryEnum\u0012\u0017\n\u0006points\u0018\u0002 \u0003(\u000b2\u0007.PointF\u0012\u0015\n\u0005paint\u0018\u0003 \u0001(\u000b2\u0006.PaintB\u001b\n\u000ecom.zykj.boardB\tEzySourceb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lb4/a2;->g:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    sget-object v2, Lb4/d0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 10
    .line 11
    sget-object v3, Lb4/r0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    sget-object v4, Lb4/w0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 14
    .line 15
    sget-object v5, Lb4/j;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    filled-new-array {v1, v2, v3, v4, v5}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 35
    .line 36
    sput-object v1, Lb4/v1;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 37
    .line 38
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 39
    .line 40
    const-string v4, "TouchInfo"

    .line 41
    .line 42
    filled-new-array {v4}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Lb4/v1;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 60
    .line 61
    sput-object v1, Lb4/v1;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 62
    .line 63
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 64
    .line 65
    const-string v4, "TouchEvent"

    .line 66
    .line 67
    const-string v5, "Paint"

    .line 68
    .line 69
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sput-object v3, Lb4/v1;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v3, 0x1

    .line 83
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 88
    .line 89
    sput-object v1, Lb4/v1;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 90
    .line 91
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 92
    .line 93
    const-string v4, "MatrixInfo"

    .line 94
    .line 95
    filled-new-array {v4}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sput-object v3, Lb4/v1;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 113
    .line 114
    sput-object v1, Lb4/v1;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 115
    .line 116
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 117
    .line 118
    const-string v4, "Matrix"

    .line 119
    .line 120
    filled-new-array {v4}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sput-object v3, Lb4/v1;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/4 v3, 0x2

    .line 134
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 139
    .line 140
    sput-object v1, Lb4/v1;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 141
    .line 142
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 143
    .line 144
    const-string v4, "FileInfo"

    .line 145
    .line 146
    filled-new-array {v4}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sput-object v3, Lb4/v1;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 154
    .line 155
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 164
    .line 165
    sput-object v1, Lb4/v1;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 166
    .line 167
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 168
    .line 169
    const-string v4, "Name"

    .line 170
    .line 171
    const-string v6, "Width"

    .line 172
    .line 173
    const-string v7, "Height"

    .line 174
    .line 175
    const-string v8, "Validate"

    .line 176
    .line 177
    filled-new-array {v4, v6, v7, v8}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-direct {v3, v1, v6}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    sput-object v3, Lb4/v1;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 185
    .line 186
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const/4 v3, 0x3

    .line 191
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 196
    .line 197
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 198
    .line 199
    const-string v6, "AudioInfo"

    .line 200
    .line 201
    filled-new-array {v6}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-direct {v3, v1, v6}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 217
    .line 218
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 219
    .line 220
    const-string v6, "Duration"

    .line 221
    .line 222
    filled-new-array {v4, v6, v8}, [Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    const/4 v3, 0x4

    .line 234
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 239
    .line 240
    sput-object v1, Lb4/v1;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 241
    .line 242
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 243
    .line 244
    const-string v4, "TextInfo"

    .line 245
    .line 246
    filled-new-array {v4}, [Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sput-object v3, Lb4/v1;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 254
    .line 255
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 264
    .line 265
    sput-object v1, Lb4/v1;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 266
    .line 267
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 268
    .line 269
    const-string v4, "Content"

    .line 270
    .line 271
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-direct {v3, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    sput-object v3, Lb4/v1;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 279
    .line 280
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const/4 v1, 0x5

    .line 285
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 290
    .line 291
    sput-object v0, Lb4/v1;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 292
    .line 293
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 294
    .line 295
    const-string v3, "GeometryInfo"

    .line 296
    .line 297
    filled-new-array {v3}, [Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-direct {v1, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    sput-object v1, Lb4/v1;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 305
    .line 306
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 315
    .line 316
    sput-object v0, Lb4/v1;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 317
    .line 318
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 319
    .line 320
    const-string v2, "GeometryType"

    .line 321
    .line 322
    const-string v3, "Points"

    .line 323
    .line 324
    filled-new-array {v2, v3, v5}, [Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    sput-object v1, Lb4/v1;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 332
    .line 333
    return-void
.end method
