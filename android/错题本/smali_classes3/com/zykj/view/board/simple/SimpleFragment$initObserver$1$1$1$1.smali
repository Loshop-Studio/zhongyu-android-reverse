.class final Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/view/board/simple/SimpleBoardEvent;",
        "event",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/view/board/simple/SimpleBoardEvent;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1"
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
            "Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

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
    new-instance v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lcom/zykj/view/board/simple/SimpleBoardEvent;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleBoardEvent;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/view/board/simple/SimpleBoardEvent;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->invoke(Lcom/zykj/view/board/simple/SimpleBoardEvent;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$ExpandAnimate;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$ExpandAnimate;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$ExpandAnimate;->isOpen()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lcom/zykj/view/board/simple/SimpleFragment;->access$startToolAnimate(Lcom/zykj/view/board/simple/SimpleFragment;Z)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchConfig(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;->getEnable()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEnableFinger(Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchView(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;->getActionMode()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 71
    .line 72
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchConfig(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;->isPenDashed()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;

    .line 85
    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchConfig(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;->getPenSize()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenWidth(F)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 109
    .line 110
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchConfig(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;->getPenColor()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenColor(I)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;

    .line 125
    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 129
    .line 130
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchConfig(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;->getEraserSize()F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEraserSize(F)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    instance-of p1, v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$Clean;

    .line 145
    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->this$0:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 149
    .line 150
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->access$getSketchView(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V

    .line 155
    .line 156
    .line 157
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 161
    .line 162
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 169
    .line 170
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1
.end method
