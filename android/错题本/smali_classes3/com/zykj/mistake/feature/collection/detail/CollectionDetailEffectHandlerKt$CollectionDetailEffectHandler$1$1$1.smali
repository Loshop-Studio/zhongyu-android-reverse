.class final Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/collection/detail/m;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/collection/detail/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1"
    f = "CollectionDetailEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $environment:Lz4/c;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lt4/e;Lcom/zykj/mistake/main/MainShellViewModel;Lw4/c;Lz4/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/e;",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lw4/c;",
            "Lz4/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$environment:Lz4/c;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$environment:Lz4/c;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;-><init>(Lt4/e;Lcom/zykj/mistake/main/MainShellViewModel;Lw4/c;Lz4/c;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/collection/detail/m;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/detail/m;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/m;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->invoke(Lcom/zykj/mistake/feature/collection/detail/m;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/m;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v2, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->label:I

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/g;->a:Lcom/zykj/mistake/feature/collection/detail/g;

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 25
    .line 26
    iget-object v1, v1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_0
    sget-object v2, Lcom/zykj/mistake/feature/collection/detail/k;->a:Lcom/zykj/mistake/feature/collection/detail/k;

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    iput-boolean v2, v1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_1
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/l;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 53
    .line 54
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/l;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/detail/l;->a:Ljava/lang/String;

    .line 57
    .line 58
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/h;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$environment:Lz4/c;

    .line 70
    .line 71
    iget-object v2, v2, Lz4/c;->a:La5/e;

    .line 72
    .line 73
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/h;

    .line 74
    .line 75
    iget-object v3, v1, Lcom/zykj/mistake/feature/collection/detail/h;->a:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/detail/h;->b:Ljava/lang/String;

    .line 78
    .line 79
    sget-object v4, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;->DETAIL_FILTER:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 80
    .line 81
    invoke-virtual {v2, v4, v3, v1}, La5/e;->f(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/i;

    .line 86
    .line 87
    const-string v3, "<this>"

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 92
    .line 93
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/i;

    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 99
    .line 100
    iget-object v5, v1, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v6, v1, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 103
    .line 104
    iget v7, v1, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 105
    .line 106
    iget-object v8, v1, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 107
    .line 108
    iget v9, v1, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 109
    .line 110
    iget v10, v1, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 111
    .line 112
    iget-boolean v11, v1, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 113
    .line 114
    iget-object v12, v1, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 115
    .line 116
    invoke-direct/range {v4 .. v12}, Lcom/zykj/mistake/feature/collection/filter/l;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v1, v2, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 123
    .line 124
    const/4 v8, 0x6

    .line 125
    const/4 v9, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    move-object v5, v4

    .line 129
    move-object v4, v1

    .line 130
    invoke-static/range {v4 .. v9}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/detail/j;

    .line 135
    .line 136
    if-eqz v2, :cond_5

    .line 137
    .line 138
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 139
    .line 140
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/j;

    .line 141
    .line 142
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v4, Lu4/g;

    .line 146
    .line 147
    iget v5, v1, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 148
    .line 149
    iget v6, v1, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 150
    .line 151
    iget-wide v7, v1, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 152
    .line 153
    iget-object v12, v1, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 154
    .line 155
    iget-boolean v13, v1, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 156
    .line 157
    iget-boolean v14, v1, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 158
    .line 159
    iget-object v3, v1, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 160
    .line 161
    iget v9, v1, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const v21, 0x3e800

    .line 166
    .line 167
    .line 168
    move/from16 v17, v9

    .line 169
    .line 170
    const-string v9, ""

    .line 171
    .line 172
    const-string v10, ""

    .line 173
    .line 174
    const-string v11, ""

    .line 175
    .line 176
    const/4 v15, 0x0

    .line 177
    const/16 v18, 0x0

    .line 178
    .line 179
    const/16 v19, 0x0

    .line 180
    .line 181
    move-object/from16 v16, v3

    .line 182
    .line 183
    invoke-direct/range {v4 .. v21}, Lu4/g;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;I)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v2, v4, v1}, Lt4/e;->c(Lu4/g;Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 192
    .line 193
    return-object v1

    .line 194
    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 195
    .line 196
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 197
    .line 198
    .line 199
    throw v1

    .line 200
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 203
    .line 204
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v1
.end method
