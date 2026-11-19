.class public final synthetic Lmc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lmc/j;


# direct methods
.method public synthetic constructor <init>(Lmc/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/i;->c:Lmc/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/i;->c:Lmc/j;

    invoke-static {v0}, Lmc/j;->d(Lmc/j;)V

    return-void
.end method
