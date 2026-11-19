.class public final synthetic Lb5/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

.field public final synthetic b:Lcom/zykj/study/data/MyCourseEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/e5;->a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    iput-object p2, p0, Lb5/e5;->b:Lcom/zykj/study/data/MyCourseEntity;

    return-void
.end method


# virtual methods
.method public final a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/e5;->a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    iget-object v1, p0, Lb5/e5;->b:Lcom/zykj/study/data/MyCourseEntity;

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->g(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lcom/zykj/study/data/MyCourseEntity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method
