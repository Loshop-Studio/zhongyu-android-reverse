.class final Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$FileRecordEntityIdGetter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FileRecordEntityIdGetter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm5/b;"
    }
.end annotation

.annotation build Lio/objectbox/annotation/apihint/Internal;
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
.method public getId(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$FileRecordEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method
