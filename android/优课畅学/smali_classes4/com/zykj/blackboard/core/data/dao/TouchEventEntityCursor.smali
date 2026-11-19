.class public final Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;

.field private static final __ID_color:I

.field private static final __ID_itemLength:I

.field private static final __ID_recordId:I

.field private static final __ID_spacing:I

.field private static final __ID_style:I

.field private static final __ID_textSize:I

.field private static final __ID_width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->width:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_width:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->color:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_color:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->spacing:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_spacing:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->itemLength:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_itemLength:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->style:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_style:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->textSize:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_textSize:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->recordId:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_recordId:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$TouchEventEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J
    .locals 63

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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

    sget v9, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_recordId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v10

    sget v12, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_color:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getColor()I

    move-result v2

    int-to-long v13, v2

    sget v15, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_width:I

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getWidth()F

    move-result v16

    sget v17, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_spacing:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getSpacing()F

    move-result v18

    sget v19, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_itemLength:I

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getItemLength()F

    move-result v20

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    .line 12
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 13
    iget-wide v2, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getId()J

    move-result-wide v32

    sget v43, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_style:I

    .line 14
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getStyle()I

    move-result v4

    int-to-long v4, v4

    sget v58, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->__ID_textSize:I

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTextSize()F

    move-result v59

    const/16 v60, 0x0

    const-wide/16 v61, 0x0

    const/16 v34, 0x2

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    move-wide/from16 v30, v2

    move-wide/from16 v44, v4

    .line 16
    invoke-static/range {v30 .. v62}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 17
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->setId(J)V

    .line 18
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)V

    .line 19
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->touchInfoList:Lio/objectbox/relation/ToMany;

    const-class v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    move-result-wide v0

    return-wide v0
.end method
