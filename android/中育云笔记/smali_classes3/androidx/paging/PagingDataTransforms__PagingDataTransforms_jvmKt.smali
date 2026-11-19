.class final synthetic Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final filter(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lhd/l;)Landroidx/paging/PagingData;
    .locals 8
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PagingData<",
            "TT;>;"
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
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "predicate"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/paging/PagingData;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getFlow$paging_common()Lvd/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1;

    .line 23
    .line 24
    invoke-direct {v2, v0, p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1;-><init>(Lvd/c;Ljava/util/concurrent/Executor;Lhd/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getUiReceiver$paging_common()Landroidx/paging/UiReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getHintReceiver$paging_common()Landroidx/paging/HintReceiver;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/16 v6, 0x8

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct/range {v1 .. v7}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public static final flatMap(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lhd/l;)Landroidx/paging/PagingData;
    .locals 8
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PagingData<",
            "TR;>;"
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
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "transform"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/paging/PagingData;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getFlow$paging_common()Lvd/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;

    .line 23
    .line 24
    invoke-direct {v2, v0, p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;-><init>(Lvd/c;Ljava/util/concurrent/Executor;Lhd/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getUiReceiver$paging_common()Landroidx/paging/UiReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getHintReceiver$paging_common()Landroidx/paging/HintReceiver;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/16 v6, 0x8

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct/range {v1 .. v7}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public static final insertSeparators(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/util/concurrent/Executor;Lhd/p;)Landroidx/paging/PagingData;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T::TR;>(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Landroidx/paging/TerminalSeparatorType;",
            "Ljava/util/concurrent/Executor;",
            "Lhd/p;",
            ")",
            "Landroidx/paging/PagingData<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "terminalSeparatorType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1;-><init>(Ljava/util/concurrent/Executor;Lhd/p;Lvc/c;)V

    invoke-static {p0, p1, v0}, Landroidx/paging/PagingDataTransforms;->insertSeparators(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Lhd/q;)Landroidx/paging/PagingData;

    move-result-object p0

    return-object p0
.end method

.method public static final insertSeparators(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lhd/p;)Landroidx/paging/PagingData;
    .locals 7
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T::TR;>(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lhd/p;",
            ")",
            "Landroidx/paging/PagingData<",
            "TR;>;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Landroidx/paging/PagingDataTransforms;->insertSeparators$default(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/util/concurrent/Executor;Lhd/p;ILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic insertSeparators$default(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/util/concurrent/Executor;Lhd/p;ILjava/lang/Object;)Landroidx/paging/PagingData;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/paging/TerminalSeparatorType;->FULLY_COMPLETE:Landroidx/paging/TerminalSeparatorType;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/paging/PagingDataTransforms;->insertSeparators(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/util/concurrent/Executor;Lhd/p;)Landroidx/paging/PagingData;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final map(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lhd/l;)Landroidx/paging/PagingData;
    .locals 8
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PagingData<",
            "TR;>;"
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
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "transform"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/paging/PagingData;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getFlow$paging_common()Lvd/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1;

    .line 23
    .line 24
    invoke-direct {v2, v0, p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1;-><init>(Lvd/c;Ljava/util/concurrent/Executor;Lhd/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getUiReceiver$paging_common()Landroidx/paging/UiReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, Landroidx/paging/PagingData;->getHintReceiver$paging_common()Landroidx/paging/HintReceiver;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/16 v6, 0x8

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct/range {v1 .. v7}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method
