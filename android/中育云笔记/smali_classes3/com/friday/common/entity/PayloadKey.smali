.class public final enum Lcom/friday/common/entity/PayloadKey;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/common/entity/PayloadKey;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lyc/a;

.field private static final synthetic $VALUES:[Lcom/friday/common/entity/PayloadKey;

.field public static final enum IN_CLASS:Lcom/friday/common/entity/PayloadKey;

.field public static final enum SELECTED:Lcom/friday/common/entity/PayloadKey;

.field public static final enum THUMBNAIL:Lcom/friday/common/entity/PayloadKey;


# direct methods
.method private static final synthetic $values()[Lcom/friday/common/entity/PayloadKey;
    .locals 3

    sget-object v0, Lcom/friday/common/entity/PayloadKey;->SELECTED:Lcom/friday/common/entity/PayloadKey;

    sget-object v1, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    sget-object v2, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    filled-new-array {v0, v1, v2}, [Lcom/friday/common/entity/PayloadKey;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/common/entity/PayloadKey;

    .line 2
    .line 3
    const-string v1, "SELECTED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/PayloadKey;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/common/entity/PayloadKey;->SELECTED:Lcom/friday/common/entity/PayloadKey;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/common/entity/PayloadKey;

    .line 12
    .line 13
    const-string v1, "IN_CLASS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/PayloadKey;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/common/entity/PayloadKey;

    .line 22
    .line 23
    const-string v1, "THUMBNAIL"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/PayloadKey;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 30
    .line 31
    invoke-static {}, Lcom/friday/common/entity/PayloadKey;->$values()[Lcom/friday/common/entity/PayloadKey;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/friday/common/entity/PayloadKey;->$VALUES:[Lcom/friday/common/entity/PayloadKey;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/friday/common/entity/PayloadKey;->$ENTRIES:Lyc/a;

    .line 42
    .line 43
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
    sget-object v0, Lcom/friday/common/entity/PayloadKey;->$ENTRIES:Lyc/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/common/entity/PayloadKey;
    .locals 1

    const-class v0, Lcom/friday/common/entity/PayloadKey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/common/entity/PayloadKey;

    return-object p0
.end method

.method public static values()[Lcom/friday/common/entity/PayloadKey;
    .locals 1

    sget-object v0, Lcom/friday/common/entity/PayloadKey;->$VALUES:[Lcom/friday/common/entity/PayloadKey;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/common/entity/PayloadKey;

    return-object v0
.end method
