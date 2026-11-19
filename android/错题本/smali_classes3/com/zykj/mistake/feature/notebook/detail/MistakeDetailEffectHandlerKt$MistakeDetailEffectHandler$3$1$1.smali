.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/mistake/feature/notebook/detail/k1;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/notebook/detail/k1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1"
    f = "MistakeDetailEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $detailEnvironment:Lz4/e;

.field final synthetic $imageLocalPath:Ljava/lang/String;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field final synthetic $uploadMessenger:Landroid/os/Messenger;

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lt4/e;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lz4/e;Lw4/c;Ljava/lang/String;Landroid/os/Messenger;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/e;",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lz4/e;",
            "Lw4/c;",
            "Ljava/lang/String;",
            "Landroid/os/Messenger;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$imageLocalPath:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$uploadMessenger:Landroid/os/Messenger;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 9
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$imageLocalPath:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$uploadMessenger:Landroid/os/Messenger;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;-><init>(Lt4/e;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lz4/e;Lw4/c;Ljava/lang/String;Landroid/os/Messenger;Lh6/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/notebook/detail/k1;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/k1;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/k1;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->invoke(Lcom/zykj/mistake/feature/notebook/detail/k1;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/k1;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->label:I

    .line 10
    .line 11
    if-nez v2, :cond_36

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/r0;

    .line 17
    .line 18
    const-string v3, "nav_result_collection_removed_item_id"

    .line 19
    .line 20
    const-string v4, "nav_result_collection_removed_item_is_mastered"

    .line 21
    .line 22
    const-string v5, "nav_result_notebook_removed_item_id"

    .line 23
    .line 24
    const-string v6, "nav_result_notebook_removed_item_is_mastered"

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/r0;

    .line 29
    .line 30
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/notebook/detail/r0;->a:Z

    .line 31
    .line 32
    iget-boolean v7, v1, Lcom/zykj/mistake/feature/notebook/detail/r0;->c:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 37
    .line 38
    invoke-virtual {v2}, Lt4/e;->b()Landroidx/lifecycle/SavedStateHandle;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const-string v8, "nav_result_refresh_notebook"

    .line 45
    .line 46
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v2, v8, v9}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 52
    .line 53
    const-string v8, "nav_result_collection_detail_refresh_after_practice"

    .line 54
    .line 55
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v2, v9, v8}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/r0;->b:Ljava/lang/Integer;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v2, v8, v6}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v6, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-direct {v6, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v6, v5}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v2, v5, v4}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v3}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 101
    .line 102
    iget-object v1, v1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 105
    .line 106
    .line 107
    goto/16 :goto_d

    .line 108
    .line 109
    :cond_3
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/b1;

    .line 110
    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 114
    .line 115
    new-instance v3, Lcom/zykj/mistake/main/o0;

    .line 116
    .line 117
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/b1;

    .line 118
    .line 119
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/b1;->a:Ljava/util/List;

    .line 120
    .line 121
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 122
    .line 123
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 124
    .line 125
    iget-object v4, v4, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 126
    .line 127
    invoke-interface {v4}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 132
    .line 133
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    .line 134
    .line 135
    invoke-direct {v3, v1, v4}, Lcom/zykj/mistake/main/o0;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_d

    .line 142
    .line 143
    :cond_4
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/d1;

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 148
    .line 149
    new-instance v3, Lcom/zykj/mistake/main/s0;

    .line 150
    .line 151
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/d1;

    .line 152
    .line 153
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/d1;->a:Ljava/util/List;

    .line 154
    .line 155
    invoke-direct {v3, v1}, Lcom/zykj/mistake/main/s0;-><init>(Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_d

    .line 162
    .line 163
    :cond_5
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/u0;->a:Lcom/zykj/mistake/feature/notebook/detail/u0;

    .line 164
    .line 165
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_6

    .line 170
    .line 171
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 172
    .line 173
    sget-object v2, Lcom/zykj/mistake/main/j0;->a:Lcom/zykj/mistake/main/j0;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_d

    .line 179
    .line 180
    :cond_6
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/v0;->a:Lcom/zykj/mistake/feature/notebook/detail/v0;

    .line 181
    .line 182
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 189
    .line 190
    sget-object v2, Lcom/zykj/mistake/main/k0;->a:Lcom/zykj/mistake/main/k0;

    .line 191
    .line 192
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_d

    .line 196
    .line 197
    :cond_7
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/w0;->a:Lcom/zykj/mistake/feature/notebook/detail/w0;

    .line 198
    .line 199
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_8

    .line 204
    .line 205
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 206
    .line 207
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 208
    .line 209
    iget-object v1, v1, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 210
    .line 211
    invoke-interface {v1}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 216
    .line 217
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 218
    .line 219
    iget v3, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 220
    .line 221
    int-to-long v5, v3

    .line 222
    iget-wide v7, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    .line 223
    .line 224
    sget v3, Lcom/zykj/mistake/feature/notebook/detail/s4;->a:F

    .line 225
    .line 226
    iget-object v9, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v11, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    .line 229
    .line 230
    iget-object v12, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    .line 231
    .line 232
    iget-object v13, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    .line 233
    .line 234
    iget-object v10, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    .line 235
    .line 236
    new-instance v4, Lcom/zykj/mistake/entity/EditMistakeData;

    .line 237
    .line 238
    invoke-direct/range {v4 .. v13}, Lcom/zykj/mistake/entity/EditMistakeData;-><init>(JJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    .line 242
    .line 243
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 244
    .line 245
    new-instance v5, Landroidx/navigation/serialization/b;

    .line 246
    .line 247
    const/4 v6, 0x3

    .line 248
    invoke-direct {v5, v3, v6}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iput-object v5, v2, Lz4/e;->f:Landroidx/navigation/serialization/b;

    .line 255
    .line 256
    iget-object v3, v2, Lz4/e;->e:Landroidx/activity/result/ActivityResultLauncher;

    .line 257
    .line 258
    new-instance v5, Landroid/content/Intent;

    .line 259
    .line 260
    iget-object v2, v2, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 261
    .line 262
    const-class v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 263
    .line 264
    invoke-direct {v5, v2, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 265
    .line 266
    .line 267
    const-string v2, "isCustomMistake"

    .line 268
    .line 269
    invoke-virtual {v5, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1, v4}, Lcom/google/gson/g;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    const-string v2, "editMistakeData"

    .line 281
    .line 282
    invoke-virtual {v5, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v5}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_d

    .line 289
    .line 290
    :cond_8
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/i1;->a:Lcom/zykj/mistake/feature/notebook/detail/i1;

    .line 291
    .line 292
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-eqz v2, :cond_9

    .line 297
    .line 298
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 299
    .line 300
    new-instance v2, Lcom/zykj/mistake/main/y0;

    .line 301
    .line 302
    sget-object v3, Lcom/zykj/mistake/main/RemoveDialogTarget;->DETAIL:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 303
    .line 304
    invoke-direct {v2, v3}, Lcom/zykj/mistake/main/y0;-><init>(Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_d

    .line 311
    .line 312
    :cond_9
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/e1;

    .line 313
    .line 314
    if-eqz v2, :cond_a

    .line 315
    .line 316
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 317
    .line 318
    sget-object v7, Lcom/zykj/mistake/main/m0;->a:Lcom/zykj/mistake/main/m0;

    .line 319
    .line 320
    invoke-virtual {v2, v7}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 321
    .line 322
    .line 323
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 324
    .line 325
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 326
    .line 327
    iget-object v2, v2, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 328
    .line 329
    invoke-interface {v2}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 334
    .line 335
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 336
    .line 337
    iget-boolean v8, v2, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 338
    .line 339
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    invoke-virtual {v7, v8, v6}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 347
    .line 348
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/e1;

    .line 349
    .line 350
    iget v7, v1, Lcom/zykj/mistake/feature/notebook/detail/e1;->a:I

    .line 351
    .line 352
    new-instance v8, Ljava/lang/Integer;

    .line 353
    .line 354
    invoke-direct {v8, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v6, v8, v5}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 361
    .line 362
    iget-boolean v2, v2, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 363
    .line 364
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v5, v2, v4}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 372
    .line 373
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/e1;->a:I

    .line 374
    .line 375
    new-instance v4, Ljava/lang/Integer;

    .line 376
    .line 377
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v3}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 384
    .line 385
    iget-object v1, v1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 386
    .line 387
    invoke-virtual {v1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 388
    .line 389
    .line 390
    goto/16 :goto_d

    .line 391
    .line 392
    :cond_a
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 393
    .line 394
    if-eqz v2, :cond_b

    .line 395
    .line 396
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 397
    .line 398
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 399
    .line 400
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/j1;->a:Ljava/lang/String;

    .line 401
    .line 402
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 403
    .line 404
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_d

    .line 408
    .line 409
    :cond_b
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/h1;->a:Lcom/zykj/mistake/feature/notebook/detail/h1;

    .line 410
    .line 411
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_c

    .line 416
    .line 417
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 418
    .line 419
    invoke-static {v1}, Lw4/c;->a(Lw4/c;)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_d

    .line 423
    .line 424
    :cond_c
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 425
    .line 426
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-eqz v2, :cond_d

    .line 431
    .line 432
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 433
    .line 434
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 435
    .line 436
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MainActivity;->c()V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_d

    .line 440
    .line 441
    :cond_d
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/t0;->a:Lcom/zykj/mistake/feature/notebook/detail/t0;

    .line 442
    .line 443
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    const/4 v3, 0x1

    .line 448
    if-eqz v2, :cond_e

    .line 449
    .line 450
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 451
    .line 452
    iput-boolean v3, v1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 453
    .line 454
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 455
    .line 456
    const-string v2, "nav_result_collection_detail_refresh_after_collection_change"

    .line 457
    .line 458
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 459
    .line 460
    invoke-virtual {v1, v3, v2}, Lt4/e;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_d

    .line 464
    .line 465
    :cond_e
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/f1;->a:Lcom/zykj/mistake/feature/notebook/detail/f1;

    .line 466
    .line 467
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_f

    .line 472
    .line 473
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 474
    .line 475
    iput-boolean v3, v1, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 476
    .line 477
    goto/16 :goto_d

    .line 478
    .line 479
    :cond_f
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/g1;

    .line 480
    .line 481
    const/4 v4, 0x0

    .line 482
    if-eqz v2, :cond_13

    .line 483
    .line 484
    new-instance v2, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 485
    .line 486
    invoke-direct {v2}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 487
    .line 488
    .line 489
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 490
    .line 491
    iget-object v5, v5, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 492
    .line 493
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/g1;

    .line 494
    .line 495
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/g1;->a:Ljava/lang/String;

    .line 496
    .line 497
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/g1;->b:Ljava/lang/String;

    .line 498
    .line 499
    if-eqz v6, :cond_11

    .line 500
    .line 501
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-nez v7, :cond_10

    .line 506
    .line 507
    goto :goto_0

    .line 508
    :cond_10
    if-eqz v1, :cond_11

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    if-nez v7, :cond_12

    .line 515
    .line 516
    :cond_11
    :goto_0
    move v3, v4

    .line 517
    :cond_12
    invoke-virtual {v2, v5, v6, v1, v3}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 518
    .line 519
    .line 520
    goto/16 :goto_d

    .line 521
    .line 522
    :cond_13
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/z0;

    .line 523
    .line 524
    if-eqz v2, :cond_14

    .line 525
    .line 526
    sget v2, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 527
    .line 528
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 529
    .line 530
    iget-object v2, v2, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 531
    .line 532
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/z0;

    .line 533
    .line 534
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/z0;->a:Ljava/lang/String;

    .line 535
    .line 536
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/z0;->b:Ljava/lang/Integer;

    .line 537
    .line 538
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/z0;->c:Ljava/lang/Integer;

    .line 539
    .line 540
    invoke-static {v2, v3, v4, v1}, Lio/reactivex/internal/operators/observable/c;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_d

    .line 544
    .line 545
    :cond_14
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;

    .line 546
    .line 547
    if-eqz v2, :cond_17

    .line 548
    .line 549
    sget v2, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 550
    .line 551
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 552
    .line 553
    iget-object v2, v2, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 554
    .line 555
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/y0;

    .line 556
    .line 557
    iget-wide v3, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->a:J

    .line 558
    .line 559
    iget-boolean v5, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->b:Z

    .line 560
    .line 561
    iget-object v6, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->c:Ljava/lang/String;

    .line 562
    .line 563
    iget-object v7, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->d:Ljava/lang/String;

    .line 564
    .line 565
    new-instance v8, Ljava/util/ArrayList;

    .line 566
    .line 567
    iget-object v9, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->e:Ljava/util/List;

    .line 568
    .line 569
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 570
    .line 571
    .line 572
    new-instance v9, Ljava/util/ArrayList;

    .line 573
    .line 574
    iget-object v10, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->f:Ljava/util/List;

    .line 575
    .line 576
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 577
    .line 578
    .line 579
    new-instance v10, Ljava/util/ArrayList;

    .line 580
    .line 581
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/y0;->g:Ljava/util/List;

    .line 582
    .line 583
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 584
    .line 585
    .line 586
    new-instance v1, Landroid/os/Bundle;

    .line 587
    .line 588
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 589
    .line 590
    .line 591
    const-string v11, "itemId"

    .line 592
    .line 593
    invoke-virtual {v1, v11, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 594
    .line 595
    .line 596
    const-string v3, "canOpenCamera"

    .line 597
    .line 598
    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 599
    .line 600
    .line 601
    if-eqz v6, :cond_15

    .line 602
    .line 603
    const-string v3, "noteUrl"

    .line 604
    .line 605
    invoke-virtual {v1, v3, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    :cond_15
    if-eqz v7, :cond_16

    .line 609
    .line 610
    const-string v3, "stemUrl"

    .line 611
    .line 612
    invoke-virtual {v1, v3, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    :cond_16
    const-string v3, "stemPathList"

    .line 616
    .line 617
    invoke-virtual {v1, v3, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 618
    .line 619
    .line 620
    const-string v3, "answerPathList"

    .line 621
    .line 622
    invoke-virtual {v1, v3, v9}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 623
    .line 624
    .line 625
    const-string v3, "revisedAnswerPathList"

    .line 626
    .line 627
    invoke-virtual {v1, v3, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 628
    .line 629
    .line 630
    new-instance v3, Landroid/content/Intent;

    .line 631
    .line 632
    const-class v4, Lcom/zykj/mistake/activity/SketchActivity;

    .line 633
    .line 634
    invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v3, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_d

    .line 644
    .line 645
    :cond_17
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/s0;->a:Lcom/zykj/mistake/feature/notebook/detail/s0;

    .line 646
    .line 647
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-eqz v2, :cond_33

    .line 652
    .line 653
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 654
    .line 655
    iget-object v1, v1, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 656
    .line 657
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 658
    .line 659
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$mainNavController:Lt4/e;

    .line 660
    .line 661
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 662
    .line 663
    iget-object v6, v6, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 664
    .line 665
    iget-object v6, v6, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 666
    .line 667
    invoke-interface {v6}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 672
    .line 673
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 674
    .line 675
    const-string v8, "platformBridge"

    .line 676
    .line 677
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    const-string v8, "mainNavController"

    .line 681
    .line 682
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    const-string v8, "detailState"

    .line 686
    .line 687
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    const-string v8, "getPackageManager(...)"

    .line 695
    .line 696
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    new-instance v8, Landroid/content/Intent;

    .line 700
    .line 701
    const-string v9, "com.zykj.dialogue.ask"

    .line 702
    .line 703
    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    const-string v9, "android.intent.category.DEFAULT"

    .line 707
    .line 708
    invoke-virtual {v8, v9}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 709
    .line 710
    .line 711
    const-string v9, "http://www.zykj.dialogue.ask/"

    .line 712
    .line 713
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 714
    .line 715
    .line 716
    move-result-object v9

    .line 717
    const-string v10, "share/file"

    .line 718
    .line 719
    invoke-virtual {v8, v9, v10}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 720
    .line 721
    .line 722
    const-string v9, "fromOtherApp"

    .line 723
    .line 724
    invoke-virtual {v8, v9, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v8, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    if-eqz v1, :cond_32

    .line 732
    .line 733
    iget-object v1, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 734
    .line 735
    iget-object v3, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 736
    .line 737
    iget-object v8, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    .line 738
    .line 739
    new-instance v11, Ljava/util/ArrayList;

    .line 740
    .line 741
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 742
    .line 743
    .line 744
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v8

    .line 748
    :cond_18
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    .line 750
    .line 751
    move-result v9

    .line 752
    if-eqz v9, :cond_19

    .line 753
    .line 754
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v9

    .line 758
    move-object v10, v9

    .line 759
    check-cast v10, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 760
    .line 761
    iget-object v10, v10, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    .line 762
    .line 763
    sget-object v12, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;->IMAGE:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    .line 764
    .line 765
    if-ne v10, v12, :cond_18

    .line 766
    .line 767
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    goto :goto_1

    .line 771
    :cond_19
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 772
    .line 773
    .line 774
    move-result-object v9

    .line 775
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 776
    .line 777
    .line 778
    move-result-object v8

    .line 779
    iget-object v10, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 780
    .line 781
    iget-object v12, v10, Lcom/zykj/mistake/feature/notebook/detail/q0;->e:Ljava/lang/String;

    .line 782
    .line 783
    iget-object v13, v10, Lcom/zykj/mistake/feature/notebook/detail/q0;->a:Ljava/lang/String;

    .line 784
    .line 785
    if-nez v12, :cond_1a

    .line 786
    .line 787
    const-string v12, ""

    .line 788
    .line 789
    :cond_1a
    move-object/from16 v18, v12

    .line 790
    .line 791
    invoke-static/range {v18 .. v18}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 792
    .line 793
    .line 794
    move-result v12

    .line 795
    if-nez v12, :cond_1b

    .line 796
    .line 797
    new-instance v14, Lcom/zykj/mistake/feature/ask/x;

    .line 798
    .line 799
    sget-object v17, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->IMAGE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 800
    .line 801
    const/16 v20, 0x0

    .line 802
    .line 803
    const/16 v21, 0x30

    .line 804
    .line 805
    const-string v15, "stem_snapshot_0"

    .line 806
    .line 807
    const-string v16, "\u9898\u5e721"

    .line 808
    .line 809
    const/16 v19, 0x0

    .line 810
    .line 811
    invoke-direct/range {v14 .. v21}, Lcom/zykj/mistake/feature/ask/x;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V

    .line 812
    .line 813
    .line 814
    move-object/from16 v12, v18

    .line 815
    .line 816
    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    goto :goto_2

    .line 820
    :cond_1b
    move-object/from16 v12, v18

    .line 821
    .line 822
    if-eqz v13, :cond_1d

    .line 823
    .line 824
    invoke-static {v13}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 825
    .line 826
    .line 827
    move-result v14

    .line 828
    if-eqz v14, :cond_1c

    .line 829
    .line 830
    goto :goto_2

    .line 831
    :cond_1c
    move-object/from16 v18, v13

    .line 832
    .line 833
    new-instance v13, Lcom/zykj/mistake/feature/ask/x;

    .line 834
    .line 835
    sget-object v16, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->WEB:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 836
    .line 837
    const/16 v19, 0x0

    .line 838
    .line 839
    const/16 v20, 0x28

    .line 840
    .line 841
    const-string v14, "stem_web_0"

    .line 842
    .line 843
    const-string v15, "\u9898\u5e721"

    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    invoke-direct/range {v13 .. v20}, Lcom/zykj/mistake/feature/ask/x;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    :cond_1d
    :goto_2
    invoke-static {v12}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 854
    .line 855
    .line 856
    move-result v12

    .line 857
    const/4 v15, 0x0

    .line 858
    if-eqz v12, :cond_22

    .line 859
    .line 860
    iget-object v10, v10, Lcom/zykj/mistake/feature/notebook/detail/q0;->b:Ljava/util/List;

    .line 861
    .line 862
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 863
    .line 864
    .line 865
    move-result v12

    .line 866
    if-eqz v12, :cond_20

    .line 867
    .line 868
    iget-object v10, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    .line 869
    .line 870
    invoke-static {v10}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 871
    .line 872
    .line 873
    move-result v12

    .line 874
    if-nez v12, :cond_1e

    .line 875
    .line 876
    goto :goto_3

    .line 877
    :cond_1e
    move-object v10, v15

    .line 878
    :goto_3
    if-eqz v10, :cond_1f

    .line 879
    .line 880
    invoke-static {v10}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object v10

    .line 884
    goto :goto_4

    .line 885
    :cond_1f
    sget-object v10, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 886
    .line 887
    :cond_20
    :goto_4
    new-instance v12, Ljava/util/ArrayList;

    .line 888
    .line 889
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 890
    .line 891
    .line 892
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 893
    .line 894
    .line 895
    move-result-object v10

    .line 896
    :cond_21
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 897
    .line 898
    .line 899
    move-result v13

    .line 900
    if-eqz v13, :cond_23

    .line 901
    .line 902
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v13

    .line 906
    move-object v14, v13

    .line 907
    check-cast v14, Ljava/lang/String;

    .line 908
    .line 909
    invoke-static {v14}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 910
    .line 911
    .line 912
    move-result v14

    .line 913
    if-nez v14, :cond_21

    .line 914
    .line 915
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    goto :goto_5

    .line 919
    :cond_22
    sget-object v12, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 920
    .line 921
    :cond_23
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 922
    .line 923
    .line 924
    move-result-object v10

    .line 925
    move v12, v4

    .line 926
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 927
    .line 928
    .line 929
    move-result v13

    .line 930
    if-eqz v13, :cond_25

    .line 931
    .line 932
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v13

    .line 936
    add-int/lit8 v14, v12, 0x1

    .line 937
    .line 938
    if-ltz v12, :cond_24

    .line 939
    .line 940
    move-object/from16 v20, v13

    .line 941
    .line 942
    check-cast v20, Ljava/lang/String;

    .line 943
    .line 944
    new-instance v16, Lcom/zykj/mistake/feature/ask/x;

    .line 945
    .line 946
    const-string v13, "stem_"

    .line 947
    .line 948
    invoke-static {v12, v13}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v17

    .line 952
    const-string v12, "\u9898\u5e72"

    .line 953
    .line 954
    invoke-static {v14, v12}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v18

    .line 958
    sget-object v19, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->IMAGE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 959
    .line 960
    const/16 v22, 0x0

    .line 961
    .line 962
    const/16 v23, 0x30

    .line 963
    .line 964
    const/16 v21, 0x0

    .line 965
    .line 966
    invoke-direct/range {v16 .. v23}, Lcom/zykj/mistake/feature/ask/x;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V

    .line 967
    .line 968
    .line 969
    move-object/from16 v12, v16

    .line 970
    .line 971
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move v12, v14

    .line 975
    goto :goto_6

    .line 976
    :cond_24
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 977
    .line 978
    .line 979
    throw v15

    .line 980
    :cond_25
    invoke-virtual {v8}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 981
    .line 982
    .line 983
    move-result-object v8

    .line 984
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v10

    .line 988
    if-eqz v10, :cond_26

    .line 989
    .line 990
    goto :goto_7

    .line 991
    :cond_26
    new-instance v10, Lcom/zykj/mistake/feature/ask/m;

    .line 992
    .line 993
    sget-object v12, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->STEM:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 994
    .line 995
    invoke-direct {v10, v12, v8}, Lcom/zykj/mistake/feature/ask/m;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V

    .line 996
    .line 997
    .line 998
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    :goto_7
    sget-object v10, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->ORIGINAL_ANSWER:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1002
    .line 1003
    iget-boolean v12, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    .line 1004
    .line 1005
    new-instance v13, Ln7/l;

    .line 1006
    .line 1007
    const/16 v8, 0x19

    .line 1008
    .line 1009
    invoke-direct {v13, v8}, Ln7/l;-><init>(I)V

    .line 1010
    .line 1011
    .line 1012
    new-instance v14, Ln7/l;

    .line 1013
    .line 1014
    const/16 v8, 0x1a

    .line 1015
    .line 1016
    invoke-direct {v14, v8}, Ln7/l;-><init>(I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-static/range {v9 .. v14}, Lh4/a;->a(Lkotlin/collections/builders/ListBuilder;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/ArrayList;ZLr6/c;Lr6/c;)V

    .line 1020
    .line 1021
    .line 1022
    sget-object v10, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->REVISED_ANSWER:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1023
    .line 1024
    iget-boolean v12, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    .line 1025
    .line 1026
    new-instance v13, Ln7/l;

    .line 1027
    .line 1028
    const/16 v6, 0x1b

    .line 1029
    .line 1030
    invoke-direct {v13, v6}, Ln7/l;-><init>(I)V

    .line 1031
    .line 1032
    .line 1033
    new-instance v14, Ln7/l;

    .line 1034
    .line 1035
    const/16 v6, 0x1c

    .line 1036
    .line 1037
    invoke-direct {v14, v6}, Ln7/l;-><init>(I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static/range {v9 .. v14}, Lh4/a;->a(Lkotlin/collections/builders/ListBuilder;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/ArrayList;ZLr6/c;Lr6/c;)V

    .line 1041
    .line 1042
    .line 1043
    sget-object v6, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->TYPICAL_RIGHT:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1044
    .line 1045
    iget-object v8, v3, Lcom/zykj/mistake/feature/notebook/detail/n3;->d:Ljava/util/List;

    .line 1046
    .line 1047
    new-instance v10, Le7/t;

    .line 1048
    .line 1049
    const/16 v11, 0xc

    .line 1050
    .line 1051
    invoke-direct {v10, v11}, Le7/t;-><init>(I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-static {v9, v6, v8, v10}, Lh4/a;->b(Lkotlin/collections/builders/ListBuilder;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;Lr6/e;)V

    .line 1055
    .line 1056
    .line 1057
    sget-object v6, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->TYPICAL_ERROR:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1058
    .line 1059
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/detail/n3;->e:Ljava/util/List;

    .line 1060
    .line 1061
    new-instance v8, Le7/t;

    .line 1062
    .line 1063
    const/16 v10, 0xd

    .line 1064
    .line 1065
    invoke-direct {v8, v10}, Le7/t;-><init>(I)V

    .line 1066
    .line 1067
    .line 1068
    invoke-static {v9, v6, v3, v8}, Lh4/a;->b(Lkotlin/collections/builders/ListBuilder;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;Lr6/e;)V

    .line 1069
    .line 1070
    .line 1071
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    .line 1072
    .line 1073
    if-eqz v3, :cond_29

    .line 1074
    .line 1075
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    if-nez v6, :cond_27

    .line 1080
    .line 1081
    move-object/from16 v20, v3

    .line 1082
    .line 1083
    goto :goto_8

    .line 1084
    :cond_27
    move-object/from16 v20, v15

    .line 1085
    .line 1086
    :goto_8
    if-nez v20, :cond_28

    .line 1087
    .line 1088
    goto :goto_9

    .line 1089
    :cond_28
    new-instance v3, Lcom/zykj/mistake/feature/ask/m;

    .line 1090
    .line 1091
    sget-object v6, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->BOARD_NOTE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1092
    .line 1093
    new-instance v16, Lcom/zykj/mistake/feature/ask/x;

    .line 1094
    .line 1095
    sget-object v19, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->IMAGE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 1096
    .line 1097
    const/16 v22, 0x0

    .line 1098
    .line 1099
    const/16 v23, 0x30

    .line 1100
    .line 1101
    const-string v17, "board_note_0"

    .line 1102
    .line 1103
    const-string v18, ""

    .line 1104
    .line 1105
    const/16 v21, 0x0

    .line 1106
    .line 1107
    invoke-direct/range {v16 .. v23}, Lcom/zykj/mistake/feature/ask/x;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V

    .line 1108
    .line 1109
    .line 1110
    invoke-static/range {v16 .. v16}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v8

    .line 1114
    invoke-direct {v3, v6, v8}, Lcom/zykj/mistake/feature/ask/m;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V

    .line 1115
    .line 1116
    .line 1117
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    :cond_29
    :goto_9
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 1121
    .line 1122
    new-instance v3, Ljava/util/ArrayList;

    .line 1123
    .line 1124
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    :cond_2a
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v6

    .line 1135
    if-eqz v6, :cond_2b

    .line 1136
    .line 1137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v6

    .line 1141
    move-object v8, v6

    .line 1142
    check-cast v8, Ljava/lang/String;

    .line 1143
    .line 1144
    invoke-static {v8}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v8

    .line 1148
    if-nez v8, :cond_2a

    .line 1149
    .line 1150
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    goto :goto_a

    .line 1154
    :cond_2b
    new-instance v1, Ljava/util/ArrayList;

    .line 1155
    .line 1156
    const/16 v6, 0xa

    .line 1157
    .line 1158
    invoke-static {v3, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 1159
    .line 1160
    .line 1161
    move-result v6

    .line 1162
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1166
    .line 1167
    .line 1168
    move-result v6

    .line 1169
    move v8, v4

    .line 1170
    :goto_b
    if-ge v8, v6, :cond_2d

    .line 1171
    .line 1172
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v10

    .line 1176
    add-int/lit8 v8, v8, 0x1

    .line 1177
    .line 1178
    add-int/lit8 v11, v4, 0x1

    .line 1179
    .line 1180
    if-ltz v4, :cond_2c

    .line 1181
    .line 1182
    move-object/from16 v20, v10

    .line 1183
    .line 1184
    check-cast v20, Ljava/lang/String;

    .line 1185
    .line 1186
    new-instance v16, Lcom/zykj/mistake/feature/ask/x;

    .line 1187
    .line 1188
    const-string v10, "picture_note_"

    .line 1189
    .line 1190
    invoke-static {v4, v10}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v17

    .line 1194
    const-string v4, "\u56fe\u7247"

    .line 1195
    .line 1196
    invoke-static {v11, v4}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v18

    .line 1200
    sget-object v19, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->IMAGE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 1201
    .line 1202
    const/16 v22, 0x0

    .line 1203
    .line 1204
    const/16 v23, 0x30

    .line 1205
    .line 1206
    const/16 v21, 0x0

    .line 1207
    .line 1208
    invoke-direct/range {v16 .. v23}, Lcom/zykj/mistake/feature/ask/x;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V

    .line 1209
    .line 1210
    .line 1211
    move-object/from16 v4, v16

    .line 1212
    .line 1213
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    move v4, v11

    .line 1217
    goto :goto_b

    .line 1218
    :cond_2c
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 1219
    .line 1220
    .line 1221
    throw v15

    .line 1222
    :cond_2d
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v3

    .line 1226
    if-nez v3, :cond_2e

    .line 1227
    .line 1228
    new-instance v3, Lcom/zykj/mistake/feature/ask/m;

    .line 1229
    .line 1230
    sget-object v4, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->PICTURE_NOTE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 1231
    .line 1232
    invoke-direct {v3, v4, v1}, Lcom/zykj/mistake/feature/ask/m;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V

    .line 1233
    .line 1234
    .line 1235
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    :cond_2e
    invoke-virtual {v9}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    new-instance v9, Lcom/zykj/mistake/feature/ask/f;

    .line 1243
    .line 1244
    invoke-direct {v9, v1}, Lcom/zykj/mistake/feature/ask/f;-><init>(Ljava/util/List;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v3

    .line 1251
    if-eqz v3, :cond_2f

    .line 1252
    .line 1253
    goto :goto_c

    .line 1254
    :cond_2f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    :cond_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v3

    .line 1262
    if-eqz v3, :cond_31

    .line 1263
    .line 1264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    check-cast v3, Lcom/zykj/mistake/feature/ask/m;

    .line 1269
    .line 1270
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    .line 1271
    .line 1272
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v3

    .line 1276
    if-nez v3, :cond_30

    .line 1277
    .line 1278
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/m2;->a:Lcom/zykj/mistake/feature/notebook/detail/m2;

    .line 1279
    .line 1280
    invoke-virtual {v7, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 1281
    .line 1282
    .line 1283
    iget-object v8, v5, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 1284
    .line 1285
    const/4 v12, 0x6

    .line 1286
    const/4 v13, 0x0

    .line 1287
    const/4 v10, 0x0

    .line 1288
    const/4 v11, 0x0

    .line 1289
    invoke-static/range {v8 .. v13}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_d

    .line 1293
    :cond_31
    :goto_c
    const-string v1, "\u6682\u65e0\u53ef\u63d0\u95ee\u7d20\u6750"

    .line 1294
    .line 1295
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 1296
    .line 1297
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_d

    .line 1301
    :cond_32
    const-string v1, "\u672a\u68c0\u6d4b\u5230\u968f\u8eab\u7b54\u5e94\u7528\uff0c\u65e0\u6cd5\u63d0\u95ee"

    .line 1302
    .line 1303
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 1304
    .line 1305
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_d

    .line 1309
    :cond_33
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/a1;->a:Lcom/zykj/mistake/feature/notebook/detail/a1;

    .line 1310
    .line 1311
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v2

    .line 1315
    if-eqz v2, :cond_34

    .line 1316
    .line 1317
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 1318
    .line 1319
    iget-object v1, v6, Lz4/e;->b:Lcom/zykj/mistake/utils/g;

    .line 1320
    .line 1321
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1322
    .line 1323
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$imageLocalPath:Ljava/lang/String;

    .line 1324
    .line 1325
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$platformBridge:Lw4/c;

    .line 1326
    .line 1327
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$uploadMessenger:Landroid/os/Messenger;

    .line 1328
    .line 1329
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/i0;

    .line 1330
    .line 1331
    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/i0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Lz4/e;Lw4/c;Landroid/os/Messenger;)V

    .line 1332
    .line 1333
    .line 1334
    new-instance v2, Landroidx/lifecycle/i;

    .line 1335
    .line 1336
    const/16 v4, 0x9

    .line 1337
    .line 1338
    invoke-direct {v2, v6, v7, v4, v8}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v1, v3, v2}, Lcom/zykj/mistake/utils/g;->a(Lr6/a;Lr6/c;)V

    .line 1342
    .line 1343
    .line 1344
    goto :goto_d

    .line 1345
    :cond_34
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/detail/c1;

    .line 1346
    .line 1347
    if-eqz v2, :cond_35

    .line 1348
    .line 1349
    new-instance v2, Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 1350
    .line 1351
    invoke-direct {v2}, Lcom/zykj/mistake/dialog/ImageDialogFragment;-><init>()V

    .line 1352
    .line 1353
    .line 1354
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$detailEnvironment:Lz4/e;

    .line 1355
    .line 1356
    iget-object v4, v3, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 1357
    .line 1358
    move-object v5, v1

    .line 1359
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/c1;

    .line 1360
    .line 1361
    iget-object v5, v5, Lcom/zykj/mistake/feature/notebook/detail/c1;->a:Ljava/lang/String;

    .line 1362
    .line 1363
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1364
    .line 1365
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/j0;

    .line 1366
    .line 1367
    invoke-direct {v7, v3, v6, v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/j0;-><init>(Lz4/e;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/notebook/detail/k1;Lcom/zykj/mistake/dialog/ImageDialogFragment;)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v2, v4, v5, v7}, Lcom/zykj/mistake/dialog/ImageDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lr6/a;)V

    .line 1371
    .line 1372
    .line 1373
    :goto_d
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 1374
    .line 1375
    return-object v1

    .line 1376
    :cond_35
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 1377
    .line 1378
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1379
    .line 1380
    .line 1381
    throw v1

    .line 1382
    :cond_36
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1383
    .line 1384
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1385
    .line 1386
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    throw v1
.end method
