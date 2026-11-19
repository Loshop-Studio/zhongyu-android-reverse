.class public final Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lvd/d;


# direct methods
.method public constructor <init>(Lvd/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2;->c:Lvd/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->d:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->d:I

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
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lvd/d;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2;->c:Lvd/d;

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    check-cast v2, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    xor-int/2addr v2, v3

    .line 73
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iput-object v4, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iput-object v4, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    iput p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->j:I

    .line 103
    .line 104
    iput v3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2$1;->d:I

    .line 105
    .line 106
    invoke-interface {p2, v2, v0}, Lvd/d;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v1, :cond_3

    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_3
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 114
    .line 115
    return-object p1
.end method
