.class final Landroidx/navigation/compose/NavHostKt$NavHost$25$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.navigation.compose.NavHostKt$NavHost$25$1"
    f = "NavHost.kt"
    l = {
        0x20b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

.field final synthetic $currentBackStack$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $progress$delegate:Landroidx/compose/runtime/MutableFloatState;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/ComposeNavigator;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lvc/c<",
            "-",
            "Landroidx/navigation/compose/NavHostKt$NavHost$25$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;-><init>(Landroidx/navigation/compose/ComposeNavigator;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/c;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->invoke(Lvd/c;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/c;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/navigation/NavBackStackEntry;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lvd/c;

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 37
    .line 38
    invoke-static {v1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-le v1, v3, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static {v1, v4}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$41(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 55
    .line 56
    invoke-static {v1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroidx/navigation/NavBackStackEntry;

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v1}, Landroidx/navigation/compose/ComposeNavigator;->prepareForTransition(Landroidx/navigation/NavBackStackEntry;)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 75
    .line 76
    invoke-static {v4}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-object v5, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 81
    .line 82
    invoke-static {v5}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    add-int/lit8 v5, v5, -0x2

    .line 91
    .line 92
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Landroidx/navigation/NavBackStackEntry;

    .line 97
    .line 98
    iget-object v5, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Landroidx/navigation/compose/ComposeNavigator;->prepareForTransition(Landroidx/navigation/NavBackStackEntry;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const/4 v1, 0x0

    .line 105
    :goto_0
    :try_start_1
    new-instance v4, Landroidx/navigation/compose/NavHostKt$NavHost$25$1$1;

    .line 106
    .line 107
    iget-object v5, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 108
    .line 109
    iget-object v6, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;

    .line 110
    .line 111
    iget-object v7, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$progress$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 112
    .line 113
    invoke-direct {v4, v5, v6, v7}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;)V

    .line 114
    .line 115
    .line 116
    iput-object v1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    iput v3, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->label:I

    .line 119
    .line 120
    invoke-interface {p1, v4, p0}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v0, :cond_3

    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_3
    move-object v0, v1

    .line 128
    :goto_1
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 129
    .line 130
    invoke-static {p1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-le p1, v3, :cond_4

    .line 139
    .line 140
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;

    .line 141
    .line 142
    invoke-static {p1, v2}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$44(Landroidx/compose/runtime/MutableState;Z)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0, v2}, Landroidx/navigation/compose/ComposeNavigator;->popBackStack(Landroidx/navigation/NavBackStackEntry;Z)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catch_0
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$currentBackStack$delegate:Landroidx/compose/runtime/State;

    .line 155
    .line 156
    invoke-static {p1}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$38(Landroidx/compose/runtime/State;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-le p1, v3, :cond_4

    .line 165
    .line 166
    iget-object p1, p0, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;->$inPredictiveBack$delegate:Landroidx/compose/runtime/MutableState;

    .line 167
    .line 168
    invoke-static {p1, v2}, Landroidx/navigation/compose/NavHostKt;->access$NavHost$lambda$44(Landroidx/compose/runtime/MutableState;Z)V

    .line 169
    .line 170
    .line 171
    :cond_4
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 172
    .line 173
    return-object p1
.end method
