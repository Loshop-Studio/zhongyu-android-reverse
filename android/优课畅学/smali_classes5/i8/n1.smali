.class public final Li8/n1;
.super Li8/d1;
.source "SourceFile"


# instance fields
.field public final e:Lm7/c;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li8/d1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/n1;->e:Lm7/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li8/n1;->e:Lm7/c;

    .line 2
    .line 3
    sget-object v0, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 4
    .line 5
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Lm7/c;->resumeWith(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
