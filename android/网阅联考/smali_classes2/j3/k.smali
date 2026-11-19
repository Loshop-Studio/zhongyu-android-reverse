.class public final synthetic Lj3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj3/j$b$a;

.field public final synthetic b:Lj3/d;

.field public final synthetic c:Lj3/d0;


# direct methods
.method public synthetic constructor <init>(Lj3/j$b$a;Lj3/d;Lj3/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/k;->a:Lj3/j$b$a;

    iput-object p2, p0, Lj3/k;->b:Lj3/d;

    iput-object p3, p0, Lj3/k;->c:Lj3/d0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj3/k;->a:Lj3/j$b$a;

    iget-object v1, p0, Lj3/k;->b:Lj3/d;

    iget-object v2, p0, Lj3/k;->c:Lj3/d0;

    invoke-static {v0, v1, v2}, Lj3/j$b$a;->d(Lj3/j$b$a;Lj3/d;Lj3/d0;)V

    return-void
.end method
