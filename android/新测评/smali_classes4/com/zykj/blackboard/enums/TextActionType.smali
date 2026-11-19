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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/zykj/blackboard/enums/TextActionType;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "a",
        "I",
        "f",
        "()I",
        "setValue",
        "(I)V",
        "b",
        "c",
        "d",
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
.field public static final enum b:Lcom/zykj/blackboard/enums/TextActionType;

.field public static final enum c:Lcom/zykj/blackboard/enums/TextActionType;

.field public static final enum d:Lcom/zykj/blackboard/enums/TextActionType;

.field public static final synthetic e:[Lcom/zykj/blackboard/enums/TextActionType;


# instance fields
.field public a:I


# direct methods
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
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->b:Lcom/zykj/blackboard/enums/TextActionType;

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
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->c:Lcom/zykj/blackboard/enums/TextActionType;

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
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->d:Lcom/zykj/blackboard/enums/TextActionType;

    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/blackboard/enums/TextActionType;->a()[Lcom/zykj/blackboard/enums/TextActionType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/blackboard/enums/TextActionType;->e:[Lcom/zykj/blackboard/enums/TextActionType;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/blackboard/enums/TextActionType;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/blackboard/enums/TextActionType;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->b:Lcom/zykj/blackboard/enums/TextActionType;

    sget-object v1, Lcom/zykj/blackboard/enums/TextActionType;->c:Lcom/zykj/blackboard/enums/TextActionType;

    sget-object v2, Lcom/zykj/blackboard/enums/TextActionType;->d:Lcom/zykj/blackboard/enums/TextActionType;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/blackboard/enums/TextActionType;

    move-result-object v0

    return-object v0
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

    sget-object v0, Lcom/zykj/blackboard/enums/TextActionType;->e:[Lcom/zykj/blackboard/enums/TextActionType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/enums/TextActionType;

    return-object v0
.end method


# virtual methods
.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/enums/TextActionType;->a:I

    .line 2
    .line 3
    return v0
.end method
