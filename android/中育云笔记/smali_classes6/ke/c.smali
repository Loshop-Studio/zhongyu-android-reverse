.class public final synthetic Lke/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lke/c;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lke/c;->d:Z

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    iget-object v0, p0, Lke/c;->c:Ljava/lang/String;

    iget-boolean v1, p0, Lke/c;->d:Z

    invoke-static {v0, v1, p1}, Lke/d;->b(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    return-object p1
.end method
