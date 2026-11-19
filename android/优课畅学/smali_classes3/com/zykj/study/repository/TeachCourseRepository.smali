.class public final Lcom/zykj/study/repository/TeachCourseRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lo4/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/j;)V
    .locals 1

    .line 1
    const-string v0, "api"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/repository/TeachCourseRepository;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/repository/TeachCourseRepository;->f(Lcom/zykj/study/repository/TeachCourseRepository;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/zykj/study/repository/TeachCourseRepository;)Landroidx/paging/PagingSource;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRemoteMediator;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/zykj/study/repository/TeachCourseRemoteMediator;-><init>(Lo4/j;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final b(IILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->e:I

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;

    .line 56
    .line 57
    invoke-direct {v2, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;-><init>(II)V

    .line 58
    .line 59
    .line 60
    iput p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->a:I

    .line 61
    .line 62
    iput p2, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->b:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/repository/TeachCourseRepository$addSuperviseGroup$1;->e:I

    .line 65
    .line 66
    invoke-interface {p3, v2, v0}, Lo4/j;->m(Lcom/zykj/study/bean/teach/SuperviseBindCourseInput;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method public final c(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/j;->l(IILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lo4/j;->j(ILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e()Ll8/c;
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
    new-instance v3, Lt4/j;

    .line 24
    .line 25
    invoke-direct {v3, p0}, Lt4/j;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V

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

.method public final g(ILm7/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->d:I

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
    iput v4, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->d:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->d:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 60
    .line 61
    iput v1, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->a:I

    .line 62
    .line 63
    iput v6, v3, Lcom/zykj/study/repository/TeachCourseRepository$getCourseProgress$1;->d:I

    .line 64
    .line 65
    invoke-interface {v2, v1, v3}, Lo4/j;->f(ILm7/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-ne v2, v4, :cond_3

    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_3
    :goto_1
    move-object v3, v2

    .line 73
    check-cast v3, Lcom/zykj/study/bean/teach/CourseProgress;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/zykj/study/bean/teach/CourseProgress;->getGroupProgress()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v8, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/16 v2, 0xa

    .line 82
    .line 83
    invoke-static {v1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    move-object v9, v2

    .line 105
    check-cast v9, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 106
    .line 107
    invoke-virtual {v9}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getCatalogs()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, Lq4/a;->a(Ljava/util/List;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v14

    .line 115
    const/16 v15, 0xf

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    invoke-static/range {v9 .. v16}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->copy$default(Lcom/zykj/study/bean/teach/GroupMemberProgress;ILjava/lang/String;IILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    const/16 v9, 0xf

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v7, 0x0

    .line 138
    invoke-static/range {v3 .. v10}, Lcom/zykj/study/bean/teach/CourseProgress;->copy$default(Lcom/zykj/study/bean/teach/CourseProgress;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/CourseProgress;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    return-object v1
.end method

.method public final h(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->e:I

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
    iget-object p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 58
    .line 59
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iput p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->a:I

    .line 66
    .line 67
    iput v3, v0, Lcom/zykj/study/repository/TeachCourseRepository$getMemberCourseProgress$1;->e:I

    .line 68
    .line 69
    invoke-interface {p3, p1, p2, v0}, Lo4/j;->k(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-ne p3, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    move-object v0, p3

    .line 77
    check-cast v0, Lcom/zykj/study/bean/teach/GroupMember;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/GroupMember;->getCatalogs()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lq4/a;->a(Ljava/util/List;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    const/16 v9, 0x7f

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v1, 0x0

    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    invoke-static/range {v0 .. v10}, Lcom/zykj/study/bean/teach/GroupMember;->copy$default(Lcom/zykj/study/bean/teach/GroupMember;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GroupMember;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
.end method

.method public final i(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/j;->h(IILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final j(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/j;->b(IILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final k(ILm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {v0, p1, v1, p2}, Lo4/j;->c(IILm7/c;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final l(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/j;->a(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final m(IILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->e:I

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;

    .line 56
    .line 57
    invoke-direct {v2, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;-><init>(II)V

    .line 58
    .line 59
    .line 60
    iput p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->a:I

    .line 61
    .line 62
    iput p2, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->b:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/repository/TeachCourseRepository$refreshSuperviseGroupMember$1;->e:I

    .line 65
    .line 66
    invoke-interface {p3, v2, v0}, Lo4/j;->i(Lcom/zykj/study/bean/teach/SuperviseGroupRefreshInput;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method public final n(ILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->d:I

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
    iget-object p2, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;

    .line 56
    .line 57
    invoke-direct {v2, p1}, Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->a:I

    .line 61
    .line 62
    iput v3, v0, Lcom/zykj/study/repository/TeachCourseRepository$remoteTeachCourse$1;->d:I

    .line 63
    .line 64
    invoke-interface {p2, v2, v0}, Lo4/j;->e(Lcom/zykj/study/bean/teach/TeachCourseRemoveInput;Lm7/c;)Ljava/lang/Object;

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

.method public final o(IILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->e:I

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lcom/zykj/study/repository/TeachCourseRepository;->a:Lo4/j;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;

    .line 56
    .line 57
    invoke-direct {v2, p1, p2}, Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;-><init>(II)V

    .line 58
    .line 59
    .line 60
    iput p1, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->a:I

    .line 61
    .line 62
    iput p2, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->b:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/repository/TeachCourseRepository$removeSuperviseGroup$1;->e:I

    .line 65
    .line 66
    invoke-interface {p3, v2, v0}, Lo4/j;->d(Lcom/zykj/study/bean/teach/SuperviseGroupRemoveInput;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method
