.class public final Li8/n;
.super Li8/z0;
.source "SourceFile"


# instance fields
.field public final e:Lkotlinx/coroutines/c;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li8/z0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/n;->e:Lkotlinx/coroutines/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li8/n;->e:Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Li8/d1;->t()Lkotlinx/coroutines/JobSupport;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/c;->u(Lkotlinx/coroutines/n;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/c;->L(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
