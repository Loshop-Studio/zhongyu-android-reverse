.class public final enum Lcom/zykj/lib/login/proto/RoleType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/login/proto/RoleType$RoleTypeVerifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/lib/login/proto/RoleType;",
        ">;",
        "Lcom/google/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/lib/login/proto/RoleType;

.field public static final enum Administrator:Lcom/zykj/lib/login/proto/RoleType;

.field public static final Administrator_VALUE:I = 0x9

.field public static final enum Default:Lcom/zykj/lib/login/proto/RoleType;

.field public static final Default_VALUE:I = 0x0

.field public static final enum Parent:Lcom/zykj/lib/login/proto/RoleType;

.field public static final Parent_VALUE:I = 0x3

.field public static final enum Student:Lcom/zykj/lib/login/proto/RoleType;

.field public static final Student_VALUE:I = 0x1

.field public static final enum SuperAdministrator:Lcom/zykj/lib/login/proto/RoleType;

.field public static final SuperAdministrator_VALUE:I = 0x14

.field public static final enum Teacher:Lcom/zykj/lib/login/proto/RoleType;

.field public static final Teacher_VALUE:I = 0x2

.field public static final enum UNRECOGNIZED:Lcom/zykj/lib/login/proto/RoleType;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/zykj/lib/login/proto/RoleType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/zykj/lib/login/proto/RoleType;
    .locals 7

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->Default:Lcom/zykj/lib/login/proto/RoleType;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 6
    .line 7
    sget-object v3, Lcom/zykj/lib/login/proto/RoleType;->Parent:Lcom/zykj/lib/login/proto/RoleType;

    .line 8
    .line 9
    sget-object v4, Lcom/zykj/lib/login/proto/RoleType;->Administrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 10
    .line 11
    sget-object v5, Lcom/zykj/lib/login/proto/RoleType;->SuperAdministrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 12
    .line 13
    sget-object v6, Lcom/zykj/lib/login/proto/RoleType;->UNRECOGNIZED:Lcom/zykj/lib/login/proto/RoleType;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lcom/zykj/lib/login/proto/RoleType;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 2
    .line 3
    const-string v1, "Default"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->Default:Lcom/zykj/lib/login/proto/RoleType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 12
    .line 13
    const-string v1, "Student"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 22
    .line 23
    const-string v1, "Teacher"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 30
    .line 31
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 32
    .line 33
    const-string v1, "Parent"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->Parent:Lcom/zykj/lib/login/proto/RoleType;

    .line 40
    .line 41
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    const/16 v2, 0x9

    .line 45
    .line 46
    const-string v3, "Administrator"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->Administrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 52
    .line 53
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 54
    .line 55
    const/4 v1, 0x5

    .line 56
    const/16 v2, 0x14

    .line 57
    .line 58
    const-string v3, "SuperAdministrator"

    .line 59
    .line 60
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->SuperAdministrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 64
    .line 65
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType;

    .line 66
    .line 67
    const/4 v1, 0x6

    .line 68
    const/4 v2, -0x1

    .line 69
    const-string v3, "UNRECOGNIZED"

    .line 70
    .line 71
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/lib/login/proto/RoleType;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->UNRECOGNIZED:Lcom/zykj/lib/login/proto/RoleType;

    .line 75
    .line 76
    invoke-static {}, Lcom/zykj/lib/login/proto/RoleType;->$values()[Lcom/zykj/lib/login/proto/RoleType;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->$VALUES:[Lcom/zykj/lib/login/proto/RoleType;

    .line 81
    .line 82
    new-instance v0, Lcom/zykj/lib/login/proto/RoleType$1;

    .line 83
    .line 84
    invoke-direct {v0}, Lcom/zykj/lib/login/proto/RoleType$1;-><init>()V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lcom/zykj/lib/login/proto/RoleType;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 88
    .line 89
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
    iput p3, p0, Lcom/zykj/lib/login/proto/RoleType;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/zykj/lib/login/proto/RoleType;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/16 v0, 0x9

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x14

    .line 17
    .line 18
    if-eq p0, v0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->SuperAdministrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->Administrator:Lcom/zykj/lib/login/proto/RoleType;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->Parent:Lcom/zykj/lib/login/proto/RoleType;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_4
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_5
    sget-object p0, Lcom/zykj/lib/login/proto/RoleType;->Default:Lcom/zykj/lib/login/proto/RoleType;

    .line 38
    .line 39
    return-object p0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/zykj/lib/login/proto/RoleType;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static internalGetVerifier()Lcom/google/protobuf/Internal$EnumVerifier;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType$RoleTypeVerifier;->INSTANCE:Lcom/google/protobuf/Internal$EnumVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/zykj/lib/login/proto/RoleType;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/zykj/lib/login/proto/RoleType;->forNumber(I)Lcom/zykj/lib/login/proto/RoleType;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/lib/login/proto/RoleType;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/lib/login/proto/RoleType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/login/proto/RoleType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/lib/login/proto/RoleType;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->$VALUES:[Lcom/zykj/lib/login/proto/RoleType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/zykj/lib/login/proto/RoleType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/zykj/lib/login/proto/RoleType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->UNRECOGNIZED:Lcom/zykj/lib/login/proto/RoleType;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/lib/login/proto/RoleType;->value:I

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
