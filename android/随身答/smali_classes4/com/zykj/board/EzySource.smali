# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/board/EzySource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzySource$GeometrySource;,
        Lcom/zykj/board/EzySource$TextSource;,
        Lcom/zykj/board/EzySource$FileSource;,
        Lcom/zykj/board/EzySource$MatrixSource;,
        Lcom/zykj/board/EzySource$TouchSource;
    }
.end annotation


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

.field public static final u:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final w:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static y:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 8

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->g()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lcom/zykj/board/EzyGeometryEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    filled-new-array {v1, v2, v3, v4, v5}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/board/EzySource;->y:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 36
    .line 37
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 51
    .line 52
    sput-object v0, Lcom/zykj/board/EzySource;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 53
    .line 54
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 55
    .line 56
    const-string v3, "TouchInfo"

    .line 57
    .line 58
    filled-new-array {v3}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v2, Lcom/zykj/board/EzySource;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 76
    .line 77
    sput-object v0, Lcom/zykj/board/EzySource;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 78
    .line 79
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 80
    .line 81
    const-string v3, "TouchEvent"

    .line 82
    .line 83
    const-string v4, "Paint"

    .line 84
    .line 85
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v2, Lcom/zykj/board/EzySource;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 93
    .line 94
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/4 v2, 0x1

    .line 103
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 108
    .line 109
    sput-object v0, Lcom/zykj/board/EzySource;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 110
    .line 111
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 112
    .line 113
    const-string v3, "MatrixInfo"

    .line 114
    .line 115
    filled-new-array {v3}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sput-object v2, Lcom/zykj/board/EzySource;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 133
    .line 134
    sput-object v0, Lcom/zykj/board/EzySource;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 135
    .line 136
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 137
    .line 138
    const-string v3, "Matrix"

    .line 139
    .line 140
    filled-new-array {v3}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v2, Lcom/zykj/board/EzySource;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 148
    .line 149
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const/4 v2, 0x2

    .line 158
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 163
    .line 164
    sput-object v0, Lcom/zykj/board/EzySource;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 165
    .line 166
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 167
    .line 168
    const-string v3, "FileInfo"

    .line 169
    .line 170
    filled-new-array {v3}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sput-object v2, Lcom/zykj/board/EzySource;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 188
    .line 189
    sput-object v0, Lcom/zykj/board/EzySource;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 190
    .line 191
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 192
    .line 193
    const-string v3, "Name"

    .line 194
    .line 195
    const-string v5, "Width"

    .line 196
    .line 197
    const-string v6, "Height"

    .line 198
    .line 199
    const-string v7, "Validate"

    .line 200
    .line 201
    filled-new-array {v3, v5, v6, v7}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-direct {v2, v0, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    sput-object v2, Lcom/zykj/board/EzySource;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 209
    .line 210
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const/4 v2, 0x3

    .line 219
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 224
    .line 225
    sput-object v0, Lcom/zykj/board/EzySource;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 226
    .line 227
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 228
    .line 229
    const-string v5, "AudioInfo"

    .line 230
    .line 231
    filled-new-array {v5}, [Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-direct {v2, v0, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    sput-object v2, Lcom/zykj/board/EzySource;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 239
    .line 240
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 249
    .line 250
    sput-object v0, Lcom/zykj/board/EzySource;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 251
    .line 252
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 253
    .line 254
    const-string v5, "Duration"

    .line 255
    .line 256
    filled-new-array {v3, v5, v7}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    sput-object v2, Lcom/zykj/board/EzySource;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 264
    .line 265
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const/4 v2, 0x4

    .line 274
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 279
    .line 280
    sput-object v0, Lcom/zykj/board/EzySource;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 281
    .line 282
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 283
    .line 284
    const-string v3, "TextInfo"

    .line 285
    .line 286
    filled-new-array {v3}, [Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    sput-object v2, Lcom/zykj/board/EzySource;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 304
    .line 305
    sput-object v0, Lcom/zykj/board/EzySource;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 306
    .line 307
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 308
    .line 309
    const-string v3, "Content"

    .line 310
    .line 311
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    sput-object v2, Lcom/zykj/board/EzySource;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 319
    .line 320
    invoke-static {}, Lcom/zykj/board/EzySource;->u()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const/4 v2, 0x5

    .line 329
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 334
    .line 335
    sput-object v0, Lcom/zykj/board/EzySource;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 336
    .line 337
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 338
    .line 339
    const-string v3, "GeometryInfo"

    .line 340
    .line 341
    filled-new-array {v3}, [Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    sput-object v2, Lcom/zykj/board/EzySource;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 349
    .line 350
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 359
    .line 360
    sput-object v0, Lcom/zykj/board/EzySource;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 361
    .line 362
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 363
    .line 364
    const-string v2, "GeometryType"

    .line 365
    .line 366
    const-string v3, "Points"

    .line 367
    .line 368
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    sput-object v1, Lcom/zykj/board/EzySource;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 376
    .line 377
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->g()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 381
    .line 382
    .line 383
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 384
    .line 385
    .line 386
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Lcom/zykj/board/EzyGeometryEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 390
    .line 391
    .line 392
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic e()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic f()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic g()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic i()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic j()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic k()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic l()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic m()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic n()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic o()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic p()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic q()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic r()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic s()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic t()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static u()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource;->y:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
