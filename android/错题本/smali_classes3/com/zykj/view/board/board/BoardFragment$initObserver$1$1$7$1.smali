.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/view/board/board/GraphToolState;",
        "state",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/view/board/board/GraphToolState;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1"
    f = "BoardFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n*L\n690#1:1031,2\n691#1:1033,2\n692#1:1035,2\n693#1:1037,2\n694#1:1039,2\n695#1:1041,2\n*E\n"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

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
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lcom/zykj/view/board/board/GraphToolState;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/GraphToolState;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/view/board/board/GraphToolState;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->invoke(Lcom/zykj/view/board/board/GraphToolState;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/board/GraphToolState;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_6

    .line 21
    .line 22
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 23
    .line 24
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivImageCamera:Landroidx/appcompat/widget/AppCompatImageView;

    .line 25
    .line 26
    const-string v2, "ivImageCamera"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getCameraVisible()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    move v2, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v2, v3

    .line 43
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivImageGallery:Landroidx/appcompat/widget/AppCompatImageView;

    .line 47
    .line 48
    const-string v2, "ivImageGallery"

    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGalleryVisible()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    move v2, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v2, v3

    .line 62
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivText:Landroidx/appcompat/widget/AppCompatImageView;

    .line 66
    .line 67
    const-string v2, "ivText"

    .line 68
    .line 69
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getTextVisible()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    move v2, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move v2, v3

    .line 81
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivRectangle:Landroidx/appcompat/widget/AppCompatImageView;

    .line 85
    .line 86
    const-string v2, "ivRectangle"

    .line 87
    .line 88
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphVisible()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    move v2, v4

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move v2, v3

    .line 100
    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivOval:Landroidx/appcompat/widget/AppCompatImageView;

    .line 104
    .line 105
    const-string v2, "ivOval"

    .line 106
    .line 107
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphVisible()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    move v2, v4

    .line 117
    goto :goto_4

    .line 118
    :cond_4
    move v2, v3

    .line 119
    :goto_4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivTriangle:Landroid/widget/ImageView;

    .line 123
    .line 124
    const-string v2, "ivTriangle"

    .line 125
    .line 126
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphVisible()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    move v3, v4

    .line 136
    :cond_5
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivRectangle:Landroidx/appcompat/widget/AppCompatImageView;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphType()Lcom/zykj/view/board/board/GraphType;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Lcom/zykj/view/board/board/GraphType;->isRectangleChecked()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivOval:Landroidx/appcompat/widget/AppCompatImageView;

    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphType()Lcom/zykj/view/board/board/GraphType;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lcom/zykj/view/board/board/GraphType;->isOvalChecked()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->ivTriangle:Landroid/widget/ImageView;

    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphToolState;->getGraphType()Lcom/zykj/view/board/board/GraphType;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Lcom/zykj/view/board/board/GraphType;->isTriangleChecked()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 176
    .line 177
    .line 178
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_6
    const-string p1, "mBinding"

    .line 182
    .line 183
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/4 p1, 0x0

    .line 187
    throw p1

    .line 188
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 191
    .line 192
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1
.end method
