.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->y(ZZLjava/lang/String;Ljava/lang/String;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$getFilesExceptItself$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0x58,
        0x5d,
        0x62
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZLcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->d:Z

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->e:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->h:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->d:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->e:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->g:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->h:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;-><init>(ZZLcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object v6, p0

    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v6, p0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v6, p0

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-boolean p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->d:Z

    .line 46
    .line 47
    if-eqz p1, :cond_7

    .line 48
    .line 49
    iget-boolean p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->e:Z

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->g:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->h:Ljava/lang/String;

    .line 62
    .line 63
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->t()J

    .line 70
    .line 71
    .line 72
    move-result-wide v8

    .line 73
    iput v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->c:I

    .line 74
    .line 75
    move-object v10, p0

    .line 76
    invoke-interface/range {v5 .. v10}, Lcom/friday/common/dao/FileDao;->v(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    move-object v6, v10

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    move-object v6, p0

    .line 88
    iget-object p1, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v2, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->g:Ljava/lang/String;

    .line 95
    .line 96
    move p1, v3

    .line 97
    iget-object v3, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->h:Ljava/lang/String;

    .line 98
    .line 99
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->t()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    iput p1, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->c:I

    .line 110
    .line 111
    invoke-interface/range {v1 .. v6}, Lcom/friday/common/dao/FileDao;->B(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    move-object v6, p0

    .line 122
    iget-object p1, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move p1, v2

    .line 129
    iget-object v2, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->g:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v3, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->h:Ljava/lang/String;

    .line 132
    .line 133
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 134
    .line 135
    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->t()J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    iput p1, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->c:I

    .line 144
    .line 145
    invoke-interface/range {v1 .. v6}, Lcom/friday/common/dao/FileDao;->t(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-ne p1, v0, :cond_8

    .line 150
    .line 151
    :goto_2
    return-object v0

    .line 152
    :cond_8
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 153
    .line 154
    :goto_4
    iget-object v0, v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;->f:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 155
    .line 156
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->k(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/l;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {v0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 164
    .line 165
    return-object p1
.end method
