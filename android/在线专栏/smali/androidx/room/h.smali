.class final Landroidx/room/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c$c;


# instance fields
.field private final a:Ls0/c$c;

.field private final b:Landroidx/room/a;


# direct methods
.method constructor <init>(Ls0/c$c;Landroidx/room/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/h;->a:Ls0/c$c;

    .line 3
    iput-object p2, p0, Landroidx/room/h;->b:Landroidx/room/a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ls0/c$b;)Ls0/c;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/h;->b(Ls0/c$b;)Landroidx/room/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Ls0/c$b;)Landroidx/room/f;
    .locals 2

    new-instance v0, Landroidx/room/f;

    iget-object v1, p0, Landroidx/room/h;->a:Ls0/c$c;

    invoke-interface {v1, p1}, Ls0/c$c;->a(Ls0/c$b;)Ls0/c;

    move-result-object p1

    iget-object v1, p0, Landroidx/room/h;->b:Landroidx/room/a;

    invoke-direct {v0, p1, v1}, Landroidx/room/f;-><init>(Ls0/c;Landroidx/room/a;)V

    return-object v0
.end method
