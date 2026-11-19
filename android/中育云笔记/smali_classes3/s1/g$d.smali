.class public final Ls1/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final c:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic d:Ls1/g;


# direct methods
.method public constructor <init>(Ls1/g;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/g$d;->d:Ls1/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ls1/g$d;->c:Ljava/util/concurrent/CountDownLatch;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/g$d;->c:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls1/g$d;->d:Ls1/g;

    .line 7
    .line 8
    invoke-static {v0}, Ls1/g;->a(Ls1/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
