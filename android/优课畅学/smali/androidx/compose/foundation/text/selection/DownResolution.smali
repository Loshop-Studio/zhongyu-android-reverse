.class final enum Landroidx/compose/foundation/text/selection/DownResolution;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/compose/foundation/text/selection/DownResolution;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Landroidx/compose/foundation/text/selection/DownResolution;

.field public static final enum Cancel:Landroidx/compose/foundation/text/selection/DownResolution;

.field public static final enum Drag:Landroidx/compose/foundation/text/selection/DownResolution;

.field public static final enum Timeout:Landroidx/compose/foundation/text/selection/DownResolution;

.field public static final enum Up:Landroidx/compose/foundation/text/selection/DownResolution;


# direct methods
.method private static final synthetic $values()[Landroidx/compose/foundation/text/selection/DownResolution;
    .locals 4

    sget-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->Up:Landroidx/compose/foundation/text/selection/DownResolution;

    sget-object v1, Landroidx/compose/foundation/text/selection/DownResolution;->Drag:Landroidx/compose/foundation/text/selection/DownResolution;

    sget-object v2, Landroidx/compose/foundation/text/selection/DownResolution;->Timeout:Landroidx/compose/foundation/text/selection/DownResolution;

    sget-object v3, Landroidx/compose/foundation/text/selection/DownResolution;->Cancel:Landroidx/compose/foundation/text/selection/DownResolution;

    filled-new-array {v0, v1, v2, v3}, [Landroidx/compose/foundation/text/selection/DownResolution;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 2
    .line 3
    const-string v1, "Up"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/DownResolution;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->Up:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 12
    .line 13
    const-string v1, "Drag"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/DownResolution;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->Drag:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 20
    .line 21
    new-instance v0, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 22
    .line 23
    const-string v1, "Timeout"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/DownResolution;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->Timeout:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 30
    .line 31
    new-instance v0, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 32
    .line 33
    const-string v1, "Cancel"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/DownResolution;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->Cancel:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 40
    .line 41
    invoke-static {}, Landroidx/compose/foundation/text/selection/DownResolution;->$values()[Landroidx/compose/foundation/text/selection/DownResolution;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->$VALUES:[Landroidx/compose/foundation/text/selection/DownResolution;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->$ENTRIES:Lp7/a;

    .line 52
    .line 53
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

.method public static getEntries()Lp7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp7/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/compose/foundation/text/selection/DownResolution;
    .locals 1

    const-class v0, Landroidx/compose/foundation/text/selection/DownResolution;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/text/selection/DownResolution;

    return-object p0
.end method

.method public static values()[Landroidx/compose/foundation/text/selection/DownResolution;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text/selection/DownResolution;->$VALUES:[Landroidx/compose/foundation/text/selection/DownResolution;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/compose/foundation/text/selection/DownResolution;

    return-object v0
.end method
