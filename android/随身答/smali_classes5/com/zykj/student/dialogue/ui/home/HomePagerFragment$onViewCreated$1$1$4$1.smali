.class final Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/home/b;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/b;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/home/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$4$1"
    f = "HomePagerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomePagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n827#2:289\n855#2,2:290\n*S KotlinDebug\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1\n*L\n188#1:289\n188#1:290,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;J)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->g(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;J)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->n(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/b$b;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/b$b;->a()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->y(Ljava/util/List;J)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/zykj/student/dialogue/ui/home/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/b;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c(Lcom/zykj/student/dialogue/ui/home/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/b;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_6

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/b$b;

    .line 16
    .line 17
    if-eqz p1, :cond_5

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/b$b;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/b$b;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->o(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Lh6/b$a$c;

    .line 39
    .line 40
    const-string v1, "\u672a\u9009\u4e2d\u4efb\u4f55\u95ee\u9898\uff0c\u4e0d\u80fd\u79fb\u52a8"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lh6/b$a$c;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/base/BaseViewModel;->g(Lh6/b;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    const-class p1, Lcom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x1

    .line 74
    if-ne v1, v2, :cond_1

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_1
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 80
    .line 81
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->o(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ls6/s2;

    .line 94
    .line 95
    invoke-virtual {v1}, Ls6/s2;->d()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 100
    .line 101
    new-instance v3, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v5, v4

    .line 121
    check-cast v5, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 124
    .line 125
    .line 126
    move-result-wide v5

    .line 127
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->o(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-interface {v7}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Ls6/s2;

    .line 140
    .line 141
    invoke-virtual {v7}, Ls6/s2;->f()Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    if-nez v7, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v7

    .line 152
    cmp-long v5, v5, v7

    .line 153
    .line 154
    if-nez v5, :cond_3

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_3
    :goto_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_4
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 162
    .line 163
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/m;

    .line 164
    .line 165
    invoke-direct {v2, v1, v0}, Lcom/zykj/student/dialogue/ui/home/m;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment;

    .line 169
    .line 170
    invoke-direct {v0, v3, v2}, Lcom/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->c:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    .line 174
    .line 175
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/DialogFragment;->showNow(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 188
    .line 189
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1
.end method
