.class public abstract enum Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

.field public static final enum INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
    .locals 1

    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    filled-new-array {v0}, [Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->$values()[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->$VALUES:[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
    .locals 1

    const-class v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    return-object p0
.end method

.method public static values()[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
    .locals 1

    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->$VALUES:[Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    return-object v0
.end method


# virtual methods
.method public abstract parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;
.end method
