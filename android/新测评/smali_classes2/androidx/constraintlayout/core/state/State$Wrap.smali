.class public final enum Landroidx/constraintlayout/core/state/State$Wrap;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/state/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Wrap"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/constraintlayout/core/state/State$Wrap;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/constraintlayout/core/state/State$Wrap;

.field public static final enum ALIGNED:Landroidx/constraintlayout/core/state/State$Wrap;

.field public static final enum CHAIN:Landroidx/constraintlayout/core/state/State$Wrap;

.field public static final enum NONE:Landroidx/constraintlayout/core/state/State$Wrap;

.field public static valueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static wrapMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/core/state/State$Wrap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static synthetic $values()[Landroidx/constraintlayout/core/state/State$Wrap;
    .locals 3

    .line 1
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->NONE:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/core/state/State$Wrap;->CHAIN:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 4
    .line 5
    sget-object v2, Landroidx/constraintlayout/core/state/State$Wrap;->ALIGNED:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Landroidx/constraintlayout/core/state/State$Wrap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/core/state/State$Wrap;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->NONE:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 10
    .line 11
    new-instance v1, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 12
    .line 13
    const-string v3, "CHAIN"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Landroidx/constraintlayout/core/state/State$Wrap;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Landroidx/constraintlayout/core/state/State$Wrap;->CHAIN:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 20
    .line 21
    new-instance v3, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 22
    .line 23
    const-string v4, "ALIGNED"

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v3, v4, v5}, Landroidx/constraintlayout/core/state/State$Wrap;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Landroidx/constraintlayout/core/state/State$Wrap;->ALIGNED:Landroidx/constraintlayout/core/state/State$Wrap;

    .line 30
    .line 31
    invoke-static {}, Landroidx/constraintlayout/core/state/State$Wrap;->$values()[Landroidx/constraintlayout/core/state/State$Wrap;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    sput-object v4, Landroidx/constraintlayout/core/state/State$Wrap;->$VALUES:[Landroidx/constraintlayout/core/state/State$Wrap;

    .line 36
    .line 37
    new-instance v4, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v4, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 43
    .line 44
    new-instance v4, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v4, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 50
    .line 51
    sget-object v4, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 52
    .line 53
    const-string/jumbo v6, "none"

    .line 54
    .line 55
    .line 56
    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 60
    .line 61
    const-string v4, "chain"

    .line 62
    .line 63
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 67
    .line 68
    const-string v1, "aligned"

    .line 69
    .line 70
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v0, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 83
    .line 84
    const/4 v2, 0x3

    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 93
    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getChainByString(Ljava/lang/String;)Landroidx/constraintlayout/core/state/State$Wrap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->wrapMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static getValueByString(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->valueMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, -0x1

    .line 23
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/constraintlayout/core/state/State$Wrap;
    .locals 1

    .line 1
    const-class v0, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/constraintlayout/core/state/State$Wrap;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroidx/constraintlayout/core/state/State$Wrap;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/core/state/State$Wrap;->$VALUES:[Landroidx/constraintlayout/core/state/State$Wrap;

    .line 2
    .line 3
    invoke-virtual {v0}, [Landroidx/constraintlayout/core/state/State$Wrap;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroidx/constraintlayout/core/state/State$Wrap;

    .line 8
    .line 9
    return-object v0
.end method
