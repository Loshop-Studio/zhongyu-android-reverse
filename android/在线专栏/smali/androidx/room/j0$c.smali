.class Landroidx/room/j0$c;
.super Landroidx/room/o$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/j0;-><init>(Landroidx/room/h0;Landroidx/room/m;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/room/j0;


# direct methods
.method constructor <init>(Landroidx/room/j0;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/j0$c;->b:Landroidx/room/j0;

    invoke-direct {p0, p2}, Landroidx/room/o$c;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lh/a;->f()Lh/a;

    move-result-object p1

    iget-object v0, p0, Landroidx/room/j0$c;->b:Landroidx/room/j0;

    iget-object v0, v0, Landroidx/room/j0;->j:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Lh/c;->b(Ljava/lang/Runnable;)V

    return-void
.end method
