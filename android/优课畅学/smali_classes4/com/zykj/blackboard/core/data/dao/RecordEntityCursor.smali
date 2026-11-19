.class public final Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$RecordEntityIdGetter;

.field private static final __ID_pageId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$RecordEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$RecordEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->pageId:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->__ID_pageId:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/RecordEntity_$RecordEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$RecordEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)J
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->page:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getId()J

    move-result-wide v6

    sget v17, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->__ID_pageId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->page:Lio/objectbox/relation/ToOne;

    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v18

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    .line 10
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 11
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->setId(J)V

    .line 12
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 13
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->commandList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 14
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->fileList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 15
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->touchList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 16
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->matrixList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 17
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->audioList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 18
    iget-object v4, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->textList:Lio/objectbox/relation/ToMany;

    const-class v5, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    invoke-virtual {v1, v4, v5}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    .line 19
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->geometryList:Lio/objectbox/relation/ToMany;

    const-class v4, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)J

    move-result-wide v0

    return-wide v0
.end method
