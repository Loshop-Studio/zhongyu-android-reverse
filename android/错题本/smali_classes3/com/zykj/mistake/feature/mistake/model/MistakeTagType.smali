.class public final enum Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00022\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;",
        "",
        "Companion",
        "p4/f",
        "RED",
        "GREEN",
        "ORANGE",
        "BLUE",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final enum BLUE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

.field public static final Companion:Lp4/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum GREEN:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

.field public static final enum ORANGE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

.field public static final enum RED:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

.field public static final a:Ljava/lang/Object;

.field public static final synthetic b:[Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

.field public static final synthetic c:Lj6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 2
    .line 3
    const-string v1, "RED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->RED:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 12
    .line 13
    const-string v2, "GREEN"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->GREEN:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 22
    .line 23
    const-string v3, "ORANGE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->ORANGE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 32
    .line 33
    const-string v4, "BLUE"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->BLUE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->b:[Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->c:Lj6/a;

    .line 52
    .line 53
    new-instance v0, Lp4/f;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->Companion:Lp4/f;

    .line 59
    .line 60
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 61
    .line 62
    new-instance v1, Lcom/zykj/view/board/play/b;

    .line 63
    .line 64
    const/16 v2, 0x16

    .line 65
    .line 66
    invoke-direct {v1, v2}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->a:Ljava/lang/Object;

    .line 74
    .line 75
    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ld6/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
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
    sget-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->c:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;
    .locals 1

    const-class v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;
    .locals 1

    sget-object v0, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->b:[Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    return-object v0
.end method
