.class final Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/view/board/simple/SimpleUIState;",
        "state",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/view/board/simple/SimpleUIState;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1"
    f = "SimpleFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/simple/SimpleFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
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
    new-instance v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lcom/zykj/view/board/simple/SimpleUIState;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleUIState;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/view/board/simple/SimpleUIState;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->invoke(Lcom/zykj/view/board/simple/SimpleUIState;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getMBinding$p(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "mBinding"

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivTouch:Landroidx/appcompat/widget/AppCompatImageView;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->isTouchable()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivSelect:Landroidx/appcompat/widget/AppCompatImageView;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MainToolType;->isSelectChecked()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivPen:Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MainToolType;->isPenChecked()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->ivEraser:Landroidx/appcompat/widget/AppCompatImageView;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getMainToolType()Lcom/zykj/view/board/board/MainToolType;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Lcom/zykj/view/board/board/MainToolType;->isEraserChecked()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {p1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getMBinding$p(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 84
    .line 85
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenType:Landroid/widget/RadioGroup;

    .line 86
    .line 87
    const-string v4, "rgPenType"

    .line 88
    .line 89
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenType()Lcom/zykj/view/board/simple/SimplePenType;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/SimplePenType;->getOrdinal()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-static {v3, v4}, Lcom/zykj/view/utils/ExtKt;->checkAt(Landroid/widget/RadioGroup;I)V

    .line 101
    .line 102
    .line 103
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenSize:Landroid/widget/RadioGroup;

    .line 104
    .line 105
    const-string v4, "rgPenSize"

    .line 106
    .line 107
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenSize()Lcom/zykj/view/board/simple/SimplePenSize;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/SimplePenSize;->getOrdinal()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static {v3, v4}, Lcom/zykj/view/utils/ExtKt;->checkAt(Landroid/widget/RadioGroup;I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 122
    .line 123
    const-string v3, "rgPenColor"

    .line 124
    .line 125
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3}, Lcom/zykj/view/board/board/PenColor;->getOrdinal()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-static {p1, v3}, Lcom/zykj/view/utils/ExtKt;->checkAt(Landroid/widget/RadioGroup;I)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 140
    .line 141
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getMBinding$p(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_1

    .line 146
    .line 147
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 148
    .line 149
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;->rgEraserSize:Landroid/widget/RadioGroup;

    .line 150
    .line 151
    const-string v3, "rgEraserSize"

    .line 152
    .line 153
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getEraserType()Lcom/zykj/view/board/board/EraserType;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3}, Lcom/zykj/view/board/board/EraserType;->getOrdinal()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-static {p1, v3}, Lcom/zykj/view/utils/ExtKt;->checkAt(Landroid/widget/RadioGroup;I)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getMBinding$p(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-eqz p1, :cond_0

    .line 174
    .line 175
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleUIState;->getExpandStatus()Lcom/zykj/view/board/board/ExpandStatus;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExpandStatus;->getIcon()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 186
    .line 187
    .line 188
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 189
    .line 190
    return-object p1

    .line 191
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v1

    .line 195
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v1

    .line 199
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 210
    .line 211
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1
.end method
