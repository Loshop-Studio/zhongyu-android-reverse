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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        "",
        "",
        "state",
        "",
        "stateName",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "a",
        "I",
        "getState",
        "()I",
        "setState",
        "(I)V",
        "b",
        "Ljava/lang/String;",
        "getStateName",
        "()Ljava/lang/String;",
        "setStateName",
        "(Ljava/lang/String;)V",
        "c",
        "d",
        "e",
        "f",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum c:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum d:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum e:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final enum f:Lcom/zykj/blackboard/enums/PlayStatus;

.field public static final synthetic g:[Lcom/zykj/blackboard/enums/PlayStatus;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
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
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->c:Lcom/zykj/blackboard/enums/PlayStatus;

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
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->d:Lcom/zykj/blackboard/enums/PlayStatus;

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
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

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
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 48
    .line 49
    invoke-static {}, Lcom/zykj/blackboard/enums/PlayStatus;->a()[Lcom/zykj/blackboard/enums/PlayStatus;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->g:[Lcom/zykj/blackboard/enums/PlayStatus;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/blackboard/enums/PlayStatus;->a:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/blackboard/enums/PlayStatus;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->c:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v2, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    sget-object v3, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/blackboard/enums/PlayStatus;

    move-result-object v0

    return-object v0
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

    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->g:[Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/enums/PlayStatus;

    return-object v0
.end method
