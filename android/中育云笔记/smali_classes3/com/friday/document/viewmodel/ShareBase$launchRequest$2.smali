.class final Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBase;->i(ZLhd/l;Lhd/l;Ljava/lang/String;Lhd/l;)V
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
    c = "com.friday.document.viewmodel.ShareBase$launchRequest$2"
    f = "ShareBase.kt"
    l = {
        0x1e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareBase;

.field public final synthetic e:Z

.field public final synthetic f:Lhd/l;

.field public final synthetic g:Lhd/l;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->e:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->f:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->g:Lhd/l;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->h:Ljava/lang/String;

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
    new-instance v0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->e:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->f:Lhd/l;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->g:Lhd/l;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->h:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;-><init>(Lcom/friday/document/viewmodel/ShareBase;ZLhd/l;Lhd/l;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-boolean v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->e:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object v3, v1

    .line 48
    check-cast v3, Lz2/b1;

    .line 49
    .line 50
    const/16 v8, 0x9

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x1

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-static/range {v3 .. v9}, Lz2/b1;->b(Lz2/b1;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lz2/b1;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v3, v1

    .line 73
    check-cast v3, Lz2/b1;

    .line 74
    .line 75
    const/16 v8, 0xa

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v4, 0x1

    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    invoke-static/range {v3 .. v9}, Lz2/b1;->b(Lz2/b1;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lz2/b1;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_0
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->f:Lhd/l;

    .line 90
    .line 91
    iput v2, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->c:I

    .line 92
    .line 93
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v0, :cond_3

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->g:Lhd/l;

    .line 101
    .line 102
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->h:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->d:Lcom/friday/document/viewmodel/ShareBase;

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBase;->h()Lvd/l;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v1, v0

    .line 126
    check-cast v1, Lz2/b1;

    .line 127
    .line 128
    iget-object v5, p0, Lcom/friday/document/viewmodel/ShareBase$launchRequest$2;->h:Ljava/lang/String;

    .line 129
    .line 130
    const/4 v6, 0x7

    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v2, 0x0

    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-static/range {v1 .. v7}, Lz2/b1;->b(Lz2/b1;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lz2/b1;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-interface {p1, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 143
    .line 144
    return-object p1
.end method
