.class public final synthetic Lp6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp6/j;


# direct methods
.method public synthetic constructor <init>(Lp6/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/i;->a:Lp6/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/i;->a:Lp6/j;

    invoke-static {v0}, Lp6/j;->d(Lp6/j;)V

    return-void
.end method
