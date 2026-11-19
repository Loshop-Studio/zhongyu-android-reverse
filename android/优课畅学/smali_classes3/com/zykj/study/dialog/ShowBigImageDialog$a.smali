.class public final Lcom/zykj/study/dialog/ShowBigImageDialog$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/photoview/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/dialog/ShowBigImageDialog;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/ShowBigImageDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/study/dialog/ShowBigImageDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/dialog/ShowBigImageDialog$a;->a:Lcom/zykj/study/dialog/ShowBigImageDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ShowBigImageDialog$a;->a:Lcom/zykj/study/dialog/ShowBigImageDialog;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(Landroid/view/View;FF)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/study/dialog/ShowBigImageDialog$a;->a:Lcom/zykj/study/dialog/ShowBigImageDialog;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
