.class Lh1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh1/b;


# direct methods
.method constructor <init>(Lh1/b;)V
    .locals 0

    iput-object p1, p0, Lh1/b$a;->a:Lh1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lh1/b$a;->a:Lh1/b;

    invoke-virtual {v0, p1}, Lh1/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
