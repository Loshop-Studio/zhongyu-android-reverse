.class public final synthetic Ln4/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

.field public final synthetic b:Lcom/zykj/study/bean/course/CourseDetailsBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/k0;->a:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    iput-object p2, p0, Ln4/k0;->b:Lcom/zykj/study/bean/course/CourseDetailsBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/k0;->a:Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    iget-object v1, p0, Ln4/k0;->b:Lcom/zykj/study/bean/course/CourseDetailsBean;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->c(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;Landroid/view/View;)V

    return-void
.end method
