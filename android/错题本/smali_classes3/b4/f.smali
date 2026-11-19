.class public abstract Lb4/f;
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

.field public static final u:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final w:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const-string v0, "\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\u000cHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001a\u00cf\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\u0008duration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\u0008\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\u000c.CommandEnum\u0012\u000c\n\u0004data\u0018\u0005 \u0001(\u000c\u001a\u00a5\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a\u00ac\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\u000coriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0005 \u0001(\u0005\u001a\u00c8\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\u000crenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\u0008filePath\u0018\u0008 \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\u0008fileName\u0018\u0001 \u0001(\t\u0012\u0010\n\u0008duration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\u0008validate\u0018\u0003 \u0001(\t\u001at\n\u000cCameraMatrix\u0012\u001d\n\u000coriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\u000coriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a\u00ae\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\u0008snapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lb4/h;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    sget-object v3, Lb4/l;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 14
    .line 15
    sget-object v4, Lb4/d1;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    sget-object v5, Lb4/d0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 18
    .line 19
    sget-object v6, Lb4/r0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    sget-object v7, Lb4/w0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 22
    .line 23
    sget-object v8, Lb4/m0;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 24
    .line 25
    sget-object v9, Lb4/y;->i:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 26
    .line 27
    filled-new-array/range {v1 .. v9}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

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
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 45
    .line 46
    sput-object v0, Lb4/f;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 47
    .line 48
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 49
    .line 50
    const-string v3, "CommandInfo"

    .line 51
    .line 52
    filled-new-array {v3}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v2, Lb4/f;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 70
    .line 71
    sput-object v0, Lb4/f;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 72
    .line 73
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 74
    .line 75
    const-string v3, "CommandEnum"

    .line 76
    .line 77
    const-string v4, "Data"

    .line 78
    .line 79
    const-string v5, "DelayTime"

    .line 80
    .line 81
    const-string v6, "Duration"

    .line 82
    .line 83
    const-string v7, "IsPlay"

    .line 84
    .line 85
    filled-new-array {v5, v6, v7, v3, v4}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v2, Lb4/f;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 103
    .line 104
    sput-object v1, Lb4/f;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 105
    .line 106
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 107
    .line 108
    const-string v12, "SourceId"

    .line 109
    .line 110
    const-string v13, "Extras"

    .line 111
    .line 112
    const-string v7, "GraphEnum"

    .line 113
    .line 114
    const-string v8, "GraphId"

    .line 115
    .line 116
    const-string v9, "OutRect"

    .line 117
    .line 118
    const-string v10, "ParentGraphId"

    .line 119
    .line 120
    const-string v11, "SourceFileName"

    .line 121
    .line 122
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    sput-object v2, Lb4/f;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const/4 v2, 0x1

    .line 136
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 141
    .line 142
    sput-object v1, Lb4/f;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 143
    .line 144
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 145
    .line 146
    const-string v3, "GraphData"

    .line 147
    .line 148
    filled-new-array {v3}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-direct {v2, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    sput-object v2, Lb4/f;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const/4 v2, 0x2

    .line 162
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 167
    .line 168
    sput-object v1, Lb4/f;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 169
    .line 170
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 171
    .line 172
    const-string v4, "OriginMatrix"

    .line 173
    .line 174
    const-string v5, "LastMatrix"

    .line 175
    .line 176
    const-string v7, "SourceFileName"

    .line 177
    .line 178
    const-string v8, "SourceId"

    .line 179
    .line 180
    filled-new-array {v3, v4, v5, v7, v8}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    sput-object v2, Lb4/f;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const/4 v2, 0x3

    .line 194
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 199
    .line 200
    sput-object v1, Lb4/f;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 201
    .line 202
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 203
    .line 204
    const-string v15, "RenderMatrix"

    .line 205
    .line 206
    const-string v16, "FilePath"

    .line 207
    .line 208
    const-string v9, "GraphId"

    .line 209
    .line 210
    const-string v10, "GraphEnum"

    .line 211
    .line 212
    const-string v11, "OutRect"

    .line 213
    .line 214
    const-string v12, "Content"

    .line 215
    .line 216
    const-string v13, "Paint"

    .line 217
    .line 218
    const-string v14, "Points"

    .line 219
    .line 220
    filled-new-array/range {v9 .. v16}, [Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    sput-object v2, Lb4/f;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    const/4 v2, 0x4

    .line 234
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 239
    .line 240
    sput-object v1, Lb4/f;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 241
    .line 242
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 243
    .line 244
    const-string v3, "FileName"

    .line 245
    .line 246
    const-string v9, "Validate"

    .line 247
    .line 248
    filled-new-array {v3, v6, v9}, [Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    sput-object v2, Lb4/f;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    const/4 v2, 0x5

    .line 262
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 267
    .line 268
    sput-object v1, Lb4/f;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 269
    .line 270
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 271
    .line 272
    filled-new-array {v4, v5, v7, v8}, [Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    sput-object v2, Lb4/f;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 280
    .line 281
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    const/4 v2, 0x6

    .line 286
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 291
    .line 292
    sput-object v1, Lb4/f;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 293
    .line 294
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 295
    .line 296
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    sput-object v2, Lb4/f;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 304
    .line 305
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    const/4 v2, 0x7

    .line 310
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 315
    .line 316
    sput-object v1, Lb4/f;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 317
    .line 318
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 319
    .line 320
    const-string v3, "OriginBackgroundLineConfig"

    .line 321
    .line 322
    const-string v4, "LastBackgroundLineConfig"

    .line 323
    .line 324
    const-string v5, "OriginBackground"

    .line 325
    .line 326
    const-string v6, "LastBackground"

    .line 327
    .line 328
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    sput-object v2, Lb4/f;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 336
    .line 337
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    const/16 v2, 0x8

    .line 342
    .line 343
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 348
    .line 349
    sput-object v1, Lb4/f;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 350
    .line 351
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 352
    .line 353
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sput-object v2, Lb4/f;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 361
    .line 362
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const/16 v1, 0x9

    .line 367
    .line 368
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 373
    .line 374
    sput-object v0, Lb4/f;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 375
    .line 376
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 377
    .line 378
    const-string v2, "BackgroundColor"

    .line 379
    .line 380
    const-string v3, "BackgroundLineConfig"

    .line 381
    .line 382
    const-string v4, "Snapshot"

    .line 383
    .line 384
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    sput-object v1, Lb4/f;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 392
    .line 393
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 394
    .line 395
    .line 396
    return-void
.end method
