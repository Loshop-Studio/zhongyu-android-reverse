.class public final enum Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState",
        "",
        "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;",
        "EMPTY",
        "UNCORRECTED",
        "CORRECT",
        "WRONG",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum CORRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public static final enum EMPTY:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public static final enum UNCORRECTED:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public static final enum WRONG:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public static final synthetic a:[Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public static final synthetic b:Lj6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 2
    .line 3
    const-string v1, "EMPTY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->EMPTY:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 12
    .line 13
    const-string v2, "UNCORRECTED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->UNCORRECTED:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 22
    .line 23
    const-string v3, "CORRECT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->CORRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 32
    .line 33
    const-string v4, "WRONG"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->WRONG:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->a:[Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->b:Lj6/a;

    .line 52
    .line 53
    return-void
.end method

.method public static getEntries()Lj6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->b:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;
    .locals 1

    const-class v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    return-object p0
.end method

.method public static values()[Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;
    .locals 1

    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->a:[Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    return-object v0
.end method
