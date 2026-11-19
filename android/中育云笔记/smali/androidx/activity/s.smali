.class public final synthetic Landroidx/activity/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/s;->a:Lhd/a;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/s;->a:Lhd/a;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher$Api33Impl;->a(Lhd/a;)V

    return-void
.end method
