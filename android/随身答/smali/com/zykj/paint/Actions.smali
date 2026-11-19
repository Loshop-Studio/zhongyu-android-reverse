# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/Actions$EzyActionList;,
        Lcom/zykj/paint/Actions$EzyActionListOrBuilder;,
        Lcom/zykj/paint/Actions$EzyVector;,
        Lcom/zykj/paint/Actions$EzyVectorOrBuilder;,
        Lcom/zykj/paint/Actions$EzySize;,
        Lcom/zykj/paint/Actions$EzySizeOrBuilder;,
        Lcom/zykj/paint/Actions$EzyPoint;,
        Lcom/zykj/paint/Actions$EzyPointOrBuilder;,
        Lcom/zykj/paint/Actions$EzyColor;,
        Lcom/zykj/paint/Actions$EzyColorOrBuilder;,
        Lcom/zykj/paint/Actions$NewPolylineData;,
        Lcom/zykj/paint/Actions$NewPolylineDataOrBuilder;,
        Lcom/zykj/paint/Actions$NewImageData;,
        Lcom/zykj/paint/Actions$NewImageDataOrBuilder;,
        Lcom/zykj/paint/Actions$NewLayerData;,
        Lcom/zykj/paint/Actions$NewLayerDataOrBuilder;,
        Lcom/zykj/paint/Actions$ZoomGraphData;,
        Lcom/zykj/paint/Actions$ZoomGraphDataOrBuilder;,
        Lcom/zykj/paint/Actions$MoveGraphData;,
        Lcom/zykj/paint/Actions$MoveGraphDataOrBuilder;,
        Lcom/zykj/paint/Actions$EzyMatrixData;,
        Lcom/zykj/paint/Actions$EzyMatrixDataOrBuilder;,
        Lcom/zykj/paint/Actions$EzyActionData;,
        Lcom/zykj/paint/Actions$EzyActionDataOrBuilder;,
        Lcom/zykj/paint/Actions$EzyAction;,
        Lcom/zykj/paint/Actions$EzyActionOrBuilder;
    }
.end annotation


# static fields
.field private static descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

