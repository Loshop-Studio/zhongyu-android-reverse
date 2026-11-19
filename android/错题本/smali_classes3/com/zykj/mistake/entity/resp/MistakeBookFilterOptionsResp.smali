.class public final Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;
.super Lcom/zykj/mistake/network/ApiResp;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;,
        Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "<init>",
        "()V",
        "result",
        "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;",
        "getResult",
        "()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;",
        "setResult",
        "(Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;)V",
        "FilterOptions",
        "FilterTopic",
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
.field public static final $stable:I = 0x8


# instance fields
.field private result:Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/network/ApiResp;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->result:Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getResult()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->result:Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setResult(Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;)V
    .locals 1
    .param p1    # Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;->result:Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;

    .line 7
    .line 8
    return-void
.end method
