.class Landroidx/lifecycle/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/n;

.field final b:Landroidx/lifecycle/f$b;

.field private c:Z


# direct methods
.method constructor <init>(Landroidx/lifecycle/n;Landroidx/lifecycle/f$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/lifecycle/a0$a;->c:Z

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/a0$a;->a:Landroidx/lifecycle/n;

    .line 4
    iput-object p2, p0, Landroidx/lifecycle/a0$a;->b:Landroidx/lifecycle/f$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/a0$a;->c:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/lifecycle/a0$a;->a:Landroidx/lifecycle/n;

    iget-object v1, p0, Landroidx/lifecycle/a0$a;->b:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/n;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Landroidx/lifecycle/a0$a;->c:Z

    :cond_0
    return-void
.end method
