.class public La/b/c/j$f$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/b/c/j$f;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/b/c/j$f;


# direct methods
.method public constructor <init>(La/b/c/j$f;)V
    .locals 0

    iput-object p1, p0, La/b/c/j$f$a;->a:La/b/c/j$f;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, La/b/c/j$f$a;->a:La/b/c/j$f;

    invoke-virtual {p1}, La/b/c/j$f;->d()V

    return-void
.end method
