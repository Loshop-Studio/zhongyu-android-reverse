.class public final enum Lcom/zykj/http/BaseUrlEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/http/BaseUrlEnum;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zykj/http/BaseUrlEnum;",
        "",
        "url",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getUrl",
        "()Ljava/lang/String;",
        "setUrl",
        "(Ljava/lang/String;)V",
        "DEFAULT",
        "SPARE",
        "http_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/http/BaseUrlEnum;

.field public static final enum DEFAULT:Lcom/zykj/http/BaseUrlEnum;

.field public static final enum SPARE:Lcom/zykj/http/BaseUrlEnum;


# instance fields
.field private url:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/http/BaseUrlEnum;
    .locals 2

    sget-object v0, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    sget-object v1, Lcom/zykj/http/BaseUrlEnum;->SPARE:Lcom/zykj/http/BaseUrlEnum;

    filled-new-array {v0, v1}, [Lcom/zykj/http/BaseUrlEnum;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/http/BaseUrlEnum;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "https://hagateway.zykj.org/"

    .line 5
    .line 6
    const-string v3, "DEFAULT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/http/BaseUrlEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/http/BaseUrlEnum;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "https://gateway.zykjyx.cn/"

    .line 17
    .line 18
    const-string v3, "SPARE"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/zykj/http/BaseUrlEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/zykj/http/BaseUrlEnum;->SPARE:Lcom/zykj/http/BaseUrlEnum;

    .line 24
    .line 25
    invoke-static {}, Lcom/zykj/http/BaseUrlEnum;->$values()[Lcom/zykj/http/BaseUrlEnum;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/zykj/http/BaseUrlEnum;->$VALUES:[Lcom/zykj/http/BaseUrlEnum;

    .line 30
    .line 31
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/http/BaseUrlEnum;
    .locals 1

    const-class v0, Lcom/zykj/http/BaseUrlEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/http/BaseUrlEnum;

    return-object p0
.end method

.method public static values()[Lcom/zykj/http/BaseUrlEnum;
    .locals 1

    sget-object v0, Lcom/zykj/http/BaseUrlEnum;->$VALUES:[Lcom/zykj/http/BaseUrlEnum;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/http/BaseUrlEnum;

    return-object v0
.end method


# virtual methods
.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
