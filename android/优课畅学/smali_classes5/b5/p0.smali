.class public final synthetic Lb5/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/EditCourseFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/p0;->a:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/p0;->a:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
