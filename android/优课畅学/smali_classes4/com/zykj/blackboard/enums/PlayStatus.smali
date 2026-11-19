.class public final enum Lcom/zykj/blackboard/enums/PlayStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;


# instance fields
.field private state:I

.field private stateName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 4

    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v2, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v3, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/blackboard/enums/PlayStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u5f55\u5236\u5f00\u59cb"

    .line 5
    .line 6
    const-string v3, "RECORD_START"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/blackboard/enums/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/blackboard/enums/PlayStatus;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "\u5f55\u5236\u6682\u505c"

    .line 17
    .line 18
    const-string v3, "RECORD_PAUSE"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/blackboard/enums/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/enums/PlayStatus;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "\u5f55\u5236\u7ee7\u7eed"

    .line 29
    .line 30
    const-string v3, "RECORD_RESUME"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/blackboard/enums/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 36
    .line 37
    new-instance v0, Lcom/zykj/blackboard/enums/PlayStatus;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "\u5f55\u5236\u7ed3\u675f"

    .line 41
    .line 42
    const-string v3, "RECORD_END"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/blackboard/enums/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 48
    .line 49
    invoke-static {}, Lcom/zykj/blackboard/enums/PlayStatus;->$values()[Lcom/zykj/blackboard/enums/PlayStatus;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->$VALUES:[Lcom/zykj/blackboard/enums/PlayStatus;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/blackboard/enums/PlayStatus;->state:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/blackboard/enums/PlayStatus;->stateName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    const-class v0, Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/blackboard/enums/PlayStatus;

    return-object p0
.end method

.method public static values()[Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->$VALUES:[Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/enums/PlayStatus;

    return-object v0
.end method


# virtual methods
.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/enums/PlayStatus;->state:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStateName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/enums/PlayStatus;->stateName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setState(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/enums/PlayStatus;->state:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStateName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/enums/PlayStatus;->stateName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
