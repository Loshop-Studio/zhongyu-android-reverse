.class public final enum Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ProtocolMessageEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ActionEnum"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;",
        ">;",
        "Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final enum ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_AUDIO_START_VALUE:I = 0x9

.field public static final enum ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_AUDIO_STOP_VALUE:I = 0xa

.field public static final enum ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_CLEAR_BOARD_VALUE:I = 0x6

.field public static final enum ACTION_DRAW_CONFIG:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_DRAW_CONFIG_VALUE:I = 0xd

.field public static final enum ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_FILTER_VALUE:I = 0x5

.field public static final enum ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_GRAPH_VALUE:I = 0x2

.field public static final enum ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_IMAGE_VALUE:I = 0x4

.field public static final enum ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_MODE_VALUE:I = 0x1

.field public static final enum ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_NEXT_VALUE:I = 0x7

.field public static final enum ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_PREV_VALUE:I = 0x8

.field public static final enum ACTION_RESET_MATRIX:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_RESET_MATRIX_VALUE:I = 0xe

.field public static final enum ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_TOUCH_VALUE:I = 0x0

.field public static final enum ACTION_TRANS:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_TRANS_VALUE:I = 0xc

.field public static final enum ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_WEB_VALUE:I = 0x3

.field public static final enum ACTION_ZOOM:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field public static final ACTION_ZOOM_VALUE:I = 0xb

.field public static final enum UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field private static final VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 2
    .line 3
    const-string v0, "ACTION_TOUCH"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 12
    .line 13
    const-string v0, "ACTION_MODE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v0, v3, v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 20
    .line 21
    new-instance v3, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 22
    .line 23
    const-string v0, "ACTION_GRAPH"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v3, v0, v4, v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 30
    .line 31
    new-instance v4, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 32
    .line 33
    const-string v0, "ACTION_WEB"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v4, v0, v5, v5}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v4, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 40
    .line 41
    new-instance v5, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 42
    .line 43
    const-string v0, "ACTION_IMAGE"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v5, v0, v6, v6}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v5, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 50
    .line 51
    new-instance v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 52
    .line 53
    const-string v0, "ACTION_FILTER"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v6, v0, v7, v7}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 60
    .line 61
    new-instance v7, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 62
    .line 63
    const-string v0, "ACTION_CLEAR_BOARD"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v7, v0, v8, v8}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v7, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 70
    .line 71
    new-instance v8, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 72
    .line 73
    const-string v0, "ACTION_NEXT"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v8, v0, v9, v9}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v8, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 80
    .line 81
    new-instance v9, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 82
    .line 83
    const-string v0, "ACTION_PREV"

    .line 84
    .line 85
    const/16 v10, 0x8

    .line 86
    .line 87
    invoke-direct {v9, v0, v10, v10}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v9, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 91
    .line 92
    new-instance v10, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 93
    .line 94
    const-string v0, "ACTION_AUDIO_START"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v10, v0, v11, v11}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v10, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 102
    .line 103
    new-instance v11, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 104
    .line 105
    const-string v0, "ACTION_AUDIO_STOP"

    .line 106
    .line 107
    const/16 v12, 0xa

    .line 108
    .line 109
    invoke-direct {v11, v0, v12, v12}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    sput-object v11, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 113
    .line 114
    new-instance v12, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 115
    .line 116
    const-string v0, "ACTION_ZOOM"

    .line 117
    .line 118
    const/16 v13, 0xb

    .line 119
    .line 120
    invoke-direct {v12, v0, v13, v13}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v12, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_ZOOM:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 124
    .line 125
    new-instance v13, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 126
    .line 127
    const-string v0, "ACTION_TRANS"

    .line 128
    .line 129
    const/16 v14, 0xc

    .line 130
    .line 131
    invoke-direct {v13, v0, v14, v14}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 132
    .line 133
    .line 134
    sput-object v13, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TRANS:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 135
    .line 136
    new-instance v14, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 137
    .line 138
    const-string v0, "ACTION_DRAW_CONFIG"

    .line 139
    .line 140
    const/16 v15, 0xd

    .line 141
    .line 142
    invoke-direct {v14, v0, v15, v15}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 143
    .line 144
    .line 145
    sput-object v14, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_DRAW_CONFIG:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 146
    .line 147
    new-instance v15, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 148
    .line 149
    const-string v0, "ACTION_RESET_MATRIX"

    .line 150
    .line 151
    move-object/from16 v16, v1

    .line 152
    .line 153
    const/16 v1, 0xe

    .line 154
    .line 155
    invoke-direct {v15, v0, v1, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 156
    .line 157
    .line 158
    sput-object v15, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_RESET_MATRIX:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 159
    .line 160
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 161
    .line 162
    const/16 v1, 0xf

    .line 163
    .line 164
    move-object/from16 v17, v2

    .line 165
    .line 166
    const/4 v2, -0x1

    .line 167
    move-object/from16 v18, v3

    .line 168
    .line 169
    const-string v3, "UNRECOGNIZED"

    .line 170
    .line 171
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;-><init>(Ljava/lang/String;II)V

    .line 172
    .line 173
    .line 174
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 175
    .line 176
    move-object/from16 v1, v16

    .line 177
    .line 178
    move-object/from16 v2, v17

    .line 179
    .line 180
    move-object/from16 v3, v18

    .line 181
    .line 182
    move-object/from16 v16, v0

    .line 183
    .line 184
    filled-new-array/range {v1 .. v16}, [Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->$VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 189
    .line 190
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum$1;

    .line 191
    .line 192
    invoke-direct {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum$1;-><init>()V

    .line 193
    .line 194
    .line 195
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 196
    .line 197
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->values()[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 202
    .line 203
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
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
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_RESET_MATRIX:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_1
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_DRAW_CONFIG:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_2
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TRANS:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_3
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_ZOOM:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_4
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_5
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_6
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_7
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_8
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_9
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_FILTER:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_a
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_b
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_c
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_d
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_e
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getEnumTypes()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 15
    .line 16
    return-object v0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->forNumber(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 5
    sget-object p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

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

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    return-object p0
.end method

.method public static values()[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->$VALUES:[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

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
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->value:I

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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->getValues()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    .line 18
    .line 19
    return-object v0
.end method
