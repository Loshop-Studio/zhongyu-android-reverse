.class public final enum Lcom/zykj/sketch/core/data/CORNER;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/sketch/core/data/CORNER;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/sketch/core/data/CORNER;

.field public static final enum LEFT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

.field public static final enum LEFT_TOP:Lcom/zykj/sketch/core/data/CORNER;

.field public static final enum RIGHT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

.field public static final enum RIGHT_TOP:Lcom/zykj/sketch/core/data/CORNER;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/sketch/core/data/CORNER;
    .locals 4

    sget-object v0, Lcom/zykj/sketch/core/data/CORNER;->LEFT_TOP:Lcom/zykj/sketch/core/data/CORNER;

    sget-object v1, Lcom/zykj/sketch/core/data/CORNER;->RIGHT_TOP:Lcom/zykj/sketch/core/data/CORNER;

    sget-object v2, Lcom/zykj/sketch/core/data/CORNER;->LEFT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

    sget-object v3, Lcom/zykj/sketch/core/data/CORNER;->RIGHT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/sketch/core/data/CORNER;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/sketch/core/data/CORNER;

    .line 2
    .line 3
    const-string v1, "LEFT_TOP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/sketch/core/data/CORNER;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/sketch/core/data/CORNER;->LEFT_TOP:Lcom/zykj/sketch/core/data/CORNER;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/sketch/core/data/CORNER;

    .line 12
    .line 13
    const-string v1, "RIGHT_TOP"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/sketch/core/data/CORNER;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/sketch/core/data/CORNER;->RIGHT_TOP:Lcom/zykj/sketch/core/data/CORNER;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/sketch/core/data/CORNER;

    .line 22
    .line 23
    const-string v1, "LEFT_BOTTOM"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/zykj/sketch/core/data/CORNER;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/sketch/core/data/CORNER;->LEFT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

    .line 30
    .line 31
    new-instance v0, Lcom/zykj/sketch/core/data/CORNER;

    .line 32
    .line 33
    const-string v1, "RIGHT_BOTTOM"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/zykj/sketch/core/data/CORNER;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/zykj/sketch/core/data/CORNER;->RIGHT_BOTTOM:Lcom/zykj/sketch/core/data/CORNER;

    .line 40
    .line 41
    invoke-static {}, Lcom/zykj/sketch/core/data/CORNER;->$values()[Lcom/zykj/sketch/core/data/CORNER;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/zykj/sketch/core/data/CORNER;->$VALUES:[Lcom/zykj/sketch/core/data/CORNER;

    .line 46
    .line 47
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

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/sketch/core/data/CORNER;
    .locals 1

    const-class v0, Lcom/zykj/sketch/core/data/CORNER;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/core/data/CORNER;

    return-object p0
.end method

.method public static values()[Lcom/zykj/sketch/core/data/CORNER;
    .locals 1

    sget-object v0, Lcom/zykj/sketch/core/data/CORNER;->$VALUES:[Lcom/zykj/sketch/core/data/CORNER;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/sketch/core/data/CORNER;

    return-object v0
.end method
