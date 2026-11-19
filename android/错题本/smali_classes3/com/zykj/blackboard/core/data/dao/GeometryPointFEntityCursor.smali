.class public final Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$GeometryPointFEntityIdGetter;

.field private static final __ID_recordId:I

.field private static final __ID_x:I

.field private static final __ID_y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$GeometryPointFEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$GeometryPointFEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->x:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_x:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->y:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_y:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->recordId:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_recordId:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/objectbox/Cursor;-><init>(Lio/objectbox/Transaction;JLio/objectbox/EntityInfo;Lio/objectbox/BoxStore;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$GeometryPointFEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$GeometryPointFEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->internalRequiresPutTarget()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 5
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->internalPutTarget(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 7
    throw v0

    .line 8
    :cond_0
    :goto_0
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getId()J

    move-result-wide v6

    sget v9, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_recordId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTargetId()J

    move-result-wide v10

    sget v15, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_x:I

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getX()F

    move-result v16

    sget v17, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->__ID_y:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getY()F

    move-result v18

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/4 v8, 0x3

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    .line 11
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    move-result-wide v2

    .line 12
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->setId(J)V

    .line 13
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    move-result-wide v0

    return-wide v0
.end method
