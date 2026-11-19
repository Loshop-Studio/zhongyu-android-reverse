.class Lg1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/d;->a(Landroidx/lifecycle/LiveData;Lj/a;Lh1/a;)Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/t<",
        "TIn;>;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TOut;"
        }
    .end annotation
.end field

.field final synthetic b:Lh1/a;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lj/a;

.field final synthetic e:Landroidx/lifecycle/q;


# direct methods
.method constructor <init>(Lh1/a;Ljava/lang/Object;Lj/a;Landroidx/lifecycle/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg1/d$a;->b:Lh1/a;

    iput-object p2, p0, Lg1/d$a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lg1/d$a;->d:Lj/a;

    iput-object p4, p0, Lg1/d$a;->e:Landroidx/lifecycle/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lg1/d$a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TIn;)V"
        }
    .end annotation

    iget-object v0, p0, Lg1/d$a;->b:Lh1/a;

    new-instance v1, Lg1/d$a$a;

    invoke-direct {v1, p0, p1}, Lg1/d$a$a;-><init>(Lg1/d$a;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method
