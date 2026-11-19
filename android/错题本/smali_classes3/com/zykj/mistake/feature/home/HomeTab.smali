.class public final enum Lcom/zykj/mistake/feature/home/HomeTab;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/mistake/feature/home/HomeTab;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/home/HomeTab;",
        "",
        "",
        "index",
        "I",
        "getIndex",
        "()I",
        "Companion",
        "com/zykj/mistake/feature/home/l",
        "REVIEW",
        "MISTAKE_NOTEBOOK",
        "MISTAKE_COLLECTION",
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
.field public static final Companion:Lcom/zykj/mistake/feature/home/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum MISTAKE_COLLECTION:Lcom/zykj/mistake/feature/home/HomeTab;

.field public static final enum MISTAKE_NOTEBOOK:Lcom/zykj/mistake/feature/home/HomeTab;

.field public static final enum REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

.field public static final synthetic a:[Lcom/zykj/mistake/feature/home/HomeTab;

.field public static final synthetic b:Lj6/a;


# instance fields
.field private final index:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 2
    .line 3
    const-string v1, "REVIEW"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/mistake/feature/home/HomeTab;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 12
    .line 13
    const-string v2, "MISTAKE_NOTEBOOK"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lcom/zykj/mistake/feature/home/HomeTab;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_NOTEBOOK:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 22
    .line 23
    const-string v3, "MISTAKE_COLLECTION"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lcom/zykj/mistake/feature/home/HomeTab;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_COLLECTION:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lcom/zykj/mistake/feature/home/HomeTab;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->a:[Lcom/zykj/mistake/feature/home/HomeTab;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->b:Lj6/a;

    .line 42
    .line 43
    new-instance v0, Lcom/zykj/mistake/feature/home/l;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->Companion:Lcom/zykj/mistake/feature/home/l;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/mistake/feature/home/HomeTab;->index:I

    .line 5
    .line 6
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
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->b:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/mistake/feature/home/HomeTab;
    .locals 1

    const-class v0, Lcom/zykj/mistake/feature/home/HomeTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/mistake/feature/home/HomeTab;

    return-object p0
.end method

.method public static values()[Lcom/zykj/mistake/feature/home/HomeTab;
    .locals 1

    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->a:[Lcom/zykj/mistake/feature/home/HomeTab;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/mistake/feature/home/HomeTab;

    return-object v0
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/home/HomeTab;->index:I

    .line 2
    .line 3
    return v0
.end method
