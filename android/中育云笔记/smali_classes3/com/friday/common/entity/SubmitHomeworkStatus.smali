.class public final enum Lcom/friday/common/entity/SubmitHomeworkStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/common/entity/SubmitHomeworkStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lyc/a;

.field private static final synthetic $VALUES:[Lcom/friday/common/entity/SubmitHomeworkStatus;

.field public static final enum END_CLASS:Lcom/friday/common/entity/SubmitHomeworkStatus;

.field public static final enum ID_ERROR:Lcom/friday/common/entity/SubmitHomeworkStatus;

.field public static final enum NORMAL:Lcom/friday/common/entity/SubmitHomeworkStatus;

.field public static final enum TIME_UP:Lcom/friday/common/entity/SubmitHomeworkStatus;


# direct methods
.method private static final synthetic $values()[Lcom/friday/common/entity/SubmitHomeworkStatus;
    .locals 4

    sget-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->NORMAL:Lcom/friday/common/entity/SubmitHomeworkStatus;

    sget-object v1, Lcom/friday/common/entity/SubmitHomeworkStatus;->TIME_UP:Lcom/friday/common/entity/SubmitHomeworkStatus;

    sget-object v2, Lcom/friday/common/entity/SubmitHomeworkStatus;->END_CLASS:Lcom/friday/common/entity/SubmitHomeworkStatus;

    sget-object v3, Lcom/friday/common/entity/SubmitHomeworkStatus;->ID_ERROR:Lcom/friday/common/entity/SubmitHomeworkStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/friday/common/entity/SubmitHomeworkStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 2
    .line 3
    const-string v1, "NORMAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/SubmitHomeworkStatus;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->NORMAL:Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 12
    .line 13
    const-string v1, "TIME_UP"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/SubmitHomeworkStatus;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->TIME_UP:Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 22
    .line 23
    const-string v1, "END_CLASS"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/SubmitHomeworkStatus;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->END_CLASS:Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 30
    .line 31
    new-instance v0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 32
    .line 33
    const-string v1, "ID_ERROR"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/SubmitHomeworkStatus;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->ID_ERROR:Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 40
    .line 41
    invoke-static {}, Lcom/friday/common/entity/SubmitHomeworkStatus;->$values()[Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->$VALUES:[Lcom/friday/common/entity/SubmitHomeworkStatus;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->$ENTRIES:Lyc/a;

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

.method public static getEntries()Lyc/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->$ENTRIES:Lyc/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/common/entity/SubmitHomeworkStatus;
    .locals 1

    const-class v0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/common/entity/SubmitHomeworkStatus;

    return-object p0
.end method

.method public static values()[Lcom/friday/common/entity/SubmitHomeworkStatus;
    .locals 1

    sget-object v0, Lcom/friday/common/entity/SubmitHomeworkStatus;->$VALUES:[Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/common/entity/SubmitHomeworkStatus;

    return-object v0
.end method