.field private static final internal_static_EzyActionData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyActionData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyActionList_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyActionList_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyColor_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyColor_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyMatrixData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyMatrixData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyPoint_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyPoint_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzySize_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzySize_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_EzyVector_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_EzyVector_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_MoveGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_MoveGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_NewImageData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_NewImageData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_NewLayerData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_NewLayerData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_NewPolylineData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_NewPolylineData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ZoomGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ZoomGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string/jumbo v0, "ize\u0018\u0002 \u0001(\u000b2\u0008.EzySize\u0012\u000b\n\u0003Src\u0018\u0003 \u0001(\t\"l\n\u000fNewPolylineData\u0012\u0019\n\u0006Points\u0018\u0001 \u0003(\u000b2\t.EzyPoint\u0012\u0018\n\u0005Color\u0018\u0002 \u0001(\u000b2\t.EzyColor\u0012\r\n\u0005Width\u0018\u0003 \u0001(\u0001\u0012\u0015\n\rStickyGraphId\u0018\u0004 \u0001(\u0005\"C\n\u0008EzyColor\u0012\u000b\n\u0003Red\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005Green\u0018\u0002 \u0001(\u0005\u0012\u000c\n\u0004Blue\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005Alpha\u0018\u0004 \u0001(\u0005\" \n\u0008EzyPoint\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"(\n\u0007EzySize\u0012\r\n\u0005Width\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006Height\u0018\u0002 \u0001(\u0005\"!\n\tEzyVector\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"+\n\rEzyActionList\u0012\u001a\n\u0006action\u0018\u0001 \u0003(\u000b2\n.EzyActionB*\n\u000ecom.zykj.paint\u00aa\u0002\u0017EzyCoursePla"

    .line 2
    .line 3
    .line 4
    const-string/jumbo v1, "yer.Actionsb\u0006proto3"

    .line 5
    .line 6
    .line 7
    const-string v2, "\n\ractions.proto\u001a\u0019google/protobuf/any.proto\"w\n\tEzyAction\u0012\u000f\n\u0007StartAt\u0018\u0001 \u0001(\u0005\u0012\u0010\n\u0008Duration\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nActionType\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007GraphId\u0018\u0004 \u0001(\u0005\u0012\"\n\u0004Data\u0018\u0005 \u0001(\u000b2\u0014.google.protobuf.Any\"$\n\rEzyActionData\u0012\u0013\n\u000bPlaceHolder\u0018\u0001 \u0001(\u0005\"\u001f\n\rEzyMatrixData\u0012\u000e\n\u0006values\u0018\u0001 \u0003(\u0002\"+\n\rMoveGraphData\u0012\u001a\n\u0006Vector\u0018\u0001 \u0001(\u000b2\n.EzyVector\"\u001e\n\rZoomGraphData\u0012\r\n\u0005Scale\u0018\u0001 \u0001(\u0001\"(\n\u000cNewLayerData\u0012\u0018\n\u0005Color\u0018\u0001 \u0001(\u000b2\t.EzyColor\"M\n\u000cNewImageData\u0012\u0018\n\u0005Point\u0018\u0001 \u0001(\u000b2\t.EzyPoint\u0012\u0016\n\u0004S"

    .line 8
    .line 9
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/zykj/paint/Actions$1;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/zykj/paint/Actions$1;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    filled-new-array {v2}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;Lcom/google/protobuf/Descriptors$FileDescriptor$InternalDescriptorAssigner;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 43
    .line 44
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 45
    .line 46
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 47
    .line 48
    const-string v2, "GraphId"

    .line 49
    .line 50
    const-string v3, "Data"

    .line 51
    .line 52
    const-string v4, "StartAt"

    .line 53
    .line 54
    const-string v5, "Duration"

    .line 55
    .line 56
    const-string v6, "ActionType"

    .line 57
    .line 58
    filled-new-array {v4, v5, v6, v2, v3}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 66
    .line 67
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 81
    .line 82
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 83
    .line 84
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 85
    .line 86
    const-string v2, "PlaceHolder"

    .line 87
    .line 88
    filled-new-array {v2}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyActionData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 96
    .line 97
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 111
    .line 112
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyMatrixData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 113
    .line 114
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 115
    .line 116
    const-string v2, "Values"

    .line 117
    .line 118
    filled-new-array {v2}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyMatrixData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 126
    .line 127
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/4 v1, 0x3

    .line 136
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 141
    .line 142
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_MoveGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 143
    .line 144
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 145
    .line 146
    const-string v2, "Vector"

    .line 147
    .line 148
    filled-new-array {v2}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_MoveGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 156
    .line 157
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/4 v1, 0x4

    .line 166
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 171
    .line 172
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_ZoomGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 173
    .line 174
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 175
    .line 176
    const-string v2, "Scale"

    .line 177
    .line 178
    filled-new-array {v2}, [Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_ZoomGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 186
    .line 187
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const/4 v1, 0x5

    .line 196
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 201
    .line 202
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_NewLayerData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 203
    .line 204
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 205
    .line 206
    const-string v2, "Color"

    .line 207
    .line 208
    filled-new-array {v2}, [Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-direct {v1, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_NewLayerData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 216
    .line 217
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const/4 v1, 0x6

    .line 226
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 231
    .line 232
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_NewImageData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 233
    .line 234
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 235
    .line 236
    const-string v3, "Size"

    .line 237
    .line 238
    const-string v4, "Src"

    .line 239
    .line 240
    const-string v5, "Point"

    .line 241
    .line 242
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-direct {v1, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_NewImageData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 250
    .line 251
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    const/4 v1, 0x7

    .line 260
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 265
    .line 266
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_NewPolylineData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 267
    .line 268
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 269
    .line 270
    const-string v3, "StickyGraphId"

    .line 271
    .line 272
    const-string v4, "Points"

    .line 273
    .line 274
    const-string v5, "Width"

    .line 275
    .line 276
    filled-new-array {v4, v2, v5, v3}, [Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_NewPolylineData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 284
    .line 285
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const/16 v1, 0x8

    .line 294
    .line 295
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 300
    .line 301
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyColor_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 302
    .line 303
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 304
    .line 305
    const-string v2, "Blue"

    .line 306
    .line 307
    const-string v3, "Alpha"

    .line 308
    .line 309
    const-string v4, "Red"

    .line 310
    .line 311
    const-string v6, "Green"

    .line 312
    .line 313
    filled-new-array {v4, v6, v2, v3}, [Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyColor_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 321
    .line 322
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const/16 v1, 0x9

    .line 331
    .line 332
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 337
    .line 338
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyPoint_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 339
    .line 340
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 341
    .line 342
    const-string v2, "X"

    .line 343
    .line 344
    const-string v3, "Y"

    .line 345
    .line 346
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-direct {v1, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyPoint_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 354
    .line 355
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const/16 v1, 0xa

    .line 364
    .line 365
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 370
    .line 371
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzySize_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 372
    .line 373
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 374
    .line 375
    const-string v4, "Height"

    .line 376
    .line 377
    filled-new-array {v5, v4}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-direct {v1, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzySize_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 385
    .line 386
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const/16 v1, 0xb

    .line 395
    .line 396
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 401
    .line 402
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyVector_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 403
    .line 404
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 405
    .line 406
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyVector_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 414
    .line 415
    invoke-static {}, Lcom/zykj/paint/Actions;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    const/16 v1, 0xc

    .line 424
    .line 425
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 430
    .line 431
    sput-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionList_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 432
    .line 433
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 434
    .line 435
    const-string v2, "Action"

    .line 436
    .line 437
    filled-new-array {v2}, [Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    sput-object v1, Lcom/zykj/paint/Actions;->internal_static_EzyActionList_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 445
    .line 446
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 447
    .line 448
    .line 449
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$10600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzySize_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$10700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzySize_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$11600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyVector_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$11700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyVector_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$12600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionList_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$12700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionList_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1300()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$13602(Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/paint/Actions;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyActionData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyMatrixData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyMatrixData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3100()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_MoveGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3200()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_MoveGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_ZoomGraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_ZoomGraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4900()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewLayerData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5000()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewLayerData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5800()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewImageData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5900()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewImageData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewPolylineData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_NewPolylineData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$8400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyColor_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$8500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyColor_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$9600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyPoint_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$9700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->internal_static_EzyPoint_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/paint/Actions;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistry;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/zykj/paint/Actions;->registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 0

    .line 1
    return-void
.end method
