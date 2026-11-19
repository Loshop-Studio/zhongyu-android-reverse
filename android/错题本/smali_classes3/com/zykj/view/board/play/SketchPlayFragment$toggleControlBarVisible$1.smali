.class final Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->toggleControlBarVisible()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1"
    f = "SketchPlayFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n255#2:840\n255#2:841\n257#2,2:842\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n*L\n324#1:840\n332#1:841\n331#1:842,2\n*E\n"
    }
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/play/SketchPlayFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

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
    .locals 1
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
    new-instance p1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "mBinding"

    .line 18
    .line 19
    if-lez p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->groupSeekBar:Landroidx/constraintlayout/widget/Group;

    .line 32
    .line 33
    const-string v0, "groupSeekBar"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$hideSeekBar(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$showSeekBar(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getExtraConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getShowFullscreenButton()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 73
    .line 74
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 83
    .line 84
    const-string v2, "ivFullscreen"

    .line 85
    .line 86
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 90
    .line 91
    invoke-static {v3}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iget-object v0, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 98
    .line 99
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivFullscreen:Landroid/widget/ImageView;

    .line 100
    .line 101
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x0

    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    move v0, v1

    .line 114
    :goto_0
    if-nez v0, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const/16 v1, 0x8

    .line 118
    .line 119
    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_7
    :goto_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 137
    .line 138
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1
.end method
