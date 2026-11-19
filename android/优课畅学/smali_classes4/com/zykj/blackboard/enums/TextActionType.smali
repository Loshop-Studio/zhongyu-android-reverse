.class public final enum Lcom/zykj/blackboard/enums/TextActionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/blackboard/enums/TextActionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/blackboard/enums/TextActionType;

.field public static final enum DELETE:Lcom/zykj/blackboard/enums/TextActionType;

.field public static final enum SCALE:Lcom/zykj/blackboard/enums/TextActionType;

.field public static final enum TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;


# instance fields
.field private value:I


# direct methods
.method private static final synthetic $values()[Lcom/zykj/blackboard/enums/TextActionType;
    .locals 3

    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->DELETE:Lcom/zykj/blackboard/enums/TextActionType;

    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    sget-object v2, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/blackboard/enums/TextActionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/blackboard/enums/TextActionType;

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/blackboard/enums/TextActionType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->DELETE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/blackboard/enums/TextActionType;

    .line 12
    .line 13
    const-string v1, "TRANSLATE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/blackboard/enums/TextActionType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->TRANSLATE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/blackboard/enums/TextActionType;

    .line 22
    .line 23
    const-string v1, "SCALE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/blackboard/enums/TextActionType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->SCALE:Lcom/zykj/blackboard/enums/TextActionType;

    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/blackboard/enums/TextActionType;->$values()[Lcom/zykj/blackboard/enums/TextActionType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->$VALUES:[Lcom/zykj/blackboard/enums/TextActionType;

    .line 36
    .line 37
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
    iput p3, p0, Lcom/zykj/blackboard/enums/TextActionType;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/blackboard/enums/TextActionType;
    .locals 1

    const-class v0, Lcom/zykj/blackboard/enums/TextActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/blackboard/enums/TextActionType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/blackboard/enums/TextActionType;
    .locals 1

    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->$VALUES:[Lcom/zykj/blackboard/enums/TextActionType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/enums/TextActionType;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/enums/TextActionType;->value:I

    .line 2
    .line 3
    return v0
.end method

.method public final setValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/enums/TextActionType;->value:I

    .line 2
    .line 3
    return-void
.end method
