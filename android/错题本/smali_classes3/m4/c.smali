.class public final Lm4/c;
.super La6/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lm4/d;


# direct methods
.method public constructor <init>(Lm4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm4/c;->b:Lm4/d;

    .line 2
    .line 3
    invoke-direct {p0}, La6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm4/c;->b:Lm4/d;

    .line 7
    .line 8
    invoke-interface {p1}, Lm4/d;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    const-string v0, "file"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm4/c;->b:Lm4/d;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lm4/d;->c(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
