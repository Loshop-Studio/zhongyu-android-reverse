.class public final synthetic Ln4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CourseManageAdapter;

.field public final synthetic b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/w;->a:Lcom/zykj/study/adapter/CourseManageAdapter;

    iput-object p2, p0, Ln4/w;->b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/w;->a:Lcom/zykj/study/adapter/CourseManageAdapter;

    iget-object v1, p0, Ln4/w;->b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CourseManageAdapter;->c(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V

    return-void
.end method
