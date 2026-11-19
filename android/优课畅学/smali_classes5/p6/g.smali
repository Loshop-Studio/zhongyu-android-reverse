.class public final synthetic Lp6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp6/j;

.field public final synthetic b:Lq6/a;


# direct methods
.method public synthetic constructor <init>(Lp6/j;Lq6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/g;->a:Lp6/j;

    iput-object p2, p0, Lp6/g;->b:Lq6/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp6/g;->a:Lp6/j;

    iget-object v1, p0, Lp6/g;->b:Lq6/a;

    invoke-static {v0, v1}, Lp6/j;->f(Lp6/j;Lq6/a;)V

    return-void
.end method
