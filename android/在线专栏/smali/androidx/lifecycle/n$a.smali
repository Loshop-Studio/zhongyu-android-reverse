.class Landroidx/lifecycle/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Landroidx/lifecycle/f$c;

.field b:Landroidx/lifecycle/i;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Landroidx/lifecycle/f$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Landroidx/lifecycle/p;->f(Ljava/lang/Object;)Landroidx/lifecycle/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/n$a;->b:Landroidx/lifecycle/i;

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/n$a;->a:Landroidx/lifecycle/f$c;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/l;Landroidx/lifecycle/f$b;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/lifecycle/f$b;->b()Landroidx/lifecycle/f$c;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/lifecycle/n$a;->a:Landroidx/lifecycle/f$c;

    invoke-static {v1, v0}, Landroidx/lifecycle/n;->k(Landroidx/lifecycle/f$c;Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$c;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/n$a;->a:Landroidx/lifecycle/f$c;

    .line 3
    iget-object v1, p0, Landroidx/lifecycle/n$a;->b:Landroidx/lifecycle/i;

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/i;->d(Landroidx/lifecycle/l;Landroidx/lifecycle/f$b;)V

    .line 4
    iput-object v0, p0, Landroidx/lifecycle/n$a;->a:Landroidx/lifecycle/f$c;

    return-void
.end method
