# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/repository/CourseRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/zykj/study/data/AppDatabase;

.field public final b:Landroidx/datastore/core/DataStore;

.field public c:Lo4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/AppDatabase;Landroidx/datastore/core/DataStore;Lo4/b;)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "api"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->b:Landroidx/datastore/core/DataStore;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/MyCourseKeyEntity;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/repository/CourseRepository;->t(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/MyCourseKeyEntity;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/study/repository/CourseRepository;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/repository/CourseRepository;->n(Lcom/zykj/study/repository/CourseRepository;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/repository/CourseRepository;->r(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/repository/CourseRepository;IZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/repository/CourseRepository;->k(IZLm7/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final n(Lcom/zykj/study/repository/CourseRepository;)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/repository/CourseRemoteMediator;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/repository/CourseRemoteMediator;-><init>(Lo4/b;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final r(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getUserId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/zykj/study/data/CourseStudyEntityDao;->getCourseStudyList(Ljava/lang/String;)Landroidx/paging/PagingSource;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final t(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/MyCourseKeyEntity;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/data/MyCourseKeyEntity;->getUserId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/zykj/study/data/MyCourseEntityDao;->getMyCourseList(Ljava/lang/String;)Landroidx/paging/PagingSource;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final A(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->d:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->b:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->d:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-object v2, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lcom/zykj/study/data/MyCourseEntity;

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    iget-object v4, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Lcom/zykj/study/data/MyCourseEntity;

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 73
    .line 74
    new-instance v7, Lcom/zykj/study/bean/course/CourseCreateInput;

    .line 75
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    invoke-direct/range {v7 .. v15}, Lcom/zykj/study/bean/course/CourseCreateInput;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v4, p1

    .line 128
    .line 129
    iput-object v4, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->a:Ljava/lang/Object;

    .line 130
    .line 131
    iput v6, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->d:I

    .line 132
    .line 133
    invoke-interface {v1, v7, v2}, Lo4/b;->t(Lcom/zykj/study/bean/course/CourseCreateInput;Lm7/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-ne v1, v3, :cond_4

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    :goto_1
    iget-object v1, v0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    iput-object v7, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->a:Ljava/lang/Object;

    .line 151
    .line 152
    iput v5, v2, Lcom/zykj/study/repository/CourseRepository$updateCourse$1;->d:I

    .line 153
    .line 154
    invoke-interface {v1, v4, v2}, Lcom/zykj/study/data/MyCourseEntityDao;->insert(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-ne v1, v3, :cond_5

    .line 159
    .line 160
    :goto_2
    return-object v3

    .line 161
    :cond_5
    :goto_3
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    return-object v1
.end method

.method public final d(ILjava/lang/String;IZLm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/course/CatalogInput;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Lcom/zykj/study/bean/course/CatalogInput;-><init>(ILjava/lang/String;IZ)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p5}, Lo4/b;->q(Lcom/zykj/study/bean/course/CatalogInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public final e(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->e:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->e:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-object v2, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lcom/zykj/study/data/MyCourseEntity;

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    iget-object v4, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Lcom/zykj/study/data/MyCourseEntity;

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 73
    .line 74
    new-instance v7, Lcom/zykj/study/bean/course/CourseCreateInput;

    .line 75
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    const/4 v8, 0x0

    .line 117
    invoke-direct/range {v7 .. v15}, Lcom/zykj/study/bean/course/CourseCreateInput;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v4, p1

    .line 121
    .line 122
    iput-object v4, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput v6, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->e:I

    .line 125
    .line 126
    invoke-interface {v1, v7, v2}, Lo4/b;->u(Lcom/zykj/study/bean/course/CourseCreateInput;Lm7/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-ne v1, v3, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    :goto_1
    check-cast v1, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {v4, v1}, Lcom/zykj/study/bean/course/CourseBean;->setId(I)V

    .line 140
    .line 141
    .line 142
    iget-object v7, v0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 143
    .line 144
    invoke-virtual {v7}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    iput-object v8, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->a:Ljava/lang/Object;

    .line 153
    .line 154
    iput v1, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->b:I

    .line 155
    .line 156
    iput v5, v2, Lcom/zykj/study/repository/CourseRepository$createMyCourse$1;->e:I

    .line 157
    .line 158
    invoke-interface {v7, v4, v2}, Lcom/zykj/study/data/MyCourseEntityDao;->insert(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-ne v1, v3, :cond_5

    .line 163
    .line 164
    :goto_2
    return-object v3

    .line 165
    :cond_5
    :goto_3
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    return-object v1
.end method

.method public final f(ILm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/course/CatalogIdInput;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/zykj/study/bean/course/CatalogIdInput;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, Lo4/b;->w(Lcom/zykj/study/bean/course/CatalogIdInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public final g(ILm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget p1, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->a:I

    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 63
    .line 64
    new-instance v2, Lcom/zykj/study/bean/course/CourseDeleteInput;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-direct {v2, p1, v5, v3, v6}, Lcom/zykj/study/bean/course/CourseDeleteInput;-><init>(IZILkotlin/jvm/internal/n;)V

    .line 69
    .line 70
    .line 71
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->a:I

    .line 72
    .line 73
    iput v4, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->d:I

    .line 74
    .line 75
    invoke-interface {p2, v2, v0}, Lo4/b;->y(Lcom/zykj/study/bean/course/CourseDeleteInput;Lm7/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->a:I

    .line 89
    .line 90
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$deleteCourse$1;->d:I

    .line 91
    .line 92
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/MyCourseEntityDao;->deleteByCourse(ILm7/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v1, :cond_5

    .line 97
    .line 98
    :goto_2
    return-object v1

    .line 99
    :cond_5
    :goto_3
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1
.end method

.method public final h(ILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->a:I

    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 56
    .line 57
    new-instance v2, Lcom/zykj/study/bean/course/CourseIdInput;

    .line 58
    .line 59
    invoke-direct {v2, p1}, Lcom/zykj/study/bean/course/CourseIdInput;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->a:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$dismountCourse$1;->d:I

    .line 65
    .line 66
    invoke-interface {p2, v2, v0}, Lo4/b;->v(Lcom/zykj/study/bean/course/CourseIdInput;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 80
    .line 81
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/MyCourseEntityDao;->updateStatus(ILcom/zykj/study/bean/course/CourseType;)I

    .line 82
    .line 83
    .line 84
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
    return-object p1
.end method

.method public final i(I)Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lcom/zykj/study/data/MyCourseEntityDao;->findCourse(I)Landroidx/lifecycle/LiveData;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final j(ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lo4/b;->B(ILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final k(IZLm7/c;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;

    .line 15
    .line 16
    iget v5, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->h:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x4

    .line 43
    const/4 v9, 0x3

    .line 44
    const/4 v10, 0x2

    .line 45
    const/4 v11, 0x1

    .line 46
    const/4 v12, 0x0

    .line 47
    if-eqz v6, :cond_5

    .line 48
    .line 49
    if-eq v6, v11, :cond_4

    .line 50
    .line 51
    if-eq v6, v10, :cond_3

    .line 52
    .line 53
    if-eq v6, v9, :cond_2

    .line 54
    .line 55
    if-ne v6, v8, :cond_1

    .line 56
    .line 57
    iget-object v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lcom/zykj/study/data/CourseStudyEntity;

    .line 60
    .line 61
    iget-object v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 64
    .line 65
    iget-object v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_2
    iget v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->b:I

    .line 81
    .line 82
    iget-boolean v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 83
    .line 84
    iget v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 85
    .line 86
    iget-object v9, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 89
    .line 90
    iget-object v10, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move v14, v6

    .line 96
    move-object v6, v3

    .line 97
    move v3, v2

    .line 98
    move v2, v1

    .line 99
    move-object v1, v10

    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_3
    iget v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->b:I

    .line 103
    .line 104
    iget-boolean v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 105
    .line 106
    iget v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 107
    .line 108
    iget-object v10, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->g:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v10, Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 111
    .line 112
    iget-object v11, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v11, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 115
    .line 116
    iget-object v13, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    iget-boolean v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 123
    .line 124
    iget v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 125
    .line 126
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move/from16 v31, v2

    .line 130
    .line 131
    move v2, v1

    .line 132
    move/from16 v1, v31

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object v3, v0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 139
    .line 140
    iput v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 141
    .line 142
    iput-boolean v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 143
    .line 144
    iput v11, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 145
    .line 146
    invoke-interface {v3, v1, v2, v4}, Lo4/b;->r(IZLm7/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-ne v3, v5, :cond_6

    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_6
    :goto_1
    move-object v6, v3

    .line 155
    check-cast v6, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 156
    .line 157
    iget-object v11, v0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 158
    .line 159
    invoke-virtual {v11}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    iget-object v13, v0, Lcom/zykj/study/repository/CourseRepository;->b:Landroidx/datastore/core/DataStore;

    .line 164
    .line 165
    invoke-interface {v13}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iput-object v3, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v11, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->g:Ljava/lang/Object;

    .line 174
    .line 175
    iput v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 176
    .line 177
    iput-boolean v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 178
    .line 179
    iput v12, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->b:I

    .line 180
    .line 181
    iput v10, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 182
    .line 183
    invoke-static {v13, v4}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-ne v10, v5, :cond_7

    .line 188
    .line 189
    goto/16 :goto_5

    .line 190
    .line 191
    :cond_7
    move-object v13, v3

    .line 192
    move-object v3, v10

    .line 193
    move-object v10, v11

    .line 194
    move-object v11, v6

    .line 195
    move v6, v1

    .line 196
    move v1, v12

    .line 197
    :goto_2
    check-cast v3, Lcom/zykj/lib/login/proto/UserBean;

    .line 198
    .line 199
    if-eqz v3, :cond_8

    .line 200
    .line 201
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    if-nez v3, :cond_9

    .line 206
    .line 207
    :cond_8
    const-string v3, ""

    .line 208
    .line 209
    :cond_9
    iput-object v13, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v11, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v7, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->g:Ljava/lang/Object;

    .line 214
    .line 215
    iput v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 216
    .line 217
    iput-boolean v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 218
    .line 219
    iput v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->b:I

    .line 220
    .line 221
    iput v9, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 222
    .line 223
    invoke-interface {v10, v3, v6, v4}, Lcom/zykj/study/data/CourseStudyEntityDao;->findByIdAndUserId(Ljava/lang/String;ILm7/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    if-ne v3, v5, :cond_a

    .line 228
    .line 229
    goto/16 :goto_5

    .line 230
    .line 231
    :cond_a
    move v14, v6

    .line 232
    move-object v9, v11

    .line 233
    move-object v6, v3

    .line 234
    move v3, v2

    .line 235
    move v2, v1

    .line 236
    move-object v1, v13

    .line 237
    :goto_3
    check-cast v6, Lcom/zykj/study/data/CourseStudyEntity;

    .line 238
    .line 239
    if-nez v6, :cond_b

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_b
    iget-object v10, v0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 243
    .line 244
    invoke-virtual {v10}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    new-instance v13, Lcom/zykj/study/data/CourseStudyEntity;

    .line 249
    .line 250
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseSimpleBean;->getUserName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v16

    .line 258
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v17

    .line 262
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v18

    .line 266
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v19

    .line 270
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 271
    .line 272
    .line 273
    move-result v20

    .line 274
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 275
    .line 276
    .line 277
    move-result v21

    .line 278
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 279
    .line 280
    .line 281
    move-result v22

    .line 282
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 283
    .line 284
    .line 285
    move-result v23

    .line 286
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 287
    .line 288
    .line 289
    move-result v24

    .line 290
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 291
    .line 292
    .line 293
    move-result v25

    .line 294
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 295
    .line 296
    .line 297
    move-result-object v26

    .line 298
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getProgress()Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    if-eqz v11, :cond_c

    .line 303
    .line 304
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    move/from16 v27, v11

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_c
    move/from16 v27, v12

    .line 312
    .line 313
    :goto_4
    invoke-virtual {v6}, Lcom/zykj/study/data/CourseStudyEntity;->getStudyUserId()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v28

    .line 317
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 318
    .line 319
    .line 320
    move-result-object v29

    .line 321
    invoke-virtual {v6}, Lcom/zykj/study/data/CourseStudyEntity;->getLearnTime()Ljava/util/Date;

    .line 322
    .line 323
    .line 324
    move-result-object v30

    .line 325
    invoke-direct/range {v13 .. v30}, Lcom/zykj/study/data/CourseStudyEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    .line 326
    .line 327
    .line 328
    iput-object v1, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->e:Ljava/lang/Object;

    .line 329
    .line 330
    invoke-static {v9}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    iput-object v9, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->f:Ljava/lang/Object;

    .line 335
    .line 336
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    iput-object v6, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->g:Ljava/lang/Object;

    .line 341
    .line 342
    iput v14, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->a:I

    .line 343
    .line 344
    iput-boolean v3, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->d:Z

    .line 345
    .line 346
    iput v2, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->b:I

    .line 347
    .line 348
    iput v12, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->c:I

    .line 349
    .line 350
    iput v8, v4, Lcom/zykj/study/repository/CourseRepository$getCourseDetails$1;->j:I

    .line 351
    .line 352
    invoke-interface {v10, v13, v4}, Lcom/zykj/study/data/CourseStudyEntityDao;->update(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    if-ne v2, v5, :cond_d

    .line 357
    .line 358
    :goto_5
    return-object v5

    .line 359
    :cond_d
    :goto_6
    check-cast v1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 360
    .line 361
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-eqz v2, :cond_e

    .line 366
    .line 367
    invoke-static {v2}, Lq4/a;->a(Ljava/util/List;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    :cond_e
    invoke-virtual {v1, v7}, Lcom/zykj/study/bean/course/CourseDetailsBean;->setCatalogs(Ljava/util/List;)V

    .line 372
    .line 373
    .line 374
    return-object v1
.end method

.method public final m()Ll8/c;
    .locals 9

    .line 1
    new-instance v0, Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    const/16 v7, 0x3e

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    invoke-direct/range {v0 .. v8}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/paging/Pager;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lt4/d;

    .line 24
    .line 25
    invoke-direct {v3, p0}, Lt4/d;-><init>(Lcom/zykj/study/repository/CourseRepository;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v0, v2, v3}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lx7/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/paging/Pager;->getFlow()Ll8/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final o(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 47
    .line 48
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 51
    .line 52
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 71
    .line 72
    iget-object v2, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 75
    .line 76
    iget-object v4, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 102
    .line 103
    iput v5, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 104
    .line 105
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao;->getKeyByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-ne p2, v1, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_1
    move-object v2, p2

    .line 113
    check-cast v2, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 114
    .line 115
    if-nez v2, :cond_8

    .line 116
    .line 117
    new-instance p2, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 118
    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 121
    invoke-direct {p2, v6, p1, v5, v7}, Lcom/zykj/study/data/CourseStudyKeyEntity;-><init>(ILjava/lang/String;ILjava/lang/Integer;)V

    .line 122
    .line 123
    .line 124
    iget-object v5, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 125
    .line 126
    invoke-virtual {v5}, Lcom/zykj/study/data/AppDatabase;->courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    iput-object v6, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->b:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iput-object v6, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    iput v4, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 145
    .line 146
    invoke-interface {v5, p2, v0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao;->insert(Lcom/zykj/study/data/CourseStudyKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    if-ne v4, v1, :cond_6

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    move-object v4, p1

    .line 154
    move-object p1, p2

    .line 155
    :goto_2
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    iput-object v5, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->a:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iput-object v2, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->b:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->c:Ljava/lang/Object;

    .line 178
    .line 179
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$getCourseStudyKey$1;->f:I

    .line 180
    .line 181
    invoke-interface {p2, v4, v0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao;->getKeyByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, v1, :cond_7

    .line 186
    .line 187
    :goto_3
    return-object v1

    .line 188
    :cond_7
    return-object p1

    .line 189
    :cond_8
    return-object v2
.end method

.method public final p(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$getKey$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$getKey$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 47
    .line 48
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 51
    .line 52
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 71
    .line 72
    iget-object v2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 75
    .line 76
    iget-object v4, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    move-object v7, p1

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iput v5, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 105
    .line 106
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/MyCourseKeyEntityDao;->getKeyByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-ne p2, v1, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_1
    move-object v2, p2

    .line 114
    check-cast v2, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 115
    .line 116
    if-nez v2, :cond_8

    .line 117
    .line 118
    new-instance v5, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 119
    .line 120
    const/16 v9, 0x14

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-direct/range {v5 .. v10}, Lcom/zykj/study/data/MyCourseKeyEntity;-><init>(ILjava/lang/String;IILjava/lang/Integer;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object v7, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iput-object p2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->b:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iput-object p2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->c:Ljava/lang/Object;

    .line 147
    .line 148
    iput v4, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 149
    .line 150
    invoke-interface {p1, v5, v0}, Lcom/zykj/study/data/MyCourseKeyEntityDao;->insert(Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v1, :cond_6

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    move-object p1, v5

    .line 158
    move-object v4, v7

    .line 159
    :goto_2
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 160
    .line 161
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iput-object v5, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->a:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iput-object v2, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->b:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->c:Ljava/lang/Object;

    .line 182
    .line 183
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$getKey$1;->f:I

    .line 184
    .line 185
    invoke-interface {p2, v4, v0}, Lcom/zykj/study/data/MyCourseKeyEntityDao;->getKeyByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-ne p1, v1, :cond_7

    .line 190
    .line 191
    :goto_3
    return-object v1

    .line 192
    :cond_7
    return-object p1

    .line 193
    :cond_8
    return-object v2
.end method

.method public final q(Lcom/zykj/study/data/CourseStudyKeyEntity;)Ll8/c;
    .locals 11

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/paging/Pager;

    .line 7
    .line 8
    new-instance v2, Landroidx/paging/PagingConfig;

    .line 9
    .line 10
    const/16 v9, 0x3e

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/16 v3, 0x14

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-direct/range {v2 .. v10}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-direct {v4, v0, v3, v5}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;-><init>(Lcom/zykj/study/data/AppDatabase;Lo4/b;I)V

    .line 34
    .line 35
    .line 36
    new-instance v5, Lt4/c;

    .line 37
    .line 38
    invoke-direct {v5, p0, p1}, Lt4/c;-><init>(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)V

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct/range {v1 .. v7}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lx7/a;ILkotlin/jvm/internal/n;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/paging/Pager;->getFlow()Ll8/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method public final s(Lcom/zykj/study/data/MyCourseKeyEntity;)Ll8/c;
    .locals 11

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/paging/Pager;

    .line 7
    .line 8
    new-instance v2, Landroidx/paging/PagingConfig;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/data/MyCourseKeyEntity;->getTake()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/16 v9, 0x3e

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    invoke-direct/range {v2 .. v10}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/data/MyCourseKeyEntity;->getId()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-direct {v4, v0, v3, v5}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;-><init>(Lcom/zykj/study/data/AppDatabase;Lo4/b;I)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lt4/b;

    .line 39
    .line 40
    invoke-direct {v5, p0, p1}, Lt4/b;-><init>(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/MyCourseKeyEntity;)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct/range {v1 .. v7}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lx7/a;ILkotlin/jvm/internal/n;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/paging/Pager;->getFlow()Ll8/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public final u(ILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->a:I

    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 56
    .line 57
    new-instance v2, Lcom/zykj/study/bean/course/CourseIdInput;

    .line 58
    .line 59
    invoke-direct {v2, p1}, Lcom/zykj/study/bean/course/CourseIdInput;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->a:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$publishCourse$1;->d:I

    .line 65
    .line 66
    invoke-interface {p2, v2, v0}, Lo4/b;->s(Lcom/zykj/study/bean/course/CourseIdInput;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 80
    .line 81
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/MyCourseEntityDao;->updateStatus(ILcom/zykj/study/bean/course/CourseType;)I

    .line 82
    .line 83
    .line 84
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
    return-object p1
.end method

.method public final v(Lcom/zykj/study/bean/course/ReorderCatalogReq;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lo4/b;->k(Lcom/zykj/study/bean/course/ReorderCatalogReq;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p1
.end method

.method public final w(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/study/repository/CourseRepository$subscribe$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/study/repository/CourseRepository$subscribe$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/zykj/study/repository/CourseRepository$subscribe$1;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lcom/zykj/study/repository/CourseRepository$subscribe$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->f:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 40
    .line 41
    const/4 v10, 0x3

    .line 42
    const/4 v5, 0x2

    .line 43
    const/4 v6, 0x1

    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    if-eq v4, v6, :cond_3

    .line 47
    .line 48
    if-eq v4, v5, :cond_2

    .line 49
    .line 50
    if-ne v4, v10, :cond_1

    .line 51
    .line 52
    iget-object v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 55
    .line 56
    iget-object v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->d:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_2
    iget v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->a:I

    .line 75
    .line 76
    iget-object v4, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object/from16 v26, v4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    iget v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->a:I

    .line 87
    .line 88
    iget-object v4, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v2, v4

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 101
    .line 102
    new-instance v4, Lcom/zykj/study/bean/course/CourseSubscribeInput;

    .line 103
    .line 104
    invoke-direct {v4, v1}, Lcom/zykj/study/bean/course/CourseSubscribeInput;-><init>(I)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v8, p2

    .line 108
    .line 109
    iput-object v8, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    iput v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->a:I

    .line 112
    .line 113
    iput v6, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 114
    .line 115
    invoke-interface {v2, v4, v7}, Lo4/b;->h(Lcom/zykj/study/bean/course/CourseSubscribeInput;Lm7/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-ne v2, v3, :cond_5

    .line 120
    .line 121
    goto/16 :goto_5

    .line 122
    .line 123
    :cond_5
    move-object v2, v8

    .line 124
    :goto_2
    iget-object v4, v0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 125
    .line 126
    iput-object v2, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->a:I

    .line 129
    .line 130
    iput v5, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    const/4 v8, 0x2

    .line 134
    const/4 v9, 0x0

    .line 135
    move v5, v1

    .line 136
    invoke-static/range {v4 .. v9}, Lo4/b;->x(Lo4/b;IZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-ne v1, v3, :cond_6

    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_6
    move-object/from16 v26, v2

    .line 145
    .line 146
    move-object v2, v1

    .line 147
    move v1, v5

    .line 148
    :goto_3
    move-object v4, v2

    .line 149
    check-cast v4, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 150
    .line 151
    iget-object v5, v0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 152
    .line 153
    invoke-virtual {v5}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v11, Lcom/zykj/study/data/CourseStudyEntity;

    .line 158
    .line 159
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseSimpleBean;->getUserName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v16

    .line 179
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v17

    .line 183
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 184
    .line 185
    .line 186
    move-result v18

    .line 187
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 188
    .line 189
    .line 190
    move-result v19

    .line 191
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 192
    .line 193
    .line 194
    move-result v20

    .line 195
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 196
    .line 197
    .line 198
    move-result v21

    .line 199
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 200
    .line 201
    .line 202
    move-result v22

    .line 203
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 204
    .line 205
    .line 206
    move-result v23

    .line 207
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 208
    .line 209
    .line 210
    move-result-object v24

    .line 211
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getProgress()Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    const/4 v8, 0x0

    .line 216
    if-eqz v6, :cond_7

    .line 217
    .line 218
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    move/from16 v25, v6

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_7
    move/from16 v25, v8

    .line 226
    .line 227
    :goto_4
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getCreateTime()Ljava/util/Date;

    .line 228
    .line 229
    .line 230
    move-result-object v27

    .line 231
    new-instance v28, Ljava/util/Date;

    .line 232
    .line 233
    invoke-direct/range {v28 .. v28}, Ljava/util/Date;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-direct/range {v11 .. v28}, Lcom/zykj/study/data/CourseStudyEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/zykj/study/bean/course/CourseType;ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    .line 237
    .line 238
    .line 239
    invoke-static/range {v26 .. v26}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iput-object v6, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->c:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v2, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->d:Ljava/lang/Object;

    .line 246
    .line 247
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    iput-object v4, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->e:Ljava/lang/Object;

    .line 252
    .line 253
    iput v1, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->a:I

    .line 254
    .line 255
    iput v8, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->b:I

    .line 256
    .line 257
    iput v10, v7, Lcom/zykj/study/repository/CourseRepository$subscribe$1;->h:I

    .line 258
    .line 259
    invoke-interface {v5, v11, v7}, Lcom/zykj/study/data/CourseStudyEntityDao;->insert(Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-ne v1, v3, :cond_8

    .line 264
    .line 265
    :goto_5
    return-object v3

    .line 266
    :cond_8
    return-object v2
.end method

.method public final x(ILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/study/bean/teach/TeachCourseAddInput;

    .line 56
    .line 57
    invoke-direct {v2, p1}, Lcom/zykj/study/bean/teach/TeachCourseAddInput;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->a:I

    .line 61
    .line 62
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$teachCourse$1;->d:I

    .line 63
    .line 64
    invoke-interface {p2, v2, v0}, Lo4/b;->j(Lcom/zykj/study/bean/teach/TeachCourseAddInput;Lm7/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public final y(ILm7/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;-><init>(Lcom/zykj/study/repository/CourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget p1, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->a:I

    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 63
    .line 64
    new-instance v2, Lcom/zykj/study/bean/course/CourseSubscribeInput;

    .line 65
    .line 66
    invoke-direct {v2, p1}, Lcom/zykj/study/bean/course/CourseSubscribeInput;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->a:I

    .line 70
    .line 71
    iput v4, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->d:I

    .line 72
    .line 73
    invoke-interface {p2, v2, v0}, Lo4/b;->e(Lcom/zykj/study/bean/course/CourseSubscribeInput;Lm7/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/zykj/study/repository/CourseRepository;->a:Lcom/zykj/study/data/AppDatabase;

    .line 81
    .line 82
    invoke-virtual {p2}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput p1, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->a:I

    .line 87
    .line 88
    iput v3, v0, Lcom/zykj/study/repository/CourseRepository$unSubscribe$1;->d:I

    .line 89
    .line 90
    invoke-interface {p2, p1, v0}, Lcom/zykj/study/data/CourseStudyEntityDao;->deleteById(ILm7/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v1, :cond_5

    .line 95
    .line 96
    :goto_2
    return-object v1

    .line 97
    :cond_5
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 98
    .line 99
    return-object p1
.end method

.method public final z(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseRepository;->c:Lo4/b;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/course/CatalogUpdateInput;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lcom/zykj/study/bean/course/CatalogUpdateInput;-><init>(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p3}, Lo4/b;->g(Lcom/zykj/study/bean/course/CatalogUpdateInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p1
.end method
