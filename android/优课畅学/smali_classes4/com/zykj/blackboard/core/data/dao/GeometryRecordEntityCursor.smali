.class public final Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_$GeometryRecordEntityIdGetter;

.field private static final __ID_fileName:I

.field private static final __ID_recordId:I

.field private static final __ID_validate:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_$GeometryRecordEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_$GeometryRecordEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_fileName:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->validate:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_validate:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->recordId:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_recordId:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_$GeometryRecordEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_$GeometryRecordEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)J
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 5
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    move-result-object v10

    const/4 v2, 0x0

    if-eqz v10, :cond_1

    .line 9
    sget v3, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_fileName:I

    move v9, v3

    goto :goto_1

    :cond_1
    move v9, v2

    .line 10
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getValidate()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    .line 11
    sget v2, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_validate:I

    :cond_2
    move v11, v2

    .line 12
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getId()J

    move-result-wide v6

    sget v17, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->__ID_recordId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->record:Lio/objectbox/relation/ToOne;

    .line 13
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v18

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/4 v8, 0x3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    .line 14
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 15
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->setId(J)V

    .line 16
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V

    .line 17
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->geometryInfoEntityList:Lio/objectbox/relation/ToMany;

    const-class v4, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method
