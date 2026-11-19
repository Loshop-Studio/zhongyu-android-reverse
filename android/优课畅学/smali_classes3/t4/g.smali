.class public final Lt4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lo4/b;)V
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
    iput-object p1, p0, Lt4/g;->a:Lo4/b;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lt4/g;Ljava/lang/String;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lt4/g;->c(Lt4/g;Ljava/lang/String;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lt4/g;Ljava/lang/String;)Landroidx/paging/PagingSource;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/repository/CourseSearchMediator;

    .line 2
    .line 3
    iget-object p0, p0, Lt4/g;->a:Lo4/b;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/repository/CourseSearchMediator;-><init>(Lo4/b;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ll8/c;
    .locals 10

    .line 1
    const-string v0, "keyword"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/paging/PagingConfig;

    .line 7
    .line 8
    const/16 v8, 0x3e

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct/range {v1 .. v9}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroidx/paging/Pager;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Lt4/f;

    .line 29
    .line 30
    invoke-direct {v3, p0, p1}, Lt4/f;-><init>(Lt4/g;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lx7/a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/paging/Pager;->getFlow()Ll8/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method
