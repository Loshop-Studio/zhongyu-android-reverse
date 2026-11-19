.class final Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TouchEventEntityIdGetter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln6/c;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getId(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    move-result-wide v0

    return-wide v0
.end method
