.class public final enum Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\u0008\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;",
        "",
        "SELECT",
        "PEN",
        "LINE",
        "DOTTED_LINE",
        "ERASER",
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
.field public static final enum DOTTED_LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final enum ERASER:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final enum LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final enum PEN:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final enum SELECT:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final synthetic a:[Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public static final synthetic b:Lj6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 2
    .line 3
    const-string v1, "SELECT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->SELECT:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 12
    .line 13
    const-string v2, "PEN"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->PEN:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 22
    .line 23
    const-string v3, "LINE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 32
    .line 33
    const-string v4, "DOTTED_LINE"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->DOTTED_LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 40
    .line 41
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 42
    .line 43
    const-string v5, "ERASER"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->ERASER:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->a:[Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->b:Lj6/a;

    .line 62
    .line 63
    return-void
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
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->b:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;
    .locals 1

    const-class v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    return-object p0
.end method

.method public static values()[Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;
    .locals 1

    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->a:[Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    return-object v0
.end method
