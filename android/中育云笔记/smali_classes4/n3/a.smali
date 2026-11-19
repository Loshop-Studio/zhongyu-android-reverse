.class public final synthetic Ln3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/widget/LifecycleFrameLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/widget/LifecycleFrameLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/a;->c:Lcom/friday/lecture/widget/LifecycleFrameLayout;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln3/a;->c:Lcom/friday/lecture/widget/LifecycleFrameLayout;

    invoke-static {v0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->a(Lcom/friday/lecture/widget/LifecycleFrameLayout;)Landroidx/lifecycle/LifecycleRegistry;

    move-result-object v0

    return-object v0
.end method
