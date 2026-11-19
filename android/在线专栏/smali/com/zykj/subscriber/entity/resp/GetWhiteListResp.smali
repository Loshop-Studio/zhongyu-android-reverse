.class public final Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;
.super Lcom/zykj/subscriber/entity/resp/ApiResp;
.source "SourceFile"


# instance fields
.field private result:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/subscriber/entity/resp/ApiResp;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;->result:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getResult()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;->result:Ljava/lang/String;

    return-object v0
.end method

.method public final setResult(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;->result:Ljava/lang/String;

    return-void
.end method
