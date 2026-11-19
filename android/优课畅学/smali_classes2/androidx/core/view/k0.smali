.class public final synthetic Landroidx/core/view/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/k0;->a:Lx7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/k0;->a:Lx7/a;

    invoke-static {v0}, Landroidx/core/view/ViewKt;->a(Lx7/a;)V

    return-void
.end method
