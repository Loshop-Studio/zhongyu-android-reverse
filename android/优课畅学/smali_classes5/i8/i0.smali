.class public final Li8/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li8/i0;

.field public static final b:Lkotlinx/coroutines/CoroutineDispatcher;

.field public static final c:Lkotlinx/coroutines/CoroutineDispatcher;

.field public static final d:Lkotlinx/coroutines/CoroutineDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li8/i0;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/i0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li8/i0;->a:Li8/i0;

    .line 7
    .line 8
    sget-object v0, Lp8/b;->g:Lp8/b;

    .line 9
    .line 10
    sput-object v0, Li8/i0;->b:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 11
    .line 12
    sget-object v0, Lkotlinx/coroutines/p;->a:Lkotlinx/coroutines/p;

    .line 13
    .line 14
    sput-object v0, Li8/i0;->c:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 15
    .line 16
    sget-object v0, Lp8/a;->b:Lp8/a;

    .line 17
    .line 18
    sput-object v0, Li8/i0;->d:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    .line 1
    sget-object v0, Li8/i0;->b:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    .line 1
    sget-object v0, Li8/i0;->d:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final c()Li8/h1;
    .locals 1

    .line 1
    sget-object v0, Ln8/t;->b:Li8/h1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    .line 1
    sget-object v0, Li8/i0;->c:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    return-object v0
.end method
