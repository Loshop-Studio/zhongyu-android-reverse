.class final Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/TheSketchFragment$initData$1;->onDeleteImagePath(Ljava/lang/String;)V
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
    c = "com.friday.paint.view.TheSketchFragment$initData$1$onDeleteImagePath$1"
    f = "TheSketchFragment.kt"
    l = {
        0x4e,
        0x4f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/TheSketchFragment;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;-><init>(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->c:I

    .line 6
    .line 7
    const-string v2, "/res/"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/friday/paint/view/TheSketchFragment;->M(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 44
    .line 45
    invoke-static {v1}, Lcom/friday/paint/view/TheSketchFragment;->L(Lcom/friday/paint/view/TheSketchFragment;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v5, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->e:Ljava/lang/String;

    .line 50
    .line 51
    new-instance v6, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const/4 v11, 0x4

    .line 70
    const/4 v12, 0x0

    .line 71
    const-string v8, "//"

    .line 72
    .line 73
    const-string v9, "/"

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-static/range {v7 .. v12}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput v4, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->c:I

    .line 81
    .line 82
    invoke-virtual {p1, v1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->s(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/friday/paint/view/TheSketchFragment;->M(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 96
    .line 97
    invoke-static {v1}, Lcom/friday/paint/view/TheSketchFragment;->L(Lcom/friday/paint/view/TheSketchFragment;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v4, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->e:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v5, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const/4 v10, 0x4

    .line 122
    const/4 v11, 0x0

    .line 123
    const-string v7, "//"

    .line 124
    .line 125
    const-string v8, "/"

    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    invoke-static/range {v6 .. v11}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iput v3, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;->c:I

    .line 133
    .line 134
    invoke-virtual {p1, v1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->p(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    :goto_1
    return-object v0

    .line 141
    :cond_4
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 142
    .line 143
    return-object p1
.end method
