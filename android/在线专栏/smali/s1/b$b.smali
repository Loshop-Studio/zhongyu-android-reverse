.class Ls1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrx/functions/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/b;->k(Lrx/Observable;[Ljava/lang/String;)Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrx/functions/Func1<",
        "Ljava/lang/Object;",
        "Lrx/Observable<",
        "Ls1/a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Ls1/b;


# direct methods
.method constructor <init>(Ls1/b;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls1/b$b;->b:Ls1/b;

    iput-object p2, p0, Ls1/b$b;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lrx/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lrx/Observable<",
            "Ls1/a;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Ls1/b$b;->b:Ls1/b;

    iget-object v0, p0, Ls1/b$b;->a:[Ljava/lang/String;

    invoke-static {p1, v0}, Ls1/b;->b(Ls1/b;[Ljava/lang/String;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ls1/b$b;->a(Ljava/lang/Object;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method
