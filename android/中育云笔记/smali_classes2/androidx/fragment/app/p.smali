.class public final synthetic Landroidx/fragment/app/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentResultListener;


# instance fields
.field public final synthetic a:Lhd/p;


# direct methods
.method public synthetic constructor <init>(Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/p;->a:Lhd/p;

    return-void
.end method


# virtual methods
.method public final onFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/p;->a:Lhd/p;

    invoke-static {v0, p1, p2}, Landroidx/fragment/app/FragmentKt;->a(Lhd/p;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
