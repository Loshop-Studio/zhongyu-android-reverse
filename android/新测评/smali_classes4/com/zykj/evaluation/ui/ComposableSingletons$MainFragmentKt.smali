# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;

.field public static b:Lkotlin/jvm/functions/Function3;

.field public static c:Lkotlin/jvm/functions/Function3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->a:Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;

    .line 7
    .line 8
    new-instance v0, Ls5/a;

    .line 9
    .line 10
    invoke-direct {v0}, Ls5/a;-><init>()V

    .line 11
    .line 12
    .line 13
    const v1, -0x1a5b3b7c

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->b:Lkotlin/jvm/functions/Function3;

    .line 22
    .line 23
    new-instance v0, Ls5/b;

    .line 24
    .line 25
    invoke-direct {v0}, Ls5/b;-><init>()V

    .line 26
    .line 27
    .line 28
    const v1, 0x516cd5e3

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->c:Lkotlin/jvm/functions/Function3;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->h(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->g(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->i(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->j(Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    const-string v1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$1366087139.<anonymous> (MainFragment.kt:632)"

    .line 14
    .line 15
    const v2, 0x516cd5e3

    .line 16
    .line 17
    .line 18
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance p2, Ls5/c;

    .line 22
    .line 23
    invoke-direct {p2, p0}, Ls5/c;-><init>(Landroidx/navigation/NavBackStackEntry;)V

    .line 24
    .line 25
    .line 26
    const p0, -0x3df720f6

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    const/16 v1, 0x36

    .line 31
    .line 32
    invoke-static {p0, v0, p2, p1, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p2, "DescriptionPage"

    .line 37
    .line 38
    invoke-static {p2, p0, p1, v1}, Lcom/zykj/evaluation/ui/MainFragmentKt;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final h(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    const-string v1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$1366087139.<anonymous>.<anonymous> (MainFragment.kt:633)"

    .line 26
    .line 27
    const v3, -0x3df720f6

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getArguments()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p2, ""

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    const-string v0, "DESCRIPTION_KEY_TITLE"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    :cond_2
    move-object p0, p2

    .line 50
    :cond_3
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "DESCRIPTION_KEY_CONTENT"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move-object p2, v0

    .line 64
    :goto_1
    invoke-static {p0, p2, p1, v2}, Lcom/zykj/evaluation/ui/description/DescriptionPageKt;->b(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 78
    .line 79
    .line 80
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public static final i(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    const-string v1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$-442186620.<anonymous> (MainFragment.kt:604)"

    .line 14
    .line 15
    const v2, -0x1a5b3b7c

    .line 16
    .line 17
    .line 18
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance p2, Lcom/google/gson/Gson;

    .line 22
    .line 23
    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getArguments()Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, ""

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v2, "PROGRESS_KEY_PROGRESS_TODO"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :cond_2
    new-instance v2, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt$lambda$-442186620$1$todoStudents$1;

    .line 44
    .line 45
    invoke-direct {v2}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt$lambda$-442186620$1$todoStudents$1;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p2, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getArguments()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    const-string v2, "PROGRESS_KEY_PROGRESS_CORRECT"

    .line 65
    .line 66
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v1, p0

    .line 74
    :cond_4
    :goto_0
    new-instance p0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt$lambda$-442186620$1$correctStudents$1;

    .line 75
    .line 76
    invoke-direct {p0}, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt$lambda$-442186620$1$correctStudents$1;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p2, v1, p0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/util/List;

    .line 88
    .line 89
    new-instance p2, Ls5/d;

    .line 90
    .line 91
    invoke-direct {p2, v0, p0}, Ls5/d;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    const p0, 0x5640cdab

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    const/16 v1, 0x36

    .line 99
    .line 100
    invoke-static {p0, v0, p2, p1, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string p2, "ProgressPage"

    .line 105
    .line 106
    invoke-static {p2, p0, p1, v1}, Lcom/zykj/evaluation/ui/MainFragmentKt;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_5

    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 116
    .line 117
    .line 118
    :cond_5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0
.end method

.method public static final j(Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 9

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 v1, p3, 0x1

    .line 10
    .line 11
    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    const-string v1, "com.zykj.evaluation.ui.ComposableSingletons$MainFragmentKt.lambda$-442186620.<anonymous>.<anonymous> (MainFragment.kt:616)"

    .line 25
    .line 26
    const v2, 0x5640cdab

    .line 27
    .line 28
    .line 29
    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x4

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v3, p0

    .line 42
    move-object v4, p1

    .line 43
    move-object v6, p2

    .line 44
    invoke-static/range {v3 .. v8}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt;->n(Ljava/util/List;Ljava/util/List;Lcom/zykj/evaluation/ui/progress/ProgressViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v6, p2

    .line 58
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0
.end method


# virtual methods
.method public final e()Lkotlin/jvm/functions/Function3;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final f()Lkotlin/jvm/functions/Function3;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/ui/ComposableSingletons$MainFragmentKt;->c:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
