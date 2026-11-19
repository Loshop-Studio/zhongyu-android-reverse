.class public final enum Lcom/zykj/board/EzyCommandEnum$CommandEnum;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ProtocolMessageEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        ">;",
        "Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field public static final enum ACTION_AUDIO_START:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_AUDIO_START_VALUE:I = 0x6

.field public static final enum ACTION_CAMERA:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final enum ACTION_CAMERA_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_CAMERA_MATRIX_VALUE:I = 0x8

.field public static final ACTION_CAMERA_VALUE:I = 0x7

.field public static final enum ACTION_CONFIG:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_CONFIG_VALUE:I = 0x9

.field public static final enum ACTION_CURSOR_MOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_CURSOR_MOVE_VALUE:I = 0xb

.field public static final enum ACTION_DEFAULT:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_DEFAULT_VALUE:I = 0x0

.field public static final enum ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_GRAPH_ADD_VALUE:I = 0x1

.field public static final enum ACTION_GRAPH_CHANGE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_GRAPH_CHANGE_VALUE:I = 0x4

.field public static final enum ACTION_GRAPH_CUSTOM:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_GRAPH_CUSTOM_VALUE:I = 0x5

.field public static final enum ACTION_GRAPH_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_GRAPH_MATRIX_VALUE:I = 0x3

.field public static final enum ACTION_GRAPH_REMOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_GRAPH_REMOVE_VALUE:I = 0x2

.field public static final enum ACTION_REBUILD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_REBUILD_VALUE:I = 0xc

.field public static final enum ACTION_RECORD_STOP:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final ACTION_RECORD_STOP_VALUE:I = 0xa

.field public static final enum UNRECOGNIZED:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final a:Lb4/g;

.field public static final b:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field public static final synthetic c:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    const-string v1, "ACTION_DEFAULT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_DEFAULT:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 12
    .line 13
    const-string v2, "ACTION_GRAPH_ADD"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 22
    .line 23
    const-string v3, "ACTION_GRAPH_REMOVE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_REMOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 32
    .line 33
    const-string v4, "ACTION_GRAPH_MATRIX"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 40
    .line 41
    new-instance v4, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 42
    .line 43
    const-string v5, "ACTION_GRAPH_CHANGE"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_CHANGE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 50
    .line 51
    new-instance v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 52
    .line 53
    const-string v6, "ACTION_GRAPH_CUSTOM"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7, v7}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_CUSTOM:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 60
    .line 61
    new-instance v6, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 62
    .line 63
    const-string v7, "ACTION_AUDIO_START"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8, v8}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_AUDIO_START:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 70
    .line 71
    new-instance v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 72
    .line 73
    const-string v8, "ACTION_CAMERA"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v7, v8, v9, v9}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 80
    .line 81
    new-instance v8, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 82
    .line 83
    const-string v9, "ACTION_CAMERA_MATRIX"

    .line 84
    .line 85
    const/16 v10, 0x8

    .line 86
    .line 87
    invoke-direct {v8, v9, v10, v10}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v8, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 91
    .line 92
    new-instance v9, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 93
    .line 94
    const-string v10, "ACTION_CONFIG"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v9, v10, v11, v11}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v9, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CONFIG:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 102
    .line 103
    new-instance v10, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 104
    .line 105
    const-string v11, "ACTION_RECORD_STOP"

    .line 106
    .line 107
    const/16 v12, 0xa

    .line 108
    .line 109
    invoke-direct {v10, v11, v12, v12}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    sput-object v10, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_RECORD_STOP:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 113
    .line 114
    new-instance v11, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 115
    .line 116
    const-string v12, "ACTION_CURSOR_MOVE"

    .line 117
    .line 118
    const/16 v13, 0xb

    .line 119
    .line 120
    invoke-direct {v11, v12, v13, v13}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v11, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CURSOR_MOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 124
    .line 125
    new-instance v12, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 126
    .line 127
    const-string v13, "ACTION_REBUILD"

    .line 128
    .line 129
    const/16 v14, 0xc

    .line 130
    .line 131
    invoke-direct {v12, v13, v14, v14}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 132
    .line 133
    .line 134
    sput-object v12, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_REBUILD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 135
    .line 136
    new-instance v13, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 137
    .line 138
    const/16 v14, 0xd

    .line 139
    .line 140
    const/4 v15, -0x1

    .line 141
    move-object/from16 v16, v0

    .line 142
    .line 143
    const-string v0, "UNRECOGNIZED"

    .line 144
    .line 145
    invoke-direct {v13, v0, v14, v15}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;-><init>(Ljava/lang/String;II)V

    .line 146
    .line 147
    .line 148
    sput-object v13, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 149
    .line 150
    move-object/from16 v0, v16

    .line 151
    .line 152
    filled-new-array/range {v0 .. v13}, [Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sput-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 157
    .line 158
    new-instance v0, Lb4/g;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    sput-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->a:Lb4/g;

    .line 164
    .line 165
    invoke-static {}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->values()[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sput-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->b:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 170
    .line 171
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :pswitch_0
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_REBUILD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_1
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CURSOR_MOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_2
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_RECORD_STOP:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_3
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CONFIG:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_4
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_5
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_6
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_AUDIO_START:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_7
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_CUSTOM:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_8
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_CHANGE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_9
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_a
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_REMOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_b
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_c
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_DEFAULT:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
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

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 2

    .line 1
    sget-object v0, Lb4/h;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getEnumTypes()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 13
    .line 14
    return-object v0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->a:Lb4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->forNumber(I)Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 5
    sget-object p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->b:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result p0

    aget-object p0, v0, p0

    return-object p0

    .line 7
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "EnumValueDescriptor is not for this type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    return-object p0
.end method

.method public static values()[Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->c:[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/zykj/board/EzyCommandEnum$CommandEnum;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getNumber()I
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->value:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/Descriptors$EnumValueDescriptor;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->getValues()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "Can\'t get the descriptor of an unrecognized enum value."

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method
