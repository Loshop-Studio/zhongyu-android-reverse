.class public final enum Lcom/zykj/study/bean/ScanResultType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/study/bean/ScanResultType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/zykj/study/bean/ScanResultType;

.field public static final enum CREATE_MICRO:Lcom/zykj/study/bean/ScanResultType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "1"
    .end annotation
.end field

.field public static final enum EDIT:Lcom/zykj/study/bean/ScanResultType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "0"
    .end annotation

    .annotation runtime Lh7/a;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/zykj/study/bean/ScanResultType;
    .locals 2

    sget-object v0, Lcom/zykj/study/bean/ScanResultType;->EDIT:Lcom/zykj/study/bean/ScanResultType;

    sget-object v1, Lcom/zykj/study/bean/ScanResultType;->CREATE_MICRO:Lcom/zykj/study/bean/ScanResultType;

    filled-new-array {v0, v1}, [Lcom/zykj/study/bean/ScanResultType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/bean/ScanResultType;

    .line 2
    .line 3
    const-string v1, "EDIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/ScanResultType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/study/bean/ScanResultType;->EDIT:Lcom/zykj/study/bean/ScanResultType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/study/bean/ScanResultType;

    .line 12
    .line 13
    const-string v1, "CREATE_MICRO"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/ScanResultType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/study/bean/ScanResultType;->CREATE_MICRO:Lcom/zykj/study/bean/ScanResultType;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/study/bean/ScanResultType;->$values()[Lcom/zykj/study/bean/ScanResultType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/study/bean/ScanResultType;->$VALUES:[Lcom/zykj/study/bean/ScanResultType;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/zykj/study/bean/ScanResultType;->$ENTRIES:Lp7/a;

    .line 32
    .line 33
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
    sget-object v0, Lcom/zykj/study/bean/ScanResultType;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/study/bean/ScanResultType;
    .locals 1

    const-class v0, Lcom/zykj/study/bean/ScanResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/bean/ScanResultType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/study/bean/ScanResultType;
    .locals 1

    sget-object v0, Lcom/zykj/study/bean/ScanResultType;->$VALUES:[Lcom/zykj/study/bean/ScanResultType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/study/bean/ScanResultType;

    return-object v0
.end method
