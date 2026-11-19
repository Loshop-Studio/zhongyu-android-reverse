.class public final synthetic Lb5/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

.field public final synthetic b:Lcom/zykj/study/bean/course/CatalogBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/o2;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    iput-object p2, p0, Lb5/o2;->b:Lcom/zykj/study/bean/course/CatalogBean;

    return-void
.end method


# virtual methods
.method public final a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/o2;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    iget-object v1, p0, Lb5/o2;->b:Lcom/zykj/study/bean/course/CatalogBean;

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    return-void
.end method
