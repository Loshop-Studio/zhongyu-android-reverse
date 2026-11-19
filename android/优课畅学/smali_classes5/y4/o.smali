.class public final synthetic Ly4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentResultListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/FindFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/FindFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/o;->a:Lcom/zykj/study/ui/home/find/FindFragment;

    return-void
.end method


# virtual methods
.method public final onFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/o;->a:Lcom/zykj/study/ui/home/find/FindFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/find/FindFragment;->k(Lcom/zykj/study/ui/home/find/FindFragment;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
