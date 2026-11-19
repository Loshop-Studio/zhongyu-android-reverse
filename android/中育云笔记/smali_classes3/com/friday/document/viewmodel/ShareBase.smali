.class public abstract Lcom/friday/document/viewmodel/ShareBase;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lvd/l;

.field public final c:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz2/b1;

    .line 5
    .line 6
    const/16 v5, 0xf

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct/range {v0 .. v6}, Lz2/b1;-><init>(ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/friday/document/viewmodel/ShareBase;->b:Lvd/l;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/friday/document/viewmodel/ShareBase;->c:Lvd/u;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic e(Lcom/friday/document/viewmodel/ShareBase;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/viewmodel/ShareBase;->l(Lcom/friday/document/viewmodel/ShareBase;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/viewmodel/ShareBase;->k(Ljava/lang/Object;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p7, :cond_4

    .line 2
    .line 3
    and-int/lit8 p7, p6, 0x1

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    and-int/lit8 p7, p6, 0x4

    .line 9
    .line 10
    if-eqz p7, :cond_1

    .line 11
    .line 12
    new-instance p3, Lz2/u;

    .line 13
    .line 14
    invoke-direct {p3}, Lz2/u;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_1
    and-int/lit8 p7, p6, 0x8

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p7, :cond_2

    .line 21
    .line 22
    move-object p4, v0

    .line 23
    :cond_2
    and-int/lit8 p6, p6, 0x10

    .line 24
    .line 25
    if-eqz p6, :cond_3

    .line 26
    .line 27
    move-object p7, v0

    .line 28
    move-object p5, p3

    .line 29
    move-object p6, p4

    .line 30
    move p3, p1

    .line 31
    move-object p4, p2

    .line 32
    move-object p2, p0

    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move-object p7, p5

    .line 35
    move-object p6, p4

    .line 36
    move-object p4, p2

    .line 37
    move-object p5, p3

    .line 38
    move-object p2, p0

    .line 39
    move p3, p1

    .line 40
    :goto_0
    invoke-virtual/range {p2 .. p7}, Lcom/friday/document/viewmodel/ShareBase;->i(ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 45
    .line 46
    const-string p1, "Super calls with default arguments not supported in this target, function: launchRequest"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static final k(Ljava/lang/Object;)Lqc/q;
    .locals 0

    .line 1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final l(Lcom/friday/document/viewmodel/ShareBase;)Lqc/q;
    .locals 8

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBase;->b:Lvd/l;

    .line 2
    .line 3
    invoke-interface {p0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lz2/b1;

    .line 9
    .line 10
    const/16 v6, 0xc

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static/range {v1 .. v7}, Lz2/b1;->b(Lz2/b1;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lz2/b1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public final g()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBase;->c:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lvd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBase;->b:Lvd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;)V
    .locals 8

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    move-object v6, p4

    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;-><init>(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lvc/c;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {p1, p0, p5, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$3;-><init>(Lcom/friday/document/viewmodel/ShareBase;Lhd/l;Lvc/c;)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Lz2/v;

    .line 29
    .line 30
    invoke-direct {p2, p0}, Lz2/v;-><init>(Lcom/friday/document/viewmodel/ShareBase;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1, p1, p2}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
