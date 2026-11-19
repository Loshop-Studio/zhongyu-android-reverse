.class public final Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

.field private static final __ID_authorId:I

.field private static final __ID_authorName:I

.field private static final __ID_duration:I

.field private static final __ID_schoolId:I

.field private static final __ID_startTime:I

.field private static final __ID_url:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->authorName:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_authorName:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->authorId:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_authorId:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->schoolId:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_schoolId:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->url:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_url:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->startTime:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_startTime:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->duration:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_duration:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

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


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J
    .locals 32

    move-object/from16 v0, p0

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getAuthorName()Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x0

    if-eqz v7, :cond_0

    .line 3
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_authorName:I

    move v6, v1

    goto :goto_0

    :cond_0
    move v6, v14

    .line 4
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getAuthorId()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_1

    .line 5
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_authorId:I

    move v8, v1

    goto :goto_1

    :cond_1
    move v8, v14

    .line 6
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getSchoolId()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 7
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_schoolId:I

    move v10, v1

    goto :goto_2

    :cond_2
    move v10, v14

    .line 8
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getUrl()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_3

    .line 9
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_url:I

    move v12, v1

    goto :goto_3

    :cond_3
    move v12, v14

    .line 10
    :goto_3
    iget-wide v1, v0, Lio/objectbox/Cursor;->cursor:J

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    invoke-static/range {v1 .. v13}, Lio/objectbox/Cursor;->collect400000(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)J

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getStartTime()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 12
    sget v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_startTime:I

    move/from16 v20, v2

    goto :goto_4

    :cond_4
    move/from16 v20, v14

    .line 13
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getDuration()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 14
    sget v14, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->__ID_duration:I

    :cond_5
    move/from16 v23, v14

    .line 15
    iget-wide v3, v0, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->getId()J

    move-result-wide v17

    const-wide/16 v5, 0x0

    if-eqz v20, :cond_6

    .line 16
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    move-wide/from16 v21, v7

    goto :goto_5

    :cond_6
    move-wide/from16 v21, v5

    :goto_5
    if-eqz v23, :cond_7

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :cond_7
    move-wide/from16 v24, v5

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v19, 0x2

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    move-wide v15, v3

    .line 17
    invoke-static/range {v15 .. v31}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    move-result-wide v1

    move-object/from16 v3, p1

    .line 18
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->setId(J)V

    return-wide v1
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

    move-result-wide v0

    return-wide v0
.end method
