.class public final Lkotlinx/coroutines/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/f;
.implements Lh6/g;


# static fields
.field public static final a:Lkotlinx/coroutines/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/t1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/t1;->a:Lkotlinx/coroutines/t1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lt6/a;->a(Lh6/f;Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Lh6/g;)Lh6/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lt6/a;->b(Lh6/f;Lh6/g;)Lh6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Lh6/g;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final minusKey(Lh6/g;)Lh6/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lt6/a;->m(Lh6/f;Lh6/g;)Lh6/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Lh6/h;)Lh6/h;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lt6/a;->o(Lh6/h;Lh6/f;)Lh6/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
