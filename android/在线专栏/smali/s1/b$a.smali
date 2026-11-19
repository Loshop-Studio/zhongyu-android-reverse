.class Ls1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrx/Observable$Transformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/b;->c([Ljava/lang/String;)Lrx/Observable$Transformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrx/Observable$Transformer<",
        "Ljava/lang/Object;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Ls1/b;


# direct methods
.method constructor <init>(Ls1/b;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls1/b$a;->b:Ls1/b;

    iput-object p2, p0, Ls1/b$a;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrx/Observable;)Lrx/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/Observable<",
            "Ljava/lang/Object;",
            ">;)",
            "Lrx/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ls1/b$a;->b:Ls1/b;

    iget-object v1, p0, Ls1/b$a;->a:[Ljava/lang/String;

    invoke-static {v0, p1, v1}, Ls1/b;->a(Ls1/b;Lrx/Observable;[Ljava/lang/String;)Lrx/Observable;

    move-result-object p1

    iget-object v0, p0, Ls1/b$a;->a:[Ljava/lang/String;

    array-length v0, v0

    .line 2
    invoke-virtual {p1, v0}, Lrx/Observable;->buffer(I)Lrx/Observable;

    move-result-object p1

    new-instance v0, Ls1/b$a$a;

    invoke-direct {v0, p0}, Ls1/b$a$a;-><init>(Ls1/b$a;)V

    .line 3
    invoke-virtual {p1, v0}, Lrx/Observable;->flatMap(Lrx/functions/Func1;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrx/Observable;

    invoke-virtual {p0, p1}, Ls1/b$a;->a(Lrx/Observable;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method
