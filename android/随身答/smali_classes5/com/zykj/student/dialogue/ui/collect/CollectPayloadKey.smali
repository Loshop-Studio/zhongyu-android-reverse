.class public final enum Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
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
.field public static final enum a:Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

.field public static final synthetic b:[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    .line 2
    .line 3
    const-string v1, "COLLECT_STATE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->a:Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->a()[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->b:[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->c:Lkotlin/enums/EnumEntries;

    .line 22
    .line 23
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

.method public static final synthetic a()[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->a:Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    filled-new-array {v0}, [Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;
    .locals 1

    const-class v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    return-object p0
.end method

.method public static values()[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;
    .locals 1

    sget-object v0, Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;->b:[Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;

    return-object v0
.end method
