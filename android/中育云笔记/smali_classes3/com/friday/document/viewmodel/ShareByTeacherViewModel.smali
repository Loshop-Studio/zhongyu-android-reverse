.class public final Lcom/friday/document/viewmodel/ShareByTeacherViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Ls2/b;

.field public final c:Lvd/l;

.field public final d:Lvd/u;

.field public final e:Lvd/l;

.field public final f:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/b;)V
    .locals 1

    .line 1
    const-string v0, "shareService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->b:Ls2/b;

    .line 10
    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->c:Lvd/l;

    .line 20
    .line 21
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->d:Lvd/u;

    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->e:Lvd/l;

    .line 34
    .line 35
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->f:Lvd/u;

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic e(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->j(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Ls2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->b:Ls2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->e:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->c:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final j(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->e:Lvd/l;

    .line 4
    .line 5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final i(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p0, v1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;-><init>(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;

    .line 8
    .line 9
    invoke-direct {v2, p0, v1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$2;-><init>(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lz2/z;

    .line 13
    .line 14
    invoke-direct {v1, p1, p0}, Lz2/z;-><init>(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v2, v1}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final k()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->d:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Lcom/friday/document/model/TchByCloudEntity;)V
    .locals 12

    .line 1
    const-string v0, "clickedTch"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->c:Lvd/l;

    .line 7
    .line 8
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-static {v0}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-static {v0, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Lcom/friday/document/model/TchByCloudEntity;

    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/friday/document/model/TchByCloudEntity;->getTeacherId()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-virtual {p1}, Lcom/friday/document/model/TchByCloudEntity;->getTeacherId()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    cmp-long v2, v4, v6

    .line 57
    .line 58
    if-nez v2, :cond_0

    .line 59
    .line 60
    const/16 v10, 0xf

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    const-wide/16 v4, 0x0

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x1

    .line 69
    invoke-static/range {v3 .. v11}, Lcom/friday/document/model/TchByCloudEntity;->copy$default(Lcom/friday/document/model/TchByCloudEntity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/friday/document/model/TchByCloudEntity;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    const/16 v10, 0xf

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const-wide/16 v4, 0x0

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    invoke-static/range {v3 .. v11}, Lcom/friday/document/model/TchByCloudEntity;->copy$default(Lcom/friday/document/model/TchByCloudEntity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/friday/document/model/TchByCloudEntity;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->c:Lvd/l;

    .line 92
    .line 93
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final m()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->f:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
