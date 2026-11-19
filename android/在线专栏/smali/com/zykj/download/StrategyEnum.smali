.class public final enum Lcom/zykj/download/StrategyEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/download/StrategyEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/download/StrategyEnum;

.field public static final enum ALI_OSS:Lcom/zykj/download/StrategyEnum;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "OSS"
        }
        value = "AliOss"
    .end annotation
.end field

.field public static final enum GRID_FS:Lcom/zykj/download/StrategyEnum;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "GridFS"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/zykj/download/StrategyEnum;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/zykj/download/StrategyEnum;

    sget-object v1, Lcom/zykj/download/StrategyEnum;->ALI_OSS:Lcom/zykj/download/StrategyEnum;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/zykj/download/StrategyEnum;->GRID_FS:Lcom/zykj/download/StrategyEnum;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/StrategyEnum;

    const-string v1, "ALI_OSS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/download/StrategyEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/download/StrategyEnum;->ALI_OSS:Lcom/zykj/download/StrategyEnum;

    .line 2
    new-instance v0, Lcom/zykj/download/StrategyEnum;

    const-string v1, "GRID_FS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/zykj/download/StrategyEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/download/StrategyEnum;->GRID_FS:Lcom/zykj/download/StrategyEnum;

    invoke-static {}, Lcom/zykj/download/StrategyEnum;->$values()[Lcom/zykj/download/StrategyEnum;

    move-result-object v0

    sput-object v0, Lcom/zykj/download/StrategyEnum;->$VALUES:[Lcom/zykj/download/StrategyEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/download/StrategyEnum;
    .locals 1

    const-class v0, Lcom/zykj/download/StrategyEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/download/StrategyEnum;

    return-object p0
.end method

.method public static values()[Lcom/zykj/download/StrategyEnum;
    .locals 1

    sget-object v0, Lcom/zykj/download/StrategyEnum;->$VALUES:[Lcom/zykj/download/StrategyEnum;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/download/StrategyEnum;

    return-object v0
.end method
