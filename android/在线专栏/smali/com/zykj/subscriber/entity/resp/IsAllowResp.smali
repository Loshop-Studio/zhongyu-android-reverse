.class public final Lcom/zykj/subscriber/entity/resp/IsAllowResp;
.super Lcom/zykj/subscriber/entity/resp/ApiResp;
.source "SourceFile"


# instance fields
.field private result:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/entity/resp/ApiResp;-><init>()V

    return-void
.end method


# virtual methods
.method public final getResult()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/subscriber/entity/resp/IsAllowResp;->result:Z

    return v0
.end method

.method public final setResult(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/subscriber/entity/resp/IsAllowResp;->result:Z

    return-void
.end method
