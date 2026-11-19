.class public final Lsd/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/d$b;
.implements Lkotlin/coroutines/d$c;


# static fields
.field public static final c:Lsd/m2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsd/m2;

    .line 2
    .line 3
    invoke-direct {v0}, Lsd/m2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsd/m2;->c:Lsd/m2;

    .line 7
    .line 8
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


# virtual methods
.method public fold(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkotlin/coroutines/d$b$a;->a(Lkotlin/coroutines/d$b;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/d$b$a;->b(Lkotlin/coroutines/d$b;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()Lkotlin/coroutines/d$c;
    .locals 0

    .line 1
    return-object p0
.end method

.method public minusKey(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/d$b$a;->c(Lkotlin/coroutines/d$b;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/d$b$a;->d(Lkotlin/coroutines/d$b;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
