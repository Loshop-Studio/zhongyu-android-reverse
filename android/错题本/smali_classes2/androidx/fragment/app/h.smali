.class public final synthetic Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentResultListener;


# instance fields
.field public final synthetic a:Lr6/e;


# direct methods
.method public synthetic constructor <init>(Lr6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/h;->a:Lr6/e;

    return-void
.end method


# virtual methods
.method public final onFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->a:Lr6/e;

    invoke-static {v0, p1, p2}, Landroidx/fragment/app/FragmentKt;->a(Lr6/e;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
