.class public final enum Lcom/zykj/study/bean/exercise/ChoiceStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/study/bean/exercise/ChoiceStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/zykj/study/bean/exercise/ChoiceStatus;

.field public static final enum CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

.field public static final enum ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

.field public static final enum NULL:Lcom/zykj/study/bean/exercise/ChoiceStatus;

.field public static final enum RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

.field public static final enum SELECTED:Lcom/zykj/study/bean/exercise/ChoiceStatus;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/study/bean/exercise/ChoiceStatus;
    .locals 5

    sget-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    sget-object v1, Lcom/zykj/study/bean/exercise/ChoiceStatus;->NULL:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    sget-object v2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->SELECTED:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    sget-object v3, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    sget-object v4, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/zykj/study/bean/exercise/ChoiceStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 2
    .line 3
    const-string v1, "CUSTOM"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/exercise/ChoiceStatus;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 12
    .line 13
    const-string v1, "NULL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/exercise/ChoiceStatus;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->NULL:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 22
    .line 23
    const-string v1, "SELECTED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/exercise/ChoiceStatus;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->SELECTED:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 30
    .line 31
    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 32
    .line 33
    const-string v1, "RIGHT"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/exercise/ChoiceStatus;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 40
    .line 41
    new-instance v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 42
    .line 43
    const-string v1, "ERROR"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/exercise/ChoiceStatus;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 50
    .line 51
    invoke-static {}, Lcom/zykj/study/bean/exercise/ChoiceStatus;->$values()[Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->$VALUES:[Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->$ENTRIES:Lp7/a;

    .line 62
    .line 63
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
    sget-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/study/bean/exercise/ChoiceStatus;
    .locals 1

    const-class v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/bean/exercise/ChoiceStatus;

    return-object p0
.end method

.method public static values()[Lcom/zykj/study/bean/exercise/ChoiceStatus;
    .locals 1

    sget-object v0, Lcom/zykj/study/bean/exercise/ChoiceStatus;->$VALUES:[Lcom/zykj/study/bean/exercise/ChoiceStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/study/bean/exercise/ChoiceStatus;

    return-object v0
.end method
