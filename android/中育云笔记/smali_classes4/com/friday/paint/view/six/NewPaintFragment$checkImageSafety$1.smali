.class final Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->checkImageSafety(Ljava/lang/String;)V
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
    c = "com.friday.paint.view.six.NewPaintFragment$checkImageSafety$1"
    f = "NewPaintFragment.kt"
    l = {
        0x1b1,
        0x1b5,
        0x1ba
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->i:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->g:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->f:I

    .line 36
    .line 37
    iget v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->e:I

    .line 38
    .line 39
    iget-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Lcom/friday/paint/view/six/NewPaintFragment;

    .line 46
    .line 47
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->e:I

    .line 52
    .line 53
    iget-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v6, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lcom/friday/paint/view/six/NewPaintFragment;

    .line 60
    .line 61
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->h:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 69
    .line 70
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->i:Ljava/lang/String;

    .line 71
    .line 72
    :try_start_3
    sget-object v6, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 73
    .line 74
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    new-instance v7, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1$1$riskScore$1;

    .line 79
    .line 80
    invoke-direct {v7, v1, v5}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1$1$riskScore$1;-><init>(Ljava/lang/String;Lvc/c;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->c:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->d:Ljava/lang/Object;

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    iput v8, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->e:I

    .line 89
    .line 90
    iput v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->g:I

    .line 91
    .line 92
    invoke-static {v6, v7, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-ne v4, v0, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move-object v6, p1

    .line 100
    move-object p1, v4

    .line 101
    move-object v4, v1

    .line 102
    move v1, v8

    .line 103
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    new-instance v8, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1$1$1;

    .line 114
    .line 115
    invoke-direct {v8, p1, v5}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1$1$1;-><init>(ILvc/c;)V

    .line 116
    .line 117
    .line 118
    iput-object v6, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v4, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->d:Ljava/lang/Object;

    .line 121
    .line 122
    iput v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->e:I

    .line 123
    .line 124
    iput p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->f:I

    .line 125
    .line 126
    iput v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->g:I

    .line 127
    .line 128
    invoke-static {v7, v8, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-ne v3, v0, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move v3, v1

    .line 136
    move v1, p1

    .line 137
    :goto_1
    invoke-static {v6}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v6, Lcom/friday/common/entity/ImageSafetyEntity;

    .line 142
    .line 143
    invoke-direct {v6, v4, v1}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    iput-object v5, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->c:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v5, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    iput v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->e:I

    .line 151
    .line 152
    iput v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->f:I

    .line 153
    .line 154
    iput v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;->g:I

    .line 155
    .line 156
    invoke-virtual {p1, v6, p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->S(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_6

    .line 161
    .line 162
    :goto_2
    return-object v0

    .line 163
    :cond_6
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 164
    .line 165
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :goto_4
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 170
    .line 171
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 179
    .line 180
    return-object p1
.end method
