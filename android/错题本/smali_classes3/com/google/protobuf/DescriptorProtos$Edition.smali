.class public final enum Lcom/google/protobuf/DescriptorProtos$Edition;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ProtocolMessageEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Edition"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/DescriptorProtos$Edition;",
        ">;",
        "Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final enum EDITION_1_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_1_TEST_ONLY_VALUE:I = 0x1

.field public static final enum EDITION_2023:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_2023_VALUE:I = 0x3e8

.field public static final enum EDITION_2_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_2_TEST_ONLY_VALUE:I = 0x2

.field public static final enum EDITION_99997_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_99997_TEST_ONLY_VALUE:I = 0x1869d

.field public static final enum EDITION_99998_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_99998_TEST_ONLY_VALUE:I = 0x1869e

.field public static final enum EDITION_99999_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_99999_TEST_ONLY_VALUE:I = 0x1869f

.field public static final enum EDITION_PROTO2:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_PROTO2_VALUE:I = 0x3e6

.field public static final enum EDITION_PROTO3:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_PROTO3_VALUE:I = 0x3e7

.field public static final enum EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

.field public static final EDITION_UNKNOWN_VALUE:I

.field private static final VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/google/protobuf/DescriptorProtos$Edition;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 2
    .line 3
    const-string v1, "EDITION_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    new-instance v1, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 12
    .line 13
    const/16 v2, 0x3e6

    .line 14
    .line 15
    const-string v3, "EDITION_PROTO2"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v1, v3, v4, v2}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO2:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 22
    .line 23
    new-instance v2, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 24
    .line 25
    const/16 v3, 0x3e7

    .line 26
    .line 27
    const-string v5, "EDITION_PROTO3"

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    invoke-direct {v2, v5, v6, v3}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO3:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 34
    .line 35
    new-instance v3, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/16 v7, 0x3e8

    .line 39
    .line 40
    const-string v8, "EDITION_2023"

    .line 41
    .line 42
    invoke-direct {v3, v8, v5, v7}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    sput-object v3, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_2023:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 46
    .line 47
    move v5, v4

    .line 48
    new-instance v4, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 49
    .line 50
    const-string v7, "EDITION_1_TEST_ONLY"

    .line 51
    .line 52
    const/4 v8, 0x4

    .line 53
    invoke-direct {v4, v7, v8, v5}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    sput-object v4, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_1_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 57
    .line 58
    new-instance v5, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 59
    .line 60
    const-string v7, "EDITION_2_TEST_ONLY"

    .line 61
    .line 62
    const/4 v8, 0x5

    .line 63
    invoke-direct {v5, v7, v8, v6}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 64
    .line 65
    .line 66
    sput-object v5, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_2_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 67
    .line 68
    new-instance v6, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 69
    .line 70
    const/4 v7, 0x6

    .line 71
    const v8, 0x1869d

    .line 72
    .line 73
    .line 74
    const-string v9, "EDITION_99997_TEST_ONLY"

    .line 75
    .line 76
    invoke-direct {v6, v9, v7, v8}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v6, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99997_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 80
    .line 81
    new-instance v7, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 82
    .line 83
    const/4 v8, 0x7

    .line 84
    const v9, 0x1869e

    .line 85
    .line 86
    .line 87
    const-string v10, "EDITION_99998_TEST_ONLY"

    .line 88
    .line 89
    invoke-direct {v7, v10, v8, v9}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    .line 92
    sput-object v7, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99998_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 93
    .line 94
    new-instance v8, Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 95
    .line 96
    const/16 v9, 0x8

    .line 97
    .line 98
    const v10, 0x1869f

    .line 99
    .line 100
    .line 101
    const-string v11, "EDITION_99999_TEST_ONLY"

    .line 102
    .line 103
    invoke-direct {v8, v11, v9, v10}, Lcom/google/protobuf/DescriptorProtos$Edition;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    sput-object v8, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99999_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 107
    .line 108
    filled-new-array/range {v0 .. v8}, [Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 113
    .line 114
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$Edition$1;

    .line 115
    .line 116
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$Edition$1;-><init>()V

    .line 117
    .line 118
    .line 119
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 120
    .line 121
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$Edition;->values()[Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 126
    .line 127
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
    iput p3, p0, Lcom/google/protobuf/DescriptorProtos$Edition;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p0, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99999_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99998_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_2
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_99997_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_3
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_2023:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_4
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO3:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_5
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO2:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_2_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_1_TEST_ONLY:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x3e6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    :pswitch_data_1
    .packed-switch 0x1869d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

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
            "Lcom/google/protobuf/DescriptorProtos$Edition;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$Edition;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 4
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result p0

    aget-object p0, v0, p0

    return-object p0

    .line 5
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "EnumValueDescriptor is not for this type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 1

    .line 1
    const-class v0, Lcom/google/protobuf/DescriptorProtos$Edition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$Edition;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->$VALUES:[Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/protobuf/DescriptorProtos$Edition;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$Edition;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$Edition;->value:I

    .line 2
    .line 3
    return v0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/Descriptors$EnumValueDescriptor;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$Edition;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

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
