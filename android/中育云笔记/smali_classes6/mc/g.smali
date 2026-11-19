.class public final synthetic Lmc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lmc/j;

.field public final synthetic d:Lnc/a;


# direct methods
.method public synthetic constructor <init>(Lmc/j;Lnc/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/g;->c:Lmc/j;

    iput-object p2, p0, Lmc/g;->d:Lnc/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmc/g;->c:Lmc/j;

    iget-object v1, p0, Lmc/g;->d:Lnc/a;

    invoke-static {v0, v1}, Lmc/j;->f(Lmc/j;Lnc/a;)V

    return-void
.end method
