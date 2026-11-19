.class public final Lcoil3/util/LifecyclesKt$awaitStarted$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/util/LifecyclesKt;->a(Landroidx/lifecycle/Lifecycle;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lsd/j;


# direct methods
.method public constructor <init>(Lsd/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/util/LifecyclesKt$awaitStarted$2$1;->c:Lsd/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onStart(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcoil3/util/LifecyclesKt$awaitStarted$2$1;->c:Lsd/j;

    .line 2
    .line 3
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 4
    .line 5
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
