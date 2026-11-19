.class final Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1"
    f = "EditCategoryViewModel.kt"
    i = {}
    l = {
        0x45
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEditCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1740#2,3:152\n1056#2:155\n3301#2,10:156\n1068#2:166\n1056#2:167\n*S KotlinDebug\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1\n*L\n71#1:152,3\n72#1:155\n80#1:156,10\n81#1:166\n82#1:167\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;-><init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->m(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)Lk6/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->a:I

    .line 34
    .line 35
    invoke-interface {p1, p0}, Lk6/g;->o(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 43
    .line 44
    invoke-static {p1}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    if-eqz p1, :cond_9

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getSort()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v2, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    move-object v4, v3

    .line 109
    check-cast v4, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    cmp-long v4, v4, v6

    .line 118
    .line 119
    if-gtz v4, :cond_5

    .line 120
    .line 121
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    new-instance p1, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-direct {p1, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Ljava/lang/Iterable;

    .line 139
    .line 140
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$c;

    .line 141
    .line 142
    invoke-direct {v2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$c;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Iterable;

    .line 154
    .line 155
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$b;

    .line 156
    .line 157
    invoke-direct {v2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$b;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    goto :goto_4

    .line 169
    :cond_7
    :goto_3
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$a;

    .line 170
    .line 171
    invoke-direct {v1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1$a;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-le v1, v2, :cond_8

    .line 183
    .line 184
    const/4 v1, 0x0

    .line 185
    invoke-static {p1, v1, v2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_4
    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->D(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p1
.end method
