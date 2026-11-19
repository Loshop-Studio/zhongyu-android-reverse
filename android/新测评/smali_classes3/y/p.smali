.class public final Ly/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# instance fields
.field public final a:Landroid/view/View;

.field public volatile b:Lkotlinx/coroutines/Deferred;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/p;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Ly/p;->b:Lkotlinx/coroutines/Deferred;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lkotlinx/coroutines/Deferred;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/p;->b:Lkotlinx/coroutines/Deferred;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lkotlinx/coroutines/Deferred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/p;->b:Lkotlinx/coroutines/Deferred;

    .line 2
    .line 3
    return-void
.end method
