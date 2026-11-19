.class public final Lcom/friday/document/view/share/SuspendCall;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhd/l;

.field public b:Lhd/a;

.field public c:Lhd/l;

.field public d:Lhd/a;

.field public e:Lhd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->a:Lhd/l;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/friday/document/view/share/SuspendCall$launch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/view/share/SuspendCall$launch$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/view/share/SuspendCall$launch$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/view/share/SuspendCall$launch$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/view/share/SuspendCall$launch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/view/share/SuspendCall$launch$1;-><init>(Lcom/friday/document/view/share/SuspendCall;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/view/share/SuspendCall$launch$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/view/share/SuspendCall$launch$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->b:Lhd/a;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->a:Lhd/l;

    .line 63
    .line 64
    iput v3, v0, Lcom/friday/document/view/share/SuspendCall$launch$1;->e:I

    .line 65
    .line 66
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/friday/document/view/share/SuspendCall;->e:Lhd/l;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    :cond_5
    iget-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->d:Lhd/a;

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    :goto_2
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_5

    .line 88
    :goto_3
    :try_start_2
    iget-object v0, p0, Lcom/friday/document/view/share/SuspendCall;->c:Lhd/l;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto :goto_6

    .line 98
    :cond_6
    :goto_4
    iget-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->d:Lhd/a;

    .line 99
    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 104
    .line 105
    return-object p1

    .line 106
    :goto_6
    iget-object v0, p0, Lcom/friday/document/view/share/SuspendCall;->d:Lhd/a;

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_8
    throw p1
.end method

.method public final b(Lhd/a;)Lcom/friday/document/view/share/SuspendCall;
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->d:Lhd/a;

    .line 7
    .line 8
    return-object p0
.end method

.method public final c(Lhd/l;)Lcom/friday/document/view/share/SuspendCall;
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->c:Lhd/l;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d(Lhd/a;)Lcom/friday/document/view/share/SuspendCall;
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->b:Lhd/a;

    .line 7
    .line 8
    return-object p0
.end method

.method public final e(Lhd/l;)Lcom/friday/document/view/share/SuspendCall;
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/document/view/share/SuspendCall;->e:Lhd/l;

    .line 7
    .line 8
    return-object p0
.end method
