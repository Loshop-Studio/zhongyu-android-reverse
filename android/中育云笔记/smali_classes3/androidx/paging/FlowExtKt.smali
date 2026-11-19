.class public final Landroidx/paging/FlowExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field private static final NULL:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/paging/FlowExtKt;->NULL:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic access$getNULL$p()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroidx/paging/FlowExtKt;->NULL:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final combineWithoutBatching(Lvd/c;Lvd/c;Lhd/r;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lvd/c;",
            "Lhd/r;",
            "Lvc/c<",
            "-",
            "Lvd/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p3, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;-><init>(Lvd/c;Lvd/c;Lhd/r;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Landroidx/paging/SimpleChannelFlowKt;->simpleChannelFlow(Lhd/p;)Lvd/c;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final combineWithoutBatching$$forInline(Lvd/c;Lvd/c;Lhd/r;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lvd/c;",
            "Lhd/r;",
            "Lvc/c<",
            "-",
            "Lvd/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p3, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2;-><init>(Lvd/c;Lvd/c;Lhd/r;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Landroidx/paging/SimpleChannelFlowKt;->simpleChannelFlow(Lhd/p;)Lvd/c;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final simpleFlatMapLatest(Lvd/c;Lhd/p;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lhd/p;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transform"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/paging/FlowExtKt$simpleFlatMapLatest$1;-><init>(Lhd/p;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Landroidx/paging/FlowExtKt;->simpleTransformLatest(Lvd/c;Lhd/q;)Lvd/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final simpleMapLatest(Lvd/c;Lhd/p;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lhd/p;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transform"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/FlowExtKt$simpleMapLatest$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/paging/FlowExtKt$simpleMapLatest$1;-><init>(Lhd/p;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Landroidx/paging/FlowExtKt;->simpleTransformLatest(Lvd/c;Lhd/q;)Lvd/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final simpleRunningReduce(Lvd/c;Lhd/q;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lhd/q;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "operation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/FlowExtKt$simpleRunningReduce$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, v1}, Landroidx/paging/FlowExtKt$simpleRunningReduce$1;-><init>(Lvd/c;Lhd/q;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lvd/e;->B(Lhd/p;)Lvd/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final simpleScan(Lvd/c;Ljava/lang/Object;Lhd/q;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "TR;",
            "Lhd/q;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "operation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/FlowExtKt$simpleScan$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, p0, p2, v1}, Landroidx/paging/FlowExtKt$simpleScan$1;-><init>(Ljava/lang/Object;Lvd/c;Lhd/q;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lvd/e;->B(Lhd/p;)Lvd/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final simpleTransformLatest(Lvd/c;Lhd/q;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lhd/q;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transform"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/FlowExtKt$simpleTransformLatest$1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, v1}, Landroidx/paging/FlowExtKt$simpleTransformLatest$1;-><init>(Lvd/c;Lhd/q;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/paging/SimpleChannelFlowKt;->simpleChannelFlow(Lhd/p;)Lvd/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
