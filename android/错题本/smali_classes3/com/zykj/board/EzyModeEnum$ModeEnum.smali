.class public final enum Lcom/zykj/board/EzyModeEnum$ModeEnum;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ProtocolMessageEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/board/EzyModeEnum$ModeEnum;",
        ">;",
        "Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field public static final enum ACTION_CURSOR:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_CURSOR_VALUE:I = 0x8

.field public static final enum ACTION_DELETE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_DELETE_VALUE:I = 0x5

.field public static final enum ACTION_ERASER_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_ERASER_WRITING_VALUE:I = 0x4

.field public static final enum ACTION_GEOMETRY:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_GEOMETRY_VALUE:I = 0xa

.field public static final enum ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_NEW_SELECT_VALUE:I = 0x9

.field public static final enum ACTION_SEE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_SEE_VALUE:I = 0x6

.field public static final enum ACTION_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_SELECT_VALUE:I = 0x0

.field public static final enum ACTION_TEXT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_TEXT_VALUE:I = 0x7

.field public static final enum ACTION_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final enum ACTION_WRITING_BEELINE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_WRITING_BEELINE_VALUE:I = 0x3

.field public static final enum ACTION_WRITING_MOVE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final ACTION_WRITING_MOVE_VALUE:I = 0x2

.field public static final ACTION_WRITING_VALUE:I = 0x1

.field public static final enum UNRECOGNIZED:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final a:Lb4/e0;

.field public static final b:[Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public static final synthetic c:[Lcom/zykj/board/EzyModeEnum$ModeEnum;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    const-string v1, "ACTION_SELECT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 12
    .line 13
    const-string v2, "ACTION_WRITING"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 22
    .line 23
    const-string v3, "ACTION_WRITING_MOVE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_MOVE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 32
    .line 33
    const-string v4, "ACTION_WRITING_BEELINE"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_BEELINE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 40
    .line 41
    new-instance v4, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 42
    .line 43
    const-string v5, "ACTION_ERASER_WRITING"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_ERASER_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 50
    .line 51
    new-instance v5, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 52
    .line 53
    const-string v6, "ACTION_DELETE"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7, v7}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_DELETE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 60
    .line 61
    new-instance v6, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 62
    .line 63
    const-string v7, "ACTION_SEE"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8, v8}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_SEE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 70
    .line 71
    new-instance v7, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 72
    .line 73
    const-string v8, "ACTION_TEXT"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v7, v8, v9, v9}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v7, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_TEXT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 80
    .line 81
    new-instance v8, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 82
    .line 83
    const-string v9, "ACTION_CURSOR"

    .line 84
    .line 85
    const/16 v10, 0x8

    .line 86
    .line 87
    invoke-direct {v8, v9, v10, v10}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v8, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_CURSOR:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 91
    .line 92
    new-instance v9, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 93
    .line 94
    const-string v10, "ACTION_NEW_SELECT"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v9, v10, v11, v11}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v9, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 102
    .line 103
    new-instance v10, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 104
    .line 105
    const-string v11, "ACTION_GEOMETRY"

    .line 106
    .line 107
    const/16 v12, 0xa

    .line 108
    .line 109
    invoke-direct {v10, v11, v12, v12}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    sput-object v10, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_GEOMETRY:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 113
    .line 114
    new-instance v11, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 115
    .line 116
    const/16 v12, 0xb

    .line 117
    .line 118
    const/4 v13, -0x1

    .line 119
    const-string v14, "UNRECOGNIZED"

    .line 120
    .line 121
    invoke-direct {v11, v14, v12, v13}, Lcom/zykj/board/EzyModeEnum$ModeEnum;-><init>(Ljava/lang/String;II)V

    .line 122
    .line 123
    .line 124
    sput-object v11, Lcom/zykj/board/EzyModeEnum$ModeEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 125
    .line 126
    filled-new-array/range {v0 .. v11}, [Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:[Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 131
    .line 132
    new-instance v0, Lb4/e0;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    sput-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->a:Lb4/e0;

    .line 138
    .line 139
    invoke-static {}, Lcom/zykj/board/EzyModeEnum$ModeEnum;->values()[Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->b:[Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 144
    .line 145
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/zykj/board/EzyModeEnum$ModeEnum;
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
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_GEOMETRY:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_1
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_2
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_CURSOR:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_3
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_TEXT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_4
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_SEE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_5
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_DELETE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_6
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_ERASER_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_7
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_BEELINE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_8
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING_MOVE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_9
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_WRITING:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_a
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
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
    sget-object v0, Lb4/f0;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

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
            "Lcom/zykj/board/EzyModeEnum$ModeEnum;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->a:Lb4/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/zykj/board/EzyModeEnum$ModeEnum;->forNumber(I)Lcom/zykj/board/EzyModeEnum$ModeEnum;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/zykj/board/EzyModeEnum$ModeEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 5
    sget-object p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->b:[Lcom/zykj/board/EzyModeEnum$ModeEnum;

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

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;

    return-object p0
.end method

.method public static values()[Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:[Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/zykj/board/EzyModeEnum$ModeEnum;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyModeEnum$ModeEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

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
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->value:I

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
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->UNRECOGNIZED:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyModeEnum$ModeEnum;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

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
