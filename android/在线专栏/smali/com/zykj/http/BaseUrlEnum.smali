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


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/http/BaseUrlEnum;

.field public static final enum DEFAULT:Lcom/zykj/http/BaseUrlEnum;


# instance fields
.field private url:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/zykj/http/BaseUrlEnum;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/zykj/http/BaseUrlEnum;

    sget-object v1, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/zykj/http/BaseUrlEnum;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const-string v3, "https://hagateway.zykj.org/"

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/http/BaseUrlEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    invoke-static {}, Lcom/zykj/http/BaseUrlEnum;->$values()[Lcom/zykj/http/BaseUrlEnum;

    move-result-object v0

    sput-object v0, Lcom/zykj/http/BaseUrlEnum;->$VALUES:[Lcom/zykj/http/BaseUrlEnum;

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
    iput-object p3, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/http/BaseUrlEnum;->url:Ljava/lang/String;

    return-void
.end method
