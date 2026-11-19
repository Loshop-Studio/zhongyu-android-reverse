.class public final Lcoil3/decode/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/j;


# instance fields
.field public final a:Lcoil3/decode/p;

.field public final b:Ls/l;

.field public final c:Lh7/e;

.field public final d:Lcoil3/decode/m;


# direct methods
.method public constructor <init>(Lcoil3/decode/p;Ls/l;Lh7/e;Lcoil3/decode/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/decode/d;->a:Lcoil3/decode/p;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/decode/d;->b:Ls/l;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/decode/d;->c:Lh7/e;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/decode/d;->d:Lcoil3/decode/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->label:I

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
    iput v1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcoil3/decode/BitmapFactoryDecoder$decode$1;-><init>(Lcoil3/decode/d;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lh7/d;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_4

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object v2, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lh7/d;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p1, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcoil3/decode/d;->c:Lh7/e;

    .line 70
    .line 71
    iput-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    iput v4, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->label:I

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/sync/b;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-ne v2, v1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    :try_start_1
    new-instance v2, Landroidx/navigation/b;

    .line 83
    .line 84
    const/4 v4, 0x5

    .line 85
    invoke-direct {v2, p0, v4}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    iput-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->label:I

    .line 91
    .line 92
    invoke-static {v2, v0}, Lkotlinx/coroutines/x;->A(Landroidx/navigation/b;Lh6/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    if-ne v0, v1, :cond_5

    .line 97
    .line 98
    :goto_2
    return-object v1

    .line 99
    :cond_5
    move-object v5, v0

    .line 100
    move-object v0, p1

    .line 101
    move-object p1, v5

    .line 102
    :goto_3
    :try_start_2
    check-cast p1, Lcoil3/decode/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    .line 104
    check-cast v0, Lkotlinx/coroutines/sync/b;

    .line 105
    .line 106
    invoke-virtual {v0}, Lkotlinx/coroutines/sync/b;->c()V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    move-object v5, v0

    .line 112
    move-object v0, p1

    .line 113
    move-object p1, v5

    .line 114
    :goto_4
    check-cast v0, Lkotlinx/coroutines/sync/b;

    .line 115
    .line 116
    invoke-virtual {v0}, Lkotlinx/coroutines/sync/b;->c()V

    .line 117
    .line 118
    .line 119
    throw p1
.end method
