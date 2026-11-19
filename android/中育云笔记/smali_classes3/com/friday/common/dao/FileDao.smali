.class public interface abstract Lcom/friday/common/dao/FileDao;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic G(Lcom/friday/common/dao/FileDao;Ljava/lang/String;IZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x4

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao;->l(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: updateSync"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic d(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->m:I

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
    iput v1, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;-><init>(Lcom/friday/common/dao/FileDao;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->m:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p0, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->i:I

    .line 40
    .line 41
    iget-object p1, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object v2, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/lang/Iterable;

    .line 52
    .line 53
    iget-object v5, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ljava/util/List;

    .line 56
    .line 57
    iget-object v6, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lcom/friday/common/dao/FileDao;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p2, v5

    .line 65
    move-object v5, v2

    .line 66
    move-object v2, p1

    .line 67
    move p1, p0

    .line 68
    move-object p0, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object p2, p1

    .line 82
    check-cast p2, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v5, p2

    .line 89
    move-object p2, p1

    .line 90
    move p1, v4

    .line 91
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v7, v6

    .line 102
    check-cast v7, Ljava/lang/String;

    .line 103
    .line 104
    iput-object p0, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iput-object v8, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->d:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    iput-object v8, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->f:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    iput-object v6, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->g:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    iput-object v6, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->h:Ljava/lang/Object;

    .line 131
    .line 132
    iput p1, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->i:I

    .line 133
    .line 134
    iput v4, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->j:I

    .line 135
    .line 136
    iput v3, v0, Lcom/friday/common/dao/FileDao$markCacheStateAsFalse$1;->m:I

    .line 137
    .line 138
    invoke-interface {p0, v7, v4, v0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-ne v6, v1, :cond_3

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 146
    .line 147
    return-object p0
.end method

.method public static synthetic g(Lcom/friday/common/dao/FileDao;Ljava/lang/String;IZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x4

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/friday/common/dao/FileDao;->D(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: updateVersionAndSync"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic h(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/common/dao/FileDao$insertFileList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/dao/FileDao$insertFileList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

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
    iput v1, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/dao/FileDao$insertFileList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/common/dao/FileDao$insertFileList$1;-><init>(Lcom/friday/common/dao/FileDao;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget p0, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->i:I

    .line 40
    .line 41
    iget-object p1, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object v2, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/lang/Iterable;

    .line 52
    .line 53
    iget-object v5, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ljava/util/List;

    .line 56
    .line 57
    iget-object v6, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lcom/friday/common/dao/FileDao;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p2, v5

    .line 65
    move-object v5, v2

    .line 66
    move-object v2, p1

    .line 67
    move p1, p0

    .line 68
    move-object p0, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object p2, p1

    .line 82
    check-cast p2, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v5, p2

    .line 89
    move-object p2, p1

    .line 90
    move p1, v3

    .line 91
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v7, v6

    .line 102
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 103
    .line 104
    iput-object p0, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iput-object v8, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->d:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    iput-object v8, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->f:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    iput-object v6, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->g:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    iput-object v6, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->h:Ljava/lang/Object;

    .line 131
    .line 132
    iput p1, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->i:I

    .line 133
    .line 134
    iput v3, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->j:I

    .line 135
    .line 136
    iput v4, v0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

    .line 137
    .line 138
    invoke-interface {p0, v7, v0}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-ne v6, v1, :cond_3

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 146
    .line 147
    return-object p0
.end method

.method public static synthetic i(Lcom/friday/common/dao/FileDao;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->i:I

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
    iput v1, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;-><init>(Lcom/friday/common/dao/FileDao;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->i:I

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
    iget-object p0, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/util/List;

    .line 45
    .line 46
    iget-object p1, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lcom/friday/common/dao/FileDao;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object v5, v0

    .line 58
    move-object v0, p1

    .line 59
    move-object p1, v2

    .line 60
    move-object v2, v5

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance p2, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    move-object v2, v0

    .line 79
    move-object v0, p1

    .line 80
    move-object p1, p0

    .line 81
    move-object p0, p2

    .line 82
    move-object p2, v0

    .line 83
    :goto_1
    const-string v4, "0"

    .line 84
    .line 85
    invoke-static {p2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_5

    .line 90
    .line 91
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    iput-object p1, v2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iput-object v4, v2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->d:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object p0, v2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->e:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iput-object v4, v2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iput v3, v2, Lcom/friday/common/dao/FileDao$getAllParentIdById$1;->i:I

    .line 111
    .line 112
    invoke-interface {p1, p2, v2}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v1, :cond_3

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_3
    :goto_2
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 120
    .line 121
    if-nez p2, :cond_4

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_4
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    return-object p0
.end method

.method public static synthetic j(Lcom/friday/common/dao/FileDao;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->j:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->j:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;-><init>(Lcom/friday/common/dao/FileDao;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->h:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v4, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->j:I

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget-object v2, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    iget-object v4, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v4, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v7, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v8, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lcom/friday/common/dao/FileDao;

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v7

    .line 71
    move-object v7, v1

    .line 72
    move-object v1, v0

    .line 73
    move-object v0, v8

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    iget-object v2, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v4, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->e:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v7, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v7, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v8, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, Lcom/friday/common/dao/FileDao;

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v17, v4

    .line 104
    .line 105
    move-object v4, v7

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v0, p1

    .line 111
    .line 112
    move-object/from16 v4, p2

    .line 113
    .line 114
    move-object v7, v1

    .line 115
    move-object v1, v0

    .line 116
    :goto_1
    const-string v8, "0"

    .line 117
    .line 118
    invoke-static {v0, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_7

    .line 123
    .line 124
    iput-object v2, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    iput-object v8, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->d:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v4, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->e:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    iput-object v8, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->f:Ljava/lang/Object;

    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    iput-object v8, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->g:Ljava/lang/Object;

    .line 142
    .line 143
    iput v6, v7, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->j:I

    .line 144
    .line 145
    invoke-interface {v2, v0, v7}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    if-ne v8, v3, :cond_4

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    move-object/from16 v17, v2

    .line 153
    .line 154
    move-object v2, v0

    .line 155
    move-object v0, v8

    .line 156
    move-object/from16 v8, v17

    .line 157
    .line 158
    move-object/from16 v17, v4

    .line 159
    .line 160
    move-object v4, v1

    .line 161
    move-object v1, v7

    .line 162
    :goto_2
    move-object v7, v0

    .line 163
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 164
    .line 165
    if-nez v7, :cond_5

    .line 166
    .line 167
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 168
    .line 169
    return-object v0

    .line 170
    :cond_5
    const v29, 0x7feff

    .line 171
    .line 172
    .line 173
    const/16 v30, 0x0

    .line 174
    .line 175
    move-object v0, v8

    .line 176
    const/4 v8, 0x0

    .line 177
    const-wide/16 v9, 0x0

    .line 178
    .line 179
    const/4 v11, 0x0

    .line 180
    const/4 v12, 0x0

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    const/16 v19, 0x0

    .line 189
    .line 190
    const/16 v20, 0x0

    .line 191
    .line 192
    const/16 v21, 0x0

    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    const/16 v24, 0x0

    .line 199
    .line 200
    const/16 v25, 0x0

    .line 201
    .line 202
    const-wide/16 v26, 0x0

    .line 203
    .line 204
    const/16 v28, 0x0

    .line 205
    .line 206
    invoke-static/range {v7 .. v30}, Lcom/friday/common/entity/FileEntity;->copy$default(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILjava/lang/Object;)Lcom/friday/common/entity/FileEntity;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    move-object/from16 v9, v17

    .line 211
    .line 212
    iput-object v0, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->c:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    iput-object v10, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->d:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v9, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->e:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iput-object v2, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->f:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object v7, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->g:Ljava/lang/Object;

    .line 229
    .line 230
    iput v5, v1, Lcom/friday/common/dao/FileDao$updateTimeWithParents$1;->j:I

    .line 231
    .line 232
    invoke-interface {v0, v8, v1}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    if-ne v2, v3, :cond_6

    .line 237
    .line 238
    :goto_3
    return-object v3

    .line 239
    :cond_6
    move-object v2, v7

    .line 240
    move-object v7, v1

    .line 241
    move-object v1, v4

    .line 242
    move-object v4, v9

    .line 243
    :goto_4
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    move-object/from16 v31, v2

    .line 248
    .line 249
    move-object v2, v0

    .line 250
    move-object/from16 v0, v31

    .line 251
    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :cond_7
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 255
    .line 256
    return-object v0
.end method

.method public static synthetic k(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lcom/friday/common/entity/RestoreResponse;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->getParentId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->getExpirationTimeStamp()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->getUpdateTime()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {p2}, Lcom/friday/common/entity/RestoreResponse;->getVersion()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    move-object v0, p0

    .line 44
    invoke-interface/range {v0 .. v7}, Lcom/friday/common/dao/FileDao;->U(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object p0
.end method


# virtual methods
.method public abstract A(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract B(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract C(Ljava/lang/String;J)Landroidx/paging/PagingSource;
.end method

.method public abstract D(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;
.end method

.method public E(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->i(Lcom/friday/common/dao/FileDao;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract F(Ljava/lang/String;J)Landroidx/paging/PagingSource;
.end method

.method public H(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->k(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract J(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract K(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract L(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract M(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->h(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract O()Landroidx/paging/PagingSource;
.end method

.method public abstract P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract Q(Ljava/lang/String;J)Landroidx/paging/PagingSource;
.end method

.method public abstract R(J)Ljava/util/List;
.end method

.method public abstract S(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract T(Ljava/lang/String;J)Ljava/util/List;
.end method

.method public abstract U(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)V
.end method

.method public abstract V(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract W(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract Z(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLvc/c;)Ljava/lang/Object;
.end method

.method public abstract b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract f(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract l(Ljava/lang/String;IZLvc/c;)Ljava/lang/Object;
.end method

.method public abstract m(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract n(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract o(J)Landroidx/paging/PagingSource;
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/common/dao/FileDao;->j(Lcom/friday/common/dao/FileDao;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract s(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract t(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract u(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract v(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract w(Ljava/lang/String;J)Landroidx/paging/PagingSource;
.end method

.method public abstract x(JLvc/c;)Ljava/lang/Object;
.end method

.method public abstract y(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
.end method

.method public z(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/dao/FileDao;->d(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
