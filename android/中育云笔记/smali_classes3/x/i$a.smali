.class public final Lx/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/i;->g(Lx/i;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lx/i;

.field public final synthetic d:Landroid/view/ViewTreeObserver;

.field public final synthetic e:Lx/i$b;


# direct methods
.method public constructor <init>(Lx/i;Landroid/view/ViewTreeObserver;Lx/i$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/i$a;->c:Lx/i;

    .line 2
    .line 3
    iput-object p2, p0, Lx/i$a;->d:Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    iput-object p3, p0, Lx/i$a;->e:Lx/i$b;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lx/i$a;->c:Lx/i;

    .line 2
    .line 3
    iget-object v0, p0, Lx/i$a;->d:Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    iget-object v1, p0, Lx/i$a;->e:Lx/i$b;

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lx/i;->c(Lx/i;Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx/i$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method
