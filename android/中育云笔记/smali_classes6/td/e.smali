.class public final synthetic Ltd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ltd/f;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ltd/f;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/e;->c:Ltd/f;

    iput-object p2, p0, Ltd/e;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ltd/e;->c:Ltd/f;

    iget-object v1, p0, Ltd/e;->d:Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Ltd/f;->s(Ltd/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
