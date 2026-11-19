.class public final Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;
.super Lcom/zykj/mistake/network/ApiResp;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "<init>",
        "()V",
        "result",
        "",
        "getResult",
        "()J",
        "setResult",
        "(J)V",
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
.field private result:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/network/ApiResp;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getResult()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->result:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final setResult(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->result:J

    .line 2
    .line 3
    return-void
.end method
