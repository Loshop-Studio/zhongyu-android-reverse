# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/GraphSnapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/GraphSnapshot$RectF;,
        Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;,
        Lcom/zykj/sketch/GraphSnapshot$File;,
        Lcom/zykj/sketch/GraphSnapshot$FileOrBuilder;,
        Lcom/zykj/sketch/GraphSnapshot$Touch;,
        Lcom/zykj/sketch/GraphSnapshot$TouchOrBuilder;,
        Lcom/zykj/sketch/GraphSnapshot$PointF;,
        Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;,
        Lcom/zykj/sketch/GraphSnapshot$GraphData;,
        Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;,
        Lcom/zykj/sketch/GraphSnapshot$GraphType;
    }
.end annotation


# static fields
.field private static descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

.field private static final internal_static_File_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_File_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_GraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_GraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_PointF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_PointF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_RectF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_RectF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_Touch_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_Touch_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-string v0, "\n\u0019SketchGraphSnapshot.proto\u001a\u0019google/protobuf/any.proto\"\u0085\u0002\n\tGraphData\u0012\u001d\n\tgraphType\u0018\u0001 \u0001(\u000e2\n.GraphType\u0012\u001e\n\nchildGraph\u0018\u0002 \u0003(\u000b2\n.GraphData\u0012\u000e\n\u0006matrix\u0018\u0003 \u0003(\u0002\u0012\u0019\n\u0011childExtendMatrix\u0018\u0004 \u0003(\u0002\u0012\r\n\u0005width\u0018\u0006 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0007 \u0001(\u0005\u0012\u0010\n\u0008isSelect\u0018\u0008 \u0001(\u0008\u0012\u0012\n\nshowDelete\u0018\t \u0001(\u0008\u0012#\n\u0005extra\u0018\n \u0001(\u000b2\u0014.google.protobuf.Any\u0012\u000c\n\u0004name\u0018\u000b \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u000c \u0001(\u000b2\u0006.RectF\"\u001e\n\u0006PointF\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\" \n\u0005Touch\u0012\u0017\n\u0006pointF\u0018\u0001 \u0003(\u000b2\u0007.PointF\"t\n\u0004File\u0012\u0010\n\u0008file"

    .line 2
    .line 3
    const-string v1, "Name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0005 \u0001(\u0005\u0012\u0014\n\u000cpositionFlag\u0018\u0006 \u0001(\u0005\"A\n\u0005RectF\u0012\u000c\n\u0004left\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003top\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002*\u00a8\u0001\n\tGraphType\u0012\u001d\n\u0019UNBOUNDED_CONTAINER_GRAPH\u0010\u0000\u0012\u001b\n\u0017BOUNDED_CONTAINER_GRAPH\u0010\u0001\u0012\u000f\n\u000bIMAGE_GRAPH\u0010\u0002\u0012\u0012\n\u000eWEB_VIEW_GRAPH\u0010\u0003\u0012\u0017\n\u0013WRITING_GROUP_GRAPH\u0010\u0004\u0012\u0010\n\u000cSTROKE_GRAPH\u0010\u0005\u0012\u000f\n\u000bSHAPE_GRAPH\u0010\u0006B \n\u000fcom.zykj.sketchB\rGraphSnapshotb\u0006proto3"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/zykj/sketch/GraphSnapshot$1;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/zykj/sketch/GraphSnapshot$1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    filled-new-array {v2}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;Lcom/google/protobuf/Descriptors$FileDescriptor$InternalDescriptorAssigner;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 39
    .line 40
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_GraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 41
    .line 42
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 43
    .line 44
    const-string v11, "Name"

    .line 45
    .line 46
    const-string v12, "OutRect"

    .line 47
    .line 48
    const-string v2, "GraphType"

    .line 49
    .line 50
    const-string v3, "ChildGraph"

    .line 51
    .line 52
    const-string v4, "Matrix"

    .line 53
    .line 54
    const-string v5, "ChildExtendMatrix"

    .line 55
    .line 56
    const-string v6, "Width"

    .line 57
    .line 58
    const-string v7, "Color"

    .line 59
    .line 60
    const-string v8, "IsSelect"

    .line 61
    .line 62
    const-string v9, "ShowDelete"

    .line 63
    .line 64
    const-string v10, "Extra"

    .line 65
    .line 66
    filled-new-array/range {v2 .. v12}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lcom/zykj/sketch/GraphSnapshot;->internal_static_GraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 74
    .line 75
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 89
    .line 90
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_PointF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 91
    .line 92
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 93
    .line 94
    const-string v2, "X"

    .line 95
    .line 96
    const-string v3, "Y"

    .line 97
    .line 98
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sput-object v1, Lcom/zykj/sketch/GraphSnapshot;->internal_static_PointF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 106
    .line 107
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 121
    .line 122
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_Touch_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 123
    .line 124
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 125
    .line 126
    const-string v2, "PointF"

    .line 127
    .line 128
    filled-new-array {v2}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    sput-object v1, Lcom/zykj/sketch/GraphSnapshot;->internal_static_Touch_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 136
    .line 137
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/4 v1, 0x3

    .line 146
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 151
    .line 152
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_File_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 153
    .line 154
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 155
    .line 156
    const-string v6, "ViewHeight"

    .line 157
    .line 158
    const-string v7, "PositionFlag"

    .line 159
    .line 160
    const-string v2, "FileName"

    .line 161
    .line 162
    const-string v3, "Width"

    .line 163
    .line 164
    const-string v4, "Height"

    .line 165
    .line 166
    const-string v5, "ViewWidth"

    .line 167
    .line 168
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sput-object v1, Lcom/zykj/sketch/GraphSnapshot;->internal_static_File_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 176
    .line 177
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/4 v1, 0x4

    .line 186
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 191
    .line 192
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_RectF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 193
    .line 194
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 195
    .line 196
    const-string v2, "Right"

    .line 197
    .line 198
    const-string v3, "Bottom"

    .line 199
    .line 200
    const-string v4, "Left"

    .line 201
    .line 202
    const-string v5, "Top"

    .line 203
    .line 204
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sput-object v1, Lcom/zykj/sketch/GraphSnapshot;->internal_static_RectF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 212
    .line 213
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 214
    .line 215
    .line 216
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
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_GraphData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_GraphData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_PointF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_PointF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_Touch_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_Touch_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_File_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_File_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5700()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_RectF_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5800()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->internal_static_RectF_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$6902(Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/sketch/GraphSnapshot;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistry;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/zykj/sketch/GraphSnapshot;->registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 0

    .line 1
    return-void
.end method
