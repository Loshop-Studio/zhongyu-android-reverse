.class public final Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

.field private static final __ID_color:I

.field private static final __ID_content:I

.field private static final __ID_recordId:I

.field private static final __ID_style:I

.field private static final __ID_textSize:I

.field private static final __ID_width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->width:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_width:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->color:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_color:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->textSize:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_textSize:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->style:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_style:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->content:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_content:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->recordId:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_recordId:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J
    .locals 70

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->internalRequiresPutTarget()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getContent()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_1

    .line 9
    sget v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_content:I

    :goto_1
    move v9, v2

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 10
    :goto_2
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    sget v17, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_recordId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 11
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTargetId()J

    move-result-wide v18

    sget v20, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_color:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getColor()I

    move-result v2

    int-to-long v2, v2

    sget v23, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_style:I

    .line 12
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getStyle()I

    move-result v6

    int-to-long v6, v6

    sget v32, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_width:I

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getWidth()F

    move-result v33

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    move-wide/from16 v24, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-wide/from16 v21, v2

    .line 14
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 15
    iget-wide v2, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getId()J

    move-result-wide v39

    sget v65, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->__ID_textSize:I

    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getTextSize()F

    move-result v66

    const/16 v67, 0x0

    const-wide/16 v68, 0x0

    const/16 v41, 0x2

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    move-wide/from16 v37, v2

    .line 17
    invoke-static/range {v37 .. v69}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 18
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->setId(J)V

    .line 19
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method
