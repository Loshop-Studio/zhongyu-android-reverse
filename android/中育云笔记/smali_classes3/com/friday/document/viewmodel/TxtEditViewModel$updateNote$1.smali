.class final Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/TxtEditViewModel;->n(Ljava/lang/String;Ljava/lang/String;I)V
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
    c = "com.friday.document.viewmodel.TxtEditViewModel$updateNote$1"
    f = "TxtEditViewModel.kt"
    l = {
        0x4b,
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/document/viewmodel/TxtEditViewModel;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->f:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->i:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->f:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->i:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;-><init>(Lcom/friday/document/viewmodel/TxtEditViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v8, p0

    .line 27
    goto :goto_2

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
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    move-object v7, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 49
    .line 50
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 51
    .line 52
    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 53
    .line 54
    invoke-direct {p1, v1, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Ljava/util/Date;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->f:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->g(Lcom/friday/document/viewmodel/TxtEditViewModel;)Lcom/friday/common/dao/FileDao;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v4, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    iput v3, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->e:I

    .line 77
    .line 78
    invoke-interface {p1, v4, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_2

    .line 83
    .line 84
    move-object v8, p0

    .line 85
    goto :goto_1

    .line 86
    :goto_0
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->f:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 89
    .line 90
    invoke-static {v1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->g(Lcom/friday/document/viewmodel/TxtEditViewModel;)Lcom/friday/common/dao/FileDao;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v4, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v5, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->h:Ljava/lang/String;

    .line 97
    .line 98
    iget v6, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->i:I

    .line 99
    .line 100
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object p1, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->d:Ljava/lang/Object;

    .line 110
    .line 111
    iput v2, p0, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->e:I

    .line 112
    .line 113
    move-object v8, p0

    .line 114
    invoke-interface/range {v3 .. v8}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-ne v1, v0, :cond_4

    .line 119
    .line 120
    :goto_1
    return-object v0

    .line 121
    :cond_4
    move-object v0, p1

    .line 122
    :goto_2
    iget-object p1, v8, Lcom/friday/document/viewmodel/TxtEditViewModel$updateNote$1;->f:Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/TxtEditViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 132
    .line 133
    return-object p1
.end method
