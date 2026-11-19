.class public final Lcom/zykj/mistake/entity/resp/MistakeDetailResp;
.super Lcom/zykj/mistake/network/ApiResp;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeDetailResp;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "<init>",
        "()V",
        "result",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "getResult",
        "()Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "setResult",
        "(Lcom/zykj/mistake/entity/resp/MistakeDetail;)V",
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
.field private result:Lcom/zykj/mistake/entity/resp/MistakeDetail;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    new-instance v0, Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;->result:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getResult()Lcom/zykj/mistake/entity/resp/MistakeDetail;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;->result:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setResult(Lcom/zykj/mistake/entity/resp/MistakeDetail;)V
    .locals 0
    .param p1    # Lcom/zykj/mistake/entity/resp/MistakeDetail;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetailResp;->result:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    return-void
.end method
