.class public final enum Lcom/zykj/blackboard/enums/DocumentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/blackboard/enums/DocumentType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/zykj/blackboard/enums/DocumentType;

.field public static final enum d:Lcom/zykj/blackboard/enums/DocumentType;

.field public static final synthetic e:[Lcom/zykj/blackboard/enums/DocumentType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/blackboard/enums/DocumentType;

    .line 2
    .line 3
    const-string v1, "IMAGE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/blackboard/enums/DocumentType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/blackboard/enums/DocumentType;->c:Lcom/zykj/blackboard/enums/DocumentType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/blackboard/enums/DocumentType;

    .line 12
    .line 13
    const-string v1, "AUDIO"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/blackboard/enums/DocumentType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/blackboard/enums/DocumentType;->a()[Lcom/zykj/blackboard/enums/DocumentType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/blackboard/enums/DocumentType;->e:[Lcom/zykj/blackboard/enums/DocumentType;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/blackboard/enums/DocumentType;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/DocumentType;->c:Lcom/zykj/blackboard/enums/DocumentType;

    sget-object v1, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    filled-new-array {v0, v1}, [Lcom/zykj/blackboard/enums/DocumentType;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/blackboard/enums/DocumentType;
    .locals 1

    const-class v0, Lcom/zykj/blackboard/enums/DocumentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/blackboard/enums/DocumentType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/blackboard/enums/DocumentType;
    .locals 1

    sget-object v0, Lcom/zykj/blackboard/enums/DocumentType;->e:[Lcom/zykj/blackboard/enums/DocumentType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/blackboard/enums/DocumentType;

    return-object v0
.end method
