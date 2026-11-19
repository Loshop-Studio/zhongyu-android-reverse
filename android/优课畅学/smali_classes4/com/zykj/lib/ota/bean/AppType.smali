.class public final enum Lcom/zykj/lib/ota/bean/AppType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/lib/ota/bean/AppType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/zykj/lib/ota/bean/AppType;

.field public static final enum STUDENT:Lcom/zykj/lib/ota/bean/AppType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "0"
    .end annotation
.end field

.field public static final enum TEACHER:Lcom/zykj/lib/ota/bean/AppType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "1"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/zykj/lib/ota/bean/AppType;
    .locals 2

    sget-object v0, Lcom/zykj/lib/ota/bean/AppType;->STUDENT:Lcom/zykj/lib/ota/bean/AppType;

    sget-object v1, Lcom/zykj/lib/ota/bean/AppType;->TEACHER:Lcom/zykj/lib/ota/bean/AppType;

    filled-new-array {v0, v1}, [Lcom/zykj/lib/ota/bean/AppType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/lib/ota/bean/AppType;

    .line 2
    .line 3
    const-string v1, "STUDENT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/lib/ota/bean/AppType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/lib/ota/bean/AppType;->STUDENT:Lcom/zykj/lib/ota/bean/AppType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/lib/ota/bean/AppType;

    .line 12
    .line 13
    const-string v1, "TEACHER"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/lib/ota/bean/AppType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/lib/ota/bean/AppType;->TEACHER:Lcom/zykj/lib/ota/bean/AppType;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/lib/ota/bean/AppType;->$values()[Lcom/zykj/lib/ota/bean/AppType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/lib/ota/bean/AppType;->$VALUES:[Lcom/zykj/lib/ota/bean/AppType;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/zykj/lib/ota/bean/AppType;->$ENTRIES:Lp7/a;

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
    sget-object v0, Lcom/zykj/lib/ota/bean/AppType;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/lib/ota/bean/AppType;
    .locals 1

    const-class v0, Lcom/zykj/lib/ota/bean/AppType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/lib/ota/bean/AppType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/lib/ota/bean/AppType;
    .locals 1

    sget-object v0, Lcom/zykj/lib/ota/bean/AppType;->$VALUES:[Lcom/zykj/lib/ota/bean/AppType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/lib/ota/bean/AppType;

    return-object v0
.end method
