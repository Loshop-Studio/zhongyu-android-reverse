.class public Lanet/channel/strategy/ConnEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public connTime:J

.field public isAccs:Z

.field public isSuccess:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lanet/channel/strategy/ConnEvent;->isSuccess:Z

    const-wide v1, 0x7fffffffffffffffL

    .line 3
    iput-wide v1, p0, Lanet/channel/strategy/ConnEvent;->connTime:J

    .line 4
    iput-boolean v0, p0, Lanet/channel/strategy/ConnEvent;->isAccs:Z

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lanet/channel/strategy/ConnEvent;->isSuccess:Z

    if-eqz v0, :cond_0

    const-string v0, "ConnEvent#Success"

    goto :goto_0

    :cond_0
    const-string v0, "ConnEvent#Fail"

    :goto_0
    return-object v0
.end method
