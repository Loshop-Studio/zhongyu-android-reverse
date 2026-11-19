.class final Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;->a(Ljava/util/ArrayList;)V
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
    c = "com.friday.lecture.floatwindow.homework.HomeworkLayout$initView$8$1$onResult$1"
    f = "HomeworkLayout.kt"
    l = {
        0xb2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->i:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

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
    new-instance p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->i:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;-><init>(Ljava/util/ArrayList;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->g:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    if-eqz p1, :cond_6

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->j()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->h:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_3
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->i:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 94
    .line 95
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v5, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1$1$1;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-direct {v5, p1, v6}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1$1$1;-><init>(Ljava/lang/String;Lvc/c;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iput-object v6, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v3, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->e:Ljava/lang/Object;

    .line 118
    .line 119
    iput v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->f:I

    .line 120
    .line 121
    iput v2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;->g:I

    .line 122
    .line 123
    invoke-static {v4, v5, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v0, :cond_4

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_4
    move-object v0, v3

    .line 131
    :goto_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 132
    .line 133
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y(Landroid/graphics/Bitmap;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    sget-object p1, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b;->i()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    :goto_1
    sget-object p1, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/homework/b;->i()V

    .line 154
    .line 155
    .line 156
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 157
    .line 158
    return-object p1
.end method
