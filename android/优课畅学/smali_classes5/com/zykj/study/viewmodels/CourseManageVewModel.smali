.class public final Lcom/zykj/study/viewmodels/CourseManageVewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final synthetic f:[Le8/k;

.field public static final g:I


# instance fields
.field public final a:Lo4/b;

.field public final b:La8/e;

.field public final c:Ll8/h;

.field public final d:Ll8/h;

.field public final e:Ll8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/study/viewmodels/CourseManageVewModel;

    const-string v2, "courseId"

    const-string v3, "getCourseId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/y;->e(Lkotlin/jvm/internal/MutablePropertyReference1;)Le8/j;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le8/k;

    aput-object v0, v1, v4

    sput-object v1, Lcom/zykj/study/viewmodels/CourseManageVewModel;->f:[Le8/k;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->g:I

    return-void
.end method

.method public constructor <init>(Lo4/b;)V
    .locals 8

    .line 1
    const-string v0, "courseApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a:Lo4/b;

    .line 10
    .line 11
    sget-object p1, La8/a;->a:La8/a;

    .line 12
    .line 13
    invoke-virtual {p1}, La8/a;->a()La8/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->b:La8/e;

    .line 18
    .line 19
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c:Ll8/h;

    .line 28
    .line 29
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->d:Ll8/h;

    .line 38
    .line 39
    new-instance v1, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, v2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;-><init>(Lm7/c;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0, v1}, Ll8/e;->k(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    const/4 v7, 0x0

    .line 57
    const-wide/16 v2, 0x1388

    .line 58
    .line 59
    const-wide/16 v4, 0x0

    .line 60
    .line 61
    invoke-static/range {v1 .. v7}, Lkotlinx/coroutines/flow/a$a;->b(Lkotlinx/coroutines/flow/a$a;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/a;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1, v0, v1, v2}, Ll8/e;->R(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->e:Ll8/q;

    .line 74
    .line 75
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a:Lo4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/viewmodels/CourseManageVewModel;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->d:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/zykj/study/viewmodels/CourseManageVewModel;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->k(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final f()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->e:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->b:La8/e;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/study/viewmodels/CourseManageVewModel;->f:[Le8/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, La8/e;->getValue(Ljava/lang/Object;Le8/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final h(J)V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, p1, p2, v0}, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i(JZ)V
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v3, p1

    .line 6
    move v2, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;ZJLm7/c;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move-object v3, v0

    .line 14
    move-object v0, p0

    .line 15
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j(JZ)V
    .locals 10

    .line 1
    xor-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setChapterLocked -> ["

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "]: "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c:Ll8/h;

    .line 36
    .line 37
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Iterable;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v2, v1

    .line 58
    check-cast v2, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    cmp-long v2, v2, p1

    .line 65
    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 v1, 0x0

    .line 70
    :goto_0
    check-cast v1, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    new-instance v3, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v1, 0xa

    .line 83
    .line 84
    invoke-static {v0, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    new-instance v1, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    move-object v2, p0

    .line 123
    move-wide v5, p1

    .line 124
    move v4, p3

    .line 125
    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;Ljava/util/List;ZJLm7/c;)V

    .line 126
    .line 127
    .line 128
    const/4 v8, 0x3

    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v6, 0x0

    .line 132
    move-object v4, p0

    .line 133
    move-object v7, v1

    .line 134
    invoke-static/range {v4 .. v9}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 135
    .line 136
    .line 137
    :cond_3
    return-void
.end method

.method public final k(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel;->b:La8/e;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/study/viewmodels/CourseManageVewModel;->f:[Le8/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, La8/e;->setValue(Ljava/lang/Object;Le8/k;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l(JZ)V
    .locals 7

    .line 1
    xor-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setKnowledgeLocked -> ["

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "]: "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v3, p0

    .line 39
    move-wide v4, p1

    .line 40
    move v2, p3

    .line 41
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;-><init>(ZLcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x3

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v4, v1

    .line 48
    move-object v1, p0

    .line 49
    invoke-static/range {v1 .. v6}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 50
    .line 51
    .line 52
    return-void
.end method
