.class final Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/mistake/feature/notebook/list/y;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/notebook/list/y;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.list.NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1"
    f = "NotebookEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $environment:Lz4/g;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lz4/g;Lcom/zykj/mistake/main/MainShellViewModel;Lt4/e;Lw4/c;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz4/g;",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lt4/e;",
            "Lw4/c;",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$environment:Lz4/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 7
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$environment:Lz4/g;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;-><init>(Lz4/g;Lcom/zykj/mistake/main/MainShellViewModel;Lt4/e;Lw4/c;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/notebook/list/y;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/y;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/y;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->invoke(Lcom/zykj/mistake/feature/notebook/list/y;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/y;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->label:I

    .line 10
    .line 11
    if-nez v2, :cond_e

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/k;->a:Lcom/zykj/mistake/feature/notebook/list/k;

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
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x6

    .line 26
    const-string v3, "MainFloatingButton"

    .line 27
    .line 28
    invoke-static {v2, v3, v1}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$environment:Lz4/g;

    .line 32
    .line 33
    iget-object v1, v1, Lz4/g;->c:Lcom/zykj/mistake/activity/a;

    .line 34
    .line 35
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 36
    .line 37
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 38
    .line 39
    new-instance v4, Landroidx/navigation/e;

    .line 40
    .line 41
    const/16 v5, 0xe

    .line 42
    .line 43
    invoke-direct {v4, v5, v2, v3}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4}, Lcom/zykj/mistake/activity/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_0
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/q;->a:Lcom/zykj/mistake/feature/notebook/list/q;

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    sget v1, Lcom/zykj/mistake/activity/LegacyMistakeActivity;->b:I

    .line 60
    .line 61
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$environment:Lz4/g;

    .line 62
    .line 63
    iget-object v1, v1, Lz4/g;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 64
    .line 65
    new-instance v2, Landroid/content/Intent;

    .line 66
    .line 67
    const-class v3, Lcom/zykj/mistake/activity/LegacyMistakeActivity;

    .line 68
    .line 69
    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_1
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/v;->a:Lcom/zykj/mistake/feature/notebook/list/v;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 86
    .line 87
    new-instance v2, Lcom/zykj/mistake/main/y0;

    .line 88
    .line 89
    sget-object v3, Lcom/zykj/mistake/main/RemoveDialogTarget;->NOTEBOOK:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 90
    .line 91
    invoke-direct {v2, v3}, Lcom/zykj/mistake/main/y0;-><init>(Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :cond_2
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/list/s;

    .line 100
    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 104
    .line 105
    new-instance v3, Lcom/zykj/mistake/main/r0;

    .line 106
    .line 107
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/s;

    .line 108
    .line 109
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/s;->a:Ljava/util/List;

    .line 110
    .line 111
    invoke-direct {v3, v1}, Lcom/zykj/mistake/main/r0;-><init>(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :cond_3
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/list/t;

    .line 120
    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 124
    .line 125
    new-instance v3, Lcom/zykj/mistake/main/s0;

    .line 126
    .line 127
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/t;

    .line 128
    .line 129
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/t;->a:Ljava/util/List;

    .line 130
    .line 131
    invoke-direct {v3, v1}, Lcom/zykj/mistake/main/s0;-><init>(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_4
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/m;->a:Lcom/zykj/mistake/feature/notebook/list/m;

    .line 140
    .line 141
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 148
    .line 149
    sget-object v2, Lcom/zykj/mistake/main/j0;->a:Lcom/zykj/mistake/main/j0;

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_5
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/n;->a:Lcom/zykj/mistake/feature/notebook/list/n;

    .line 157
    .line 158
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_6

    .line 163
    .line 164
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 165
    .line 166
    sget-object v2, Lcom/zykj/mistake/main/k0;->a:Lcom/zykj/mistake/main/k0;

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_6
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/list/p;

    .line 174
    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 178
    .line 179
    new-instance v3, Lcom/zykj/mistake/main/q0;

    .line 180
    .line 181
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/p;

    .line 182
    .line 183
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/list/p;->a:Ljava/util/List;

    .line 184
    .line 185
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/p;->b:Ljava/util/List;

    .line 186
    .line 187
    invoke-direct {v3, v4, v1}, Lcom/zykj/mistake/main/q0;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_7
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/list/r;

    .line 196
    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 200
    .line 201
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/r;

    .line 202
    .line 203
    const-string v3, "<this>"

    .line 204
    .line 205
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v4, Lu4/g;

    .line 209
    .line 210
    iget v5, v1, Lcom/zykj/mistake/feature/notebook/list/r;->a:I

    .line 211
    .line 212
    iget v6, v1, Lcom/zykj/mistake/feature/notebook/list/r;->b:I

    .line 213
    .line 214
    iget-wide v7, v1, Lcom/zykj/mistake/feature/notebook/list/r;->c:J

    .line 215
    .line 216
    iget-object v9, v1, Lcom/zykj/mistake/feature/notebook/list/r;->d:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v10, v1, Lcom/zykj/mistake/feature/notebook/list/r;->e:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v11, v1, Lcom/zykj/mistake/feature/notebook/list/r;->f:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v12, v1, Lcom/zykj/mistake/feature/notebook/list/r;->g:Ljava/lang/String;

    .line 223
    .line 224
    iget-boolean v13, v1, Lcom/zykj/mistake/feature/notebook/list/r;->h:Z

    .line 225
    .line 226
    iget-boolean v14, v1, Lcom/zykj/mistake/feature/notebook/list/r;->i:Z

    .line 227
    .line 228
    iget-boolean v15, v1, Lcom/zykj/mistake/feature/notebook/list/r;->j:Z

    .line 229
    .line 230
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/list/r;->k:Ljava/util/List;

    .line 231
    .line 232
    move-object/from16 v16, v3

    .line 233
    .line 234
    iget v3, v1, Lcom/zykj/mistake/feature/notebook/list/r;->m:I

    .line 235
    .line 236
    const/16 v20, 0x0

    .line 237
    .line 238
    const v21, 0x3e800

    .line 239
    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    move/from16 v17, v3

    .line 246
    .line 247
    invoke-direct/range {v4 .. v21}, Lu4/g;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;I)V

    .line 248
    .line 249
    .line 250
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/r;->l:Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-virtual {v2, v4, v1}, Lt4/e;->c(Lu4/g;Ljava/util/List;)V

    .line 253
    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_8
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/w;->a:Lcom/zykj/mistake/feature/notebook/list/w;

    .line 257
    .line 258
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_9

    .line 263
    .line 264
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 265
    .line 266
    const/4 v2, 0x0

    .line 267
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 268
    .line 269
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/activity/MainActivity;->d(Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_9
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/o;->a:Lcom/zykj/mistake/feature/notebook/list/o;

    .line 274
    .line 275
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_a

    .line 280
    .line 281
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 282
    .line 283
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 284
    .line 285
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MainActivity;->c()V

    .line 286
    .line 287
    .line 288
    goto :goto_0

    .line 289
    :cond_a
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/l;->a:Lcom/zykj/mistake/feature/notebook/list/l;

    .line 290
    .line 291
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    const/4 v3, 0x1

    .line 296
    if-eqz v2, :cond_b

    .line 297
    .line 298
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 299
    .line 300
    iput-boolean v3, v1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 301
    .line 302
    goto :goto_0

    .line 303
    :cond_b
    sget-object v2, Lcom/zykj/mistake/feature/notebook/list/u;->a:Lcom/zykj/mistake/feature/notebook/list/u;

    .line 304
    .line 305
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-eqz v2, :cond_c

    .line 310
    .line 311
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 312
    .line 313
    iput-boolean v3, v1, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 314
    .line 315
    goto :goto_0

    .line 316
    :cond_c
    instance-of v2, v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 317
    .line 318
    if-eqz v2, :cond_d

    .line 319
    .line 320
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 321
    .line 322
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 323
    .line 324
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/list/x;->a:Ljava/lang/String;

    .line 325
    .line 326
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 327
    .line 328
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 332
    .line 333
    return-object v1

    .line 334
    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 335
    .line 336
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 337
    .line 338
    .line 339
    throw v1

    .line 340
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 341
    .line 342
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 343
    .line 344
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v1
.end method
