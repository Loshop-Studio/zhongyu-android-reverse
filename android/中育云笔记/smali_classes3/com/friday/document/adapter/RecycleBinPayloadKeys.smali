.class public final enum Lcom/friday/document/adapter/RecycleBinPayloadKeys;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/document/adapter/RecycleBinPayloadKeys;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

.field public static final enum d:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

.field public static final synthetic e:[Lcom/friday/document/adapter/RecycleBinPayloadKeys;

.field public static final synthetic f:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 2
    .line 3
    const-string v1, "BACKGROUND"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/document/adapter/RecycleBinPayloadKeys;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->c:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 12
    .line 13
    const-string v1, "EXPIRED_TIME"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/document/adapter/RecycleBinPayloadKeys;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->d:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 20
    .line 21
    invoke-static {}, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->a()[Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->e:[Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->f:Lyc/a;

    .line 32
    .line 33
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

.method public static final synthetic a()[Lcom/friday/document/adapter/RecycleBinPayloadKeys;
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->c:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    sget-object v1, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->d:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    filled-new-array {v0, v1}, [Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/document/adapter/RecycleBinPayloadKeys;
    .locals 1

    const-class v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    return-object p0
.end method

.method public static values()[Lcom/friday/document/adapter/RecycleBinPayloadKeys;
    .locals 1

    sget-object v0, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->e:[Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    return-object v0
.end method
