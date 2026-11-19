.class final Lcom/friday/paint/view/StudentPaintFragment$initData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/StudentPaintFragment;->initData()V
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
    c = "com.friday.paint.view.StudentPaintFragment$initData$2"
    f = "StudentPaintFragment.kt"
    l = {
        0x5d,
        0x62
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/StudentPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/view/StudentPaintFragment$initData$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$2;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/StudentPaintFragment$initData$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->c:I

    .line 6
    .line 7
    const v2, 0x3e75c28f    # 0.24f

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    if-eq v1, v5, :cond_1

    .line 16
    .line 17
    if-ne v1, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput v5, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->c:I

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->v(Lvc/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->i:Landroid/widget/ImageView;

    .line 68
    .line 69
    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 73
    .line 74
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->i:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput v4, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->c:I

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->t(Lvc/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-ne p1, v0, :cond_5

    .line 96
    .line 97
    :goto_1
    return-object v0

    .line 98
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->p:Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$2;->d:Lcom/friday/paint/view/StudentPaintFragment;

    .line 118
    .line 119
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->p:Landroid/widget/ImageView;

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 126
    .line 127
    .line 128
    :cond_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 129
    .line 130
    return-object p1
.end method
