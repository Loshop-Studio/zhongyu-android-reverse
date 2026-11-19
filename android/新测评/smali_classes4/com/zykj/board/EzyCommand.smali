# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/board/EzyCommand;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyCommand$CommandSource;
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
    invoke-static {}, Lcom/zykj/board/EzyCommandEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {}, Lcom/zykj/board/EzyGraphEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {}, Lcom/zykj/board/EzyRectF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->e()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    filled-new-array/range {v1 .. v9}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/zykj/board/EzyCommand;->y:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 52
    .line 53
    invoke-static {}, Lcom/zykj/board/EzyCommand;->y()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 67
    .line 68
    sput-object v0, Lcom/zykj/board/EzyCommand;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 69
    .line 70
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 71
    .line 72
    const-string v3, "CommandInfo"

    .line 73
    .line 74
    filled-new-array {v3}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sput-object v2, Lcom/zykj/board/EzyCommand;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 92
    .line 93
    sput-object v0, Lcom/zykj/board/EzyCommand;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 94
    .line 95
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 96
    .line 97
    const-string v3, "CommandEnum"

    .line 98
    .line 99
    const-string v4, "Data"

    .line 100
    .line 101
    const-string v5, "DelayTime"

    .line 102
    .line 103
    const-string v6, "Duration"

    .line 104
    .line 105
    const-string v7, "IsPlay"

    .line 106
    .line 107
    filled-new-array {v5, v6, v7, v3, v4}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sput-object v2, Lcom/zykj/board/EzyCommand;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 125
    .line 126
    sput-object v1, Lcom/zykj/board/EzyCommand;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 127
    .line 128
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 129
    .line 130
    const-string v12, "SourceId"

    .line 131
    .line 132
    const-string v13, "Extras"

    .line 133
    .line 134
    const-string v7, "GraphEnum"

    .line 135
    .line 136
    const-string v8, "GraphId"

    .line 137
    .line 138
    const-string v9, "OutRect"

    .line 139
    .line 140
    const-string v10, "ParentGraphId"

    .line 141
    .line 142
    const-string v11, "SourceFileName"

    .line 143
    .line 144
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sput-object v2, Lcom/zykj/board/EzyCommand;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const/4 v2, 0x1

    .line 158
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 163
    .line 164
    sput-object v1, Lcom/zykj/board/EzyCommand;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 165
    .line 166
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 167
    .line 168
    const-string v3, "GraphData"

    .line 169
    .line 170
    filled-new-array {v3}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-direct {v2, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sput-object v2, Lcom/zykj/board/EzyCommand;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const/4 v2, 0x2

    .line 184
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 189
    .line 190
    sput-object v1, Lcom/zykj/board/EzyCommand;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 191
    .line 192
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 193
    .line 194
    const-string v4, "OriginMatrix"

    .line 195
    .line 196
    const-string v5, "LastMatrix"

    .line 197
    .line 198
    const-string v7, "SourceFileName"

    .line 199
    .line 200
    const-string v8, "SourceId"

    .line 201
    .line 202
    filled-new-array {v3, v4, v5, v7, v8}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sput-object v2, Lcom/zykj/board/EzyCommand;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const/4 v2, 0x3

    .line 216
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 221
    .line 222
    sput-object v1, Lcom/zykj/board/EzyCommand;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 223
    .line 224
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 225
    .line 226
    const-string v15, "RenderMatrix"

    .line 227
    .line 228
    const-string v16, "FilePath"

    .line 229
    .line 230
    const-string v9, "GraphId"

    .line 231
    .line 232
    const-string v10, "GraphEnum"

    .line 233
    .line 234
    const-string v11, "OutRect"

    .line 235
    .line 236
    const-string v12, "Content"

    .line 237
    .line 238
    const-string v13, "Paint"

    .line 239
    .line 240
    const-string v14, "Points"

    .line 241
    .line 242
    filled-new-array/range {v9 .. v16}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    sput-object v2, Lcom/zykj/board/EzyCommand;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const/4 v2, 0x4

    .line 256
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 261
    .line 262
    sput-object v1, Lcom/zykj/board/EzyCommand;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 263
    .line 264
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 265
    .line 266
    const-string v3, "FileName"

    .line 267
    .line 268
    const-string v9, "Validate"

    .line 269
    .line 270
    filled-new-array {v3, v6, v9}, [Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sput-object v2, Lcom/zykj/board/EzyCommand;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 278
    .line 279
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    const/4 v2, 0x5

    .line 284
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 289
    .line 290
    sput-object v1, Lcom/zykj/board/EzyCommand;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 291
    .line 292
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 293
    .line 294
    filled-new-array {v4, v5, v7, v8}, [Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    sput-object v2, Lcom/zykj/board/EzyCommand;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    const/4 v2, 0x6

    .line 308
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 313
    .line 314
    sput-object v1, Lcom/zykj/board/EzyCommand;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 315
    .line 316
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 317
    .line 318
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    sput-object v2, Lcom/zykj/board/EzyCommand;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 326
    .line 327
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const/4 v2, 0x7

    .line 332
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 337
    .line 338
    sput-object v1, Lcom/zykj/board/EzyCommand;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 339
    .line 340
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 341
    .line 342
    const-string v3, "OriginBackgroundLineConfig"

    .line 343
    .line 344
    const-string v4, "LastBackgroundLineConfig"

    .line 345
    .line 346
    const-string v5, "OriginBackground"

    .line 347
    .line 348
    const-string v6, "LastBackground"

    .line 349
    .line 350
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    sput-object v2, Lcom/zykj/board/EzyCommand;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 358
    .line 359
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    const/16 v2, 0x8

    .line 364
    .line 365
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 370
    .line 371
    sput-object v1, Lcom/zykj/board/EzyCommand;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 372
    .line 373
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 374
    .line 375
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    sput-object v2, Lcom/zykj/board/EzyCommand;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 383
    .line 384
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/16 v1, 0x9

    .line 389
    .line 390
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 395
    .line 396
    sput-object v0, Lcom/zykj/board/EzyCommand;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 397
    .line 398
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 399
    .line 400
    const-string v2, "BackgroundColor"

    .line 401
    .line 402
    const-string v3, "BackgroundLineConfig"

    .line 403
    .line 404
    const-string v4, "Snapshot"

    .line 405
    .line 406
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    sput-object v1, Lcom/zykj/board/EzyCommand;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 414
    .line 415
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 416
    .line 417
    .line 418
    invoke-static {}, Lcom/zykj/board/EzyCommandEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 419
    .line 420
    .line 421
    invoke-static {}, Lcom/zykj/board/EzyGraphEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 422
    .line 423
    .line 424
    invoke-static {}, Lcom/zykj/board/EzyRectF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 425
    .line 426
    .line 427
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 428
    .line 429
    .line 430
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 431
    .line 432
    .line 433
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 434
    .line 435
    .line 436
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->e()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 437
    .line 438
    .line 439
    invoke-static {}, Lcom/zykj/board/EzyHeader;->i()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 440
    .line 441
    .line 442
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic e()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic f()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic g()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic h()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic i()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic j()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic k()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic l()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic m()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic n()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic o()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic p()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic q()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic r()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic s()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic t()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic u()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic v()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic w()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic x()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static y()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand;->y:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
