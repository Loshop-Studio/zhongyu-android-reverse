.class public final synthetic Ln4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CourseManageAdapter;

.field public final synthetic b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/u;->a:Lcom/zykj/study/adapter/CourseManageAdapter;

    iput-object p2, p0, Ln4/u;->b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/u;->a:Lcom/zykj/study/adapter/CourseManageAdapter;

    iget-object v1, p0, Ln4/u;->b:Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CourseManageAdapter;->d(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;Landroid/view/View;)V

    return-void
.end method
