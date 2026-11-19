.class public final synthetic Ls6/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentResultListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/q1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    return-void
.end method


# virtual methods
.method public final onFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/q1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->g(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
