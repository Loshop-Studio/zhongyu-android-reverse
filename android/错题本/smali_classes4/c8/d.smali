.class public final Lc8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/g;


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;ZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/d;->a:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-boolean p2, p0, Lc8/d;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lc8/d;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lc8/d;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lc8/d;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lc8/d;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lc8/d;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/d;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lretrofit2/x;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lc8/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, Lc8/a;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, Lc8/d;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lc8/a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {p1, v0, v1}, Lc8/a;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v0, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-boolean p1, p0, Lc8/d;->c:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Lc8/a;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p1, v0, v1}, Lc8/a;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    iget-boolean p1, p0, Lc8/d;->d:Z

    .line 31
    .line 32
    if-eqz p1, :cond_7

    .line 33
    .line 34
    sget-object p1, Lio/reactivex/BackpressureStrategy;->MISSING:Lio/reactivex/BackpressureStrategy;

    .line 35
    .line 36
    new-instance v0, Lx5/a;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lq5/d;->a:[I

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    aget p1, v1, p1

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    if-eq p1, v1, :cond_6

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    if-eq p1, v1, :cond_5

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    if-eq p1, v1, :cond_4

    .line 57
    .line 58
    const/4 v0, 0x4

    .line 59
    if-eq p1, v0, :cond_3

    .line 60
    .line 61
    sget p1, Lq5/b;->a:I

    .line 62
    .line 63
    if-lez p1, :cond_2

    .line 64
    .line 65
    new-instance p1, Lx5/b;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    const-string v1, "capacity > 0 required but it was "

    .line 74
    .line 75
    invoke-static {p1, v1}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_3
    new-instance p1, Lx5/b;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_4
    return-object v0

    .line 90
    :cond_5
    new-instance p1, Lx5/b;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_6
    new-instance p1, Lx5/b;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_7
    iget-boolean p1, p0, Lc8/d;->e:Z

    .line 103
    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    new-instance p1, Lio/reactivex/internal/operators/observable/h;

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-direct {p1, v0}, Lio/reactivex/internal/operators/observable/h;-><init>(I)V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_8
    iget-boolean p1, p0, Lc8/d;->f:Z

    .line 114
    .line 115
    if-eqz p1, :cond_9

    .line 116
    .line 117
    new-instance p1, Lio/reactivex/internal/operators/observable/g;

    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    invoke-direct {p1, v0}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 121
    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_9
    iget-boolean p1, p0, Lc8/d;->g:Z

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    new-instance p1, Lio/reactivex/internal/operators/observable/c;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_a
    return-object v0
.end method
