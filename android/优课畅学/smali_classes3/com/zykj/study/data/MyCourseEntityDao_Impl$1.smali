.class public final Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;
.super Landroidx/room/EntityInsertAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/data/MyCourseEntityDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertAdapter<",
        "Lcom/zykj/study/data/MyCourseEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;


# direct methods
.method public constructor <init>(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/EntityInsertAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/SQLiteStatement;Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser()Z

    move-result v0

    const/4 v1, 0x1

    int-to-long v2, v0

    .line 3
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/zykj/study/data/MyCourseEntity;->getSort()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 5
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 6
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 7
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 9
    :goto_0
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    .line 10
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 12
    :goto_1
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    .line 13
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 14
    :cond_2
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 15
    :goto_2
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    .line 16
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 17
    :cond_3
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 18
    :goto_3
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 19
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 20
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 21
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 22
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 23
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    .line 24
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 25
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    invoke-static {v0}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    move-result-object v0

    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/study/data/Converters;->sessionOrderTypeToString(Lcom/zykj/study/bean/course/CourseType;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    .line 26
    invoke-interface {p1, v1, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    .line 27
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    move-result-object p2

    .line 28
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;->this$0:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    invoke-static {v0}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->access$get__converters$p(Lcom/zykj/study/data/MyCourseEntityDao_Impl;)Lcom/zykj/study/data/Converters;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/zykj/study/data/Converters;->dateToLong(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p2

    const/16 v0, 0xf

    if-nez p2, :cond_4

    .line 29
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    return-void

    .line 30
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/zykj/study/data/MyCourseEntity;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/data/MyCourseEntityDao_Impl$1;->bind(Landroidx/sqlite/SQLiteStatement;Lcom/zykj/study/data/MyCourseEntity;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `my_course` (`isSuperviser`,`sort`,`id`,`userId`,`cover`,`title`,`description`,`periodId`,`gradeId`,`subjectId`,`learning`,`likes`,`isPublic`,`status`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method
