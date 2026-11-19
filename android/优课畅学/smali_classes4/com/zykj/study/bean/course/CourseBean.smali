.class public Lcom/zykj/study/bean/course/CourseBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/course/CourseBean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cover:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "courseCover"
        }
        value = "cover"
    .end annotation
.end field

.field private createTime:Ljava/util/Date;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private description:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private gradeId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "grade"
    .end annotation
.end field

.field private id:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
    .end annotation
.end field

.field private isPublic:Z
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private learning:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "learning"
    .end annotation
.end field

.field private likes:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "likes"
    .end annotation
.end field

.field private periodId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "level"
    .end annotation
.end field

.field private status:Lcom/zykj/study/bean/course/CourseType;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private subjectId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subject"
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private userId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/course/CourseBean$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/course/CourseBean$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/course/CourseBean;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/course/CourseBean;->$stable:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->id:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/course/CourseBean;->userId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/course/CourseBean;->cover:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zykj/study/bean/course/CourseBean;->title:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/zykj/study/bean/course/CourseBean;->description:Ljava/lang/String;

    .line 7
    iput p6, p0, Lcom/zykj/study/bean/course/CourseBean;->periodId:I

    .line 8
    iput p7, p0, Lcom/zykj/study/bean/course/CourseBean;->gradeId:I

    .line 9
    iput p8, p0, Lcom/zykj/study/bean/course/CourseBean;->subjectId:I

    .line 10
    iput p9, p0, Lcom/zykj/study/bean/course/CourseBean;->learning:I

    .line 11
    iput p10, p0, Lcom/zykj/study/bean/course/CourseBean;->likes:I

    .line 12
    iput-boolean p11, p0, Lcom/zykj/study/bean/course/CourseBean;->isPublic:Z

    .line 13
    iput-object p12, p0, Lcom/zykj/study/bean/course/CourseBean;->status:Lcom/zykj/study/bean/course/CourseType;

    .line 14
    iput-object p13, p0, Lcom/zykj/study/bean/course/CourseBean;->createTime:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;ILkotlin/jvm/internal/n;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x2

    .line 15
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

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    move v14, v1

    goto :goto_9

    :cond_9
    move/from16 v14, p11

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_a

    .line 16
    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    move-object v15, v0

    :goto_a
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v16, p13

    goto :goto_b

    :cond_a
    move-object/from16 v15, p12

    goto :goto_a

    .line 17
    :goto_b
    invoke-direct/range {v3 .. v16}, Lcom/zykj/study/bean/course/CourseBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;)V

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
    instance-of v1, p1, Lcom/zykj/study/bean/course/CourseBean;

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
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    check-cast p1, Lcom/zykj/study/bean/course/CourseBean;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eq v1, v3, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    return v2

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    return v2

    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_6

    .line 82
    .line 83
    return v2

    .line 84
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eq v1, v3, :cond_7

    .line 93
    .line 94
    return v2

    .line 95
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eq v1, v3, :cond_8

    .line 104
    .line 105
    return v2

    .line 106
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eq v1, v3, :cond_9

    .line 115
    .line 116
    return v2

    .line 117
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eq v1, v3, :cond_a

    .line 126
    .line 127
    return v2

    .line 128
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eq v1, v3, :cond_b

    .line 137
    .line 138
    return v2

    .line 139
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eq v1, v3, :cond_c

    .line 148
    .line 149
    return v2

    .line 150
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eq v1, v3, :cond_d

    .line 159
    .line 160
    return v2

    .line 161
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-nez p1, :cond_e

    .line 174
    .line 175
    return v2

    .line 176
    :cond_e
    return v0
.end method

.method public getCover()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->cover:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCreateTime()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->createTime:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGradeId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->gradeId:I

    .line 2
    .line 3
    return v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public getLearning()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->learning:I

    .line 2
    .line 3
    return v0
.end method

.method public getLikes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->likes:I

    .line 2
    .line 3
    return v0
.end method

.method public getPeriodId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->periodId:I

    .line 2
    .line 3
    return v0
.end method

.method public getStatus()Lcom/zykj/study/bean/course/CourseType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->status:Lcom/zykj/study/bean/course/CourseType;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSubjectId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->subjectId:I

    .line 2
    .line 3
    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v2

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_1
    add-int/2addr v0, v1

    .line 36
    mul-int/lit8 v0, v0, 0x1f

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v1, v2

    .line 50
    :goto_2
    add-int/2addr v0, v1

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v1, v2

    .line 65
    :goto_3
    add-int/2addr v0, v1

    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int/2addr v0, v1

    .line 73
    mul-int/lit8 v0, v0, 0x1f

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v0, v1

    .line 80
    mul-int/lit8 v0, v0, 0x1f

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v0, v1

    .line 87
    mul-int/lit8 v0, v0, 0x1f

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/2addr v0, v1

    .line 94
    mul-int/lit8 v0, v0, 0x1f

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    mul-int/lit8 v0, v0, 0x1f

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v0, v1

    .line 112
    mul-int/lit8 v0, v0, 0x1f

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/2addr v0, v1

    .line 123
    mul-int/lit8 v0, v0, 0x1f

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    :cond_4
    add-int/2addr v0, v2

    .line 136
    return v0
.end method

.method public isPublic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CourseBean;->isPublic:Z

    .line 2
    .line 3
    return v0
.end method

.method public setCover(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->cover:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCreateTime(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->createTime:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setGradeId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->gradeId:I

    .line 2
    .line 3
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->id:I

    .line 2
    .line 3
    return-void
.end method

.method public setLearning(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->learning:I

    .line 2
    .line 3
    return-void
.end method

.method public setLikes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->likes:I

    .line 2
    .line 3
    return-void
.end method

.method public setPeriodId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->periodId:I

    .line 2
    .line 3
    return-void
.end method

.method public setPublic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/course/CourseBean;->isPublic:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStatus(Lcom/zykj/study/bean/course/CourseType;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->status:Lcom/zykj/study/bean/course/CourseType;

    .line 7
    .line 8
    return-void
.end method

.method public setSubjectId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseBean;->subjectId:I

    .line 2
    .line 3
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseBean;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    new-instance v13, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v14, "CourseBean(id="

    .line 59
    .line 60
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, ", userId="

    .line 67
    .line 68
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ", cover="

    .line 75
    .line 76
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", title="

    .line 83
    .line 84
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", description="

    .line 91
    .line 92
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", periodId="

    .line 99
    .line 100
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, ", gradeId="

    .line 107
    .line 108
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, ", subjectId="

    .line 115
    .line 116
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, ", learning="

    .line 123
    .line 124
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v0, ", likes="

    .line 131
    .line 132
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v0, ", isPublic="

    .line 139
    .line 140
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, ", status="

    .line 147
    .line 148
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, ", createTime="

    .line 155
    .line 156
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, ")"

    .line 163
    .line 164
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->userId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->cover:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->periodId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->gradeId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->subjectId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->learning:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/zykj/study/bean/course/CourseBean;->likes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CourseBean;->isPublic:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseBean;->status:Lcom/zykj/study/bean/course/CourseType;

    invoke-virtual {v0, p1, p2}, Lcom/zykj/study/bean/course/CourseType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/zykj/study/bean/course/CourseBean;->createTime:Ljava/util/Date;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
