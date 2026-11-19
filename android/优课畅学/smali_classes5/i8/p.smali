.class public final Li8/p;
.super Li8/z0;
.source "SourceFile"

# interfaces
.implements Li8/o;


# instance fields
.field public final e:Li8/q;


# direct methods
.method public constructor <init>(Li8/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li8/z0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/p;->e:Li8/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li8/p;->e:Li8/q;

    .line 2
    .line 3
    invoke-virtual {p0}, Li8/d1;->t()Lkotlinx/coroutines/JobSupport;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Li8/q;->b(Li8/l1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/d1;->t()Lkotlinx/coroutines/JobSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/JobSupport;->K(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getParent()Lkotlinx/coroutines/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/d1;->t()Lkotlinx/coroutines/JobSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
