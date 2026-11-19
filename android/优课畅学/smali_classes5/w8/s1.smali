.class public final synthetic Lw8/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ls8/b;

.field public final synthetic b:Ls8/b;


# direct methods
.method public synthetic constructor <init>(Ls8/b;Ls8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/s1;->a:Ls8/b;

    iput-object p2, p0, Lw8/s1;->b:Ls8/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw8/s1;->a:Ls8/b;

    iget-object v1, p0, Lw8/s1;->b:Ls8/b;

    check-cast p1, Lu8/a;

    invoke-static {v0, v1, p1}, Lw8/t1;->f(Ls8/b;Ls8/b;Lu8/a;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
