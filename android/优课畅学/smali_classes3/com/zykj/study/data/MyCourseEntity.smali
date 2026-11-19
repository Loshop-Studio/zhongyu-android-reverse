.class public final Lcom/zykj/study/data/MyCourseEntity;
.super Lcom/zykj/study/bean/course/CourseBean;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Entity;
    tableName = "my_course"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/data/MyCourseEntity$CREATOR;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Lcom/zykj/study/data/MyCourseEntity$CREATOR;


# instance fields
.field private isSuperviser:Z
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private sort:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/data/MyCourseEntity$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/data/MyCourseEntity$CREATOR;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/data/MyCourseEntity;->CREATOR:Lcom/zykj/study/data/MyCourseEntity$CREATOR;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/MyCourseEntity;->$stable:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;I)V
    .locals 14

    const-string v0, "status"

    move-object/from16 v12, p13

    invoke-static {v12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v13, p14

    .line 2
    invoke-direct/range {v0 .. v13}, Lcom/zykj/study/bean/course/CourseBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;)V

    move/from16 v1, p12

    .line 3
    iput-boolean v1, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    move/from16 v1, p15

    .line 4
    iput v1, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;IILkotlin/jvm/internal/n;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x2

    .line 1
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move v9, v2

    goto :goto_4

    :cond_4
    move/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move v10, v2

    goto :goto_5

    :cond_5
    move/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move v11, v2

    goto :goto_6

    :cond_6
    move/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move v12, v2

    goto :goto_7

    :cond_7
    move/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    move v13, v2

    goto :goto_8

    :cond_8
    move/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x400

    const/4 v3, 0x1

    if-eqz v1, :cond_9

    move v14, v3

    goto :goto_9

    :cond_9
    move/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    move v15, v3

    goto :goto_a

    :cond_a
    move/from16 v15, p12

    :goto_a
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_b

    move/from16 v18, v2

    :goto_b
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    goto :goto_c

    :cond_b
    move/from16 v18, p15

    goto :goto_b

    :goto_c
    invoke-direct/range {v3 .. v18}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;I)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 17

    const-string v0, "parcel"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 11
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 12
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    .line 14
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    .line 15
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v0, :cond_0

    move v0, v12

    move v12, v13

    goto :goto_0

    :cond_0
    move v0, v12

    .line 16
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    move-result v14

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    move v13, v0

    .line 17
    :goto_1
    invoke-static {}, Lcom/zykj/study/bean/course/CourseType;->getEntries()Lp7/a;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/zykj/study/bean/course/CourseType;

    .line 18
    new-instance v15, Ljava/util/Date;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-direct {v15, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v16

    move-object/from16 v1, p0

    .line 20
    invoke-direct/range {v1 .. v16}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;I)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/study/data/MyCourseEntity;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-super {p0, p1}, Lcom/zykj/study/bean/course/CourseBean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return v2

    .line 18
    :cond_2
    iget-boolean v1, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 19
    .line 20
    check-cast p1, Lcom/zykj/study/data/MyCourseEntity;

    .line 21
    .line 22
    iget-boolean v3, p1, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 28
    .line 29
    iget p1, p1, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 30
    .line 31
    if-eq v1, p1, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    return v0
.end method

.method public final getSort()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/study/bean/course/CourseBean;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public final isSuperviser()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSuperviser(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 4
    .line 5
    invoke-super {p0}, Lcom/zykj/study/bean/course/CourseBean;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v4, "MyCourseEntity(isSuperviser="

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ",sort="

    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ") "

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string p2, "parcel"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 81
    .line 82
    .line 83
    iget-boolean p2, p0, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser:Z

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-eqz p2, :cond_0

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    goto :goto_0

    .line 110
    :cond_0
    const-wide/16 v0, 0x0

    .line 111
    .line 112
    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 113
    .line 114
    .line 115
    iget p2, p0, Lcom/zykj/study/data/MyCourseEntity;->sort:I

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    .line 119
    .line 120
    return-void
.end method
