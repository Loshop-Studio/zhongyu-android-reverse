.class public final Lcom/friday/document/viewmodel/ShareFileViewModel;
.super Lcom/friday/document/viewmodel/ShareBase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final d:Landroid/content/Context;

.field public final e:Ls2/b;

.field public final f:Lvd/l;

.field public final g:Lvd/u;

.field public final h:Ljava/util/LinkedList;

.field public final i:Lvd/l;

.field public final j:Lvd/u;

.field public final k:Lvd/l;

.field public final l:Lvd/l;

.field public final m:Lvd/u;

.field public final n:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ls2/b;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "shareService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/friday/document/viewmodel/ShareBase;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->d:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->e:Ls2/b;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 24
    .line 25
    invoke-static {p2}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->g:Lvd/u;

    .line 30
    .line 31
    new-instance v0, Ljava/util/LinkedList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->h:Ljava/util/LinkedList;

    .line 37
    .line 38
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->i:Lvd/l;

    .line 43
    .line 44
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->j:Lvd/u;

    .line 49
    .line 50
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->l:Lvd/l;

    .line 70
    .line 71
    new-instance v3, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;

    .line 72
    .line 73
    invoke-direct {v3, p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Lvc/c;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p2, v0, v1, v2, v3}, Lvd/e;->j(Lvd/c;Lvd/c;Lvd/c;Lvd/c;Lhd/s;)Lvd/c;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object v0, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    .line 85
    .line 86
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/a$a;->d()Lkotlinx/coroutines/flow/a;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {p1, p2, v1, v2}, Lvd/e;->Q(Lvd/c;Lsd/i0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Lvd/u;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->m:Lvd/u;

    .line 99
    .line 100
    new-instance p2, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1;

    .line 101
    .line 102
    invoke-direct {p2, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1;-><init>(Lvd/c;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/a$a;->c()Lkotlinx/coroutines/flow/a;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {p2, p1, v0, v1}, Lvd/e;->Q(Lvd/c;Lsd/i0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Lvd/u;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->n:Lvd/u;

    .line 122
    .line 123
    return-void
.end method

.method public static synthetic D(Lcom/friday/document/viewmodel/ShareFileViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->C(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final E(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/friday/document/model/StudentShareEntity;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/document/model/StudentShareEntity;->getShareFileList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final F(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic H(Lcom/friday/document/viewmodel/ShareFileViewModel;JZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/ShareFileViewModel;->G(JZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final I(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/friday/document/model/StudentShareEntity;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/document/model/StudentShareEntity;->getShareFileList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final J(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final M(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x10

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-wide v2, p2

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move v6, p6

    .line 12
    invoke-virtual/range {v0 .. v6}, Lcom/friday/document/viewmodel/ShareFileViewModel;->P(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final R(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/util/List;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final S(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic m(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->R(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->J(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->E(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/document/model/ShareFile;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->M(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/document/model/ShareFile;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->I(Lcom/friday/document/viewmodel/ShareFileViewModel;Lcom/friday/common/property/BaseResponse;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->S(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->F(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(Lcom/friday/document/viewmodel/ShareFileViewModel;)Ls2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->e:Ls2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/friday/document/viewmodel/ShareFileViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->l:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->n:Lvd/u;

    .line 2
    .line 3
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public final B()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->m:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C(Z)V
    .locals 8

    .line 1
    new-instance v2, Lcom/friday/document/viewmodel/ShareFileViewModel$getShareList$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$getShareList$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v3, Lz2/d0;

    .line 8
    .line 9
    invoke-direct {v3, p0}, Lz2/d0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lz2/e0;

    .line 13
    .line 14
    invoke-direct {v5, p0}, Lz2/e0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 15
    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v0, p0

    .line 22
    move v1, p1

    .line 23
    invoke-static/range {v0 .. v7}, Lcom/friday/document/viewmodel/ShareBase;->j(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final G(JZ)V
    .locals 8

    .line 1
    new-instance v2, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, p1, p2, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$getTchFileSharedFile$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v3, Lz2/f0;

    .line 8
    .line 9
    invoke-direct {v3, p0}, Lz2/f0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lz2/g0;

    .line 13
    .line 14
    invoke-direct {v5, p0}, Lz2/g0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 15
    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v0, p0

    .line 22
    move v1, p3

    .line 23
    invoke-static/range {v0 .. v7}, Lcom/friday/document/viewmodel/ShareBase;->j(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final K(Lhd/a;)V
    .locals 8

    .line 1
    const-string v0, "onRootRefresh"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 7
    .line 8
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getOwnerName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const/4 v7, 0x1

    .line 37
    move-object v1, p0

    .line 38
    invoke-virtual/range {v1 .. v7}, Lcom/friday/document/viewmodel/ShareFileViewModel;->P(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final L(Ljava/lang/String;J)V
    .locals 10

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v3, p0

    .line 10
    move-object v2, p1

    .line 11
    move-wide v4, p2

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/viewmodel/ShareFileViewModel$setFolderLevelById$1;-><init>(Ljava/lang/String;Lcom/friday/document/viewmodel/ShareFileViewModel;JLvc/c;)V

    .line 13
    .line 14
    .line 15
    move-object v9, v3

    .line 16
    move-object v3, v1

    .line 17
    move-object v1, v9

    .line 18
    new-instance v4, Lz2/j0;

    .line 19
    .line 20
    invoke-direct {v4, p0}, Lz2/j0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 21
    .line 22
    .line 23
    const/16 v7, 0x19

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static/range {v1 .. v8}, Lcom/friday/document/viewmodel/ShareBase;->j(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final N(Lcom/friday/document/model/ShareFile;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->i:Lvd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "0"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->x()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final P(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "shareTime"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ownerName"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move-wide v4, p2

    .line 22
    move-object v6, p4

    .line 23
    move-object v7, p5

    .line 24
    invoke-direct/range {v1 .. v8}, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 25
    .line 26
    .line 27
    move-object v3, v1

    .line 28
    move-object v1, v2

    .line 29
    new-instance v4, Lz2/h0;

    .line 30
    .line 31
    invoke-direct {v4, p0}, Lz2/h0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lz2/i0;

    .line 35
    .line 36
    invoke-direct {v6, p0}, Lz2/i0;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;)V

    .line 37
    .line 38
    .line 39
    const/16 v7, 0x8

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move v2, p6

    .line 43
    invoke-static/range {v1 .. v8}, Lcom/friday/document/viewmodel/ShareBase;->j(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final T(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->l:Lvd/l;

    .line 2
    .line 3
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->p()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->h:Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/friday/document/model/ShareFile;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->h:Ljava/util/LinkedList;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_1
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->h:Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :cond_0
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->f:Lvd/l;

    .line 37
    .line 38
    invoke-interface {v1, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->k:Lvd/l;

    .line 2
    .line 3
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final y()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->g:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel;->j:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
