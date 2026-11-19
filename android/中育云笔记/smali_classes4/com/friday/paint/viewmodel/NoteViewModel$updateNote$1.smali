.class final Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NoteViewModel;->Y(Ljava/lang/String;Ljava/lang/String;I)V
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
    c = "com.friday.paint.viewmodel.NoteViewModel$updateNote$1"
    f = "NoteViewModel.kt"
    l = {
        0x17e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/paint/viewmodel/NoteViewModel;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->e:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->h:I

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
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->e:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->h:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->d:I

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
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 32
    .line 33
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 34
    .line 35
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-direct {p1, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/util/Date;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->e:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->f(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v4, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->f:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v5, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->g:Ljava/lang/String;

    .line 58
    .line 59
    iget v6, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->h:I

    .line 60
    .line 61
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;->d:I

    .line 71
    .line 72
    move-object v8, p0

    .line 73
    invoke-interface/range {v3 .. v8}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_2

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 81
    .line 82
    return-object p1
.end method
