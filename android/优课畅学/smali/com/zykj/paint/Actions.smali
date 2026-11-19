# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/paint/Actions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/Actions$EzyActionList;,
        Lcom/zykj/paint/Actions$NewPolylineData;,
        Lcom/zykj/paint/Actions$NewImageData;,
        Lcom/zykj/paint/Actions$NewLayerData;,
        Lcom/zykj/paint/Actions$EzyMatrixData;,
        Lcom/zykj/paint/Actions$EzyAction;
    }
.end annotation


# static fields
.field public static A:Lcom/google/protobuf/Descriptors$FileDescriptor;

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

.field public static final y:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final z:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "ize\u0018\u0002 \u0001(\u000b2\u0008.EzySize\u0012\u000b\n\u0003Src\u0018\u0003 \u0001(\t\"l\n\u000fNewPolylineData\u0012\u0019\n\u0006Points\u0018\u0001 \u0003(\u000b2\t.EzyPoint\u0012\u0018\n\u0005Color\u0018\u0002 \u0001(\u000b2\t.EzyColor\u0012\r\n\u0005Width\u0018\u0003 \u0001(\u0001\u0012\u0015\n\rStickyGraphId\u0018\u0004 \u0001(\u0005\"C\n\u0008EzyColor\u0012\u000b\n\u0003Red\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005Green\u0018\u0002 \u0001(\u0005\u0012\u000c\n\u0004Blue\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005Alpha\u0018\u0004 \u0001(\u0005\" \n\u0008EzyPoint\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"(\n\u0007EzySize\u0012\r\n\u0005Width\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006Height\u0018\u0002 \u0001(\u0005\"!\n\tEzyVector\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"+\n\rEzyActionList\u0012\u001a\n\u0006action\u0018\u0001 \u0003(\u000b2\n.EzyActionB*\n\u000ecom.zykj.paint\u00aa\u0002\u0017EzyCoursePla"

    .line 2
    .line 3
    const-string v1, "yer.Actionsb\u0006proto3"

    .line 4
    .line 5
    const-string v2, "\n\ractions.proto\u001a\u0019google/protobuf/any.proto\"w\n\tEzyAction\u0012\u000f\n\u0007StartAt\u0018\u0001 \u0001(\u0005\u0012\u0010\n\u0008Duration\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nActionType\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007GraphId\u0018\u0004 \u0001(\u0005\u0012\"\n\u0004Data\u0018\u0005 \u0001(\u000b2\u0014.google.protobuf.Any\"$\n\rEzyActionData\u0012\u0013\n\u000bPlaceHolder\u0018\u0001 \u0001(\u0005\"\u001f\n\rEzyMatrixData\u0012\u000e\n\u0006values\u0018\u0001 \u0003(\u0002\"+\n\rMoveGraphData\u0012\u001a\n\u0006Vector\u0018\u0001 \u0001(\u000b2\n.EzyVector\"\u001e\n\rZoomGraphData\u0012\r\n\u0005Scale\u0018\u0001 \u0001(\u0001\"(\n\u000cNewLayerData\u0012\u0018\n\u0005Color\u0018\u0001 \u0001(\u000b2\t.EzyColor\"M\n\u000cNewImageData\u0012\u0018\n\u0005Point\u0018\u0001 \u0001(\u000b2\t.EzyPoint\u0012\u0016\n\u0004S"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/zykj/paint/Actions$a;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/zykj/paint/Actions$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    filled-new-array {v2}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;Lcom/google/protobuf/Descriptors$FileDescriptor$InternalDescriptorAssigner;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 41
    .line 42
    sput-object v0, Lcom/zykj/paint/Actions;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 43
    .line 44
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 45
    .line 46
    const-string v2, "GraphId"

    .line 47
    .line 48
    const-string v3, "Data"

    .line 49
    .line 50
    const-string v4, "StartAt"

    .line 51
    .line 52
    const-string v5, "Duration"

    .line 53
    .line 54
    const-string v6, "ActionType"

    .line 55
    .line 56
    filled-new-array {v4, v5, v6, v2, v3}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lcom/zykj/paint/Actions;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 64
    .line 65
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 79
    .line 80
    sput-object v0, Lcom/zykj/paint/Actions;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 81
    .line 82
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 83
    .line 84
    const-string v2, "PlaceHolder"

    .line 85
    .line 86
    filled-new-array {v2}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    sput-object v1, Lcom/zykj/paint/Actions;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 94
    .line 95
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x2

    .line 104
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 109
    .line 110
    sput-object v0, Lcom/zykj/paint/Actions;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 111
    .line 112
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 113
    .line 114
    const-string v2, "Values"

    .line 115
    .line 116
    filled-new-array {v2}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sput-object v1, Lcom/zykj/paint/Actions;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 124
    .line 125
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const/4 v1, 0x3

    .line 134
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 139
    .line 140
    sput-object v0, Lcom/zykj/paint/Actions;->g:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 141
    .line 142
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 143
    .line 144
    const-string v2, "Vector"

    .line 145
    .line 146
    filled-new-array {v2}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sput-object v1, Lcom/zykj/paint/Actions;->h:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 154
    .line 155
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const/4 v1, 0x4

    .line 164
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 169
    .line 170
    sput-object v0, Lcom/zykj/paint/Actions;->i:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 171
    .line 172
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 173
    .line 174
    const-string v2, "Scale"

    .line 175
    .line 176
    filled-new-array {v2}, [Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sput-object v1, Lcom/zykj/paint/Actions;->j:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 184
    .line 185
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const/4 v1, 0x5

    .line 194
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 199
    .line 200
    sput-object v0, Lcom/zykj/paint/Actions;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 201
    .line 202
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 203
    .line 204
    const-string v2, "Color"

    .line 205
    .line 206
    filled-new-array {v2}, [Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-direct {v1, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    sput-object v1, Lcom/zykj/paint/Actions;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 214
    .line 215
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    const/4 v1, 0x6

    .line 224
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 229
    .line 230
    sput-object v0, Lcom/zykj/paint/Actions;->m:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 231
    .line 232
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 233
    .line 234
    const-string v3, "Size"

    .line 235
    .line 236
    const-string v4, "Src"

    .line 237
    .line 238
    const-string v5, "Point"

    .line 239
    .line 240
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-direct {v1, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    sput-object v1, Lcom/zykj/paint/Actions;->n:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 248
    .line 249
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const/4 v1, 0x7

    .line 258
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 263
    .line 264
    sput-object v0, Lcom/zykj/paint/Actions;->o:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 265
    .line 266
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 267
    .line 268
    const-string v3, "StickyGraphId"

    .line 269
    .line 270
    const-string v4, "Points"

    .line 271
    .line 272
    const-string v5, "Width"

    .line 273
    .line 274
    filled-new-array {v4, v2, v5, v3}, [Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    sput-object v1, Lcom/zykj/paint/Actions;->p:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 282
    .line 283
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const/16 v1, 0x8

    .line 292
    .line 293
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 298
    .line 299
    sput-object v0, Lcom/zykj/paint/Actions;->q:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 300
    .line 301
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 302
    .line 303
    const-string v2, "Blue"

    .line 304
    .line 305
    const-string v3, "Alpha"

    .line 306
    .line 307
    const-string v4, "Red"

    .line 308
    .line 309
    const-string v6, "Green"

    .line 310
    .line 311
    filled-new-array {v4, v6, v2, v3}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    sput-object v1, Lcom/zykj/paint/Actions;->r:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 319
    .line 320
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

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
    const/16 v1, 0x9

    .line 329
    .line 330
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 335
    .line 336
    sput-object v0, Lcom/zykj/paint/Actions;->s:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 337
    .line 338
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 339
    .line 340
    const-string v2, "X"

    .line 341
    .line 342
    const-string v3, "Y"

    .line 343
    .line 344
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-direct {v1, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    sput-object v1, Lcom/zykj/paint/Actions;->t:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 352
    .line 353
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    const/16 v1, 0xa

    .line 362
    .line 363
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 368
    .line 369
    sput-object v0, Lcom/zykj/paint/Actions;->u:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 370
    .line 371
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 372
    .line 373
    const-string v4, "Height"

    .line 374
    .line 375
    filled-new-array {v5, v4}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    invoke-direct {v1, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    sput-object v1, Lcom/zykj/paint/Actions;->v:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 383
    .line 384
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    const/16 v1, 0xb

    .line 393
    .line 394
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 399
    .line 400
    sput-object v0, Lcom/zykj/paint/Actions;->w:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 401
    .line 402
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 403
    .line 404
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    sput-object v1, Lcom/zykj/paint/Actions;->x:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 412
    .line 413
    invoke-static {}, Lcom/zykj/paint/Actions;->f()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const/16 v1, 0xc

    .line 422
    .line 423
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 428
    .line 429
    sput-object v0, Lcom/zykj/paint/Actions;->y:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 430
    .line 431
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 432
    .line 433
    const-string v2, "Action"

    .line 434
    .line 435
    filled-new-array {v2}, [Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    sput-object v1, Lcom/zykj/paint/Actions;->z:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 443
    .line 444
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 445
    .line 446
    .line 447
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->y:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->z:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic e(Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/paint/Actions;->A:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static f()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->A:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
