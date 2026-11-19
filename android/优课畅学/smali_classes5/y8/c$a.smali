.class public Ly8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/c;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly8/c;


# direct methods
.method public constructor <init>(Ly8/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c$a;->a:Ly8/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/c$a;->a:Ly8/c;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Ly8/c;->a(Ly8/c;J)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ly8/c$a;->a:Ly8/c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, v1}, Ly8/c;->c(Ly8/c;Z)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ly8/c$a;->a:Ly8/c;

    .line 15
    .line 16
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Ly8/c$a;->a:Ly8/c;

    .line 23
    .line 24
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ly8/c$d;->b()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method
